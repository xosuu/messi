package org.jasypt.digest.config;

import java.security.Provider;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public class SimpleDigesterConfig implements DigesterConfig {
    private String algorithm = null;
    private Integer iterations = null;
    private Integer saltSizeBytes = null;
    private SaltGenerator saltGenerator = null;
    private String providerName = null;
    private Provider provider = null;
    private Boolean invertPositionOfSaltInMessageBeforeDigesting = null;
    private Boolean invertPositionOfPlainSaltInEncryptionResults = null;
    private Boolean useLenientSaltSizeCheck = null;
    private Integer poolSize = null;

    @Override // org.jasypt.digest.config.DigesterConfig
    public String getAlgorithm() {
        return this.algorithm;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public Boolean getInvertPositionOfPlainSaltInEncryptionResults() {
        return this.invertPositionOfPlainSaltInEncryptionResults;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public Boolean getInvertPositionOfSaltInMessageBeforeDigesting() {
        return this.invertPositionOfSaltInMessageBeforeDigesting;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public Integer getIterations() {
        return this.iterations;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public Integer getPoolSize() {
        return this.poolSize;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public Provider getProvider() {
        return this.provider;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public String getProviderName() {
        return this.providerName;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public SaltGenerator getSaltGenerator() {
        return this.saltGenerator;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public Integer getSaltSizeBytes() {
        return this.saltSizeBytes;
    }

    @Override // org.jasypt.digest.config.DigesterConfig
    public Boolean getUseLenientSaltSizeCheck() {
        return this.useLenientSaltSizeCheck;
    }

    public void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public void setInvertPositionOfPlainSaltInEncryptionResults(Boolean bool) {
        this.invertPositionOfPlainSaltInEncryptionResults = bool;
    }

    public void setInvertPositionOfSaltInMessageBeforeDigesting(Boolean bool) {
        this.invertPositionOfSaltInMessageBeforeDigesting = bool;
    }

    public void setIterations(Integer num) {
        this.iterations = num;
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

    public void setSaltSizeBytes(Integer num) {
        this.saltSizeBytes = num;
    }

    public void setUseLenientSaltSizeCheck(Boolean bool) {
        this.useLenientSaltSizeCheck = bool;
    }

    public void setIterations(String str) {
        if (str == null) {
            this.iterations = null;
            return;
        }
        try {
            this.iterations = new Integer(str);
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

    public void setSaltSizeBytes(String str) {
        if (str == null) {
            this.saltSizeBytes = null;
            return;
        }
        try {
            this.saltSizeBytes = new Integer(str);
        } catch (NumberFormatException e10) {
            throw new EncryptionInitializationException(e10);
        }
    }
}
