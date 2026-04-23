package com.trilead.ssh2.compression;

/* JADX INFO: loaded from: classes.dex */
public interface ICompressor {
    boolean canCompressPreauth();

    int compress(byte[] bArr, int i10, int i11, byte[] bArr2);

    int getBufferSize();

    byte[] uncompress(byte[] bArr, int i10, int[] iArr);
}
