package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class oo0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7624f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7625g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f7626h;

    public oo0(boolean z9, boolean z10, String str, boolean z11, int i10, int i11, int i12, String str2) {
        this.f7619a = z9;
        this.f7620b = z10;
        this.f7621c = str;
        this.f7622d = z11;
        this.f7623e = i10;
        this.f7624f = i11;
        this.f7625g = i12;
        this.f7626h = str2;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f7621c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzba.zzc().a(eg.f4107q3));
        bundle.putInt("target_api", this.f7623e);
        bundle.putInt("dv", this.f7624f);
        bundle.putInt("lv", this.f7625g);
        if (((Boolean) zzba.zzc().a(eg.f4080n5)).booleanValue()) {
            String str = this.f7626h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleU = tp1.u(bundle, "sdk_env");
        bundleU.putBoolean("mf", ((Boolean) lh.f6616c.k()).booleanValue());
        bundleU.putBoolean("instant_app", this.f7619a);
        bundleU.putBoolean("lite", this.f7620b);
        bundleU.putBoolean("is_privileged_process", this.f7622d);
        bundle.putBundle("sdk_env", bundleU);
        Bundle bundleU2 = tp1.u(bundleU, "build_meta");
        bundleU2.putString("cl", "661295874");
        bundleU2.putString("rapid_rc", "dev");
        bundleU2.putString("rapid_rollup", "HEAD");
        bundleU.putBundle("build_meta", bundleU2);
    }
}
