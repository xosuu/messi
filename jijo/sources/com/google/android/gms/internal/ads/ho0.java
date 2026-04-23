package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ho0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f5358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f5359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f5360c;

    public ho0(jy jyVar, nh1 nh1Var, ry ryVar) {
        this.f5358a = jyVar;
        this.f5359b = nh1Var;
        this.f5360c = ryVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final im0 zzb() {
        Context contextA = ((jy) this.f5358a).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new im0(contextA, muVar, ((f40) this.f5359b).a(), ((ry) this.f5360c).a());
    }
}
