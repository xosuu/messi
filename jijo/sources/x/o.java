package x;

import g4.d0;
import java.util.ArrayList;
import l.a0;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f18259f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f18260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f18263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18264e;

    public final void a(ArrayList arrayList) {
        int size = this.f18260a.size();
        if (this.f18264e != -1 && size > 0) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                o oVar = (o) arrayList.get(i10);
                if (this.f18264e == oVar.f18261b) {
                    c(this.f18262c, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(u.d dVar, int i10) {
        int iN;
        int iN2;
        ArrayList arrayList = this.f18260a;
        if (arrayList.size() == 0) {
            return 0;
        }
        w.e eVar = (w.e) ((w.d) arrayList.get(0)).T;
        dVar.t();
        eVar.c(dVar, false);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((w.d) arrayList.get(i11)).c(dVar, false);
        }
        if (i10 == 0 && eVar.f18032z0 > 0) {
            d0.a(eVar, dVar, arrayList, 0);
        }
        if (i10 == 1 && eVar.A0 > 0) {
            d0.a(eVar, dVar, arrayList, 1);
        }
        try {
            dVar.p();
        } catch (Exception unused) {
        }
        this.f18263d = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            this.f18263d.add(new n(this, (w.d) arrayList.get(i12), dVar, i10));
        }
        if (i10 == 0) {
            iN = u.d.n(eVar.I);
            iN2 = u.d.n(eVar.K);
            dVar.t();
        } else {
            iN = u.d.n(eVar.J);
            iN2 = u.d.n(eVar.L);
            dVar.t();
        }
        return iN2 - iN;
    }

    public final void c(int i10, o oVar) {
        for (w.d dVar : this.f18260a) {
            ArrayList arrayList = oVar.f18260a;
            if (!arrayList.contains(dVar)) {
                arrayList.add(dVar);
            }
            int i11 = oVar.f18261b;
            if (i10 == 0) {
                dVar.f18009n0 = i11;
            } else {
                dVar.f18011o0 = i11;
            }
        }
        this.f18264e = oVar.f18261b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i10 = this.f18262c;
        sb.append(i10 == 0 ? "Horizontal" : i10 == 1 ? "Vertical" : i10 == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String strH = a0.h(sb, this.f18261b, "] <");
        for (w.d dVar : this.f18260a) {
            StringBuilder sbK = a0.k(strH, " ");
            sbK.append(dVar.f17997h0);
            strH = sbK.toString();
        }
        return g1.a.y(strH, " >");
    }
}
