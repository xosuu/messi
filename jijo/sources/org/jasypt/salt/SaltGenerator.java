package org.jasypt.salt;

/* JADX INFO: loaded from: classes.dex */
public interface SaltGenerator {
    byte[] generateSalt(int i10);

    boolean includePlainSaltInEncryptionResults();
}
