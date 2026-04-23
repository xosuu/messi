package org.jasypt.util.password;

import java.security.Provider;
import org.jasypt.digest.StandardStringDigester;
import org.jasypt.digest.config.DigesterConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ConfigurablePasswordEncryptor implements PasswordEncryptor {
    private final StandardStringDigester digester = new StandardStringDigester();

    @Override // org.jasypt.util.password.PasswordEncryptor
    public boolean checkPassword(String str, String str2) {
        return this.digester.matches(str, str2);
    }

    @Override // org.jasypt.util.password.PasswordEncryptor
    public String encryptPassword(String str) {
        return this.digester.digest(str);
    }

    public void setAlgorithm(String str) {
        this.digester.setAlgorithm(str);
    }

    public void setConfig(DigesterConfig digesterConfig) {
        this.digester.setConfig(digesterConfig);
    }

    public void setPlainDigest(boolean z9) {
        if (z9) {
            this.digester.setIterations(1);
            this.digester.setSaltSizeBytes(0);
        } else {
            this.digester.setIterations(1000);
            this.digester.setSaltSizeBytes(8);
        }
    }

    public void setProvider(Provider provider) {
        this.digester.setProvider(provider);
    }

    public void setProviderName(String str) {
        this.digester.setProviderName(str);
    }

    public void setStringOutputType(String str) {
        this.digester.setStringOutputType(str);
    }
}
