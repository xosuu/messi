package org.jasypt.digest.config;

import org.jasypt.commons.CommonUtils;

/* JADX INFO: loaded from: classes.dex */
public class EnvironmentStringDigesterConfig extends EnvironmentDigesterConfig implements StringDigesterConfig {
    private Boolean unicodeNormalizationIgnored = null;
    private String stringOutputType = null;
    private String prefix = null;
    private String suffix = null;
    private String unicodeNormalizationIgnoredEnvName = null;
    private String stringOutputTypeEnvName = null;
    private String prefixEnvName = null;
    private String suffixEnvName = null;
    private String unicodeNormalizationIgnoredSysPropertyName = null;
    private String stringOutputTypeSysPropertyName = null;
    private String prefixSysPropertyName = null;
    private String suffixSysPropertyName = null;

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public String getPrefix() {
        return this.prefix;
    }

    public String getPrefixEnvName() {
        return this.prefixEnvName;
    }

    public String getPrefixSysPropertyName() {
        return this.prefixSysPropertyName;
    }

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public String getStringOutputType() {
        return this.stringOutputType;
    }

    public String getStringOutputTypeEnvName() {
        return this.stringOutputTypeEnvName;
    }

    public String getStringOutputTypeSysPropertyName() {
        return this.stringOutputTypeSysPropertyName;
    }

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public String getSuffix() {
        return this.suffix;
    }

    public String getSuffixEnvName() {
        return this.suffixEnvName;
    }

    public String getSuffixSysPropertyName() {
        return this.suffixSysPropertyName;
    }

    public String getUnicodeNormalizationIgnoredEnvName() {
        return this.unicodeNormalizationIgnoredEnvName;
    }

    public String getUnicodeNormalizationIgnoredSysPropertyName() {
        return this.unicodeNormalizationIgnoredSysPropertyName;
    }

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public Boolean isUnicodeNormalizationIgnored() {
        return this.unicodeNormalizationIgnored;
    }

    public void setPrefix(String str) {
        this.prefixEnvName = null;
        this.prefixSysPropertyName = null;
        this.prefix = str;
    }

    public void setPrefixEnvName(String str) {
        this.prefixEnvName = str;
        if (str == null) {
            this.prefix = null;
        } else {
            this.prefixSysPropertyName = null;
            this.prefix = System.getenv(str);
        }
    }

    public void setPrefixSysPropertyName(String str) {
        this.prefixSysPropertyName = str;
        if (str == null) {
            this.prefix = null;
        } else {
            this.prefixEnvName = null;
            this.prefix = System.getProperty(str);
        }
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

    public void setSuffix(String str) {
        this.suffixEnvName = null;
        this.suffixSysPropertyName = null;
        this.suffix = str;
    }

    public void setSuffixEnvName(String str) {
        this.suffixEnvName = str;
        if (str == null) {
            this.suffix = null;
        } else {
            this.suffixSysPropertyName = null;
            this.suffix = System.getenv(str);
        }
    }

    public void setSuffixSysPropertyName(String str) {
        this.suffixSysPropertyName = str;
        if (str == null) {
            this.suffix = null;
        } else {
            this.suffixEnvName = null;
            this.suffix = System.getProperty(str);
        }
    }

    public void setUnicodeNormalizationIgnored(Boolean bool) {
        this.unicodeNormalizationIgnoredEnvName = null;
        this.unicodeNormalizationIgnoredSysPropertyName = null;
        this.unicodeNormalizationIgnored = bool;
    }

    public void setUnicodeNormalizationIgnoredEnvName(String str) {
        this.unicodeNormalizationIgnoredEnvName = str;
        if (str == null) {
            this.unicodeNormalizationIgnored = null;
            return;
        }
        this.unicodeNormalizationIgnoredSysPropertyName = null;
        String str2 = System.getenv(str);
        if (str2 != null) {
            this.unicodeNormalizationIgnored = CommonUtils.getStandardBooleanValue(str2);
        } else {
            this.unicodeNormalizationIgnored = null;
        }
    }

    public void setUnicodeNormalizationIgnoredSysPropertyName(String str) {
        this.unicodeNormalizationIgnoredSysPropertyName = str;
        if (str == null) {
            this.unicodeNormalizationIgnored = null;
            return;
        }
        this.unicodeNormalizationIgnoredEnvName = null;
        String property = System.getProperty(str);
        if (property != null) {
            this.unicodeNormalizationIgnored = CommonUtils.getStandardBooleanValue(property);
        } else {
            this.unicodeNormalizationIgnored = null;
        }
    }

    public void setUnicodeNormalizationIgnored(String str) {
        this.unicodeNormalizationIgnoredEnvName = null;
        this.unicodeNormalizationIgnoredSysPropertyName = null;
        if (str != null) {
            this.unicodeNormalizationIgnored = CommonUtils.getStandardBooleanValue(str);
        } else {
            this.unicodeNormalizationIgnored = null;
        }
    }
}
