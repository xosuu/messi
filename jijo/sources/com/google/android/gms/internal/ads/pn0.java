package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class pn0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f7923a;

    public pn0(jy jyVar) {
        this.f7923a = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Context contextA = ((jy) this.f7923a).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new pm0(contextA, muVar, 3);
    }
}
