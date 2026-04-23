package com.google.android.gms.ads.nativead;

import a4.b;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.gj;
import com.google.android.gms.internal.ads.sf;
import com.google.android.gms.internal.ads.ti;

/* JADX INFO: loaded from: classes.dex */
public class MediaView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaContent f2328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2329b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView.ScaleType f2330d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2331f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public zzb f2332h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public zzc f2333q;

    public MediaView(Context context) {
        super(context);
    }

    public final synchronized void a(zzc zzcVar) {
        this.f2333q = zzcVar;
        if (this.f2331f) {
            ImageView.ScaleType scaleType = this.f2330d;
            ti tiVar = zzcVar.zza.f2353b;
            if (tiVar != null && scaleType != null) {
                try {
                    tiVar.zzdy(new b(scaleType));
                } catch (RemoteException e10) {
                    zzm.zzh("Unable to call setMediaViewImageScaleType on delegate", e10);
                }
            }
        }
    }

    public MediaContent getMediaContent() {
        return this.f2328a;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        ti tiVar;
        this.f2331f = true;
        this.f2330d = scaleType;
        zzc zzcVar = this.f2333q;
        if (zzcVar == null || (tiVar = zzcVar.zza.f2353b) == null || scaleType == null) {
            return;
        }
        try {
            tiVar.zzdy(new b(scaleType));
        } catch (RemoteException e10) {
            zzm.zzh("Unable to call setMediaViewImageScaleType on delegate", e10);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean zR;
        this.f2329b = true;
        this.f2328a = mediaContent;
        zzb zzbVar = this.f2332h;
        if (zzbVar != null) {
            zzbVar.zza.b(mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            gj gjVarZza = mediaContent.zza();
            if (gjVarZza != null) {
                if (!mediaContent.hasVideoContent()) {
                    if (mediaContent.zzb()) {
                        zR = gjVarZza.r(new b(this));
                    }
                    removeAllViews();
                }
                zR = gjVarZza.n(new b(this));
                if (zR) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e10) {
            removeAllViews();
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }

    @TargetApi(sf.zzm)
    public MediaView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }
}
