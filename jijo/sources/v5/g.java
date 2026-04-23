package v5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f17822b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashMap f17823d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f17824f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f17825h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17826q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f17827s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f17828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f17829u;

    @Override // v5.b
    public final void c() {
        this.f17828t = true;
        if (this.f17829u) {
            if (this.f17825h.size() != this.f17824f.size()) {
                h();
                for (f fVar : this.f17825h) {
                    if (this.f17827s == null) {
                        this.f17827s = new c(this, this);
                    }
                    fVar.f17816a.a(this.f17827s);
                }
            }
            if (this.f17825h.size() > 0) {
                Iterator it = this.f17825h.iterator();
                while (it.hasNext()) {
                    ((f) it.next()).f17816a.c();
                }
            }
            ArrayList arrayList = this.f17808a;
            if (arrayList != null) {
                Iterator it2 = ((ArrayList) arrayList.clone()).iterator();
                while (it2.hasNext()) {
                    ((a) it2.next()).c(this);
                }
            }
            this.f17829u = false;
        }
    }

    @Override // v5.b
    public final boolean d() {
        Iterator it = this.f17824f.iterator();
        while (it.hasNext()) {
            if (((f) it.next()).f17816a.d()) {
                return true;
            }
        }
        return false;
    }

    @Override // v5.b
    public final void f() {
        this.f17828t = false;
        this.f17829u = true;
        h();
        int size = this.f17825h.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = (f) this.f17825h.get(i10);
            ArrayList arrayList = fVar.f17816a.f17808a;
            if (arrayList != null && arrayList.size() > 0) {
                for (a aVar : new ArrayList(arrayList)) {
                    if ((aVar instanceof e) || (aVar instanceof c)) {
                        fVar.f17816a.e(aVar);
                    }
                }
            }
        }
        ArrayList<f> arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < size; i11++) {
            f fVar2 = (f) this.f17825h.get(i11);
            if (this.f17827s == null) {
                this.f17827s = new c(this, this);
            }
            ArrayList arrayList3 = fVar2.f17817b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(fVar2);
            } else {
                int size2 = fVar2.f17817b.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    d dVar = (d) fVar2.f17817b.get(i12);
                    b bVar = dVar.f17811a.f17816a;
                    e eVar = new e();
                    eVar.f17813a = this;
                    eVar.f17814b = fVar2;
                    eVar.f17815c = dVar.f17812b;
                    bVar.a(eVar);
                }
                fVar2.f17818d = (ArrayList) fVar2.f17817b.clone();
            }
            fVar2.f17816a.a(this.f17827s);
        }
        for (f fVar3 : arrayList2) {
            fVar3.f17816a.f();
            this.f17822b.add(fVar3.f17816a);
        }
        ArrayList arrayList4 = this.f17808a;
        if (arrayList4 != null) {
            ArrayList arrayList5 = (ArrayList) arrayList4.clone();
            int size3 = arrayList5.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((a) arrayList5.get(i13)).a(this);
            }
        }
        if (this.f17824f.size() == 0) {
            this.f17829u = false;
            ArrayList arrayList6 = this.f17808a;
            if (arrayList6 != null) {
                ArrayList arrayList7 = (ArrayList) arrayList6.clone();
                int size4 = arrayList7.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    ((a) arrayList7.get(i14)).c(this);
                }
            }
        }
    }

    @Override // v5.b
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final g clone() {
        g gVar = (g) super.clone();
        gVar.f17826q = true;
        gVar.f17828t = false;
        gVar.f17829u = false;
        gVar.f17822b = new ArrayList();
        gVar.f17823d = new HashMap();
        gVar.f17824f = new ArrayList();
        gVar.f17825h = new ArrayList();
        HashMap map = new HashMap();
        for (f fVar : this.f17824f) {
            f fVarClone = fVar.clone();
            map.put(fVar, fVarClone);
            gVar.f17824f.add(fVarClone);
            gVar.f17823d.put(fVarClone.f17816a, fVarClone);
            ArrayList arrayList = null;
            fVarClone.f17817b = null;
            fVarClone.f17818d = null;
            fVarClone.f17820h = null;
            fVarClone.f17819f = null;
            ArrayList<a> arrayList2 = fVarClone.f17816a.f17808a;
            if (arrayList2 != null) {
                for (a aVar : arrayList2) {
                    if (aVar instanceof c) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(aVar);
                    }
                }
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.remove((a) it.next());
                    }
                }
            }
        }
        for (f fVar2 : this.f17824f) {
            f fVar3 = (f) map.get(fVar2);
            ArrayList<d> arrayList3 = fVar2.f17817b;
            if (arrayList3 != null) {
                for (d dVar : arrayList3) {
                    fVar3.a(new d((f) map.get(dVar.f17811a), dVar.f17812b));
                }
            }
        }
        return gVar;
    }

    public final void h() {
        if (!this.f17826q) {
            int size = this.f17824f.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar = (f) this.f17824f.get(i10);
                ArrayList arrayList = fVar.f17817b;
                if (arrayList != null && arrayList.size() > 0) {
                    int size2 = fVar.f17817b.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        d dVar = (d) fVar.f17817b.get(i11);
                        if (fVar.f17819f == null) {
                            fVar.f17819f = new ArrayList();
                        }
                        if (!fVar.f17819f.contains(dVar.f17811a)) {
                            fVar.f17819f.add(dVar.f17811a);
                        }
                    }
                }
                fVar.f17821q = false;
            }
            return;
        }
        this.f17825h.clear();
        ArrayList arrayList2 = new ArrayList();
        int size3 = this.f17824f.size();
        for (int i12 = 0; i12 < size3; i12++) {
            f fVar2 = (f) this.f17824f.get(i12);
            ArrayList arrayList3 = fVar2.f17817b;
            if (arrayList3 == null || arrayList3.size() == 0) {
                arrayList2.add(fVar2);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        while (arrayList2.size() > 0) {
            int size4 = arrayList2.size();
            for (int i13 = 0; i13 < size4; i13++) {
                f fVar3 = (f) arrayList2.get(i13);
                this.f17825h.add(fVar3);
                ArrayList arrayList5 = fVar3.f17820h;
                if (arrayList5 != null) {
                    int size5 = arrayList5.size();
                    for (int i14 = 0; i14 < size5; i14++) {
                        f fVar4 = (f) fVar3.f17820h.get(i14);
                        fVar4.f17819f.remove(fVar3);
                        if (fVar4.f17819f.size() == 0) {
                            arrayList4.add(fVar4);
                        }
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(arrayList4);
            arrayList4.clear();
        }
        this.f17826q = false;
        if (this.f17825h.size() != this.f17824f.size()) {
            throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
        }
    }
}
