package e7;

import b7.u;
import c2.n;
import com.google.android.gms.internal.ads.fb1;
import d7.p;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor, Closeable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f12750t = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f12751u = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12752v = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final v3.k f12753w = new v3.k("NOT_IN_STACK", 2);
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12755b;
    private volatile long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12756d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12757f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f12758h;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f12759q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final p f12760s;

    public b(int i10, int i11, String str, long j10) {
        this.f12754a = i10;
        this.f12755b = i11;
        this.f12756d = j10;
        this.f12757f = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(fb1.h("Core pool size ", i10, " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(a0.f("Max pool size ", i11, " should be greater than or equals to core pool size ", i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(fb1.h("Max pool size ", i11, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
        }
        this.f12758h = new e();
        this.f12759q = new e();
        this.f12760s = new p((i10 + 1) * 2);
        this.controlState = ((long) i10) << 42;
        this._isTerminated = 0;
    }

    public final boolean A() {
        v3.k kVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12750t;
            long j10 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.f12760s.b((int) (2097151 & j10));
            if (aVar == null) {
                aVar = null;
            } else {
                long j11 = (2097152 + j10) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    kVar = f12753w;
                    if (objC == kVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j10, j11 | ((long) iB))) {
                    aVar.g(kVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f12741u.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final int a() {
        synchronized (this.f12760s) {
            try {
                if (f12752v.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f12751u;
                long j10 = atomicLongFieldUpdater.get(this);
                int i10 = (int) (j10 & 2097151);
                int i11 = i10 - ((int) ((j10 & 4398044413952L) >> 21));
                if (i11 < 0) {
                    i11 = 0;
                }
                if (i11 >= this.f12754a) {
                    return 0;
                }
                if (i10 >= this.f12755b) {
                    return 0;
                }
                int i12 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i12 <= 0 || this.f12760s.b(i12) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                a aVar = new a(this, i12);
                this.f12760s.c(i12, aVar);
                if (i12 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i13 = i11 + 1;
                aVar.start();
                return i13;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Runnable runnable, n nVar, boolean z9) {
        h iVar;
        int i10;
        j.f12774f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f12766a = jNanoTime;
            iVar.f12767b = nVar;
        } else {
            iVar = new i(runnable, jNanoTime, nVar);
        }
        boolean z10 = false;
        boolean z11 = iVar.f12767b.f1536a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f12751u;
        long jAddAndGet = z11 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !g4.a0.b(aVar.f12749t, this)) {
            aVar = null;
        }
        if (aVar != null && (i10 = aVar.f12744d) != 5 && (iVar.f12767b.f1536a != 0 || i10 != 2)) {
            aVar.f12748s = true;
            l lVar = aVar.f12742a;
            if (z9) {
                iVar = lVar.a(iVar);
            } else {
                lVar.getClass();
                h hVar = (h) l.f12778b.getAndSet(lVar, iVar);
                iVar = hVar == null ? null : lVar.a(hVar);
            }
        }
        if (iVar != null) {
            if (!(iVar.f12767b.f1536a == 1 ? this.f12759q.a(iVar) : this.f12758h.a(iVar))) {
                throw new RejectedExecutionException(g1.a.r(new StringBuilder(), this.f12757f, " was terminated"));
            }
        }
        if (z9 && aVar != null) {
            z10 = true;
        }
        if (z11) {
            if (z10 || A() || u(jAddAndGet)) {
                return;
            }
            A();
            return;
        }
        if (z10 || A() || u(atomicLongFieldUpdater.get(this))) {
            return;
        }
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = e7.b.f12752v
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Laf
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof e7.a
            r3 = 0
            if (r1 == 0) goto L18
            e7.a r0 = (e7.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            e7.b r1 = r0.f12749t
            boolean r1 = g4.a0.b(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            d7.p r1 = r8.f12760s
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = e7.b.f12751u     // Catch: java.lang.Throwable -> Lc1
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc1
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r5 = (int) r4
            monitor-exit(r1)
            if (r2 > r5) goto L77
            r1 = 1
        L37:
            d7.p r4 = r8.f12760s
            java.lang.Object r4 = r4.b(r1)
            g4.a0.c(r4)
            e7.a r4 = (e7.a) r4
            if (r4 == r0) goto L72
        L44:
            boolean r6 = r4.isAlive()
            if (r6 == 0) goto L53
            java.util.concurrent.locks.LockSupport.unpark(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            r4.join(r6)
            goto L44
        L53:
            e7.l r4 = r4.f12742a
            e7.e r6 = r8.f12759q
            r4.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = e7.l.f12778b
            java.lang.Object r7 = r7.getAndSet(r4, r3)
            e7.h r7 = (e7.h) r7
            if (r7 == 0) goto L67
            r6.a(r7)
        L67:
            e7.h r7 = r4.b()
            if (r7 != 0) goto L6e
            goto L72
        L6e:
            r6.a(r7)
            goto L67
        L72:
            if (r1 == r5) goto L77
            int r1 = r1 + 1
            goto L37
        L77:
            e7.e r1 = r8.f12759q
            r1.b()
            e7.e r1 = r8.f12758h
            r1.b()
        L81:
            if (r0 == 0) goto L89
            e7.h r1 = r0.a(r2)
            if (r1 != 0) goto Lb0
        L89:
            e7.e r1 = r8.f12758h
            java.lang.Object r1 = r1.d()
            e7.h r1 = (e7.h) r1
            if (r1 != 0) goto Lb0
            e7.e r1 = r8.f12759q
            java.lang.Object r1 = r1.d()
            e7.h r1 = (e7.h) r1
            if (r1 != 0) goto Lb0
            if (r0 == 0) goto La3
            r1 = 5
            r0.h(r1)
        La3:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = e7.b.f12750t
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = e7.b.f12751u
            r0.set(r8, r1)
        Laf:
            return
        Lb0:
            r1.run()     // Catch: java.lang.Throwable -> Lb4
            goto L81
        Lb4:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L81
        Lc1:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e7.b.close():void");
    }

    public final void e(a aVar, int i10, int i11) {
        while (true) {
            long j10 = f12750t.get(this);
            int iB = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & (-2097152);
            if (iB == i10) {
                if (i11 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f12753w) {
                            iB = -1;
                            break;
                        }
                        if (objC == null) {
                            iB = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        iB = aVar2.b();
                        if (iB != 0) {
                            break;
                        } else {
                            objC = aVar2.c();
                        }
                    }
                } else {
                    iB = i11;
                }
            }
            if (iB >= 0 && f12750t.compareAndSet(this, j10, j11 | ((long) iB))) {
                return;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c(runnable, j.f12775g, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        p pVar = this.f12760s;
        int iA = pVar.a();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 1; i15 < iA; i15++) {
            a aVar = (a) pVar.b(i15);
            if (aVar != null) {
                l lVar = aVar.f12742a;
                lVar.getClass();
                int i16 = l.f12778b.get(lVar) != null ? (l.f12779c.get(lVar) - l.f12780d.get(lVar)) + 1 : l.f12779c.get(lVar) - l.f12780d.get(lVar);
                int iB = u.h.b(aVar.f12744d);
                if (iB == 0) {
                    i10++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i16);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iB == 1) {
                    i11++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i16);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iB == 2) {
                    i12++;
                } else if (iB == 3) {
                    i13++;
                    if (i16 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i16);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (iB == 4) {
                    i14++;
                }
            }
        }
        long j10 = f12751u.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f12757f);
        sb4.append('@');
        sb4.append(u.m(this));
        sb4.append("[Pool Size {core = ");
        int i17 = this.f12754a;
        sb4.append(i17);
        sb4.append(", max = ");
        sb4.append(this.f12755b);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i10);
        sb4.append(", blocking = ");
        sb4.append(i11);
        sb4.append(", parked = ");
        sb4.append(i12);
        sb4.append(", dormant = ");
        sb4.append(i13);
        sb4.append(", terminated = ");
        sb4.append(i14);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f12758h.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f12759q.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j10));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j10) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i17 - ((int) ((j10 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean u(long j10) {
        int i10 = ((int) (2097151 & j10)) - ((int) ((j10 & 4398044413952L) >> 21));
        if (i10 < 0) {
            i10 = 0;
        }
        int i11 = this.f12754a;
        if (i10 < i11) {
            int iA = a();
            if (iA == 1 && i11 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }
}
