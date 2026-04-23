package m2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f15703b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Runnable f15705f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f15702a = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15704d = new Object();

    public i(ExecutorService executorService) {
        this.f15703b = executorService;
    }

    public final boolean a() {
        boolean z9;
        synchronized (this.f15704d) {
            z9 = !this.f15702a.isEmpty();
        }
        return z9;
    }

    public final void b() {
        synchronized (this.f15704d) {
            try {
                Runnable runnable = (Runnable) this.f15702a.poll();
                this.f15705f = runnable;
                if (runnable != null) {
                    this.f15703b.execute(this.f15705f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f15704d) {
            try {
                this.f15702a.add(new l.j(this, runnable, 12));
                if (this.f15705f == null) {
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
