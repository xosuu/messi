package org.jasypt.digest;

import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.digest.config.DigesterConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public class PooledStringDigester implements StringDigester {
    private StandardStringDigester[] pool;
    private DigesterConfig config = null;
    private int poolSize = 0;
    private boolean poolSizeSet = false;
    private int roundRobin = 0;
    private boolean initialized = false;
    private final StandardStringDigester firstDigester = new StandardStringDigester();

    @Override // org.jasypt.digest.StringDigester
    public String digest(String str) {
        int i10;
        if (!isInitialized()) {
            initialize();
        }
        synchronized (this) {
            i10 = this.roundRobin;
            this.roundRobin = (i10 + 1) % this.poolSize;
        }
        return this.pool[i10].digest(str);
    }

    public synchronized void initialize() {
        try {
            if (!this.initialized) {
                DigesterConfig digesterConfig = this.config;
                if (digesterConfig != null) {
                    Integer poolSize = digesterConfig.getPoolSize();
                    this.poolSize = (this.poolSizeSet || poolSize == null) ? this.poolSize : poolSize.intValue();
                }
                int i10 = this.poolSize;
                if (i10 <= 0) {
                    throw new IllegalArgumentException("Pool size must be set and > 0");
                }
                StandardStringDigester[] standardStringDigesterArr = new StandardStringDigester[i10];
                this.pool = standardStringDigesterArr;
                standardStringDigesterArr[0] = this.firstDigester;
                for (int i11 = 1; i11 < this.poolSize; i11++) {
                    StandardStringDigester[] standardStringDigesterArr2 = this.pool;
                    standardStringDigesterArr2[i11] = standardStringDigesterArr2[i11 - 1].cloneDigester();
                }
                this.initialized = true;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    @Override // org.jasypt.digest.StringDigester
    public boolean matches(String str, String str2) {
        int i10;
        if (!isInitialized()) {
            initialize();
        }
        synchronized (this) {
            i10 = this.roundRobin;
            this.roundRobin = (i10 + 1) % this.poolSize;
        }
        return this.pool[i10].matches(str, str2);
    }

    public synchronized void setAlgorithm(String str) {
        this.firstDigester.setAlgorithm(str);
    }

    public synchronized void setConfig(DigesterConfig digesterConfig) {
        this.firstDigester.setConfig(digesterConfig);
        this.config = digesterConfig;
    }

    public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean z9) {
        this.firstDigester.setInvertPositionOfPlainSaltInEncryptionResults(z9);
    }

    public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean z9) {
        this.firstDigester.setInvertPositionOfSaltInMessageBeforeDigesting(z9);
    }

    public synchronized void setIterations(int i10) {
        this.firstDigester.setIterations(i10);
    }

    public synchronized void setPoolSize(int i10) {
        CommonUtils.validateIsTrue(i10 > 0, "Pool size be > 0");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.poolSize = i10;
        this.poolSizeSet = true;
    }

    public synchronized void setPrefix(String str) {
        this.firstDigester.setPrefix(str);
    }

    public synchronized void setProvider(Provider provider) {
        this.firstDigester.setProvider(provider);
    }

    public synchronized void setProviderName(String str) {
        this.firstDigester.setProviderName(str);
    }

    public synchronized void setSaltGenerator(SaltGenerator saltGenerator) {
        this.firstDigester.setSaltGenerator(saltGenerator);
    }

    public synchronized void setSaltSizeBytes(int i10) {
        this.firstDigester.setSaltSizeBytes(i10);
    }

    public synchronized void setStringOutputType(String str) {
        this.firstDigester.setStringOutputType(str);
    }

    public synchronized void setSuffix(String str) {
        this.firstDigester.setSuffix(str);
    }

    public synchronized void setUnicodeNormalizationIgnored(boolean z9) {
        this.firstDigester.setUnicodeNormalizationIgnored(z9);
    }

    public synchronized void setUseLenientSaltSizeCheck(boolean z9) {
        this.firstDigester.setUseLenientSaltSizeCheck(z9);
    }
}
