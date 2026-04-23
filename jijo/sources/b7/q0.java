package b7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes.dex */
public abstract class q0 extends d7.h implements c0, j0, t6.l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public u0 f1438f;

    @Override // b7.j0
    public final boolean a() {
        return true;
    }

    @Override // b7.c0
    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        u0 u0VarK = k();
        while (true) {
            Object objO = u0VarK.o();
            if (objO instanceof q0) {
                if (objO != this) {
                    return;
                }
                d0 d0Var = u.f1468p;
                do {
                    atomicReferenceFieldUpdater2 = u0.f1471a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(u0VarK, objO, d0Var)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(u0VarK) == objO);
            } else {
                if (!(objO instanceof j0) || ((j0) objO).e() == null) {
                    return;
                }
                while (true) {
                    Object objH = h();
                    if (objH instanceof d7.o) {
                        d7.h hVar = ((d7.o) objH).f12509a;
                        return;
                    }
                    if (objH == this) {
                        return;
                    }
                    g4.a0.d(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    d7.h hVar2 = (d7.h) objH;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = d7.h.f12498d;
                    d7.o oVar = (d7.o) atomicReferenceFieldUpdater3.get(hVar2);
                    if (oVar == null) {
                        oVar = new d7.o(hVar2);
                        atomicReferenceFieldUpdater3.lazySet(hVar2, oVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = d7.h.f12496a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, objH, oVar)) {
                            hVar2.f();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == objH);
                }
            }
        }
    }

    @Override // b7.j0
    public final w0 e() {
        return null;
    }

    public final u0 k() {
        u0 u0Var = this.f1438f;
        if (u0Var != null) {
            return u0Var;
        }
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException("lateinit property job has not been initialized");
        g4.a0.z(g4.a0.class.getName(), uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }

    public abstract void l(Throwable th);

    @Override // d7.h
    public final String toString() {
        return getClass().getSimpleName() + '@' + u.m(this) + "[job@" + u.m(k()) + ']';
    }
}
