package t;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements n5.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f16789f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f16790h = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f16791q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f16792s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f16793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile e f16794b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile g f16795d;

    static {
        a aVar;
        try {
            aVar = new f(AtomicReferenceFieldUpdater.newUpdater(g.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(g.class, g.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, g.class, "d"), AtomicReferenceFieldUpdater.newUpdater(h.class, e.class, "b"), AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            aVar = new q5.a();
        }
        f16791q = aVar;
        if (th != null) {
            f16790h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f16792s = new Object();
    }

    public static void c(h hVar) {
        g gVar;
        e eVar;
        e eVar2;
        e eVar3;
        do {
            gVar = hVar.f16795d;
        } while (!f16791q.f(hVar, gVar, g.f16786c));
        while (true) {
            eVar = null;
            if (gVar == null) {
                break;
            }
            Thread thread = gVar.f16787a;
            if (thread != null) {
                gVar.f16787a = null;
                LockSupport.unpark(thread);
            }
            gVar = gVar.f16788b;
        }
        do {
            eVar2 = hVar.f16794b;
        } while (!f16791q.d(hVar, eVar2, e.f16777d));
        while (true) {
            eVar3 = eVar;
            eVar = eVar2;
            if (eVar == null) {
                break;
            }
            eVar2 = eVar.f16780c;
            eVar.f16780c = eVar3;
        }
        while (eVar3 != null) {
            e eVar4 = eVar3.f16780c;
            d(eVar3.f16778a, eVar3.f16779b);
            eVar3 = eVar4;
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f16790h.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f16774a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f16776a);
        }
        if (obj == f16792s) {
            return null;
        }
        return obj;
    }

    @Override // n5.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        e eVar = this.f16794b;
        e eVar2 = e.f16777d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f16780c = eVar;
                if (f16791q.d(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.f16794b;
                }
            } while (eVar != eVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z9 = true;
                } catch (Throwable th) {
                    if (z9) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e10) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e10.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e11) {
                sb.append("FAILURE, cause=[");
                sb.append(e11.getCause());
                sb.append("]");
                return;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        Object obj = this.f16793a;
        if (obj == null) {
            if (f16791q.e(this, obj, f16789f ? new b(new CancellationException("Future.cancel() was called."), z9) : z9 ? b.f16772b : b.f16773c)) {
                c(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String f() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void g(g gVar) {
        gVar.f16787a = null;
        while (true) {
            g gVar2 = this.f16795d;
            if (gVar2 == g.f16786c) {
                return;
            }
            g gVar3 = null;
            while (gVar2 != null) {
                g gVar4 = gVar2.f16788b;
                if (gVar2.f16787a != null) {
                    gVar3 = gVar2;
                } else if (gVar3 != null) {
                    gVar3.f16788b = gVar4;
                    if (gVar3.f16787a == null) {
                        break;
                    }
                } else if (!f16791q.f(this, gVar2, gVar4)) {
                    break;
                }
                gVar2 = gVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x009f -> B:36:0x006e). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.h.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean h(Throwable th) {
        th.getClass();
        if (!f16791q.e(this, null, new d(th))) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16793a instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f16793a != null) & true;
    }

    public final String toString() {
        String strF;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f16793a instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strF = f();
            } catch (RuntimeException e10) {
                strF = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strF != null && !strF.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strF);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f16793a;
        if ((obj2 != null) & true) {
            return e(obj2);
        }
        g gVar = this.f16795d;
        g gVar2 = g.f16786c;
        if (gVar != gVar2) {
            g gVar3 = new g();
            do {
                a aVar = f16791q;
                aVar.m(gVar3, gVar);
                if (aVar.f(this, gVar, gVar3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            g(gVar3);
                            throw new InterruptedException();
                        }
                        obj = this.f16793a;
                    } while (!((obj != null) & true));
                    return e(obj);
                }
                gVar = this.f16795d;
            } while (gVar != gVar2);
        }
        return e(this.f16793a);
    }
}
