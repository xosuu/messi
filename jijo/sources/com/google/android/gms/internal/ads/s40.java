package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s40 extends oe1 implements o40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f8789b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ScheduledFuture f8790d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8791f;

    public s40(r40 r40Var, Set set, mu muVar, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.f8791f = false;
        this.f8789b = scheduledExecutorService;
        H0(r40Var, muVar);
    }

    public final void J0() {
        synchronized (this) {
            zzm.zzg("Timeout waiting for show call succeed to be called.");
            O(new zzdgw("Timeout for show call succeed."));
            this.f8791f = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final void O(zzdgw zzdgwVar) {
        if (this.f8791f) {
            return;
        }
        ScheduledFuture scheduledFuture = this.f8790d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        I0(new aa(8, zzdgwVar));
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final void j(zze zzeVar) {
        I0(new p40(0, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.o40
    public final void zzb() {
        I0(new m30(5));
    }

    public final synchronized void zze() {
        ScheduledFuture scheduledFuture = this.f8790d;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    public final void zzf() {
        this.f8790d = this.f8789b.schedule(new s9(26, this), ((Integer) zzba.zzc().a(eg.O9)).intValue(), TimeUnit.MILLISECONDS);
    }
}
