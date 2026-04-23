package com.trilead.ssh2.crypto.digest;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class JreMessageDigestWrapper implements Digest {
    private final MessageDigest digest;

    public JreMessageDigestWrapper(MessageDigest messageDigest) {
        this.digest = messageDigest;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void digest(byte[] bArr) {
        System.arraycopy(this.digest.digest(), 0, bArr, 0, bArr.length);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public int getDigestLength() {
        return this.digest.getDigestLength();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void reset() {
        this.digest.reset();
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte b10) {
        this.digest.update(b10);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte[] bArr) {
        this.digest.update(bArr);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void digest(byte[] bArr, int i10) {
        System.arraycopy(this.digest.digest(), 0, bArr, i10, bArr.length);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public void update(byte[] bArr, int i10, int i11) {
        this.digest.update(bArr, i10, i11);
    }
}
