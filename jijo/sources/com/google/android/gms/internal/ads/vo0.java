package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class vo0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f9932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f9933d;

    public vo0(jy jyVar, oh1 oh1Var, nh1 nh1Var, nh1 nh1Var2) {
        this.f9930a = jyVar;
        this.f9931b = oh1Var;
        this.f9932c = nh1Var;
        this.f9933d = nh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final uo0 zzb() {
        Context contextA = ((jy) this.f9930a).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new uo0(contextA, muVar, ((oh1) this.f9931b).zzb(), (ft0) this.f9932c.zzb(), (ed0) this.f9933d.zzb());
    }
}
