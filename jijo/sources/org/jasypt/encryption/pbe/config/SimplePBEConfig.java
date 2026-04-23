package org.jasypt.encryption.pbe.config;

import java.security.Provider;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.PasswordAlreadyCleanedException;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SimplePBEConfig implements PBEConfig, PBECleanablePasswordConfig {
    private String algorithm = null;
    private char[] password = null;
    private Integer keyObtentionIterations = null;
    private SaltGenerator saltGenerator = null;
    private String providerName = null;
    private Provider provider = null;
    private Integer poolSize = null;
    private boolean passwordCleaned = false;

    @Override // org.jasypt.encryption.pbe.config.PBECleanablePasswordConfig
    public void cleanPassword() {
        char[] cArr = this.password;
        if (cArr != null) {
            int length = cArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.password[i10] = 0;
            }
            this.password = new char[0];
        }
        this.passwordCleaned = true;
    }

    @Override // org.jasypt.encryption.pbe.config.PBEConfig
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // org.jasypt.encryption.pbe.config.PBEConfig
    public Integer getKeyObtentionIterations() {
        return this.keyObtentionIterations;
    }

    @Override // org.jasypt.encryption.pbe.config.PBEConfig
    public String getPassword() {
        if (this.passwordCleaned) {
            throw new PasswordAlreadyCleanedException();
        }
        return new String(this.password);
    }

    @Override // org.jasypt.encryption.pbe.config.PBECleanablePasswordConfig
    public char[] getPasswordCharArray() {
        if (this.passwordCleaned) {
            throw new PasswordAlreadyCleanedException();
        }
        char[] cArr = this.password;
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    @Override // org.jasypt.encryption.pbe.config.PBEConfig
    public Integer getPoolSize() {
        return this.poolSize;
    }

    @Override // org.jasypt.encryption.pbe.config.PBEConfig
    public Provider getProvider() {
        return this.provider;
    }

    @Override // org.jasypt.encryption.pbe.config.PBEConfig
    public String getProviderName() {
        return this.providerName;
    }

    @Override // org.jasypt.encryption.pbe.config.PBEConfig
    public SaltGenerator getSaltGenerator() {
        return this.saltGenerator;
    }

    public void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public void setKeyObtentionIterations(Integer num) {
        this.keyObtentionIterations = num;
    }

    public void setPassword(String str) {
        if (this.password != null) {
            cleanPassword();
        }
        if (str == null) {
            this.password = null;
        } else {
            this.password = str.toCharArray();
        }
    }

    public void setPasswordCharArray(char[] cArr) {
        if (this.password != null) {
            cleanPassword();
        }
        if (cArr == null) {
            this.password = null;
            return;
        }
        char[] cArr2 = new char[cArr.length];
        this.password = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public void setPoolSize(Integer num) {
        this.poolSize = num;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public void setProviderClassName(String str) {
        if (str == null) {
            this.provider = null;
            return;
        }
        try {
            this.provider = (Provider) Thread.currentThread().getContextClassLoader().loadClass(str).newInstance();
        } catch (Exception e10) {
            throw new EncryptionInitializationException(e10);
        }
    }

    public void setProviderName(String str) {
        this.providerName = str;
    }

    public void setSaltGenerator(SaltGenerator saltGenerator) {
        this.saltGenerator = saltGenerator;
    }

    public void setSaltGeneratorClassName(String str) {
        if (str == null) {
            this.saltGenerator = null;
            return;
        }
        try {
            this.saltGenerator = (SaltGenerator) Thread.currentThread().getContextClassLoader().loadClass(str).newInstance();
        } catch (Exception e10) {
            throw new EncryptionInitializationException(e10);
        }
    }

    public void setKeyObtentionIterations(String str) {
        if (str == null) {
            this.keyObtentionIterations = null;
            return;
        }
        try {
            this.keyObtentionIterations = new Integer(str);
        } catch (NumberFormatException e10) {
            throw new EncryptionInitializationException(e10);
        }
    }

    public void setPoolSize(String str) {
        if (str == null) {
            this.poolSize = null;
            return;
        }
        try {
            this.poolSize = new Integer(str);
        } catch (NumberFormatException e10) {
            throw new EncryptionInitializationException(e10);
        }
    }
}
