package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class ag0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f2676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f2677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f2678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f2679e;

    public ag0(sf0 sf0Var, z00 z00Var, nh1 nh1Var, jy jyVar, ry ryVar) {
        this.f2675a = sf0Var;
        this.f2676b = z00Var;
        this.f2677c = nh1Var;
        this.f2678d = jyVar;
        this.f2679e = ryVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tl0 zzb() {
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        rf0 rf0VarZzb = ((sf0) this.f2675a).zzb();
        eh1 eh1VarA = ih1.a(en1.Q(this.f2676b));
        gt0 gt0Var = (gt0) this.f2677c.zzb();
        Context contextA = ((jy) this.f2678d).a();
        VersionInfoParcel versionInfoParcelA = ((ry) this.f2679e).a();
        tl0 tl0Var = new tl0();
        tl0Var.f9185a = muVar;
        tl0Var.f9186b = rf0VarZzb;
        tl0Var.f9188f = eh1VarA;
        tl0Var.f9189h = gt0Var;
        tl0Var.f9187d = contextA;
        tl0Var.f9190q = versionInfoParcelA;
        return tl0Var;
    }
}
