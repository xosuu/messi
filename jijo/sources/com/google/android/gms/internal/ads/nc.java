package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes.dex */
public final class nc extends tc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppOpenAd.AppOpenAdLoadCallback f7241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7242b;

    public nc(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
        this.f7241a = appOpenAdLoadCallback;
        this.f7242b = str;
    }

    @Override // com.google.android.gms.internal.ads.uc
    public final void Z0(rc rcVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f7241a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new oc(rcVar, this.f7242b));
        }
    }

    @Override // com.google.android.gms.internal.ads.uc
    public final void q0(zze zzeVar) {
        AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.f7241a;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.google.android.gms.internal.ads.uc
    public final void zzb(int i10) {
    }
}
