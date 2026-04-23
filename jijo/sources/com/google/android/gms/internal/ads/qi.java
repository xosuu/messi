package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.internal.util.client.zzm;

/* JADX INFO: loaded from: classes.dex */
public final class qi extends NativeAd.Image {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi f8187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Drawable f8188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f8189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f8190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8192f;

    public qi(pi piVar) {
        double dZzb;
        int iZzd;
        a4.a aVarZzf;
        this.f8187a = piVar;
        Uri uriZze = null;
        try {
            aVarZzf = piVar.zzf();
        } catch (RemoteException e10) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e10);
        }
        Drawable drawable = aVarZzf != null ? (Drawable) a4.b.a0(aVarZzf) : null;
        this.f8188b = drawable;
        try {
            uriZze = this.f8187a.zze();
        } catch (RemoteException e11) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e11);
        }
        this.f8189c = uriZze;
        try {
            dZzb = this.f8187a.zzb();
        } catch (RemoteException e12) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e12);
            dZzb = 1.0d;
        }
        this.f8190d = dZzb;
        int iZzc = -1;
        try {
            iZzd = this.f8187a.zzd();
        } catch (RemoteException e13) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e13);
            iZzd = -1;
        }
        this.f8191e = iZzd;
        try {
            iZzc = this.f8187a.zzc();
        } catch (RemoteException e14) {
            zzm.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e14);
        }
        this.f8192f = iZzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Drawable getDrawable() {
        return this.f8188b;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final double getScale() {
        return this.f8190d;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final Uri getUri() {
        return this.f8189c;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zza() {
        return this.f8192f;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.Image
    public final int zzb() {
        return this.f8191e;
    }
}
