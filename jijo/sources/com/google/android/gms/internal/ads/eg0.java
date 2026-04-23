package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class eg0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f4199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4200b;

    public eg0(cg0 cg0Var, nh1 nh1Var) {
        this.f4199a = cg0Var;
        this.f4200b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        cg0 cg0Var = (cg0) this.f4199a;
        cg0Var.getClass();
        mu muVar2 = nu.f7384b;
        tp1.b0(muVar2);
        jg0 jg0Var = (jg0) cg0Var.f3270a;
        return new ep(muVar, new ep(muVar2, muVar, new hg0(((jy) jg0Var.f5937a).a(), (ScheduledExecutorService) jg0Var.f5938b.zzb(), 1), 9, 0), (xs0) this.f4200b.zzb(), 10, 0);
    }
}
