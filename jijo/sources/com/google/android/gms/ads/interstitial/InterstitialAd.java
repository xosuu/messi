package com.google.android.gms.ads.interstitial;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.gm;
import com.google.android.gms.internal.ads.jh;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class InterstitialAd {
    public static void load(final Context context, final String str, final AdRequest adRequest, final InterstitialAdLoadCallback interstitialAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("AdUnitId cannot be null.");
        }
        if (adRequest == null) {
            throw new NullPointerException("AdRequest cannot be null.");
        }
        if (interstitialAdLoadCallback == null) {
            throw new NullPointerException("LoadCallback cannot be null.");
        }
        a.j("#008 Must be called on the main UI thread.");
        eg.a(context);
        if (((Boolean) jh.f5947i.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.interstitial.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new gm(context2, str2).a(adRequest2.zza(), interstitialAdLoadCallback);
                        } catch (IllegalStateException e10) {
                            cr.a(context2).e("InterstitialAd.load", e10);
                        }
                    }
                });
                return;
            }
        }
        new gm(context, str).a(adRequest.zza(), interstitialAdLoadCallback);
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z9);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);
}
