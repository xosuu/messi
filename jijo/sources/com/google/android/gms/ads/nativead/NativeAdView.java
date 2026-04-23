package com.google.android.gms.ads.nativead;

import a4.a;
import a4.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzep;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.eg;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.ti;

/* JADX INFO: loaded from: classes.dex */
public final class NativeAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f2352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ti f2353b;

    public NativeAdView(Context context) {
        super(context);
        this.f2352a = c(context);
        this.f2353b = d();
    }

    public final View a(String str) {
        ti tiVar = this.f2353b;
        if (tiVar != null) {
            try {
                a aVarZzb = tiVar.zzb(str);
                if (aVarZzb != null) {
                    return (View) b.a0(aVarZzb);
                }
            } catch (RemoteException e10) {
                zzm.zzh("Unable to call getAssetView on delegate", e10);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        super.bringChildToFront(this.f2352a);
    }

    public final /* synthetic */ void b(MediaContent mediaContent) {
        ti tiVar = this.f2353b;
        if (tiVar == null) {
            return;
        }
        try {
            if (mediaContent instanceof zzep) {
                tiVar.zzdx(((zzep) mediaContent).zzc());
            } else if (mediaContent == null) {
                tiVar.zzdx(null);
            } else {
                zzm.zze("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e10) {
            zzm.zzh("Unable to call setMediaContent on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f2352a;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    public final FrameLayout c(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        return frameLayout;
    }

    public final ti d() {
        if (isInEditMode()) {
            return null;
        }
        zzaw zzawVarZza = zzay.zza();
        FrameLayout frameLayout = this.f2352a;
        return zzawVarZza.zzh(frameLayout.getContext(), this, frameLayout);
    }

    public void destroy() {
        ti tiVar = this.f2353b;
        if (tiVar == null) {
            return;
        }
        try {
            tiVar.zzc();
        } catch (RemoteException e10) {
            zzm.zzh("Unable to destroy native ad view", e10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.f2353b;
        if (tiVar != null) {
            if (((Boolean) zzba.zzc().a(eg.Ea)).booleanValue()) {
                try {
                    tiVar.zzd(new b(motionEvent));
                } catch (RemoteException e10) {
                    zzm.zzh("Unable to call handleTouchEvent on delegate", e10);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e(View view, String str) {
        ti tiVar = this.f2353b;
        if (tiVar == null) {
            return;
        }
        try {
            tiVar.zzdv(str, new b(view));
        } catch (RemoteException e10) {
            zzm.zzh("Unable to call setAssetView on delegate", e10);
        }
    }

    public AdChoicesView getAdChoicesView() {
        View viewA = a("3011");
        if (viewA instanceof AdChoicesView) {
            return (AdChoicesView) viewA;
        }
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final MediaView getMediaView() {
        View viewA = a("3010");
        if (viewA instanceof MediaView) {
            return (MediaView) viewA;
        }
        if (viewA == null) {
            return null;
        }
        zzm.zze("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        ti tiVar = this.f2353b;
        if (tiVar == null) {
            return;
        }
        try {
            tiVar.zze(new b(view), i10);
        } catch (RemoteException e10) {
            zzm.zzh("Unable to call onVisibilityChanged on delegate", e10);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f2352a);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f2352a == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(AdChoicesView adChoicesView) {
        e(adChoicesView, "3011");
    }

    public final void setAdvertiserView(View view) {
        e(view, "3005");
    }

    public final void setBodyView(View view) {
        e(view, "3004");
    }

    public final void setCallToActionView(View view) {
        e(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        ti tiVar = this.f2353b;
        if (tiVar == null) {
            return;
        }
        try {
            tiVar.zzdw(new b(view));
        } catch (RemoteException e10) {
            zzm.zzh("Unable to call setClickConfirmingView on delegate", e10);
        }
    }

    public final void setHeadlineView(View view) {
        e(view, "3001");
    }

    public final void setIconView(View view) {
        e(view, "3003");
    }

    public final void setImageView(View view) {
        e(view, "3008");
    }

    public final void setMediaView(MediaView mediaView) {
        e(mediaView, "3010");
        if (mediaView == null) {
            return;
        }
        zzb zzbVar = new zzb(this);
        synchronized (mediaView) {
            mediaView.f2332h = zzbVar;
            if (mediaView.f2329b) {
                zzbVar.zza.b(mediaView.f2328a);
            }
        }
        mediaView.a(new zzc(this));
    }

    public void setNativeAd(NativeAd nativeAd) {
        ti tiVar = this.f2353b;
        if (tiVar == null) {
            return;
        }
        try {
            tiVar.zzdz(nativeAd.a());
        } catch (RemoteException e10) {
            zzm.zzh("Unable to call setNativeAd on delegate", e10);
        }
    }

    public final void setPriceView(View view) {
        e(view, "3007");
    }

    public final void setStarRatingView(View view) {
        e(view, "3009");
    }

    public final void setStoreView(View view) {
        e(view, "3006");
    }

    public NativeAdView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2352a = c(context);
        this.f2353b = d();
    }

    public NativeAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f2352a = c(context);
        this.f2353b = d();
    }

    @TargetApi(sf.zzm)
    public NativeAdView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f2352a = c(context);
        this.f2353b = d();
    }
}
