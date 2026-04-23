package org.jasypt.encryption.pbe.config;

import org.jasypt.commons.CommonUtils;

/* JADX INFO: loaded from: classes.dex */
public class SimpleStringPBEConfig extends SimplePBEConfig implements StringPBEConfig {
    private String stringOutputType = null;

    @Override // org.jasypt.encryption.pbe.config.StringPBEConfig
    public String getStringOutputType() {
        return this.stringOutputType;
    }

    public void setStringOutputType(String str) {
        this.stringOutputType = CommonUtils.getStandardStringOutputType(str);
    }
}
