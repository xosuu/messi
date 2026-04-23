package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ap0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2762f;

    public ap0(String str, int i10, int i11, int i12, boolean z9, int i13) {
        this.f2757a = str;
        this.f2758b = i10;
        this.f2759c = i11;
        this.f2760d = i12;
        this.f2761e = z9;
        this.f2762f = i13;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        tp1.p0(bundle, "carrier", this.f2757a, !TextUtils.isEmpty(r0));
        int i10 = this.f2758b;
        if (i10 != -2) {
            bundle.putInt("cnt", i10);
        }
        bundle.putInt("gnt", this.f2759c);
        bundle.putInt("pt", this.f2760d);
        Bundle bundleU = tp1.u(bundle, "device");
        bundle.putBundle("device", bundleU);
        Bundle bundleU2 = tp1.u(bundleU, "network");
        bundleU.putBundle("network", bundleU2);
        bundleU2.putInt("active_network_state", this.f2762f);
        bundleU2.putBoolean("active_network_metered", this.f2761e);
    }
}
