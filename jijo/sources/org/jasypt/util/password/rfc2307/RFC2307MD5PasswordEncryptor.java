package org.jasypt.util.password.rfc2307;

import org.jasypt.digest.StandardStringDigester;
import org.jasypt.util.password.PasswordEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class RFC2307MD5PasswordEncryptor implements PasswordEncryptor {
    private final StandardStringDigester digester;

    public RFC2307MD5PasswordEncryptor() {
        StandardStringDigester standardStringDigester = new StandardStringDigester();
        this.digester = standardStringDigester;
        standardStringDigester.setAlgorithm("MD5");
        standardStringDigester.setIterations(1);
        standardStringDigester.setSaltSizeBytes(0);
        standardStringDigester.setPrefix("{MD5}");
    }

    @Override // org.jasypt.util.password.PasswordEncryptor
    public boolean checkPassword(String str, String str2) {
        return this.digester.matches(str, str2);
    }

    @Override // org.jasypt.util.password.PasswordEncryptor
    public String encryptPassword(String str) {
        return this.digester.digest(str);
    }

    public void setStringOutputType(String str) {
        this.digester.setStringOutputType(str);
    }
}
