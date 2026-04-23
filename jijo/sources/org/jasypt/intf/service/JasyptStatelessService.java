package org.jasypt.intf.service;

import org.jasypt.commons.CommonUtils;
import org.jasypt.digest.StandardStringDigester;
import org.jasypt.digest.config.EnvironmentStringDigesterConfig;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentStringPBEConfig;

/* JADX INFO: loaded from: classes.dex */
public final class JasyptStatelessService {
    public String decrypt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        EnvironmentStringPBEConfig environmentStringPBEConfig = new EnvironmentStringPBEConfig();
        if (str6 != null) {
            environmentStringPBEConfig.setAlgorithmEnvName(str6);
        }
        if (str7 != null) {
            environmentStringPBEConfig.setAlgorithmSysPropertyName(str7);
        }
        if (str5 != null) {
            environmentStringPBEConfig.setAlgorithm(str5);
        }
        if (str9 != null) {
            environmentStringPBEConfig.setKeyObtentionIterationsEnvName(str9);
        }
        if (str10 != null) {
            environmentStringPBEConfig.setKeyObtentionIterationsSysPropertyName(str10);
        }
        if (str8 != null) {
            environmentStringPBEConfig.setKeyObtentionIterations(str8);
        }
        if (str3 != null) {
            environmentStringPBEConfig.setPasswordEnvName(str3);
        }
        if (str4 != null) {
            environmentStringPBEConfig.setPasswordSysPropertyName(str4);
        }
        if (str2 != null) {
            environmentStringPBEConfig.setPassword(str2);
        }
        if (str12 != null) {
            environmentStringPBEConfig.setSaltGeneratorClassNameEnvName(str12);
        }
        if (str13 != null) {
            environmentStringPBEConfig.setSaltGeneratorClassNameSysPropertyName(str13);
        }
        if (str11 != null) {
            environmentStringPBEConfig.setSaltGeneratorClassName(str11);
        }
        if (str15 != null) {
            environmentStringPBEConfig.setProviderNameEnvName(str15);
        }
        if (str16 != null) {
            environmentStringPBEConfig.setProviderNameSysPropertyName(str16);
        }
        if (str14 != null) {
            environmentStringPBEConfig.setProviderName(str14);
        }
        if (str18 != null) {
            environmentStringPBEConfig.setProviderClassNameEnvName(str18);
        }
        if (str19 != null) {
            environmentStringPBEConfig.setProviderClassNameSysPropertyName(str19);
        }
        if (str17 != null) {
            environmentStringPBEConfig.setProviderClassName(str17);
        }
        if (str21 != null) {
            environmentStringPBEConfig.setStringOutputTypeEnvName(str21);
        }
        if (str22 != null) {
            environmentStringPBEConfig.setStringOutputTypeSysPropertyName(str22);
        }
        if (str20 != null) {
            environmentStringPBEConfig.setStringOutputType(str20);
        }
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setConfig(environmentStringPBEConfig);
        return standardPBEStringEncryptor.decrypt(str);
    }

    public String digest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40) {
        EnvironmentStringDigesterConfig environmentStringDigesterConfig = new EnvironmentStringDigesterConfig();
        if (str3 != null) {
            environmentStringDigesterConfig.setAlgorithmEnvName(str3);
        }
        if (str4 != null) {
            environmentStringDigesterConfig.setAlgorithmSysPropertyName(str4);
        }
        if (str2 != null) {
            environmentStringDigesterConfig.setAlgorithm(str2);
        }
        if (str6 != null) {
            environmentStringDigesterConfig.setIterationsEnvName(str6);
        }
        if (str7 != null) {
            environmentStringDigesterConfig.setIterationsSysPropertyName(str7);
        }
        if (str5 != null) {
            environmentStringDigesterConfig.setIterations(str5);
        }
        if (str9 != null) {
            environmentStringDigesterConfig.setSaltSizeBytesEnvName(str9);
        }
        if (str10 != null) {
            environmentStringDigesterConfig.setSaltSizeBytesSysPropertyName(str10);
        }
        if (str8 != null) {
            environmentStringDigesterConfig.setSaltSizeBytes(str8);
        }
        if (str12 != null) {
            environmentStringDigesterConfig.setSaltGeneratorClassNameEnvName(str12);
        }
        if (str13 != null) {
            environmentStringDigesterConfig.setSaltGeneratorClassNameSysPropertyName(str13);
        }
        if (str11 != null) {
            environmentStringDigesterConfig.setSaltGeneratorClassName(str11);
        }
        if (str15 != null) {
            environmentStringDigesterConfig.setProviderNameEnvName(str15);
        }
        if (str16 != null) {
            environmentStringDigesterConfig.setProviderNameSysPropertyName(str16);
        }
        if (str14 != null) {
            environmentStringDigesterConfig.setProviderName(str14);
        }
        if (str18 != null) {
            environmentStringDigesterConfig.setProviderClassNameEnvName(str18);
        }
        if (str19 != null) {
            environmentStringDigesterConfig.setProviderClassNameSysPropertyName(str19);
        }
        if (str17 != null) {
            environmentStringDigesterConfig.setProviderClassName(str17);
        }
        if (str21 != null) {
            environmentStringDigesterConfig.setInvertPositionOfSaltInMessageBeforeDigestingEnvName(str21);
        }
        if (str22 != null) {
            environmentStringDigesterConfig.setInvertPositionOfSaltInMessageBeforeDigestingSysPropertyName(str22);
        }
        if (str20 != null) {
            environmentStringDigesterConfig.setInvertPositionOfSaltInMessageBeforeDigesting(CommonUtils.getStandardBooleanValue(str20));
        }
        if (str24 != null) {
            environmentStringDigesterConfig.setInvertPositionOfPlainSaltInEncryptionResultsEnvName(str24);
        }
        if (str25 != null) {
            environmentStringDigesterConfig.setInvertPositionOfPlainSaltInEncryptionResultsSysPropertyName(str25);
        }
        if (str23 != null) {
            environmentStringDigesterConfig.setInvertPositionOfPlainSaltInEncryptionResults(CommonUtils.getStandardBooleanValue(str23));
        }
        if (str27 != null) {
            environmentStringDigesterConfig.setUseLenientSaltSizeCheckEnvName(str27);
        }
        if (str28 != null) {
            environmentStringDigesterConfig.setUseLenientSaltSizeCheckSysPropertyName(str28);
        }
        if (str26 != null) {
            environmentStringDigesterConfig.setUseLenientSaltSizeCheck(CommonUtils.getStandardBooleanValue(str26));
        }
        if (str30 != null) {
            environmentStringDigesterConfig.setUnicodeNormalizationIgnoredEnvName(str30);
        }
        if (str31 != null) {
            environmentStringDigesterConfig.setUnicodeNormalizationIgnoredSysPropertyName(str31);
        }
        if (str29 != null) {
            environmentStringDigesterConfig.setUnicodeNormalizationIgnored(str29);
        }
        if (str33 != null) {
            environmentStringDigesterConfig.setStringOutputTypeEnvName(str33);
        }
        if (str34 != null) {
            environmentStringDigesterConfig.setStringOutputTypeSysPropertyName(str34);
        }
        if (str32 != null) {
            environmentStringDigesterConfig.setStringOutputType(str32);
        }
        if (str36 != null) {
            environmentStringDigesterConfig.setPrefixEnvName(str36);
        }
        if (str37 != null) {
            environmentStringDigesterConfig.setPrefixSysPropertyName(str37);
        }
        if (str35 != null) {
            environmentStringDigesterConfig.setPrefix(str35);
        }
        if (str39 != null) {
            environmentStringDigesterConfig.setSuffixEnvName(str39);
        }
        if (str40 != null) {
            environmentStringDigesterConfig.setSuffixSysPropertyName(str40);
        }
        if (str38 != null) {
            environmentStringDigesterConfig.setSuffix(str38);
        }
        StandardStringDigester standardStringDigester = new StandardStringDigester();
        standardStringDigester.setConfig(environmentStringDigesterConfig);
        return standardStringDigester.digest(str);
    }

    public String encrypt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22) {
        EnvironmentStringPBEConfig environmentStringPBEConfig = new EnvironmentStringPBEConfig();
        if (str6 != null) {
            environmentStringPBEConfig.setAlgorithmEnvName(str6);
        }
        if (str7 != null) {
            environmentStringPBEConfig.setAlgorithmSysPropertyName(str7);
        }
        if (str5 != null) {
            environmentStringPBEConfig.setAlgorithm(str5);
        }
        if (str9 != null) {
            environmentStringPBEConfig.setKeyObtentionIterationsEnvName(str9);
        }
        if (str10 != null) {
            environmentStringPBEConfig.setKeyObtentionIterationsSysPropertyName(str10);
        }
        if (str8 != null) {
            environmentStringPBEConfig.setKeyObtentionIterations(str8);
        }
        if (str3 != null) {
            environmentStringPBEConfig.setPasswordEnvName(str3);
        }
        if (str4 != null) {
            environmentStringPBEConfig.setPasswordSysPropertyName(str4);
        }
        if (str2 != null) {
            environmentStringPBEConfig.setPassword(str2);
        }
        if (str12 != null) {
            environmentStringPBEConfig.setSaltGeneratorClassNameEnvName(str12);
        }
        if (str13 != null) {
            environmentStringPBEConfig.setSaltGeneratorClassNameSysPropertyName(str13);
        }
        if (str11 != null) {
            environmentStringPBEConfig.setSaltGeneratorClassName(str11);
        }
        if (str15 != null) {
            environmentStringPBEConfig.setProviderNameEnvName(str15);
        }
        if (str16 != null) {
            environmentStringPBEConfig.setProviderNameSysPropertyName(str16);
        }
        if (str14 != null) {
            environmentStringPBEConfig.setProviderName(str14);
        }
        if (str18 != null) {
            environmentStringPBEConfig.setProviderClassNameEnvName(str18);
        }
        if (str19 != null) {
            environmentStringPBEConfig.setProviderClassNameSysPropertyName(str19);
        }
        if (str17 != null) {
            environmentStringPBEConfig.setProviderClassName(str17);
        }
        if (str21 != null) {
            environmentStringPBEConfig.setStringOutputTypeEnvName(str21);
        }
        if (str22 != null) {
            environmentStringPBEConfig.setStringOutputTypeSysPropertyName(str22);
        }
        if (str20 != null) {
            environmentStringPBEConfig.setStringOutputType(str20);
        }
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        standardPBEStringEncryptor.setConfig(environmentStringPBEConfig);
        return standardPBEStringEncryptor.encrypt(str);
    }
}
