package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.k;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.iq1;
import java.util.WeakHashMap;
import l.q3;
import m1.b1;
import m1.p0;
import m1.q0;
import m1.t;
import m1.v;
import m1.w0;
import m1.x;
import o0.d0;
import o0.v0;
import p0.g;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final q3 K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q3(1);
        this.L = new Rect();
        g1(p0.E(context, attributeSet, i10, i11).f15556b);
    }

    @Override // m1.p0
    public final int F(w0 w0Var, b1 b1Var) {
        if (this.f1026p == 0) {
            return this.F;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return c1(b1Var.b() - 1, w0Var, b1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View I0(w0 w0Var, b1 b1Var, int i10, int i11, int i12) {
        B0();
        int iF = this.f1028r.f();
        int iE = this.f1028r.e();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewU = u(i10);
            int iD = p0.D(viewU);
            if (iD >= 0 && iD < i12 && d1(iD, w0Var, b1Var) == 0) {
                if (((q0) viewU.getLayoutParams()).f15600a.j()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f1028r.d(viewU) < iE && this.f1028r.b(viewU) >= iF) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00df, code lost:
    
        if (r13 == (r2 > r15)) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0126  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View N(android.view.View r23, int r24, m1.w0 r25, m1.b1 r26) {
        /*
            Method dump skipped, instruction units count: 331
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N(android.view.View, int, m1.w0, m1.b1):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v38 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(m1.w0 r19, m1.b1 r20, m1.x r21, m1.w r22) {
        /*
            Method dump skipped, instruction units count: 656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.O0(m1.w0, m1.b1, m1.x, m1.w):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void P0(w0 w0Var, b1 b1Var, v vVar, int i10) {
        h1();
        if (b1Var.b() > 0 && !b1Var.f15416g) {
            boolean z9 = i10 == 1;
            int iD1 = d1(vVar.f15631b, w0Var, b1Var);
            if (z9) {
                while (iD1 > 0) {
                    int i11 = vVar.f15631b;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    vVar.f15631b = i12;
                    iD1 = d1(i12, w0Var, b1Var);
                }
            } else {
                int iB = b1Var.b() - 1;
                int i13 = vVar.f15631b;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iD12 = d1(i14, w0Var, b1Var);
                    if (iD12 <= iD1) {
                        break;
                    }
                    i13 = i14;
                    iD1 = iD12;
                }
                vVar.f15631b = i13;
            }
        }
        a1();
    }

    @Override // m1.p0
    public final void Q(w0 w0Var, b1 b1Var, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof t)) {
            P(view, gVar);
            return;
        }
        t tVar = (t) layoutParams;
        int iC1 = c1(tVar.f15600a.c(), w0Var, b1Var);
        if (this.f1026p == 0) {
            gVar.h(k.f(tVar.f15615e, tVar.f15616f, iC1, 1, false, false));
        } else {
            gVar.h(k.f(iC1, 1, tVar.f15615e, tVar.f15616f, false, false));
        }
    }

    @Override // m1.p0
    public final void R(int i10, int i11) {
        q3 q3Var = this.K;
        q3Var.f();
        ((SparseIntArray) q3Var.f14981d).clear();
    }

    @Override // m1.p0
    public final void S() {
        q3 q3Var = this.K;
        q3Var.f();
        ((SparseIntArray) q3Var.f14981d).clear();
    }

    @Override // m1.p0
    public final void T(int i10, int i11) {
        q3 q3Var = this.K;
        q3Var.f();
        ((SparseIntArray) q3Var.f14981d).clear();
    }

    @Override // m1.p0
    public final void U(int i10, int i11) {
        q3 q3Var = this.K;
        q3Var.f();
        ((SparseIntArray) q3Var.f14981d).clear();
    }

    @Override // m1.p0
    public final void V(int i10, int i11) {
        q3 q3Var = this.K;
        q3Var.f();
        ((SparseIntArray) q3Var.f14981d).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void V0(boolean z9) {
        if (z9) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.V0(false);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final void W(w0 w0Var, b1 b1Var) {
        boolean z9 = b1Var.f15416g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z9) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                t tVar = (t) u(i10).getLayoutParams();
                int iC = tVar.f15600a.c();
                sparseIntArray2.put(iC, tVar.f15616f);
                sparseIntArray.put(iC, tVar.f15615e);
            }
        }
        super.W(w0Var, b1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final void X(b1 b1Var) {
        super.X(b1Var);
        this.E = false;
    }

    public final void Z0(int i10) {
        int i11;
        int[] iArr = this.G;
        int i12 = this.F;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.G = iArr;
    }

    public final void a1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int b1(int i10, int i11) {
        if (this.f1026p != 1 || !N0()) {
            int[] iArr = this.G;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.G;
        int i12 = this.F;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int c1(int i10, w0 w0Var, b1 b1Var) {
        boolean z9 = b1Var.f15416g;
        q3 q3Var = this.K;
        if (!z9) {
            return q3Var.c(i10, this.F);
        }
        int iB = w0Var.b(i10);
        if (iB == -1) {
            return 0;
        }
        return q3Var.c(iB, this.F);
    }

    public final int d1(int i10, w0 w0Var, b1 b1Var) {
        boolean z9 = b1Var.f15416g;
        q3 q3Var = this.K;
        if (!z9) {
            return q3Var.d(i10, this.F);
        }
        int i11 = this.J.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = w0Var.b(i10);
        if (iB == -1) {
            return 0;
        }
        return q3Var.d(iB, this.F);
    }

    public final int e1(int i10, w0 w0Var, b1 b1Var) {
        boolean z9 = b1Var.f15416g;
        q3 q3Var = this.K;
        if (!z9) {
            q3Var.getClass();
            return 1;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (w0Var.b(i10) == -1) {
            return 1;
        }
        q3Var.getClass();
        return 1;
    }

    @Override // m1.p0
    public final boolean f(q0 q0Var) {
        return q0Var instanceof t;
    }

    public final void f1(int i10, View view, boolean z9) {
        int iW;
        int iW2;
        t tVar = (t) view.getLayoutParams();
        Rect rect = tVar.f15601b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) tVar).topMargin + ((ViewGroup.MarginLayoutParams) tVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) tVar).leftMargin + ((ViewGroup.MarginLayoutParams) tVar).rightMargin;
        int iB1 = b1(tVar.f15615e, tVar.f15616f);
        if (this.f1026p == 1) {
            iW2 = p0.w(false, iB1, i10, i12, ((ViewGroup.MarginLayoutParams) tVar).width);
            iW = p0.w(true, this.f1028r.g(), this.f15597m, i11, ((ViewGroup.MarginLayoutParams) tVar).height);
        } else {
            int iW3 = p0.w(false, iB1, i10, i11, ((ViewGroup.MarginLayoutParams) tVar).height);
            int iW4 = p0.w(true, this.f1028r.g(), this.f15596l, i12, ((ViewGroup.MarginLayoutParams) tVar).width);
            iW = iW3;
            iW2 = iW4;
        }
        q0 q0Var = (q0) view.getLayoutParams();
        if (z9 ? r0(view, iW2, iW, q0Var) : p0(view, iW2, iW, q0Var)) {
            view.measure(iW2, iW);
        }
    }

    public final void g1(int i10) {
        if (i10 == this.F) {
            return;
        }
        this.E = true;
        if (i10 < 1) {
            throw new IllegalArgumentException(fb1.g("Span count should be at least 1. Provided ", i10));
        }
        this.F = i10;
        this.K.f();
        g0();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final int h0(int i10, w0 w0Var, b1 b1Var) {
        h1();
        a1();
        return super.h0(i10, w0Var, b1Var);
    }

    public final void h1() {
        int iZ;
        int iC;
        if (this.f1026p == 1) {
            iZ = this.f15598n - B();
            iC = A();
        } else {
            iZ = this.f15599o - z();
            iC = C();
        }
        Z0(iZ - iC);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final int j0(int i10, w0 w0Var, b1 b1Var) {
        h1();
        a1();
        return super.j0(i10, w0Var, b1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final int k(b1 b1Var) {
        return y0(b1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final int l(b1 b1Var) {
        return z0(b1Var);
    }

    @Override // m1.p0
    public final void m0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.m0(rect, i10, i11);
        }
        int iB = B() + A();
        int iZ = z() + C();
        if (this.f1026p == 1) {
            int iHeight = rect.height() + iZ;
            RecyclerView recyclerView = this.f15586b;
            WeakHashMap weakHashMap = v0.f16075a;
            iG2 = p0.g(i11, iHeight, d0.d(recyclerView));
            int[] iArr = this.G;
            iG = p0.g(i10, iArr[iArr.length - 1] + iB, d0.e(this.f15586b));
        } else {
            int iWidth = rect.width() + iB;
            RecyclerView recyclerView2 = this.f15586b;
            WeakHashMap weakHashMap2 = v0.f16075a;
            iG = p0.g(i10, iWidth, d0.e(recyclerView2));
            int[] iArr2 = this.G;
            iG2 = p0.g(i11, iArr2[iArr2.length - 1] + iZ, d0.d(this.f15586b));
        }
        this.f15586b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final int n(b1 b1Var) {
        return y0(b1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final int o(b1 b1Var) {
        return z0(b1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final q0 r() {
        return this.f1026p == 0 ? new t(-2, -1) : new t(-1, -2);
    }

    @Override // m1.p0
    public final q0 s(Context context, AttributeSet attributeSet) {
        t tVar = new t(context, attributeSet);
        tVar.f15615e = -1;
        tVar.f15616f = 0;
        return tVar;
    }

    @Override // m1.p0
    public final q0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            t tVar = new t((ViewGroup.MarginLayoutParams) layoutParams);
            tVar.f15615e = -1;
            tVar.f15616f = 0;
            return tVar;
        }
        t tVar2 = new t(layoutParams);
        tVar2.f15615e = -1;
        tVar2.f15616f = 0;
        return tVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, m1.p0
    public final boolean u0() {
        return this.f1036z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w0(b1 b1Var, x xVar, iq1 iq1Var) {
        int i10;
        int i11 = this.F;
        for (int i12 = 0; i12 < this.F && (i10 = xVar.f15654d) >= 0 && i10 < b1Var.b() && i11 > 0; i12++) {
            iq1Var.b(xVar.f15654d, Math.max(0, xVar.f15657g));
            this.K.getClass();
            i11--;
            xVar.f15654d += xVar.f15655e;
        }
    }

    @Override // m1.p0
    public final int x(w0 w0Var, b1 b1Var) {
        if (this.f1026p == 1) {
            return this.F;
        }
        if (b1Var.b() < 1) {
            return 0;
        }
        return c1(b1Var.b() - 1, w0Var, b1Var) + 1;
    }

    public GridLayoutManager(int i10) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q3(1);
        this.L = new Rect();
        g1(i10);
    }

    public GridLayoutManager() {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new q3(1);
        this.L = new Rect();
        g1(2);
    }
}
