package t;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16781b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16782d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16783f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16784h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16785q;

    public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f16781b = atomicReferenceFieldUpdater;
        this.f16782d = atomicReferenceFieldUpdater2;
        this.f16783f = atomicReferenceFieldUpdater3;
        this.f16784h = atomicReferenceFieldUpdater4;
        this.f16785q = atomicReferenceFieldUpdater5;
    }

    @Override // t.a
    public final boolean d(h hVar, e eVar, e eVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f16784h;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, eVar, eVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == eVar);
        return false;
    }

    @Override // t.a
    public final boolean e(h hVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f16785q;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == obj);
        return false;
    }

    @Override // t.a
    public final boolean f(h hVar, g gVar, g gVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f16783f;
            if (atomicReferenceFieldUpdater.compareAndSet(hVar, gVar, gVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(hVar) == gVar);
        return false;
    }

    @Override // t.a
    public final void m(g gVar, g gVar2) {
        this.f16782d.lazySet(gVar, gVar2);
    }

    @Override // t.a
    public final void n(g gVar, Thread thread) {
        this.f16781b.lazySet(gVar, thread);
    }
}
