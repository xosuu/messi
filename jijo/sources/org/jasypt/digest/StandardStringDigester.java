package org.jasypt.digest;

import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.jasypt.digest.config.DigesterConfig;
import org.jasypt.digest.config.StringDigesterConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.normalization.Normalizer;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class StandardStringDigester implements StringDigester {
    public static final String DEFAULT_STRING_OUTPUT_TYPE = "base64";
    public static final boolean DEFAULT_UNICODE_NORMALIZATION_IGNORED = false;
    public static final String DIGEST_CHARSET = "US-ASCII";
    public static final String MESSAGE_CHARSET = "UTF-8";
    private final Base64 base64;
    private final StandardByteDigester byteDigester;
    private String prefix;
    private boolean prefixSet;
    private StringDigesterConfig stringDigesterConfig;
    private String stringOutputType;
    private boolean stringOutputTypeBase64;
    private boolean stringOutputTypeSet;
    private String suffix;
    private boolean suffixSet;
    private boolean unicodeNormalizationIgnored;
    private boolean unicodeNormalizationIgnoredSet;

    public StandardStringDigester() {
        this.stringDigesterConfig = null;
        this.unicodeNormalizationIgnored = false;
        this.stringOutputType = "base64";
        this.stringOutputTypeBase64 = true;
        this.prefix = null;
        this.suffix = null;
        this.unicodeNormalizationIgnoredSet = false;
        this.stringOutputTypeSet = false;
        this.prefixSet = false;
        this.suffixSet = false;
        this.byteDigester = new StandardByteDigester();
        this.base64 = new Base64();
    }

    public StandardStringDigester cloneDigester() {
        if (!isInitialized()) {
            initialize();
        }
        StandardStringDigester standardStringDigester = new StandardStringDigester(this.byteDigester.cloneDigester());
        standardStringDigester.setPrefix(this.prefix);
        standardStringDigester.setSuffix(this.suffix);
        if (CommonUtils.isNotEmpty(this.stringOutputType)) {
            standardStringDigester.setStringOutputType(this.stringOutputType);
        }
        standardStringDigester.setUnicodeNormalizationIgnored(this.unicodeNormalizationIgnored);
        return standardStringDigester;
    }

    @Override // org.jasypt.digest.StringDigester
    public String digest(String str) {
        if (str == null) {
            return null;
        }
        if (!isInitialized()) {
            initialize();
        }
        try {
            if (!this.unicodeNormalizationIgnored) {
                str = Normalizer.normalizeToNfc(str);
            }
            byte[] bArrDigest = this.byteDigester.digest(str.getBytes(MESSAGE_CHARSET));
            StringBuffer stringBuffer = new StringBuffer();
            String str2 = this.prefix;
            if (str2 != null) {
                stringBuffer.append(str2);
            }
            if (this.stringOutputTypeBase64) {
                stringBuffer.append(new String(this.base64.encode(bArrDigest), DIGEST_CHARSET));
            } else {
                stringBuffer.append(CommonUtils.toHexadecimal(bArrDigest));
            }
            String str3 = this.suffix;
            if (str3 != null) {
                stringBuffer.append(str3);
            }
            return stringBuffer.toString();
        } catch (EncryptionInitializationException e10) {
            throw e10;
        } catch (EncryptionOperationNotPossibleException e11) {
            throw e11;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public synchronized void initialize() {
        try {
            if (!isInitialized()) {
                StringDigesterConfig stringDigesterConfig = this.stringDigesterConfig;
                if (stringDigesterConfig != null) {
                    Boolean boolIsUnicodeNormalizationIgnored = stringDigesterConfig.isUnicodeNormalizationIgnored();
                    String stringOutputType = this.stringDigesterConfig.getStringOutputType();
                    String prefix = this.stringDigesterConfig.getPrefix();
                    String suffix = this.stringDigesterConfig.getSuffix();
                    this.unicodeNormalizationIgnored = (this.unicodeNormalizationIgnoredSet || boolIsUnicodeNormalizationIgnored == null) ? this.unicodeNormalizationIgnored : boolIsUnicodeNormalizationIgnored.booleanValue();
                    if (this.stringOutputTypeSet || stringOutputType == null) {
                        stringOutputType = this.stringOutputType;
                    }
                    this.stringOutputType = stringOutputType;
                    if (this.prefixSet || prefix == null) {
                        prefix = this.prefix;
                    }
                    this.prefix = prefix;
                    if (this.suffixSet || suffix == null) {
                        suffix = this.suffix;
                    }
                    this.suffix = suffix;
                }
                this.stringOutputTypeBase64 = "base64".equalsIgnoreCase(this.stringOutputType);
                this.byteDigester.initialize();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isInitialized() {
        return this.byteDigester.isInitialized();
    }

    @Override // org.jasypt.digest.StringDigester
    public boolean matches(String str, String str2) {
        if (str2 != null) {
            String str3 = this.prefix;
            if (str3 != null) {
                if (!str2.startsWith(str3)) {
                    StringBuffer stringBuffer = new StringBuffer("Digest does not start with required prefix \"");
                    stringBuffer.append(this.prefix);
                    stringBuffer.append("\"");
                    throw new EncryptionOperationNotPossibleException(stringBuffer.toString());
                }
                str2 = str2.substring(this.prefix.length());
            }
            String str4 = this.suffix;
            if (str4 != null) {
                if (!str2.endsWith(str4)) {
                    StringBuffer stringBuffer2 = new StringBuffer("Digest does not end with required suffix \"");
                    stringBuffer2.append(this.suffix);
                    stringBuffer2.append("\"");
                    throw new EncryptionOperationNotPossibleException(stringBuffer2.toString());
                }
                str2 = str2.substring(0, str2.length() - this.suffix.length());
            }
        }
        if (str == null) {
            return str2 == null;
        }
        if (str2 == null) {
            return false;
        }
        if (!isInitialized()) {
            initialize();
        }
        try {
            if (!this.unicodeNormalizationIgnored) {
                str = Normalizer.normalizeToNfc(str);
            }
            return this.byteDigester.matches(str.getBytes(MESSAGE_CHARSET), this.stringOutputTypeBase64 ? this.base64.decode(str2.getBytes(DIGEST_CHARSET)) : CommonUtils.fromHexadecimal(str2));
        } catch (EncryptionInitializationException e10) {
            throw e10;
        } catch (EncryptionOperationNotPossibleException e11) {
            throw e11;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public void setAlgorithm(String str) {
        this.byteDigester.setAlgorithm(str);
    }

    public synchronized void setConfig(DigesterConfig digesterConfig) {
        this.byteDigester.setConfig(digesterConfig);
        if (digesterConfig != null && (digesterConfig instanceof StringDigesterConfig)) {
            this.stringDigesterConfig = (StringDigesterConfig) digesterConfig;
        }
    }

    public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean z9) {
        this.byteDigester.setInvertPositionOfPlainSaltInEncryptionResults(z9);
    }

    public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean z9) {
        this.byteDigester.setInvertPositionOfSaltInMessageBeforeDigesting(z9);
    }

    public void setIterations(int i10) {
        this.byteDigester.setIterations(i10);
    }

    public synchronized void setPrefix(String str) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.prefix = str;
        this.prefixSet = true;
    }

    public void setProvider(Provider provider) {
        this.byteDigester.setProvider(provider);
    }

    public void setProviderName(String str) {
        this.byteDigester.setProviderName(str);
    }

    public void setSaltGenerator(SaltGenerator saltGenerator) {
        this.byteDigester.setSaltGenerator(saltGenerator);
    }

    public void setSaltSizeBytes(int i10) {
        this.byteDigester.setSaltSizeBytes(i10);
    }

    public synchronized void setStringOutputType(String str) {
        CommonUtils.validateNotEmpty(str, "String output type cannot be set empty");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.stringOutputType = CommonUtils.getStandardStringOutputType(str);
        this.stringOutputTypeSet = true;
    }

    public synchronized void setSuffix(String str) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.suffix = str;
        this.suffixSet = true;
    }

    public synchronized void setUnicodeNormalizationIgnored(boolean z9) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.unicodeNormalizationIgnored = z9;
        this.unicodeNormalizationIgnoredSet = true;
    }

    public synchronized void setUseLenientSaltSizeCheck(boolean z9) {
        this.byteDigester.setUseLenientSaltSizeCheck(z9);
    }

    private StandardStringDigester(StandardByteDigester standardByteDigester) {
        this.stringDigesterConfig = null;
        this.unicodeNormalizationIgnored = false;
        this.stringOutputType = "base64";
        this.stringOutputTypeBase64 = true;
        this.prefix = null;
        this.suffix = null;
        this.unicodeNormalizationIgnoredSet = false;
        this.stringOutputTypeSet = false;
        this.prefixSet = false;
        this.suffixSet = false;
        this.byteDigester = standardByteDigester;
        this.base64 = new Base64();
    }
}
