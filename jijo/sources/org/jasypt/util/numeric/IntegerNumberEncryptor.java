package org.jasypt.util.numeric;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public interface IntegerNumberEncryptor {
    BigInteger decrypt(BigInteger bigInteger);

    BigInteger encrypt(BigInteger bigInteger);
}
