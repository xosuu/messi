package org.jasypt.exceptions;

/* JADX INFO: loaded from: classes.dex */
public final class EncryptionInitializationException extends RuntimeException {
    private static final long serialVersionUID = 8929638240023639778L;

    public EncryptionInitializationException() {
    }

    public EncryptionInitializationException(Throwable th) {
        super(th);
    }

    public EncryptionInitializationException(String str, Throwable th) {
        super(str, th);
    }

    public EncryptionInitializationException(String str) {
        super(str);
    }
}
