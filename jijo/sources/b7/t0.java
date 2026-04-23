package b7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class t0 extends d7.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d7.h f1449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d7.h f1450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f1451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1452e;

    public t0(d7.h hVar, u0 u0Var, Object obj) {
        this.f1451d = u0Var;
        this.f1452e = obj;
        this.f1449b = hVar;
    }

    @Override // d7.b
    public final void b(Object obj, Object obj2) {
        d7.h hVar = (d7.h) obj;
        boolean z9 = obj2 == null;
        d7.h hVar2 = this.f1449b;
        d7.h hVar3 = z9 ? hVar2 : this.f1450c;
        if (hVar3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d7.h.f12496a;
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, this, hVar3)) {
                if (atomicReferenceFieldUpdater.get(hVar) != this) {
                    return;
                }
            }
            if (z9) {
                d7.h hVar4 = this.f1450c;
                g4.a0.c(hVar4);
                hVar2.g(hVar4);
            }
        }
    }

    @Override // d7.b
    public final v3.k c(Object obj) {
        if (this.f1451d.o() == this.f1452e) {
            return null;
        }
        return d7.a.f12481d;
    }
}
