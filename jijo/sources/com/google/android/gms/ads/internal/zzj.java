package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.cv0;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.nb;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.t9;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.v9;
import com.google.android.gms.internal.ads.vv0;
import com.google.android.gms.internal.ads.x9;
import java.io.File;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import k.q;

/* JADX INFO: loaded from: classes.dex */
public final class zzj implements Runnable, v9 {
    public int A;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2225f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f2226h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f2227q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ExecutorService f2228s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final cv0 f2229t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f2230u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Context f2231v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VersionInfoParcel f2232w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final VersionInfoParcel f2233x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f2234y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Vector f2222a = new Vector();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f2223b = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f2224d = new AtomicReference();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final CountDownLatch f2235z = new CountDownLatch(1);

    public zzj(Context context, VersionInfoParcel versionInfoParcel) {
        this.f2230u = context;
        this.f2231v = context;
        this.f2232w = versionInfoParcel;
        this.f2233x = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.f2228s = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().a(eg.f3981e2)).booleanValue();
        this.f2234y = zBooleanValue;
        this.f2229t = cv0.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.f2226h = ((Boolean) zzba.zzc().a(eg.f3947b2)).booleanValue();
        this.f2227q = ((Boolean) zzba.zzc().a(eg.f3992f2)).booleanValue();
        if (((Boolean) zzba.zzc().a(eg.f3970d2)).booleanValue()) {
            this.A = 2;
        } else {
            this.A = 1;
        }
        if (!((Boolean) zzba.zzc().a(eg.f3959c3)).booleanValue()) {
            this.f2225f = a();
        }
        if (((Boolean) zzba.zzc().a(eg.W2)).booleanValue()) {
            nu.f7383a.execute(this);
            return;
        }
        zzay.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzv()) {
            nu.f7383a.execute(this);
        } else {
            run();
        }
    }

    public final boolean a() {
        Context context = this.f2230u;
        q qVar = new q(19, this);
        cv0 cv0Var = this.f2229t;
        vv0 vv0Var = new vv0(this.f2230u, tc1.p(context, cv0Var), qVar, ((Boolean) zzba.zzc().a(eg.f3958c2)).booleanValue());
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (vv0.f9979f) {
            try {
                nb nbVarF = vv0Var.f(1);
                if (nbVarF == null) {
                    vv0Var.e(4025, jCurrentTimeMillis);
                } else {
                    File fileC = vv0Var.c(nbVarF.I());
                    if (!new File(fileC, "pcam.jar").exists()) {
                        vv0Var.e(4026, jCurrentTimeMillis);
                    } else {
                        if (new File(fileC, "pcbc").exists()) {
                            vv0Var.e(5019, jCurrentTimeMillis);
                            return true;
                        }
                        vv0Var.e(4027, jCurrentTimeMillis);
                    }
                }
                return false;
            } finally {
            }
        }
    }

    public final v9 b() {
        return ((!this.f2226h || this.f2225f) && this.A == 2) ? (v9) this.f2224d.get() : (v9) this.f2223b.get();
    }

    public final void c() {
        Vector<Object[]> vector = this.f2222a;
        v9 v9VarB = b();
        if (vector.isEmpty() || v9VarB == null) {
            return;
        }
        for (Object[] objArr : vector) {
            int length = objArr.length;
            if (length == 1) {
                v9VarB.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                v9VarB.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        vector.clear();
    }

    public final void d(boolean z9) {
        String str = this.f2232w.afmaVersion;
        Context context = this.f2230u;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        x9.k(context, z9);
        this.f2223b.set(new x9(context, str, z9));
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        try {
            if (((Boolean) zzba.zzc().a(eg.f3959c3)).booleanValue()) {
                this.f2225f = a();
            }
            boolean z10 = this.f2232w.isClientJar;
            final boolean z11 = false;
            if (!((Boolean) zzba.zzc().a(eg.N0)).booleanValue() && z10) {
                z11 = true;
            }
            if ((!this.f2226h || this.f2225f) && this.A != 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    String str = this.f2232w.afmaVersion;
                    Context context = this.f2230u;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    t9 t9VarA = t9.a(context, str, z11, this.f2234y);
                    this.f2224d.set(t9VarA);
                    if (this.f2227q) {
                        synchronized (t9VarA) {
                            z9 = t9VarA.B;
                        }
                        if (!z9) {
                            this.A = 1;
                            d(z11);
                        }
                    }
                } catch (NullPointerException e10) {
                    this.A = 1;
                    d(z11);
                    this.f2229t.b(2031, System.currentTimeMillis() - jCurrentTimeMillis, e10);
                }
            } else {
                d(z11);
                if (this.A == 2) {
                    this.f2228s.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzh
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzj zzjVar = this.zza;
                            boolean z12 = z11;
                            zzjVar.getClass();
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            try {
                                String str2 = zzjVar.f2233x.afmaVersion;
                                Context context2 = zzjVar.f2231v;
                                Context applicationContext2 = context2.getApplicationContext();
                                if (applicationContext2 != null) {
                                    context2 = applicationContext2;
                                }
                                t9.a(context2, str2, z12, zzjVar.f2234y).e();
                            } catch (NullPointerException e11) {
                                zzjVar.f2229t.b(2027, System.currentTimeMillis() - jCurrentTimeMillis2, e11);
                            }
                        }
                    });
                }
            }
            this.f2235z.countDown();
            this.f2230u = null;
            this.f2232w = null;
        } catch (Throwable th) {
            this.f2235z.countDown();
            this.f2230u = null;
            this.f2232w = null;
            throw th;
        }
    }

    public final boolean zzd() {
        try {
            this.f2235z.await();
            return true;
        } catch (InterruptedException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("Interrupted during GADSignals creation.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        v9 v9VarB = b();
        if (((Boolean) zzba.zzc().a(eg.M9)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 4, null);
        }
        if (v9VarB == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        c();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return v9VarB.zzf(context, str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzg(Context context) {
        v9 v9VarB;
        if (!zzd() || (v9VarB = b()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        c();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return v9VarB.zzg(context);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().a(eg.L9)).booleanValue()) {
            v9 v9VarB = b();
            if (((Boolean) zzba.zzc().a(eg.M9)).booleanValue()) {
                zzu.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
            }
            return v9VarB != null ? v9VarB.zzh(context, view, activity) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (!zzd()) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        v9 v9VarB2 = b();
        if (((Boolean) zzba.zzc().a(eg.M9)).booleanValue()) {
            zzu.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzJ(view, 2, null);
        }
        return v9VarB2 != null ? v9VarB2.zzh(context, view, activity) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public final int zzj() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzk(MotionEvent motionEvent) {
        v9 v9VarB = b();
        if (v9VarB == null) {
            this.f2222a.add(new Object[]{motionEvent});
        } else {
            c();
            v9VarB.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzl(int i10, int i11, int i12) {
        v9 v9VarB = b();
        if (v9VarB == null) {
            this.f2222a.add(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)});
        } else {
            c();
            v9VarB.zzl(i10, i11, i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        v9 v9VarB;
        if (!zzd() || (v9VarB = b()) == null) {
            return;
        }
        v9VarB.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.v9
    public final void zzo(View view) {
        v9 v9VarB = b();
        if (v9VarB != null) {
            v9VarB.zzo(view);
        }
    }
}
