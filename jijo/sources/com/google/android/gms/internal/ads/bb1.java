package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class bb1 implements a31 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b4.h f2956f = new b4.h(7);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b4.h f2957g = new b4.h(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f2958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f2960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecretKeySpec f2961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2962e;

    public bb1(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f2962e = i10;
        sb1.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f2961d = secretKeySpec;
        Cipher cipher = (Cipher) f2956f.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f2958a = bArrB;
        this.f2959b = b(bArrB);
        this.f2960c = bArr2;
    }

    public static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            byte b10 = bArr[i10];
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((b10 + b10) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f2960c;
        if (bArr3.length == 0) {
            return d(bArr, bArr2);
        }
        if (!n71.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return d(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
    }

    public final byte[] c(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        int length;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        byte[] bArr3 = this.f2958a;
        if (i12 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        int i14 = 0;
        while (i12 - i14 > 16) {
            for (int i15 = 0; i15 < 16; i15++) {
                bArrDoFinal[i15] = (byte) (bArr[(i11 + i14) + i15] ^ bArrDoFinal[i15]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i14 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i14 + i11, i11 + i12);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = e(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f2959b, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i13 >= length) {
                    break;
                }
                bArrCopyOf[i13] = (byte) (bArrCopyOf[i13] ^ bArrCopyOfRange[i13]);
                i13++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
        }
        return cipher.doFinal(e(bArrDoFinal, bArrCopyOf));
    }

    public final byte[] d(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f2962e;
        int i11 = (length - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f2956f.get();
        SecretKeySpec secretKeySpec = this.f2961d;
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher, 0, bArr, 0, this.f2962e);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrC2 = c(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrC3 = c(cipher, 2, bArr, this.f2962e, i11);
        int i12 = length - 16;
        byte b10 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            b10 = (byte) (b10 | (((bArr[i12 + i13] ^ bArrC2[i13]) ^ bArrC[i13]) ^ bArrC3[i13]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f2957g.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrC));
        return cipher2.doFinal(bArr, i10, i11);
    }
}
