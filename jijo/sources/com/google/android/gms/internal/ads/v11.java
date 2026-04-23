package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class v11 extends t3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f9731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f9732c;

    public v11(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f9731b = atomicReferenceFieldUpdater;
        this.f9732c = atomicIntegerFieldUpdater;
    }

    @Override // t3.i
    public final int A(w11 w11Var) {
        return this.f9732c.decrementAndGet(w11Var);
    }

    @Override // t3.i
    public final void M(w11 w11Var, Set set) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f9731b;
            if (atomicReferenceFieldUpdater.compareAndSet(w11Var, null, set)) {
                return;
            }
            if (atomicReferenceFieldUpdater.get(w11Var) != null && atomicReferenceFieldUpdater.get(w11Var) != null) {
                return;
            }
        }
    }
}
