package org.jasypt.encryption.pbe;

import java.math.BigDecimal;
import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.PBEConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class PooledPBEBigDecimalEncryptor implements PBEBigDecimalCleanablePasswordEncryptor {
    private StandardPBEBigDecimalEncryptor[] pool;
    private PBEConfig config = null;
    private int poolSize = 0;
    private boolean poolSizeSet = false;
    private int roundRobin = 0;
    private boolean initialized = false;
    private final StandardPBEBigDecimalEncryptor firstEncryptor = new StandardPBEBigDecimalEncryptor();

    @Override // org.jasypt.encryption.BigDecimalEncryptor
    public BigDecimal decrypt(BigDecimal bigDecimal) {
        int i10;
        if (!isInitialized()) {
            initialize();
        }
        synchronized (this) {
            i10 = this.roundRobin;
            this.roundRobin = (i10 + 1) % this.poolSize;
        }
        return this.pool[i10].decrypt(bigDecimal);
    }

    @Override // org.jasypt.encryption.BigDecimalEncryptor
    public BigDecimal encrypt(BigDecimal bigDecimal) {
        int i10;
        if (!isInitialized()) {
            initialize();
        }
        synchronized (this) {
            i10 = this.roundRobin;
            this.roundRobin = (i10 + 1) % this.poolSize;
        }
        return this.pool[i10].encrypt(bigDecimal);
    }

    public synchronized void initialize() {
        try {
            if (!this.initialized) {
                PBEConfig pBEConfig = this.config;
                if (pBEConfig != null) {
                    Integer poolSize = pBEConfig.getPoolSize();
                    this.poolSize = (this.poolSizeSet || poolSize == null) ? this.poolSize : poolSize.intValue();
                }
                int i10 = this.poolSize;
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Pool size must be set and > 0");
                }
                this.pool = this.firstEncryptor.cloneAndInitializeEncryptor(i10);
                this.initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public void setAlgorithm(String str) {
        this.firstEncryptor.setAlgorithm(str);
    }

    public synchronized void setConfig(PBEConfig pBEConfig) {
        this.firstEncryptor.setConfig(pBEConfig);
        this.config = pBEConfig;
    }

    public void setKeyObtentionIterations(int i10) {
        this.firstEncryptor.setKeyObtentionIterations(i10);
    }

    @Override // org.jasypt.encryption.pbe.PasswordBased
    public void setPassword(String str) {
        this.firstEncryptor.setPassword(str);
    }

    @Override // org.jasypt.encryption.pbe.CleanablePasswordBased
    public synchronized void setPasswordCharArray(char[] cArr) {
        this.firstEncryptor.setPasswordCharArray(cArr);
    }

    public synchronized void setPoolSize(int i10) {
        CommonUtils.validateIsTrue(i10 > 0, "Pool size be > 0");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.poolSize = i10;
        this.poolSizeSet = true;
    }

    public void setProvider(Provider provider) {
        this.firstEncryptor.setProvider(provider);
    }

    public void setProviderName(String str) {
        this.firstEncryptor.setProviderName(str);
    }

    public void setSaltGenerator(SaltGenerator saltGenerator) {
        this.firstEncryptor.setSaltGenerator(saltGenerator);
    }
}
