package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class yk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f10919a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f10920b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10921c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f10922d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f10921c;
    }

    public final synchronized void b(float f10, boolean z9) {
        this.f10920b = z9;
        this.f10921c = f10;
    }

    public final synchronized boolean c(boolean z9) {
        if (!this.f10922d.get()) {
            return z9;
        }
        return this.f10919a;
    }
}
