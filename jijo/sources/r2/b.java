package r2;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class b extends ThreadPoolExecutor {
    public b(int i10, f fVar) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), fVar);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        a aVar = new a((t2.e) runnable);
        execute(aVar);
        return aVar;
    }
}
