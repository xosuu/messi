package org.jasypt.salt;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class ZeroSaltGenerator implements SaltGenerator {
    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i10) {
        byte[] bArr = new byte[i10];
        Arrays.fill(bArr, (byte) 0);
        return bArr;
    }

    @Override // org.jasypt.salt.SaltGenerator
    public boolean includePlainSaltInEncryptionResults() {
        return false;
    }
}
