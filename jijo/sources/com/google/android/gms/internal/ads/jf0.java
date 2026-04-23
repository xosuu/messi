package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class jf0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f5926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f5927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f5928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f5929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f5930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f5931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f5932g;

    public jf0(kh1 kh1Var, jy jyVar, ry ryVar, nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4) {
        this.f5926a = kh1Var;
        this.f5927b = jyVar;
        this.f5928c = ryVar;
        this.f5929d = nh1Var;
        this.f5930e = nh1Var2;
        this.f5931f = nh1Var3;
        this.f5932g = nh1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jt zzb() {
        gy gyVar = (gy) this.f5926a.zzb();
        Context contextA = ((jy) this.f5927b).a();
        VersionInfoParcel versionInfoParcelA = ((ry) this.f5928c).a();
        or0 or0VarA = ((f40) this.f5929d).a();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        String str = (String) this.f5930e.zzb();
        ft0 ft0Var = (ft0) this.f5931f.zzb();
        cd0 cd0Var = (cd0) this.f5932g.zzb();
        jt jtVar = new jt();
        jtVar.f6080i = new Object();
        jtVar.f6072a = gyVar;
        jtVar.f6073b = contextA;
        jtVar.f6074c = versionInfoParcelA;
        jtVar.f6075d = or0VarA;
        jtVar.f6076e = muVar;
        jtVar.f6077f = str;
        jtVar.f6078g = ft0Var;
        jtVar.f6079h = cd0Var;
        return jtVar;
    }
}
