package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class mu extends q11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7053a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f7054b;

    public mu(Executor executor) {
        this.f7054b = executor;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
        switch (this.f7053a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f7054b).awaitTermination(j10, timeUnit);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i10 = this.f7053a;
        Executor executor = this.f7054b;
        switch (i10) {
            case 0:
                executor.execute(runnable);
                break;
            default:
                ((ExecutorService) executor).execute(runnable);
                break;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        switch (this.f7053a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f7054b).isShutdown();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        switch (this.f7053a) {
            case 0:
                return false;
            default:
                return ((ExecutorService) this.f7054b).isTerminated();
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        switch (this.f7053a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                ((ExecutorService) this.f7054b).shutdown();
                return;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        switch (this.f7053a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return ((ExecutorService) this.f7054b).shutdownNow();
        }
    }

    public final String toString() {
        switch (this.f7053a) {
            case 1:
                ExecutorService executorService = (ExecutorService) this.f7054b;
                return super.toString() + "[" + String.valueOf(executorService) + "]";
            default:
                return super.toString();
        }
    }

    public mu(ExecutorService executorService) {
        executorService.getClass();
        this.f7054b = executorService;
    }
}
