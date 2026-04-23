package d7;

import b7.u;
import g4.a0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12496a = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12497b = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_prev");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12498d = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
    
        r6 = ((d7.o) r6).f12509a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final d7.h f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = d7.h.f12497b
            java.lang.Object r1 = r0.get(r9)
            d7.h r1 = (d7.h) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = d7.h.f12496a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.j()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            if (r6 != 0) goto L2e
            return r3
        L2e:
            boolean r7 = r6 instanceof d7.n
            if (r7 == 0) goto L38
            d7.n r6 = (d7.n) r6
            r6.a(r3)
            goto L0
        L38:
            boolean r7 = r6 instanceof d7.o
            if (r7 == 0) goto L58
            if (r4 == 0) goto L51
            d7.o r6 = (d7.o) r6
            d7.h r6 = r6.f12509a
        L42:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L4a
            r3 = r4
            goto La
        L4a:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L42
            goto L0
        L51:
            java.lang.Object r3 = r0.get(r3)
            d7.h r3 = (d7.h) r3
            goto Lb
        L58:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            g4.a0.d(r6, r4)
            r4 = r6
            d7.h r4 = (d7.h) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.h.f():d7.h");
    }

    public final void g(h hVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12497b;
            h hVar2 = (h) atomicReferenceFieldUpdater.get(hVar);
            if (h() != hVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(hVar, hVar2, this)) {
                if (atomicReferenceFieldUpdater.get(hVar) != hVar2) {
                    break;
                }
            }
            if (j()) {
                hVar.f();
                return;
            }
            return;
        }
    }

    public final Object h() {
        while (true) {
            Object obj = f12496a.get(this);
            if (!(obj instanceof n)) {
                return obj;
            }
            ((n) obj).a(this);
        }
    }

    public final h i() {
        h hVar;
        Object objH = h();
        o oVar = objH instanceof o ? (o) objH : null;
        if (oVar != null && (hVar = oVar.f12509a) != null) {
            return hVar;
        }
        a0.d(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (h) objH;
    }

    public boolean j() {
        return h() instanceof o;
    }

    public String toString() {
        return new g(this) + '@' + u.m(this);
    }
}
