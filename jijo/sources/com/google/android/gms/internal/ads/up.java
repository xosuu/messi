package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes.dex */
public final class up {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener f9556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NativeCustomFormatAd.OnCustomClickListener f9557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public vp f9558c;

    public up(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.f9556a = onCustomFormatAdLoadedListener;
        this.f9557b = onCustomClickListener;
    }
}
