package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes.dex */
public final class ne0 extends AppOpenAd.AppOpenAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f7251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ te0 f7252c;

    public ne0(te0 te0Var, String str, String str2) {
        this.f7250a = str;
        this.f7251b = str2;
        this.f7252c = te0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f7252c.z1(te0.y1(loadAdError), this.f7251b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        this.f7252c.u1(appOpenAd, this.f7250a, this.f7251b);
    }
}
