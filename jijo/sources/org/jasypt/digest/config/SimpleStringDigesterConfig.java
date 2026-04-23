package org.jasypt.digest.config;

import org.jasypt.commons.CommonUtils;

/* JADX INFO: loaded from: classes.dex */
public class SimpleStringDigesterConfig extends SimpleDigesterConfig implements StringDigesterConfig {
    private Boolean unicodeNormalizationIgnored = null;
    private String stringOutputType = null;
    private String prefix = null;
    private String suffix = null;

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public String getPrefix() {
        return this.prefix;
    }

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public String getStringOutputType() {
        return this.stringOutputType;
    }

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public String getSuffix() {
        return this.suffix;
    }

    @Override // org.jasypt.digest.config.StringDigesterConfig
    public Boolean isUnicodeNormalizationIgnored() {
        return this.unicodeNormalizationIgnored;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    public void setStringOutputType(String str) {
        this.stringOutputType = CommonUtils.getStandardStringOutputType(str);
    }

    public void setSuffix(String str) {
        this.suffix = str;
    }

    public void setUnicodeNormalizationIgnored(Boolean bool) {
        this.unicodeNormalizationIgnored = bool;
    }

    public void setUnicodeNormalizationIgnored(String str) {
        if (str != null) {
            this.unicodeNormalizationIgnored = CommonUtils.getStandardBooleanValue(str);
        } else {
            this.unicodeNormalizationIgnored = null;
        }
    }
}
