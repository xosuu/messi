package p6;

import b7.c0;
import b7.x0;
import g4.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n6.h;
import n6.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f16255b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient n6.e f16256d;

    public c(n6.e eVar, j jVar) {
        super(eVar);
        this.f16255b = jVar;
    }

    @Override // n6.e
    public final j getContext() {
        j jVar = this.f16255b;
        a0.c(jVar);
        return jVar;
    }

    @Override // p6.a
    public final void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        n6.e eVar = this.f16256d;
        if (eVar != null && eVar != this) {
            j jVar = this.f16255b;
            a0.c(jVar);
            h hVarA = jVar.A(n6.f.f15980a);
            a0.c(hVarA);
            d7.e eVar2 = (d7.e) eVar;
            do {
                atomicReferenceFieldUpdater = d7.e.f12486t;
            } while (atomicReferenceFieldUpdater.get(eVar2) == d7.a.f12480c);
            Object obj = atomicReferenceFieldUpdater.get(eVar2);
            b7.d dVar = obj instanceof b7.d ? (b7.d) obj : null;
            if (dVar != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b7.d.f1403t;
                c0 c0Var = (c0) atomicReferenceFieldUpdater2.get(dVar);
                if (c0Var != null) {
                    c0Var.b();
                    atomicReferenceFieldUpdater2.set(dVar, x0.f1476a);
                }
            }
        }
        this.f16256d = b.f16254a;
    }

    public c(n6.e eVar) {
        this(eVar, eVar != null ? eVar.getContext() : null);
    }
}
