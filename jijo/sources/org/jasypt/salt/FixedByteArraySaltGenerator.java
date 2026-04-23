package org.jasypt.salt;

import org.jasypt.commons.CommonUtils;
import org.jasypt.exceptions.EncryptionInitializationException;

/* JADX INFO: loaded from: classes.dex */
public class FixedByteArraySaltGenerator implements SaltGenerator {
    private byte[] salt = null;

    @Override // org.jasypt.salt.SaltGenerator
    public byte[] generateSalt(int i10) {
        byte[] bArr = this.salt;
        if (bArr == null) {
            throw new EncryptionInitializationException("Salt has not been set");
        }
        if (bArr.length < i10) {
            throw new EncryptionInitializationException("Requested salt larger than set");
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    @Override // org.jasypt.salt.SaltGenerator
    public boolean includePlainSaltInEncryptionResults() {
        return false;
    }

    public synchronized void setSalt(byte[] bArr) {
        CommonUtils.validateNotNull(bArr, "Salt cannot be set null");
        this.salt = (byte[]) bArr.clone();
    }
}
