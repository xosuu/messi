package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class q21 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f8092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m11 f8093b;

    public q21(Executor executor, f21 f21Var) {
        this.f8092a = executor;
        this.f8093b = f21Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f8092a.execute(runnable);
        } catch (RejectedExecutionException e10) {
            this.f8093b.g(e10);
        }
    }
}
