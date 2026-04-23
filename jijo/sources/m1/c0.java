package m1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f15426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h1 f15427b = new h1(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f15428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z f15429d;

    public static int b(View view, a0 a0Var) {
        return ((a0Var.c(view) / 2) + a0Var.d(view)) - ((a0Var.g() / 2) + a0Var.f());
    }

    public static View c(p0 p0Var, a0 a0Var) {
        int iV = p0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iG = (a0Var.g() / 2) + a0Var.f();
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = p0Var.u(i11);
            int iAbs = Math.abs(((a0Var.c(viewU) / 2) + a0Var.d(viewU)) - iG);
            if (iAbs < i10) {
                view = viewU;
                i10 = iAbs;
            }
        }
        return view;
    }

    public final int[] a(p0 p0Var, View view) {
        int[] iArr = new int[2];
        if (p0Var.d()) {
            iArr[0] = b(view, d(p0Var));
        } else {
            iArr[0] = 0;
        }
        if (p0Var.e()) {
            iArr[1] = b(view, e(p0Var));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final a0 d(p0 p0Var) {
        z zVar = this.f15429d;
        if (zVar == null || zVar.f15400a != p0Var) {
            this.f15429d = new z(p0Var, 0);
        }
        return this.f15429d;
    }

    public final a0 e(p0 p0Var) {
        z zVar = this.f15428c;
        if (zVar == null || zVar.f15400a != p0Var) {
            this.f15428c = new z(p0Var, 1);
        }
        return this.f15428c;
    }

    public final void f() {
        p0 layoutManager;
        RecyclerView recyclerView = this.f15426a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        View viewC = layoutManager.e() ? c(layoutManager, e(layoutManager)) : layoutManager.d() ? c(layoutManager, d(layoutManager)) : null;
        if (viewC == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewC);
        int i10 = iArrA[0];
        if (i10 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f15426a.b0(i10, iArrA[1], false);
    }
}
