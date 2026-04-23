package com.google.android.gms.internal.ads;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public final class vn0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9926b;

    public vn0(jy jyVar, nh1 nh1Var) {
        this.f9925a = jyVar;
        this.f9926b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new am0(((jy) this.f9925a).a(), 3, (Intent) this.f9926b.zzb());
    }
}
