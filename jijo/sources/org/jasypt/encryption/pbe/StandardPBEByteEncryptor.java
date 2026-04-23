package org.jasypt.encryption.pbe;

import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.jasypt.commons.CommonUtils;
import org.jasypt.encryption.pbe.config.PBECleanablePasswordConfig;
import org.jasypt.encryption.pbe.config.PBEConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.normalization.Normalizer;
import org.jasypt.salt.FixedSaltGenerator;
import org.jasypt.salt.RandomSaltGenerator;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class StandardPBEByteEncryptor implements PBEByteCleanablePasswordEncryptor {
    public static final String DEFAULT_ALGORITHM = "PBEWithMD5AndDES";
    public static final int DEFAULT_KEY_OBTENTION_ITERATIONS = 1000;
    public static final int DEFAULT_SALT_SIZE_BYTES = 8;
    private String algorithm = DEFAULT_ALGORITHM;
    private String providerName = null;
    private Provider provider = null;
    private char[] password = null;
    private int keyObtentionIterations = 1000;
    private SaltGenerator saltGenerator = null;
    private int saltSizeBytes = 8;
    private PBEConfig config = null;
    private boolean algorithmSet = false;
    private boolean passwordSet = false;
    private boolean iterationsSet = false;
    private boolean saltGeneratorSet = false;
    private boolean providerNameSet = false;
    private boolean providerSet = false;
    private boolean initialized = false;
    private SecretKey key = null;
    private Cipher encryptCipher = null;
    private Cipher decryptCipher = null;
    private boolean usingFixedSalt = false;
    private byte[] fixedSaltInUse = null;

    private static void cleanPassword(char[] cArr) {
        if (cArr != null) {
            synchronized (cArr) {
                try {
                    int length = cArr.length;
                    for (int i10 = 0; i10 < length; i10++) {
                        cArr[i10] = 0;
                    }
                } finally {
                }
            }
        }
    }

    private void handleInvalidKeyException(InvalidKeyException invalidKeyException) {
        if (invalidKeyException.getMessage() != null && invalidKeyException.getMessage().toUpperCase().indexOf("KEY SIZE") != -1) {
            throw new EncryptionOperationNotPossibleException("Encryption raised an exception. A possible cause is you are using strong encryption algorithms and you have not installed the Java Cryptography Extension (JCE) Unlimited Strength Jurisdiction Policy Files in this Java Virtual Machine");
        }
    }

    private synchronized void resolveConfigurationPassword() {
        PBEConfig pBEConfig;
        char[] charArray;
        try {
            if (!this.initialized && (pBEConfig = this.config) != null && !this.passwordSet) {
                if (pBEConfig instanceof PBECleanablePasswordConfig) {
                    charArray = ((PBECleanablePasswordConfig) pBEConfig).getPasswordCharArray();
                } else {
                    String password = pBEConfig.getPassword();
                    charArray = password != null ? password.toCharArray() : null;
                }
                if (charArray != null) {
                    CommonUtils.validateIsTrue(charArray.length > 0, "Password cannot be set empty");
                }
                if (charArray != null) {
                    char[] cArr = new char[charArray.length];
                    this.password = cArr;
                    System.arraycopy(charArray, 0, cArr, 0, charArray.length);
                    this.passwordSet = true;
                    cleanPassword(charArray);
                }
                PBEConfig pBEConfig2 = this.config;
                if (pBEConfig2 instanceof PBECleanablePasswordConfig) {
                    ((PBECleanablePasswordConfig) pBEConfig2).cleanPassword();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized StandardPBEByteEncryptor[] cloneAndInitializeEncryptor(int i10) {
        StandardPBEByteEncryptor[] standardPBEByteEncryptorArr;
        try {
            if (isInitialized()) {
                throw new EncryptionInitializationException("Cannot clone encryptor if it has been already initialized");
            }
            resolveConfigurationPassword();
            char[] cArr = this.password;
            char[] cArr2 = new char[cArr.length];
            System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
            initialize();
            standardPBEByteEncryptorArr = new StandardPBEByteEncryptor[i10];
            standardPBEByteEncryptorArr[0] = this;
            for (int i11 = 1; i11 < i10; i11++) {
                StandardPBEByteEncryptor standardPBEByteEncryptor = new StandardPBEByteEncryptor();
                standardPBEByteEncryptor.setPasswordCharArray(cArr2);
                if (CommonUtils.isNotEmpty(this.algorithm)) {
                    standardPBEByteEncryptor.setAlgorithm(this.algorithm);
                }
                standardPBEByteEncryptor.setKeyObtentionIterations(this.keyObtentionIterations);
                Provider provider = this.provider;
                if (provider != null) {
                    standardPBEByteEncryptor.setProvider(provider);
                }
                String str = this.providerName;
                if (str != null) {
                    standardPBEByteEncryptor.setProviderName(str);
                }
                SaltGenerator saltGenerator = this.saltGenerator;
                if (saltGenerator != null) {
                    standardPBEByteEncryptor.setSaltGenerator(saltGenerator);
                }
                standardPBEByteEncryptorArr[i11] = standardPBEByteEncryptor;
            }
            cleanPassword(cArr2);
        } catch (Throwable th) {
            throw th;
        }
        return standardPBEByteEncryptorArr;
    }

    @Override // org.jasypt.encryption.ByteEncryptor
    public byte[] decrypt(byte[] bArr) {
        byte[] bArrGenerateSalt;
        byte[] bArrDoFinal;
        if (bArr == null) {
            return null;
        }
        if (!isInitialized()) {
            initialize();
        }
        if (this.saltGenerator.includePlainSaltInEncryptionResults() && bArr.length <= this.saltSizeBytes) {
            throw new EncryptionOperationNotPossibleException();
        }
        try {
            if (this.saltGenerator.includePlainSaltInEncryptionResults()) {
                int i10 = this.saltSizeBytes;
                int length = i10 < bArr.length ? i10 : bArr.length;
                int length2 = i10 < bArr.length ? i10 : bArr.length;
                int length3 = i10 < bArr.length ? bArr.length - i10 : 0;
                bArrGenerateSalt = new byte[length];
                byte[] bArr2 = new byte[length3];
                System.arraycopy(bArr, 0, bArrGenerateSalt, 0, length);
                System.arraycopy(bArr, length2, bArr2, 0, length3);
                bArr = bArr2;
            } else {
                bArrGenerateSalt = !this.usingFixedSalt ? this.saltGenerator.generateSalt(this.saltSizeBytes) : this.fixedSaltInUse;
            }
            if (this.usingFixedSalt) {
                synchronized (this.decryptCipher) {
                    bArrDoFinal = this.decryptCipher.doFinal(bArr);
                }
            } else {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArrGenerateSalt, this.keyObtentionIterations);
                synchronized (this.decryptCipher) {
                    this.decryptCipher.init(2, this.key, pBEParameterSpec);
                    bArrDoFinal = this.decryptCipher.doFinal(bArr);
                }
            }
            return bArrDoFinal;
        } catch (InvalidKeyException e10) {
            handleInvalidKeyException(e10);
            throw new EncryptionOperationNotPossibleException();
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    @Override // org.jasypt.encryption.ByteEncryptor
    public byte[] encrypt(byte[] bArr) {
        byte[] bArrGenerateSalt;
        byte[] bArrDoFinal;
        if (bArr == null) {
            return null;
        }
        if (!isInitialized()) {
            initialize();
        }
        try {
            if (this.usingFixedSalt) {
                bArrGenerateSalt = this.fixedSaltInUse;
                synchronized (this.encryptCipher) {
                    bArrDoFinal = this.encryptCipher.doFinal(bArr);
                }
            } else {
                bArrGenerateSalt = this.saltGenerator.generateSalt(this.saltSizeBytes);
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArrGenerateSalt, this.keyObtentionIterations);
                synchronized (this.encryptCipher) {
                    this.encryptCipher.init(1, this.key, pBEParameterSpec);
                    bArrDoFinal = this.encryptCipher.doFinal(bArr);
                }
            }
            return this.saltGenerator.includePlainSaltInEncryptionResults() ? CommonUtils.appendArrays(bArrGenerateSalt, bArrDoFinal) : bArrDoFinal;
        } catch (InvalidKeyException e10) {
            handleInvalidKeyException(e10);
            throw new EncryptionOperationNotPossibleException();
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public synchronized void initialize() {
        try {
            if (!this.initialized) {
                if (this.config != null) {
                    resolveConfigurationPassword();
                    String algorithm = this.config.getAlgorithm();
                    if (algorithm != null) {
                        CommonUtils.validateNotEmpty(algorithm, "Algorithm cannot be set empty");
                    }
                    Integer keyObtentionIterations = this.config.getKeyObtentionIterations();
                    if (keyObtentionIterations != null) {
                        CommonUtils.validateIsTrue(keyObtentionIterations.intValue() > 0, "Number of iterations for key obtention must be greater than zero");
                    }
                    SaltGenerator saltGenerator = this.config.getSaltGenerator();
                    String providerName = this.config.getProviderName();
                    if (providerName != null) {
                        CommonUtils.validateNotEmpty(providerName, "Provider name cannot be empty");
                    }
                    Provider provider = this.config.getProvider();
                    if (this.algorithmSet || algorithm == null) {
                        algorithm = this.algorithm;
                    }
                    this.algorithm = algorithm;
                    this.keyObtentionIterations = (this.iterationsSet || keyObtentionIterations == null) ? this.keyObtentionIterations : keyObtentionIterations.intValue();
                    if (this.saltGeneratorSet || saltGenerator == null) {
                        saltGenerator = this.saltGenerator;
                    }
                    this.saltGenerator = saltGenerator;
                    if (this.providerNameSet || providerName == null) {
                        providerName = this.providerName;
                    }
                    this.providerName = providerName;
                    if (this.providerSet || provider == null) {
                        provider = this.provider;
                    }
                    this.provider = provider;
                }
                if (this.saltGenerator == null) {
                    this.saltGenerator = new RandomSaltGenerator();
                }
                try {
                    char[] cArr = this.password;
                    if (cArr == null) {
                        throw new EncryptionInitializationException("Password not set for Password Based Encryptor");
                    }
                    char[] cArrNormalizeToNfc = Normalizer.normalizeToNfc(cArr);
                    PBEKeySpec pBEKeySpec = new PBEKeySpec(cArrNormalizeToNfc);
                    cleanPassword(this.password);
                    cleanPassword(cArrNormalizeToNfc);
                    Provider provider2 = this.provider;
                    if (provider2 != null) {
                        this.key = SecretKeyFactory.getInstance(this.algorithm, provider2).generateSecret(pBEKeySpec);
                        this.encryptCipher = Cipher.getInstance(this.algorithm, this.provider);
                        this.decryptCipher = Cipher.getInstance(this.algorithm, this.provider);
                    } else {
                        String str = this.providerName;
                        if (str != null) {
                            this.key = SecretKeyFactory.getInstance(this.algorithm, str).generateSecret(pBEKeySpec);
                            this.encryptCipher = Cipher.getInstance(this.algorithm, this.providerName);
                            this.decryptCipher = Cipher.getInstance(this.algorithm, this.providerName);
                        } else {
                            this.key = SecretKeyFactory.getInstance(this.algorithm).generateSecret(pBEKeySpec);
                            this.encryptCipher = Cipher.getInstance(this.algorithm);
                            this.decryptCipher = Cipher.getInstance(this.algorithm);
                        }
                    }
                    int blockSize = this.encryptCipher.getBlockSize();
                    if (blockSize > 0) {
                        this.saltSizeBytes = blockSize;
                    }
                    SaltGenerator saltGenerator2 = this.saltGenerator;
                    boolean z9 = saltGenerator2 instanceof FixedSaltGenerator;
                    this.usingFixedSalt = z9;
                    if (z9) {
                        this.fixedSaltInUse = saltGenerator2.generateSalt(this.saltSizeBytes);
                        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(this.fixedSaltInUse, this.keyObtentionIterations);
                        try {
                            this.encryptCipher.init(1, this.key, pBEParameterSpec);
                            this.decryptCipher.init(2, this.key, pBEParameterSpec);
                        } catch (Exception unused) {
                            throw new EncryptionOperationNotPossibleException();
                        }
                    }
                    this.initialized = true;
                } catch (EncryptionInitializationException e10) {
                    throw e10;
                } catch (Throwable th) {
                    throw new EncryptionInitializationException(th);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    public synchronized void setAlgorithm(String str) {
        CommonUtils.validateNotEmpty(str, "Algorithm cannot be set empty");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.algorithm = str;
        this.algorithmSet = true;
    }

    public synchronized void setConfig(PBEConfig pBEConfig) {
        CommonUtils.validateNotNull(pBEConfig, "Config cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.config = pBEConfig;
    }

    public synchronized void setKeyObtentionIterations(int i10) {
        CommonUtils.validateIsTrue(i10 > 0, "Number of iterations for key obtention must be greater than zero");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.keyObtentionIterations = i10;
        this.iterationsSet = true;
    }

    @Override // org.jasypt.encryption.pbe.PasswordBased
    public synchronized void setPassword(String str) {
        try {
            CommonUtils.validateNotEmpty(str, "Password cannot be set empty");
            if (isInitialized()) {
                throw new AlreadyInitializedException();
            }
            char[] cArr = this.password;
            if (cArr != null) {
                cleanPassword(cArr);
            }
            this.password = str.toCharArray();
            this.passwordSet = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // org.jasypt.encryption.pbe.CleanablePasswordBased
    public synchronized void setPasswordCharArray(char[] cArr) {
        try {
            CommonUtils.validateNotNull(cArr, "Password cannot be set null");
            CommonUtils.validateIsTrue(cArr.length > 0, "Password cannot be set empty");
            if (isInitialized()) {
                throw new AlreadyInitializedException();
            }
            char[] cArr2 = this.password;
            if (cArr2 != null) {
                cleanPassword(cArr2);
            }
            char[] cArr3 = new char[cArr.length];
            this.password = cArr3;
            System.arraycopy(cArr, 0, cArr3, 0, cArr.length);
            this.passwordSet = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void setProvider(Provider provider) {
        CommonUtils.validateNotNull(provider, "Provider cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.provider = provider;
        this.providerSet = true;
    }

    public synchronized void setProviderName(String str) {
        CommonUtils.validateNotNull(str, "Provider name cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.providerName = str;
        this.providerNameSet = true;
    }

    public synchronized void setSaltGenerator(SaltGenerator saltGenerator) {
        CommonUtils.validateNotNull(saltGenerator, "Salt generator cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.saltGenerator = saltGenerator;
        this.saltGeneratorSet = true;
    }
}
