package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y50 implements b60, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzs f10785b;

    public /* synthetic */ y50(zzs zzsVar, int i10) {
        this.f10784a = i10;
        this.f10785b = zzsVar;
    }

    @Override // com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f10784a;
        zzs zzsVar = this.f10785b;
        switch (i10) {
            case 0:
                ((kl0) obj).h(zzsVar);
                break;
            case 1:
                ((zzdg) obj).zze(zzsVar);
                break;
            default:
                ((zzdg) obj).zze(zzsVar);
                break;
        }
    }
}
