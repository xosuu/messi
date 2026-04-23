package com.trilead.ssh2.crypto.cipher;

import l.a0;

/* JADX INFO: loaded from: classes.dex */
public class CBCMode implements BlockCipher {
    int blockSize;
    byte[] cbc_vector;
    boolean doEncrypt;
    BlockCipher tc;
    byte[] tmp_vector;

    public CBCMode(BlockCipher blockCipher, byte[] bArr, boolean z9) {
        this.tc = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.doEncrypt = z9;
        if (blockSize != bArr.length) {
            StringBuilder sb = new StringBuilder("IV must be ");
            sb.append(this.blockSize);
            sb.append(" bytes long! (currently ");
            throw new IllegalArgumentException(a0.h(sb, bArr.length, ")"));
        }
        byte[] bArr2 = new byte[blockSize];
        this.cbc_vector = bArr2;
        this.tmp_vector = new byte[blockSize];
        System.arraycopy(bArr, 0, bArr2, 0, blockSize);
    }

    private void decryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        System.arraycopy(bArr, i10, this.tmp_vector, 0, this.blockSize);
        this.tc.transformBlock(bArr, i10, bArr2, i11);
        for (int i12 = 0; i12 < this.blockSize; i12++) {
            int i13 = i11 + i12;
            bArr2[i13] = (byte) (bArr2[i13] ^ this.cbc_vector[i12]);
        }
        byte[] bArr3 = this.cbc_vector;
        this.cbc_vector = this.tmp_vector;
        this.tmp_vector = bArr3;
    }

    private void encryptBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        for (int i12 = 0; i12 < this.blockSize; i12++) {
            byte[] bArr3 = this.cbc_vector;
            bArr3[i12] = (byte) (bArr3[i12] ^ bArr[i10 + i12]);
        }
        this.tc.transformBlock(this.cbc_vector, 0, bArr2, i11);
        System.arraycopy(bArr2, i11, this.cbc_vector, 0, this.blockSize);
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
        if (this.doEncrypt) {
            encryptBlock(bArr, i10, bArr2, i11);
        } else {
            decryptBlock(bArr, i10, bArr2, i11);
        }
    }
}
