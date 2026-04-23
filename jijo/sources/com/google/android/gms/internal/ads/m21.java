package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
public final class m21 implements n5.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m21 f6811b = new m21(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c.a f6812d = new c.a(m21.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6813a;

    public m21(Object obj) {
        this.f6813a = obj;
    }

    @Override // n5.a
    public final void a(Runnable runnable, Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f6812d.a().logp(Level.SEVERE, "com.google.common.util.concurrent.ImmediateFuture", "addListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f6813a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + String.valueOf(this.f6813a) + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f6813a;
    }
}
