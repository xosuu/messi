package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class en0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f4246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4247b;

    public en0(double d10, boolean z9) {
        this.f4246a = d10;
        this.f4247b = z9;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleU = tp1.u(bundle, "device");
        bundle.putBundle("device", bundleU);
        Bundle bundleU2 = tp1.u(bundleU, "battery");
        bundleU.putBundle("battery", bundleU2);
        bundleU2.putBoolean("is_charging", this.f4247b);
        bundleU2.putDouble("battery_level", this.f4246a);
    }
}
