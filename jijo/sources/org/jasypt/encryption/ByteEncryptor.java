package org.jasypt.encryption;

/* JADX INFO: loaded from: classes.dex */
public interface ByteEncryptor {
    byte[] decrypt(byte[] bArr);

    byte[] encrypt(byte[] bArr);
}
