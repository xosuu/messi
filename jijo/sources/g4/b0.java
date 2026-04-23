package g4;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class b0 implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadPoolExecutor f13690b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13689a = new AtomicInteger(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f13691d = new WeakReference(null);

    public b0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new m.b(this));
        this.f13690b = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f13691d.get()) {
            runnable.run();
        } else {
            this.f13690b.execute(runnable);
        }
    }
}
