package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class zzh extends zzbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdLoadCallback f2052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2053b;

    public zzh(AdLoadCallback adLoadCallback, Object obj) {
        this.f2052a = adLoadCallback;
        this.f2053b = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb(zze zzeVar) {
        AdLoadCallback adLoadCallback = this.f2052a;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc() {
        Object obj;
        AdLoadCallback adLoadCallback = this.f2052a;
        if (adLoadCallback == null || (obj = this.f2053b) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }
}
