package org.jasypt.digest;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import org.jasypt.commons.CommonUtils;
import org.jasypt.digest.config.DigesterConfig;
import org.jasypt.exceptions.AlreadyInitializedException;
import org.jasypt.exceptions.EncryptionInitializationException;
import org.jasypt.exceptions.EncryptionOperationNotPossibleException;
import org.jasypt.salt.RandomSaltGenerator;
import org.jasypt.salt.SaltGenerator;

/* JADX INFO: loaded from: classes.dex */
public final class StandardByteDigester implements ByteDigester {
    public static final String DEFAULT_ALGORITHM = "MD5";
    public static final int DEFAULT_ITERATIONS = 1000;
    public static final int DEFAULT_SALT_SIZE_BYTES = 8;
    private String algorithm = "MD5";
    private int saltSizeBytes = 8;
    private int iterations = 1000;
    private SaltGenerator saltGenerator = null;
    private String providerName = null;
    private Provider provider = null;
    private boolean invertPositionOfSaltInMessageBeforeDigesting = false;
    private boolean invertPositionOfPlainSaltInEncryptionResults = false;
    private boolean useLenientSaltSizeCheck = false;
    private DigesterConfig config = null;
    private boolean algorithmSet = false;
    private boolean saltSizeBytesSet = false;
    private boolean iterationsSet = false;
    private boolean saltGeneratorSet = false;
    private boolean providerNameSet = false;
    private boolean providerSet = false;
    private boolean invertPositionOfSaltInMessageBeforeDigestingSet = false;
    private boolean invertPositionOfPlainSaltInEncryptionResultsSet = false;
    private boolean useLenientSaltSizeCheckSet = false;
    private boolean initialized = false;
    private boolean useSalt = true;
    private MessageDigest md = null;
    private int digestLengthBytes = 0;

    private static boolean digestsAreEqual(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null || bArr2 == null || bArr2.length != (length = bArr.length)) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            i10 |= bArr[i11] ^ bArr2[i11];
        }
        return i10 == 0;
    }

    public StandardByteDigester cloneDigester() {
        if (!isInitialized()) {
            initialize();
        }
        StandardByteDigester standardByteDigester = new StandardByteDigester();
        if (CommonUtils.isNotEmpty(this.algorithm)) {
            standardByteDigester.setAlgorithm(this.algorithm);
        }
        standardByteDigester.setInvertPositionOfPlainSaltInEncryptionResults(this.invertPositionOfPlainSaltInEncryptionResults);
        standardByteDigester.setInvertPositionOfSaltInMessageBeforeDigesting(this.invertPositionOfSaltInMessageBeforeDigesting);
        standardByteDigester.setIterations(this.iterations);
        Provider provider = this.provider;
        if (provider != null) {
            standardByteDigester.setProvider(provider);
        }
        String str = this.providerName;
        if (str != null) {
            standardByteDigester.setProviderName(str);
        }
        SaltGenerator saltGenerator = this.saltGenerator;
        if (saltGenerator != null) {
            standardByteDigester.setSaltGenerator(saltGenerator);
        }
        standardByteDigester.setSaltSizeBytes(this.saltSizeBytes);
        standardByteDigester.setUseLenientSaltSizeCheck(this.useLenientSaltSizeCheck);
        return standardByteDigester;
    }

    @Override // org.jasypt.digest.ByteDigester
    public byte[] digest(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (!isInitialized()) {
            initialize();
        }
        return digest(bArr, this.useSalt ? this.saltGenerator.generateSalt(this.saltSizeBytes) : null);
    }

    public synchronized void initialize() {
        try {
            if (!this.initialized) {
                DigesterConfig digesterConfig = this.config;
                if (digesterConfig != null) {
                    String algorithm = digesterConfig.getAlgorithm();
                    if (algorithm != null) {
                        CommonUtils.validateNotEmpty(algorithm, "Algorithm cannot be empty");
                    }
                    Integer saltSizeBytes = this.config.getSaltSizeBytes();
                    if (saltSizeBytes != null) {
                        CommonUtils.validateIsTrue(saltSizeBytes.intValue() >= 0, "Salt size in bytes must be non-negative");
                    }
                    Integer iterations = this.config.getIterations();
                    if (iterations != null) {
                        CommonUtils.validateIsTrue(iterations.intValue() > 0, "Number of iterations must be greater than zero");
                    }
                    SaltGenerator saltGenerator = this.config.getSaltGenerator();
                    String providerName = this.config.getProviderName();
                    if (providerName != null) {
                        CommonUtils.validateNotEmpty(providerName, "Provider name cannot be empty");
                    }
                    Provider provider = this.config.getProvider();
                    Boolean invertPositionOfSaltInMessageBeforeDigesting = this.config.getInvertPositionOfSaltInMessageBeforeDigesting();
                    Boolean invertPositionOfPlainSaltInEncryptionResults = this.config.getInvertPositionOfPlainSaltInEncryptionResults();
                    Boolean useLenientSaltSizeCheck = this.config.getUseLenientSaltSizeCheck();
                    if (this.algorithmSet || algorithm == null) {
                        algorithm = this.algorithm;
                    }
                    this.algorithm = algorithm;
                    this.saltSizeBytes = (this.saltSizeBytesSet || saltSizeBytes == null) ? this.saltSizeBytes : saltSizeBytes.intValue();
                    this.iterations = (this.iterationsSet || iterations == null) ? this.iterations : iterations.intValue();
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
                    this.invertPositionOfSaltInMessageBeforeDigesting = (this.invertPositionOfSaltInMessageBeforeDigestingSet || invertPositionOfSaltInMessageBeforeDigesting == null) ? this.invertPositionOfSaltInMessageBeforeDigesting : invertPositionOfSaltInMessageBeforeDigesting.booleanValue();
                    this.invertPositionOfPlainSaltInEncryptionResults = (this.invertPositionOfPlainSaltInEncryptionResultsSet || invertPositionOfPlainSaltInEncryptionResults == null) ? this.invertPositionOfPlainSaltInEncryptionResults : invertPositionOfPlainSaltInEncryptionResults.booleanValue();
                    this.useLenientSaltSizeCheck = (this.useLenientSaltSizeCheckSet || useLenientSaltSizeCheck == null) ? this.useLenientSaltSizeCheck : useLenientSaltSizeCheck.booleanValue();
                }
                if (this.saltGenerator == null) {
                    this.saltGenerator = new RandomSaltGenerator();
                }
                if (this.useLenientSaltSizeCheck && !this.saltGenerator.includePlainSaltInEncryptionResults()) {
                    StringBuffer stringBuffer = new StringBuffer("The configured Salt Generator (");
                    stringBuffer.append(this.saltGenerator.getClass().getName());
                    stringBuffer.append(") does not include plain salt in encryption results, which is not compatiblewith setting the salt size checking behaviour to \"lenient\".");
                    throw new EncryptionInitializationException(stringBuffer.toString());
                }
                Provider provider2 = this.provider;
                if (provider2 != null) {
                    this.md = MessageDigest.getInstance(this.algorithm, provider2);
                } else {
                    String str = this.providerName;
                    if (str != null) {
                        this.md = MessageDigest.getInstance(this.algorithm, str);
                    } else {
                        this.md = MessageDigest.getInstance(this.algorithm);
                    }
                }
                int digestLength = this.md.getDigestLength();
                this.digestLengthBytes = digestLength;
                if (digestLength <= 0) {
                    StringBuffer stringBuffer2 = new StringBuffer("The configured algorithm (");
                    stringBuffer2.append(this.algorithm);
                    stringBuffer2.append(") or its provider do  not allow knowing the digest length beforehand (getDigestLength() operation), which is not compatiblewith setting the salt size checking behaviour to \"lenient\".");
                    throw new EncryptionInitializationException(stringBuffer2.toString());
                }
                this.initialized = true;
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new EncryptionInitializationException(e10);
        } catch (NoSuchProviderException e11) {
            throw new EncryptionInitializationException(e11);
        } finally {
        }
    }

    public boolean isInitialized() {
        return this.initialized;
    }

    @Override // org.jasypt.digest.ByteDigester
    public boolean matches(byte[] bArr, byte[] bArr2) {
        byte[] bArrGenerateSalt;
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null) {
            return false;
        }
        if (!isInitialized()) {
            initialize();
        }
        try {
            if (!this.useSalt) {
                bArrGenerateSalt = null;
            } else if (this.saltGenerator.includePlainSaltInEncryptionResults()) {
                int length = this.saltSizeBytes;
                int i10 = this.digestLengthBytes;
                if (i10 > 0) {
                    if (this.useLenientSaltSizeCheck) {
                        if (bArr2.length < i10) {
                            throw new EncryptionOperationNotPossibleException();
                        }
                        length = bArr2.length - i10;
                    } else if (bArr2.length != i10 + length) {
                        throw new EncryptionOperationNotPossibleException();
                    }
                } else if (bArr2.length < length) {
                    throw new EncryptionOperationNotPossibleException();
                }
                if (this.invertPositionOfPlainSaltInEncryptionResults) {
                    bArrGenerateSalt = new byte[length];
                    System.arraycopy(bArr2, bArr2.length - length, bArrGenerateSalt, 0, length);
                } else {
                    bArrGenerateSalt = new byte[length];
                    System.arraycopy(bArr2, 0, bArrGenerateSalt, 0, length);
                }
            } else {
                bArrGenerateSalt = this.saltGenerator.generateSalt(this.saltSizeBytes);
            }
            return digestsAreEqual(digest(bArr, bArrGenerateSalt), bArr2);
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }

    public synchronized void setAlgorithm(String str) {
        CommonUtils.validateNotEmpty(str, "Algorithm cannot be empty");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.algorithm = str;
        this.algorithmSet = true;
    }

    public synchronized void setConfig(DigesterConfig digesterConfig) {
        CommonUtils.validateNotNull(digesterConfig, "Config cannot be set null");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.config = digesterConfig;
    }

    public synchronized void setInvertPositionOfPlainSaltInEncryptionResults(boolean z9) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.invertPositionOfPlainSaltInEncryptionResults = z9;
        this.invertPositionOfPlainSaltInEncryptionResultsSet = true;
    }

    public synchronized void setInvertPositionOfSaltInMessageBeforeDigesting(boolean z9) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.invertPositionOfSaltInMessageBeforeDigesting = z9;
        this.invertPositionOfSaltInMessageBeforeDigestingSet = true;
    }

    public synchronized void setIterations(int i10) {
        CommonUtils.validateIsTrue(i10 > 0, "Number of iterations must be greater than zero");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.iterations = i10;
        this.iterationsSet = true;
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

    public synchronized void setSaltSizeBytes(int i10) {
        CommonUtils.validateIsTrue(i10 >= 0, "Salt size in bytes must be non-negative");
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.saltSizeBytes = i10;
        this.useSalt = i10 > 0;
        this.saltSizeBytesSet = true;
    }

    public synchronized void setUseLenientSaltSizeCheck(boolean z9) {
        if (isInitialized()) {
            throw new AlreadyInitializedException();
        }
        this.useLenientSaltSizeCheck = z9;
        this.useLenientSaltSizeCheckSet = true;
    }

    private byte[] digest(byte[] bArr, byte[] bArr2) {
        byte[] bArrDigest;
        try {
            synchronized (this.md) {
                try {
                    this.md.reset();
                    if (bArr2 == null) {
                        this.md.update(bArr);
                    } else if (!this.invertPositionOfSaltInMessageBeforeDigesting) {
                        this.md.update(bArr2);
                        this.md.update(bArr);
                    } else {
                        this.md.update(bArr);
                        this.md.update(bArr2);
                    }
                    bArrDigest = this.md.digest();
                    for (int i10 = 0; i10 < this.iterations - 1; i10++) {
                        this.md.reset();
                        bArrDigest = this.md.digest(bArrDigest);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!this.saltGenerator.includePlainSaltInEncryptionResults() || bArr2 == null) {
                return bArrDigest;
            }
            if (!this.invertPositionOfPlainSaltInEncryptionResults) {
                return CommonUtils.appendArrays(bArr2, bArrDigest);
            }
            return CommonUtils.appendArrays(bArrDigest, bArr2);
        } catch (Exception unused) {
            throw new EncryptionOperationNotPossibleException();
        }
    }
}
