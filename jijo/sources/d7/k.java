package d7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12501e = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f12502f = AtomicLongFieldUpdater.newUpdater(k.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final v3.k f12503g = new v3.k("REMOVE_FROZEN", 2);
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f12506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f12507d;

    public k(int i10, boolean z9) {
        this.f12504a = i10;
        this.f12505b = z9;
        int i11 = i10 - 1;
        this.f12506c = i11;
        this.f12507d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
        L4:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = d7.k.f12502f
            long r2 = r8.get(r6)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r9 = 0
            r4 = 1
            int r5 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r5 == 0) goto L1d
            r0 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r0 = r0 & r2
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 == 0) goto L1c
            r4 = 2
        L1c:
            return r4
        L1d:
            r0 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r0 = r0 & r2
            int r1 = (int) r0
            r11 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r11 = r11 & r2
            r0 = 30
            long r11 = r11 >> r0
            int r12 = (int) r11
            int r5 = r12 + 2
            int r11 = r6.f12506c
            r5 = r5 & r11
            r13 = r1 & r11
            if (r5 != r13) goto L36
            return r4
        L36:
            boolean r5 = r6.f12505b
            r13 = 1073741823(0x3fffffff, float:1.9999999)
            java.util.concurrent.atomic.AtomicReferenceArray r14 = r6.f12507d
            if (r5 != 0) goto L55
            r5 = r12 & r11
            java.lang.Object r5 = r14.get(r5)
            if (r5 == 0) goto L55
            r0 = 1024(0x400, float:1.435E-42)
            int r2 = r6.f12504a
            if (r2 < r0) goto L54
            int r12 = r12 - r1
            r0 = r12 & r13
            int r1 = r2 >> 1
            if (r0 <= r1) goto L4
        L54:
            return r4
        L55:
            int r1 = r12 + 1
            r1 = r1 & r13
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = d7.k.f12502f
            r15 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r15 = r15 & r2
            long r9 = (long) r1
            long r0 = r9 << r0
            long r9 = r15 | r0
            r0 = r4
            r1 = r17
            r4 = r9
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L4
            r0 = r12 & r11
            r14.set(r0, r7)
            r0 = r6
        L75:
            long r1 = r8.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto La0
            d7.k r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.f12507d
            int r2 = r0.f12506c
            r2 = r2 & r12
            java.lang.Object r5 = r1.get(r2)
            boolean r9 = r5 instanceof d7.j
            if (r9 == 0) goto L9d
            d7.j r5 = (d7.j) r5
            int r5 = r5.f12500a
            if (r5 != r12) goto L9d
            r1.set(r2, r7)
            goto L9e
        L9d:
            r0 = 0
        L9e:
            if (r0 != 0) goto L75
        La0:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.k.a(java.lang.Object):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f12502f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final k c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        while (true) {
            atomicLongFieldUpdater = f12502f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                break;
            }
            long j11 = j10 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12501e;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            if (kVar != null) {
                return kVar;
            }
            k kVar2 = new k(this.f12504a * 2, this.f12505b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = this.f12506c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object jVar = this.f12507d.get(i13);
                if (jVar == null) {
                    jVar = new j(i10);
                }
                kVar2.f12507d.set(kVar2.f12506c & i10, jVar);
                i10++;
            }
            atomicLongFieldUpdater.set(kVar2, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, kVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f12502f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                return f12503g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.f12506c;
            int i13 = i10 & i12;
            if ((i11 & i12) == i13) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.f12507d;
            Object obj = atomicReferenceArray.get(i13);
            boolean z9 = this.f12505b;
            if (obj == null) {
                if (z9) {
                    return null;
                }
            } else {
                if (obj instanceof j) {
                    return null;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i13, null);
                    return obj;
                }
                if (z9) {
                    k kVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f12502f;
                        long j12 = atomicLongFieldUpdater2.get(kVarC);
                        int i14 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            kVarC = kVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(kVarC, j12, (j12 & (-1073741824)) | j11)) {
                                kVarC.f12507d.set(kVarC.f12506c & i14, null);
                                kVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (kVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
