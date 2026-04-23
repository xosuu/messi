package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public final class t9 implements v9 {
    public static t9 D;
    public volatile boolean A;
    public volatile boolean B;
    public final int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lj0 f9078b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vv0 f9079d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final wv0 f9080f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final android.support.v4.media.b f9081h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final cv0 f9082q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Executor f9083s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i10 f9084t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final pa f9086v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final u f9087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c1.d f9088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile long f9089y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Object f9090z = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CountDownLatch f9085u = new CountDownLatch(1);

    public t9(Context context, cv0 cv0Var, lj0 lj0Var, vv0 vv0Var, wv0 wv0Var, android.support.v4.media.b bVar, ExecutorService executorService, f3 f3Var, int i10, pa paVar, u uVar, c1.d dVar) {
        this.B = false;
        this.f9077a = context;
        this.f9082q = cv0Var;
        this.f9078b = lj0Var;
        this.f9079d = vv0Var;
        this.f9080f = wv0Var;
        this.f9081h = bVar;
        this.f9083s = executorService;
        this.C = i10;
        this.f9086v = paVar;
        this.f9087w = uVar;
        this.f9088x = dVar;
        this.B = false;
        this.f9084t = new i10(3, f3Var, 0);
    }

    public static synchronized t9 a(Context context, String str, boolean z9, boolean z10) {
        return b(str, context, Executors.newCachedThreadPool(), z9, z10);
    }

    public static synchronized t9 b(String str, Context context, ExecutorService executorService, boolean z9, boolean z10) {
        try {
            if (D == null) {
                byte b10 = (byte) (((byte) (0 | 1)) | 2);
                if (str == null) {
                    throw new NullPointerException("Null clientVersion");
                }
                byte b11 = (byte) (b10 | 1);
                if (b11 != 3) {
                    StringBuilder sb = new StringBuilder();
                    if ((b11 & 1) == 0) {
                        sb.append(" shouldGetAdvertisingId");
                    }
                    if ((b11 & 2) == 0) {
                        sb.append(" isGooglePlayServicesAvailable");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                }
                dv0 dv0Var = new dv0(str, z9, true);
                cv0 cv0VarA = cv0.a(context, executorService, z10);
                aa aaVar = ((Boolean) zzba.zzc().a(eg.Y2)).booleanValue() ? new aa((ConnectivityManager) context.getSystemService("connectivity")) : null;
                pa paVarA = ((Boolean) zzba.zzc().a(eg.Z2)).booleanValue() ? pa.a(context, executorService) : null;
                u uVar = ((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue() ? new u() : null;
                c1.d dVar = ((Boolean) zzba.zzc().a(eg.f4136t2)).booleanValue() ? new c1.d() : null;
                android.support.v4.media.b bVarM = android.support.v4.media.b.m(context, executorService, cv0VarA, dv0Var);
                fa faVar = new fa(context);
                na naVar = new na(context, faVar);
                android.support.v4.media.b bVar = new android.support.v4.media.b();
                bVar.f93a = dv0Var;
                bVar.f94b = bVarM;
                bVar.f95c = naVar;
                bVar.f96d = faVar;
                bVar.f97e = aaVar;
                bVar.f98f = paVarA;
                bVar.f99g = uVar;
                bVar.f100h = dVar;
                int iP = tc1.p(context, cv0VarA);
                f3 f3Var = new f3();
                t9 t9Var = new t9(context, cv0VarA, new lj0(context, iP), new vv0(context, iP, new aa(3, cv0VarA), ((Boolean) zzba.zzc().a(eg.f3958c2)).booleanValue()), new wv0(context, bVar, cv0VarA, f3Var), bVar, executorService, f3Var, iP, paVarA, uVar, dVar);
                D = t9Var;
                t9Var.d();
                D.e();
            }
        } catch (Throwable th) {
            throw th;
        }
        return D;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f8 A[Catch: all -> 0x0098, zzgyn -> 0x009b, TryCatch #2 {zzgyn -> 0x009b, blocks: (B:6:0x001d, B:8:0x002b, B:12:0x0031, B:13:0x003f, B:15:0x004d, B:17:0x005b, B:20:0x0068, B:32:0x009e, B:36:0x00b7, B:42:0x00d0, B:43:0x00dd, B:45:0x00e3, B:47:0x00eb, B:48:0x00ee, B:39:0x00c1, B:40:0x00c8, B:23:0x006f, B:25:0x0085, B:49:0x00f8, B:50:0x0105, B:51:0x0112), top: B:58:0x001d, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(com.google.android.gms.internal.ads.t9 r7) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.t9.c(com.google.android.gms.internal.ads.t9):void");
    }

    public final synchronized void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        qp0 qp0VarF = f();
        if (qp0VarF == null) {
            this.f9082q.c(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.f9080f.c(qp0VarF)) {
            this.B = true;
            this.f9085u.countDown();
        }
    }

    public final void e() {
        int i10;
        if (this.A) {
            return;
        }
        synchronized (this.f9090z) {
            try {
                if (!this.A) {
                    if ((System.currentTimeMillis() / 1000) - this.f9089y < 3600) {
                        return;
                    }
                    qp0 qp0VarB = this.f9080f.b();
                    if ((qp0VarB == null || ((nb) qp0VarB.f8251b).B() - (System.currentTimeMillis() / 1000) < 3600) && (this.C - 1 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7)) {
                        this.f9083s.execute(new s9(0, this));
                    }
                }
            } finally {
            }
        }
    }

    public final qp0 f() {
        int i10 = this.C - 1;
        qp0 qp0Var = null;
        if (!(i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7)) {
            return null;
        }
        if (!((Boolean) zzba.zzc().a(eg.f3936a2)).booleanValue()) {
            lj0 lj0Var = this.f9078b;
            nb nbVarD = lj0Var.d(1);
            if (nbVarD == null) {
                return null;
            }
            String strI = nbVarD.I();
            File fileE0 = en1.e0(lj0Var.g(), strI, "pcam.jar");
            if (!fileE0.exists()) {
                fileE0 = en1.e0(lj0Var.g(), strI, "pcam");
            }
            return new qp0(nbVarD, fileE0, en1.e0(lj0Var.g(), strI, "pcbc"), en1.e0(lj0Var.g(), strI, "pcopt"));
        }
        vv0 vv0Var = this.f9079d;
        vv0Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (vv0.f9979f) {
            try {
                nb nbVarF = vv0Var.f(1);
                if (nbVarF == null) {
                    vv0Var.e(4022, jCurrentTimeMillis);
                } else {
                    File fileC = vv0Var.c(nbVarF.I());
                    File file = new File(fileC, "pcam.jar");
                    if (!file.exists()) {
                        file = new File(fileC, "pcam");
                    }
                    File file2 = new File(fileC, "pcbc");
                    File file3 = new File(fileC, "pcopt");
                    vv0Var.e(5016, jCurrentTimeMillis);
                    qp0Var = new qp0(nbVarF, file, file2, file3);
                }
            } finally {
            }
        }
        return qp0Var;
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzf(Context context, String str, View view, Activity activity) {
        String strJ;
        pa paVar = this.f9086v;
        if (paVar != null && paVar.f7843d) {
            paVar.f7841b = System.currentTimeMillis();
        }
        if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
            this.f9087w.b();
        }
        e();
        xq xqVarA = this.f9080f.a();
        if (xqVarA == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (xqVarA) {
            android.support.v4.media.b bVar = (android.support.v4.media.b) xqVarA.f10632f;
            na naVar = (na) bVar.f95c;
            HashMap mapN = bVar.n();
            if (naVar.f7235x <= -2) {
                WeakReference weakReference = naVar.f7231t;
                if ((weakReference != null ? (View) weakReference.get() : null) == null) {
                    naVar.f7235x = -3L;
                }
            }
            mapN.put("lts", Long.valueOf(naVar.f7235x));
            mapN.put("f", "c");
            mapN.put("ctx", context);
            mapN.put("cs", str);
            mapN.put("aid", null);
            mapN.put("view", view);
            mapN.put("act", activity);
            strJ = xq.J(xqVarA.K(mapN));
        }
        this.f9082q.d(5000, System.currentTimeMillis() - jCurrentTimeMillis, null, strJ, null);
        return strJ;
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzg(Context context) {
        String strJ;
        pa paVar = this.f9086v;
        if (paVar != null && paVar.f7843d) {
            paVar.f7841b = System.currentTimeMillis();
        }
        if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
            u uVar = this.f9087w;
            uVar.f9322c = uVar.f9321b;
            uVar.f9321b = SystemClock.uptimeMillis();
        }
        e();
        xq xqVarA = this.f9080f.a();
        if (xqVarA == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (xqVarA) {
            HashMap mapL = ((android.support.v4.media.b) xqVarA.f10632f).l();
            mapL.put("f", "q");
            mapL.put("ctx", context);
            mapL.put("aid", null);
            strJ = xq.J(xqVarA.K(mapL));
        }
        this.f9082q.d(5001, System.currentTimeMillis() - jCurrentTimeMillis, null, strJ, null);
        return strJ;
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzh(Context context, View view, Activity activity) {
        String strJ;
        pa paVar = this.f9086v;
        if (paVar != null && paVar.f7843d) {
            paVar.f7841b = System.currentTimeMillis();
        }
        if (((Boolean) zzba.zzc().a(eg.f4126s2)).booleanValue()) {
            this.f9087w.c(context, view);
        }
        e();
        xq xqVarA = this.f9080f.a();
        if (xqVarA == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (xqVarA) {
            android.support.v4.media.b bVar = (android.support.v4.media.b) xqVarA.f10632f;
            c1.d dVar = (c1.d) bVar.f100h;
            HashMap mapN = bVar.n();
            if (dVar != null) {
                List list = dVar.f1500a;
                dVar.f1500a = Collections.emptyList();
                mapN.put("vst", list);
            }
            mapN.put("f", "v");
            mapN.put("ctx", context);
            mapN.put("aid", null);
            mapN.put("view", view);
            mapN.put("act", activity);
            strJ = xq.J(xqVarA.K(mapN));
        }
        this.f9082q.d(5002, System.currentTimeMillis() - jCurrentTimeMillis, null, strJ, null);
        return strJ;
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzk(MotionEvent motionEvent) {
        xq xqVarA = this.f9080f.a();
        if (xqVarA != null) {
            try {
                xqVarA.x(motionEvent);
            } catch (zzfqe e10) {
                this.f9082q.b(e10.f11642a, -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzl(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) zzba.zzc().a(eg.Ya)).booleanValue() || (displayMetrics = this.f9077a.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        c1.d dVar = this.f9088x;
        if (dVar != null) {
            dVar.f1500a = new ArrayList(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzo(View view) {
        ((na) this.f9081h.f95c).a(view);
    }
}
