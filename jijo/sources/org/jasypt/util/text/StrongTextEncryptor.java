package org.jasypt.util.text;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class StrongTextEncryptor implements TextEncryptor {
    private final StandardPBEStringEncryptor encryptor;

    public StrongTextEncryptor() {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        this.encryptor = standardPBEStringEncryptor;
        standardPBEStringEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
    }

    @Override // org.jasypt.util.text.TextEncryptor
    public String decrypt(String str) {
        return this.encryptor.decrypt(str);
    }

    @Override // org.jasypt.util.text.TextEncryptor
    public String encrypt(String str) {
        return this.encryptor.encrypt(str);
    }

    public void setPassword(String str) {
        this.encryptor.setPassword(str);
    }

    public void setPasswordCharArray(char[] cArr) {
        this.encryptor.setPasswordCharArray(cArr);
    }
}
