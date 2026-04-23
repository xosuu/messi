package com.google.ads.mediation;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.hj;
import com.google.android.gms.internal.ads.te0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AdListener implements zzi, zzg, zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1856a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1857b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f1858d;

    public e(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f1857b = abstractAdViewAdapter;
        this.f1858d = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        switch (this.f1856a) {
            case 0:
                ((MediationNativeListener) this.f1858d).onAdClicked((AbstractAdViewAdapter) this.f1857b);
                break;
            default:
                super.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        switch (this.f1856a) {
            case 0:
                ((MediationNativeListener) this.f1858d).onAdClosed((AbstractAdViewAdapter) this.f1857b);
                break;
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        int i10 = this.f1856a;
        Object obj = this.f1857b;
        Object obj2 = this.f1858d;
        switch (i10) {
            case 0:
                ((MediationNativeListener) obj2).onAdFailedToLoad((AbstractAdViewAdapter) obj, loadAdError);
                break;
            default:
                ((te0) obj2).z1(te0.y1(loadAdError), (String) obj);
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        switch (this.f1856a) {
            case 0:
                ((MediationNativeListener) this.f1858d).onAdImpression((AbstractAdViewAdapter) this.f1857b);
                break;
            default:
                super.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        switch (this.f1856a) {
            case 0:
                break;
            default:
                super.onAdLoaded();
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        switch (this.f1856a) {
            case 0:
                ((MediationNativeListener) this.f1858d).onAdOpened((AbstractAdViewAdapter) this.f1857b);
                break;
            default:
                super.onAdOpened();
                break;
        }
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        a aVar = new a();
        aVar.setHeadline(unifiedNativeAd.zzh());
        aVar.setImages(unifiedNativeAd.zzk());
        aVar.setBody(unifiedNativeAd.zzf());
        aVar.setIcon(unifiedNativeAd.zzb());
        aVar.setCallToAction(unifiedNativeAd.zzg());
        aVar.setAdvertiser(unifiedNativeAd.zze());
        aVar.setStarRating(unifiedNativeAd.zzc());
        aVar.setStore(unifiedNativeAd.zzj());
        aVar.setPrice(unifiedNativeAd.zzi());
        aVar.zzd(unifiedNativeAd.zzd());
        aVar.setOverrideImpressionRecording(true);
        aVar.setOverrideClickHandling(true);
        aVar.zze(unifiedNativeAd.zza());
        ((MediationNativeListener) this.f1858d).onAdLoaded((AbstractAdViewAdapter) this.f1857b, aVar);
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(hj hjVar, String str) {
        ((MediationNativeListener) this.f1858d).zze((AbstractAdViewAdapter) this.f1857b, hjVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(hj hjVar) {
        ((MediationNativeListener) this.f1858d).zzd((AbstractAdViewAdapter) this.f1857b, hjVar);
    }

    public e(te0 te0Var, String str) {
        this.f1857b = str;
        this.f1858d = te0Var;
    }
}
