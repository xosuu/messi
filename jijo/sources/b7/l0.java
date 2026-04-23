package b7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class l0 extends o0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1428q = AtomicIntegerFieldUpdater.newUpdater(l0.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t6.l f1429h;

    public l0(t6.l lVar) {
        this.f1429h = lVar;
    }

    @Override // t6.l
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        l((Throwable) obj);
        return l6.f.f15231a;
    }

    @Override // b7.q0
    public final void l(Throwable th) {
        if (f1428q.compareAndSet(this, 0, 1)) {
            this.f1429h.d(th);
        }
    }
}
