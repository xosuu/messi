package com.trilead.ssh2.crypto.dh;

import c6.a;
import com.google.android.gms.internal.ads.fb1;
import com.trilead.ssh2.crypto.digest.HashForSSH2Types;
import java.math.BigInteger;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes.dex */
public class DhExchange {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    BigInteger f12273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BigInteger f12274f;
    private final String hashAlgorithm;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    BigInteger f12275k;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    BigInteger f12276p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    BigInteger f12277x;
    private static final a log = a.a(DhExchange.class);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final BigInteger f12272p1 = new BigInteger("179769313486231590770839156793787453197860296048756011706444423684197180216158519368947833795864925541502180565485980503646440548199239100050792877003355816639229553136239076508735759914822574862575007425302077447712589550957937778424442426617334727629299387668709205606050270810842907692932019128194467627007");
    static final BigInteger p14 = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final BigInteger f12271g = new BigInteger("2");

    @Deprecated
    public DhExchange() {
        this("SHA1");
    }

    public byte[] calculateH(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        HashForSSH2Types hashForSSH2Types = new HashForSSH2Types(getHashAlgorithm());
        a aVar = log;
        aVar.getClass();
        aVar.b(90, "Client: '" + new String(bArr, "ISO-8859-1") + "'");
        aVar.b(90, "Server: '" + new String(bArr2, "ISO-8859-1") + "'");
        hashForSSH2Types.updateByteString(bArr);
        hashForSSH2Types.updateByteString(bArr2);
        hashForSSH2Types.updateByteString(bArr3);
        hashForSSH2Types.updateByteString(bArr4);
        hashForSSH2Types.updateByteString(bArr5);
        hashForSSH2Types.updateBigInt(this.f12273e);
        hashForSSH2Types.updateBigInt(this.f12274f);
        hashForSSH2Types.updateBigInt(this.f12275k);
        return hashForSSH2Types.getDigest();
    }

    public BigInteger getE() {
        BigInteger bigInteger = this.f12273e;
        if (bigInteger != null) {
            return bigInteger;
        }
        throw new IllegalStateException("DhDsaExchange not initialized!");
    }

    public String getHashAlgorithm() {
        return this.hashAlgorithm;
    }

    public BigInteger getK() {
        BigInteger bigInteger = this.f12275k;
        if (bigInteger != null) {
            return bigInteger;
        }
        throw new IllegalStateException("Shared secret not yet known, need f first!");
    }

    public void init(int i10, SecureRandom secureRandom) {
        this.f12275k = null;
        if (i10 == 1) {
            this.f12276p = f12272p1;
        } else {
            if (i10 != 14) {
                throw new IllegalArgumentException(fb1.g("Unknown DH group ", i10));
            }
            this.f12276p = p14;
        }
        BigInteger bigInteger = new BigInteger(this.f12276p.bitLength() - 1, secureRandom);
        this.f12277x = bigInteger;
        this.f12273e = f12271g.modPow(bigInteger, this.f12276p);
    }

    public void setF(BigInteger bigInteger) {
        if (this.f12273e == null) {
            throw new IllegalStateException("DhDsaExchange not initialized!");
        }
        if (BigInteger.valueOf(0L).compareTo(bigInteger) >= 0 || this.f12276p.compareTo(bigInteger) <= 0) {
            throw new IllegalArgumentException("Invalid f specified!");
        }
        this.f12274f = bigInteger;
        this.f12275k = bigInteger.modPow(this.f12277x, this.f12276p);
    }

    public DhExchange(String str) {
        this.hashAlgorithm = str;
    }
}
