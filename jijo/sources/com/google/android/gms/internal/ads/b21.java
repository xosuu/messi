package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class b21 extends o21 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f2880d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c21 f2881f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Callable f2882h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ c21 f2883q;

    public b21(c21 c21Var, Callable callable, Executor executor) {
        this.f2883q = c21Var;
        this.f2881f = c21Var;
        executor.getClass();
        this.f2880d = executor;
        this.f2882h = callable;
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final Object a() {
        return this.f2882h.call();
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final String b() {
        return this.f2882h.toString();
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final void d(Throwable th) {
        c21 c21Var = this.f2881f;
        c21Var.B = null;
        if (th instanceof ExecutionException) {
            c21Var.g(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            c21Var.cancel(false);
        } else {
            c21Var.g(th);
        }
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final void e(Object obj) {
        this.f2881f.B = null;
        this.f2883q.f(obj);
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final boolean f() {
        return this.f2881f.isDone();
    }
}
