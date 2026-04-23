package com.google.android.gms.ads.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class SearchAdView extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzea f2448a;

    public SearchAdView(Context context) {
        super(context);
        this.f2448a = new zzea(this);
    }

    public void destroy() {
        this.f2448a.zzk();
    }

    public AdListener getAdListener() {
        return this.f2448a.zza();
    }

    public AdSize getAdSize() {
        return this.f2448a.zzb();
    }

    public String getAdUnitId() {
        return this.f2448a.zzj();
    }

    public void loadAd(SearchAdRequest searchAdRequest) {
        this.f2448a.zzm(searchAdRequest.f2446a);
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
        this.f2448a.zzn();
    }

    public void resume() {
        this.f2448a.zzp();
    }

    public void setAdListener(AdListener adListener) {
        this.f2448a.zzr(adListener);
    }

    public void setAdSize(AdSize adSize) {
        this.f2448a.zzs(adSize);
    }

    public void setAdUnitId(String str) {
        this.f2448a.zzu(str);
    }

    public SearchAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2448a = new zzea(this, attributeSet, false);
    }

    public void loadAd(DynamicHeightSearchAdRequest dynamicHeightSearchAdRequest) {
        if (AdSize.SEARCH.equals(getAdSize())) {
            this.f2448a.zzm(dynamicHeightSearchAdRequest.f2443a.f2446a);
            return;
        }
        throw new IllegalStateException("You must use AdSize.SEARCH for a DynamicHeightSearchAdRequest");
    }

    public SearchAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2448a = new zzea(this, attributeSet, false);
    }
}
