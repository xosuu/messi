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
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;

/* JADX INFO: loaded from: classes.dex */
public final class ws extends RewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ns f10321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10322c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnAdMetadataChangedListener f10324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnPaidEventListener f10325f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public FullScreenContentCallback f10326g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f10327h = System.currentTimeMillis();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final at f10323d = new at();

    public ws(Context context, String str) {
        this.f10322c = context.getApplicationContext();
        this.f10320a = str;
        this.f10321b = zzay.zza().zzq(context, str, new pn());
    }

    public final void a(zzdx zzdxVar, RewardedAdLoadCallback rewardedAdLoadCallback) {
        ns nsVar = this.f10321b;
        if (nsVar != null) {
            try {
                zzdxVar.zzq(this.f10327h);
                nsVar.zzf(zzp.zza.zza(this.f10322c, zzdxVar), new ys(rewardedAdLoadCallback, this, 0));
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final Bundle getAdMetadata() {
        try {
            ns nsVar = this.f10321b;
            if (nsVar != null) {
                return nsVar.zzb();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final String getAdUnitId() {
        return this.f10320a;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.f10326g;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f10324e;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.f10325f;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzc = null;
        try {
            ns nsVar = this.f10321b;
            if (nsVar != null) {
                zzdnVarZzc = nsVar.zzc();
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
        return ResponseInfo.zzb(zzdnVarZzc);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final RewardItem getRewardItem() {
        try {
            ns nsVar = this.f10321b;
            ks ksVarZzd = nsVar != null ? nsVar.zzd() : null;
            return ksVarZzd == null ? RewardItem.DEFAULT_REWARD : new aa(5, ksVarZzd);
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
            return RewardItem.DEFAULT_REWARD;
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.f10326g = fullScreenContentCallback;
        this.f10323d.f2785a = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setImmersiveMode(boolean z9) {
        try {
            ns nsVar = this.f10321b;
            if (nsVar != null) {
                nsVar.zzh(z9);
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        try {
            this.f10324e = onAdMetadataChangedListener;
            ns nsVar = this.f10321b;
            if (nsVar != null) {
                nsVar.zzi(new com.google.android.gms.ads.internal.client.zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.f10325f = onPaidEventListener;
            ns nsVar = this.f10321b;
            if (nsVar != null) {
                nsVar.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e10) {
            zzm.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        if (serverSideVerificationOptions != null) {
            try {
                ns nsVar = this.f10321b;
                if (nsVar != null) {
                    nsVar.zzl(new zzbwu(serverSideVerificationOptions));
                }
            } catch (RemoteException e10) {
                zzm.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // com.google.android.gms.ads.rewarded.RewardedAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        at atVar = this.f10323d;
        atVar.f2786b = onUserEarnedRewardListener;
        if (activity == null) {
            zzm.zzj("The activity for show is null, will proceed with show using the context provided when loading the ad.");
        }
        ns nsVar = this.f10321b;
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
