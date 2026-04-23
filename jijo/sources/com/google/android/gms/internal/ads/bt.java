package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes.dex */
public final class bt extends RewardedInterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns f3096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f3097c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FullScreenContentCallback f3099e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnAdMetadataChangedListener f3100f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnPaidEventListener f3101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f3102h = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final at f3098d = new at();

    public bt(Context context, String str) {
        this.f3095a = str;
        this.f3097c = context.getApplicationContext();
        this.f3096b = zzay.zza().zzq(context, str, new pn());
    }

    public final void a(zzdx zzdxVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        ns nsVar = this.f3096b;
        if (nsVar != null) {
            try {
                zzdxVar.zzq(this.f3102h);
                nsVar.zzg(zzp.zza.zza(this.f3097c, zzdxVar), new ys(rewardedInterstitialAdLoadCallback, this, 1));
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            ns nsVar = this.f3096b;
            if (nsVar != null) {
                return nsVar.zzb();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.f3095a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f3099e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f3100f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f3101g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzc = null;
        try {
            ns nsVar = this.f3096b;
            if (nsVar != null) {
                zzdnVarZzc = nsVar.zzc();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzdnVarZzc);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            ns nsVar = this.f3096b;
            ks ksVarZzd = nsVar != null ? nsVar.zzd() : null;
            if (ksVarZzd != null) {
                return new aa(5, ksVarZzd);
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f3099e = fullScreenContentCallback;
        this.f3098d.f2785a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z9) {
        try {
            ns nsVar = this.f3096b;
            if (nsVar != null) {
                nsVar.zzh(z9);
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f3100f = onAdMetadataChangedListener;
        try {
            ns nsVar = this.f3096b;
            if (nsVar != null) {
                nsVar.zzi(new com.google.android.gms.ads.internal.client.zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f3101g = onPaidEventListener;
        try {
            ns nsVar = this.f3096b;
            if (nsVar != null) {
                nsVar.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            ns nsVar = this.f3096b;
            if (nsVar != null) {
                nsVar.zzl(new zzbwu(serverSideVerificationOptions));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        at atVar = this.f3098d;
        atVar.f2786b = onUserEarnedRewardListener;
        ns nsVar = this.f3096b;
        if (nsVar != null) {
            try {
                nsVar.zzk(atVar);
                nsVar.zzm(new a4.b(activity));
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }
}
