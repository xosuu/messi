package com.trilead.ssh2.crypto.digest;

/* JADX INFO: loaded from: classes.dex */
public interface Digest {
    void digest(byte[] bArr);

    void digest(byte[] bArr, int i10);

    int getDigestLength();

    void reset();

    void update(byte b10);

    void update(byte[] bArr);

    void update(byte[] bArr, int i10, int i11);
}
