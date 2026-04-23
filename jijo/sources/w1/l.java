package w1;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.x0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l extends x0 {
    @Override // androidx.fragment.app.x0
    public final void a(View view, Object obj) {
        if (obj != null) {
            ((q) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.x0
    public final void b(Object obj, ArrayList arrayList) {
        q qVar = (q) obj;
        if (qVar == null) {
            return;
        }
        int i10 = 0;
        if (qVar instanceof v) {
            v vVar = (v) qVar;
            int size = vVar.J.size();
            while (i10 < size) {
                b((i10 < 0 || i10 >= vVar.J.size()) ? null : (q) vVar.J.get(i10), arrayList);
                i10++;
            }
            return;
        }
        if (x0.h(qVar.f18128h) && x0.h(null) && x0.h(null) && x0.h(qVar.f18129q)) {
            int size2 = arrayList.size();
            while (i10 < size2) {
                qVar.b((View) arrayList.get(i10));
                i10++;
            }
        }
    }

    @Override // androidx.fragment.app.x0
    public final void c(ViewGroup viewGroup, Object obj) {
        t.a(viewGroup, (q) obj);
    }

    @Override // androidx.fragment.app.x0
    public final boolean e(Object obj) {
        return obj instanceof q;
    }

    @Override // androidx.fragment.app.x0
    public final Object f(Object obj) {
        if (obj != null) {
            return ((q) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.x0
    public final Object i(Object obj, Object obj2, Object obj3) {
        q qVar = (q) obj;
        q qVar2 = (q) obj2;
        q qVar3 = (q) obj3;
        if (qVar != null && qVar2 != null) {
            v vVar = new v();
            vVar.H(qVar);
            vVar.H(qVar2);
            vVar.K = false;
            qVar = vVar;
        } else if (qVar == null) {
            qVar = qVar2 != null ? qVar2 : null;
        }
        if (qVar3 == null) {
            return qVar;
        }
        v vVar2 = new v();
        if (qVar != null) {
            vVar2.H(qVar);
        }
        vVar2.H(qVar3);
        return vVar2;
    }

    @Override // androidx.fragment.app.x0
    public final Object j(Object obj, Object obj2, Object obj3) {
        v vVar = new v();
        if (obj != null) {
            vVar.H((q) obj);
        }
        if (obj2 != null) {
            vVar.H((q) obj2);
        }
        if (obj3 != null) {
            vVar.H((q) obj3);
        }
        return vVar;
    }

    @Override // androidx.fragment.app.x0
    public final void l(Object obj, View view, ArrayList arrayList) {
        ((q) obj).a(new j(view, arrayList));
    }

    @Override // androidx.fragment.app.x0
    public final void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((q) obj).a(new k(this, obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.x0
    public final void n(View view, Object obj) {
        if (view != null) {
            x0.g(view, new Rect());
            ((q) obj).A(new i());
        }
    }

    @Override // androidx.fragment.app.x0
    public final void o(Object obj, Rect rect) {
        if (obj != null) {
            ((q) obj).A(new i());
        }
    }

    @Override // androidx.fragment.app.x0
    public final void r(Object obj, View view, ArrayList arrayList) {
        v vVar = (v) obj;
        ArrayList arrayList2 = vVar.f18129q;
        arrayList2.clear();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            x0.d((View) arrayList.get(i10), arrayList2);
        }
        arrayList2.add(view);
        arrayList.add(view);
        b(vVar, arrayList);
    }

    @Override // androidx.fragment.app.x0
    public final void s(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        v vVar = (v) obj;
        if (vVar != null) {
            ArrayList arrayList3 = vVar.f18129q;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            u(vVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.x0
    public final Object t(Object obj) {
        if (obj == null) {
            return null;
        }
        v vVar = new v();
        vVar.H((q) obj);
        return vVar;
    }

    public final void u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        q qVar = (q) obj;
        int i10 = 0;
        if (qVar instanceof v) {
            v vVar = (v) qVar;
            int size = vVar.J.size();
            while (i10 < size) {
                u((i10 < 0 || i10 >= vVar.J.size()) ? null : (q) vVar.J.get(i10), arrayList, arrayList2);
                i10++;
            }
            return;
        }
        if (x0.h(qVar.f18128h) && x0.h(null) && x0.h(null)) {
            ArrayList arrayList3 = qVar.f18129q;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i10 < size2) {
                    qVar.b((View) arrayList2.get(i10));
                    i10++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    qVar.w((View) arrayList.get(size3));
                }
            }
        }
    }
}
