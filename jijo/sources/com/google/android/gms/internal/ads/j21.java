package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class j21 extends t.a implements n5.a, Future {
    @Override // n5.a
    public final void a(Runnable runnable, Executor executor) {
        ((r21) this).f8366b.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Object get() {
        return ((r21) this).f8366b.get();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Object get(long j10, TimeUnit timeUnit) {
        return ((r21) this).f8366b.get(j10, timeUnit);
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final boolean isCancelled() {
        return ((r21) this).f8366b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final boolean isDone() {
        return ((r21) this).f8366b.isDone();
    }
}
