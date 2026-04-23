package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b11 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b11 f2870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b11 f2871d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f2873b;

    static {
        if (m11.f6801f) {
            f2871d = null;
            f2870c = null;
        } else {
            f2871d = new b11(null, false);
            f2870c = new b11(null, true);
        }
    }

    public b11(Throwable th, boolean z9) {
        this.f2872a = z9;
        this.f2873b = th;
    }
}
