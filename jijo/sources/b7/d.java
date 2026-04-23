package b7;

import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: loaded from: classes.dex */
public final class d extends a0 implements n6.e, p6.d {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1401q = AtomicIntegerFieldUpdater.newUpdater(d.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1402s = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_state");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1403t = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n6.e f1404f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n6.j f1405h;

    public d(n6.e eVar) {
        super(1);
        this.f1404f = eVar;
        this.f1405h = eVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.f1395a;
    }

    @Override // p6.d
    public final p6.d a() {
        n6.e eVar = this.f1404f;
        if (eVar instanceof p6.d) {
            return (p6.d) eVar;
        }
        return null;
    }

    @Override // b7.a0
    public final void b(Object obj, CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1402s;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof y0) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof k) {
                return;
            }
            if (!(obj2 instanceof j)) {
                j jVar = new j(obj2, (t6.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            j jVar2 = (j) obj2;
            if (!(!(jVar2.f1422d != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            Object obj3 = jVar2.f1419a;
            t6.l lVar = jVar2.f1420b;
            j jVar3 = new j(obj3, lVar, jVar2.f1421c, cancellationException);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jVar3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (lVar != null) {
                try {
                    lVar.d(cancellationException);
                    return;
                } catch (Throwable th) {
                    tp1.k(this.f1405h, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th));
                    return;
                }
            }
            return;
        }
    }

    @Override // b7.a0
    public final n6.e c() {
        return this.f1404f;
    }

    @Override // n6.e
    public final void d(Object obj) {
        Throwable thA = l6.c.a(obj);
        if (thA != null) {
            obj = new k(thA, false);
        }
        int i10 = this.f1394d;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1402s;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof y0)) {
                if (obj2 instanceof e) {
                    e eVar = (e) obj2;
                    eVar.getClass();
                    if (e.f1408c.compareAndSet(eVar, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            boolean z9 = obj instanceof k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, obj)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!n()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1403t;
                c0 c0Var = (c0) atomicReferenceFieldUpdater2.get(this);
                if (c0Var != null) {
                    c0Var.b();
                    atomicReferenceFieldUpdater2.set(this, x0.f1476a);
                }
            }
            j(i10);
            return;
        }
    }

    @Override // b7.a0
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // b7.a0
    public final Object f(Object obj) {
        return obj instanceof j ? ((j) obj).f1419a : obj;
    }

    @Override // n6.e
    public final n6.j getContext() {
        return this.f1405h;
    }

    @Override // b7.a0
    public final Object h() {
        return f1402s.get(this);
    }

    public final void i(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1402s;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof y0) {
                e eVar = new e(this, th);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, eVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (!n()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1403t;
                    c0 c0Var = (c0) atomicReferenceFieldUpdater2.get(this);
                    if (c0Var != null) {
                        c0Var.b();
                        atomicReferenceFieldUpdater2.set(this, x0.f1476a);
                    }
                }
                j(this.f1394d);
                return;
            }
            return;
        }
    }

    public final void j(int i10) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i11;
        do {
            atomicIntegerFieldUpdater = f1401q;
            i11 = atomicIntegerFieldUpdater.get(this);
            int i12 = i11 >> 29;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z9 = i10 == 4;
                n6.e eVar = this.f1404f;
                if (!z9 && (eVar instanceof d7.e)) {
                    boolean z10 = i10 == 1 || i10 == 2;
                    int i13 = this.f1394d;
                    if (z10 == (i13 == 1 || i13 == 2)) {
                        q qVar = ((d7.e) eVar).f12487f;
                        n6.j context = eVar.getContext();
                        if (qVar.E()) {
                            qVar.D(context, this);
                            return;
                        }
                        g0 g0VarA = b1.a();
                        if (g0VarA.f1414d < 4294967296L) {
                            g0VarA.H(true);
                            try {
                                en1.E(this, eVar, true);
                                do {
                                } while (g0VarA.I());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                            return;
                        }
                        m6.b bVar = g0VarA.f1416h;
                        if (bVar == null) {
                            bVar = new m6.b();
                            g0VarA.f1416h = bVar;
                        }
                        bVar.addLast(this);
                        return;
                    }
                }
                en1.E(this, eVar, z9);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 1073741824 + (536870911 & i11)));
    }

    public final Object k() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        boolean zN = n();
        do {
            atomicIntegerFieldUpdater = f1401q;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (zN) {
                    o();
                }
                Object obj = f1402s.get(this);
                if (obj instanceof k) {
                    throw ((k) obj).f1424a;
                }
                int i12 = this.f1394d;
                if (i12 == 1 || i12 == 2) {
                    n0 n0Var = (n0) this.f1405h.A(r.f1440b);
                    if (n0Var != null && !n0Var.a()) {
                        CancellationException cancellationExceptionK = ((u0) n0Var).k();
                        b(obj, cancellationExceptionK);
                        throw cancellationExceptionK;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        if (((c0) f1403t.get(this)) == null) {
            m();
        }
        if (zN) {
            o();
        }
        return o6.a.f16110a;
    }

    public final void l() {
        c0 c0VarM = m();
        if (c0VarM != null && (!(f1402s.get(this) instanceof y0))) {
            c0VarM.b();
            f1403t.set(this, x0.f1476a);
        }
    }

    public final c0 m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n0 n0Var = (n0) this.f1405h.A(r.f1440b);
        if (n0Var == null) {
            return null;
        }
        c0 c0VarM = g4.a0.m(n0Var, true, new f(this), 2);
        do {
            atomicReferenceFieldUpdater = f1403t;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c0VarM)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return c0VarM;
    }

    public final boolean n() {
        if (this.f1394d == 2) {
            n6.e eVar = this.f1404f;
            g4.a0.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (d7.e.f12486t.get((d7.e) eVar) != null) {
                return true;
            }
        }
        return false;
    }

    public final void o() {
        n6.e eVar = this.f1404f;
        Throwable th = null;
        d7.e eVar2 = eVar instanceof d7.e ? (d7.e) eVar : null;
        if (eVar2 != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d7.e.f12486t;
                Object obj = atomicReferenceFieldUpdater.get(eVar2);
                v3.k kVar = d7.a.f12480c;
                if (obj == kVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar2, kVar, this)) {
                        if (atomicReferenceFieldUpdater.get(eVar2) != kVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar2, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(eVar2) != obj) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1403t;
            c0 c0Var = (c0) atomicReferenceFieldUpdater2.get(this);
            if (c0Var != null) {
                c0Var.b();
                atomicReferenceFieldUpdater2.set(this, x0.f1476a);
            }
            i(th);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(u.A(this.f1404f));
        sb.append("){");
        Object obj = f1402s.get(this);
        sb.append(obj instanceof y0 ? "Active" : obj instanceof e ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(u.m(this));
        return sb.toString();
    }
}
