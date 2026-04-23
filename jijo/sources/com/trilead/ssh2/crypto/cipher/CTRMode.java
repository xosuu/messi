package com.trilead.ssh2.crypto.cipher;

import l.a0;

/* JADX INFO: loaded from: classes.dex */
public class CTRMode implements BlockCipher {
    byte[] X;
    byte[] Xenc;
    BlockCipher bc;
    int blockSize;
    int count = 0;
    boolean doEncrypt;

    public CTRMode(BlockCipher blockCipher, byte[] bArr, boolean z9) {
        this.bc = blockCipher;
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
        this.X = bArr2;
        this.Xenc = new byte[blockSize];
        System.arraycopy(bArr, 0, bArr2, 0, blockSize);
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public final int getBlockSize() {
        return this.blockSize;
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public void init(boolean z9, byte[] bArr) {
    }

    @Override // com.trilead.ssh2.crypto.cipher.BlockCipher
    public final void transformBlock(byte[] bArr, int i10, byte[] bArr2, int i11) {
        int i12;
        int i13 = 0;
        this.bc.transformBlock(this.X, 0, this.Xenc, 0);
        while (true) {
            i12 = this.blockSize;
            if (i13 >= i12) {
                break;
            }
            bArr2[i11 + i13] = (byte) (bArr[i10 + i13] ^ this.Xenc[i13]);
            i13++;
        }
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            byte[] bArr3 = this.X;
            byte b10 = (byte) (bArr3[i14] + 1);
            bArr3[i14] = b10;
            if (b10 != 0) {
                return;
            }
        }
    }
}
