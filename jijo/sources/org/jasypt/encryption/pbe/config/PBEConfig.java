package org.jasypt.encryption.pbe.config;

import java.security.Provider;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public interface PBEConfig {
    String getAlgorithm();

    Integer getKeyObtentionIterations();

    String getPassword();

    Integer getPoolSize();

    Provider getProvider();

    String getProviderName();

    SaltGenerator getSaltGenerator();
}
