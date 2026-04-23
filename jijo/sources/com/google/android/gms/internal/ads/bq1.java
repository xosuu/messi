package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ow f3078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f3079b;

    public bq1(ow owVar, int[] iArr) {
        if (iArr.length == 0) {
            fg0.d("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f3078a = owVar;
        this.f3079b = iArr;
    }
}
