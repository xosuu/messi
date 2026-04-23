package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class d11 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d11 f3534d = new d11();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f3535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f3536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d11 f3537c;

    public d11() {
        this.f3535a = null;
        this.f3536b = null;
    }

    public d11(Runnable runnable, Executor executor) {
        this.f3535a = runnable;
        this.f3536b = executor;
    }
}
