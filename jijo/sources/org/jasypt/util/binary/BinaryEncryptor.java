package org.jasypt.util.binary;

/* JADX INFO: loaded from: classes.dex */
public interface BinaryEncryptor {
    byte[] decrypt(byte[] bArr);

    byte[] encrypt(byte[] bArr);
}
