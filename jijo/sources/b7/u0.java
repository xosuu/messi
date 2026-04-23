package b7;

import com.google.android.gms.internal.ads.en1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes.dex */
public class u0 implements n0, i, z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1471a = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1472b = AtomicReferenceFieldUpdater.newUpdater(u0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public u0(boolean z9) {
        this._state = z9 ? u.f1468p : u.f1467o;
    }

    public static h t(d7.h hVar) {
        while (hVar.j()) {
            d7.h hVarF = hVar.f();
            if (hVarF == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d7.h.f12497b;
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                while (true) {
                    hVar = (d7.h) obj;
                    if (!hVar.j()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(hVar);
                }
            } else {
                hVar = hVarF;
            }
        }
        while (true) {
            hVar = hVar.i();
            if (!hVar.j()) {
                if (hVar instanceof h) {
                    return (h) hVar;
                }
                if (hVar instanceof w0) {
                    return null;
                }
            }
        }
    }

    public static String z(Object obj) {
        if (!(obj instanceof s0)) {
            return obj instanceof j0 ? ((j0) obj).a() ? "Active" : "New" : obj instanceof k ? "Cancelled" : "Completed";
        }
        s0 s0Var = (s0) obj;
        return s0Var.d() ? "Cancelling" : s0Var.f() ? "Completing" : "Active";
    }

    @Override // n6.j
    public final n6.h A(n6.i iVar) {
        return en1.o(this, iVar);
    }

    public final Object B(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof j0)) {
            return u.f1462j;
        }
        if (((obj instanceof d0) || (obj instanceof q0)) && !(obj instanceof h) && !(obj2 instanceof k)) {
            j0 j0Var = (j0) obj;
            Object k0Var = obj2 instanceof j0 ? new k0((j0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f1471a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, j0Var, k0Var)) {
                    w(obj2);
                    h(j0Var, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == j0Var);
            return u.f1464l;
        }
        j0 j0Var2 = (j0) obj;
        w0 w0VarN = n(j0Var2);
        if (w0VarN == null) {
            return u.f1464l;
        }
        h hVarT = null;
        s0 s0Var = j0Var2 instanceof s0 ? (s0) j0Var2 : null;
        if (s0Var == null) {
            s0Var = new s0(w0VarN, null);
        }
        synchronized (s0Var) {
            if (s0Var.f()) {
                return u.f1462j;
            }
            s0.f1445b.set(s0Var, 1);
            if (s0Var != j0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1471a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, j0Var2, s0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != j0Var2) {
                        return u.f1464l;
                    }
                }
            }
            boolean zD = s0Var.d();
            k kVar = obj2 instanceof k ? (k) obj2 : null;
            if (kVar != null) {
                s0Var.b(kVar.f1424a);
            }
            Throwable thC = s0Var.c();
            if (!Boolean.valueOf(!zD).booleanValue()) {
                thC = null;
            }
            if (thC != null) {
                v(w0VarN, thC);
            }
            h hVar = j0Var2 instanceof h ? (h) j0Var2 : null;
            if (hVar == null) {
                w0 w0VarE = j0Var2.e();
                if (w0VarE != null) {
                    hVarT = t(w0VarE);
                }
            } else {
                hVarT = hVar;
            }
            if (hVarT != null) {
                while (g4.a0.m(hVarT.f1417h, false, new r0(this, s0Var, hVarT, obj2), 1) == x0.f1476a) {
                    hVarT = t(hVarT);
                    if (hVarT == null) {
                    }
                }
                return u.f1463k;
            }
            return j(s0Var, obj2);
        }
    }

    @Override // b7.n0
    public boolean a() {
        Object objO = o();
        return (objO instanceof j0) && ((j0) objO).a();
    }

    public final boolean b(Object obj, w0 w0Var, q0 q0Var) {
        char c10;
        t0 t0Var = new t0(q0Var, this, obj);
        do {
            d7.h hVarF = w0Var.f();
            if (hVarF == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d7.h.f12497b;
                Object obj2 = atomicReferenceFieldUpdater.get(w0Var);
                while (true) {
                    hVarF = (d7.h) obj2;
                    if (!hVarF.j()) {
                        break;
                    }
                    obj2 = atomicReferenceFieldUpdater.get(hVarF);
                }
            }
            d7.h.f12497b.lazySet(q0Var, hVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d7.h.f12496a;
            atomicReferenceFieldUpdater2.lazySet(q0Var, w0Var);
            t0Var.f1450c = w0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(hVarF, w0Var, t0Var)) {
                    c10 = t0Var.a(hVarF) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(hVarF) != w0Var) {
                    c10 = 0;
                    break;
                }
            }
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    @Override // n6.j
    public final n6.j c(n6.j jVar) {
        return en1.A(this, jVar);
    }

    @Override // n6.j
    public final n6.j e(n6.i iVar) {
        return en1.x(this, iVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.u0.f(java.lang.Object):boolean");
    }

    public String g() {
        return "Job was cancelled";
    }

    @Override // n6.h
    public final n6.i getKey() {
        return r.f1440b;
    }

    public final void h(j0 j0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1472b;
        g gVar = (g) atomicReferenceFieldUpdater.get(this);
        if (gVar != null) {
            gVar.b();
            atomicReferenceFieldUpdater.set(this, x0.f1476a);
        }
        CompletionHandlerException completionHandlerException = null;
        k kVar = obj instanceof k ? (k) obj : null;
        Throwable th = kVar != null ? kVar.f1424a : null;
        if (j0Var instanceof q0) {
            try {
                ((q0) j0Var).l(th);
                return;
            } catch (Throwable th2) {
                p(new CompletionHandlerException("Exception in completion handler " + j0Var + " for " + this, th2));
                return;
            }
        }
        w0 w0VarE = j0Var.e();
        if (w0VarE != null) {
            Object objH = w0VarE.h();
            g4.a0.d(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (d7.h hVarI = (d7.h) objH; !g4.a0.b(hVarI, w0VarE); hVarI = hVarI.i()) {
                if (hVarI instanceof q0) {
                    q0 q0Var = (q0) hVarI;
                    try {
                        q0Var.l(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            g4.a0.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + q0Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                p(completionHandlerException);
            }
        }
    }

    public final Throwable i(Object obj) {
        Throwable thC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        u0 u0Var = (u0) ((z0) obj);
        Object objO = u0Var.o();
        if (objO instanceof s0) {
            thC = ((s0) objO).c();
        } else if (objO instanceof k) {
            thC = ((k) objO).f1424a;
        } else {
            if (objO instanceof j0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objO).toString());
            }
            thC = null;
        }
        CancellationException jobCancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (jobCancellationException == null) {
            jobCancellationException = new JobCancellationException("Parent job is ".concat(z(objO)), thC, u0Var);
        }
        return jobCancellationException;
    }

    public final Object j(s0 s0Var, Object obj) {
        Throwable thL;
        k kVar = obj instanceof k ? (k) obj : null;
        Throwable th = kVar != null ? kVar.f1424a : null;
        synchronized (s0Var) {
            s0Var.d();
            ArrayList<Throwable> arrayListG = s0Var.g(th);
            thL = l(s0Var, arrayListG);
            if (thL != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                for (Throwable th2 : arrayListG) {
                    if (th2 != thL && th2 != thL && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        g4.a0.a(thL, th2);
                    }
                }
            }
        }
        if (thL != null && thL != th) {
            obj = new k(thL, false);
        }
        if (thL != null) {
            boolean z9 = thL instanceof CancellationException;
            g gVar = (g) f1472b.get(this);
            if (gVar == null || gVar == x0.f1476a ? z9 : gVar.c(thL) || z9) {
                g4.a0.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                k.f1423b.compareAndSet((k) obj, 0, 1);
            }
        }
        w(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1471a;
        Object k0Var = obj instanceof j0 ? new k0((j0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, s0Var, k0Var) && atomicReferenceFieldUpdater.get(this) == s0Var) {
        }
        h(s0Var, obj);
        return obj;
    }

    public final CancellationException k() {
        CancellationException cancellationException;
        Object objO = o();
        if (!(objO instanceof s0)) {
            if (objO instanceof j0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objO instanceof k)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((k) objO).f1424a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(g(), th, this) : cancellationException;
        }
        Throwable thC = ((s0) objO).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = g();
        }
        return new JobCancellationException(strConcat, thC, this);
    }

    public final Throwable l(s0 s0Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (s0Var.d()) {
                return new JobCancellationException(g(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean m() {
        return true;
    }

    public final w0 n(j0 j0Var) {
        w0 w0VarE = j0Var.e();
        if (w0VarE != null) {
            return w0VarE;
        }
        if (j0Var instanceof d0) {
            return new w0();
        }
        if (j0Var instanceof q0) {
            y((q0) j0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + j0Var).toString());
    }

    public final Object o() {
        while (true) {
            Object obj = f1471a.get(this);
            if (!(obj instanceof d7.n)) {
                return obj;
            }
            ((d7.n) obj).a(this);
        }
    }

    public void p(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public final void q(n0 n0Var) {
        byte b10;
        x0 x0Var = x0.f1476a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1472b;
        if (n0Var == null) {
            atomicReferenceFieldUpdater.set(this, x0Var);
            return;
        }
        u0 u0Var = (u0) n0Var;
        do {
            Object objO = u0Var.o();
            boolean z9 = objO instanceof d0;
            b10 = 0;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1471a;
            if (z9) {
                if (!((d0) objO).f1406a) {
                    d0 d0Var = u.f1468p;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(u0Var, objO, d0Var)) {
                        if (atomicReferenceFieldUpdater2.get(u0Var) != objO) {
                            b10 = -1;
                            break;
                        }
                    }
                    u0Var.x();
                    b10 = 1;
                }
            } else if (objO instanceof i0) {
                w0 w0Var = ((i0) objO).f1418a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(u0Var, objO, w0Var)) {
                    if (atomicReferenceFieldUpdater2.get(u0Var) != objO) {
                        b10 = -1;
                        break;
                    }
                }
                u0Var.x();
                b10 = 1;
            }
            if (b10 == 0) {
                break;
            }
        } while (b10 != 1);
        g gVar = (g) g4.a0.m(u0Var, true, new h(this), 2);
        atomicReferenceFieldUpdater.set(this, gVar);
        if (!(o() instanceof j0)) {
            gVar.b();
            atomicReferenceFieldUpdater.set(this, x0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final b7.c0 r(boolean r8, boolean r9, t6.l r10) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.u0.r(boolean, boolean, t6.l):b7.c0");
    }

    public String s() {
        return getClass().getSimpleName();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(s() + '{' + z(o()) + '}');
        sb.append('@');
        sb.append(u.m(this));
        return sb.toString();
    }

    @Override // n6.j
    public final Object u(Object obj, t6.p pVar) {
        return pVar.c(obj, this);
    }

    public final void v(w0 w0Var, Throwable th) {
        Object objH = w0Var.h();
        g4.a0.d(objH, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (d7.h hVarI = (d7.h) objH; !g4.a0.b(hVarI, w0Var); hVarI = hVarI.i()) {
            if (hVarI instanceof o0) {
                q0 q0Var = (q0) hVarI;
                try {
                    q0Var.l(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        g4.a0.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + q0Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            p(completionHandlerException);
        }
        boolean z9 = th instanceof CancellationException;
        g gVar = (g) f1472b.get(this);
        if (gVar == null || gVar == x0.f1476a) {
            return;
        }
        gVar.c(th);
    }

    public void w(Object obj) {
    }

    public void x() {
    }

    public final void y(q0 q0Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        w0 w0Var = new w0();
        q0Var.getClass();
        d7.h.f12497b.lazySet(w0Var, q0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = d7.h.f12496a;
        atomicReferenceFieldUpdater2.lazySet(w0Var, q0Var);
        loop0: while (true) {
            if (q0Var.h() == q0Var) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(q0Var, q0Var, w0Var)) {
                    if (atomicReferenceFieldUpdater2.get(q0Var) != q0Var) {
                        break;
                    }
                }
                w0Var.g(q0Var);
                break loop0;
            }
            break;
        }
        d7.h hVarI = q0Var.i();
        do {
            atomicReferenceFieldUpdater = f1471a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, q0Var, hVarI)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == q0Var);
    }
}
