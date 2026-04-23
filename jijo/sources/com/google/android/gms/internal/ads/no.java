package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.internal.client.zzej;
import com.google.android.gms.ads.internal.client.zzfk;
import com.google.android.gms.ads.mediation.NativeMediationAdRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class no implements NativeMediationAdRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Date f7329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f7331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Location f7333e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7334f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zzbes f7335g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f7337i;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f7336h = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final HashMap f7338j = new HashMap();

    public no(Date date, int i10, HashSet hashSet, Location location, boolean z9, int i11, zzbes zzbesVar, ArrayList arrayList, boolean z10) {
        this.f7329a = date;
        this.f7330b = i10;
        this.f7331c = hashSet;
        this.f7333e = location;
        this.f7332d = z9;
        this.f7334f = i11;
        this.f7335g = zzbesVar;
        this.f7337i = z10;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] strArrSplit = str.split(":", 3);
                    if (strArrSplit.length == 3) {
                        if ("true".equals(strArrSplit[2])) {
                            this.f7338j.put(strArrSplit[1], Boolean.TRUE);
                        } else if ("false".equals(strArrSplit[2])) {
                            this.f7338j.put(strArrSplit[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f7336h.add(str);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final float getAdVolume() {
        return zzej.zzf().zza();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Date getBirthday() {
        return this.f7329a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int getGender() {
        return this.f7330b;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Set getKeywords() {
        return this.f7331c;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final Location getLocation() {
        return this.f7333e;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final NativeAdOptions getNativeAdOptions() {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        zzbes zzbesVar = this.f7335g;
        if (zzbesVar == null) {
            return builder.build();
        }
        int i10 = zzbesVar.f11476a;
        if (i10 == 2) {
            builder.setAdChoicesPlacement(zzbesVar.f11480h);
        } else {
            if (i10 != 3) {
                if (i10 == 4) {
                    builder.setRequestCustomMuteThisAd(zzbesVar.f11482s);
                    builder.setMediaAspectRatio(zzbesVar.f11483t);
                }
            }
            zzfk zzfkVar = zzbesVar.f11481q;
            if (zzfkVar != null) {
                builder.setVideoOptions(new VideoOptions(zzfkVar));
            }
            builder.setAdChoicesPlacement(zzbesVar.f11480h);
        }
        builder.setReturnUrlsForImageAssets(zzbesVar.f11477b);
        builder.setImageOrientation(zzbesVar.f11478d);
        builder.setRequestMultipleImages(zzbesVar.f11479f);
        return builder.build();
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final com.google.android.gms.ads.nativead.NativeAdOptions getNativeAdRequestOptions() {
        return zzbes.b(this.f7335g);
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isAdMuted() {
        return zzej.zzf().zzw();
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isDesignedForFamilies() {
        return this.f7337i;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.f7332d;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean isUnifiedNativeAdRequested() {
        return this.f7336h.contains("6");
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.f7334f;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final Map zza() {
        return this.f7338j;
    }

    @Override // com.google.android.gms.ads.mediation.NativeMediationAdRequest
    public final boolean zzb() {
        return this.f7336h.contains("3");
    }
}
