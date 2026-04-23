package com.google.android.gms.internal.ads;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class f3 implements z0, qd1, qx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f3 f4360a = new f3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f3 f4361b = new f3();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f3 f4362d = new f3();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f4363f = {61, 122, 18, 35, 1, -102, -93, -99, -98, -96, -29, 67, 106, -73, -64, -119, 107, -5, 79, -74, 121, -12, -34, 95, -25, -62, 63, 50, 108, -113, -103, 74};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f4364h = {-110, -13, -34, 70, -83, 43, 97, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, 102, -69, 116, -121, -79, 43, -13, 120, 58, 55, -29, -108, 95, 83};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f3 f4365q = new f3();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final f3 f4366s = new f3();

    public static boolean a(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] x509CertificateArrL = y3.c.l(file.getAbsolutePath());
            if (x509CertificateArrL.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(x509CertificateArrL[0][0].getEncoded());
            if (Arrays.equals(f4363f, bArrDigest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(f4364h, bArrDigest);
        } catch (zzaok e10) {
            throw new GeneralSecurityException("Package is not signed", e10);
        } catch (IOException e11) {
            e = e11;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e12) {
            e = e12;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.qd1
    public pd1 j(Class cls) {
        if (!wc1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (pd1) wc1.p(cls.asSubclass(wc1.class)).x(3, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.qd1
    public boolean n(Class cls) {
        return wc1.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public Object mo3zza() {
        int i10 = sq1.f8957a;
        try {
            Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
            Object objInvoke = cls.getMethod("build", new Class[0]).invoke(cls.getConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]);
            objInvoke.getClass();
            return (c00) objInvoke;
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}
