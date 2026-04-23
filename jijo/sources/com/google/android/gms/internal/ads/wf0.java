package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wf0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f10167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f10168b;

    public wf0(nh1 nh1Var, t50 t50Var) {
        this.f10167a = nh1Var;
        this.f10168b = t50Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Map map = ((mh1) this.f10167a).f4528a;
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new vf0(map, muVar, new s50(((oh1) ((t50) this.f10168b).f9055a).zzb()));
    }
}
