package org.jasypt.digest.config;

/* JADX INFO: loaded from: classes.dex */
public interface StringDigesterConfig extends DigesterConfig {
    String getPrefix();

    String getStringOutputType();

    String getSuffix();

    Boolean isUnicodeNormalizationIgnored();
}
