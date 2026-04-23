package com.trilead.ssh2.crypto.cipher;

/* JADX INFO: loaded from: classes.dex */
public class NullCipher implements BlockCipher {
    private int blockSize;

    public NullCipher() {
        this.blockSize = 8;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public int getBlockSize() {
        return this.blockSize;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z9, byte[] bArr) {
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void transformBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        System.arraycopy(bArr, i10, bArr2, i11, this.blockSize);
    }

    public NullCipher(int i10) {
        this.blockSize = i10;
    }
}
