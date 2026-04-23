package org.jasypt.util.numeric;

import java.math.BigDecimal;
import org.jasypt.encryption.pbe.StandardPBEBigDecimalEncryptor;
import org.jasypt.encryption.pbe.StandardPBEByteEncryptor;

/* JADX INFO: loaded from: classes.dex */
public final class BasicDecimalNumberEncryptor implements DecimalNumberEncryptor {
    private final StandardPBEBigDecimalEncryptor encryptor;

    public BasicDecimalNumberEncryptor() {
        StandardPBEBigDecimalEncryptor standardPBEBigDecimalEncryptor = new StandardPBEBigDecimalEncryptor();
        this.encryptor = standardPBEBigDecimalEncryptor;
        standardPBEBigDecimalEncryptor.setAlgorithm(StandardPBEByteEncryptor.DEFAULT_ALGORITHM);
    }

    @Override // org.jasypt.util.numeric.DecimalNumberEncryptor
    public BigDecimal decrypt(BigDecimal bigDecimal) {
        return this.encryptor.decrypt(bigDecimal);
    }

    @Override // org.jasypt.util.numeric.DecimalNumberEncryptor
    public BigDecimal encrypt(BigDecimal bigDecimal) {
        return this.encryptor.encrypt(bigDecimal);
    }

    public void setPassword(String str) {
        this.encryptor.setPassword(str);
    }

    public void setPasswordCharArray(char[] cArr) {
        this.encryptor.setPasswordCharArray(cArr);
    }
}
