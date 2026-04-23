package org.jasypt.util.password;

import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class StrongPasswordEncryptor implements PasswordEncryptor {
    private final StandardStringDigester digester;

    public StrongPasswordEncryptor() {
        StandardStringDigester standardStringDigester = new StandardStringDigester();
        this.digester = standardStringDigester;
        standardStringDigester.setAlgorithm("SHA-256");
        standardStringDigester.setIterations(100000);
        standardStringDigester.setSaltSizeBytes(16);
        standardStringDigester.initialize();
    }

    @Override // org.jasypt.util.password.PasswordEncryptor
    public boolean checkPassword(String str, String str2) {
        return this.digester.matches(str, str2);
    }

    @Override // org.jasypt.util.password.PasswordEncryptor
    public String encryptPassword(String str) {
        return this.digester.digest(str);
    }
}
