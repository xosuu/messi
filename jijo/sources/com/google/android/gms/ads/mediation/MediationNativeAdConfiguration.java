package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.internal.ads.zzbes;

/* JADX INFO: loaded from: classes.dex */
public class MediationNativeAdConfiguration extends MediationAdConfiguration {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final zzbes f2283j;

    public MediationNativeAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z9, Location location, int i10, int i11, String str2, String str3, zzbes zzbesVar) {
        super(context, str, bundle, bundle2, z9, location, i10, i11, str2, str3);
        this.f2283j = zzbesVar;
    }

    public NativeAdOptions getNativeAdOptions() {
        return zzbes.b(this.f2283j);
    }
}
