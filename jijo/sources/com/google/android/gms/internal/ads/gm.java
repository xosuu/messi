package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzh;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class gm extends AdManagerInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzp f4959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbu f4960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f4962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AppEventListener f4963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FullScreenContentCallback f4964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OnPaidEventListener f4965h;

    public gm(Context context, String str) {
        pn pnVar = new pn();
        this.f4962e = System.currentTimeMillis();
        this.f4958a = context;
        this.f4961d = str;
        this.f4959b = zzp.zza;
        this.f4960c = zzay.zza().zze(context, new zzq(), str, pnVar);
    }

    public final void a(zzdx zzdxVar, AdLoadCallback adLoadCallback) {
        zzbu zzbuVar = this.f4960c;
        if (zzbuVar != null) {
            try {
                zzdxVar.zzq(this.f4962e);
                zzbuVar.zzy(this.f4959b.zza(this.f4958a, zzdxVar), new zzh(adLoadCallback, this));
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
                adLoadCallback.onAdFailedToLoad(new LoadAdError(0, "Internal Error.", MobileAds.ERROR_DOMAIN, null, null));
            }
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final String getAdUnitId() {
        return this.f4961d;
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final AppEventListener getAppEventListener() {
        return this.f4963f;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f4964g;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f4965h;
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzk = null;
        try {
            zzbu zzbuVar = this.f4960c;
            if (zzbuVar != null) {
                zzdnVarZzk = zzbuVar.zzk();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzdnVarZzk);
    }

    @Override // com.google.android.gms.ads.admanager.AdManagerInterstitialAd
    public final void setAppEventListener(AppEventListener appEventListener) {
        try {
            this.f4963f = appEventListener;
            zzbu zzbuVar = this.f4960c;
            if (zzbuVar != null) {
                zzbuVar.zzG(appEventListener != null ? new zb(appEventListener) : null);
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        try {
            this.f4964g = fullScreenContentCallback;
            zzbu zzbuVar = this.f4960c;
            if (zzbuVar != null) {
                zzbuVar.zzJ(new zzbb(fullScreenContentCallback));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setImmersiveMode(boolean z9) {
        try {
            zzbu zzbuVar = this.f4960c;
            if (zzbuVar != null) {
                zzbuVar.zzL(z9);
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f4965h = onPaidEventListener;
            zzbu zzbuVar = this.f4960c;
            if (zzbuVar != null) {
                zzbuVar.zzP(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        if (activity == null) {
            zzm.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        try {
            zzbu zzbuVar = this.f4960c;
            if (zzbuVar != null) {
                zzbuVar.zzW(new a4.b(activity));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }
}
