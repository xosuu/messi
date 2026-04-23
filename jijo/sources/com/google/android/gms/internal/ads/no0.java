package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class no0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f7339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f7340b;

    public no0(nh1 nh1Var, jy jyVar) {
        this.f7339a = nh1Var;
        this.f7340b = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        mt mtVar = (mt) this.f7339a.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new hm0(mtVar, muVar, ((jy) this.f7340b).a(), 2);
    }
}
