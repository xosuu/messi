package com.google.android.gms.internal.ads;

import android.os.Build;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class v51 implements a31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f9787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9788c;

    public v51(a31 a31Var, byte[] bArr) {
        this.f9786a = 0;
        this.f9788c = a31Var;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.f9787b = bArr;
    }

    @Override // com.google.android.gms.internal.ads.a31
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i10 = this.f9786a;
        Object obj = this.f9788c;
        byte[] bArr3 = this.f9787b;
        switch (i10) {
            case 0:
                if (bArr3.length == 0) {
                    return ((a31) obj).a(bArr, bArr2);
                }
                if (n71.c(bArr3, bArr)) {
                    return ((a31) obj).a(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("wrong prefix");
            case 1:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                byte[] bArr4 = (byte[]) obj;
                if (bArr.length < bArr4.length + 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!n71.c(bArr4, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                byte[] bArr5 = new byte[24];
                System.arraycopy(bArr, bArr4.length, bArr5, 0, 24);
                int[] iArrC = r51.c(r51.d(bArr3), r51.d(bArr5));
                ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrC.length * 4).order(ByteOrder.LITTLE_ENDIAN);
                byteBufferOrder.asIntBuffer().put(iArrC);
                SecretKeySpec secretKeySpec = new SecretKeySpec(byteBufferOrder.array(), "ChaCha20");
                byte[] bArr6 = new byte[12];
                System.arraycopy(bArr5, 16, bArr6, 4, 8);
                IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr6);
                Cipher cipher = (Cipher) p51.f7808f.get();
                cipher.init(2, secretKeySpec, ivParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher.updateAAD(bArr2);
                }
                return cipher.doFinal(bArr, bArr4.length + 24, (r0 - r12) - 24);
            case 2:
                if (bArr == null) {
                    throw new NullPointerException("ciphertext is null");
                }
                if (bArr.length < bArr3.length + 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (!n71.c(bArr3, bArr)) {
                    throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
                }
                byte[] bArr7 = new byte[12];
                System.arraycopy(bArr, bArr3.length, bArr7, 0, 12);
                b4.h hVar = s51.f8802a;
                Integer numValueOf = !Objects.equals(System.getProperty("java.vendor"), "The Android Project") ? null : Integer.valueOf(Build.VERSION.SDK_INT);
                if (numValueOf != null) {
                    numValueOf.intValue();
                }
                GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(NotificationCompat.FLAG_HIGH_PRIORITY, bArr7, 0, 12);
                Cipher cipher2 = (Cipher) s51.f8802a.get();
                cipher2.init(2, (SecretKey) obj, gCMParameterSpec);
                if (bArr2 != null && bArr2.length != 0) {
                    cipher2.updateAAD(bArr2);
                }
                return cipher2.doFinal(bArr, bArr3.length + 12, (r0 - r12) - 12);
            case 3:
                if (bArr3.length == 0) {
                    return b(bArr, bArr2);
                }
                if (n71.c(bArr3, bArr)) {
                    return b(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
            default:
                if (bArr3.length == 0) {
                    return c(bArr, bArr2);
                }
                if (n71.c(bArr3, bArr)) {
                    return c(Arrays.copyOfRange(bArr, bArr3.length, bArr.length), bArr2);
                }
                throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
    }

    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((eh0) this.f9788c).j(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        return ((eh0) this.f9788c).j(ByteBuffer.wrap(bArr, 24, length - 24), Arrays.copyOf(bArr, 24), bArr2);
    }

    public v51(byte[] bArr, tb1 tb1Var) throws GeneralSecurityException {
        this.f9786a = 2;
        if (!tp1.N(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        sb1.a(bArr.length);
        this.f9788c = new SecretKeySpec(bArr, "AES");
        this.f9787b = tb1Var.b();
    }

    public v51(byte[] bArr, byte[] bArr2, int i10) throws GeneralSecurityException {
        this.f9786a = i10;
        if (i10 == 3) {
            this.f9788c = new eh0(bArr, 0);
            this.f9787b = bArr2;
            return;
        }
        int i11 = 1;
        if (i10 == 4) {
            this.f9788c = new eh0(bArr, i11);
            this.f9787b = bArr2;
        } else {
            if (tp1.N(1)) {
                if (((Cipher) p51.f7808f.get()) != null) {
                    if (bArr.length != 32) {
                        throw new InvalidKeyException("The key length in bytes must be 32.");
                    }
                    this.f9787b = bArr;
                    this.f9788c = bArr2;
                    return;
                }
                throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
            }
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
    }
}
