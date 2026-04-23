package org.jasypt.digest.config;

import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public class EnvironmentDigesterConfig extends SimpleDigesterConfig {
    private String algorithmEnvName = null;
    private String iterationsEnvName = null;
    private String saltSizeBytesEnvName = null;
    private String saltGeneratorClassNameEnvName = null;
    private String providerNameEnvName = null;
    private String providerClassNameEnvName = null;
    private String invertPositionOfSaltInMessageBeforeDigestingEnvName = null;
    private String invertPositionOfPlainSaltInEncryptionResultsEnvName = null;
    private String useLenientSaltSizeCheckEnvName = null;
    private String poolSizeEnvName = null;
    private String algorithmSysPropertyName = null;
    private String iterationsSysPropertyName = null;
    private String saltSizeBytesSysPropertyName = null;
    private String saltGeneratorClassNameSysPropertyName = null;
    private String providerNameSysPropertyName = null;
    private String providerClassNameSysPropertyName = null;
    private String invertPositionOfSaltInMessageBeforeDigestingSysPropertyName = null;
    private String invertPositionOfPlainSaltInEncryptionResultsSysPropertyName = null;
    private String useLenientSaltSizeCheckSysPropertyName = null;
    private String poolSizeSysPropertyName = null;

    public String getAlgorithmEnvName() {
        return this.algorithmEnvName;
    }

    public String getAlgorithmSysPropertyName() {
        return this.algorithmSysPropertyName;
    }

    public String getInvertPositionOfPlainSaltInEncryptionResultsEnvName() {
        return this.invertPositionOfPlainSaltInEncryptionResultsEnvName;
    }

    public String getInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName() {
        return this.invertPositionOfPlainSaltInEncryptionResultsSysPropertyName;
    }

    public String getInvertPositionOfSaltInMessageBeforeDigestingEnvName() {
        return this.invertPositionOfSaltInMessageBeforeDigestingEnvName;
    }

    public String getInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName() {
        return this.invertPositionOfSaltInMessageBeforeDigestingSysPropertyName;
    }

    public String getIterationsEnvName() {
        return this.iterationsEnvName;
    }

    public String getIterationsSysPropertyName() {
        return this.iterationsSysPropertyName;
    }

    public String getPoolSizeEnvName() {
        return this.poolSizeEnvName;
    }

    public String getPoolSizeSysPropertyName() {
        return this.poolSizeSysPropertyName;
    }

    public String getProviderClassNameEnvName() {
        return this.providerClassNameEnvName;
    }

    public String getProviderClassNameSysPropertyName() {
        return this.providerClassNameSysPropertyName;
    }

    public String getProviderNameEnvName() {
        return this.providerNameEnvName;
    }

    public String getProviderNameSysPropertyName() {
        return this.providerNameSysPropertyName;
    }

    public String getSaltGeneratorClassNameEnvName() {
        return this.saltGeneratorClassNameEnvName;
    }

    public String getSaltGeneratorClassNameSysPropertyName() {
        return this.saltGeneratorClassNameSysPropertyName;
    }

    public String getSaltSizeBytesEnvName() {
        return this.saltSizeBytesEnvName;
    }

    public String getSaltSizeBytesSysPropertyName() {
        return this.saltSizeBytesSysPropertyName;
    }

    public String getUseLenientSaltSizeCheckEnvName() {
        return this.useLenientSaltSizeCheckEnvName;
    }

    public String getUseLenientSaltSizeCheckSysPropertyName() {
        return this.useLenientSaltSizeCheckSysPropertyName;
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setAlgorithm(String str) {
        this.algorithmEnvName = null;
        this.algorithmSysPropertyName = null;
        super.setAlgorithm(str);
    }

    public void setAlgorithmEnvName(String str) {
        this.algorithmEnvName = str;
        if (str == null) {
            super.setAlgorithm(null);
        } else {
            this.algorithmSysPropertyName = null;
            super.setAlgorithm(System.getenv(str));
        }
    }

    public void setAlgorithmSysPropertyName(String str) {
        this.algorithmSysPropertyName = str;
        if (str == null) {
            super.setAlgorithm(null);
        } else {
            this.algorithmEnvName = null;
            super.setAlgorithm(System.getProperty(str));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setInvertPositionOfPlainSaltInEncryptionResults(Boolean bool) {
        this.invertPositionOfPlainSaltInEncryptionResultsEnvName = null;
        this.invertPositionOfPlainSaltInEncryptionResultsSysPropertyName = null;
        super.setInvertPositionOfPlainSaltInEncryptionResults(bool);
    }

    public void setInvertPositionOfPlainSaltInEncryptionResultsEnvName(String str) {
        this.invertPositionOfPlainSaltInEncryptionResultsEnvName = str;
        if (str == null) {
            super.setInvertPositionOfPlainSaltInEncryptionResults(null);
        } else {
            this.invertPositionOfPlainSaltInEncryptionResultsSysPropertyName = null;
            super.setInvertPositionOfPlainSaltInEncryptionResults(CommonUtils.getStandardBooleanValue(System.getenv(str)));
        }
    }

    public void setInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName(String str) {
        this.invertPositionOfPlainSaltInEncryptionResultsSysPropertyName = str;
        if (str == null) {
            super.setInvertPositionOfPlainSaltInEncryptionResults(null);
        } else {
            this.invertPositionOfPlainSaltInEncryptionResultsEnvName = null;
            super.setInvertPositionOfPlainSaltInEncryptionResults(CommonUtils.getStandardBooleanValue(System.getProperty(str)));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setInvertPositionOfSaltInMessageBeforeDigesting(Boolean bool) {
        this.invertPositionOfSaltInMessageBeforeDigestingEnvName = null;
        this.invertPositionOfSaltInMessageBeforeDigestingSysPropertyName = null;
        super.setInvertPositionOfSaltInMessageBeforeDigesting(bool);
    }

    public void setInvertPositionOfSaltInMessageBeforeDigestingEnvName(String str) {
        this.invertPositionOfSaltInMessageBeforeDigestingEnvName = str;
        if (str == null) {
            super.setInvertPositionOfSaltInMessageBeforeDigesting(null);
        } else {
            this.invertPositionOfSaltInMessageBeforeDigestingSysPropertyName = null;
            super.setInvertPositionOfSaltInMessageBeforeDigesting(CommonUtils.getStandardBooleanValue(System.getenv(str)));
        }
    }

    public void setInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName(String str) {
        this.invertPositionOfSaltInMessageBeforeDigestingSysPropertyName = str;
        if (str == null) {
            super.setInvertPositionOfSaltInMessageBeforeDigesting(null);
        } else {
            this.invertPositionOfSaltInMessageBeforeDigestingEnvName = null;
            super.setInvertPositionOfSaltInMessageBeforeDigesting(CommonUtils.getStandardBooleanValue(System.getProperty(str)));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setIterations(Integer num) {
        this.iterationsEnvName = null;
        this.iterationsSysPropertyName = null;
        super.setIterations(num);
    }

    public void setIterationsEnvName(String str) {
        this.iterationsEnvName = str;
        if (str == null) {
            super.setIterations((String) null);
        } else {
            this.iterationsSysPropertyName = null;
            super.setIterations(System.getenv(str));
        }
    }

    public void setIterationsSysPropertyName(String str) {
        this.iterationsSysPropertyName = str;
        if (str == null) {
            super.setIterations((String) null);
        } else {
            this.iterationsEnvName = null;
            super.setIterations(System.getProperty(str));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setPoolSize(Integer num) {
        this.poolSizeEnvName = null;
        this.poolSizeSysPropertyName = null;
        super.setPoolSize(num);
    }

    public void setPoolSizeEnvName(String str) {
        this.poolSizeEnvName = str;
        if (str == null) {
            super.setPoolSize((String) null);
        } else {
            this.poolSizeSysPropertyName = null;
            super.setPoolSize(System.getenv(str));
        }
    }

    public void setPoolSizeSysPropertyName(String str) {
        this.poolSizeSysPropertyName = str;
        if (str == null) {
            super.setPoolSize((String) null);
        } else {
            this.poolSizeEnvName = null;
            super.setPoolSize(System.getProperty(str));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setProvider(Provider provider) {
        this.providerClassNameEnvName = null;
        this.providerClassNameSysPropertyName = null;
        super.setProvider(provider);
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setProviderClassName(String str) {
        this.providerClassNameEnvName = null;
        this.providerClassNameSysPropertyName = null;
        super.setProviderClassName(str);
    }

    public void setProviderClassNameEnvName(String str) {
        this.providerClassNameEnvName = str;
        if (str == null) {
            super.setProvider(null);
        } else {
            this.providerClassNameSysPropertyName = null;
            super.setProviderClassName(System.getenv(str));
        }
    }

    public void setProviderClassNameSysPropertyName(String str) {
        this.providerClassNameSysPropertyName = str;
        if (str == null) {
            super.setProvider(null);
        } else {
            this.providerClassNameEnvName = null;
            super.setProviderClassName(System.getProperty(str));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setProviderName(String str) {
        this.providerNameEnvName = null;
        this.providerNameSysPropertyName = null;
        super.setProviderName(str);
    }

    public void setProviderNameEnvName(String str) {
        this.providerNameEnvName = str;
        if (str == null) {
            super.setProviderName(null);
        } else {
            this.providerNameSysPropertyName = null;
            super.setProviderName(System.getenv(str));
        }
    }

    public void setProviderNameSysPropertyName(String str) {
        this.providerNameSysPropertyName = str;
        if (str == null) {
            super.setProviderName(null);
        } else {
            this.providerNameEnvName = null;
            super.setProviderName(System.getProperty(str));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setSaltGenerator(SaltGenerator saltGenerator) {
        this.saltGeneratorClassNameEnvName = null;
        this.saltGeneratorClassNameSysPropertyName = null;
        super.setSaltGenerator(saltGenerator);
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setSaltGeneratorClassName(String str) {
        this.saltGeneratorClassNameEnvName = null;
        this.saltGeneratorClassNameSysPropertyName = null;
        super.setSaltGeneratorClassName(str);
    }

    public void setSaltGeneratorClassNameEnvName(String str) {
        this.saltGeneratorClassNameEnvName = str;
        if (str == null) {
            super.setSaltGenerator(null);
        } else {
            this.saltGeneratorClassNameSysPropertyName = null;
            super.setSaltGeneratorClassName(System.getenv(str));
        }
    }

    public void setSaltGeneratorClassNameSysPropertyName(String str) {
        this.saltGeneratorClassNameSysPropertyName = str;
        if (str == null) {
            super.setSaltGenerator(null);
        } else {
            this.saltGeneratorClassNameEnvName = null;
            super.setSaltGeneratorClassName(System.getProperty(str));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setSaltSizeBytes(Integer num) {
        this.saltSizeBytesEnvName = null;
        this.saltSizeBytesSysPropertyName = null;
        super.setSaltSizeBytes(num);
    }

    public void setSaltSizeBytesEnvName(String str) {
        this.saltSizeBytesEnvName = str;
        if (str == null) {
            super.setSaltSizeBytes((String) null);
        } else {
            this.saltSizeBytesSysPropertyName = null;
            super.setSaltSizeBytes(System.getenv(str));
        }
    }

    public void setSaltSizeBytesSysPropertyName(String str) {
        this.saltSizeBytesSysPropertyName = str;
        if (str == null) {
            super.setSaltSizeBytes((Integer) null);
        } else {
            this.saltSizeBytesEnvName = null;
            super.setSaltSizeBytes(System.getProperty(str));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setUseLenientSaltSizeCheck(Boolean bool) {
        this.useLenientSaltSizeCheckEnvName = null;
        this.useLenientSaltSizeCheckSysPropertyName = null;
        super.setUseLenientSaltSizeCheck(bool);
    }

    public void setUseLenientSaltSizeCheckEnvName(String str) {
        this.useLenientSaltSizeCheckEnvName = str;
        if (str == null) {
            super.setUseLenientSaltSizeCheck(null);
        } else {
            this.useLenientSaltSizeCheckSysPropertyName = null;
            super.setUseLenientSaltSizeCheck(CommonUtils.getStandardBooleanValue(System.getenv(str)));
        }
    }

    public void setUseLenientSaltSizeCheckSysPropertyName(String str) {
        this.useLenientSaltSizeCheckSysPropertyName = str;
        if (str == null) {
            super.setUseLenientSaltSizeCheck(null);
        } else {
            this.useLenientSaltSizeCheckEnvName = null;
            super.setUseLenientSaltSizeCheck(CommonUtils.getStandardBooleanValue(System.getProperty(str)));
        }
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setIterations(String str) {
        this.iterationsEnvName = null;
        this.iterationsSysPropertyName = null;
        super.setIterations(str);
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setPoolSize(String str) {
        this.poolSizeEnvName = null;
        this.poolSizeSysPropertyName = null;
        super.setPoolSize(str);
    }

    @Override // org.jasypt.digest.config.SimpleDigesterConfig
    public void setSaltSizeBytes(String str) {
        this.saltSizeBytesEnvName = null;
        this.saltSizeBytesSysPropertyName = null;
        super.setSaltSizeBytes(str);
    }
}
