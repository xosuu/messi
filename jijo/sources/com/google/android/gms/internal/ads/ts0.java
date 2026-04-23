package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class ts0 implements n5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9283b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n5.a f9284d;

    public ts0(Object obj, String str, n5.a aVar) {
        this.f9282a = obj;
        this.f9283b = str;
        this.f9284d = aVar;
    }

    @Override // n5.a
    public final void a(Runnable runnable, Executor executor) {
        this.f9284d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return this.f9284d.cancel(z9);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9284d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9284d.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9284d.isDone();
    }

    public final String toString() {
        return this.f9283b + "@" + System.identityHashCode(this);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f9284d.get(j10, timeUnit);
    }
}
