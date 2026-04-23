package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class zzm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bundle f2054a = new Bundle();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f2055b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2056c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2057d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Bundle f2058e = new Bundle();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f2059f = new Bundle();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f2060g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2061h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f2062i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f2063j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2064k = DateTimeConstants.MILLIS_PER_MINUTE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2065l = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f2066m = 0;

    public final zzl zza() {
        Bundle bundle = this.f2058e;
        Bundle bundle2 = this.f2054a;
        Bundle bundle3 = this.f2059f;
        return new zzl(8, -1L, bundle2, -1, this.f2055b, this.f2056c, this.f2057d, false, null, null, null, null, bundle, bundle3, this.f2060g, null, null, false, null, this.f2061h, this.f2062i, this.f2063j, this.f2064k, null, this.f2065l, this.f2066m);
    }

    public final zzm zzb(Bundle bundle) {
        this.f2054a = bundle;
        return this;
    }

    public final zzm zzc(int i10) {
        this.f2064k = i10;
        return this;
    }

    public final zzm zzd(boolean z9) {
        this.f2056c = z9;
        return this;
    }

    public final zzm zze(List list) {
        this.f2055b = list;
        return this;
    }

    public final zzm zzf(String str) {
        this.f2062i = str;
        return this;
    }

    public final zzm zzg(long j10) {
        this.f2066m = j10;
        return this;
    }

    public final zzm zzh(int i10) {
        this.f2057d = i10;
        return this;
    }

    public final zzm zzi(int i10) {
        this.f2061h = i10;
        return this;
    }
}
