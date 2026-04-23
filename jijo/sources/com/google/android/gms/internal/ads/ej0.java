package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f4207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4208b;

    public ej0(nh1 nh1Var, kh1 kh1Var) {
        this.f4207a = nh1Var;
        this.f4208b = kh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new pi0(1, (Context) this.f4207a.zzb(), (i80) this.f4208b.zzb());
    }
}
