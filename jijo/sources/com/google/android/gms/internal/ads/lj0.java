package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public final class lj0 implements j81, qe0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static lj0 f6642h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6644b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f6645d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f6646f;

    public /* synthetic */ lj0(int i10, sr srVar, sr srVar2, ek1 ek1Var) {
        this.f6644b = ek1Var;
        this.f6643a = i10;
        this.f6645d = srVar;
        this.f6646f = srVar2;
    }

    public static synchronized lj0 e(Context context) {
        try {
            if (f6642h == null) {
                f6642h = new lj0(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f6642h;
    }

    public static /* synthetic */ void f(lj0 lj0Var, int i10) {
        synchronized (lj0Var.f6646f) {
            try {
                if (lj0Var.f6643a == i10) {
                    return;
                }
                lj0Var.f6643a = i10;
                for (WeakReference weakReference : (CopyOnWriteArrayList) lj0Var.f6645d) {
                    jq1 jq1Var = (jq1) weakReference.get();
                    if (jq1Var != null) {
                        kq1.d(jq1Var.f6067a, i10);
                    } else {
                        ((CopyOnWriteArrayList) lj0Var.f6645d).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.j81
    public final byte[] a(byte[] bArr, int i10) throws InvalidAlgorithmParameterException {
        if (i10 > this.f6643a) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = (ThreadLocal) this.f6644b;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i10);
    }

    public final int b() {
        int i10;
        synchronized (this.f6646f) {
            i10 = this.f6643a;
        }
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        if (com.google.android.gms.internal.ads.f3.a(r0) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.lb r9, com.google.android.gms.internal.ads.i10 r10) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lj0.c(com.google.android.gms.internal.ads.lb, com.google.android.gms.internal.ads.i10):boolean");
    }

    public final nb d(int i10) {
        String string;
        Object obj = this.f6646f;
        if (i10 == 1) {
            StringBuilder sb = new StringBuilder("LATMTD");
            sb.append(this.f6643a - 1);
            string = ((SharedPreferences) obj).getString(sb.toString(), null);
        } else {
            StringBuilder sb2 = new StringBuilder("FBAMTD");
            sb2.append(this.f6643a - 1);
            string = ((SharedPreferences) obj).getString(sb2.toString(), null);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            byte[] bArrF = y3.c.f(string);
            nb nbVarF = nb.F(ec1.q(0, bArrF, bArrF.length));
            String strI = nbVarF.I();
            File fileE0 = en1.e0(g(), strI, "pcam.jar");
            if (!fileE0.exists()) {
                fileE0 = en1.e0(g(), strI, "pcam");
            }
            File fileE02 = en1.e0(g(), strI, "pcbc");
            if (fileE0.exists()) {
                if (fileE02.exists()) {
                    return nbVarF;
                }
            }
        } catch (zzgyn unused) {
        }
        return null;
    }

    public final File g() {
        File file = new File((File) this.f6644b, Integer.toString(this.f6643a - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    @Override // com.google.android.gms.internal.ads.qe0
    /* JADX INFO: renamed from: zza */
    public final void mo0zza(Object obj) {
        ((fk1) obj).o(this.f6643a);
    }

    public lj0(cw0 cw0Var, mx0 mx0Var) {
        f3 f3Var = new f3();
        this.f6644b = cw0Var;
        this.f6645d = mx0Var;
        this.f6646f = f3Var;
        this.f6643a = 1048576;
    }

    public lj0(Context context) {
        this.f6644b = new Handler(Looper.getMainLooper());
        this.f6645d = new CopyOnWriteArrayList();
        this.f6646f = new Object();
        this.f6643a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new f.g0(this, 7), intentFilter);
    }

    public lj0(Context context, int i10) {
        this.f6646f = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        en1.W(dir, false);
        this.f6644b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        en1.W(dir2, true);
        this.f6645d = dir2;
        this.f6643a = i10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lj0(java.lang.String r6, javax.crypto.spec.SecretKeySpec r7) throws java.security.GeneralSecurityException {
        /*
            r5 = this;
            r5.<init>()
            com.google.android.gms.internal.ads.qb1 r0 = new com.google.android.gms.internal.ads.qb1
            r0.<init>(r5)
            r5.f6644b = r0
            r1 = 2
            boolean r2 = com.google.android.gms.internal.ads.tp1.N(r1)
            if (r2 == 0) goto L8e
            r5.f6645d = r6
            r5.f6646f = r7
            byte[] r7 = r7.getEncoded()
            int r7 = r7.length
            r2 = 16
            if (r7 < r2) goto L86
            int r7 = r6.hashCode()
            r2 = 4
            r3 = 3
            r4 = 1
            switch(r7) {
                case -1823053428: goto L51;
                case 392315023: goto L47;
                case 392315118: goto L3d;
                case 392316170: goto L33;
                case 392317873: goto L29;
                default: goto L28;
            }
        L28:
            goto L5b
        L29:
            java.lang.String r7 = "HMACSHA512"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 4
            goto L5c
        L33:
            java.lang.String r7 = "HMACSHA384"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 3
            goto L5c
        L3d:
            java.lang.String r7 = "HMACSHA256"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 2
            goto L5c
        L47:
            java.lang.String r7 = "HMACSHA224"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 1
            goto L5c
        L51:
            java.lang.String r7 = "HMACSHA1"
            boolean r7 = r6.equals(r7)
            if (r7 == 0) goto L5b
            r7 = 0
            goto L5c
        L5b:
            r7 = -1
        L5c:
            if (r7 == 0) goto L7e
            if (r7 == r4) goto L7b
            if (r7 == r1) goto L78
            if (r7 == r3) goto L75
            if (r7 != r2) goto L69
            r6 = 64
            goto L80
        L69:
            java.lang.String r7 = "unknown Hmac algorithm: "
            java.lang.String r6 = r7.concat(r6)
            java.security.NoSuchAlgorithmException r7 = new java.security.NoSuchAlgorithmException
            r7.<init>(r6)
            throw r7
        L75:
            r6 = 48
            goto L80
        L78:
            r6 = 32
            goto L80
        L7b:
            r6 = 28
            goto L80
        L7e:
            r6 = 20
        L80:
            r5.f6643a = r6
            r0.get()
            return
        L86:
            java.security.InvalidAlgorithmParameterException r6 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r7 = "key size too small, need at least 16 bytes"
            r6.<init>(r7)
            throw r6
        L8e:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.String r7 = "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.lj0.<init>(java.lang.String, javax.crypto.spec.SecretKeySpec):void");
    }
}
