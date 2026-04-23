package m1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f15468a;

    public /* synthetic */ f0(RecyclerView recyclerView) {
        this.f15468a = recyclerView;
    }

    public final void a(a aVar) {
        int i10 = aVar.f15396a;
        RecyclerView recyclerView = this.f15468a;
        if (i10 == 1) {
            recyclerView.f1074x.R(aVar.f15397b, aVar.f15399d);
            return;
        }
        if (i10 == 2) {
            recyclerView.f1074x.U(aVar.f15397b, aVar.f15399d);
        } else if (i10 == 4) {
            recyclerView.f1074x.V(aVar.f15397b, aVar.f15399d);
        } else {
            if (i10 != 8) {
                return;
            }
            recyclerView.f1074x.T(aVar.f15397b, aVar.f15399d);
        }
    }

    public final e1 b(int i10) {
        RecyclerView recyclerView = this.f15468a;
        int iH = recyclerView.f1051h.h();
        int i11 = 0;
        e1 e1Var = null;
        while (true) {
            if (i11 >= iH) {
                break;
            }
            e1 e1VarI = RecyclerView.I(recyclerView.f1051h.g(i11));
            if (e1VarI != null && !e1VarI.j() && e1VarI.f15447c == i10) {
                if (!recyclerView.f1051h.j(e1VarI.f15445a)) {
                    e1Var = e1VarI;
                    break;
                }
                e1Var = e1VarI;
            }
            i11++;
        }
        if (e1Var == null || recyclerView.f1051h.j(e1Var.f15445a)) {
            return null;
        }
        return e1Var;
    }

    public final void c(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = this.f15468a;
        int iH = recyclerView.f1051h.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < iH; i15++) {
            View viewG = recyclerView.f1051h.g(i15);
            e1 e1VarI = RecyclerView.I(viewG);
            if (e1VarI != null && !e1VarI.q() && (i13 = e1VarI.f15447c) >= i10 && i13 < i14) {
                e1VarI.b(2);
                e1VarI.a(obj);
                ((q0) viewG.getLayoutParams()).f15602c = true;
            }
        }
        w0 w0Var = recyclerView.f1042b;
        ArrayList arrayList = (ArrayList) w0Var.f15646e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e1 e1Var = (e1) arrayList.get(size);
            if (e1Var != null && (i12 = e1Var.f15447c) >= i10 && i12 < i14) {
                e1Var.b(2);
                w0Var.e(size);
            }
        }
        recyclerView.f1065s0 = true;
    }

    public final void d(int i10, int i11) {
        RecyclerView recyclerView = this.f15468a;
        int iH = recyclerView.f1051h.h();
        for (int i12 = 0; i12 < iH; i12++) {
            e1 e1VarI = RecyclerView.I(recyclerView.f1051h.g(i12));
            if (e1VarI != null && !e1VarI.q() && e1VarI.f15447c >= i10) {
                e1VarI.n(i11, false);
                recyclerView.f1059o0.f15415f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1042b.f15646e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            e1 e1Var = (e1) arrayList.get(i13);
            if (e1Var != null && e1Var.f15447c >= i10) {
                e1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1063r0 = true;
    }

    public final void e(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = this.f15468a;
        int iH = recyclerView.f1051h.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < iH; i20++) {
            e1 e1VarI = RecyclerView.I(recyclerView.f1051h.g(i20));
            if (e1VarI != null && (i18 = e1VarI.f15447c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    e1VarI.n(i11 - i10, false);
                } else {
                    e1VarI.n(i14, false);
                }
                recyclerView.f1059o0.f15415f = true;
            }
        }
        w0 w0Var = recyclerView.f1042b;
        w0Var.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        ArrayList arrayList = (ArrayList) w0Var.f15646e;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            e1 e1Var = (e1) arrayList.get(i21);
            if (e1Var != null && (i17 = e1Var.f15447c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    e1Var.n(i11 - i10, false);
                } else {
                    e1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1063r0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(m1.e1 r9, m1.k0 r10, m1.k0 r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.f15468a
            r0.getClass()
            r1 = 0
            r9.p(r1)
            m1.l0 r1 = r0.T
            r2 = r1
            m1.k r2 = (m1.k) r2
            if (r10 == 0) goto L2b
            r2.getClass()
            int r4 = r10.f15520a
            int r6 = r11.f15520a
            if (r4 != r6) goto L1f
            int r1 = r10.f15521b
            int r3 = r11.f15521b
            if (r1 == r3) goto L2b
        L1f:
            int r5 = r10.f15521b
            int r7 = r11.f15521b
            r3 = r9
            boolean r9 = r2.g(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3c
            goto L39
        L2b:
            r2.l(r9)
            android.view.View r10 = r9.f15445a
            r11 = 0
            r10.setAlpha(r11)
            java.util.ArrayList r10 = r2.f15510i
            r10.add(r9)
        L39:
            r0.S()
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.f0.f(m1.e1, m1.k0, m1.k0):void");
    }

    public final void g(e1 e1Var, k0 k0Var, k0 k0Var2) {
        RecyclerView recyclerView = this.f15468a;
        recyclerView.f1042b.j(e1Var);
        recyclerView.f(e1Var);
        e1Var.p(false);
        k kVar = (k) recyclerView.T;
        kVar.getClass();
        int i10 = k0Var.f15520a;
        int i11 = k0Var.f15521b;
        View view = e1Var.f15445a;
        int left = k0Var2 == null ? view.getLeft() : k0Var2.f15520a;
        int top = k0Var2 == null ? view.getTop() : k0Var2.f15521b;
        if (e1Var.j() || (i10 == left && i11 == top)) {
            kVar.l(e1Var);
            kVar.f15509h.add(e1Var);
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            if (!kVar.g(e1Var, i10, i11, left, top)) {
                return;
            }
        }
        recyclerView.S();
    }

    public final void h(int i10) {
        RecyclerView recyclerView = this.f15468a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            RecyclerView.I(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }
}
