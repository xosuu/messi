package com.google.android.gms.internal.ads;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class zl0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f11264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f11265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f11266c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f11267d;

    public zl0(nh1 nh1Var, jy jyVar, f40 f40Var, j10 j10Var) {
        this.f11264a = nh1Var;
        this.f11265b = jyVar;
        this.f11266c = f40Var;
        this.f11267d = j10Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xl0 zzb() {
        p21 p21Var = (p21) this.f11264a.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new xl0(p21Var, muVar, ((jy) this.f11265b).a(), ((f40) this.f11266c).a(), (ViewGroup) ((j10) this.f11267d).f5767a.f5456b);
    }
}
