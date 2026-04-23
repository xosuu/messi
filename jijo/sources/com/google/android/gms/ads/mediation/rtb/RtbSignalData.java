package com.google.android.gms.ads.mediation.rtb;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RtbSignalData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f2325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f2326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AdSize f2327d;

    public RtbSignalData(Context context, List<MediationConfiguration> list, Bundle bundle, AdSize adSize) {
        this.f2324a = context;
        this.f2325b = list;
        this.f2326c = bundle;
        this.f2327d = adSize;
    }

    public AdSize getAdSize() {
        return this.f2327d;
    }

    @Deprecated
    public MediationConfiguration getConfiguration() {
        List list = this.f2325b;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return (MediationConfiguration) list.get(0);
    }

    public List<MediationConfiguration> getConfigurations() {
        return this.f2325b;
    }

    public Context getContext() {
        return this.f2324a;
    }

    public Bundle getNetworkExtras() {
        return this.f2326c;
    }
}
