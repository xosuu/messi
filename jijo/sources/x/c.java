package x;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f18221k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18222l;

    public c(int i10, w.d dVar) {
        w.d dVar2;
        super(dVar);
        this.f18221k = new ArrayList();
        this.f18270f = i10;
        w.d dVar3 = this.f18266b;
        w.d dVarN = dVar3.n(i10);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarN;
            if (dVar3 == null) {
                break;
            } else {
                dVarN = dVar3.n(this.f18270f);
            }
        }
        this.f18266b = dVar2;
        int i11 = this.f18270f;
        Object obj = i11 == 0 ? dVar2.f17988d : i11 == 1 ? dVar2.f17990e : null;
        ArrayList<p> arrayList = this.f18221k;
        arrayList.add(obj);
        w.d dVarM = dVar2.m(this.f18270f);
        while (dVarM != null) {
            int i12 = this.f18270f;
            arrayList.add(i12 == 0 ? dVarM.f17988d : i12 == 1 ? dVarM.f17990e : null);
            dVarM = dVarM.m(this.f18270f);
        }
        for (p pVar : arrayList) {
            int i13 = this.f18270f;
            if (i13 == 0) {
                pVar.f18266b.f17984b = this;
            } else if (i13 == 1) {
                pVar.f18266b.f17986c = this;
            }
        }
        if (this.f18270f == 0 && ((w.e) this.f18266b.T).f18028v0 && arrayList.size() > 1) {
            this.f18266b = ((p) arrayList.get(arrayList.size() - 1)).f18266b;
        }
        this.f18222l = this.f18270f == 0 ? this.f18266b.f17999i0 : this.f18266b.f18001j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0153  */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r27) {
        /*
            Method dump skipped, instruction units count: 971
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.c.a(x.d):void");
    }

    @Override // x.p
    public final void d() {
        ArrayList arrayList = this.f18221k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((p) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        w.d dVar = ((p) arrayList.get(0)).f18266b;
        w.d dVar2 = ((p) arrayList.get(size - 1)).f18266b;
        int i10 = this.f18270f;
        f fVar = this.f18273i;
        f fVar2 = this.f18272h;
        if (i10 == 0) {
            w.c cVar = dVar.I;
            w.c cVar2 = dVar2.K;
            f fVarI = p.i(cVar, 0);
            int iE = cVar.e();
            w.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.I.e();
            }
            if (fVarI != null) {
                p.b(fVar2, fVarI, iE);
            }
            f fVarI2 = p.i(cVar2, 0);
            int iE2 = cVar2.e();
            w.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.K.e();
            }
            if (fVarI2 != null) {
                p.b(fVar, fVarI2, -iE2);
            }
        } else {
            w.c cVar3 = dVar.J;
            w.c cVar4 = dVar2.L;
            f fVarI3 = p.i(cVar3, 1);
            int iE3 = cVar3.e();
            w.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.J.e();
            }
            if (fVarI3 != null) {
                p.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = p.i(cVar4, 1);
            int iE4 = cVar4.e();
            w.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.L.e();
            }
            if (fVarI4 != null) {
                p.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f18232a = this;
        fVar.f18232a = this;
    }

    @Override // x.p
    public final void e() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f18221k;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((p) arrayList.get(i10)).e();
            i10++;
        }
    }

    @Override // x.p
    public final void f() {
        this.f18267c = null;
        Iterator it = this.f18221k.iterator();
        while (it.hasNext()) {
            ((p) it.next()).f();
        }
    }

    @Override // x.p
    public final long j() {
        ArrayList arrayList = this.f18221k;
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = (p) arrayList.get(i10);
            j10 = ((long) pVar.f18273i.f18237f) + pVar.j() + j10 + ((long) pVar.f18272h.f18237f);
        }
        return j10;
    }

    @Override // x.p
    public final boolean k() {
        ArrayList arrayList = this.f18221k;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((p) arrayList.get(i10)).k()) {
                return false;
            }
        }
        return true;
    }

    public final w.d m() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f18221k;
            if (i10 >= arrayList.size()) {
                return null;
            }
            w.d dVar = ((p) arrayList.get(i10)).f18266b;
            if (dVar.f17995g0 != 8) {
                return dVar;
            }
            i10++;
        }
    }

    public final w.d n() {
        ArrayList arrayList = this.f18221k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w.d dVar = ((p) arrayList.get(size)).f18266b;
            if (dVar.f17995g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f18270f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.f18221k) {
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
