package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f8193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f8194b;

    public qi0(nh1 nh1Var, kh1 kh1Var) {
        this.f8193a = nh1Var;
        this.f8194b = kh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new pi0(0, (Context) this.f8193a.zzb(), (d10) this.f8194b.zzb());
    }
}
