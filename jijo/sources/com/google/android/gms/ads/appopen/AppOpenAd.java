package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jh;
import com.google.android.gms.internal.ads.yc;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    public @interface AppOpenAdOrientation {
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdRequest adRequest, @AppOpenAdOrientation final int i10, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adRequest == null) {
            throw new NullPointerException("AdRequest cannot be null.");
        }
        a.j("#008 Must be called on the main UI thread.");
        eg.a(context);
        if (((Boolean) jh.f5942d.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i11 = i10;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new yc(context2, str2, adRequest2.zza(), i11, appOpenAdLoadCallback).a();
                        } catch (IllegalStateException e10) {
                            cr.a(context2).e("AppOpenAd.load", e10);
                        }
                    }
                });
                return;
            }
        }
        new yc(context, str, adRequest.zza(), i10, appOpenAdLoadCallback).a();
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z9);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);

    public static void load(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adRequest != null) {
            a.j("#008 Must be called on the main UI thread.");
            eg.a(context);
            if (((Boolean) jh.f5942d.k()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            String str2 = str;
                            AdRequest adRequest2 = adRequest;
                            try {
                                new yc(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).a();
                            } catch (IllegalStateException e10) {
                                cr.a(context2).e("AppOpenAd.load", e10);
                            }
                        }
                    });
                    return;
                }
            }
            new yc(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).a();
            return;
        }
        throw new NullPointerException("AdRequest cannot be null.");
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i10, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null.");
        }
        if (str == null) {
            throw new NullPointerException("adUnitId cannot be null.");
        }
        if (adManagerAdRequest != null) {
            a.j("#008 Must be called on the main UI thread.");
            eg.a(context);
            if (((Boolean) jh.f5942d.k()).booleanValue()) {
                if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                    com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                        @Override // java.lang.Runnable
                        public final void run() {
                            Context context2 = context;
                            int i11 = i10;
                            String str2 = str;
                            AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                            try {
                                new yc(context2, str2, adManagerAdRequest2.zza(), i11, appOpenAdLoadCallback).a();
                            } catch (IllegalStateException e10) {
                                cr.a(context2).e("AppOpenAdManager.load", e10);
                            }
                        }
                    });
                    return;
                }
            }
            new yc(context, str, adManagerAdRequest.zza(), i10, appOpenAdLoadCallback).a();
            return;
        }
        throw new NullPointerException("AdManagerAdRequest cannot be null.");
    }
}
