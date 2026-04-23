package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzci;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a60 implements b60, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zze f2608b;

    public /* synthetic */ a60(int i10, zze zzeVar) {
        this.f2607a = i10;
        this.f2608b = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f2607a;
        zze zzeVar = this.f2608b;
        switch (i10) {
            case 0:
                ((wq0) obj).a(zzeVar);
                break;
            case 1:
                ((zzci) obj).zzd(zzeVar);
                break;
            case 2:
                ((uc) obj).q0(zzeVar);
                break;
            default:
                ((us) obj).zzf(zzeVar);
                break;
        }
    }
}
