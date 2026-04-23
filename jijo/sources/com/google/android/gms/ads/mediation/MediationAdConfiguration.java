package com.google.android.gms.ads.mediation;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class MediationAdConfiguration {
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_FALSE = 0;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_TRUE = 1;
    public static final int TAG_FOR_CHILD_DIRECTED_TREATMENT_UNSPECIFIED = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f2272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f2273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f2274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f2278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f2279i;

    @Retention(RetentionPolicy.SOURCE)
    public @interface TagForChildDirectedTreatment {
    }

    public MediationAdConfiguration(Context context, String str, Bundle bundle, Bundle bundle2, boolean z9, Location location, int i10, int i11, String str2, String str3) {
        this.f2271a = str;
        this.f2272b = bundle;
        this.f2273c = bundle2;
        this.f2274d = context;
        this.f2275e = z9;
        this.f2276f = i10;
        this.f2277g = i11;
        this.f2278h = str2;
        this.f2279i = str3;
    }

    public String getBidResponse() {
        return this.f2271a;
    }

    public Context getContext() {
        return this.f2274d;
    }

    public String getMaxAdContentRating() {
        return this.f2278h;
    }

    public Bundle getMediationExtras() {
        return this.f2273c;
    }

    public Bundle getServerParameters() {
        return this.f2272b;
    }

    public String getWatermark() {
        return this.f2279i;
    }

    public boolean isTestRequest() {
        return this.f2275e;
    }

    public int taggedForChildDirectedTreatment() {
        return this.f2276f;
    }

    public int taggedForUnderAgeTreatment() {
        return this.f2277g;
    }
}
