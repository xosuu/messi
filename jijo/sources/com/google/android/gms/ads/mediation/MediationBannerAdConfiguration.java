package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;

/* JADX INFO: loaded from: classes.dex */
public class MediationBannerAdConfiguration extends MediationAdConfiguration {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AdSize f2280j;

    public MediationBannerAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z9, Location location, int i10, int i11, String str2, AdSize adSize, String str3) {
        super(context, str, bundle, bundle2, z9, location, i10, i11, str2, str3);
        this.f2280j = adSize;
    }

    public AdSize getAdSize() {
        return this.f2280j;
    }
}
