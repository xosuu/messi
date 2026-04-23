package org.jasypt.util.numeric;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public interface DecimalNumberEncryptor {
    BigDecimal decrypt(BigDecimal bigDecimal);

    BigDecimal encrypt(BigDecimal bigDecimal);
}
