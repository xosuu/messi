package n2;

import com.google.android.gms.internal.ads.g11;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class g implements n5.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f15911f = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Logger f15912h = Logger.getLogger(g.class.getName());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t3.i f15913q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f15914s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f15915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile c f15916b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile f f15917d;

    static {
        t3.i g11Var;
        try {
            g11Var = new d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "d"), AtomicReferenceFieldUpdater.newUpdater(g.class, c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            g11Var = new g11();
        }
        f15913q = g11Var;
        if (th != null) {
            f15912h.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f15914s = new Object();
    }

    public static void c(g gVar) {
        c cVar;
        c cVar2;
        c cVar3 = null;
        while (true) {
            f fVar = gVar.f15917d;
            if (f15913q.d(gVar, fVar, f.f15908c)) {
                while (fVar != null) {
                    Thread thread = fVar.f15909a;
                    if (thread != null) {
                        fVar.f15909a = null;
                        LockSupport.unpark(thread);
                    }
                    fVar = fVar.f15910b;
                }
                do {
                    cVar = gVar.f15916b;
                } while (!f15913q.b(gVar, cVar, c.f15897d));
                while (true) {
                    cVar2 = cVar3;
                    cVar3 = cVar;
                    if (cVar3 == null) {
                        break;
                    }
                    cVar = cVar3.f15900c;
                    cVar3.f15900c = cVar2;
                }
                while (cVar2 != null) {
                    cVar3 = cVar2.f15900c;
                    Runnable runnable = cVar2.f15898a;
                    if (runnable instanceof e) {
                        e eVar = (e) runnable;
                        gVar = eVar.f15906a;
                        if (gVar.f15915a == eVar) {
                            if (f15913q.c(gVar, eVar, f(eVar.f15907b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        d(runnable, cVar2.f15899b);
                    }
                    cVar2 = cVar3;
                }
                return;
            }
        }
    }

    public static void d(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            f15912h.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof a) {
            Throwable th = ((a) obj).f15894b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof b) {
            throw new ExecutionException(((b) obj).f15896a);
        }
        if (obj == f15914s) {
            return null;
        }
        return obj;
    }

    public static Object f(n5.a aVar) {
        if (aVar instanceof g) {
            Object obj = ((g) aVar).f15915a;
            if (!(obj instanceof a)) {
                return obj;
            }
            a aVar2 = (a) obj;
            return aVar2.f15893a ? aVar2.f15894b != null ? new a(aVar2.f15894b, false) : a.f15892d : obj;
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f15911f) && zIsCancelled) {
            return a.f15892d;
        }
        try {
            Object objG = g(aVar);
            return objG == null ? f15914s : objG;
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new a(e10, false);
            }
            return new b(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e10));
        } catch (ExecutionException e11) {
            return new b(e11.getCause());
        } catch (Throwable th) {
            return new b(th);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // n5.a
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        c cVar = this.f15916b;
        c cVar2 = c.f15897d;
        if (cVar != cVar2) {
            c cVar3 = new c(runnable, executor);
            do {
                cVar3.f15900c = cVar;
                if (f15913q.b(this, cVar, cVar3)) {
                    return;
                } else {
                    cVar = this.f15916b;
                }
            } while (cVar != cVar2);
        }
        d(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        Object obj = this.f15915a;
        if (!(obj == null) && !(obj instanceof e)) {
            return false;
        }
        a aVar = f15911f ? new a(new CancellationException("Future.cancel() was called."), z9) : z9 ? a.f15891c : a.f15892d;
        boolean z10 = false;
        g gVar = this;
        while (true) {
            if (f15913q.c(gVar, obj, aVar)) {
                c(gVar);
                if (!(obj instanceof e)) {
                    return true;
                }
                n5.a aVar2 = ((e) obj).f15907b;
                if (!(aVar2 instanceof g)) {
                    aVar2.cancel(z9);
                    return true;
                }
                gVar = (g) aVar2;
                obj = gVar.f15915a;
                if (!(obj == null) && !(obj instanceof e)) {
                    return true;
                }
                z10 = true;
            } else {
                obj = gVar.f15915a;
                if (!(obj instanceof e)) {
                    return z10;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.g.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.f15915a;
        if (obj instanceof e) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            n5.a aVar = ((e) obj).f15907b;
            return g1.a.r(sb, aVar == this ? "this future" : String.valueOf(aVar), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(f fVar) {
        fVar.f15909a = null;
        while (true) {
            f fVar2 = this.f15917d;
            if (fVar2 == f.f15908c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f15910b;
                if (fVar2.f15909a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f15910b = fVar4;
                    if (fVar3.f15909a == null) {
                        break;
                    }
                } else if (!f15913q.d(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f15915a instanceof a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof e)) & (this.f15915a != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f15915a instanceof a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e10) {
                strH = "Exception thrown from implementation: " + e10.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
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
        if (!Thread.interrupted()) {
            Object obj2 = this.f15915a;
            if ((obj2 != null) & (!(obj2 instanceof e))) {
                return e(obj2);
            }
            f fVar = this.f15917d;
            f fVar2 = f.f15908c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    t3.i iVar = f15913q;
                    iVar.w(fVar3, fVar);
                    if (iVar.d(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (Thread.interrupted()) {
                                i(fVar3);
                                throw new InterruptedException();
                            }
                            obj = this.f15915a;
                        } while (!((obj != null) & (!(obj instanceof e))));
                        return e(obj);
                    }
                    fVar = this.f15917d;
                } while (fVar != fVar2);
            }
            return e(this.f15915a);
        }
        throw new InterruptedException();
    }
}
