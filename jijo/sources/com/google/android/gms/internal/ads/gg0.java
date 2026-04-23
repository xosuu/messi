package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class gg0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f4906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f4908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f4909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f4910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f4911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f4912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f4913h;

    public gg0(t50 t50Var, bg0 bg0Var, nh1 nh1Var, f40 f40Var, ry ryVar, nh1 nh1Var2, nh1 nh1Var3, jy jyVar) {
        this.f4906a = t50Var;
        this.f4907b = bg0Var;
        this.f4908c = nh1Var;
        this.f4909d = f40Var;
        this.f4910e = ryVar;
        this.f4911f = nh1Var2;
        this.f4912g = nh1Var3;
        this.f4913h = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final l2.l zzb() {
        s50 s50Var = new s50(((oh1) ((t50) this.f4906a).f9055a).zzb());
        xq xqVarZzb = ((bg0) this.f4907b).zzb();
        xs0 xs0Var = (xs0) this.f4908c.zzb();
        or0 or0VarA = ((f40) this.f4909d).a();
        VersionInfoParcel versionInfoParcelA = ((ry) this.f4910e).a();
        gt0 gt0Var = (gt0) this.f4911f.zzb();
        ft0 ft0Var = (ft0) this.f4912g.zzb();
        Context contextA = ((jy) this.f4913h).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new l2.l(s50Var, xqVarZzb, xs0Var, or0VarA, versionInfoParcelA, gt0Var, ft0Var, contextA, muVar);
    }
}
