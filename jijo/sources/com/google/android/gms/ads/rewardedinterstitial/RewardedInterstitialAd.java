package com.google.android.gms.ads.rewardedinterstitial;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.internal.ads.bt;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jh;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class RewardedInterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adRequest == null) {
            throw new NullPointerException("AdRequest cannot be null.");
        }
        if (rewardedInterstitialAdLoadCallback == null) {
            throw new NullPointerException("LoadCallback cannot be null.");
        }
        a.j("#008 Must be called on the main UI thread.");
        eg.a(context);
        if (((Boolean) jh.f5949k.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new bt(context2, str2).a(adRequest2.zza(), rewardedInterstitialAdLoadCallback);
                        } catch (IllegalStateException e10) {
                            cr.a(context2).e("RewardedInterstitialAd.load", e10);
                        }
                    }
                });
                return;
            }
        }
        new bt(context, str).a(adRequest.zza(), rewardedInterstitialAdLoadCallback);
    }

    public abstract Bundle getAdMetadata();

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnAdMetadataChangedListener getOnAdMetadataChangedListener();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract RewardItem getRewardItem();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z9);

    public abstract void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions);

    public abstract void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener);

    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, final RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adManagerAdRequest == null) {
            throw new NullPointerException("AdManagerAdRequest cannot be null.");
        }
        if (rewardedInterstitialAdLoadCallback != null) {
            a.j("#008 Must be called on the main UI thread.");
            eg.a(context);
            if (((Boolean) jh.f5949k.k()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.rewardedinterstitial.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            String str2 = str;
                            AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                            try {
                                new bt(context2, str2).a(adManagerAdRequest2.zza(), rewardedInterstitialAdLoadCallback);
                            } catch (IllegalStateException e10) {
                                cr.a(context2).e("RewardedInterstitialAdManager.load", e10);
                            }
                        }
                    });
                    return;
                }
            }
            new bt(context, str).a(adManagerAdRequest.zza(), rewardedInterstitialAdLoadCallback);
            return;
        }
        throw new NullPointerException("LoadCallback cannot be null.");
    }
}
