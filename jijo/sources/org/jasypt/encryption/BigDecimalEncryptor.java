package org.jasypt.encryption;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public interface BigDecimalEncryptor {
    BigDecimal decrypt(BigDecimal bigDecimal);

    BigDecimal encrypt(BigDecimal bigDecimal);
}
