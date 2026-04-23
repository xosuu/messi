package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public abstract class o21 extends AtomicReference implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k9 f7475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k9 f7476b;

    static {
        int i10 = 5;
        int i11 = 0;
        f7475a = new k9(i10, i11);
        f7476b = new k9(i10, i11);
    }

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        n21 n21Var = null;
        boolean z9 = false;
        int i10 = 0;
        while (true) {
            boolean z10 = runnable instanceof n21;
            k9 k9Var = f7476b;
            if (!z10) {
                if (runnable != k9Var) {
                    break;
                }
            } else {
                n21Var = (n21) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == k9Var || compareAndSet(runnable, k9Var)) {
                z9 = Thread.interrupted() || z9;
                LockSupport.park(n21Var);
            }
            runnable = (Runnable) get();
        }
        if (z9) {
            thread.interrupt();
        }
    }

    public abstract void d(Throwable th);

    public abstract void e(Object obj);

    public abstract boolean f();

    public final void g() {
        k9 k9Var = f7476b;
        k9 k9Var2 = f7475a;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            n21 n21Var = new n21(this);
            n21Var.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, n21Var)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (((Runnable) getAndSet(k9Var2)) == k9Var) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (((Runnable) getAndSet(k9Var2)) == k9Var) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objA = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z9 = !f();
            k9 k9Var = f7475a;
            if (z9) {
                try {
                    objA = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, k9Var)) {
                            c(threadCurrentThread);
                        }
                        d(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, k9Var)) {
                            c(threadCurrentThread);
                        }
                        e(null);
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, k9Var)) {
                c(threadCurrentThread);
            }
            if (z9) {
                e(objA);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return fb1.x(runnable == f7475a ? "running=[DONE]" : runnable instanceof n21 ? "running=[INTERRUPTED]" : runnable instanceof Thread ? fb1.i("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", ", ", b());
    }
}
