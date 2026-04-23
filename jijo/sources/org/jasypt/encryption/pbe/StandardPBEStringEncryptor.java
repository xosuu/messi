package org.jasypt.encryption.pbe;

import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.contrib.org.apache.commons.codec_1_3.binary.Base64;
import org.jasypt.encryption.pbe.config.PBEConfig;
import org.jasypt.encryption.pbe.config.StringPBEConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class StandardPBEStringEncryptor implements PBEStringCleanablePasswordEncryptor {
    public static final String DEFAULT_STRING_OUTPUT_TYPE = "base64";
    private static final String ENCRYPTED_MESSAGE_CHARSET = "US-ASCII";
    private static final String MESSAGE_CHARSET = "UTF-8";
    private final Base64 base64;
    private final StandardPBEByteEncryptor byteEncryptor;
    private String stringOutputType;
    private boolean stringOutputTypeBase64;
    private boolean stringOutputTypeSet;
    private StringPBEConfig stringPBEConfig;

    public StandardPBEStringEncryptor() {
        this.stringPBEConfig = null;
        this.stringOutputType = "base64";
        this.stringOutputTypeBase64 = true;
        this.stringOutputTypeSet = false;
        this.byteEncryptor = new StandardPBEByteEncryptor();
        this.base64 = new Base64();
    }

    private void initializeSpecifics() {
        StringPBEConfig stringPBEConfig = this.stringPBEConfig;
        if (stringPBEConfig != null) {
            String stringOutputType = stringPBEConfig.getStringOutputType();
            if (this.stringOutputTypeSet || stringOutputType == null) {
                stringOutputType = this.stringOutputType;
            }
            this.stringOutputType = stringOutputType;
        }
        this.stringOutputTypeBase64 = "base64".equalsIgnoreCase(this.stringOutputType);
    }

    public synchronized StandardPBEStringEncryptor[] cloneAndInitializeEncryptor(int i10) {
        StandardPBEStringEncryptor[] standardPBEStringEncryptorArr;
        StandardPBEByteEncryptor[] standardPBEByteEncryptorArrCloneAndInitializeEncryptor = this.byteEncryptor.cloneAndInitializeEncryptor(i10);
        initializeSpecifics();
        standardPBEStringEncryptorArr = new StandardPBEStringEncryptor[i10];
        standardPBEStringEncryptorArr[0] = this;
        for (int i11 = 1; i11 < i10; i11++) {
            standardPBEStringEncryptorArr[i11] = new StandardPBEStringEncryptor(standardPBEByteEncryptorArrCloneAndInitializeEncryptor[i11]);
            if (CommonUtils.isNotEmpty(this.stringOutputType)) {
                standardPBEStringEncryptorArr[i11].setStringOutputType(this.stringOutputType);
            }
        }
        return standardPBEStringEncryptorArr;
    }

    @Override // org.jasypt.encryption.StringEncryptor
    public String decrypt(String str) {
        byte[] bArrFromHexadecimal;
        if (str == null) {
            return null;
        }
        if (!isInitialized()) {
            initialize();
        }
        try {
            if (this.stringOutputTypeBase64) {
                bArrFromHexadecimal = this.base64.decode(str.getBytes("US-ASCII"));
            } else {
                bArrFromHexadecimal = CommonUtils.fromHexadecimal(str);
            }
            return new String(this.byteEncryptor.decrypt(bArrFromHexadecimal), "UTF-8");
        } catch (EncryptionInitializationException e10) {
            throw e10;
        } catch (EncryptionOperationNotPossibleException e11) {
            throw e11;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    @Override // org.jasypt.encryption.StringEncryptor
    public String encrypt(String str) {
        if (str == null) {
            return null;
        }
        if (!isInitialized()) {
            initialize();
        }
        try {
            byte[] bArrEncrypt = this.byteEncryptor.encrypt(str.getBytes("UTF-8"));
            return this.stringOutputTypeBase64 ? new String(this.base64.encode(bArrEncrypt), "US-ASCII") : CommonUtils.toHexadecimal(bArrEncrypt);
        } catch (EncryptionInitializationException e10) {
            throw e10;
        } catch (EncryptionOperationNotPossibleException e11) {
            throw e11;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public synchronized void initialize() {
        if (!isInitialized()) {
            initializeSpecifics();
            this.byteEncryptor.initialize();
        }
    }

    public boolean isInitialized() {
        return this.byteEncryptor.isInitialized();
    }

    public void setAlgorithm(String str) {
        this.byteEncryptor.setAlgorithm(str);
    }

    public synchronized void setConfig(PBEConfig pBEConfig) {
        this.byteEncryptor.setConfig(pBEConfig);
        if (pBEConfig != null && (pBEConfig instanceof StringPBEConfig)) {
            this.stringPBEConfig = (StringPBEConfig) pBEConfig;
        }
    }

    public void setKeyObtentionIterations(int i10) {
        this.byteEncryptor.setKeyObtentionIterations(i10);
    }

    @Override // org.jasypt.encryption.pbe.PasswordBased
    public void setPassword(String str) {
        this.byteEncryptor.setPassword(str);
    }

    @Override // org.jasypt.encryption.pbe.CleanablePasswordBased
    public void setPasswordCharArray(char[] cArr) {
        this.byteEncryptor.setPasswordCharArray(cArr);
    }

    public void setProvider(Provider provider) {
        this.byteEncryptor.setProvider(provider);
    }

    public void setProviderName(String str) {
        this.byteEncryptor.setProviderName(str);
    }

    public void setSaltGenerator(SaltGenerator saltGenerator) {
        this.byteEncryptor.setSaltGenerator(saltGenerator);
    }

    public synchronized void setStringOutputType(String str) {
        CommonUtils.validateNotEmpty(str, "String output type cannot be set empty");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.stringOutputType = CommonUtils.getStandardStringOutputType(str);
        this.stringOutputTypeSet = true;
    }

    private StandardPBEStringEncryptor(StandardPBEByteEncryptor standardPBEByteEncryptor) {
        this.stringPBEConfig = null;
        this.stringOutputType = "base64";
        this.stringOutputTypeBase64 = true;
        this.stringOutputTypeSet = false;
        this.byteEncryptor = standardPBEByteEncryptor;
        this.base64 = new Base64();
    }
}
