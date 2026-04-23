package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class t21 extends mu implements ScheduledExecutorService {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f9036d;

    public t21(ScheduledExecutorService scheduledExecutorService) {
        super((ExecutorService) scheduledExecutorService);
        this.f9036d = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        y21 y21Var = new y21(Executors.callable(runnable, null));
        return new r21(y21Var, this.f9036d.schedule(y21Var, j10, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        s21 s21Var = new s21(runnable);
        return new r21(s21Var, this.f9036d.scheduleAtFixedRate(s21Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        s21 s21Var = new s21(runnable);
        return new r21(s21Var, this.f9036d.scheduleWithFixedDelay(s21Var, j10, j11, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        y21 y21Var = new y21(callable);
        return new r21(y21Var, this.f9036d.schedule(y21Var, j10, timeUnit));
    }
}
