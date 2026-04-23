package com.google.android.gms.internal.ads;

import android.util.Base64;
import androidx.core.app.NotificationCompat;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.jasypt.digest.StandardStringDigester;

/* JADX INFO: loaded from: classes.dex */
public abstract class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f6537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static MessageDigest f6538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f6539c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f6540d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CountDownLatch f6541e = new CountDownLatch(1);

    public static String a(String str, byte[] bArr) {
        byte[] bArrD;
        int length = bArr.length;
        Vector vector = null;
        if (length > 0) {
            int i10 = length + 254;
            Vector vector2 = new Vector();
            for (int i11 = 0; i11 < i10 / 255; i11++) {
                int i12 = i11 * 255;
                try {
                    int length2 = bArr.length;
                    if (length2 - i12 > 255) {
                        length2 = i12 + 255;
                    }
                    vector2.add(Arrays.copyOfRange(bArr, i12, length2));
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            vector = vector2;
        }
        if (vector == null || vector.isEmpty()) {
            j8 j8VarA0 = x8.a0();
            j8VarA0.d();
            x8.K0((x8) j8VarA0.f9462b, 4096L);
            bArrD = d(((x8) j8VarA0.b()).d(), str, true);
        } else {
            g9 g9VarA = h9.A();
            int size = vector.size();
            for (int i13 = 0; i13 < size; i13++) {
                cc1 cc1VarQ = ec1.q(0, d((byte[]) vector.get(i13), str, false), NotificationCompat.FLAG_LOCAL_ONLY);
                g9VarA.d();
                h9.B((h9) g9VarA.f9462b, cc1VarQ);
            }
            byte[] bArrC = c(bArr);
            cc1 cc1Var = ec1.f3903b;
            cc1 cc1VarQ2 = ec1.q(0, bArrC, bArrC.length);
            g9VarA.d();
            h9.C((h9) g9VarA.f9462b, cc1VarQ2);
            bArrD = ((h9) g9VarA.b()).d();
        }
        return Base64.encodeToString(bArrD, 11);
    }

    public static void b() {
        synchronized (f6540d) {
            try {
                if (!f6537a) {
                    f6537a = true;
                    new Thread(new k9(0, 0)).start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArrDigest;
        MessageDigest messageDigest;
        synchronized (f6539c) {
            try {
                b();
                MessageDigest messageDigest2 = null;
                try {
                    if (f6541e.await(2L, TimeUnit.SECONDS) && (messageDigest = f6538b) != null) {
                        messageDigest2 = messageDigest;
                    }
                } catch (InterruptedException unused) {
                }
                if (messageDigest2 == null) {
                    throw new NoSuchAlgorithmException("Cannot compute hash");
                }
                messageDigest2.reset();
                messageDigest2.update(bArr);
                bArrDigest = f6538b.digest();
            } finally {
            }
        }
        return bArrDigest;
    }

    public static byte[] d(byte[] bArr, String str, boolean z9) {
        byte[] bArrArray;
        int length = bArr.length;
        int i10 = true != z9 ? 255 : 239;
        if (length > i10) {
            j8 j8VarA0 = x8.a0();
            j8VarA0.d();
            x8.K0((x8) j8VarA0.f9462b, 4096L);
            bArr = ((x8) j8VarA0.b()).d();
        }
        int i11 = i10 + 1;
        int length2 = bArr.length;
        byte b10 = (byte) length2;
        if (length2 < i10) {
            byte[] bArr2 = new byte[i10 - length2];
            new SecureRandom().nextBytes(bArr2);
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).put(bArr2).array();
        } else {
            bArrArray = ByteBuffer.allocate(i11).put(b10).put(bArr).array();
        }
        if (z9) {
            bArrArray = ByteBuffer.allocate(NotificationCompat.FLAG_LOCAL_ONLY).put(c(bArrArray)).put(bArrArray).array();
        }
        byte[] bArr3 = new byte[NotificationCompat.FLAG_LOCAL_ONLY];
        m9[] m9VarArr = new r9().G2;
        int length3 = m9VarArr.length;
        for (int i12 = 0; i12 < 12; i12++) {
            m9VarArr[i12].a(bArrArray, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            i2 i2Var = new i2(str.getBytes(StandardStringDigester.MESSAGE_CHARSET), 0);
            int i13 = i2Var.f5459b;
            int i14 = i2Var.f5460c;
            for (int i15 = 0; i15 < 256; i15++) {
                byte[] bArr4 = i2Var.f5458a;
                i13 = (i13 + 1) & 255;
                byte b11 = bArr4[i13];
                i14 = (i14 + b11) & 255;
                bArr4[i13] = bArr4[i14];
                bArr4[i14] = b11;
                bArr3[i15] = (byte) (bArr4[(bArr4[i13] + b11) & 255] ^ bArr3[i15]);
            }
            i2Var.f5459b = i13;
            i2Var.f5460c = i14;
        }
        return bArr3;
    }
}
