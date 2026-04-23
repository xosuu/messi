package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: loaded from: classes.dex */
public final class an0 implements so0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2744d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2745e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2746f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2748h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f2749i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f2750j;

    public an0(int i10, boolean z9, boolean z10, int i11, int i12, int i13, int i14, int i15, float f10, boolean z11) {
        this.f2741a = i10;
        this.f2742b = z9;
        this.f2743c = z10;
        this.f2744d = i11;
        this.f2745e = i12;
        this.f2746f = i13;
        this.f2747g = i14;
        this.f2748h = i15;
        this.f2749i = f10;
        this.f2750j = z11;
    }

    @Override // com.google.android.gms.internal.ads.so0
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f2741a);
        bundle.putBoolean("ma", this.f2742b);
        bundle.putBoolean("sp", this.f2743c);
        bundle.putInt("muv", this.f2744d);
        if (((Boolean) zzba.zzc().a(eg.aa)).booleanValue()) {
            bundle.putInt("muv_min", this.f2745e);
            bundle.putInt("muv_max", this.f2746f);
        }
        bundle.putInt("rm", this.f2747g);
        bundle.putInt("riv", this.f2748h);
        bundle.putFloat("android_app_volume", this.f2749i);
        bundle.putBoolean("android_app_muted", this.f2750j);
    }
}
