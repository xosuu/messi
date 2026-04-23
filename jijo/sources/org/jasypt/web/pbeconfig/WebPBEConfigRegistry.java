package org.jasypt.web.pbeconfig;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jasypt.encryption.pbe.config.WebPBEConfig;
import org.jasypt.exceptions.EncryptionInitializationException;

/* JADX INFO: loaded from: classes.dex */
public final class WebPBEConfigRegistry {
    private static final WebPBEConfigRegistry instance = new WebPBEConfigRegistry();
    private final Set names = new HashSet();
    private final List configs = new ArrayList();
    private boolean webConfigurationDone = false;

    private WebPBEConfigRegistry() {
    }

    public static WebPBEConfigRegistry getInstance() {
        return instance;
    }

    public synchronized List getConfigs() {
        return Collections.unmodifiableList(this.configs);
    }

    public boolean isWebConfigurationDone() {
        return this.webConfigurationDone || this.configs.size() == 0;
    }

    public synchronized void registerConfig(WebPBEConfig webPBEConfig) {
        if (this.webConfigurationDone) {
            throw new EncryptionInitializationException("Cannot register: Web configuration is already done");
        }
        if (!this.names.contains(webPBEConfig.getName())) {
            this.configs.add(webPBEConfig);
            this.names.add(webPBEConfig);
        }
    }

    public void setWebConfigurationDone(boolean z9) {
        this.webConfigurationDone = z9;
    }
}
