package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class pe0 extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ te0 f7863c;

    public pe0(te0 te0Var, String str, String str2) {
        this.f7861a = str;
        this.f7862b = str2;
        this.f7863c = te0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f7863c.z1(te0.y1(loadAdError), this.f7862b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        this.f7863c.u1(interstitialAd, this.f7861a, this.f7862b);
    }
}
