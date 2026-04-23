package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class do0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f3707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f3708b;

    public do0(jy jyVar, nh1 nh1Var) {
        this.f3707a = jyVar;
        this.f3708b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new hm0(muVar, ((jy) this.f3707a).a(), (Set) this.f3708b.zzb(), 1);
    }
}
