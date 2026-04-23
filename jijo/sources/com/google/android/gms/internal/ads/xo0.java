package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class xo0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f10624a;

    public xo0(jy jyVar) {
        this.f10624a = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Context contextA = ((jy) this.f10624a).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new pm0(contextA, muVar, 6);
    }
}
