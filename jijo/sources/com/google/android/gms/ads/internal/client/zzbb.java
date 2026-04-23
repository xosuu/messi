package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: loaded from: classes.dex */
public final class zzbb extends zzch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FullScreenContentCallback f1975a;

    public zzbb(FullScreenContentCallback fullScreenContentCallback) {
        this.f1975a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() {
        FullScreenContentCallback fullScreenContentCallback = this.f1975a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f1975a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f1975a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f1975a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f1975a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
