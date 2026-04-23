package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzu;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class qu implements n5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u21 f8276a = new u21();

    @Override // n5.a
    public final void a(Runnable runnable, Executor executor) {
        this.f8276a.a(runnable, executor);
    }

    public final boolean b(Object obj) {
        boolean zF = this.f8276a.f(obj);
        if (!zF) {
            zzu.zzo().h("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zF;
    }

    public final boolean c(Throwable th) {
        boolean zG = this.f8276a.g(th);
        if (!zG) {
            zzu.zzo().h("SettableFuture", new IllegalStateException("Provided SettableFuture with multiple values."));
        }
        return zG;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        return this.f8276a.cancel(z9);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f8276a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8276a.f6805a instanceof b11;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8276a.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        return this.f8276a.get(j10, timeUnit);
    }
}
