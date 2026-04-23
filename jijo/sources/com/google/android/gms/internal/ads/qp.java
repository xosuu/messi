package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes.dex */
public final class qp extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi f8244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f8245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f8246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f8247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8249f;

    public qp(pi piVar) {
        double dZzb;
        int iZzd;
        a4.a aVarZzf;
        this.f8244a = piVar;
        Uri uriZze = null;
        try {
            aVarZzf = piVar.zzf();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        Drawable drawable = aVarZzf != null ? (Drawable) a4.b.a0(aVarZzf) : null;
        this.f8245b = drawable;
        try {
            uriZze = this.f8244a.zze();
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
        this.f8246c = uriZze;
        try {
            dZzb = this.f8244a.zzb();
        } catch (RemoteException e12) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
            dZzb = 1.0d;
        }
        this.f8247d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f8244a.zzd();
        } catch (RemoteException e13) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e13);
            iZzd = -1;
        }
        this.f8248e = iZzd;
        try {
            iZzc = this.f8244a.zzc();
        } catch (RemoteException e14) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e14);
        }
        this.f8249f = iZzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f8245b;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final double getScale() {
        return this.f8247d;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final Uri getUri() {
        return this.f8246c;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zza() {
        return this.f8249f;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.Image
    public final int zzb() {
        return this.f8248e;
    }
}
