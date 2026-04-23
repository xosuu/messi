package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class jg0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f5937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f5938b;

    public jg0(jy jyVar, nh1 nh1Var) {
        this.f5937a = jyVar;
        this.f5938b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new hg0(((jy) this.f5937a).a(), (ScheduledExecutorService) this.f5938b.zzb(), 1);
    }
}
