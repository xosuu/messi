package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends ib {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final jb f9092i = new jb();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f9093h;

    public ta(ja jaVar, j8 j8Var, int i10, Context context) {
        super(jaVar, "iz9pI8M74OdFMOjBXhk6CVKK/c29GtinDT3TfbuphLdYOSnoV+Rg8WuW9whaa7rD", "AMztxBQmasdCMrU1nlH2RhtlfSPsjcYFxTHFmKvCDYM=", j8Var, i10, 27);
        this.f9093h = context;
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        int i10;
        j9 j9Var;
        AtomicReference atomicReferenceA = f9092i.a(this.f9093h.getPackageName());
        synchronized (atomicReferenceA) {
            try {
                j9 j9Var2 = (j9) atomicReferenceA.get();
                if (j9Var2 == null || la.b(j9Var2.f5826a) || j9Var2.f5826a.equals("E") || j9Var2.f5826a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (la.b(null)) {
                        (!la.b(null) ? Boolean.FALSE : Boolean.FALSE).booleanValue();
                        i10 = 3;
                    } else {
                        i10 = 5;
                    }
                    Boolean boolValueOf = Boolean.valueOf(i10 == 3);
                    Boolean bool = (Boolean) zzba.zzc().a(eg.f4014h2);
                    String strC = ((Boolean) zzba.zzc().a(eg.f4003g2)).booleanValue() ? c() : null;
                    if (bool.booleanValue() && this.f5552a.f5863n && la.b(strC)) {
                        strC = d();
                    }
                    j9 j9Var3 = new j9((String) this.f5556e.invoke(null, this.f9093h, boolValueOf, strC));
                    if (la.b(j9Var3.f5826a) || j9Var3.f5826a.equals("E")) {
                        int i11 = i10 - 1;
                        if (i11 == 3) {
                            String strD = d();
                            if (!la.b(strD)) {
                                j9Var3.f5826a = strD;
                            }
                        } else if (i11 == 4) {
                            throw null;
                        }
                    }
                    atomicReferenceA.set(j9Var3);
                }
                j9Var = (j9) atomicReferenceA.get();
            } finally {
            }
        }
        synchronized (this.f5555d) {
            if (j9Var != null) {
                try {
                    j8 j8Var = this.f5555d;
                    String str = j9Var.f5826a;
                    j8Var.d();
                    x8.N0((x8) j8Var.f9462b, str);
                    j8 j8Var2 = this.f5555d;
                    long j10 = j9Var.f5827b;
                    j8Var2.d();
                    x8.C((x8) j8Var2.f9462b, j10);
                    j8 j8Var3 = this.f5555d;
                    String str2 = j9Var.f5828c;
                    j8Var3.d();
                    x8.B((x8) j8Var3.f9462b, str2);
                    j8 j8Var4 = this.f5555d;
                    String str3 = j9Var.f5829d;
                    j8Var4.d();
                    x8.L((x8) j8Var4.f9462b, str3);
                    j8 j8Var5 = this.f5555d;
                    String str4 = j9Var.f5830e;
                    j8Var5.d();
                    x8.M((x8) j8Var5.f9462b, str4);
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.kb] */
    public final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrC = la.c((String) zzba.zzc().a(eg.f4025i2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrC)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(la.c((String) zzba.zzc().a(eg.f4036j2)))));
            }
            Context context = this.f9093h;
            String packageName = context.getPackageName();
            this.f5552a.getClass();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final u21 u21Var = new u21();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.kb
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    u21 u21Var2 = u21Var;
                    if (list == null) {
                        u21Var2.f(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ApkChecksum apkChecksumC = a5.e.c(list.get(i10));
                            if (apkChecksumC.getType() == 8) {
                                byte[] value = apkChecksumC.getValue();
                                char[] cArr = la.f6543a;
                                int length = value.length;
                                char[] cArr2 = new char[length + length];
                                for (int i11 = 0; i11 < value.length; i11++) {
                                    byte b10 = value[i11];
                                    char[] cArr3 = la.f6543a;
                                    int i12 = i11 + i11;
                                    cArr2[i12] = cArr3[(b10 & 255) >>> 4];
                                    cArr2[i12 + 1] = cArr3[b10 & 15];
                                }
                                u21Var2.f(new String(cArr2));
                                return;
                            }
                        }
                        u21Var2.f(null);
                    } catch (Throwable unused) {
                        u21Var2.f(null);
                    }
                }
            });
            return (String) u21Var.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    public final String d() {
        try {
            Future future = this.f5552a.f5860k;
            if (future != null) {
                future.get();
            }
            x8 x8Var = this.f5552a.f5859j;
            if (x8Var == null || !x8Var.k0()) {
                return null;
            }
            return x8Var.y0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
