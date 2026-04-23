package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ef0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f3932a;

    public ef0(nh1 nh1Var) {
        this.f3932a = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Context context = (Context) this.f3932a.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new kf0(context, muVar, 0);
    }
}
