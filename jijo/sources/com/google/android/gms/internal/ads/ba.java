package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class ba {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Cipher f2942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f2943b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f2944c = new Object();

    public static String a(byte[] bArr, byte[] bArr2) throws zzaut {
        byte[] bArrDoFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f2943b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                bArrDoFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = bArrDoFinal.length + iv.length;
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(iv).put(bArrDoFinal);
            byteBufferAllocate.flip();
            byte[] bArr3 = new byte[length2];
            byteBufferAllocate.get(bArr3);
            return Base64.encodeToString(bArr3, 2);
        } catch (InvalidKeyException e10) {
            throw new zzaut(e10);
        } catch (NoSuchAlgorithmException e11) {
            throw new zzaut(e11);
        } catch (BadPaddingException e12) {
            throw new zzaut(e12);
        } catch (IllegalBlockSizeException e13) {
            throw new zzaut(e13);
        } catch (NoSuchPaddingException e14) {
            throw new zzaut(e14);
        }
    }

    public static byte[] b(String str, byte[] bArr) throws zzaut {
        byte[] bArrDoFinal;
        int length = bArr.length;
        try {
            byte[] bArrDecode = Base64.decode(str, 2);
            if (bArrDecode.length == 0 && str.length() > 0) {
                throw new IllegalArgumentException("Unable to decode ".concat(str));
            }
            int length2 = bArrDecode.length;
            if (length2 <= 16) {
                throw new zzaut();
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
            byteBufferAllocate.put(bArrDecode);
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            byteBufferAllocate.get(bArr2);
            byteBufferAllocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f2943b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                bArrDoFinal = c().doFinal(bArr3);
            }
            return bArrDoFinal;
        } catch (IllegalArgumentException e10) {
            throw new zzaut(e10);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new zzaut(e11);
        } catch (InvalidKeyException e12) {
            throw new zzaut(e12);
        } catch (NoSuchAlgorithmException e13) {
            throw new zzaut(e13);
        } catch (BadPaddingException e14) {
            throw new zzaut(e14);
        } catch (IllegalBlockSizeException e15) {
            throw new zzaut(e15);
        } catch (NoSuchPaddingException e16) {
            throw new zzaut(e16);
        }
    }

    public static final Cipher c() {
        Cipher cipher;
        synchronized (f2944c) {
            try {
                if (f2942a == null) {
                    f2942a = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f2942a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
