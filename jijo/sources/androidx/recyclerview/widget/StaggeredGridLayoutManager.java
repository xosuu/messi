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
import androidx.fragment.app.k;
import com.google.android.gms.internal.ads.iq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import m1.a0;
import m1.a1;
import m1.b1;
import m1.i1;
import m1.j1;
import m1.k1;
import m1.l;
import m1.o0;
import m1.p0;
import m1.q0;
import m1.u;
import m1.w0;
import m1.y;
import o0.d0;
import o0.e0;
import o0.v0;
import p0.g;

/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends p0 implements a1 {
    public final d B;
    public final int C;
    public boolean D;
    public boolean E;
    public SavedState F;
    public final Rect G;
    public final i1 H;
    public final boolean I;
    public int[] J;
    public final l K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f1081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k1[] f1082q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a0 f1083r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a0 f1084s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f1085t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1086u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final u f1087v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f1088w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f1090y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f1089x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1091z = -1;
    public int A = Integer.MIN_VALUE;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1096a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1097b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1098d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int[] f1099f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1100h;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int[] f1101q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public List f1102s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f1103t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f1104u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f1105v;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1096a);
            parcel.writeInt(this.f1097b);
            parcel.writeInt(this.f1098d);
            if (this.f1098d > 0) {
                parcel.writeIntArray(this.f1099f);
            }
            parcel.writeInt(this.f1100h);
            if (this.f1100h > 0) {
                parcel.writeIntArray(this.f1101q);
            }
            parcel.writeInt(this.f1103t ? 1 : 0);
            parcel.writeInt(this.f1104u ? 1 : 0);
            parcel.writeInt(this.f1105v ? 1 : 0);
            parcel.writeList(this.f1102s);
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f1081p = -1;
        this.f1088w = false;
        d dVar = new d(0);
        this.B = dVar;
        this.C = 2;
        this.G = new Rect();
        this.H = new i1(this);
        this.I = true;
        this.K = new l(1, this);
        o0 o0VarE = p0.E(context, attributeSet, i10, i11);
        int i12 = o0VarE.f15555a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f1085t) {
            this.f1085t = i12;
            a0 a0Var = this.f1083r;
            this.f1083r = this.f1084s;
            this.f1084s = a0Var;
            g0();
        }
        int i13 = o0VarE.f15556b;
        c(null);
        if (i13 != this.f1081p) {
            dVar.d();
            g0();
            this.f1081p = i13;
            this.f1090y = new BitSet(this.f1081p);
            this.f1082q = new k1[this.f1081p];
            for (int i14 = 0; i14 < this.f1081p; i14++) {
                this.f1082q[i14] = new k1(this, i14);
            }
            g0();
        }
        boolean z9 = o0VarE.f15557c;
        c(null);
        SavedState savedState = this.F;
        if (savedState != null && savedState.f1103t != z9) {
            savedState.f1103t = z9;
        }
        this.f1088w = z9;
        g0();
        u uVar = new u();
        uVar.f15617a = true;
        uVar.f15622f = 0;
        uVar.f15623g = 0;
        this.f1087v = uVar;
        this.f1083r = a0.a(this, this.f1085t);
        this.f1084s = a0.a(this, 1 - this.f1085t);
    }

    public static int Y0(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean, int] */
    public final int A0(w0 w0Var, u uVar, b1 b1Var) {
        k1 k1Var;
        ?? r62;
        int i10;
        int iH;
        int iC;
        int iF;
        int iC2;
        int i11;
        int i12;
        int i13;
        int i14 = 1;
        this.f1090y.set(0, this.f1081p, true);
        u uVar2 = this.f1087v;
        int i15 = uVar2.f15625i ? uVar.f15621e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : uVar.f15621e == 1 ? uVar.f15623g + uVar.f15618b : uVar.f15622f - uVar.f15618b;
        int i16 = uVar.f15621e;
        for (int i17 = 0; i17 < this.f1081p; i17++) {
            if (!this.f1082q[i17].f15524a.isEmpty()) {
                X0(this.f1082q[i17], i16, i15);
            }
        }
        int iE = this.f1089x ? this.f1083r.e() : this.f1083r.f();
        boolean z9 = false;
        while (true) {
            int i18 = uVar.f15619c;
            if (!(i18 >= 0 && i18 < b1Var.b()) || (!uVar2.f15625i && this.f1090y.isEmpty())) {
                break;
            }
            View view = w0Var.i(uVar.f15619c, Long.MAX_VALUE).f15445a;
            uVar.f15619c += uVar.f15620d;
            j1 j1Var = (j1) view.getLayoutParams();
            int iC3 = j1Var.f15600a.c();
            d dVar = this.B;
            int[] iArr = (int[]) dVar.f1107b;
            int i19 = (iArr == null || iC3 >= iArr.length) ? -1 : iArr[iC3];
            if (i19 == -1) {
                if (O0(uVar.f15621e)) {
                    i12 = this.f1081p - i14;
                    i11 = -1;
                    i13 = -1;
                } else {
                    i11 = this.f1081p;
                    i12 = 0;
                    i13 = 1;
                }
                k1 k1Var2 = null;
                if (uVar.f15621e == i14) {
                    int iF2 = this.f1083r.f();
                    int i20 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        k1 k1Var3 = this.f1082q[i12];
                        int iF3 = k1Var3.f(iF2);
                        if (iF3 < i20) {
                            i20 = iF3;
                            k1Var2 = k1Var3;
                        }
                        i12 += i13;
                    }
                } else {
                    int iE2 = this.f1083r.e();
                    int i21 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        k1 k1Var4 = this.f1082q[i12];
                        int iH2 = k1Var4.h(iE2);
                        if (iH2 > i21) {
                            k1Var2 = k1Var4;
                            i21 = iH2;
                        }
                        i12 += i13;
                    }
                }
                k1Var = k1Var2;
                dVar.e(iC3);
                ((int[]) dVar.f1107b)[iC3] = k1Var.f15528e;
            } else {
                k1Var = this.f1082q[i19];
            }
            j1Var.f15506e = k1Var;
            if (uVar.f15621e == 1) {
                r62 = 0;
                b(-1, view, false);
            } else {
                r62 = 0;
                b(0, view, false);
            }
            if (this.f1085t == 1) {
                i10 = 1;
                M0(view, p0.w(r62, this.f1086u, this.f15596l, r62, ((ViewGroup.MarginLayoutParams) j1Var).width), p0.w(true, this.f15599o, this.f15597m, z() + C(), ((ViewGroup.MarginLayoutParams) j1Var).height));
            } else {
                i10 = 1;
                M0(view, p0.w(true, this.f15598n, this.f15596l, B() + A(), ((ViewGroup.MarginLayoutParams) j1Var).width), p0.w(false, this.f1086u, this.f15597m, 0, ((ViewGroup.MarginLayoutParams) j1Var).height));
            }
            if (uVar.f15621e == i10) {
                iC = k1Var.f(iE);
                iH = this.f1083r.c(view) + iC;
            } else {
                iH = k1Var.h(iE);
                iC = iH - this.f1083r.c(view);
            }
            if (uVar.f15621e == 1) {
                k1 k1Var5 = j1Var.f15506e;
                k1Var5.getClass();
                j1 j1Var2 = (j1) view.getLayoutParams();
                j1Var2.f15506e = k1Var5;
                ArrayList arrayList = k1Var5.f15524a;
                arrayList.add(view);
                k1Var5.f15526c = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    k1Var5.f15525b = Integer.MIN_VALUE;
                }
                if (j1Var2.f15600a.j() || j1Var2.f15600a.m()) {
                    k1Var5.f15527d = k1Var5.f15529f.f1083r.c(view) + k1Var5.f15527d;
                }
            } else {
                k1 k1Var6 = j1Var.f15506e;
                k1Var6.getClass();
                j1 j1Var3 = (j1) view.getLayoutParams();
                j1Var3.f15506e = k1Var6;
                ArrayList arrayList2 = k1Var6.f15524a;
                arrayList2.add(0, view);
                k1Var6.f15525b = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    k1Var6.f15526c = Integer.MIN_VALUE;
                }
                if (j1Var3.f15600a.j() || j1Var3.f15600a.m()) {
                    k1Var6.f15527d = k1Var6.f15529f.f1083r.c(view) + k1Var6.f15527d;
                }
            }
            if (L0() && this.f1085t == 1) {
                iC2 = this.f1084s.e() - (((this.f1081p - 1) - k1Var.f15528e) * this.f1086u);
                iF = iC2 - this.f1084s.c(view);
            } else {
                iF = this.f1084s.f() + (k1Var.f15528e * this.f1086u);
                iC2 = this.f1084s.c(view) + iF;
            }
            if (this.f1085t == 1) {
                p0.J(view, iF, iC, iC2, iH);
            } else {
                p0.J(view, iC, iF, iH, iC2);
            }
            X0(k1Var, uVar2.f15621e, i15);
            Q0(w0Var, uVar2);
            if (uVar2.f15624h && view.hasFocusable()) {
                this.f1090y.set(k1Var.f15528e, false);
            }
            i14 = 1;
            z9 = true;
        }
        if (!z9) {
            Q0(w0Var, uVar2);
        }
        int iF4 = uVar2.f15621e == -1 ? this.f1083r.f() - I0(this.f1083r.f()) : H0(this.f1083r.e()) - this.f1083r.e();
        if (iF4 > 0) {
            return Math.min(uVar.f15618b, iF4);
        }
        return 0;
    }

    public final View B0(boolean z9) {
        int iF = this.f1083r.f();
        int iE = this.f1083r.e();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iD = this.f1083r.d(viewU);
            int iB = this.f1083r.b(viewU);
            if (iB > iF && iD < iE) {
                if (iB <= iE || !z9) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View C0(boolean z9) {
        int iF = this.f1083r.f();
        int iE = this.f1083r.e();
        int iV = v();
        View view = null;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            int iD = this.f1083r.d(viewU);
            if (this.f1083r.b(viewU) > iF && iD < iE) {
                if (iD >= iF || !z9) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void D0(w0 w0Var, b1 b1Var, boolean z9) {
        int iE;
        int iH0 = H0(Integer.MIN_VALUE);
        if (iH0 != Integer.MIN_VALUE && (iE = this.f1083r.e() - iH0) > 0) {
            int i10 = iE - (-U0(-iE, w0Var, b1Var));
            if (!z9 || i10 <= 0) {
                return;
            }
            this.f1083r.k(i10);
        }
    }

    public final void E0(w0 w0Var, b1 b1Var, boolean z9) {
        int iF;
        int iI0 = I0(Integer.MAX_VALUE);
        if (iI0 != Integer.MAX_VALUE && (iF = iI0 - this.f1083r.f()) > 0) {
            int iU0 = iF - U0(iF, w0Var, b1Var);
            if (!z9 || iU0 <= 0) {
                return;
            }
            this.f1083r.k(-iU0);
        }
    }

    @Override // m1.p0
    public final int F(w0 w0Var, b1 b1Var) {
        return this.f1085t == 0 ? this.f1081p : super.F(w0Var, b1Var);
    }

    public final int F0() {
        if (v() == 0) {
            return 0;
        }
        return p0.D(u(0));
    }

    public final int G0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return p0.D(u(iV - 1));
    }

    @Override // m1.p0
    public final boolean H() {
        return this.C != 0;
    }

    public final int H0(int i10) {
        int iF = this.f1082q[0].f(i10);
        for (int i11 = 1; i11 < this.f1081p; i11++) {
            int iF2 = this.f1082q[i11].f(i10);
            if (iF2 > iF) {
                iF = iF2;
            }
        }
        return iF;
    }

    public final int I0(int i10) {
        int iH = this.f1082q[0].h(i10);
        for (int i11 = 1; i11 < this.f1081p; i11++) {
            int iH2 = this.f1082q[i11].h(i10);
            if (iH2 < iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void J0(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f1089x
            if (r0 == 0) goto L9
            int r0 = r7.G0()
            goto Ld
        L9:
            int r0 = r7.F0()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1b
            if (r8 >= r9) goto L17
            int r2 = r9 + 1
        L15:
            r3 = r8
            goto L1e
        L17:
            int r2 = r8 + 1
            r3 = r9
            goto L1e
        L1b:
            int r2 = r8 + r9
            goto L15
        L1e:
            androidx.recyclerview.widget.d r4 = r7.B
            r4.g(r3)
            r5 = 1
            if (r10 == r5) goto L37
            r6 = 2
            if (r10 == r6) goto L33
            if (r10 == r1) goto L2c
            goto L3a
        L2c:
            r4.j(r8, r5)
            r4.i(r9, r5)
            goto L3a
        L33:
            r4.j(r8, r9)
            goto L3a
        L37:
            r4.i(r8, r9)
        L3a:
            if (r2 > r0) goto L3d
            return
        L3d:
            boolean r8 = r7.f1089x
            if (r8 == 0) goto L46
            int r8 = r7.F0()
            goto L4a
        L46:
            int r8 = r7.G0()
        L4a:
            if (r3 > r8) goto L4f
            r7.g0()
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.J0(int, int, int):void");
    }

    @Override // m1.p0
    public final void K(int i10) {
        super.K(i10);
        for (int i11 = 0; i11 < this.f1081p; i11++) {
            k1 k1Var = this.f1082q[i11];
            int i12 = k1Var.f15525b;
            if (i12 != Integer.MIN_VALUE) {
                k1Var.f15525b = i12 + i10;
            }
            int i13 = k1Var.f15526c;
            if (i13 != Integer.MIN_VALUE) {
                k1Var.f15526c = i13 + i10;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ff A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x002c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View K0() {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K0():android.view.View");
    }

    @Override // m1.p0
    public final void L(int i10) {
        super.L(i10);
        for (int i11 = 0; i11 < this.f1081p; i11++) {
            k1 k1Var = this.f1082q[i11];
            int i12 = k1Var.f15525b;
            if (i12 != Integer.MIN_VALUE) {
                k1Var.f15525b = i12 + i10;
            }
            int i13 = k1Var.f15526c;
            if (i13 != Integer.MIN_VALUE) {
                k1Var.f15526c = i13 + i10;
            }
        }
    }

    public final boolean L0() {
        RecyclerView recyclerView = this.f15586b;
        WeakHashMap weakHashMap = v0.f16075a;
        return e0.d(recyclerView) == 1;
    }

    @Override // m1.p0
    public final void M(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f15586b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f1081p; i10++) {
            this.f1082q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final void M0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f15586b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.J(view));
        }
        j1 j1Var = (j1) view.getLayoutParams();
        int iY0 = Y0(i10, ((ViewGroup.MarginLayoutParams) j1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) j1Var).rightMargin + rect.right);
        int iY02 = Y0(i11, ((ViewGroup.MarginLayoutParams) j1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) j1Var).bottomMargin + rect.bottom);
        if (p0(view, iY0, iY02, j1Var)) {
            view.measure(iY0, iY02);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0060  */
    @Override // m1.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View N(android.view.View r9, int r10, m1.w0 r11, m1.b1 r12) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N(android.view.View, int, m1.w0, m1.b1):android.view.View");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0431  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N0(m1.w0 r17, m1.b1 r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.N0(m1.w0, m1.b1, boolean):void");
    }

    @Override // m1.p0
    public final void O(AccessibilityEvent accessibilityEvent) {
        super.O(accessibilityEvent);
        if (v() > 0) {
            View viewC0 = C0(false);
            View viewB0 = B0(false);
            if (viewC0 == null || viewB0 == null) {
                return;
            }
            int iD = p0.D(viewC0);
            int iD2 = p0.D(viewB0);
            if (iD < iD2) {
                accessibilityEvent.setFromIndex(iD);
                accessibilityEvent.setToIndex(iD2);
            } else {
                accessibilityEvent.setFromIndex(iD2);
                accessibilityEvent.setToIndex(iD);
            }
        }
    }

    public final boolean O0(int i10) {
        if (this.f1085t == 0) {
            return (i10 == -1) != this.f1089x;
        }
        return ((i10 == -1) == this.f1089x) == L0();
    }

    public final void P0(int i10, b1 b1Var) {
        int iF0;
        int i11;
        if (i10 > 0) {
            iF0 = G0();
            i11 = 1;
        } else {
            iF0 = F0();
            i11 = -1;
        }
        u uVar = this.f1087v;
        uVar.f15617a = true;
        W0(iF0, b1Var);
        V0(i11);
        uVar.f15619c = iF0 + uVar.f15620d;
        uVar.f15618b = Math.abs(i10);
    }

    @Override // m1.p0
    public final void Q(w0 w0Var, b1 b1Var, View view, g gVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof j1)) {
            P(view, gVar);
            return;
        }
        j1 j1Var = (j1) layoutParams;
        if (this.f1085t == 0) {
            k1 k1Var = j1Var.f15506e;
            gVar.h(k.f(k1Var == null ? -1 : k1Var.f15528e, 1, -1, -1, false, false));
        } else {
            k1 k1Var2 = j1Var.f15506e;
            gVar.h(k.f(-1, -1, k1Var2 == null ? -1 : k1Var2.f15528e, 1, false, false));
        }
    }

    public final void Q0(w0 w0Var, u uVar) {
        if (!uVar.f15617a || uVar.f15625i) {
            return;
        }
        if (uVar.f15618b == 0) {
            if (uVar.f15621e == -1) {
                R0(uVar.f15623g, w0Var);
                return;
            } else {
                S0(uVar.f15622f, w0Var);
                return;
            }
        }
        int i10 = 1;
        if (uVar.f15621e == -1) {
            int i11 = uVar.f15622f;
            int iH = this.f1082q[0].h(i11);
            while (i10 < this.f1081p) {
                int iH2 = this.f1082q[i10].h(i11);
                if (iH2 > iH) {
                    iH = iH2;
                }
                i10++;
            }
            int i12 = i11 - iH;
            R0(i12 < 0 ? uVar.f15623g : uVar.f15623g - Math.min(i12, uVar.f15618b), w0Var);
            return;
        }
        int i13 = uVar.f15623g;
        int iF = this.f1082q[0].f(i13);
        while (i10 < this.f1081p) {
            int iF2 = this.f1082q[i10].f(i13);
            if (iF2 < iF) {
                iF = iF2;
            }
            i10++;
        }
        int i14 = iF - uVar.f15623g;
        S0(i14 < 0 ? uVar.f15622f : Math.min(i14, uVar.f15618b) + uVar.f15622f, w0Var);
    }

    @Override // m1.p0
    public final void R(int i10, int i11) {
        J0(i10, i11, 1);
    }

    public final void R0(int i10, w0 w0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f1083r.d(viewU) < i10 || this.f1083r.j(viewU) < i10) {
                return;
            }
            j1 j1Var = (j1) viewU.getLayoutParams();
            j1Var.getClass();
            if (j1Var.f15506e.f15524a.size() == 1) {
                return;
            }
            k1 k1Var = j1Var.f15506e;
            ArrayList arrayList = k1Var.f15524a;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            j1 j1Var2 = (j1) view.getLayoutParams();
            j1Var2.f15506e = null;
            if (j1Var2.f15600a.j() || j1Var2.f15600a.m()) {
                k1Var.f15527d -= k1Var.f15529f.f1083r.c(view);
            }
            if (size == 1) {
                k1Var.f15525b = Integer.MIN_VALUE;
            }
            k1Var.f15526c = Integer.MIN_VALUE;
            d0(viewU, w0Var);
        }
    }

    @Override // m1.p0
    public final void S() {
        this.B.d();
        g0();
    }

    public final void S0(int i10, w0 w0Var) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f1083r.b(viewU) > i10 || this.f1083r.i(viewU) > i10) {
                return;
            }
            j1 j1Var = (j1) viewU.getLayoutParams();
            j1Var.getClass();
            if (j1Var.f15506e.f15524a.size() == 1) {
                return;
            }
            k1 k1Var = j1Var.f15506e;
            ArrayList arrayList = k1Var.f15524a;
            View view = (View) arrayList.remove(0);
            j1 j1Var2 = (j1) view.getLayoutParams();
            j1Var2.f15506e = null;
            if (arrayList.size() == 0) {
                k1Var.f15526c = Integer.MIN_VALUE;
            }
            if (j1Var2.f15600a.j() || j1Var2.f15600a.m()) {
                k1Var.f15527d -= k1Var.f15529f.f1083r.c(view);
            }
            k1Var.f15525b = Integer.MIN_VALUE;
            d0(viewU, w0Var);
        }
    }

    @Override // m1.p0
    public final void T(int i10, int i11) {
        J0(i10, i11, 8);
    }

    public final void T0() {
        if (this.f1085t == 1 || !L0()) {
            this.f1089x = this.f1088w;
        } else {
            this.f1089x = !this.f1088w;
        }
    }

    @Override // m1.p0
    public final void U(int i10, int i11) {
        J0(i10, i11, 2);
    }

    public final int U0(int i10, w0 w0Var, b1 b1Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        P0(i10, b1Var);
        u uVar = this.f1087v;
        int iA0 = A0(w0Var, uVar, b1Var);
        if (uVar.f15618b >= iA0) {
            i10 = i10 < 0 ? -iA0 : iA0;
        }
        this.f1083r.k(-i10);
        this.D = this.f1089x;
        uVar.f15618b = 0;
        Q0(w0Var, uVar);
        return i10;
    }

    @Override // m1.p0
    public final void V(int i10, int i11) {
        J0(i10, i11, 4);
    }

    public final void V0(int i10) {
        u uVar = this.f1087v;
        uVar.f15621e = i10;
        uVar.f15620d = this.f1089x != (i10 == -1) ? -1 : 1;
    }

    @Override // m1.p0
    public final void W(w0 w0Var, b1 b1Var) {
        N0(w0Var, b1Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void W0(int r6, m1.b1 r7) {
        /*
            r5 = this;
            m1.u r0 = r5.f1087v
            r1 = 0
            r0.f15618b = r1
            r0.f15619c = r6
            m1.y r2 = r5.f15589e
            r3 = 1
            if (r2 == 0) goto L12
            boolean r2 = r2.f15667e
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            if (r2 == 0) goto L34
            int r7 = r7.f15410a
            r2 = -1
            if (r7 == r2) goto L34
            boolean r2 = r5.f1089x
            if (r7 >= r6) goto L20
            r6 = 1
            goto L21
        L20:
            r6 = 0
        L21:
            if (r2 != r6) goto L2b
            m1.a0 r6 = r5.f1083r
            int r6 = r6.g()
        L29:
            r7 = 0
            goto L36
        L2b:
            m1.a0 r6 = r5.f1083r
            int r6 = r6.g()
            r7 = r6
            r6 = 0
            goto L36
        L34:
            r6 = 0
            goto L29
        L36:
            androidx.recyclerview.widget.RecyclerView r2 = r5.f15586b
            if (r2 == 0) goto L51
            boolean r2 = r2.f1064s
            if (r2 == 0) goto L51
            m1.a0 r2 = r5.f1083r
            int r2 = r2.f()
            int r2 = r2 - r7
            r0.f15622f = r2
            m1.a0 r7 = r5.f1083r
            int r7 = r7.e()
            int r7 = r7 + r6
            r0.f15623g = r7
            goto L67
        L51:
            m1.a0 r2 = r5.f1083r
            m1.z r2 = (m1.z) r2
            int r4 = r2.f15679d
            m1.p0 r2 = r2.f15400a
            switch(r4) {
                case 0: goto L5f;
                default: goto L5c;
            }
        L5c:
            int r2 = r2.f15599o
            goto L61
        L5f:
            int r2 = r2.f15598n
        L61:
            int r2 = r2 + r6
            r0.f15623g = r2
            int r6 = -r7
            r0.f15622f = r6
        L67:
            r0.f15624h = r1
            r0.f15617a = r3
            m1.a0 r6 = r5.f1083r
            r7 = r6
            m1.z r7 = (m1.z) r7
            int r2 = r7.f15679d
            m1.p0 r7 = r7.f15400a
            switch(r2) {
                case 0: goto L7a;
                default: goto L77;
            }
        L77:
            int r7 = r7.f15597m
            goto L7c
        L7a:
            int r7 = r7.f15596l
        L7c:
            if (r7 != 0) goto L8f
            m1.z r6 = (m1.z) r6
            int r7 = r6.f15679d
            m1.p0 r6 = r6.f15400a
            switch(r7) {
                case 0: goto L8a;
                default: goto L87;
            }
        L87:
            int r6 = r6.f15599o
            goto L8c
        L8a:
            int r6 = r6.f15598n
        L8c:
            if (r6 != 0) goto L8f
            r1 = 1
        L8f:
            r0.f15625i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.W0(int, m1.b1):void");
    }

    @Override // m1.p0
    public final void X(b1 b1Var) {
        this.f1091z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    public final void X0(k1 k1Var, int i10, int i11) {
        int i12 = k1Var.f15527d;
        int i13 = k1Var.f15528e;
        if (i10 != -1) {
            int i14 = k1Var.f15526c;
            if (i14 == Integer.MIN_VALUE) {
                k1Var.a();
                i14 = k1Var.f15526c;
            }
            if (i14 - i12 >= i11) {
                this.f1090y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = k1Var.f15525b;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) k1Var.f15524a.get(0);
            j1 j1Var = (j1) view.getLayoutParams();
            k1Var.f15525b = k1Var.f15529f.f1083r.d(view);
            j1Var.getClass();
            i15 = k1Var.f15525b;
        }
        if (i15 + i12 <= i11) {
            this.f1090y.set(i13, false);
        }
    }

    @Override // m1.p0
    public final void Y(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.F = (SavedState) parcelable;
            g0();
        }
    }

    @Override // m1.p0
    public final Parcelable Z() {
        int iH;
        int iF;
        int[] iArr;
        SavedState savedState = this.F;
        if (savedState != null) {
            SavedState savedState2 = new SavedState();
            savedState2.f1098d = savedState.f1098d;
            savedState2.f1096a = savedState.f1096a;
            savedState2.f1097b = savedState.f1097b;
            savedState2.f1099f = savedState.f1099f;
            savedState2.f1100h = savedState.f1100h;
            savedState2.f1101q = savedState.f1101q;
            savedState2.f1103t = savedState.f1103t;
            savedState2.f1104u = savedState.f1104u;
            savedState2.f1105v = savedState.f1105v;
            savedState2.f1102s = savedState.f1102s;
            return savedState2;
        }
        SavedState savedState3 = new SavedState();
        savedState3.f1103t = this.f1088w;
        savedState3.f1104u = this.D;
        savedState3.f1105v = this.E;
        d dVar = this.B;
        if (dVar == null || (iArr = (int[]) dVar.f1107b) == null) {
            savedState3.f1100h = 0;
        } else {
            savedState3.f1101q = iArr;
            savedState3.f1100h = iArr.length;
            savedState3.f1102s = (List) dVar.f1108c;
        }
        if (v() > 0) {
            savedState3.f1096a = this.D ? G0() : F0();
            View viewB0 = this.f1089x ? B0(true) : C0(true);
            savedState3.f1097b = viewB0 != null ? p0.D(viewB0) : -1;
            int i10 = this.f1081p;
            savedState3.f1098d = i10;
            savedState3.f1099f = new int[i10];
            for (int i11 = 0; i11 < this.f1081p; i11++) {
                if (this.D) {
                    iH = this.f1082q[i11].f(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iF = this.f1083r.e();
                        iH -= iF;
                    }
                } else {
                    iH = this.f1082q[i11].h(Integer.MIN_VALUE);
                    if (iH != Integer.MIN_VALUE) {
                        iF = this.f1083r.f();
                        iH -= iF;
                    }
                }
                savedState3.f1099f[i11] = iH;
            }
        } else {
            savedState3.f1096a = -1;
            savedState3.f1097b = -1;
            savedState3.f1098d = 0;
        }
        return savedState3;
    }

    @Override // m1.a1
    public final PointF a(int i10) {
        int iV0 = v0(i10);
        PointF pointF = new PointF();
        if (iV0 == 0) {
            return null;
        }
        if (this.f1085t == 0) {
            pointF.x = iV0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = iV0;
        }
        return pointF;
    }

    @Override // m1.p0
    public final void a0(int i10) {
        if (i10 == 0) {
            w0();
        }
    }

    @Override // m1.p0
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.F != null || (recyclerView = this.f15586b) == null) {
            return;
        }
        recyclerView.i(str);
    }

    @Override // m1.p0
    public final boolean d() {
        return this.f1085t == 0;
    }

    @Override // m1.p0
    public final boolean e() {
        return this.f1085t == 1;
    }

    @Override // m1.p0
    public final boolean f(q0 q0Var) {
        return q0Var instanceof j1;
    }

    @Override // m1.p0
    public final void h(int i10, int i11, b1 b1Var, iq1 iq1Var) {
        u uVar;
        int iF;
        int iH;
        if (this.f1085t != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        P0(i10, b1Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f1081p) {
            this.J = new int[this.f1081p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f1081p;
            uVar = this.f1087v;
            if (i12 >= i14) {
                break;
            }
            if (uVar.f15620d == -1) {
                iF = uVar.f15622f;
                iH = this.f1082q[i12].h(iF);
            } else {
                iF = this.f1082q[i12].f(uVar.f15623g);
                iH = uVar.f15623g;
            }
            int i15 = iF - iH;
            if (i15 >= 0) {
                this.J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = uVar.f15619c;
            if (i17 < 0 || i17 >= b1Var.b()) {
                return;
            }
            iq1Var.b(uVar.f15619c, this.J[i16]);
            uVar.f15619c += uVar.f15620d;
        }
    }

    @Override // m1.p0
    public final int h0(int i10, w0 w0Var, b1 b1Var) {
        return U0(i10, w0Var, b1Var);
    }

    @Override // m1.p0
    public final void i0(int i10) {
        SavedState savedState = this.F;
        if (savedState != null && savedState.f1096a != i10) {
            savedState.f1099f = null;
            savedState.f1098d = 0;
            savedState.f1096a = -1;
            savedState.f1097b = -1;
        }
        this.f1091z = i10;
        this.A = Integer.MIN_VALUE;
        g0();
    }

    @Override // m1.p0
    public final int j(b1 b1Var) {
        return x0(b1Var);
    }

    @Override // m1.p0
    public final int j0(int i10, w0 w0Var, b1 b1Var) {
        return U0(i10, w0Var, b1Var);
    }

    @Override // m1.p0
    public final int k(b1 b1Var) {
        return y0(b1Var);
    }

    @Override // m1.p0
    public final int l(b1 b1Var) {
        return z0(b1Var);
    }

    @Override // m1.p0
    public final int m(b1 b1Var) {
        return x0(b1Var);
    }

    @Override // m1.p0
    public final void m0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        int iB = B() + A();
        int iZ = z() + C();
        if (this.f1085t == 1) {
            int iHeight = rect.height() + iZ;
            RecyclerView recyclerView = this.f15586b;
            WeakHashMap weakHashMap = v0.f16075a;
            iG2 = p0.g(i11, iHeight, d0.d(recyclerView));
            iG = p0.g(i10, (this.f1086u * this.f1081p) + iB, d0.e(this.f15586b));
        } else {
            int iWidth = rect.width() + iB;
            RecyclerView recyclerView2 = this.f15586b;
            WeakHashMap weakHashMap2 = v0.f16075a;
            iG = p0.g(i10, iWidth, d0.e(recyclerView2));
            iG2 = p0.g(i11, (this.f1086u * this.f1081p) + iZ, d0.d(this.f15586b));
        }
        this.f15586b.setMeasuredDimension(iG, iG2);
    }

    @Override // m1.p0
    public final int n(b1 b1Var) {
        return y0(b1Var);
    }

    @Override // m1.p0
    public final int o(b1 b1Var) {
        return z0(b1Var);
    }

    @Override // m1.p0
    public final q0 r() {
        return this.f1085t == 0 ? new j1(-2, -1) : new j1(-1, -2);
    }

    @Override // m1.p0
    public final q0 s(Context context, AttributeSet attributeSet) {
        return new j1(context, attributeSet);
    }

    @Override // m1.p0
    public final void s0(RecyclerView recyclerView, int i10) {
        y yVar = new y(recyclerView.getContext());
        yVar.f15663a = i10;
        t0(yVar);
    }

    @Override // m1.p0
    public final q0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new j1((ViewGroup.MarginLayoutParams) layoutParams) : new j1(layoutParams);
    }

    @Override // m1.p0
    public final boolean u0() {
        return this.F == null;
    }

    public final int v0(int i10) {
        if (v() == 0) {
            return this.f1089x ? 1 : -1;
        }
        return (i10 < F0()) != this.f1089x ? -1 : 1;
    }

    public final boolean w0() {
        int iF0;
        if (v() != 0 && this.C != 0 && this.f15591g) {
            if (this.f1089x) {
                iF0 = G0();
                F0();
            } else {
                iF0 = F0();
                G0();
            }
            d dVar = this.B;
            if (iF0 == 0 && K0() != null) {
                dVar.d();
                this.f15590f = true;
                g0();
                return true;
            }
        }
        return false;
    }

    @Override // m1.p0
    public final int x(w0 w0Var, b1 b1Var) {
        return this.f1085t == 1 ? this.f1081p : super.x(w0Var, b1Var);
    }

    public final int x0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        a0 a0Var = this.f1083r;
        boolean z9 = this.I;
        return b7.u.d(b1Var, a0Var, C0(!z9), B0(!z9), this, this.I);
    }

    public final int y0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        a0 a0Var = this.f1083r;
        boolean z9 = this.I;
        return b7.u.e(b1Var, a0Var, C0(!z9), B0(!z9), this, this.I, this.f1089x);
    }

    public final int z0(b1 b1Var) {
        if (v() == 0) {
            return 0;
        }
        a0 a0Var = this.f1083r;
        boolean z9 = this.I;
        return b7.u.f(b1Var, a0Var, C0(!z9), B0(!z9), this, this.I);
    }
}
