package m1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.iq1;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f15585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f15586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.recyclerview.widget.d f15587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.d f15588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y f15589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15590f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15591g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15592h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15593i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f15594j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15595k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15596l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15597m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15598n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15599o;

    public p0() {
        n0 n0Var = new n0(0, this);
        n0 n0Var2 = new n0(1, this);
        this.f15587c = new androidx.recyclerview.widget.d(n0Var);
        this.f15588d = new androidx.recyclerview.widget.d(n0Var2);
        this.f15590f = false;
        this.f15591g = false;
        this.f15592h = true;
        this.f15593i = true;
    }

    public static int D(View view) {
        return ((q0) view.getLayoutParams()).f15600a.c();
    }

    public static o0 E(Context context, AttributeSet attributeSet, int i10, int i11) {
        o0 o0Var = new o0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l1.a.f15123a, i10, i11);
        o0Var.f15555a = typedArrayObtainStyledAttributes.getInt(0, 1);
        o0Var.f15556b = typedArrayObtainStyledAttributes.getInt(10, 1);
        o0Var.f15557c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        o0Var.f15558d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return o0Var;
    }

    public static boolean I(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (i12 > 0 && i10 != i12) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i10;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i10;
        }
        return true;
    }

    public static void J(View view, int i10, int i11, int i12, int i13) {
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect = q0Var.f15601b;
        view.layout(i10 + rect.left + ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, i11 + rect.top + ((ViewGroup.MarginLayoutParams) q0Var).topMargin, (i12 - rect.right) - ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, (i13 - rect.bottom) - ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public static int g(int i10, int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i11, i12) : size : Math.min(size, Math.max(i11, i12));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1e
            if (r8 < 0) goto L13
        L10:
            r6 = 1073741824(0x40000000, float:2.0)
            goto L32
        L13:
            if (r8 != r1) goto L1b
            if (r6 == r2) goto L23
            if (r6 == 0) goto L1b
            if (r6 == r3) goto L23
        L1b:
            r6 = 0
            r8 = 0
            goto L32
        L1e:
            if (r8 < 0) goto L21
            goto L10
        L21:
            if (r8 != r1) goto L25
        L23:
            r8 = r5
            goto L32
        L25:
            if (r8 != r0) goto L1b
            if (r6 == r2) goto L2f
            if (r6 != r3) goto L2c
            goto L2f
        L2c:
            r8 = r5
            r6 = 0
            goto L32
        L2f:
            r8 = r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
        L32:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.p0.w(boolean, int, int, int, int):int");
    }

    public static void y(View view, Rect rect) {
        int[] iArr = RecyclerView.E0;
        q0 q0Var = (q0) view.getLayoutParams();
        Rect rect2 = q0Var.f15601b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) q0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) q0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) q0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) q0Var).bottomMargin);
    }

    public final int A() {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int B() {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int F(w0 w0Var, b1 b1Var) {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView == null || recyclerView.f1072w == null || !e()) {
            return 1;
        }
        return this.f15586b.f1072w.a();
    }

    public final void G(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((q0) view.getLayoutParams()).f15601b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f15586b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f15586b.f1070v;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean H();

    public void K(int i10) {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView != null) {
            int iE = recyclerView.f1051h.e();
            for (int i11 = 0; i11 < iE; i11++) {
                recyclerView.f1051h.d(i11).offsetLeftAndRight(i10);
            }
        }
    }

    public void L(int i10) {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView != null) {
            int iE = recyclerView.f1051h.e();
            for (int i11 = 0; i11 < iE; i11++) {
                recyclerView.f1051h.d(i11).offsetTopAndBottom(i10);
            }
        }
    }

    public abstract void M(RecyclerView recyclerView);

    public abstract View N(View view, int i10, w0 w0Var, b1 b1Var);

    public void O(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f15586b;
        w0 w0Var = recyclerView.f1042b;
        b1 b1Var = recyclerView.f1059o0;
        if (recyclerView == null || accessibilityEvent == null) {
            return;
        }
        boolean z9 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f15586b.canScrollVertically(-1) && !this.f15586b.canScrollHorizontally(-1) && !this.f15586b.canScrollHorizontally(1)) {
            z9 = false;
        }
        accessibilityEvent.setScrollable(z9);
        g0 g0Var = this.f15586b.f1072w;
        if (g0Var != null) {
            accessibilityEvent.setItemCount(g0Var.a());
        }
    }

    public final void P(View view, p0.g gVar) {
        e1 e1VarI = RecyclerView.I(view);
        if (e1VarI == null || e1VarI.j() || this.f15585a.f15432c.contains(e1VarI.f15445a)) {
            return;
        }
        RecyclerView recyclerView = this.f15586b;
        Q(recyclerView.f1042b, recyclerView.f1059o0, view, gVar);
    }

    public void Q(w0 w0Var, b1 b1Var, View view, p0.g gVar) {
        gVar.h(androidx.fragment.app.k.f(e() ? D(view) : 0, 1, d() ? D(view) : 0, 1, false, false));
    }

    public void R(int i10, int i11) {
    }

    public void S() {
    }

    public void T(int i10, int i11) {
    }

    public void U(int i10, int i11) {
    }

    public void V(int i10, int i11) {
    }

    public abstract void W(w0 w0Var, b1 b1Var);

    public abstract void X(b1 b1Var);

    public abstract void Y(Parcelable parcelable);

    public abstract Parcelable Z();

    public void a0(int i10) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r7, android.view.View r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.p0.b(int, android.view.View, boolean):void");
    }

    public final void b0(w0 w0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.I(u(iV)).q()) {
                View viewU = u(iV);
                e0(iV);
                w0Var.f(viewU);
            }
        }
    }

    public abstract void c(String str);

    public final void c0(w0 w0Var) {
        Cloneable cloneable;
        int size = ((ArrayList) w0Var.f15644c).size();
        int i10 = size - 1;
        while (true) {
            cloneable = w0Var.f15644c;
            if (i10 < 0) {
                break;
            }
            View view = ((e1) ((ArrayList) cloneable).get(i10)).f15445a;
            e1 e1VarI = RecyclerView.I(view);
            if (!e1VarI.q()) {
                e1VarI.p(false);
                if (e1VarI.l()) {
                    this.f15586b.removeDetachedView(view, false);
                }
                l0 l0Var = this.f15586b.T;
                if (l0Var != null) {
                    l0Var.d(e1VarI);
                }
                e1VarI.p(true);
                e1 e1VarI2 = RecyclerView.I(view);
                e1VarI2.f15458n = null;
                e1VarI2.f15459o = false;
                e1VarI2.f15454j &= -33;
                w0Var.g(e1VarI2);
            }
            i10--;
        }
        ((ArrayList) cloneable).clear();
        ArrayList arrayList = (ArrayList) w0Var.f15645d;
        if (arrayList != null) {
            arrayList.clear();
        }
        if (size > 0) {
            this.f15586b.invalidate();
        }
    }

    public abstract boolean d();

    public final void d0(View view, w0 w0Var) {
        d dVar = this.f15585a;
        f0 f0Var = dVar.f15430a;
        int iIndexOfChild = f0Var.f15468a.indexOfChild(view);
        if (iIndexOfChild >= 0) {
            if (dVar.f15431b.f(iIndexOfChild)) {
                dVar.k(view);
            }
            f0Var.h(iIndexOfChild);
        }
        w0Var.f(view);
    }

    public abstract boolean e();

    public final void e0(int i10) {
        if (u(i10) != null) {
            d dVar = this.f15585a;
            int iF = dVar.f(i10);
            f0 f0Var = dVar.f15430a;
            View childAt = f0Var.f15468a.getChildAt(iF);
            if (childAt == null) {
                return;
            }
            if (dVar.f15431b.f(iF)) {
                dVar.k(childAt);
            }
            f0Var.h(iF);
        }
    }

    public boolean f(q0 q0Var) {
        return q0Var != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.A()
            int r1 = r8.C()
            int r2 = r8.f15598n
            int r3 = r8.B()
            int r2 = r2 - r3
            int r3 = r8.f15599o
            int r4 = r8.z()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.f15586b
            java.util.WeakHashMap r7 = o0.v0.f16075a
            int r3 = o0.e0.d(r3)
            r7 = 1
            if (r3 != r7) goto L60
            if (r2 == 0) goto L5b
            goto L68
        L5b:
            int r2 = java.lang.Math.max(r6, r10)
            goto L68
        L60:
            if (r6 == 0) goto L63
            goto L67
        L63:
            int r6 = java.lang.Math.min(r4, r2)
        L67:
            r2 = r6
        L68:
            if (r1 == 0) goto L6b
            goto L6f
        L6b:
            int r1 = java.lang.Math.min(r5, r11)
        L6f:
            if (r13 == 0) goto Laa
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L78
            goto Laf
        L78:
            int r11 = r8.A()
            int r13 = r8.C()
            int r3 = r8.f15598n
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r8.f15599o
            int r5 = r8.z()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f15586b
            android.graphics.Rect r5 = r5.f1066t
            y(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto Laf
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto Laf
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto Laf
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto Laa
            goto Laf
        Laa:
            if (r2 != 0) goto Lb0
            if (r1 == 0) goto Laf
            goto Lb0
        Laf:
            return r0
        Lb0:
            if (r12 == 0) goto Lb6
            r9.scrollBy(r2, r1)
            goto Lb9
        Lb6:
            r9.b0(r2, r1, r0)
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.p0.f0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void g0() {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract void h(int i10, int i11, b1 b1Var, iq1 iq1Var);

    public abstract int h0(int i10, w0 w0Var, b1 b1Var);

    public void i(int i10, iq1 iq1Var) {
    }

    public abstract void i0(int i10);

    public abstract int j(b1 b1Var);

    public abstract int j0(int i10, w0 w0Var, b1 b1Var);

    public abstract int k(b1 b1Var);

    public final void k0(RecyclerView recyclerView) {
        l0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public abstract int l(b1 b1Var);

    public final void l0(int i10, int i11) {
        this.f15598n = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        this.f15596l = mode;
        if (mode == 0 && !RecyclerView.F0) {
            this.f15598n = 0;
        }
        this.f15599o = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        this.f15597m = mode2;
        if (mode2 != 0 || RecyclerView.F0) {
            return;
        }
        this.f15599o = 0;
    }

    public abstract int m(b1 b1Var);

    public void m0(Rect rect, int i10, int i11) {
        int iB = B() + A() + rect.width();
        int iZ = z() + C() + rect.height();
        RecyclerView recyclerView = this.f15586b;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        this.f15586b.setMeasuredDimension(g(i10, iB, o0.d0.e(recyclerView)), g(i11, iZ, o0.d0.d(this.f15586b)));
    }

    public abstract int n(b1 b1Var);

    public final void n0(int i10, int i11) {
        int iV = v();
        if (iV == 0) {
            this.f15586b.n(i10, i11);
            return;
        }
        int i12 = Integer.MIN_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < iV; i16++) {
            View viewU = u(i16);
            Rect rect = this.f15586b.f1066t;
            y(viewU, rect);
            int i17 = rect.left;
            if (i17 < i14) {
                i14 = i17;
            }
            int i18 = rect.right;
            if (i18 > i12) {
                i12 = i18;
            }
            int i19 = rect.top;
            if (i19 < i15) {
                i15 = i19;
            }
            int i20 = rect.bottom;
            if (i20 > i13) {
                i13 = i20;
            }
        }
        this.f15586b.f1066t.set(i14, i15, i12, i13);
        m0(this.f15586b.f1066t, i10, i11);
    }

    public abstract int o(b1 b1Var);

    public final void o0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f15586b = null;
            this.f15585a = null;
            this.f15598n = 0;
            this.f15599o = 0;
        } else {
            this.f15586b = recyclerView;
            this.f15585a = recyclerView.f1051h;
            this.f15598n = recyclerView.getWidth();
            this.f15599o = recyclerView.getHeight();
        }
        this.f15596l = 1073741824;
        this.f15597m = 1073741824;
    }

    public final void p(w0 w0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            e1 e1VarI = RecyclerView.I(viewU);
            if (!e1VarI.q()) {
                if (!e1VarI.h() || e1VarI.j() || this.f15586b.f1072w.f15478b) {
                    u(iV);
                    this.f15585a.c(iV);
                    w0Var.h(viewU);
                    this.f15586b.f1061q.l(e1VarI);
                } else {
                    e0(iV);
                    w0Var.g(e1VarI);
                }
            }
        }
    }

    public final boolean p0(View view, int i10, int i11, q0 q0Var) {
        return (!view.isLayoutRequested() && this.f15592h && I(view.getWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && I(view.getHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) ? false : true;
    }

    public View q(int i10) {
        int iV = v();
        for (int i11 = 0; i11 < iV; i11++) {
            View viewU = u(i11);
            e1 e1VarI = RecyclerView.I(viewU);
            if (e1VarI != null && e1VarI.c() == i10 && !e1VarI.q() && (this.f15586b.f1059o0.f15416g || !e1VarI.j())) {
                return viewU;
            }
        }
        return null;
    }

    public boolean q0() {
        return false;
    }

    public abstract q0 r();

    public final boolean r0(View view, int i10, int i11, q0 q0Var) {
        return (this.f15592h && I(view.getMeasuredWidth(), i10, ((ViewGroup.MarginLayoutParams) q0Var).width) && I(view.getMeasuredHeight(), i11, ((ViewGroup.MarginLayoutParams) q0Var).height)) ? false : true;
    }

    public q0 s(Context context, AttributeSet attributeSet) {
        return new q0(context, attributeSet);
    }

    public abstract void s0(RecyclerView recyclerView, int i10);

    public q0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof q0 ? new q0((q0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new q0((ViewGroup.MarginLayoutParams) layoutParams) : new q0(layoutParams);
    }

    public final void t0(y yVar) {
        y yVar2 = this.f15589e;
        if (yVar2 != null && yVar != yVar2 && yVar2.f15667e) {
            yVar2.f();
        }
        this.f15589e = yVar;
        RecyclerView recyclerView = this.f15586b;
        d1 d1Var = recyclerView.f1056l0;
        d1Var.f15440s.removeCallbacks(d1Var);
        d1Var.f15436d.abortAnimation();
        yVar.f15664b = recyclerView;
        yVar.f15665c = this;
        int i10 = yVar.f15663a;
        if (i10 == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1059o0.f15410a = i10;
        yVar.f15667e = true;
        yVar.f15666d = true;
        yVar.f15668f = recyclerView.f1074x.q(i10);
        yVar.f15664b.f1056l0.a();
    }

    public final View u(int i10) {
        d dVar = this.f15585a;
        if (dVar != null) {
            return dVar.d(i10);
        }
        return null;
    }

    public abstract boolean u0();

    public final int v() {
        d dVar = this.f15585a;
        if (dVar != null) {
            return dVar.e();
        }
        return 0;
    }

    public int x(w0 w0Var, b1 b1Var) {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView == null || recyclerView.f1072w == null || !d()) {
            return 1;
        }
        return this.f15586b.f1072w.a();
    }

    public final int z() {
        RecyclerView recyclerView = this.f15586b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }
}
