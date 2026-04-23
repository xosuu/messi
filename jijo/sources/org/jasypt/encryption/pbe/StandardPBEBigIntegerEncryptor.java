package org.jasypt.encryption.pbe;

import java.math.BigInteger;
import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.PBEConfig;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class StandardPBEBigIntegerEncryptor implements PBEBigIntegerCleanablePasswordEncryptor {
    private final StandardPBEByteEncryptor byteEncryptor;

    public StandardPBEBigIntegerEncryptor() {
        this.byteEncryptor = new StandardPBEByteEncryptor();
    }

    public synchronized StandardPBEBigIntegerEncryptor[] cloneAndInitializeEncryptor(int i10) {
        StandardPBEBigIntegerEncryptor[] standardPBEBigIntegerEncryptorArr;
        StandardPBEByteEncryptor[] standardPBEByteEncryptorArrCloneAndInitializeEncryptor = this.byteEncryptor.cloneAndInitializeEncryptor(i10);
        standardPBEBigIntegerEncryptorArr = new StandardPBEBigIntegerEncryptor[i10];
        standardPBEBigIntegerEncryptorArr[0] = this;
        for (int i11 = 1; i11 < i10; i11++) {
            standardPBEBigIntegerEncryptorArr[i11] = new StandardPBEBigIntegerEncryptor(standardPBEByteEncryptorArrCloneAndInitializeEncryptor[i11]);
        }
        return standardPBEBigIntegerEncryptorArr;
    }

    @Override // org.jasypt.encryption.BigIntegerEncryptor
    public BigInteger decrypt(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        try {
            return new BigInteger(this.byteEncryptor.decrypt(NumberUtils.processBigIntegerEncryptedByteArray(bigInteger.toByteArray(), bigInteger.signum())));
        } catch (EncryptionInitializationException e10) {
            throw e10;
        } catch (EncryptionOperationNotPossibleException e11) {
            throw e11;
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    @Override // org.jasypt.encryption.BigIntegerEncryptor
    public BigInteger encrypt(BigInteger bigInteger) {
        if (bigInteger == null) {
            return null;
        }
        try {
            byte[] bArrEncrypt = this.byteEncryptor.encrypt(bigInteger.toByteArray());
            return new BigInteger(CommonUtils.appendArrays(bArrEncrypt, NumberUtils.byteArrayFromInt(bArrEncrypt.length)));
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

    private StandardPBEBigIntegerEncryptor(StandardPBEByteEncryptor standardPBEByteEncryptor) {
        this.byteEncryptor = standardPBEByteEncryptor;
    }
}
