package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: loaded from: classes.dex */
public final class iq0 implements gx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xq f5674b;

    public /* synthetic */ iq0(xq xqVar, int i10) {
        this.f5673a = i10;
        this.f5674b = xqVar;
    }

    @Override // com.google.android.gms.internal.ads.gx0
    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        int i10 = this.f5673a;
        xq xqVar = this.f5674b;
        switch (i10) {
            case 0:
                zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (zzdyp) obj);
                zze.zza("Failed to get a cache key, reverting to legacy flow.");
                jq0 jq0Var = new jq0(null, xqVar.B());
                xqVar.f10633h = jq0Var;
                return jq0Var;
            default:
                zzbvb zzbvbVar = (zzbvb) obj;
                jq0 jq0Var2 = new jq0(zzbvbVar, new hs0(zzbvbVar.f11583v));
                xqVar.f10633h = jq0Var2;
                return jq0Var2;
        }
    }
}
