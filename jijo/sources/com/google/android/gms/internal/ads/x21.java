package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class x21 extends o21 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10409d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y21 f10410f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f10411h;

    public x21(y21 y21Var, x11 x11Var) {
        this.f10410f = y21Var;
        this.f10411h = x11Var;
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final Object a() {
        int i10 = this.f10409d;
        Object obj = this.f10411h;
        switch (i10) {
            case 0:
                x11 x11Var = (x11) obj;
                n5.a aVarMo2zza = x11Var.mo2zza();
                en1.x0(aVarMo2zza, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", x11Var);
                return aVarMo2zza;
            default:
                return ((Callable) obj).call();
        }
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final String b() {
        int i10 = this.f10409d;
        Object obj = this.f10411h;
        switch (i10) {
            case 0:
                return ((x11) obj).toString();
            default:
                return ((Callable) obj).toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final void d(Throwable th) {
        int i10 = this.f10409d;
        y21 y21Var = this.f10410f;
        switch (i10) {
            case 0:
                y21Var.g(th);
                break;
            default:
                y21Var.g(th);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final void e(Object obj) {
        int i10 = this.f10409d;
        y21 y21Var = this.f10410f;
        switch (i10) {
            case 0:
                y21Var.l((n5.a) obj);
                break;
            default:
                y21Var.f(obj);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final boolean f() {
        int i10 = this.f10409d;
        y21 y21Var = this.f10410f;
        switch (i10) {
        }
        return y21Var.isDone();
    }

    public x21(y21 y21Var, Callable callable) {
        this.f10410f = y21Var;
        callable.getClass();
        this.f10411h = callable;
    }
}
