package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class c20 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f3160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f3161b;

    public c20(nh1 nh1Var, nh1 nh1Var2) {
        this.f3160a = nh1Var;
        this.f3161b = nh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new b20((fx) ((y10) this.f3160a).f10728a.f10633h, (Executor) this.f3161b.zzb());
    }
}
