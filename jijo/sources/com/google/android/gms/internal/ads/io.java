package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.NativeAdMapper;

/* JADX INFO: loaded from: classes.dex */
public final class io implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wn f5658b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo f5659d;

    public /* synthetic */ io(jo joVar, wn wnVar, int i10) {
        this.f5657a = i10;
        this.f5658b = wnVar;
        this.f5659d = joVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i10 = this.f5657a;
        jo joVar = this.f5659d;
        wn wnVar = this.f5658b;
        switch (i10) {
            case 0:
                try {
                    zzm.zze(joVar.f6034a.getClass().getCanonicalName() + "failed to loaded mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    wnVar.X(adError.zza());
                    wnVar.N(adError.getCode(), adError.getMessage());
                    wnVar.c(adError.getCode());
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
                break;
            case 1:
                try {
                    zzm.zze(joVar.f6034a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    wnVar.X(adError.zza());
                    wnVar.N(adError.getCode(), adError.getMessage());
                    wnVar.c(adError.getCode());
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                    return;
                }
                break;
            default:
                try {
                    zzm.zze(joVar.f6034a.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + adError.getCode() + ". ErrorMessage = " + adError.getMessage() + ". ErrorDomain = " + adError.getDomain());
                    wnVar.X(adError.zza());
                    wnVar.N(adError.getCode(), adError.getMessage());
                    wnVar.c(adError.getCode());
                } catch (RemoteException e12) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                    return;
                }
                break;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final /* bridge */ /* synthetic */ Object onSuccess(Object obj) {
        int i10 = this.f5657a;
        jo joVar = this.f5659d;
        wn wnVar = this.f5658b;
        switch (i10) {
            case 0:
                try {
                    joVar.f6039q = (MediationInterstitialAd) obj;
                    wnVar.zzo();
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
                break;
            case 1:
                try {
                    joVar.f6041t = (NativeAdMapper) obj;
                    wnVar.zzo();
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                }
                break;
            default:
                try {
                    joVar.f6044w = (MediationAppOpenAd) obj;
                    wnVar.zzo();
                } catch (RemoteException e12) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                }
                break;
        }
        return new jp0(6, wnVar);
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f5657a) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 1:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                wn wnVar = this.f5658b;
                try {
                    zzm.zze(this.f5659d.f6034a.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
                    wnVar.N(0, str);
                    wnVar.c(0);
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
                break;
        }
    }
}
