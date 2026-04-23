package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jh;
import com.google.android.gms.internal.ads.kk;
import com.google.android.gms.internal.ads.lk;
import com.google.android.gms.internal.ads.mk;
import com.google.android.gms.internal.ads.nk;
import com.google.android.gms.internal.ads.pn;
import com.google.android.gms.internal.ads.sp;
import com.google.android.gms.internal.ads.tp;
import com.google.android.gms.internal.ads.up;
import com.google.android.gms.internal.ads.ur0;
import com.google.android.gms.internal.ads.wp;
import com.google.android.gms.internal.ads.zzbes;

/* JADX INFO: loaded from: classes.dex */
public class AdLoader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzp f1867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f1868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzbn f1869c;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1870a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zzbq f1871b;

        public Builder(Context context, String str) {
            if (context == null) {
                throw new NullPointerException("context cannot be null");
            }
            zzbq zzbqVarZzc = zzay.zza().zzc(context, str, new pn());
            this.f1870a = context;
            this.f1871b = zzbqVarZzc;
        }

        public AdLoader build() {
            Context context = this.f1870a;
            try {
                return new AdLoader(context, this.f1871b.zze(), zzp.zza);
            } catch (RemoteException e10) {
                zzm.zzh("Failed to build AdLoader.", e10);
                return new AdLoader(context, new zzeu().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr == null || adSizeArr.length <= 0) {
                throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
            }
            try {
                this.f1871b.zzj(new mk(onAdManagerAdViewLoadedListener), new zzq(this.f1870a, adSizeArr));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to add Google Ad Manager banner ad listener", e10);
            }
            return this;
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            up upVar = new up(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.f1871b.zzh(str, new tp(upVar), onCustomClickListener == null ? null : new sp(upVar));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to add custom format ad listener", e10);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.f1871b.zzk(new wp(onNativeAdLoadedListener));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.f1871b.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to set AdListener.", e10);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.f1871b.zzm(adManagerAdViewOptions);
            } catch (RemoteException e10) {
                zzm.zzk("Failed to specify Ad Manager banner ad options", e10);
            }
            return this;
        }

        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.f1871b.zzo(new zzbes(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfk(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb(), nativeAdOptions.zzd() - 1));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }

        @Deprecated
        public final Builder zza(String str, com.google.android.gms.ads.formats.zzg zzgVar, com.google.android.gms.ads.formats.zzf zzfVar) {
            ur0 ur0Var = new ur0(zzgVar, 24, zzfVar);
            try {
                this.f1871b.zzh(str, new lk(ur0Var), ((com.google.android.gms.ads.formats.zzf) ur0Var.f9601d) == null ? null : new kk(ur0Var));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to add custom template ad listener", e10);
            }
            return this;
        }

        @Deprecated
        public final Builder zzb(com.google.android.gms.ads.formats.zzi zziVar) {
            try {
                this.f1871b.zzk(new nk(zziVar));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to add google native ad listener", e10);
            }
            return this;
        }

        @Deprecated
        public final Builder zzc(com.google.android.gms.ads.formats.NativeAdOptions nativeAdOptions) {
            try {
                this.f1871b.zzo(new zzbes(nativeAdOptions));
            } catch (RemoteException e10) {
                zzm.zzk("Failed to specify native ad options", e10);
            }
            return this;
        }
    }

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.f1868b = context;
        this.f1869c = zzbnVar;
        this.f1867a = zzpVar;
    }

    public final void a(final zzdx zzdxVar) {
        Context context = this.f1868b;
        eg.a(context);
        if (((Boolean) jh.f5941c.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader adLoader = this.zza;
                        zzdx zzdxVar2 = zzdxVar;
                        adLoader.getClass();
                        try {
                            adLoader.f1869c.zzg(adLoader.f1867a.zza(adLoader.f1868b, zzdxVar2));
                        } catch (RemoteException e10) {
                            zzm.zzh("Failed to load ad.", e10);
                        }
                    }
                });
                return;
            }
        }
        try {
            this.f1869c.zzg(this.f1867a.zza(context, zzdxVar));
        } catch (RemoteException e10) {
            zzm.zzh("Failed to load ad.", e10);
        }
    }

    public boolean isLoading() {
        try {
            return this.f1869c.zzi();
        } catch (RemoteException e10) {
            zzm.zzk("Failed to check if ad is loading.", e10);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        a(adRequest.f1872a);
    }

    public void loadAds(AdRequest adRequest, int i10) {
        try {
            this.f1869c.zzh(this.f1867a.zza(this.f1868b, adRequest.f1872a), i10);
        } catch (RemoteException e10) {
            zzm.zzh("Failed to load ads.", e10);
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        a(adManagerAdRequest.f1872a);
    }
}
