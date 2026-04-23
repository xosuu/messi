package com.google.android.gms.ads.admanager;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jh;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdView extends BaseAdView {
    public AdManagerAdView(Context context) {
        super(context);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }

    public AdSize[] getAdSizes() {
        return this.f1886a.zzC();
    }

    public AppEventListener getAppEventListener() {
        return this.f1886a.zzh();
    }

    public VideoController getVideoController() {
        return this.f1886a.zzf();
    }

    public VideoOptions getVideoOptions() {
        return this.f1886a.zzg();
    }

    public void loadAd(final AdManagerAdRequest adManagerAdRequest) {
        a.j("#008 Must be called on the main UI thread.");
        eg.a(getContext());
        if (((Boolean) jh.f5944f.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.admanager.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdManagerAdView adManagerAdView = this.zza;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        adManagerAdView.getClass();
                        try {
                            adManagerAdView.f1886a.zzm(adManagerAdRequest2.zza());
                        } catch (IllegalStateException e10) {
                            cr.a(adManagerAdView.getContext()).e("AdManagerAdView.loadAd", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f1886a.zzm(adManagerAdRequest.zza());
    }

    public void recordManualImpression() {
        this.f1886a.zzo();
    }

    public void setAdSizes(AdSize... adSizeArr) {
        if (adSizeArr == null || adSizeArr.length <= 0) {
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }
        this.f1886a.zzt(adSizeArr);
    }

    public void setAppEventListener(AppEventListener appEventListener) {
        this.f1886a.zzv(appEventListener);
    }

    public void setManualImpressionsEnabled(boolean z9) {
        this.f1886a.zzw(z9);
    }

    public void setVideoOptions(VideoOptions videoOptions) {
        this.f1886a.zzy(videoOptions);
    }

    public final boolean zzb(zzbu zzbuVar) {
        return this.f1886a.zzz(zzbuVar);
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }

    public AdManagerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, (Object) null);
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
    }
}
