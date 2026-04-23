package d7;

import b7.w;
import b7.z;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b7.q implements z {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12491s = AtomicIntegerFieldUpdater.newUpdater(f.class, "runningWorkers");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7.q f12492d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f12493f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f12494h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f12495q;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public f(e7.k kVar, int i10) {
        this.f12492d = kVar;
        this.f12493f = i10;
        if ((kVar instanceof z ? (z) kVar : null) == null) {
            int i11 = w.f1475a;
        }
        this.f12494h = new i();
        this.f12495q = new Object();
    }

    @Override // b7.q
    public final void D(n6.j jVar, Runnable runnable) {
        this.f12494h.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12491s;
        if (atomicIntegerFieldUpdater.get(this) < this.f12493f) {
            synchronized (this.f12495q) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f12493f) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableF = F();
                if (runnableF == null) {
                    return;
                }
                this.f12492d.D(this, new j6.p(this, 1, runnableF));
            }
        }
    }

    public final Runnable F() {
        while (true) {
            Runnable runnable = (Runnable) this.f12494h.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f12495q) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f12491s;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f12494h.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
