package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class un0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f9542c;

    public un0(j10 j10Var, nh1 nh1Var, oh1 oh1Var) {
        this.f9540a = j10Var;
        this.f9541b = nh1Var;
        this.f9542c = oh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final im0 zzb() {
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new im0(muVar, (ViewGroup) ((j10) this.f9540a).f5767a.f5456b, (Context) this.f9541b.zzb(), ((oh1) this.f9542c).zzb(), 4);
    }
}
