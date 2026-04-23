package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class cr implements dr {
    public static Boolean A;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Object f3387w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static dr f3388x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static dr f3389y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static dr f3390z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3392b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final VersionInfoParcel f3395h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final PackageInfo f3396q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f3397s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f3398t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3400v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3391a = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f3393d = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ExecutorService f3394f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AtomicBoolean f3399u = new AtomicBoolean();

    /* JADX WARN: Removed duplicated region for block: B:11:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public cr(android.content.Context r3, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r4) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.f3391a = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            r2.f3393d = r0
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newCachedThreadPool()
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.unconfigurableExecutorService(r0)
            r2.f3394f = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r2.f3399u = r0
            android.content.Context r0 = r3.getApplicationContext()
            if (r0 == 0) goto L2c
            android.content.Context r3 = r3.getApplicationContext()
        L2c:
            r2.f3392b = r3
            r2.f3395h = r4
            com.google.android.gms.internal.ads.xf r4 = com.google.android.gms.internal.ads.eg.X6
            com.google.android.gms.internal.ads.cg r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r0.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r0 = 0
            if (r4 == 0) goto L4d
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 == 0) goto L4d
            android.content.pm.ApplicationInfo r4 = r3.getApplicationInfo()
            if (r4 != 0) goto L4f
        L4d:
            r3 = r0
            goto L61
        L4f:
            s3.g r4 = z3.b.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            android.content.pm.ApplicationInfo r3 = r3.getApplicationInfo()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            java.lang.String r3 = r3.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            r1 = 0
            android.content.pm.PackageInfo r3 = r4.d(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L5f
            goto L61
        L5f:
            goto L4d
        L61:
            r2.f3396q = r3
            com.google.android.gms.internal.ads.xf r3 = com.google.android.gms.internal.ads.eg.V6
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r4 = r4.a(r3)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r1 = "unknown"
            if (r4 == 0) goto L80
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.getCountry()
            goto L81
        L80:
            r4 = r1
        L81:
            r2.f3397s = r4
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto Lb0
            android.content.Context r3 = r2.f3392b
            android.os.Handler r4 = com.google.android.gms.ads.internal.util.client.zzf.zza
            if (r3 != 0) goto L9a
            goto Lb1
        L9a:
            s3.g r3 = z3.b.a(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r4 = "com.android.vending"
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.d(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            if (r3 != 0) goto La9
            goto Lb1
        La9:
            int r3 = r3.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            java.lang.String r0 = java.lang.Integer.toString(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb1
            goto Lb1
        Lb0:
            r0 = r1
        Lb1:
            r2.f3398t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cr.<init>(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):void");
    }

    public static dr a(Context context) {
        synchronized (f3387w) {
            try {
                if (f3388x == null) {
                    if (i()) {
                        f3388x = new cr(context, VersionInfoParcel.forPackage());
                    } else {
                        f3388x = new pe(16);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3388x;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.dr b(android.content.Context r5, com.google.android.gms.ads.internal.util.client.VersionInfoParcel r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.cr.f3387w
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dr r1 = com.google.android.gms.internal.ads.cr.f3390z     // Catch: java.lang.Throwable -> L3b
            if (r1 != 0) goto L7e
            com.google.android.gms.internal.ads.xg r1 = com.google.android.gms.internal.ads.dh.f3651c     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.k()     // Catch: java.lang.Throwable -> L3b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3b
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.Q6     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.cg r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r4.a(r1)     // Catch: java.lang.Throwable -> L3b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L37
            com.google.android.gms.internal.ads.xg r1 = com.google.android.gms.internal.ads.dh.f3649a     // Catch: java.lang.Throwable -> L3b
            java.lang.Object r1 = r1.k()     // Catch: java.lang.Throwable -> L3b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L39
        L37:
            r1 = 1
            goto L3d
        L39:
            r1 = 0
            goto L3d
        L3b:
            r5 = move-exception
            goto L82
        L3d:
            boolean r4 = i()     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L5a
            com.google.android.gms.internal.ads.cr r1 = new com.google.android.gms.internal.ads.cr     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3b
            r1.h()     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread$UncaughtExceptionHandler r5 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.br r6 = new com.google.android.gms.internal.ads.br     // Catch: java.lang.Throwable -> L3b
            r6.<init>(r1, r5, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.cr.f3390z = r1     // Catch: java.lang.Throwable -> L3b
            goto L7e
        L5a:
            if (r1 == 0) goto L75
            com.google.android.gms.internal.ads.cr r1 = new com.google.android.gms.internal.ads.cr     // Catch: java.lang.Throwable -> L3b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L3b
            r1.f3400v = r3     // Catch: java.lang.Throwable -> L3b
            r1.h()     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread$UncaughtExceptionHandler r5 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.br r6 = new com.google.android.gms.internal.ads.br     // Catch: java.lang.Throwable -> L3b
            r6.<init>(r1, r5, r2)     // Catch: java.lang.Throwable -> L3b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.cr.f3390z = r1     // Catch: java.lang.Throwable -> L3b
            goto L7e
        L75:
            com.google.android.gms.internal.ads.pe r5 = new com.google.android.gms.internal.ads.pe     // Catch: java.lang.Throwable -> L3b
            r6 = 16
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.cr.f3390z = r5     // Catch: java.lang.Throwable -> L3b
        L7e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            com.google.android.gms.internal.ads.dr r5 = com.google.android.gms.internal.ads.cr.f3390z
            return r5
        L82:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cr.b(android.content.Context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel):com.google.android.gms.internal.ads.dr");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0019, B:10:0x002b, B:13:0x0039, B:14:0x0042), top: B:19:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.dr c(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.cr.f3387w
            monitor-enter(r0)
            com.google.android.gms.internal.ads.dr r1 = com.google.android.gms.internal.ads.cr.f3389y     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L42
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.R6     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L39
            com.google.android.gms.internal.ads.xf r1 = com.google.android.gms.internal.ads.eg.Q6     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r2.a(r1)     // Catch: java.lang.Throwable -> L37
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L37
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L37
            if (r1 != 0) goto L39
            com.google.android.gms.internal.ads.cr r1 = new com.google.android.gms.internal.ads.cr     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r2 = com.google.android.gms.ads.internal.util.client.VersionInfoParcel.forPackage()     // Catch: java.lang.Throwable -> L37
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cr.f3389y = r1     // Catch: java.lang.Throwable -> L37
            goto L42
        L37:
            r3 = move-exception
            goto L46
        L39:
            com.google.android.gms.internal.ads.pe r3 = new com.google.android.gms.internal.ads.pe     // Catch: java.lang.Throwable -> L37
            r1 = 16
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.cr.f3389y = r3     // Catch: java.lang.Throwable -> L37
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            com.google.android.gms.internal.ads.dr r3 = com.google.android.gms.internal.ads.cr.f3389y
            return r3
        L46:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L37
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cr.c(android.content.Context):com.google.android.gms.internal.ads.dr");
    }

    public static String d(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static boolean i() {
        if (!((Boolean) zzba.zzc().a(eg.Ob)).booleanValue()) {
            if (((Boolean) uh.f9483e.k()).booleanValue()) {
                if (!((Boolean) zzba.zzc().a(eg.Q6)).booleanValue()) {
                    return true;
                }
            }
            return false;
        }
        synchronized (f3387w) {
            try {
                if (A == null) {
                    A = Boolean.valueOf(zzay.zze().nextInt(100) < ((Integer) zzba.zzc().a(eg.Lb)).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (A.booleanValue()) {
            if (!((Boolean) zzba.zzc().a(eg.Q6)).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void e(String str, Throwable th) {
        if (this.f3400v) {
            return;
        }
        f(th, str, 1.0f);
    }

    @Override // com.google.android.gms.internal.ads.dr
    public final void f(Throwable th, String str, float f10) {
        Throwable th2;
        boolean zF;
        String packageName;
        PackageInfo packageInfoD;
        ActivityManager.MemoryInfo memoryInfoZzc;
        String strZzg;
        Context context = this.f3392b;
        if (this.f3400v) {
            return;
        }
        Handler handler = zzf.zza;
        if (((Boolean) uh.f9484f.k()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                linkedList.push(cause);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th3 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th3.getStackTrace();
                boolean z9 = ((Boolean) zzba.zzc().a(eg.Y1)).booleanValue() && stackTrace != null && stackTrace.length == 0 && zzf.zzp(th3.getClass().getName());
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th3.getClass().getName(), "<filtered>", "<filtered>", 1));
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (zzf.zzp(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z9 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z9) {
                    th2 = th2 == null ? new Throwable(th3.getMessage()) : new Throwable(th3.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 != null) {
            String name = th.getClass().getName();
            String strD = d(th);
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.V7)).booleanValue();
            String str2 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            if (zBooleanValue && (strZzg = zzf.zzg(d(th))) != null) {
                str2 = strZzg;
            }
            double d10 = f10;
            double dRandom = Math.random();
            int i10 = f10 > 0.0f ? (int) (1.0f / f10) : 1;
            if (dRandom < d10) {
                ArrayList arrayList2 = new ArrayList();
                try {
                    zF = z3.b.a(context).f();
                } catch (Throwable th4) {
                    zzm.zzh("Error fetching instant app info", th4);
                    zF = false;
                }
                try {
                    packageName = context.getPackageName();
                } catch (Throwable unused) {
                    zzm.zzj("Cannot obtain package name, proceeding.");
                    packageName = "unknown";
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zF)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE);
                int i11 = Build.VERSION.SDK_INT;
                Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("api", String.valueOf(i11));
                String str3 = Build.MANUFACTURER;
                String strX = Build.MODEL;
                if (!strX.startsWith(str3)) {
                    strX = fb1.x(str3, " ", strX);
                }
                Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("device", strX);
                VersionInfoParcel versionInfoParcel = this.f3395h;
                Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("js", versionInfoParcel.afmaVersion).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", strD).appendQueryParameter("eids", TextUtils.join(",", zzba.zza().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "661295874").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i10)).appendQueryParameter("pb_tm", String.valueOf(uh.f9481c.k()));
                s3.d.f16687b.getClass();
                Uri.Builder builderAppendQueryParameter5 = builderAppendQueryParameter4.appendQueryParameter("gmscv", String.valueOf(s3.d.a(context))).appendQueryParameter("lite", true != versionInfoParcel.isLiteSdk ? "0" : "1");
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter5.appendQueryParameter("hash", str2);
                }
                if (((Boolean) zzba.zzc().a(eg.W6)).booleanValue() && (memoryInfoZzc = zzf.zzc(context)) != null) {
                    builderAppendQueryParameter5.appendQueryParameter("available_memory", Long.toString(memoryInfoZzc.availMem));
                    builderAppendQueryParameter5.appendQueryParameter("total_memory", Long.toString(memoryInfoZzc.totalMem));
                    builderAppendQueryParameter5.appendQueryParameter("is_low_memory", true != memoryInfoZzc.lowMemory ? "0" : "1");
                }
                if (((Boolean) zzba.zzc().a(eg.V6)).booleanValue()) {
                    String str4 = this.f3397s;
                    if (!TextUtils.isEmpty(str4)) {
                        builderAppendQueryParameter5.appendQueryParameter("countrycode", str4);
                    }
                    String str5 = this.f3398t;
                    if (!TextUtils.isEmpty(str5)) {
                        builderAppendQueryParameter5.appendQueryParameter("psv", str5);
                    }
                    if (i11 >= 26) {
                        packageInfoD = WebView.getCurrentWebViewPackage();
                    } else if (context == null) {
                        packageInfoD = null;
                    } else {
                        try {
                            packageInfoD = z3.b.a(context).d(NotificationCompat.FLAG_HIGH_PRIORITY, "com.android.webview");
                        } catch (PackageManager.NameNotFoundException unused2) {
                            packageInfoD = null;
                        }
                    }
                    if (packageInfoD != null) {
                        builderAppendQueryParameter5.appendQueryParameter("wvvc", Integer.toString(packageInfoD.versionCode));
                        builderAppendQueryParameter5.appendQueryParameter("wvvn", packageInfoD.versionName);
                        builderAppendQueryParameter5.appendQueryParameter("wvpn", packageInfoD.packageName);
                    }
                }
                PackageInfo packageInfo = this.f3396q;
                if (packageInfo != null) {
                    builderAppendQueryParameter5.appendQueryParameter("appvc", String.valueOf(packageInfo.versionCode));
                    builderAppendQueryParameter5.appendQueryParameter("appvn", packageInfo.versionName);
                }
                arrayList2.add(builderAppendQueryParameter5.toString());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    this.f3394f.execute(new vm(new zzr(null), 11, (String) it.next()));
                }
            }
        }
    }

    public final void g(Throwable th) {
        Context context;
        SharedPreferences sharedPreferences;
        if (th != null) {
            boolean zZzp = false;
            boolean zEquals = false;
            for (Throwable cause = th; cause != null; cause = cause.getCause()) {
                for (StackTraceElement stackTraceElement : cause.getStackTrace()) {
                    zZzp |= zzf.zzp(stackTraceElement.getClassName());
                    zEquals |= cr.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!zZzp || zEquals) {
                return;
            }
            if (!this.f3400v) {
                e(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, th);
            }
            if (this.f3399u.getAndSet(true) || !((Boolean) dh.f3651c.k()).booleanValue() || (sharedPreferences = (context = this.f3392b).getSharedPreferences("admob", 0)) == null) {
                return;
            }
            sharedPreferences.edit().putInt("crash_without_write", b4.f.m0(context, "crash_without_write") + 1).commit();
        }
    }

    public final void h() {
        Thread thread = Looper.getMainLooper().getThread();
        if (thread == null) {
            return;
        }
        synchronized (this.f3391a) {
            this.f3393d.put(thread, Boolean.TRUE);
        }
        thread.setUncaughtExceptionHandler(new br(this, thread.getUncaughtExceptionHandler(), 1));
    }
}
