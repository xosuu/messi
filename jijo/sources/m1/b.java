package m1;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f0 f15406d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u.e f15403a = new u.e(30, 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f15404b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15405c = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f15407e = new n0(2, this);

    public b(f0 f0Var) {
        this.f15406d = f0Var;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f15405c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f15396a;
            if (i12 == 8) {
                if (f(aVar.f15399d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = aVar.f15397b;
                int i14 = aVar.f15399d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = this.f15405c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f15406d.a((a) arrayList.get(i10));
        }
        l(arrayList);
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f15404b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f15396a;
            f0 f0Var = this.f15406d;
            if (i11 == 1) {
                f0Var.a(aVar);
                f0Var.d(aVar.f15397b, aVar.f15399d);
            } else if (i11 == 2) {
                f0Var.a(aVar);
                int i12 = aVar.f15397b;
                int i13 = aVar.f15399d;
                RecyclerView recyclerView = f0Var.f15468a;
                recyclerView.O(i12, i13, true);
                recyclerView.f1063r0 = true;
                recyclerView.f1059o0.f15412c += i13;
            } else if (i11 == 4) {
                f0Var.a(aVar);
                f0Var.c(aVar.f15397b, aVar.f15399d, aVar.f15398c);
            } else if (i11 == 8) {
                f0Var.a(aVar);
                f0Var.e(aVar.f15397b, aVar.f15399d);
            }
        }
        l(arrayList);
    }

    public final void d(a aVar) {
        int i10;
        int i11 = aVar.f15396a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM = m(aVar.f15397b, i11);
        int i12 = aVar.f15397b;
        int i13 = aVar.f15396a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + aVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < aVar.f15399d; i15++) {
            int iM2 = m((i10 * i15) + aVar.f15397b, aVar.f15396a);
            int i16 = aVar.f15396a;
            if (i16 == 2 ? iM2 != iM : !(i16 == 4 && iM2 == iM + 1)) {
                a aVarH = h(aVar.f15398c, i16, iM, i14);
                e(aVarH, i12);
                k(aVarH);
                if (aVar.f15396a == 4) {
                    i12 += i14;
                }
                iM = iM2;
                i14 = 1;
            } else {
                i14++;
            }
        }
        Object obj = aVar.f15398c;
        k(aVar);
        if (i14 > 0) {
            a aVarH2 = h(obj, aVar.f15396a, iM, i14);
            e(aVarH2, i12);
            k(aVarH2);
        }
    }

    public final void e(a aVar, int i10) {
        f0 f0Var = this.f15406d;
        f0Var.a(aVar);
        int i11 = aVar.f15396a;
        if (i11 != 2) {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            f0Var.c(i10, aVar.f15399d, aVar.f15398c);
        } else {
            int i12 = aVar.f15399d;
            RecyclerView recyclerView = f0Var.f15468a;
            recyclerView.O(i10, i12, true);
            recyclerView.f1063r0 = true;
            recyclerView.f1059o0.f15412c += i12;
        }
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f15405c;
        int size = arrayList.size();
        while (i11 < size) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.f15396a;
            if (i12 == 8) {
                int i13 = aVar.f15397b;
                if (i13 == i10) {
                    i10 = aVar.f15399d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.f15399d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f15397b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.f15399d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.f15399d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f15404b.size() > 0;
    }

    public final a h(Object obj, int i10, int i11, int i12) {
        a aVar = (a) this.f15403a.a();
        if (aVar != null) {
            aVar.f15396a = i10;
            aVar.f15397b = i11;
            aVar.f15399d = i12;
            aVar.f15398c = obj;
            return aVar;
        }
        a aVar2 = new a();
        aVar2.f15396a = i10;
        aVar2.f15397b = i11;
        aVar2.f15399d = i12;
        aVar2.f15398c = obj;
        return aVar2;
    }

    public final void i(a aVar) {
        this.f15405c.add(aVar);
        int i10 = aVar.f15396a;
        f0 f0Var = this.f15406d;
        if (i10 == 1) {
            f0Var.d(aVar.f15397b, aVar.f15399d);
            return;
        }
        if (i10 == 2) {
            int i11 = aVar.f15397b;
            int i12 = aVar.f15399d;
            RecyclerView recyclerView = f0Var.f15468a;
            recyclerView.O(i11, i12, false);
            recyclerView.f1063r0 = true;
            return;
        }
        if (i10 == 4) {
            f0Var.c(aVar.f15397b, aVar.f15399d, aVar.f15398c);
        } else if (i10 == 8) {
            f0Var.e(aVar.f15397b, aVar.f15399d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:183:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.b.j():void");
    }

    public final void k(a aVar) {
        aVar.f15398c = null;
        this.f15403a.b(aVar);
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k((a) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int m(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f15405c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i14 = aVar.f15396a;
            if (i14 == 8) {
                int i15 = aVar.f15397b;
                int i16 = aVar.f15399d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            aVar.f15397b = i15 + 1;
                            aVar.f15399d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.f15397b = i15 - 1;
                            aVar.f15399d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        aVar.f15399d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f15399d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        aVar.f15397b = i15 + 1;
                    } else if (i11 == 2) {
                        aVar.f15397b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = aVar.f15397b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.f15399d;
                    } else if (i14 == 2) {
                        i10 += aVar.f15399d;
                    }
                } else if (i11 == 1) {
                    aVar.f15397b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f15397b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f15396a == 8) {
                int i18 = aVar2.f15399d;
                if (i18 == aVar2.f15397b || i18 < 0) {
                    arrayList.remove(size2);
                    k(aVar2);
                }
            } else if (aVar2.f15399d <= 0) {
                arrayList.remove(size2);
                k(aVar2);
            }
        }
        return i10;
    }
}
