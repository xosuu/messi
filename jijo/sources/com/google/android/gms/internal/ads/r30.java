package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class r30 implements k40, f70, h60, u40, wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v40 f8372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fr0 f8373b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f8374d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f8375f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ScheduledFuture f8377q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f8379t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u21 f8376h = new u21();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f8378s = new AtomicBoolean();

    public r30(v40 v40Var, fr0 fr0Var, ScheduledExecutorService scheduledExecutorService, mu muVar, String str) {
        this.f8372a = v40Var;
        this.f8373b = fr0Var;
        this.f8374d = scheduledExecutorService;
        this.f8375f = muVar;
        this.f8379t = str;
    }

    @Override // com.google.android.gms.internal.ads.wb
    public final void Z(vb vbVar) {
        if (((Boolean) zzba.zzc().a(eg.Ba)).booleanValue() && this.f8379t.equals("com.google.ads.mediation.admob.AdMobAdapter") && vbVar.f9827j && this.f8378s.compareAndSet(false, true) && this.f8373b.f4608e != 3) {
            zze.zza("Full screen 1px impression occurred");
            this.f8372a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.u40
    public final synchronized void a(com.google.android.gms.ads.internal.client.zze zzeVar) {
        try {
            if (this.f8376h.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f8377q;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f8376h.g(new Exception());
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void n(as asVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzc() {
        fr0 fr0Var = this.f8373b;
        if (fr0Var.f4608e == 3) {
            return;
        }
        int i10 = fr0Var.Y;
        if (i10 == 0 || i10 == 1) {
            if (((Boolean) zzba.zzc().a(eg.Ba)).booleanValue() && this.f8379t.equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                return;
            }
            this.f8372a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.k40
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final void zzi() {
    }

    @Override // com.google.android.gms.internal.ads.h60
    public final synchronized void zzj() {
        try {
            if (this.f8376h.isDone()) {
                return;
            }
            ScheduledFuture scheduledFuture = this.f8377q;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            this.f8376h.f(Boolean.TRUE);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.f70
    public final void zzk() {
        fr0 fr0Var = this.f8373b;
        if (fr0Var.f4608e == 3) {
            return;
        }
        if (((Boolean) zzba.zzc().a(eg.f4066m1)).booleanValue() && fr0Var.Y == 2) {
            int i10 = fr0Var.f4632q;
            if (i10 == 0) {
                this.f8372a.zza();
                return;
            }
            tc1.u0(this.f8376h, new i10(14, this), this.f8375f);
            this.f8377q = this.f8374d.schedule(new s9(25, this), i10, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.internal.ads.f70
    public final void zzl() {
    }
}
