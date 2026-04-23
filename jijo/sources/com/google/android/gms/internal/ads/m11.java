package com.google.android.gms.internal.ads;

import java.util.Objects;
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
public abstract class m11 extends z21 implements n5.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f6801f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c.a f6802h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t3.i f6803q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f6804s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f6805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile d11 f6806b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile l11 f6807d;

    static {
        boolean z9;
        Throwable th;
        Throwable th2;
        t3.i g11Var;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        f6801f = z9;
        f6802h = new c.a(m11.class);
        try {
            g11Var = new k11();
            th2 = null;
            th = null;
        } catch (Error | Exception e10) {
            try {
                th = null;
                th2 = e10;
                g11Var = new e11(AtomicReferenceFieldUpdater.newUpdater(l11.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l11.class, l11.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m11.class, l11.class, "d"), AtomicReferenceFieldUpdater.newUpdater(m11.class, d11.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m11.class, Object.class, "a"));
            } catch (Error | Exception e11) {
                th = e11;
                th2 = e10;
                g11Var = new g11();
            }
        }
        f6803q = g11Var;
        if (th != null) {
            c.a aVar = f6802h;
            Logger loggerA = aVar.a();
            Level level = Level.SEVERE;
            loggerA.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            aVar.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f6804s = new Object();
    }

    public static final Object c(Object obj) throws ExecutionException {
        if (obj instanceof b11) {
            Throwable th = ((b11) obj).f2873b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c11) {
            throw new ExecutionException(((c11) obj).f3158a);
        }
        if (obj == f6804s) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(n5.a aVar) {
        Throwable thB;
        if (aVar instanceof h11) {
            Object b11Var = ((m11) aVar).f6805a;
            if (b11Var instanceof b11) {
                b11 b11Var2 = (b11) b11Var;
                if (b11Var2.f2872a) {
                    Throwable th = b11Var2.f2873b;
                    b11Var = th != null ? new b11(th, false) : b11.f2871d;
                }
            }
            Objects.requireNonNull(b11Var);
            return b11Var;
        }
        if ((aVar instanceof z21) && (thB = ((z21) aVar).b()) != null) {
            return new c11(thB);
        }
        boolean zIsCancelled = aVar.isCancelled();
        if ((!f6801f) && zIsCancelled) {
            b11 b11Var3 = b11.f2871d;
            Objects.requireNonNull(b11Var3);
            return b11Var3;
        }
        try {
            Object objI = i(aVar);
            return zIsCancelled ? new b11(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar))), false) : objI == null ? f6804s : objI;
        } catch (Error e10) {
            e = e10;
            return new c11(e);
        } catch (CancellationException e11) {
            return !zIsCancelled ? new c11(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(aVar)), e11)) : new b11(e11, false);
        } catch (ExecutionException e12) {
            return zIsCancelled ? new b11(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(aVar)), e12), false) : new c11(e12.getCause());
        } catch (Exception e13) {
            e = e13;
            return new c11(e);
        }
    }

    public static Object i(Future future) {
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

    public static void o(m11 m11Var, boolean z9) {
        d11 d11Var = null;
        while (true) {
            for (l11 l11VarK = f6803q.K(m11Var); l11VarK != null; l11VarK = l11VarK.f6455b) {
                Thread thread = l11VarK.f6454a;
                if (thread != null) {
                    l11VarK.f6454a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z9) {
                m11Var.j();
            }
            m11Var.e();
            d11 d11Var2 = d11Var;
            d11 d11VarD = f6803q.D(m11Var);
            d11 d11Var3 = d11Var2;
            while (d11VarD != null) {
                d11 d11Var4 = d11VarD.f3537c;
                d11VarD.f3537c = d11Var3;
                d11Var3 = d11VarD;
                d11VarD = d11Var4;
            }
            while (d11Var3 != null) {
                d11Var = d11Var3.f3537c;
                Runnable runnable = d11Var3.f3535a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f11) {
                    f11 f11Var = (f11) runnable;
                    m11Var = f11Var.f4354a;
                    if (m11Var.f6805a == f11Var) {
                        if (f6803q.V(m11Var, f11Var, h(f11Var.f4355b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = d11Var3.f3536b;
                    Objects.requireNonNull(executor);
                    p(runnable, executor);
                }
                d11Var3 = d11Var;
            }
            return;
            z9 = false;
        }
    }

    public static void p(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f6802h.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e10);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        d11 d11Var;
        d11 d11Var2;
        if (runnable == null) {
            throw new NullPointerException("Runnable was null.");
        }
        if (executor == null) {
            throw new NullPointerException("Executor was null.");
        }
        if (!isDone() && (d11Var = this.f6806b) != (d11Var2 = d11.f3534d)) {
            d11 d11Var3 = new d11(runnable, executor);
            do {
                d11Var3.f3537c = d11Var;
                if (f6803q.U(this, d11Var, d11Var3)) {
                    return;
                } else {
                    d11Var = this.f6806b;
                }
            } while (d11Var != d11Var2);
        }
        p(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.z21
    public final Throwable b() {
        if (!(this instanceof h11)) {
            return null;
        }
        Object obj = this.f6805a;
        if (obj instanceof c11) {
            return ((c11) obj).f3158a;
        }
        return null;
    }

    public boolean cancel(boolean z9) {
        b11 b11Var;
        Object obj = this.f6805a;
        if (!(obj instanceof f11) && !(obj == null)) {
            return false;
        }
        if (f6801f) {
            b11Var = new b11(new CancellationException("Future.cancel() was called."), z9);
        } else {
            b11Var = z9 ? b11.f2870c : b11.f2871d;
            Objects.requireNonNull(b11Var);
        }
        boolean z10 = false;
        m11 m11Var = this;
        while (true) {
            if (f6803q.V(m11Var, obj, b11Var)) {
                o(m11Var, z9);
                if (!(obj instanceof f11)) {
                    break;
                }
                n5.a aVar = ((f11) obj).f4355b;
                if (!(aVar instanceof h11)) {
                    aVar.cancel(z9);
                    break;
                }
                m11Var = (m11) aVar;
                obj = m11Var.f6805a;
                if (!(obj == null) && !(obj instanceof f11)) {
                    break;
                }
                z10 = true;
            } else {
                obj = m11Var.f6805a;
                if (!(obj instanceof f11)) {
                    return z10;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String d() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public void e() {
    }

    public boolean f(Object obj) {
        if (obj == null) {
            obj = f6804s;
        }
        if (!f6803q.V(this, null, obj)) {
            return false;
        }
        o(this, false);
        return true;
    }

    public boolean g(Throwable th) {
        th.getClass();
        if (!f6803q.V(this, null, new c11(th))) {
            return false;
        }
        o(this, false);
        return true;
    }

    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f6805a;
        if ((obj2 != null) && (!(obj2 instanceof f11))) {
            return c(obj2);
        }
        l11 l11Var = this.f6807d;
        l11 l11Var2 = l11.f6453c;
        if (l11Var != l11Var2) {
            l11 l11Var3 = new l11();
            do {
                t3.i iVar = f6803q;
                iVar.O(l11Var3, l11Var);
                if (iVar.W(this, l11Var, l11Var3)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            q(l11Var3);
                            throw new InterruptedException();
                        }
                        obj = this.f6805a;
                    } while (!((obj != null) & (!(obj instanceof f11))));
                    return c(obj);
                }
                l11Var = this.f6807d;
            } while (l11Var != l11Var2);
        }
        Object obj3 = this.f6805a;
        Objects.requireNonNull(obj3);
        return c(obj3);
    }

    public boolean isCancelled() {
        return this.f6805a instanceof b11;
    }

    public boolean isDone() {
        return (this.f6805a != null) & (!(r0 instanceof f11));
    }

    public void j() {
    }

    public final void k(n5.a aVar) {
        if ((aVar != null) && (this.f6805a instanceof b11)) {
            aVar.cancel(m());
        }
    }

    public final void l(n5.a aVar) {
        c11 c11Var;
        aVar.getClass();
        Object obj = this.f6805a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (f6803q.V(this, null, h(aVar))) {
                    o(this, false);
                    return;
                }
                return;
            }
            f11 f11Var = new f11(this, aVar);
            if (f6803q.V(this, null, f11Var)) {
                try {
                    aVar.a(f11Var, d21.f3541a);
                    return;
                } catch (Throwable th) {
                    try {
                        c11Var = new c11(th);
                    } catch (Error | Exception unused) {
                        c11Var = c11.f3157b;
                    }
                    f6803q.V(this, f11Var, c11Var);
                    return;
                }
            }
            obj = this.f6805a;
        }
        if (obj instanceof b11) {
            aVar.cancel(((b11) obj).f2872a);
        }
    }

    public final boolean m() {
        Object obj = this.f6805a;
        return (obj instanceof b11) && ((b11) obj).f2872a;
    }

    public final void n(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            if (objI == null) {
                sb.append("null");
            } else if (objI == this) {
                sb.append("this future");
            } else {
                sb.append(objI.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objI)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append("]");
        } catch (Exception e11) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e11.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void q(l11 l11Var) {
        l11Var.f6454a = null;
        while (true) {
            l11 l11Var2 = this.f6807d;
            if (l11Var2 != l11.f6453c) {
                l11 l11Var3 = null;
                while (l11Var2 != null) {
                    l11 l11Var4 = l11Var2.f6455b;
                    if (l11Var2.f6454a != null) {
                        l11Var3 = l11Var2;
                    } else if (l11Var3 != null) {
                        l11Var3.f6455b = l11Var4;
                        if (l11Var3.f6454a == null) {
                            break;
                        }
                    } else if (!f6803q.W(this, l11Var2, l11Var4)) {
                        break;
                    }
                    l11Var2 = l11Var4;
                }
                return;
            }
            return;
        }
    }

    public String toString() {
        String strConcat;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            n(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.f6805a;
            if (obj instanceof f11) {
                sb.append(", setFuture=[");
                n5.a aVar = ((f11) obj).f4355b;
                try {
                    if (aVar == this) {
                        sb.append("this future");
                    } else {
                        sb.append(aVar);
                    }
                } catch (Exception e10) {
                    e = e10;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e11) {
                    e = e11;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strConcat = d();
                    if (tc1.n(strConcat)) {
                        strConcat = null;
                    }
                } catch (Exception | StackOverflowError e12) {
                    strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e12.getClass()));
                }
                if (strConcat != null) {
                    sb.append(", info=[");
                    sb.append(strConcat);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                n(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00b4 -> B:36:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object get(long r19, java.util.concurrent.TimeUnit r21) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instruction units count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m11.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}
