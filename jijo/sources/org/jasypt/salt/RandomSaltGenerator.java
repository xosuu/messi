package org.jasypt.salt;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.jasypt.exceptions.EncryptionInitializationException;

/* JADX INFO: loaded from: classes.dex */
public class RandomSaltGenerator implements SaltGenerator {
    public static final String DEFAULT_SECURE_RANDOM_ALGORITHM = "SHA1PRNG";
    private final SecureRandom random;

    public RandomSaltGenerator() {
        this(DEFAULT_SECURE_RANDOM_ALGORITHM);
    }

    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i10) {
        byte[] bArr = new byte[i10];
        synchronized (this.random) {
            this.random.nextBytes(bArr);
        }
        return bArr;
    }

    @Override // org.jasypt.salt.SaltGenerator
    public boolean includePlainSaltInEncryptionResults() {
        return true;
    }

    public RandomSaltGenerator(String str) {
        try {
            this.random = SecureRandom.getInstance(str);
        } catch (NoSuchAlgorithmException e10) {
            throw new EncryptionInitializationException(e10);
        }
    }
}
