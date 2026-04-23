package org.jasypt.encryption.pbe.config;

import java.security.Provider;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public class EnvironmentPBEConfig extends SimplePBEConfig {
    private String algorithmEnvName = null;
    private String keyObtentionIterationsEnvName = null;
    private String passwordEnvName = null;
    private String saltGeneratorClassNameEnvName = null;
    private String providerNameEnvName = null;
    private String providerClassNameEnvName = null;
    private String poolSizeEnvName = null;
    private String algorithmSysPropertyName = null;
    private String keyObtentionIterationsSysPropertyName = null;
    private String passwordSysPropertyName = null;
    private String saltGeneratorClassNameSysPropertyName = null;
    private String providerNameSysPropertyName = null;
    private String providerClassNameSysPropertyName = null;
    private String poolSizeSysPropertyName = null;

    public String getAlgorithmEnvName() {
        return this.algorithmEnvName;
    }

    public String getAlgorithmSysPropertyName() {
        return this.algorithmSysPropertyName;
    }

    public String getKeyObtentionIterationsEnvName() {
        return this.keyObtentionIterationsEnvName;
    }

    public String getKeyObtentionIterationsSysPropertyName() {
        return this.keyObtentionIterationsSysPropertyName;
    }

    public String getPasswordEnvName() {
        return this.passwordEnvName;
    }

    public String getPasswordSysPropertyName() {
        return this.passwordSysPropertyName;
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

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
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

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
    public void setKeyObtentionIterations(Integer num) {
        this.keyObtentionIterationsEnvName = null;
        this.keyObtentionIterationsSysPropertyName = null;
        super.setKeyObtentionIterations(num);
    }

    public void setKeyObtentionIterationsEnvName(String str) {
        this.keyObtentionIterationsEnvName = str;
        if (str == null) {
            super.setKeyObtentionIterations((Integer) null);
        } else {
            this.keyObtentionIterationsSysPropertyName = null;
            super.setKeyObtentionIterations(System.getenv(str));
        }
    }

    public void setKeyObtentionIterationsSysPropertyName(String str) {
        this.keyObtentionIterationsSysPropertyName = str;
        if (str == null) {
            super.setKeyObtentionIterations((Integer) null);
        } else {
            this.keyObtentionIterationsEnvName = null;
            super.setKeyObtentionIterations(System.getProperty(str));
        }
    }

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
    public void setPassword(String str) {
        this.passwordEnvName = null;
        this.passwordSysPropertyName = null;
        super.setPassword(str);
    }

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
    public void setPasswordCharArray(char[] cArr) {
        this.passwordEnvName = null;
        this.passwordSysPropertyName = null;
        super.setPasswordCharArray(cArr);
    }

    public void setPasswordEnvName(String str) {
        this.passwordEnvName = str;
        if (str == null) {
            super.setPassword(null);
        } else {
            this.passwordSysPropertyName = null;
            super.setPassword(System.getenv(str));
        }
    }

    public void setPasswordSysPropertyName(String str) {
        this.passwordSysPropertyName = str;
        if (str == null) {
            super.setPassword(null);
        } else {
            this.passwordEnvName = null;
            super.setPassword(System.getProperty(str));
        }
    }

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
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

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
    public void setProvider(Provider provider) {
        this.providerClassNameEnvName = null;
        this.providerClassNameSysPropertyName = null;
        super.setProvider(provider);
    }

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
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

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
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

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
    public void setSaltGenerator(SaltGenerator saltGenerator) {
        this.saltGeneratorClassNameEnvName = null;
        this.saltGeneratorClassNameSysPropertyName = null;
        super.setSaltGenerator(saltGenerator);
    }

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
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

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
    public void setKeyObtentionIterations(String str) {
        this.keyObtentionIterationsEnvName = null;
        this.keyObtentionIterationsSysPropertyName = null;
        super.setKeyObtentionIterations(str);
    }

    @Override // org.jasypt.encryption.pbe.config.SimplePBEConfig
    public void setPoolSize(String str) {
        this.poolSizeEnvName = null;
        this.poolSizeSysPropertyName = null;
        super.setPoolSize(str);
    }
}
