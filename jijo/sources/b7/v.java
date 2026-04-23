package b7;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class v extends f0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final v f1473u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f1474v;

    static {
        Long l9;
        v vVar = new v();
        f1473u = vVar;
        vVar.H(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l9 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l9 = 1000L;
        }
        f1474v = timeUnit.toNanos(l9.longValue());
    }

    @Override // b7.g0
    public final Thread G() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // b7.f0
    public final void J(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.J(runnable);
    }

    public final synchronized void N() {
        int i10 = debugStatus;
        if (i10 == 2 || i10 == 3) {
            debugStatus = 3;
            f0.f1411q.set(this, null);
            f0.f1412s.set(this, null);
            notifyAll();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r14 = this;
            java.lang.ThreadLocal r0 = b7.b1.f1398a
            r0.set(r14)
            r0 = 0
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L37
            int r1 = b7.v.debugStatus     // Catch: java.lang.Throwable -> L73
            r2 = 2
            if (r1 == r2) goto L75
            r3 = 3
            if (r1 != r3) goto L11
            goto L75
        L11:
            r1 = 1
            b7.v.debugStatus = r1     // Catch: java.lang.Throwable -> L73
            r14.notifyAll()     // Catch: java.lang.Throwable -> L73
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L37
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = r4
        L1e:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L37
            long r8 = r14.M()     // Catch: java.lang.Throwable -> L37
            r10 = 0
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 != 0) goto L54
            long r12 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L37
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L39
            long r6 = b7.v.f1474v     // Catch: java.lang.Throwable -> L37
            long r6 = r6 + r12
            goto L39
        L37:
            r1 = move-exception
            goto L87
        L39:
            long r12 = r6 - r12
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r1 > 0) goto L4e
            b7.v._thread = r0
            r14.N()
            boolean r0 = r14.L()
            if (r0 != 0) goto L4d
            r14.G()
        L4d:
            return
        L4e:
            int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r1 <= 0) goto L55
            r8 = r12
            goto L55
        L54:
            r6 = r4
        L55:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L1e
            int r1 = b7.v.debugStatus     // Catch: java.lang.Throwable -> L37
            if (r1 == r2) goto L64
            if (r1 != r3) goto L60
            goto L64
        L60:
            java.util.concurrent.locks.LockSupport.parkNanos(r14, r8)     // Catch: java.lang.Throwable -> L37
            goto L1e
        L64:
            b7.v._thread = r0
            r14.N()
            boolean r0 = r14.L()
            if (r0 != 0) goto L72
            r14.G()
        L72:
            return
        L73:
            r1 = move-exception
            goto L85
        L75:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L37
            b7.v._thread = r0
            r14.N()
            boolean r0 = r14.L()
            if (r0 != 0) goto L84
            r14.G()
        L84:
            return
        L85:
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L37
            throw r1     // Catch: java.lang.Throwable -> L37
        L87:
            b7.v._thread = r0
            r14.N()
            boolean r0 = r14.L()
            if (r0 != 0) goto L95
            r14.G()
        L95:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.v.run():void");
    }

    @Override // b7.f0, b7.g0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}
