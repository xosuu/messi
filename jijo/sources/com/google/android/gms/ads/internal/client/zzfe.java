package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzfe extends zzdf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OnPaidEventListener f2049a;

    public zzfe(OnPaidEventListener onPaidEventListener) {
        this.f2049a = onPaidEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzsVar) {
        OnPaidEventListener onPaidEventListener = this.f2049a;
        if (onPaidEventListener != null) {
            onPaidEventListener.onPaidEvent(AdValue.zza(zzsVar.zzb, zzsVar.zzc, zzsVar.zzd));
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() {
        return this.f2049a == null;
    }
}
