package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class pb1 implements j81 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b4.h f7848f = new b4.h(9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f7849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f7850b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7851d;

    public pb1(byte[] bArr) throws GeneralSecurityException {
        sb1.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f7849a = secretKeySpec;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f7848f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrY = en1.Y(cipher.doFinal(new byte[16]));
        this.f7850b = bArrY;
        this.f7851d = en1.Y(bArrY);
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final byte[] a(byte[] bArr, int i10) throws GeneralSecurityException {
        byte[] bArrM;
        if (i10 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKeySpec secretKeySpec = this.f7849a;
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        Cipher cipher = (Cipher) f7848f.get();
        cipher.init(1, secretKeySpec);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        int i11 = iMax - 1;
        int i12 = i11 * 16;
        if (iMax * 16 == length) {
            bArrM = tc1.M(i12, 0, 16, bArr, this.f7850b);
        } else {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i12, length);
            int length2 = bArrCopyOfRange.length;
            if (length2 >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArrCopyOfRange, 16);
            bArrCopyOf[length2] = -128;
            int length3 = bArrCopyOf.length;
            byte[] bArr2 = this.f7851d;
            if (length3 != bArr2.length) {
                throw new IllegalArgumentException("The lengths of x and y should match.");
            }
            bArrM = tc1.M(0, 0, length3, bArrCopyOf, bArr2);
        }
        byte[] bArrDoFinal = new byte[16];
        for (int i13 = 0; i13 < i11; i13++) {
            bArrDoFinal = cipher.doFinal(tc1.M(0, i13 * 16, 16, bArrDoFinal, bArr));
        }
        int length4 = bArrM.length;
        if (length4 == bArrDoFinal.length) {
            return Arrays.copyOf(cipher.doFinal(tc1.M(0, 0, length4, bArrM, bArrDoFinal)), i10);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }
}
