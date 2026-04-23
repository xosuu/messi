package b7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class f0 extends g0 implements z {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1411q = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1412s = AtomicReferenceFieldUpdater.newUpdater(f0.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1413t = AtomicIntegerFieldUpdater.newUpdater(f0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // b7.q
    public final void D(n6.j jVar, Runnable runnable) {
        J(runnable);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004a, code lost:
    
        b7.v.f1473u.J(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void J(java.lang.Runnable r6) {
        /*
            r5 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = b7.f0.f1411q
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = b7.f0.f1413t
            int r2 = r2.get(r5)
            if (r2 == 0) goto Lf
            goto L4a
        Lf:
            if (r1 != 0) goto L20
        L11:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L19
            goto L66
        L19:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L11
            goto L0
        L20:
            boolean r2 = r1 instanceof d7.k
            r3 = 1
            if (r2 == 0) goto L46
            r2 = r1
            d7.k r2 = (d7.k) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L66
            if (r4 == r3) goto L34
            r0 = 2
            if (r4 == r0) goto L4a
            goto L0
        L34:
            d7.k r2 = r2.c()
        L38:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L3f
            goto L0
        L3f:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L38
            goto L0
        L46:
            v3.k r2 = b7.u.f1461i
            if (r1 != r2) goto L50
        L4a:
            b7.v r0 = b7.v.f1473u
            r0.J(r6)
            goto L73
        L50:
            d7.k r2 = new d7.k
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L60:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L74
        L66:
            java.lang.Thread r6 = r5.G()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L73
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L73:
            return
        L74:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L60
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.f0.J(java.lang.Runnable):void");
    }

    public final long K() {
        m6.b bVar = this.f1416h;
        if (((bVar == null || bVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj = f1411q.get(this);
        if (obj != null) {
            if (!(obj instanceof d7.k)) {
                return obj == u.f1461i ? Long.MAX_VALUE : 0L;
            }
            long j10 = d7.k.f12502f.get((d7.k) obj);
            if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean L() {
        m6.b bVar = this.f1416h;
        if (bVar != null && !bVar.isEmpty()) {
            return false;
        }
        Object obj = f1411q.get(this);
        if (obj != null) {
            if (obj instanceof d7.k) {
                long j10 = d7.k.f12502f.get((d7.k) obj);
                if (((int) (1073741823 & j10)) != ((int) ((j10 & 1152921503533105152L) >> 30))) {
                    return false;
                }
            } else if (obj != u.f1461i) {
                return false;
            }
        }
        return true;
    }

    public final long M() {
        Runnable runnable;
        if (I()) {
            return 0L;
        }
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1411q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof d7.k)) {
                if (obj != u.f1461i) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            d7.k kVar = (d7.k) obj;
            Object objD = kVar.d();
            if (objD != d7.k.f12503g) {
                runnable = (Runnable) objD;
                break;
            }
            d7.k kVarC = kVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable == null) {
            return K();
        }
        runnable.run();
        return 0L;
    }

    @Override // b7.g0
    public void shutdown() {
        b1.f1398a.set(null);
        f1413t.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1411q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            v3.k kVar = u.f1461i;
            if (obj != null) {
                if (!(obj instanceof d7.k)) {
                    if (obj != kVar) {
                        d7.k kVar2 = new d7.k(8, true);
                        kVar2.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, kVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((d7.k) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, kVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (M() <= 0) {
        }
        System.nanoTime();
    }
}
