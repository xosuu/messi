package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pf0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f7873a;

    public pf0(jy jyVar) {
        this.f7873a = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Context contextA = ((jy) this.f7873a).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new kf0(contextA, muVar, 1);
    }
}
