package com.trilead.ssh2.crypto.cipher;

/* JADX INFO: loaded from: classes.dex */
public interface BlockCipher {
    int getBlockSize();

    void init(boolean z9, byte[] bArr);

    void transformBlock(byte[] bArr, int i10, byte[] bArr2, int i11);
}
