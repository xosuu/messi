package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class at extends ps {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public FullScreenContentCallback f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public OnUserEarnedRewardListener f2786b;

    @Override // com.google.android.gms.internal.ads.qs
    public final void G0(zze zzeVar) {
        FullScreenContentCallback fullScreenContentCallback = this.f2785a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(zzeVar.zza());
        }
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void Z(ks ksVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f2786b;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new aa(5, ksVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void f(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f2785a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f2785a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzg() {
        FullScreenContentCallback fullScreenContentCallback = this.f2785a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.qs
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.f2785a;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }
}
