package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class re0 extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ te0 f8584c;

    public re0(te0 te0Var, String str, String str2) {
        this.f8582a = str;
        this.f8583b = str2;
        this.f8584c = te0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f8584c.z1(te0.y1(loadAdError), this.f8583b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(RewardedAd rewardedAd) {
        this.f8584c.u1(rewardedAd, this.f8582a, this.f8583b);
    }
}
