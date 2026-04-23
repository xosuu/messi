package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public abstract class u51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9383b;

    public u51(byte[] bArr, int i10) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f9382a = r51.d(bArr);
        this.f9383b = i10;
    }

    public final ByteBuffer a(byte[] bArr, int i10) {
        int[] iArr;
        int[] iArrD = r51.d(bArr);
        t51 t51Var = (t51) this;
        int[] iArr2 = t51Var.f9382a;
        switch (t51Var.f9056c) {
            case 0:
                int length = iArrD.length;
                if (length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
                }
                iArr = new int[16];
                int[] iArr3 = r51.f8419a;
                System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
                System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
                iArr[12] = i10;
                System.arraycopy(iArrD, 0, iArr, 13, 3);
                break;
                break;
            default:
                int length2 = iArrD.length;
                if (length2 != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length2 * 32)));
                }
                iArr = new int[16];
                int[] iArrC = r51.c(iArr2, iArrD);
                int[] iArr4 = r51.f8419a;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                System.arraycopy(iArrC, 0, iArr, iArr4.length, 8);
                iArr[12] = i10;
                iArr[13] = 0;
                iArr[14] = iArrD[4];
                iArr[15] = iArrD[5];
                break;
                break;
        }
        int[] iArr5 = (int[]) iArr.clone();
        r51.b(iArr5);
        for (int i11 = 0; i11 < 16; i11++) {
            iArr[i11] = iArr[i11] + iArr5[i11];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArr, 0, 16);
        return byteBufferOrder;
    }
}
