package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class cb1 implements a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ob1 f3248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k31 f3249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3251d;

    public cb1(ab1 ab1Var, rb1 rb1Var, int i10, byte[] bArr) {
        this.f3248a = ab1Var;
        this.f3249b = rb1Var;
        this.f3250c = i10;
        this.f3251d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f3251d;
        int length = bArr3.length;
        int length2 = bArr.length;
        int i10 = this.f3250c;
        if (length2 < length + i10) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!n71.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int i11 = length2 - i10;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr3.length, i11);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, i11, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrZ = tc1.z(bArr2, bArrCopyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8));
        rb1 rb1Var = (rb1) this.f3249b;
        byte[] bArr4 = rb1Var.f8571d;
        int length3 = bArr4.length;
        int i12 = rb1Var.f8569b;
        j81 j81Var = rb1Var.f8568a;
        byte[] bArr5 = rb1Var.f8570c;
        if (!MessageDigest.isEqual(length3 > 0 ? tc1.z(bArr5, j81Var.a(tc1.z(bArrZ, bArr4), i12)) : tc1.z(bArr5, j81Var.a(bArrZ, i12)), bArrCopyOfRange2)) {
            throw new GeneralSecurityException("invalid MAC");
        }
        ab1 ab1Var = (ab1) this.f3248a;
        ab1Var.getClass();
        int length4 = bArrCopyOfRange.length;
        int i13 = ab1Var.f2634b;
        if (length4 < i13) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr6 = new byte[i13];
        System.arraycopy(bArrCopyOfRange, 0, bArr6, 0, i13);
        int i14 = ab1Var.f2634b;
        int i15 = length4 - i14;
        byte[] bArr7 = new byte[i15];
        Cipher cipher = (Cipher) ab1.f2632d.get();
        byte[] bArr8 = new byte[ab1Var.f2635c];
        System.arraycopy(bArr6, 0, bArr8, 0, i13);
        cipher.init(2, ab1Var.f2633a, new IvParameterSpec(bArr8));
        if (cipher.doFinal(bArrCopyOfRange, i14, i15, bArr7, 0) == i15) {
            return bArr7;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
