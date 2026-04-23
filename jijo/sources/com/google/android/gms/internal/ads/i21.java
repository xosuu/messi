package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class i21 extends h21 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n5.a f5463t;

    public i21(n5.a aVar) {
        aVar.getClass();
        this.f5463t = aVar;
    }

    @Override // com.google.android.gms.internal.ads.m11, n5.a
    public final void a(Runnable runnable, Executor executor) {
        this.f5463t.a(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.m11, java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return this.f5463t.cancel(z9);
    }

    @Override // com.google.android.gms.internal.ads.m11, java.util.concurrent.Future
    public final Object get() {
        return this.f5463t.get();
    }

    @Override // com.google.android.gms.internal.ads.m11, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5463t.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.m11, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5463t.isDone();
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final String toString() {
        return this.f5463t.toString();
    }

    @Override // com.google.android.gms.internal.ads.m11, java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f5463t.get(j10, timeUnit);
    }
}
