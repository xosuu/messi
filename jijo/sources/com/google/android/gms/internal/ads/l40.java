package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l40 implements s60, b60, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zze f6488b;

    public /* synthetic */ l40(int i10, zze zzeVar) {
        this.f6487a = i10;
        this.f6488b = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f6487a;
        zze zzeVar = this.f6488b;
        switch (i10) {
            case 0:
                ((n40) obj).t(zzeVar);
                break;
            case 1:
                ((u40) obj).a(zzeVar);
                break;
            case 2:
                ((kl0) obj).a(zzeVar);
                break;
            case 3:
                ((zzbh) obj).zzf(zzeVar);
                break;
            case 4:
                ((xc) obj).zzd(zzeVar);
                break;
            default:
                ((uc) obj).zzb(zzeVar.zza);
                break;
        }
    }
}
