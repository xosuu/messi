package org.jasypt.util.numeric;

import java.math.BigInteger;
import org.jasypt.encryption.pbe.StandardPBEBigIntegerEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class StrongIntegerNumberEncryptor implements IntegerNumberEncryptor {
    private final StandardPBEBigIntegerEncryptor encryptor;

    public StrongIntegerNumberEncryptor() {
        StandardPBEBigIntegerEncryptor standardPBEBigIntegerEncryptor = new StandardPBEBigIntegerEncryptor();
        this.encryptor = standardPBEBigIntegerEncryptor;
        standardPBEBigIntegerEncryptor.setAlgorithm("PBEWithMD5AndTripleDES");
    }

    @Override // org.jasypt.util.numeric.IntegerNumberEncryptor
    public BigInteger decrypt(BigInteger bigInteger) {
        return this.encryptor.decrypt(bigInteger);
    }

    @Override // org.jasypt.util.numeric.IntegerNumberEncryptor
    public BigInteger encrypt(BigInteger bigInteger) {
        return this.encryptor.encrypt(bigInteger);
    }

    public void setPassword(String str) {
        this.encryptor.setPassword(str);
    }

    public void setPasswordCharArray(char[] cArr) {
        this.encryptor.setPasswordCharArray(cArr);
    }
}
