package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class pj0 extends nj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gy f7890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tl0 f7891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rk0 f7892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u60 f7893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p80 f7894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r50 f7895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ViewGroup f7896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k60 f7897h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tj0 f7898i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final gi0 f7899j;

    public pj0(gy gyVar, tl0 tl0Var, rk0 rk0Var, u60 u60Var, p80 p80Var, r50 r50Var, ViewGroup viewGroup, k60 k60Var, tj0 tj0Var, gi0 gi0Var) {
        this.f7890a = gyVar;
        this.f7891b = tl0Var;
        this.f7892c = rk0Var;
        this.f7893d = u60Var;
        this.f7894e = p80Var;
        this.f7895f = r50Var;
        this.f7896g = viewGroup;
        this.f7897h = k60Var;
        this.f7898i = tj0Var;
        this.f7899j = gi0Var;
    }

    @Override // com.google.android.gms.internal.ads.nj0
    public final ts0 c(or0 or0Var, Bundle bundle, fr0 fr0Var, kr0 kr0Var) {
        tl0 tl0Var = this.f7891b;
        tl0Var.f9185a = or0Var;
        tl0Var.f9186b = bundle;
        tl0Var.f9189h = new ep(kr0Var, fr0Var, this.f7898i, 6, 0);
        if (((Boolean) zzba.zzc().a(eg.f4026i3)).booleanValue()) {
            tl0Var.f9190q = this.f7899j;
        }
        l2.l lVar = new l2.l(((zy) this.f7890a).f11340c);
        lVar.f15165h = new z30(tl0Var);
        lVar.f15164f = this.f7893d;
        lVar.f15166q = this.f7892c;
        lVar.f15170v = this.f7894e;
        lVar.f15167s = new m20(this.f7895f, 0, this.f7897h);
        lVar.f15169u = new i10(0, this.f7896g);
        f30 f30Var = (f30) lVar.p().X.zzb();
        return f30Var.a(f30Var.b());
    }
}
