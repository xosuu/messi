package x;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.bf0;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.fm0;
import com.google.android.gms.internal.ads.ge0;
import com.google.android.gms.internal.ads.jl0;
import com.google.android.gms.internal.ads.l90;
import com.google.android.gms.internal.ads.ld0;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.qe0;
import com.google.android.gms.internal.ads.tc1;
import com.google.android.gms.internal.ads.tm0;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f18225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f18226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f18227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractCollection f18228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public AbstractCollection f18229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f18230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f18231i;

    public e(Looper looper, l90 l90Var, bf0 bf0Var) {
        this(new CopyOnWriteArraySet(), looper, l90Var, bf0Var, true);
    }

    public final void a(f fVar, int i10, ArrayList arrayList, l lVar) {
        p pVar = fVar.f18235d;
        if (pVar.f18267c == null) {
            w.e eVar = (w.e) this.f18225c;
            if (pVar == eVar.f17988d || pVar == eVar.f17990e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f18247a = null;
                lVar.f18248b = new ArrayList();
                lVar.f18247a = pVar;
                arrayList.add(lVar);
            }
            pVar.f18267c = lVar;
            lVar.f18248b.add(pVar);
            f fVar2 = pVar.f18272h;
            for (d dVar : fVar2.f18242k) {
                if (dVar instanceof f) {
                    a((f) dVar, i10, arrayList, lVar);
                }
            }
            f fVar3 = pVar.f18273i;
            for (d dVar2 : fVar3.f18242k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i10, arrayList, lVar);
                }
            }
            if (i10 == 1 && (pVar instanceof m)) {
                for (d dVar3 : ((m) pVar).f18249k.f18242k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i10, arrayList, lVar);
                    }
                }
            }
            Iterator it = fVar2.f18243l.iterator();
            while (it.hasNext()) {
                a((f) it.next(), i10, arrayList, lVar);
            }
            Iterator it2 = fVar3.f18243l.iterator();
            while (it2.hasNext()) {
                a((f) it2.next(), i10, arrayList, lVar);
            }
            if (i10 == 1 && (pVar instanceof m)) {
                Iterator it3 = ((m) pVar).f18249k.f18243l.iterator();
                while (it3.hasNext()) {
                    a((f) it3.next(), i10, arrayList, lVar);
                }
            }
        }
    }

    public final void b(w.e eVar) {
        int iR;
        for (w.d dVar : eVar.f18070q0) {
            int[] iArr = dVar.f18013p0;
            int i10 = iArr[0];
            int i11 = iArr[1];
            if (dVar.f17995g0 == 8) {
                dVar.f17982a = true;
            } else {
                float f10 = dVar.f18020w;
                if (f10 < 1.0f && i10 == 3) {
                    dVar.f18015r = 2;
                }
                float f11 = dVar.f18023z;
                if (f11 < 1.0f && i11 == 3) {
                    dVar.f18016s = 2;
                }
                int i12 = 1;
                if (dVar.W > 0.0f) {
                    if (i10 == 3 && (i11 == 2 || i11 == 1)) {
                        dVar.f18015r = 3;
                    } else if (i11 == 3 && (i10 == 2 || i10 == 1)) {
                        dVar.f18016s = 3;
                    } else if (i10 == 3 && i11 == 3) {
                        if (dVar.f18015r == 0) {
                            dVar.f18015r = 3;
                        }
                        if (dVar.f18016s == 0) {
                            dVar.f18016s = 3;
                        }
                    }
                }
                w.c cVar = dVar.K;
                w.c cVar2 = dVar.I;
                if (i10 == 3 && dVar.f18015r == 1 && (cVar2.f17978f == null || cVar.f17978f == null)) {
                    i10 = 2;
                }
                w.c cVar3 = dVar.L;
                w.c cVar4 = dVar.J;
                int i13 = (i11 == 3 && dVar.f18016s == 1 && (cVar4.f17978f == null || cVar3.f17978f == null)) ? 2 : i11;
                k kVar = dVar.f17988d;
                kVar.f18268d = i10;
                int i14 = dVar.f18015r;
                kVar.f18265a = i14;
                m mVar = dVar.f17990e;
                mVar.f18268d = i13;
                int i15 = dVar.f18016s;
                mVar.f18265a = i15;
                if ((i10 == 4 || i10 == 1 || i10 == 2) && (i13 == 4 || i13 == 1 || i13 == 2)) {
                    int iR2 = dVar.r();
                    if (i10 == 4) {
                        iR = (eVar.r() - cVar2.f17979g) - cVar.f17979g;
                        i10 = 1;
                    } else {
                        iR = iR2;
                    }
                    int iL = dVar.l();
                    if (i13 == 4) {
                        iL = (eVar.l() - cVar4.f17979g) - cVar3.f17979g;
                    } else {
                        i12 = i13;
                    }
                    f(dVar, i10, iR, i12, iL);
                    dVar.f17988d.f18269e.d(dVar.r());
                    dVar.f17990e.f18269e.d(dVar.l());
                    dVar.f17982a = true;
                } else {
                    int[] iArr2 = eVar.f18013p0;
                    w.c[] cVarArr = dVar.Q;
                    if (i10 == 3 && (i13 == 2 || i13 == 1)) {
                        if (i14 == 3) {
                            if (i13 == 2) {
                                f(dVar, 2, 0, 2, 0);
                            }
                            int iL2 = dVar.l();
                            f(dVar, 1, (int) ((iL2 * dVar.W) + 0.5f), 1, iL2);
                            dVar.f17988d.f18269e.d(dVar.r());
                            dVar.f17990e.f18269e.d(dVar.l());
                            dVar.f17982a = true;
                        } else if (i14 == 1) {
                            f(dVar, 2, 0, i13, 0);
                            dVar.f17988d.f18269e.f18244m = dVar.r();
                        } else if (i14 == 2) {
                            int i16 = iArr2[0];
                            if (i16 == 1 || i16 == 4) {
                                f(dVar, 1, (int) ((f10 * eVar.r()) + 0.5f), i13, dVar.l());
                                dVar.f17988d.f18269e.d(dVar.r());
                                dVar.f17990e.f18269e.d(dVar.l());
                                dVar.f17982a = true;
                            }
                        } else if (cVarArr[0].f17978f == null || cVarArr[1].f17978f == null) {
                            f(dVar, 2, 0, i13, 0);
                            dVar.f17988d.f18269e.d(dVar.r());
                            dVar.f17990e.f18269e.d(dVar.l());
                            dVar.f17982a = true;
                        }
                    }
                    if (i13 == 3 && (i10 == 2 || i10 == 1)) {
                        if (i15 == 3) {
                            if (i10 == 2) {
                                f(dVar, 2, 0, 2, 0);
                            }
                            int iR3 = dVar.r();
                            float f12 = dVar.W;
                            if (dVar.X == -1) {
                                f12 = 1.0f / f12;
                            }
                            f(dVar, 1, iR3, 1, (int) ((iR3 * f12) + 0.5f));
                            dVar.f17988d.f18269e.d(dVar.r());
                            dVar.f17990e.f18269e.d(dVar.l());
                            dVar.f17982a = true;
                        } else if (i15 == 1) {
                            f(dVar, i10, 0, 2, 0);
                            dVar.f17990e.f18269e.f18244m = dVar.l();
                        } else if (i15 == 2) {
                            int i17 = iArr2[1];
                            if (i17 == 1 || i17 == 4) {
                                f(dVar, i10, dVar.r(), 1, (int) ((f11 * eVar.l()) + 0.5f));
                                dVar.f17988d.f18269e.d(dVar.r());
                                dVar.f17990e.f18269e.d(dVar.l());
                                dVar.f17982a = true;
                            }
                        } else if (cVarArr[2].f17978f == null || cVarArr[3].f17978f == null) {
                            f(dVar, 2, 0, i13, 0);
                            dVar.f17988d.f18269e.d(dVar.r());
                            dVar.f17990e.f18269e.d(dVar.l());
                            dVar.f17982a = true;
                        }
                    }
                    if (i10 == 3 && i13 == 3) {
                        if (i14 == 1 || i15 == 1) {
                            f(dVar, 2, 0, 2, 0);
                            dVar.f17988d.f18269e.f18244m = dVar.r();
                            dVar.f17990e.f18269e.f18244m = dVar.l();
                        } else if (i15 == 2 && i14 == 2 && iArr2[0] == 1 && iArr2[1] == 1) {
                            f(dVar, 1, (int) ((f10 * eVar.r()) + 0.5f), 1, (int) ((f11 * eVar.l()) + 0.5f));
                            dVar.f17988d.f18269e.d(dVar.r());
                            dVar.f17990e.f18269e.d(dVar.l());
                            dVar.f17982a = true;
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        ArrayList<p> arrayList = (ArrayList) this.f18227e;
        arrayList.clear();
        w.e eVar = (w.e) this.f18226d;
        eVar.f17988d.f();
        eVar.f17990e.f();
        arrayList.add(eVar.f17988d);
        arrayList.add(eVar.f17990e);
        HashSet hashSet = null;
        for (w.d dVar : eVar.f18070q0) {
            if (dVar instanceof w.h) {
                i iVar = new i(dVar);
                dVar.f17988d.f();
                dVar.f17990e.f();
                iVar.f18270f = ((w.h) dVar).f18065u0;
                arrayList.add(iVar);
            } else {
                if (dVar.y()) {
                    if (dVar.f17984b == null) {
                        dVar.f17984b = new c(0, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f17984b);
                } else {
                    arrayList.add(dVar.f17988d);
                }
                if (dVar.z()) {
                    if (dVar.f17986c == null) {
                        dVar.f17986c = new c(1, dVar);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f17986c);
                } else {
                    arrayList.add(dVar.f17990e);
                }
                if (dVar instanceof w.j) {
                    arrayList.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
        for (p pVar : arrayList) {
            if (pVar.f18266b != eVar) {
                pVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f18229g;
        arrayList2.clear();
        w.e eVar2 = (w.e) this.f18225c;
        e(eVar2.f17988d, 0, arrayList2);
        e(eVar2.f17990e, 1, arrayList2);
        this.f18223a = false;
    }

    public final int d(w.e eVar, int i10) {
        ArrayList arrayList;
        int i11;
        int i12;
        long jMax;
        float f10;
        w.e eVar2 = eVar;
        ArrayList arrayList2 = (ArrayList) this.f18229g;
        int size = arrayList2.size();
        int i13 = 0;
        long jMax2 = 0;
        while (i13 < size) {
            p pVar = ((l) arrayList2.get(i13)).f18247a;
            if (!(pVar instanceof c) ? !(i10 != 0 ? (pVar instanceof m) : (pVar instanceof k)) : ((c) pVar).f18270f != i10) {
                f fVar = (i10 == 0 ? eVar2.f17988d : eVar2.f17990e).f18272h;
                f fVar2 = (i10 == 0 ? eVar2.f17988d : eVar2.f17990e).f18273i;
                boolean zContains = pVar.f18272h.f18243l.contains(fVar);
                f fVar3 = pVar.f18273i;
                boolean zContains2 = fVar3.f18243l.contains(fVar2);
                long j10 = pVar.j();
                f fVar4 = pVar.f18272h;
                if (zContains && zContains2) {
                    long jB = l.b(fVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i11 = size;
                    long jA = l.a(fVar3, 0L);
                    long j11 = jB - j10;
                    int i14 = fVar3.f18237f;
                    arrayList = arrayList3;
                    i12 = i13;
                    if (j11 >= (-i14)) {
                        j11 += (long) i14;
                    }
                    long j12 = (-jA) - j10;
                    long j13 = fVar4.f18237f;
                    long j14 = j12 - j13;
                    if (j14 >= j13) {
                        j14 -= j13;
                    }
                    w.d dVar = pVar.f18266b;
                    if (i10 == 0) {
                        f10 = dVar.f17989d0;
                    } else if (i10 == 1) {
                        f10 = dVar.f17991e0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    float f11 = f10 > 0.0f ? (long) ((j11 / (1.0f - f10)) + (j14 / f10)) : 0L;
                    jMax = (((long) fVar4.f18237f) + ((((long) ((f11 * f10) + 0.5f)) + j10) + ((long) fb1.c(1.0f, f10, f11, 0.5f)))) - ((long) fVar3.f18237f);
                } else {
                    arrayList = arrayList2;
                    i11 = size;
                    i12 = i13;
                    jMax = zContains ? Math.max(l.b(fVar4, fVar4.f18237f), ((long) fVar4.f18237f) + j10) : zContains2 ? Math.max(-l.a(fVar3, fVar3.f18237f), ((long) (-fVar3.f18237f)) + j10) : (pVar.j() + ((long) fVar4.f18237f)) - ((long) fVar3.f18237f);
                }
            } else {
                arrayList = arrayList2;
                i11 = size;
                i12 = i13;
                jMax = 0;
            }
            jMax2 = Math.max(jMax2, jMax);
            i13 = i12 + 1;
            eVar2 = eVar;
            size = i11;
            arrayList2 = arrayList;
        }
        return (int) jMax2;
    }

    public final void e(p pVar, int i10, ArrayList arrayList) {
        f fVar;
        Iterator it = pVar.f18272h.f18242k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fVar = pVar.f18273i;
            if (!zHasNext) {
                break;
            }
            d dVar = (d) it.next();
            if (dVar instanceof f) {
                a((f) dVar, i10, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).f18272h, i10, arrayList, null);
            }
        }
        for (d dVar2 : fVar.f18242k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i10, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).f18273i, i10, arrayList, null);
            }
        }
        if (i10 == 1) {
            for (d dVar3 : ((m) pVar).f18249k.f18242k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i10, arrayList, null);
                }
            }
        }
    }

    public final void f(w.d dVar, int i10, int i11, int i12, int i13) {
        b bVar = (b) this.f18231i;
        bVar.f18211a = i10;
        bVar.f18212b = i12;
        bVar.f18213c = i11;
        bVar.f18214d = i13;
        ((n) this.f18230h).b(dVar, bVar);
        dVar.P(bVar.f18215e);
        dVar.M(bVar.f18216f);
        dVar.E = bVar.f18218h;
        dVar.J(bVar.f18217g);
    }

    public final void g() {
        a aVar;
        for (w.d dVar : ((w.e) this.f18225c).f18070q0) {
            if (!dVar.f17982a) {
                int[] iArr = dVar.f18013p0;
                boolean z9 = false;
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = dVar.f18015r;
                int i13 = dVar.f18016s;
                boolean z10 = i10 == 2 || (i10 == 3 && i12 == 1);
                if (i11 == 2 || (i11 == 3 && i13 == 1)) {
                    z9 = true;
                }
                g gVar = dVar.f17988d.f18269e;
                boolean z11 = gVar.f18241j;
                g gVar2 = dVar.f17990e.f18269e;
                boolean z12 = gVar2.f18241j;
                if (z11 && z12) {
                    f(dVar, 1, gVar.f18238g, 1, gVar2.f18238g);
                    dVar.f17982a = true;
                } else if (z11 && z9) {
                    f(dVar, 1, gVar.f18238g, 2, gVar2.f18238g);
                    if (i11 == 3) {
                        dVar.f17990e.f18269e.f18244m = dVar.l();
                    } else {
                        dVar.f17990e.f18269e.d(dVar.l());
                        dVar.f17982a = true;
                    }
                } else if (z12 && z10) {
                    f(dVar, 2, gVar.f18238g, 1, gVar2.f18238g);
                    if (i10 == 3) {
                        dVar.f17988d.f18269e.f18244m = dVar.r();
                    } else {
                        dVar.f17988d.f18269e.d(dVar.r());
                        dVar.f17982a = true;
                    }
                }
                if (dVar.f17982a && (aVar = dVar.f17990e.f18250l) != null) {
                    aVar.d(dVar.f17983a0);
                }
            }
        }
    }

    public final void h(Object obj) {
        synchronized (this.f18231i) {
            try {
                if (this.f18223a) {
                    return;
                }
                ((CopyOnWriteArraySet) this.f18228f).add(new nf0(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i() {
        l();
        if (((ArrayDeque) this.f18230h).isEmpty()) {
            return;
        }
        tm0 tm0Var = (tm0) ((ld0) this.f18226d);
        if (!tm0Var.f9195a.hasMessages(0)) {
            tm0Var.getClass();
            fm0 fm0VarE = tm0.e();
            Handler handler = tm0Var.f9195a;
            Message messageObtainMessage = handler.obtainMessage(0);
            fm0VarE.f4572a = messageObtainMessage;
            messageObtainMessage.getClass();
            handler.sendMessageAtFrontOfQueue(messageObtainMessage);
            fm0VarE.f4572a = null;
            tm0.d(fm0VarE);
        }
        ArrayDeque arrayDeque = (ArrayDeque) this.f18229g;
        boolean z9 = !arrayDeque.isEmpty();
        arrayDeque.addAll((ArrayDeque) this.f18230h);
        ((ArrayDeque) this.f18230h).clear();
        if (z9) {
            return;
        }
        while (!arrayDeque.isEmpty()) {
            ((Runnable) arrayDeque.peekFirst()).run();
            arrayDeque.removeFirst();
        }
    }

    public final void j(int i10, qe0 qe0Var) {
        l();
        ((ArrayDeque) this.f18230h).add(new ge0(new CopyOnWriteArraySet((CopyOnWriteArraySet) this.f18228f), i10, qe0Var));
    }

    public final void k() {
        l();
        synchronized (this.f18231i) {
            this.f18223a = true;
        }
        for (nf0 nf0Var : (CopyOnWriteArraySet) this.f18228f) {
            bf0 bf0Var = (bf0) this.f18227e;
            nf0Var.f7257d = true;
            if (nf0Var.f7256c) {
                nf0Var.f7256c = false;
                bf0Var.G(nf0Var.f7254a, nf0Var.f7255b.e());
            }
        }
        ((CopyOnWriteArraySet) this.f18228f).clear();
    }

    public final void l() {
        if (this.f18224b) {
            tc1.W(Thread.currentThread() == ((tm0) ((ld0) this.f18226d)).f9195a.getLooper().getThread());
        }
    }

    public e(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, l90 l90Var, bf0 bf0Var, boolean z9) {
        this.f18225c = l90Var;
        this.f18228f = copyOnWriteArraySet;
        this.f18227e = bf0Var;
        this.f18231i = new Object();
        this.f18229g = new ArrayDeque();
        this.f18230h = new ArrayDeque();
        this.f18226d = ((jl0) l90Var).a(looper, new Handler.Callback() { // from class: com.google.android.gms.internal.ads.vd0
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                x.e eVar = this.f9833a;
                for (nf0 nf0Var : (CopyOnWriteArraySet) eVar.f18228f) {
                    bf0 bf0Var2 = (bf0) eVar.f18227e;
                    if (!nf0Var.f7257d && nf0Var.f7256c) {
                        p pVarE = nf0Var.f7255b.e();
                        nf0Var.f7255b = new f.x0();
                        nf0Var.f7256c = false;
                        bf0Var2.G(nf0Var.f7254a, pVarE);
                    }
                    if (((tm0) ((ld0) eVar.f18226d)).f9195a.hasMessages(0)) {
                        return true;
                    }
                }
                return true;
            }
        });
        this.f18224b = z9;
    }
}
