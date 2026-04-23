package com.google.android.gms.ads;

/* JADX INFO: loaded from: classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1866a;

    AdFormat(int i10) {
        this.f1866a = i10;
    }

    public int getValue() {
        return this.f1866a;
    }
}
