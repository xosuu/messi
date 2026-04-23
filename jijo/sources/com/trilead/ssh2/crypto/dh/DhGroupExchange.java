package com.trilead.ssh2.crypto.dh;

import androidx.core.app.NotificationCompat;
import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import java.math.BigInteger;
import java.security.SecureRandom;
import z5.d;

/* JADX INFO: loaded from: classes.dex */
public class DhGroupExchange {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BigInteger f12278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BigInteger f12279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BigInteger f12280g;
    private final String hashAlgorithm;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BigInteger f12281k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private BigInteger f12282p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private BigInteger f12283x;

    @Deprecated
    public DhGroupExchange(BigInteger bigInteger, BigInteger bigInteger2) {
        this("SHA1", bigInteger, bigInteger2);
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, d dVar) {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(getHashAlgorithm());
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
        dVar.getClass();
        hashForSSH2Types.updateUINT32(1024);
        hashForSSH2Types.updateUINT32(2048);
        hashForSSH2Types.updateUINT32(NotificationCompat.FLAG_BUBBLE);
        hashForSSH2Types.updateBigInt(this.f12282p);
        hashForSSH2Types.updateBigInt(this.f12280g);
        hashForSSH2Types.updateBigInt(this.f12278e);
        hashForSSH2Types.updateBigInt(this.f12279f);
        hashForSSH2Types.updateBigInt(this.f12281k);
        return hashForSSH2Types.getDigest();
    }

    public BigInteger getE() {
        BigInteger bigInteger = this.f12278e;
        if (bigInteger != null) {
            return bigInteger;
        }
        throw new IllegalStateException("Not initialized!");
    }

    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public BigInteger getK() {
        BigInteger bigInteger = this.f12281k;
        if (bigInteger != null) {
            return bigInteger;
        }
        throw new IllegalStateException("Shared secret not yet known, need f first!");
    }

    public void init(SecureRandom secureRandom) {
        this.f12281k = null;
        BigInteger bigInteger = new BigInteger(this.f12282p.bitLength() - 1, secureRandom);
        this.f12283x = bigInteger;
        this.f12278e = this.f12280g.modPow(bigInteger, this.f12282p);
    }

    public void setF(BigInteger bigInteger) {
        if (this.f12278e == null) {
            throw new IllegalStateException("Not initialized!");
        }
        if (BigInteger.valueOf(0L).compareTo(bigInteger) >= 0 || this.f12282p.compareTo(bigInteger) <= 0) {
            throw new IllegalArgumentException("Invalid f specified!");
        }
        this.f12279f = bigInteger;
        this.f12281k = bigInteger.modPow(this.f12283x, this.f12282p);
    }

    public DhGroupExchange(String str, BigInteger bigInteger, BigInteger bigInteger2) {
        this.f12282p = bigInteger;
        this.f12280g = bigInteger2;
        this.hashAlgorithm = str;
    }
}
