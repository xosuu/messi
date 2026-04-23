package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class be0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3000d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f3002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final WeakReference f3003g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rc0 f3004h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f3005i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f3006j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ScheduledExecutorService f3007k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jd0 f3008l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final VersionInfoParcel f3009m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b70 f3011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gt0 f3012p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f2997a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2998b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2999c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qu f3001e = new qu();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ConcurrentHashMap f3010n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f3013q = true;

    public be0(Executor executor, Context context, WeakReference weakReference, mu muVar, rc0 rc0Var, ScheduledExecutorService scheduledExecutorService, jd0 jd0Var, VersionInfoParcel versionInfoParcel, b70 b70Var, gt0 gt0Var) {
        this.f3004h = rc0Var;
        this.f3002f = context;
        this.f3003g = weakReference;
        this.f3005i = muVar;
        this.f3007k = scheduledExecutorService;
        this.f3006j = executor;
        this.f3008l = jd0Var;
        this.f3009m = versionInfoParcel;
        this.f3011o = b70Var;
        this.f3012p = gt0Var;
        ((y3.b) zzu.zzB()).getClass();
        this.f3000d = SystemClock.elapsedRealtime();
        d("com.google.android.gms.ads.MobileAds", 0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, false);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap concurrentHashMap = this.f3010n;
        for (String str : concurrentHashMap.keySet()) {
            zzbkv zzbkvVar = (zzbkv) concurrentHashMap.get(str);
            arrayList.add(new zzbkv(str, zzbkvVar.f11502d, zzbkvVar.f11503f, zzbkvVar.f11501b));
        }
        return arrayList;
    }

    public final void b() {
        final int i10 = 0;
        final int i11 = 1;
        if (!((Boolean) rh.f8594a.k()).booleanValue()) {
            if (this.f3009m.clientJarVersion >= ((Integer) zzba.zzc().a(eg.D1)).intValue() && this.f3013q) {
                if (this.f2997a) {
                    return;
                }
                synchronized (this) {
                    try {
                        if (this.f2997a) {
                            return;
                        }
                        this.f3008l.d();
                        this.f3011o.zzf();
                        this.f3001e.a(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xd0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ be0 f10541b;

                            {
                                this.f10541b = this;
                            }

                            private final void a() {
                                be0 be0Var = this.f10541b;
                                synchronized (be0Var) {
                                    try {
                                        if (be0Var.f2999c) {
                                            return;
                                        }
                                        ((y3.b) zzu.zzB()).getClass();
                                        be0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - be0Var.f3000d), "Timeout.", false);
                                        be0Var.f3008l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        be0Var.f3011o.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        be0Var.f3001e.c(new Exception());
                                    } finally {
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i11) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        be0 be0Var = this.f10541b;
                                        jd0 jd0Var = be0Var.f3008l;
                                        synchronized (jd0Var) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(eg.P1)).booleanValue() && !jd0Var.f5912d) {
                                                    HashMap mapE = jd0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    jd0Var.f5910b.add(mapE);
                                                    Iterator it = jd0Var.f5910b.iterator();
                                                    while (it.hasNext()) {
                                                        jd0Var.f5914f.a((Map) it.next(), false);
                                                    }
                                                    jd0Var.f5912d = true;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        be0Var.f3011o.zze();
                                        be0Var.f2998b = true;
                                        return;
                                }
                            }
                        }, this.f3005i);
                        this.f2997a = true;
                        n5.a aVarC = c();
                        this.f3007k.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.xd0

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ be0 f10541b;

                            {
                                this.f10541b = this;
                            }

                            private final void a() {
                                be0 be0Var = this.f10541b;
                                synchronized (be0Var) {
                                    try {
                                        if (be0Var.f2999c) {
                                            return;
                                        }
                                        ((y3.b) zzu.zzB()).getClass();
                                        be0Var.d("com.google.android.gms.ads.MobileAds", (int) (SystemClock.elapsedRealtime() - be0Var.f3000d), "Timeout.", false);
                                        be0Var.f3008l.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        be0Var.f3011o.a("com.google.android.gms.ads.MobileAds", "timeout");
                                        be0Var.f3001e.c(new Exception());
                                    } finally {
                                    }
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i10) {
                                    case 0:
                                        a();
                                        return;
                                    default:
                                        be0 be0Var = this.f10541b;
                                        jd0 jd0Var = be0Var.f3008l;
                                        synchronized (jd0Var) {
                                            try {
                                                if (((Boolean) zzba.zzc().a(eg.P1)).booleanValue() && !jd0Var.f5912d) {
                                                    HashMap mapE = jd0Var.e();
                                                    mapE.put("action", "init_finished");
                                                    jd0Var.f5910b.add(mapE);
                                                    Iterator it = jd0Var.f5910b.iterator();
                                                    while (it.hasNext()) {
                                                        jd0Var.f5914f.a((Map) it.next(), false);
                                                    }
                                                    jd0Var.f5912d = true;
                                                }
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                        be0Var.f3011o.zze();
                                        be0Var.f2998b = true;
                                        return;
                                }
                            }
                        }, ((Long) zzba.zzc().a(eg.F1)).longValue(), TimeUnit.SECONDS);
                        tc1.u0(aVarC, new aa(13, this), this.f3005i);
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        if (this.f2997a) {
            return;
        }
        d("com.google.android.gms.ads.MobileAds", 0, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, true);
        this.f3001e.b(Boolean.FALSE);
        this.f2997a = true;
        this.f2998b = true;
    }

    public final synchronized n5.a c() {
        String str = zzu.zzo().d().zzh().f3444e;
        if (!TextUtils.isEmpty(str)) {
            return tc1.d0(str);
        }
        qu quVar = new qu();
        zzu.zzo().d().zzr(new vm(this, 26, quVar));
        return quVar;
    }

    public final void d(String str, int i10, String str2, boolean z9) {
        this.f3010n.put(str, new zzbkv(str, i10, str2, z9));
    }
}
