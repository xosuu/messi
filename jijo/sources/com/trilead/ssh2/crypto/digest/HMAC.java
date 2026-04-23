package com.trilead.ssh2.crypto.digest;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class HMAC implements Digest {
    byte[] k_xor_ipad = new byte[64];
    byte[] k_xor_opad = new byte[64];
    Digest md;
    int size;
    byte[] tmp;

    public HMAC(Digest digest, byte[] bArr, int i10) {
        this.md = digest;
        this.size = i10;
        this.tmp = new byte[digest.getDigestLength()];
        if (bArr.length > 64) {
            digest.reset();
            digest.update(bArr);
            digest.digest(this.tmp);
            bArr = this.tmp;
        }
        System.arraycopy(bArr, 0, this.k_xor_ipad, 0, bArr.length);
        System.arraycopy(bArr, 0, this.k_xor_opad, 0, bArr.length);
        for (int i11 = 0; i11 < 64; i11++) {
            byte[] bArr2 = this.k_xor_ipad;
            bArr2[i11] = (byte) (bArr2[i11] ^ 54);
            byte[] bArr3 = this.k_xor_opad;
            bArr3[i11] = (byte) (bArr3[i11] ^ 92);
        }
        digest.update(this.k_xor_ipad);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr) {
        digest(bArr, 0);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final int getDigestLength() {
        return this.size;
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void reset() {
        this.md.reset();
        this.md.update(this.k_xor_ipad);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte b10) {
        this.md.update(b10);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void digest(byte[] bArr, int i10) {
        this.md.digest(this.tmp);
        this.md.update(this.k_xor_opad);
        this.md.update(this.tmp);
        this.md.digest(this.tmp);
        System.arraycopy(this.tmp, 0, bArr, i10, this.size);
        this.md.update(this.k_xor_ipad);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr) {
        this.md.update(bArr);
    }

    @Override // com.trilead.ssh2.crypto.digest.Digest
    public final void update(byte[] bArr, int i10, int i11) {
        this.md.update(bArr, i10, i11);
    }
}
