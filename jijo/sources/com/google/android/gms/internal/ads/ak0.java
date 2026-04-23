package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ak0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f2719b;

    public ak0(nh1 nh1Var, kh1 kh1Var) {
        this.f2718a = nh1Var;
        this.f2719b = kh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new pi0(2, (Context) this.f2718a.zzb(), (ec0) this.f2719b.zzb());
    }
}
