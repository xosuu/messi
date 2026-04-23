package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;

/* JADX INFO: loaded from: classes.dex */
public final class ty implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9304b;

    public ty(jy jyVar, nh1 nh1Var) {
        this.f9303a = jyVar;
        this.f9304b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rr zzb() {
        Context contextA = ((jy) this.f9303a).a();
        gt0 gt0Var = (gt0) this.f9304b.zzb();
        fn fnVarB = zzu.zzf().b(contextA, VersionInfoParcel.forPackage(), gt0Var);
        pe peVar = en.f4244b;
        fnVarB.getClass();
        return new rr(contextA, zzu.zzf().b(contextA, VersionInfoParcel.forPackage(), gt0Var).a("google.afma.sdkConstants.getSdkConstants", peVar, peVar), VersionInfoParcel.forPackage());
    }
}
