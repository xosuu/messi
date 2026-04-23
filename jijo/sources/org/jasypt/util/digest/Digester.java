package org.jasypt.util.digest;

import java.security.Provider;
import org.jasypt.digest.StandardByteDigester;

/* JADX INFO: loaded from: classes.dex */
public final class Digester {
    public static final String DEFAULT_ALGORITHM = "MD5";
    private static final int ITERATIONS = 1;
    private static final int SALT_SIZE_BYTES = 0;
    private final StandardByteDigester digester;

    public Digester() {
        StandardByteDigester standardByteDigester = new StandardByteDigester();
        this.digester = standardByteDigester;
        standardByteDigester.setIterations(1);
        standardByteDigester.setSaltSizeBytes(0);
    }

    public byte[] digest(byte[] bArr) {
        return this.digester.digest(bArr);
    }

    public void setAlgorithm(String str) {
        this.digester.setAlgorithm(str);
    }

    public void setProvider(Provider provider) {
        this.digester.setProvider(provider);
    }

    public void setProviderName(String str) {
        this.digester.setProviderName(str);
    }

    public Digester(String str) {
        StandardByteDigester standardByteDigester = new StandardByteDigester();
        this.digester = standardByteDigester;
        standardByteDigester.setIterations(1);
        standardByteDigester.setSaltSizeBytes(0);
        standardByteDigester.setAlgorithm(str);
    }

    public Digester(String str, String str2) {
        StandardByteDigester standardByteDigester = new StandardByteDigester();
        this.digester = standardByteDigester;
        standardByteDigester.setIterations(1);
        standardByteDigester.setSaltSizeBytes(0);
        standardByteDigester.setAlgorithm(str);
        standardByteDigester.setProviderName(str2);
    }

    public Digester(String str, Provider provider) {
        StandardByteDigester standardByteDigester = new StandardByteDigester();
        this.digester = standardByteDigester;
        standardByteDigester.setIterations(1);
        standardByteDigester.setSaltSizeBytes(0);
        standardByteDigester.setAlgorithm(str);
        standardByteDigester.setProvider(provider);
    }
}
