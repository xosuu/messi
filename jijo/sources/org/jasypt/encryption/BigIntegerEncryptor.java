package org.jasypt.encryption;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public interface BigIntegerEncryptor {
    BigInteger decrypt(BigInteger bigInteger);

    BigInteger encrypt(BigInteger bigInteger);
}
