package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class x51 implements a31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f10442c = tp1.Q("7a806c");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f10443d = tp1.Q("46bb91c3c5");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f10444e = tp1.Q("36864200e0eaf5284d884a0e77d31646");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f10445f = tp1.Q("bae8e37fc83441b16034566b");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f10446g = tp1.Q("af60eb711bd85bc1e4d3e0a462e074eea428a8");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b4.h f10447h = new b4.h(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f10448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f10449b;

    public x51(byte[] bArr, byte[] bArr2) throws InvalidAlgorithmParameterException {
        this.f10449b = bArr2;
        sb1.a(bArr.length);
        this.f10448a = new SecretKeySpec(bArr, "AES");
    }

    public static boolean b(Cipher cipher) {
        try {
            byte[] bArr = f10445f;
            cipher.init(2, new SecretKeySpec(f10444e, "AES"), new GCMParameterSpec(NotificationCompat.FLAG_HIGH_PRIORITY, bArr, 0, bArr.length));
            cipher.updateAAD(f10443d);
            byte[] bArr2 = f10446g;
            return MessageDigest.isEqual(cipher.doFinal(bArr2, 0, bArr2.length), f10442c);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.f10449b;
        if (bArr3.length == 0) {
            return c(bArr, bArr2);
        }
        if (!n71.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Cipher cipher = (Cipher) f10447h.get();
        if (cipher == null) {
            throw new GeneralSecurityException("AES GCM SIV cipher is not available or is invalid.");
        }
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        cipher.init(2, this.f10448a, new GCMParameterSpec(NotificationCompat.FLAG_HIGH_PRIORITY, bArr, 0, 12));
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, 12, length - 12);
    }
}
