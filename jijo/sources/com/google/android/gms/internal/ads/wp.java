package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes.dex */
public final class wp extends wj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAd.OnNativeAdLoadedListener f10273a;

    public wp(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f10273a = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void L0(gk gkVar) {
        this.f10273a.onNativeAdLoaded(new rp(gkVar));
    }
}
