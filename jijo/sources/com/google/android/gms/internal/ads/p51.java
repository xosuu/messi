package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class p51 implements a31 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f7805c = tp1.Q("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f7806d = tp1.Q("070000004041424344454647");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f7807e = tp1.Q("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b4.h f7808f = new b4.h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f7809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f7810b;

    public p51(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!tp1.N(1)) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (f7808f.get() == null) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f7809a = new SecretKeySpec(bArr, "ChaCha20");
        this.f7810b = bArr2;
    }

    public static boolean b(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f7806d);
            byte[] bArr = f7805c;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f7807e;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f7810b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!n71.c(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, bArr3.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = (Cipher) f7808f.get();
        cipher.init(2, this.f7809a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        return cipher.doFinal(bArr, bArr3.length + 12, (length - r8) - 12);
    }
}
