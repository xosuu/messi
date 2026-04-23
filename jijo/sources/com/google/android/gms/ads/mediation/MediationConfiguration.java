package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;

/* JADX INFO: loaded from: classes.dex */
public class MediationConfiguration {
    public static final String CUSTOM_EVENT_SERVER_PARAMETER_FIELD = "parameter";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdFormat f2281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bundle f2282b;

    public MediationConfiguration(AdFormat adFormat, Bundle bundle) {
        this.f2281a = adFormat;
        this.f2282b = bundle;
    }

    public AdFormat getFormat() {
        return this.f2281a;
    }

    public Bundle getServerParameters() {
        return this.f2282b;
    }
}
