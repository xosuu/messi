package com.trilead.ssh2.crypto.digest;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class HashForSSH2Types {

    @Deprecated
    Digest md;
    private final Digest messageDigest;

    public HashForSSH2Types(Digest digest) {
        this.md = digest;
        this.messageDigest = digest;
    }

    private static MessageDigest createMessageDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (GeneralSecurityException e10) {
            throw new IllegalArgumentException("Could not get Message digest instance", e10);
        }
    }

    public byte[] getDigest() {
        byte[] bArr = new byte[this.messageDigest.getDigestLength()];
        getDigest(bArr);
        return bArr;
    }

    public int getDigestLength() {
        return this.messageDigest.getDigestLength();
    }

    public void reset() {
        this.messageDigest.reset();
    }

    public void updateBigInt(BigInteger bigInteger) {
        updateByteString(bigInteger.toByteArray());
    }

    public void updateByte(byte b10) {
        this.messageDigest.update(new byte[]{b10});
    }

    public void updateByteString(byte[] bArr) {
        updateUINT32(bArr.length);
        updateBytes(bArr);
    }

    public void updateBytes(byte[] bArr) {
        this.messageDigest.update(bArr);
    }

    public void updateUINT32(int i10) {
        this.messageDigest.update((byte) (i10 >> 24));
        this.messageDigest.update((byte) (i10 >> 16));
        this.messageDigest.update((byte) (i10 >> 8));
        this.messageDigest.update((byte) i10);
    }

    public HashForSSH2Types(String str) {
        this(new JreMessageDigestWrapper(createMessageDigest(str)));
    }

    public void getDigest(byte[] bArr) {
        getDigest(bArr, 0);
    }

    public void getDigest(byte[] bArr, int i10) {
        this.messageDigest.digest(bArr, i10);
    }
}
