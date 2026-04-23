package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class ys extends ts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdLoadCallback f11026b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11027d;

    public /* synthetic */ ys(AdLoadCallback adLoadCallback, Object obj, int i10) {
        this.f11025a = i10;
        this.f11026b = adLoadCallback;
        this.f11027d = obj;
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zze(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zzf(zze zzeVar) {
        int i10 = this.f11025a;
        AdLoadCallback adLoadCallback = this.f11026b;
        switch (i10) {
            case 0:
                RewardedAdLoadCallback rewardedAdLoadCallback = (RewardedAdLoadCallback) adLoadCallback;
                if (rewardedAdLoadCallback != null) {
                    rewardedAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
                }
                break;
            default:
                RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = (RewardedInterstitialAdLoadCallback) adLoadCallback;
                if (rewardedInterstitialAdLoadCallback != null) {
                    rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.us
    public final void zzg() {
        bt btVar;
        int i10 = this.f11025a;
        Object obj = this.f11027d;
        AdLoadCallback adLoadCallback = this.f11026b;
        switch (i10) {
            case 0:
                RewardedAdLoadCallback rewardedAdLoadCallback = (RewardedAdLoadCallback) adLoadCallback;
                if (rewardedAdLoadCallback != null) {
                    rewardedAdLoadCallback.onAdLoaded((RewardedAd) obj);
                }
                break;
            default:
                RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = (RewardedInterstitialAdLoadCallback) adLoadCallback;
                if (rewardedInterstitialAdLoadCallback != null && (btVar = (bt) obj) != null) {
                    rewardedInterstitialAdLoadCallback.onAdLoaded(btVar);
                    break;
                }
                break;
        }
    }
}
