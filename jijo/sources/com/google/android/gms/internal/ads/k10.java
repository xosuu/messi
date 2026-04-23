package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class k10 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f6136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f6137b;

    public k10(nh1 nh1Var, nh1 nh1Var2) {
        this.f6136a = nh1Var;
        this.f6137b = nh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final r50 zzb() {
        return new r50((ScheduledExecutorService) this.f6136a.zzb(), (y3.a) this.f6137b.zzb());
    }
}
