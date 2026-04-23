package org.jasypt.encryption.pbe;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.PBEConfig;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class StandardPBEBigDecimalEncryptor implements PBEBigDecimalCleanablePasswordEncryptor {
    private final StandardPBEByteEncryptor byteEncryptor;

    public StandardPBEBigDecimalEncryptor() {
        this.byteEncryptor = new StandardPBEByteEncryptor();
    }

    public synchronized StandardPBEBigDecimalEncryptor[] cloneAndInitializeEncryptor(int i10) {
        StandardPBEBigDecimalEncryptor[] standardPBEBigDecimalEncryptorArr;
        StandardPBEByteEncryptor[] standardPBEByteEncryptorArrCloneAndInitializeEncryptor = this.byteEncryptor.cloneAndInitializeEncryptor(i10);
        standardPBEBigDecimalEncryptorArr = new StandardPBEBigDecimalEncryptor[i10];
        standardPBEBigDecimalEncryptorArr[0] = this;
        for (int i11 = 1; i11 < i10; i11++) {
            standardPBEBigDecimalEncryptorArr[i11] = new StandardPBEBigDecimalEncryptor(standardPBEByteEncryptorArrCloneAndInitializeEncryptor[i11]);
        }
        return standardPBEBigDecimalEncryptorArr;
    }

    @Override // org.jasypt.encryption.BigDecimalEncryptor
    public BigDecimal decrypt(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        try {
            return new BigDecimal(new BigInteger(this.byteEncryptor.decrypt(NumberUtils.processBigIntegerEncryptedByteArray(bigDecimal.unscaledValue().toByteArray(), bigDecimal.signum()))), bigDecimal.scale());
        } catch (EncryptionInitializationException e10) {
            throw e10;
        } catch (EncryptionOperationNotPossibleException e11) {
            throw e11;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    @Override // org.jasypt.encryption.BigDecimalEncryptor
    public BigDecimal encrypt(BigDecimal bigDecimal) {
        if (bigDecimal == null) {
            return null;
        }
        try {
            int iScale = bigDecimal.scale();
            byte[] bArrEncrypt = this.byteEncryptor.encrypt(bigDecimal.unscaledValue().toByteArray());
            return new BigDecimal(new BigInteger(CommonUtils.appendArrays(bArrEncrypt, NumberUtils.byteArrayFromInt(bArrEncrypt.length))), iScale);
        } catch (EncryptionInitializationException e10) {
            throw e10;
        } catch (EncryptionOperationNotPossibleException e11) {
            throw e11;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public void initialize() {
        this.byteEncryptor.initialize();
    }

    public boolean isInitialized() {
        return this.byteEncryptor.isInitialized();
    }

    public void setAlgorithm(String str) {
        this.byteEncryptor.setAlgorithm(str);
    }

    public void setConfig(PBEConfig pBEConfig) {
        this.byteEncryptor.setConfig(pBEConfig);
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

    private StandardPBEBigDecimalEncryptor(StandardPBEByteEncryptor standardPBEByteEncryptor) {
        this.byteEncryptor = standardPBEByteEncryptor;
    }
}
