package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzs;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z50 implements b60, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzs f11152b;

    public /* synthetic */ z50(zzs zzsVar, int i10) {
        this.f11151a = i10;
        this.f11152b = zzsVar;
    }

    @Override // com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f11151a;
        zzs zzsVar = this.f11152b;
        switch (i10) {
            case 0:
                ((wq0) obj).h(zzsVar);
                break;
            default:
                ((zzdg) obj).zze(zzsVar);
                break;
        }
    }
}
