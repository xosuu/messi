package org.jasypt.util.password;

import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public final class BasicPasswordEncryptor implements PasswordEncryptor {
    private final StandardStringDigester digester;

    public BasicPasswordEncryptor() {
        StandardStringDigester standardStringDigester = new StandardStringDigester();
        this.digester = standardStringDigester;
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
