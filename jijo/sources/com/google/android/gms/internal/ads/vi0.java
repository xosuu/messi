package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class vi0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9864b;

    public vi0(nh1 nh1Var, kh1 kh1Var) {
        this.f9863a = nh1Var;
        this.f9864b = kh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new ui0((Context) this.f9863a.zzb(), (z10) this.f9864b.zzb());
    }
}
