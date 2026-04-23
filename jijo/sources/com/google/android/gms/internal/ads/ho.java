package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: loaded from: classes.dex */
public final class ho implements MediationAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wn f5356b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo f5357d;

    public /* synthetic */ ho(jo joVar, wn wnVar, int i10) {
        this.f5355a = i10;
        this.f5356b = wnVar;
        this.f5357d = joVar;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        int i10 = this.f5355a;
        jo joVar = this.f5357d;
        wn wnVar = this.f5356b;
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
        int i10 = this.f5355a;
        jo joVar = this.f5357d;
        wn wnVar = this.f5356b;
        switch (i10) {
            case 0:
                try {
                    joVar.f6038h = ((MediationBannerAd) obj).getView();
                    wnVar.zzo();
                    break;
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
                return new jp0(6, wnVar);
            case 1:
                try {
                    joVar.f6040s = (UnifiedNativeAdMapper) obj;
                    wnVar.zzo();
                    break;
                } catch (RemoteException e11) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
                }
                return new jp0(6, wnVar);
            default:
                try {
                    joVar.f6042u = (MediationRewardedAd) obj;
                    wnVar.zzo();
                    break;
                } catch (RemoteException e12) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
                }
                return new i10(10, wnVar);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(String str) {
        switch (this.f5355a) {
            case 0:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            case 1:
                onFailure(new AdError(0, str, AdError.UNDEFINED_DOMAIN));
                break;
            default:
                wn wnVar = this.f5356b;
                try {
                    zzm.zze(this.f5357d.f6034a.getClass().getCanonicalName() + "failed to loaded mediation ad: " + str);
                    wnVar.N(0, str);
                    wnVar.c(0);
                } catch (RemoteException e10) {
                    zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
                }
                break;
        }
    }
}
