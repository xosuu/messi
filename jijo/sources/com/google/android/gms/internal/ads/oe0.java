package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes.dex */
public final class oe0 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f7561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdView f7562b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7563d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te0 f7564f;

    public oe0(te0 te0Var, String str, AdView adView, String str2) {
        this.f7561a = str;
        this.f7562b = adView;
        this.f7563d = str2;
        this.f7564f = te0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f7564f.z1(te0.y1(loadAdError), this.f7563d);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f7564f.u1(this.f7562b, this.f7561a, this.f7563d);
    }
}
