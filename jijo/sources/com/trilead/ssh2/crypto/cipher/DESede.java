package com.trilead.ssh2.crypto.cipher;

/* JADX INFO: loaded from: classes.dex */
public class DESede extends DES {
    private boolean encrypt;
    private int[] key1 = null;
    private int[] key2 = null;
    private int[] key3 = null;

    @Override // com.trilead.ssh2.crypto.cipher.DES
    public String getAlgorithmName() {
        return "DESede";
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES, com.trilead.ssh2.crypto.cipher.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES, com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z9, byte[] bArr) {
        this.key1 = generateWorkingKey(z9, bArr, 0);
        this.key2 = generateWorkingKey(!z9, bArr, 8);
        this.key3 = generateWorkingKey(z9, bArr, 16);
        this.encrypt = z9;
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES
    public void reset() {
    }

    @Override // com.trilead.ssh2.crypto.cipher.DES, com.trilead.ssh2.crypto.cipher.BlockCipher
    public void transformBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int[] iArr = this.key1;
        if (iArr == null) {
            throw new IllegalStateException("DESede engine not initialised!");
        }
        if (this.encrypt) {
            desFunc(iArr, bArr, i10, bArr2, i11);
            desFunc(this.key2, bArr2, i11, bArr2, i11);
            desFunc(this.key3, bArr2, i11, bArr2, i11);
        } else {
            desFunc(this.key3, bArr, i10, bArr2, i11);
            desFunc(this.key2, bArr2, i11, bArr2, i11);
            desFunc(this.key1, bArr2, i11, bArr2, i11);
        }
    }
}
