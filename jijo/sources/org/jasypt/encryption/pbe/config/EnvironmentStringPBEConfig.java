package org.jasypt.encryption.pbe.config;

import org.jasypt.commons.CommonUtils;

/* JADX INFO: loaded from: classes.dex */
public class EnvironmentStringPBEConfig extends EnvironmentPBEConfig implements StringPBEConfig {
    private String stringOutputType = null;
    private String stringOutputTypeEnvName = null;
    private String stringOutputTypeSysPropertyName = null;

    @Override // org.jasypt.encryption.pbe.config.StringPBEConfig
    public String getStringOutputType() {
        return this.stringOutputType;
    }

    public String getStringOutputTypeEnvName() {
        return this.stringOutputTypeEnvName;
    }

    public String getStringOutputTypeSysPropertyName() {
        return this.stringOutputTypeSysPropertyName;
    }

    public void setStringOutputType(String str) {
        this.stringOutputTypeEnvName = null;
        this.stringOutputTypeSysPropertyName = null;
        this.stringOutputType = CommonUtils.getStandardStringOutputType(str);
    }

    public void setStringOutputTypeEnvName(String str) {
        this.stringOutputTypeEnvName = str;
        if (str == null) {
            this.stringOutputType = null;
        } else {
            this.stringOutputTypeSysPropertyName = null;
            this.stringOutputType = CommonUtils.getStandardStringOutputType(System.getenv(str));
        }
    }

    public void setStringOutputTypeSysPropertyName(String str) {
        this.stringOutputTypeSysPropertyName = str;
        if (str == null) {
            this.stringOutputType = null;
        } else {
            this.stringOutputTypeEnvName = null;
            this.stringOutputType = CommonUtils.getStandardStringOutputType(System.getProperty(str));
        }
    }
}
