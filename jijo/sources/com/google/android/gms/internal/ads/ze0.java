package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ze0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f11224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f11225b;

    public ze0(ef0 ef0Var, z00 z00Var) {
        this.f11224a = ef0Var;
        this.f11225b = z00Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xq zzb() {
        mu muVar = nu.f7384b;
        tp1.b0(muVar);
        mu muVar2 = nu.f7383a;
        tp1.b0(muVar2);
        Context context = (Context) ((ef0) this.f11224a).f3932a.zzb();
        tp1.b0(muVar2);
        return new xq(muVar, muVar2, new kf0(context, muVar2, 0), ih1.a(en1.Q(this.f11225b)), 14);
    }
}
