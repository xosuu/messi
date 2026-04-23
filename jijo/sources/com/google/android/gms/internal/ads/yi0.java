package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class yi0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f10903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f10904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f10905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f10906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f10907e;

    public yi0(kh1 kh1Var, ri0 ri0Var, nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3) {
        this.f10903a = kh1Var;
        this.f10904b = ri0Var;
        this.f10905c = nh1Var;
        this.f10906d = nh1Var2;
        this.f10907e = nh1Var3;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xi0 zzb() {
        z10 z10Var = (z10) this.f10903a.zzb();
        xi0 xi0VarZzb = ((ri0) this.f10904b).zzb();
        m40 m40Var = (m40) this.f10905c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10906d.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new xi0(z10Var, xi0VarZzb, m40Var, scheduledExecutorService, muVar, (cd0) this.f10907e.zzb());
    }
}
