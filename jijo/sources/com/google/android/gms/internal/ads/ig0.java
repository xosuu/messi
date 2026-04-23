package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ig0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f5590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f5591b;

    public ig0(jy jyVar, nh1 nh1Var) {
        this.f5590a = jyVar;
        this.f5591b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new hg0(((jy) this.f5590a).a(), (ScheduledExecutorService) this.f5591b.zzb(), 0);
    }
}
