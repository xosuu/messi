package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class bg0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f3018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f3019b;

    public bg0(ig0 ig0Var, f10 f10Var) {
        this.f3018a = ig0Var;
        this.f3019b = f10Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xq zzb() {
        mu muVar = nu.f7384b;
        tp1.b0(muVar);
        mu muVar2 = nu.f7383a;
        tp1.b0(muVar2);
        ig0 ig0Var = (ig0) this.f3018a;
        return new xq(muVar, muVar2, new hg0(((jy) ig0Var.f5590a).a(), (ScheduledExecutorService) ig0Var.f5591b.zzb(), 0), ih1.a(en1.Q(this.f3019b)), 15);
    }
}
