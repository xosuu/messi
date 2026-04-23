package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class y21 extends f21 implements RunnableFuture {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile x21 f10733t;

    public y21(Callable callable) {
        this.f10733t = new x21(this, callable);
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final String d() {
        x21 x21Var = this.f10733t;
        return x21Var != null ? fb1.i("task=[", x21Var.toString(), "]") : super.d();
    }

    @Override // com.google.android.gms.internal.ads.m11
    public final void e() {
        x21 x21Var;
        if (m() && (x21Var = this.f10733t) != null) {
            x21Var.g();
        }
        this.f10733t = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        x21 x21Var = this.f10733t;
        if (x21Var != null) {
            x21Var.run();
        }
        this.f10733t = null;
    }
}
