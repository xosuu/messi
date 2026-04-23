package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.AdListener;

/* JADX INFO: loaded from: classes.dex */
public final class zzg extends zzbg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdListener f2051a;

    public zzg(AdListener adListener) {
        this.f2051a = adListener;
    }

    public final AdListener zzb() {
        return this.f2051a;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        AdListener adListener = this.f2051a;
        if (adListener != null) {
            adListener.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        AdListener adListener = this.f2051a;
        if (adListener != null) {
            adListener.onAdClosed();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        AdListener adListener = this.f2051a;
        if (adListener != null) {
            adListener.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        AdListener adListener = this.f2051a;
        if (adListener != null) {
            adListener.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        AdListener adListener = this.f2051a;
        if (adListener != null) {
            adListener.onAdLoaded();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        AdListener adListener = this.f2051a;
        if (adListener != null) {
            adListener.onAdOpened();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        AdListener adListener = this.f2051a;
        if (adListener != null) {
            adListener.onAdSwipeGestureClicked();
        }
    }
}
