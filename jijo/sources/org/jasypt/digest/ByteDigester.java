package org.jasypt.digest;

/* JADX INFO: loaded from: classes.dex */
public interface ByteDigester {
    byte[] digest(byte[] bArr);

    boolean matches(byte[] bArr, byte[] bArr2);
}
