package org.jasypt.util.binary;

import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class BasicBinaryEncryptor implements BinaryEncryptor {
    private final StandardPBEByteEncryptor encryptor;

    public BasicBinaryEncryptor() {
        StandardPBEByteEncryptor standardPBEByteEncryptor = new StandardPBEByteEncryptor();
        this.encryptor = standardPBEByteEncryptor;
        standardPBEByteEncryptor.setAlgorithm(StandardPBEByteEncryptor.DEFAULT_ALGORITHM);
    }

    @Override // org.jasypt.util.binary.BinaryEncryptor
    public byte[] decrypt(byte[] bArr) {
        return this.encryptor.decrypt(bArr);
    }

    @Override // org.jasypt.util.binary.BinaryEncryptor
    public byte[] encrypt(byte[] bArr) {
        return this.encryptor.encrypt(bArr);
    }

    public void setPassword(String str) {
        this.encryptor.setPassword(str);
    }

    public void setPasswordCharArray(char[] cArr) {
        this.encryptor.setPasswordCharArray(cArr);
    }
}
