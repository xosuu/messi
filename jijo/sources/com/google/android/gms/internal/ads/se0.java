package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class se0 extends RewardedInterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ te0 f8849c;

    public se0(te0 te0Var, String str, String str2) {
        this.f8847a = str;
        this.f8848b = str2;
        this.f8849c = te0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f8849c.z1(te0.y1(loadAdError), this.f8848b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedInterstitialAd rewardedInterstitialAd) {
        this.f8849c.u1(rewardedInterstitialAd, this.f8847a, this.f8848b);
    }
}
