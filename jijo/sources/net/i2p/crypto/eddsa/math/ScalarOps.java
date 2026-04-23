package net.i2p.crypto.eddsa.math;

/* JADX INFO: loaded from: classes.dex */
public interface ScalarOps {
    byte[] multiplyAndAdd(byte[] bArr, byte[] bArr2, byte[] bArr3);

    byte[] reduce(byte[] bArr);
}
