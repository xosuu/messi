package com.google.android.gms.ads.internal.client;

import a4.a;
import a4.b;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.gj;
import com.google.android.gms.internal.ads.ni;

/* JADX INFO: loaded from: classes.dex */
public final class zzep implements MediaContent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ni f2042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final VideoController f2043b = new VideoController();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gj f2044c;

    public zzep(ni niVar, gj gjVar) {
        this.f2042a = niVar;
        this.f2044c = gjVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.f2042a.zze();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.f2042a.zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.f2042a.zzg();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final Drawable getMainImage() {
        try {
            a aVarZzi = this.f2042a.zzi();
            if (aVarZzi != null) {
                return (Drawable) b.a0(aVarZzi);
            }
            return null;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        VideoController videoController = this.f2043b;
        ni niVar = this.f2042a;
        try {
            if (niVar.zzh() != null) {
                videoController.zzb(niVar.zzh());
            }
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh("Exception occurred while getting video controller", e10);
        }
        return videoController;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.f2042a.zzl();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(Drawable drawable) {
        try {
            this.f2042a.zzj(new b(drawable));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final gj zza() {
        return this.f2044c;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.f2042a.zzk();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
            return false;
        }
    }

    public final ni zzc() {
        return this.f2042a;
    }
}
