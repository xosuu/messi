package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class mt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f7044a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7045b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f7046c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7047d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicInteger f7048e = new AtomicInteger(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f7049f = new AtomicReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f7050g = new AtomicReference(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConcurrentHashMap f7051h = new ConcurrentHashMap(9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f7052i;

    public mt() {
        new AtomicReference(null);
        new ArrayBlockingQueue(20);
        this.f7052i = new Object();
    }

    public static final boolean h(Context context) {
        if (!((Boolean) zzba.zzc().a(eg.f3956c0)).booleanValue()) {
            return false;
        }
        if (b4.d.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) zzba.zzc().a(eg.f3968d0)).intValue()) {
            return false;
        }
        if (((Boolean) zzba.zzc().a(eg.f3979e0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    public final String a(Context context) {
        Object objI;
        if (g(context) && (objI = i(context, "generateEventId")) != null) {
            return objI.toString();
        }
        return null;
    }

    public final String b(Context context) {
        if (!g(context)) {
            return null;
        }
        long jLongValue = ((Long) zzba.zzc().a(eg.f3934a0)).longValue();
        if (jLongValue < 0) {
            return (String) i(context, "getAppInstanceId");
        }
        AtomicReference atomicReference = this.f7044a;
        if (atomicReference.get() == null) {
            xf xfVar = eg.f3945b0;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) zzba.zzc().a(xfVar)).intValue(), ((Integer) zzba.zzc().a(xfVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new lt(0));
            while (!atomicReference.compareAndSet(null, threadPoolExecutor) && (atomicReference.get() == null || atomicReference.get() == null)) {
            }
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new xa(this, 2, context)).get(jLongValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String c(Context context) {
        if (!g(context)) {
            return null;
        }
        synchronized (this.f7045b) {
            try {
                String str = this.f7046c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) i(context, "getGmpAppId");
                this.f7046c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Context context, String str, Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        l(context, "_ac", str, bundle);
    }

    public final void e(Context context, String str, Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str2 : map.keySet()) {
                bundle.putString(str2, (String) map.get(str2));
            }
        }
        l(context, "_ai", str, bundle);
    }

    public final void f(Context context, String str, String str2, String str3, int i10) {
        if (g(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i10);
            l(context, "_ar", str, bundle);
            zze.zza("Log a Firebase reward video event, reward type: " + str3 + ", reward value: " + i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.content.Context r6) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.U
            com.google.android.gms.internal.ads.cg r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L61
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f7047d
            boolean r0 = r0.get()
            if (r0 == 0) goto L1c
            goto L61
        L1c:
            com.google.android.gms.internal.ads.xf r0 = com.google.android.gms.internal.ads.eg.f3990f0
            com.google.android.gms.internal.ads.cg r2 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto L30
            return r2
        L30:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.f7048e
            int r3 = r0.get()
            r4 = -1
            if (r3 != r4) goto L5a
            com.google.android.gms.ads.internal.client.zzay.zzb()
            r3 = 12451000(0xbdfcb8, float:1.7447567E-38)
            boolean r3 = com.google.android.gms.ads.internal.util.client.zzf.zzt(r6, r3)
            if (r3 != 0) goto L57
            com.google.android.gms.ads.internal.client.zzay.zzb()
            boolean r6 = com.google.android.gms.ads.internal.util.client.zzf.zzu(r6)
            if (r6 == 0) goto L57
            java.lang.String r6 = "Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service."
            com.google.android.gms.ads.internal.util.client.zzm.zzj(r6)
            r0.set(r1)
            goto L5a
        L57:
            r0.set(r2)
        L5a:
            int r6 = r0.get()
            if (r6 != r2) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mt.g(android.content.Context):boolean");
    }

    public final Object i(Context context, String str) {
        AtomicReference atomicReference = this.f7049f;
        if (!n(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return j(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            m(str, true);
            return null;
        }
    }

    public final Method j(Context context, String str) {
        ConcurrentHashMap concurrentHashMap = this.f7051h;
        Method method = (Method) concurrentHashMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            m(str, false);
            return null;
        }
    }

    public final void k(Context context, String str, String str2) {
        AtomicReference atomicReference = this.f7049f;
        if (n(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            ConcurrentHashMap concurrentHashMap = this.f7051h;
            Method declaredMethod = (Method) concurrentHashMap.get(str2);
            if (declaredMethod == null) {
                try {
                    declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentHashMap.put(str2, declaredMethod);
                } catch (Exception unused) {
                    m(str2, false);
                    declaredMethod = null;
                }
            }
            try {
                declaredMethod.invoke(atomicReference.get(), str);
                zze.zza("Invoke Firebase method " + str2 + ", Ad Unit Id: " + str);
            } catch (Exception unused2) {
                m(str2, false);
            }
        }
    }

    public final void l(Context context, String str, String str2, Bundle bundle) {
        if (g(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e10) {
                zzm.zzh("Invalid event ID: ".concat(String.valueOf(str2)), e10);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            AtomicReference atomicReference = this.f7049f;
            if (n(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                ConcurrentHashMap concurrentHashMap = this.f7051h;
                Method declaredMethod = (Method) concurrentHashMap.get("logEventInternal");
                if (declaredMethod == null) {
                    try {
                        declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentHashMap.put("logEventInternal", declaredMethod);
                    } catch (Exception unused) {
                        m("logEventInternal", true);
                        declaredMethod = null;
                    }
                }
                try {
                    declaredMethod.invoke(atomicReference.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    m("logEventInternal", true);
                }
            }
        }
    }

    public final void m(String str, boolean z9) {
        AtomicBoolean atomicBoolean = this.f7047d;
        if (atomicBoolean.get()) {
            return;
        }
        zzm.zzj("Invoke Firebase method " + str + " error.");
        if (z9) {
            zzm.zzj("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    public final boolean n(Context context, String str, AtomicReference atomicReference, boolean z9) {
        if (atomicReference.get() == null) {
            try {
                Object objInvoke = context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context);
                while (!atomicReference.compareAndSet(null, objInvoke) && (atomicReference.get() == null || atomicReference.get() == null)) {
                }
            } catch (Exception unused) {
                m("getInstance", z9);
                return false;
            }
        }
        return true;
    }
}
