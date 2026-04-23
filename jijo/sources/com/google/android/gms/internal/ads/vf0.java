package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vf0 implements xf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p21 f9836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s50 f9837c;

    public vf0(Map map, mu muVar, s50 s50Var) {
        this.f9835a = map;
        this.f9836b = muVar;
        this.f9837c = s50Var;
    }

    @Override // com.google.android.gms.internal.ads.xf0
    public final n5.a a(zzbvb zzbvbVar) {
        this.f9837c.J(zzbvbVar);
        n5.a aVarZ = tc1.Z(new zzdwl(3));
        for (String str : ((String) zzba.zzc().a(eg.f4131s7)).split(",")) {
            qh1 qh1Var = (qh1) this.f9835a.get(str.trim());
            if (qh1Var != null) {
                aVarZ = tc1.V(aVarZ, zzdwl.class, new jn(qh1Var, 8, zzbvbVar), this.f9836b);
            }
        }
        tc1.u0(aVarZ, new jp0(17, this), nu.f7388f);
        return aVarZ;
    }
}
