package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class cg0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f3270a;

    public cg0(jg0 jg0Var) {
        this.f3270a = jg0Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        mu muVar = nu.f7384b;
        tp1.b0(muVar);
        mu muVar2 = nu.f7383a;
        tp1.b0(muVar2);
        jg0 jg0Var = (jg0) this.f3270a;
        return new ep(muVar, muVar2, new hg0(((jy) jg0Var.f5937a).a(), (ScheduledExecutorService) jg0Var.f5938b.zzb(), 1), 9, 0);
    }
}
