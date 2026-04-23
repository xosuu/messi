package b7;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f extends o0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f1410h;

    public f(d dVar) {
        this.f1410h = dVar;
    }

    @Override // t6.l
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        l((Throwable) obj);
        return l6.f.f15231a;
    }

    @Override // b7.q0
    public final void l(Throwable th) {
        u0 u0VarK = k();
        d dVar = this.f1410h;
        dVar.getClass();
        CancellationException cancellationExceptionK = u0VarK.k();
        if (dVar.n()) {
            n6.e eVar = dVar.f1404f;
            g4.a0.d(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            d7.e eVar2 = (d7.e) eVar;
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d7.e.f12486t;
                Object obj = atomicReferenceFieldUpdater.get(eVar2);
                v3.k kVar = d7.a.f12480c;
                if (!g4.a0.b(obj, kVar)) {
                    if (!(obj instanceof Throwable)) {
                        while (!atomicReferenceFieldUpdater.compareAndSet(eVar2, obj, null)) {
                            if (atomicReferenceFieldUpdater.get(eVar2) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(eVar2, kVar, cancellationExceptionK)) {
                    if (atomicReferenceFieldUpdater.get(eVar2) != kVar) {
                        break;
                    }
                }
                return;
            }
        }
        dVar.i(cancellationExceptionK);
        if (dVar.n()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d.f1403t;
        c0 c0Var = (c0) atomicReferenceFieldUpdater2.get(dVar);
        if (c0Var == null) {
            return;
        }
        c0Var.b();
        atomicReferenceFieldUpdater2.set(dVar, x0.f1476a);
    }
}
