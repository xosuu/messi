package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import b7.u;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.iq1;
import java.util.WeakHashMap;
import m1.a0;
import m1.a1;
import m1.b1;
import m1.o0;
import m1.p0;
import m1.q0;
import m1.v;
import m1.w;
import m1.w0;
import m1.x;
import m1.y;
import m1.z;
import o0.e0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends p0 implements a1 {
    public final v A;
    public final w B;
    public final int C;
    public final int[] D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1026p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x f1027q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z f1028r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1029s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f1030t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1031u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1032v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1033w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1034x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1035y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public SavedState f1036z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1038b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1039d;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1037a);
            parcel.writeInt(this.f1038b);
            parcel.writeInt(this.f1039d ? 1 : 0);
        }
    }

    public LinearLayoutManager(int i10) {
        this.f1026p = 1;
        this.f1030t = false;
        this.f1031u = false;
        this.f1032v = false;
        this.f1033w = true;
        this.f1034x = -1;
        this.f1035y = Integer.MIN_VALUE;
        this.f1036z = null;
        this.A = new v();
        this.B = new w();
        this.C = 2;
        this.D = new int[2];
        U0(i10);
        c(null);
        if (this.f1030t) {
            this.f1030t = false;
            g0();
        }
    }

    public final int A0(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f1026p == 1) ? 1 : Integer.MIN_VALUE : this.f1026p == 0 ? 1 : Integer.MIN_VALUE : this.f1026p == 1 ? -1 : Integer.MIN_VALUE : this.f1026p == 0 ? -1 : Integer.MIN_VALUE : (this.f1026p != 1 && N0()) ? -1 : 1 : (this.f1026p != 1 && N0()) ? 1 : -1;
    }

    public final void B0() {
        if (this.f1027q == null) {
            x xVar = new x();
            xVar.f15651a = true;
            xVar.f15658h = 0;
            xVar.f15659i = 0;
            xVar.f15661k = null;
            this.f1027q = xVar;
        }
    }

    public final int C0(w0 w0Var, x xVar, b1 b1Var, boolean z9) {
        int i10;
        int i11 = xVar.f15653c;
        int i12 = xVar.f15657g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                xVar.f15657g = i12 + i11;
            }
            Q0(w0Var, xVar);
        }
        int i13 = xVar.f15653c + xVar.f15658h;
        while (true) {
            if ((!xVar.f15662l && i13 <= 0) || (i10 = xVar.f15654d) < 0 || i10 >= b1Var.b()) {
                break;
            }
            w wVar = this.B;
            wVar.f15638a = 0;
            wVar.f15639b = false;
            wVar.f15640c = false;
            wVar.f15641d = false;
            O0(w0Var, b1Var, xVar, wVar);
            if (!wVar.f15639b) {
                int i14 = xVar.f15652b;
                int i15 = wVar.f15638a;
                xVar.f15652b = (xVar.f15656f * i15) + i14;
                if (!wVar.f15640c || xVar.f15661k != null || !b1Var.f15416g) {
                    xVar.f15653c -= i15;
                    i13 -= i15;
                }
                int i16 = xVar.f15657g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    xVar.f15657g = i17;
                    int i18 = xVar.f15653c;
                    if (i18 < 0) {
                        xVar.f15657g = i17 + i18;
                    }
                    Q0(w0Var, xVar);
                }
                if (z9 && wVar.f15641d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - xVar.f15653c;
    }

    public final View D0(boolean z9) {
        return this.f1031u ? H0(0, v(), z9) : H0(v() - 1, -1, z9);
    }

    public final View E0(boolean z9) {
        return this.f1031u ? H0(v() - 1, -1, z9) : H0(0, v(), z9);
    }

    public final int F0() {
        View viewH0 = H0(v() - 1, -1, false);
        if (viewH0 == null) {
            return -1;
        }
        return p0.D(viewH0);
    }

    public final View G0(int i10, int i11) {
        int i12;
        int i13;
        B0();
        if (i11 <= i10 && i11 >= i10) {
            return u(i10);
        }
        if (this.f1028r.d(u(i10)) < this.f1028r.f()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f1026p == 0 ? this.f15587c.f(i10, i11, i12, i13) : this.f15588d.f(i10, i11, i12, i13);
    }

    @Override // m1.p0
    public final boolean H() {
        return true;
    }

    public final View H0(int i10, int i11, boolean z9) {
        B0();
        int i12 = z9 ? 24579 : 320;
        return this.f1026p == 0 ? this.f15587c.f(i10, i11, i12, 320) : this.f15588d.f(i10, i11, i12, 320);
    }

    public View I0(w0 w0Var, b1 b1Var, int i10, int i11, int i12) {
        B0();
        int iF = this.f1028r.f();
        int iE = this.f1028r.e();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewU = u(i10);
            int iD = p0.D(viewU);
            if (iD >= 0 && iD < i12) {
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

    public final int J0(int i10, w0 w0Var, b1 b1Var, boolean z9) {
        int iE;
        int iE2 = this.f1028r.e() - i10;
        if (iE2 <= 0) {
            return 0;
        }
        int i11 = -T0(-iE2, w0Var, b1Var);
        int i12 = i10 + i11;
        if (!z9 || (iE = this.f1028r.e() - i12) <= 0) {
            return i11;
        }
        this.f1028r.k(iE);
        return iE + i11;
    }

    public final int K0(int i10, w0 w0Var, b1 b1Var, boolean z9) {
        int iF;
        int iF2 = i10 - this.f1028r.f();
        if (iF2 <= 0) {
            return 0;
        }
        int i11 = -T0(iF2, w0Var, b1Var);
        int i12 = i10 + i11;
        if (!z9 || (iF = i12 - this.f1028r.f()) <= 0) {
            return i11;
        }
        this.f1028r.k(-iF);
        return i11 - iF;
    }

    public final View L0() {
        return u(this.f1031u ? 0 : v() - 1);
    }

    @Override // m1.p0
    public final void M(RecyclerView recyclerView) {
    }

    public final View M0() {
        return u(this.f1031u ? v() - 1 : 0);
    }

    @Override // m1.p0
    public View N(View view, int i10, w0 w0Var, b1 b1Var) {
        int iA0;
        S0();
        if (v() == 0 || (iA0 = A0(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        B0();
        W0(iA0, (int) (this.f1028r.g() * 0.33333334f), false, b1Var);
        x xVar = this.f1027q;
        xVar.f15657g = Integer.MIN_VALUE;
        xVar.f15651a = false;
        C0(w0Var, xVar, b1Var, true);
        View viewG0 = iA0 == -1 ? this.f1031u ? G0(v() - 1, -1) : G0(0, v()) : this.f1031u ? G0(0, v()) : G0(v() - 1, -1);
        View viewM0 = iA0 == -1 ? M0() : L0();
        if (!viewM0.hasFocusable()) {
            return viewG0;
        }
        if (viewG0 == null) {
            return null;
        }
        return viewM0;
    }

    public final boolean N0() {
        RecyclerView recyclerView = this.f15586b;
        WeakHashMap weakHashMap = v0.f16075a;
        return e0.d(recyclerView) == 1;
    }

    @Override // m1.p0
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (v() > 0) {
            View viewH0 = H0(0, v(), false);
            accessibilityEvent.setFromIndex(viewH0 == null ? -1 : p0.D(viewH0));
            accessibilityEvent.setToIndex(F0());
        }
    }

    public void O0(w0 w0Var, b1 b1Var, x xVar, w wVar) {
        int iA;
        int i10;
        int i11;
        int iL;
        View viewB = xVar.b(w0Var);
        if (viewB == null) {
            wVar.f15639b = true;
            return;
        }
        q0 q0Var = (q0) viewB.getLayoutParams();
        if (xVar.f15661k == null) {
            if (this.f1031u == (xVar.f15656f == -1)) {
                b(-1, viewB, false);
            } else {
                b(0, viewB, false);
            }
        } else {
            if (this.f1031u == (xVar.f15656f == -1)) {
                b(-1, viewB, true);
            } else {
                b(0, viewB, true);
            }
        }
        q0 q0Var2 = (q0) viewB.getLayoutParams();
        Rect rectJ = this.f15586b.J(viewB);
        int i12 = rectJ.left + rectJ.right;
        int i13 = rectJ.top + rectJ.bottom;
        int iW = p0.w(d(), this.f15598n, this.f15596l, B() + A() + ((ViewGroup.MarginLayoutParams) q0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) q0Var2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) q0Var2).width);
        int iW2 = p0.w(e(), this.f15599o, this.f15597m, z() + C() + ((ViewGroup.MarginLayoutParams) q0Var2).topMargin + ((ViewGroup.MarginLayoutParams) q0Var2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) q0Var2).height);
        if (p0(viewB, iW, iW2, q0Var2)) {
            viewB.measure(iW, iW2);
        }
        wVar.f15638a = this.f1028r.c(viewB);
        if (this.f1026p == 1) {
            if (N0()) {
                iL = this.f15598n - B();
                iA = iL - this.f1028r.l(viewB);
            } else {
                iA = A();
                iL = this.f1028r.l(viewB) + iA;
            }
            if (xVar.f15656f == -1) {
                i10 = xVar.f15652b;
                i11 = i10 - wVar.f15638a;
            } else {
                i11 = xVar.f15652b;
                i10 = wVar.f15638a + i11;
            }
        } else {
            int iC = C();
            int iL2 = this.f1028r.l(viewB) + iC;
            if (xVar.f15656f == -1) {
                int i14 = xVar.f15652b;
                int i15 = i14 - wVar.f15638a;
                iL = i14;
                i10 = iL2;
                iA = i15;
                i11 = iC;
            } else {
                int i16 = xVar.f15652b;
                int i17 = wVar.f15638a + i16;
                iA = i16;
                i10 = iL2;
                i11 = iC;
                iL = i17;
            }
        }
        p0.J(viewB, iA, i11, iL, i10);
        if (q0Var.f15600a.j() || q0Var.f15600a.m()) {
            wVar.f15640c = true;
        }
        wVar.f15641d = viewB.hasFocusable();
    }

    public void P0(w0 w0Var, b1 b1Var, v vVar, int i10) {
    }

    public final void Q0(w0 w0Var, x xVar) {
        int i10;
        if (!xVar.f15651a || xVar.f15662l) {
            return;
        }
        int i11 = xVar.f15657g;
        int i12 = xVar.f15659i;
        if (xVar.f15656f != -1) {
            if (i11 < 0) {
                return;
            }
            int i13 = i11 - i12;
            int iV = v();
            if (!this.f1031u) {
                for (int i14 = 0; i14 < iV; i14++) {
                    View viewU = u(i14);
                    if (this.f1028r.b(viewU) > i13 || this.f1028r.i(viewU) > i13) {
                        R0(w0Var, 0, i14);
                        return;
                    }
                }
                return;
            }
            int i15 = iV - 1;
            for (int i16 = i15; i16 >= 0; i16--) {
                View viewU2 = u(i16);
                if (this.f1028r.b(viewU2) > i13 || this.f1028r.i(viewU2) > i13) {
                    R0(w0Var, i15, i16);
                    return;
                }
            }
            return;
        }
        int iV2 = v();
        if (i11 < 0) {
            return;
        }
        z zVar = this.f1028r;
        int i17 = zVar.f15679d;
        p0 p0Var = zVar.f15400a;
        switch (i17) {
            case 0:
                i10 = p0Var.f15598n;
                break;
            default:
                i10 = p0Var.f15599o;
                break;
        }
        int i18 = (i10 - i11) + i12;
        if (this.f1031u) {
            for (int i19 = 0; i19 < iV2; i19++) {
                View viewU3 = u(i19);
                if (this.f1028r.d(viewU3) < i18 || this.f1028r.j(viewU3) < i18) {
                    R0(w0Var, 0, i19);
                    return;
                }
            }
            return;
        }
        int i20 = iV2 - 1;
        for (int i21 = i20; i21 >= 0; i21--) {
            View viewU4 = u(i21);
            if (this.f1028r.d(viewU4) < i18 || this.f1028r.j(viewU4) < i18) {
                R0(w0Var, i20, i21);
                return;
            }
        }
    }

    public final void R0(w0 w0Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewU = u(i10);
                e0(i10);
                w0Var.f(viewU);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewU2 = u(i12);
            e0(i12);
            w0Var.f(viewU2);
        }
    }

    public final void S0() {
        if (this.f1026p == 1 || !N0()) {
            this.f1031u = this.f1030t;
        } else {
            this.f1031u = !this.f1030t;
        }
    }

    public final int T0(int i10, w0 w0Var, b1 b1Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        B0();
        this.f1027q.f15651a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int iAbs = Math.abs(i10);
        W0(i11, iAbs, true, b1Var);
        x xVar = this.f1027q;
        int iC0 = C0(w0Var, xVar, b1Var, false) + xVar.f15657g;
        if (iC0 < 0) {
            return 0;
        }
        if (iAbs > iC0) {
            i10 = i11 * iC0;
        }
        this.f1028r.k(-i10);
        this.f1027q.f15660j = i10;
        return i10;
    }

    public final void U0(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException(fb1.g("invalid orientation:", i10));
        }
        c(null);
        if (i10 != this.f1026p || this.f1028r == null) {
            z zVarA = a0.a(this, i10);
            this.f1028r = zVarA;
            this.A.f15635f = zVarA;
            this.f1026p = i10;
            g0();
        }
    }

    public void V0(boolean z9) {
        c(null);
        if (this.f1032v == z9) {
            return;
        }
        this.f1032v = z9;
        g0();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    @Override // m1.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void W(m1.w0 r18, m1.b1 r19) {
        /*
            Method dump skipped, instruction units count: 1198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.W(m1.w0, m1.b1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(int r7, int r8, boolean r9, m1.b1 r10) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.W0(int, int, boolean, m1.b1):void");
    }

    @Override // m1.p0
    public void X(b1 b1Var) {
        this.f1036z = null;
        this.f1034x = -1;
        this.f1035y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void X0(int i10, int i11) {
        this.f1027q.f15653c = this.f1028r.e() - i11;
        x xVar = this.f1027q;
        xVar.f15655e = this.f1031u ? -1 : 1;
        xVar.f15654d = i10;
        xVar.f15656f = 1;
        xVar.f15652b = i11;
        xVar.f15657g = Integer.MIN_VALUE;
    }

    @Override // m1.p0
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f1036z = (SavedState) parcelable;
            g0();
        }
    }

    public final void Y0(int i10, int i11) {
        this.f1027q.f15653c = i11 - this.f1028r.f();
        x xVar = this.f1027q;
        xVar.f15654d = i10;
        xVar.f15655e = this.f1031u ? 1 : -1;
        xVar.f15656f = -1;
        xVar.f15652b = i11;
        xVar.f15657g = Integer.MIN_VALUE;
    }

    @Override // m1.p0
    public final Parcelable Z() {
        SavedState savedState = this.f1036z;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f1037a = savedState.f1037a;
            savedState2.f1038b = savedState.f1038b;
            savedState2.f1039d = savedState.f1039d;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        if (v() > 0) {
            B0();
            boolean z9 = this.f1029s ^ this.f1031u;
            savedState3.f1039d = z9;
            if (z9) {
                View viewL0 = L0();
                savedState3.f1038b = this.f1028r.e() - this.f1028r.b(viewL0);
                savedState3.f1037a = p0.D(viewL0);
            } else {
                View viewM0 = M0();
                savedState3.f1037a = p0.D(viewM0);
                savedState3.f1038b = this.f1028r.d(viewM0) - this.f1028r.f();
            }
        } else {
            savedState3.f1037a = -1;
        }
        return savedState3;
    }

    @Override // m1.a1
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        int i11 = (i10 < p0.D(u(0))) != this.f1031u ? -1 : 1;
        return this.f1026p == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // m1.p0
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f1036z != null || (recyclerView = this.f15586b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    @Override // m1.p0
    public final boolean d() {
        return this.f1026p == 0;
    }

    @Override // m1.p0
    public final boolean e() {
        return this.f1026p == 1;
    }

    @Override // m1.p0
    public final void h(int i10, int i11, b1 b1Var, iq1 iq1Var) {
        if (this.f1026p != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        B0();
        W0(i10 > 0 ? 1 : -1, Math.abs(i10), true, b1Var);
        w0(b1Var, this.f1027q, iq1Var);
    }

    @Override // m1.p0
    public int h0(int i10, w0 w0Var, b1 b1Var) {
        if (this.f1026p == 1) {
            return 0;
        }
        return T0(i10, w0Var, b1Var);
    }

    @Override // m1.p0
    public final void i(int i10, iq1 iq1Var) {
        boolean z9;
        int i11;
        SavedState savedState = this.f1036z;
        if (savedState == null || (i11 = savedState.f1037a) < 0) {
            S0();
            z9 = this.f1031u;
            i11 = this.f1034x;
            if (i11 == -1) {
                i11 = z9 ? i10 - 1 : 0;
            }
        } else {
            z9 = savedState.f1039d;
        }
        int i12 = z9 ? -1 : 1;
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            iq1Var.b(i11, 0);
            i11 += i12;
        }
    }

    @Override // m1.p0
    public final void i0(int i10) {
        this.f1034x = i10;
        this.f1035y = Integer.MIN_VALUE;
        SavedState savedState = this.f1036z;
        if (savedState != null) {
            savedState.f1037a = -1;
        }
        g0();
    }

    @Override // m1.p0
    public final int j(b1 b1Var) {
        return x0(b1Var);
    }

    @Override // m1.p0
    public int j0(int i10, w0 w0Var, b1 b1Var) {
        if (this.f1026p == 0) {
            return 0;
        }
        return T0(i10, w0Var, b1Var);
    }

    @Override // m1.p0
    public int k(b1 b1Var) {
        return y0(b1Var);
    }

    @Override // m1.p0
    public int l(b1 b1Var) {
        return z0(b1Var);
    }

    @Override // m1.p0
    public final int m(b1 b1Var) {
        return x0(b1Var);
    }

    @Override // m1.p0
    public int n(b1 b1Var) {
        return y0(b1Var);
    }

    @Override // m1.p0
    public int o(b1 b1Var) {
        return z0(b1Var);
    }

    @Override // m1.p0
    public final View q(int i10) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iD = i10 - p0.D(u(0));
        if (iD >= 0 && iD < iV) {
            View viewU = u(iD);
            if (p0.D(viewU) == i10) {
                return viewU;
            }
        }
        return super.q(i10);
    }

    @Override // m1.p0
    public final boolean q0() {
        if (this.f15597m == 1073741824 || this.f15596l == 1073741824) {
            return false;
        }
        int iV = v();
        for (int i10 = 0; i10 < iV; i10++) {
            ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
            if (layoutParams.width < 0 && layoutParams.height < 0) {
                return true;
            }
        }
        return false;
    }

    @Override // m1.p0
    public q0 r() {
        return new q0(-2, -2);
    }

    @Override // m1.p0
    public void s0(RecyclerView recyclerView, int i10) {
        y yVar = new y(recyclerView.getContext());
        yVar.f15663a = i10;
        t0(yVar);
    }

    @Override // m1.p0
    public boolean u0() {
        return this.f1036z == null && this.f1029s == this.f1032v;
    }

    public void v0(b1 b1Var, int[] iArr) {
        int i10;
        int iG = b1Var.f15410a != -1 ? this.f1028r.g() : 0;
        if (this.f1027q.f15656f == -1) {
            i10 = 0;
        } else {
            i10 = iG;
            iG = 0;
        }
        iArr[0] = iG;
        iArr[1] = i10;
    }

    public void w0(b1 b1Var, x xVar, iq1 iq1Var) {
        int i10 = xVar.f15654d;
        if (i10 < 0 || i10 >= b1Var.b()) {
            return;
        }
        iq1Var.b(i10, Math.max(0, xVar.f15657g));
    }

    public final int x0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        B0();
        z zVar = this.f1028r;
        boolean z9 = !this.f1033w;
        return u.d(b1Var, zVar, E0(z9), D0(z9), this, this.f1033w);
    }

    public final int y0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        B0();
        z zVar = this.f1028r;
        boolean z9 = !this.f1033w;
        return u.e(b1Var, zVar, E0(z9), D0(z9), this, this.f1033w, this.f1031u);
    }

    public final int z0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        B0();
        z zVar = this.f1028r;
        boolean z9 = !this.f1033w;
        return u.f(b1Var, zVar, E0(z9), D0(z9), this, this.f1033w);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1026p = 1;
        this.f1030t = false;
        this.f1031u = false;
        this.f1032v = false;
        this.f1033w = true;
        this.f1034x = -1;
        this.f1035y = Integer.MIN_VALUE;
        this.f1036z = null;
        this.A = new v();
        this.B = new w();
        this.C = 2;
        this.D = new int[2];
        o0 o0VarE = p0.E(context, attributeSet, i10, i11);
        U0(o0VarE.f15555a);
        boolean z9 = o0VarE.f15557c;
        c(null);
        if (z9 != this.f1030t) {
            this.f1030t = z9;
            g0();
        }
        V0(o0VarE.f15558d);
    }
}
