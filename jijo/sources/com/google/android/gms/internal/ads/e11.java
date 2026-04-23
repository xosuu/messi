package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class e11 extends t3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3807d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f3809f;

    public e11(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f3805b = atomicReferenceFieldUpdater;
        this.f3806c = atomicReferenceFieldUpdater2;
        this.f3807d = atomicReferenceFieldUpdater3;
        this.f3808e = atomicReferenceFieldUpdater4;
        this.f3809f = atomicReferenceFieldUpdater5;
    }

    @Override // t3.i
    public final d11 D(m11 m11Var) {
        return (d11) this.f3808e.getAndSet(m11Var, d11.f3534d);
    }

    @Override // t3.i
    public final l11 K(m11 m11Var) {
        return (l11) this.f3807d.getAndSet(m11Var, l11.f6453c);
    }

    @Override // t3.i
    public final void O(l11 l11Var, l11 l11Var2) {
        this.f3806c.lazySet(l11Var, l11Var2);
    }

    @Override // t3.i
    public final void T(l11 l11Var, Thread thread) {
        this.f3805b.lazySet(l11Var, thread);
    }

    @Override // t3.i
    public final boolean U(m11 m11Var, d11 d11Var, d11 d11Var2) {
        return en1.X(this.f3808e, m11Var, d11Var, d11Var2);
    }

    @Override // t3.i
    public final boolean V(m11 m11Var, Object obj, Object obj2) {
        return en1.X(this.f3809f, m11Var, obj, obj2);
    }

    @Override // t3.i
    public final boolean W(m11 m11Var, l11 l11Var, l11 l11Var2) {
        return en1.X(this.f3807d, m11Var, l11Var, l11Var2);
    }
}
