package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class pa0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f7844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f7845b;

    public pa0(zb0 zb0Var, nh1 nh1Var) {
        this.f7844a = zb0Var;
        this.f7845b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new n70(new yb0(((t90) ((zb0) this.f7844a).f11203a).a()), (Executor) this.f7845b.zzb());
    }
}
