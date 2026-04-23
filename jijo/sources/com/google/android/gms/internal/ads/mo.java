package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.NativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class mo extends Cdo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeAdMapper f7018a;

    public mo(NativeAdMapper nativeAdMapper) {
        this.f7018a = nativeAdMapper;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void T0(a4.a aVar) {
        this.f7018a.untrackView((View) a4.b.a0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void c1(a4.a aVar, a4.a aVar2, a4.a aVar3) {
        HashMap map = (HashMap) a4.b.a0(aVar2);
        HashMap map2 = (HashMap) a4.b.a0(aVar3);
        this.f7018a.trackViews((View) a4.b.a0(aVar), map, map2);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void d0(a4.a aVar) {
        this.f7018a.handleClick((View) a4.b.a0(aVar));
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final boolean zzA() {
        return this.f7018a.getOverrideClickHandling();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final boolean zzB() {
        return this.f7018a.getOverrideImpressionRecording();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final double zze() {
        NativeAdMapper nativeAdMapper = this.f7018a;
        if (nativeAdMapper.getStarRating() != null) {
            return nativeAdMapper.getStarRating().doubleValue();
        }
        return -1.0d;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final float zzf() {
        return this.f7018a.getMediaContentAspectRatio();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final float zzg() {
        return this.f7018a.getCurrentTime();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final float zzh() {
        return this.f7018a.getDuration();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final Bundle zzi() {
        return this.f7018a.getExtras();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final com.google.android.gms.ads.internal.client.zzdq zzj() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final ji zzk() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final pi zzl() {
        NativeAd.Image icon = this.f7018a.getIcon();
        if (icon != null) {
            return new fi(icon.getDrawable(), icon.getUri(), icon.getScale(), icon.zzb(), icon.zza());
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final a4.a zzm() {
        View adChoicesContent = this.f7018a.getAdChoicesContent();
        if (adChoicesContent == null) {
            return null;
        }
        return new a4.b(adChoicesContent);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final a4.a zzn() {
        View viewZza = this.f7018a.zza();
        if (viewZza == null) {
            return null;
        }
        return new a4.b(viewZza);
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final a4.a zzo() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzp() {
        return this.f7018a.getAdvertiser();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzq() {
        return this.f7018a.getBody();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzr() {
        return this.f7018a.getCallToAction();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzs() {
        return this.f7018a.getHeadline();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzt() {
        return this.f7018a.getPrice();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final String zzu() {
        return this.f7018a.getStore();
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final List zzv() {
        List<NativeAd.Image> images = this.f7018a.getImages();
        ArrayList arrayList = new ArrayList();
        if (images != null) {
            for (NativeAd.Image image : images) {
                arrayList.add(new fi(image.getDrawable(), image.getUri(), image.getScale(), image.zzb(), image.zza()));
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.eo
    public final void zzx() {
        this.f7018a.recordImpression();
    }
}
