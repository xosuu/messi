package com.google.android.gms.ads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.cr;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.jh;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class BaseAdView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzea f1886a;

    public BaseAdView(Context context) {
        super(context);
        this.f1886a = new zzea(this, 0);
    }

    public void destroy() {
        eg.a(getContext());
        if (((Boolean) jh.f5943e.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.ia)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzd
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f1886a.zzk();
                        } catch (IllegalStateException e10) {
                            cr.a(baseAdView.getContext()).e("BaseAdView.destroy", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f1886a.zzk();
    }

    public AdListener getAdListener() {
        return this.f1886a.zza();
    }

    public AdSize getAdSize() {
        return this.f1886a.zzb();
    }

    public String getAdUnitId() {
        return this.f1886a.zzj();
    }

    public OnPaidEventListener getOnPaidEventListener() {
        return this.f1886a.zzc();
    }

    public ResponseInfo getResponseInfo() {
        return this.f1886a.zzd();
    }

    public boolean isCollapsible() {
        return this.f1886a.zzA();
    }

    public boolean isLoading() {
        return this.f1886a.zzB();
    }

    public void loadAd(final AdRequest adRequest) {
        a.j("#008 Must be called on the main UI thread.");
        eg.a(getContext());
        if (((Boolean) jh.f5944f.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.la)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzf
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f1886a.zzm(adRequest.f1872a);
                        } catch (IllegalStateException e10) {
                            cr.a(baseAdView.getContext()).e("BaseAdView.loadAd", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f1886a.zzm(adRequest.f1872a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int i14 = ((i12 - i10) - measuredWidth) / 2;
        int i15 = ((i13 - i11) - measuredHeight) / 2;
        childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        AdSize adSize;
        int heightInPixels;
        int measuredWidth = 0;
        View childAt = getChildAt(0);
        if (childAt == null || childAt.getVisibility() == 8) {
            try {
                adSize = getAdSize();
            } catch (NullPointerException e10) {
                zzm.zzh("Unable to retrieve ad size.", e10);
                adSize = null;
            }
            if (adSize != null) {
                Context context = getContext();
                int widthInPixels = adSize.getWidthInPixels(context);
                heightInPixels = adSize.getHeightInPixels(context);
                measuredWidth = widthInPixels;
            } else {
                heightInPixels = 0;
            }
        } else {
            measureChild(childAt, i10, i11);
            measuredWidth = childAt.getMeasuredWidth();
            heightInPixels = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(View.resolveSize(Math.max(measuredWidth, getSuggestedMinimumWidth()), i10), View.resolveSize(Math.max(heightInPixels, getSuggestedMinimumHeight()), i11));
    }

    public void pause() {
        eg.a(getContext());
        if (((Boolean) jh.f5945g.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.ja)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zze
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f1886a.zzn();
                        } catch (IllegalStateException e10) {
                            cr.a(baseAdView.getContext()).e("BaseAdView.pause", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f1886a.zzn();
    }

    public void resume() {
        eg.a(getContext());
        if (((Boolean) jh.f5946h.k()).booleanValue()) {
            if (((Boolean) zzba.zzc().a(eg.ha)).booleanValue()) {
                com.google.android.gms.ads.internal.util.client.zzb.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        BaseAdView baseAdView = this.zza;
                        try {
                            baseAdView.f1886a.zzp();
                        } catch (IllegalStateException e10) {
                            cr.a(baseAdView.getContext()).e("BaseAdView.resume", e10);
                        }
                    }
                });
                return;
            }
        }
        this.f1886a.zzp();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setAdListener(AdListener adListener) {
        zzea zzeaVar = this.f1886a;
        zzeaVar.zzr(adListener);
        if (adListener == 0) {
            zzeaVar.zzq(null);
            return;
        }
        if (adListener instanceof com.google.android.gms.ads.internal.client.zza) {
            zzeaVar.zzq((com.google.android.gms.ads.internal.client.zza) adListener);
        }
        if (adListener instanceof AppEventListener) {
            zzeaVar.zzv((AppEventListener) adListener);
        }
    }

    public void setAdSize(AdSize adSize) {
        this.f1886a.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.f1886a.zzu(str);
    }

    public void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.f1886a.zzx(onPaidEventListener);
    }

    public BaseAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1886a = new zzea(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f1886a = new zzea(this, attributeSet, false, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10, Object obj) {
        super(context, attributeSet, i10);
        this.f1886a = new zzea(this, attributeSet, true, 0);
    }

    public BaseAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        this.f1886a = new zzea(this, attributeSet, true);
    }
}
