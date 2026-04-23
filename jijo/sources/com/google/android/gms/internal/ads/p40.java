package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p40 implements s60, fq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zze f7802b;

    public /* synthetic */ p40(int i10, zze zzeVar) {
        this.f7801a = i10;
        this.f7802b = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.s60, com.google.android.gms.internal.ads.b60, com.google.android.gms.internal.ads.fq0
    /* JADX INFO: renamed from: zza */
    public final void mo5zza(Object obj) {
        int i10 = this.f7801a;
        zze zzeVar = this.f7802b;
        switch (i10) {
            case 0:
                ((o40) obj).j(zzeVar);
                break;
            case 1:
                ((zzbh) obj).zze(zzeVar.zza);
                break;
            default:
                ((qs) obj).G0(zzeVar);
                break;
        }
    }
}
