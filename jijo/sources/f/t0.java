package f;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12965a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f12966b = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f12967d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f12968f;

    public t0(u0 u0Var) {
        this.f12967d = u0Var;
    }

    public final void a() {
        synchronized (this.f12965a) {
            try {
                Runnable runnable = (Runnable) this.f12966b.poll();
                this.f12968f = runnable;
                if (runnable != null) {
                    this.f12967d.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f12965a) {
            try {
                this.f12966b.add(new s0(this, 0, runnable));
                if (this.f12968f == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
