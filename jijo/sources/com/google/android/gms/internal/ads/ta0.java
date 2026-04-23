package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ta0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9095b;

    public ta0(ya0 ya0Var, ab0 ab0Var) {
        this.f9094a = ya0Var;
        this.f9095b = ab0Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        xa0 xa0VarZzb = ((ya0) this.f9094a).zzb();
        ab0 ab0Var = (ab0) this.f9095b;
        ab0Var.getClass();
        return new ep(muVar, xa0VarZzb, new m20(muVar, 20, ((ya0) ab0Var.f2631a).zzb()), 7, 0);
    }
}
