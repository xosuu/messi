package org.jasypt.util.binary;

import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class StrongBinaryEncryptor implements BinaryEncryptor {
    private final StandardPBEByteEncryptor encryptor;

    public StrongBinaryEncryptor() {
        StandardPBEByteEncryptor standardPBEByteEncryptor = new StandardPBEByteEncryptor();
        this.encryptor = standardPBEByteEncryptor;
        standardPBEByteEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
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
