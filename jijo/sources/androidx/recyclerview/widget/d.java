package androidx.recyclerview.widget;

import android.view.View;
import java.util.Arrays;
import java.util.List;
import m1.e1;
import m1.k0;
import m1.l1;
import m1.m1;
import m1.n0;
import m1.n1;
import m1.p0;
import s.k;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f1107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1108c;

    public d(int i10) {
        this.f1106a = i10;
        if (i10 != 1) {
            return;
        }
        this.f1107b = new k();
        this.f1108c = new s.e();
    }

    public final void a(e1 e1Var) {
        n1 n1VarA = (n1) ((k) this.f1107b).getOrDefault(e1Var, null);
        if (n1VarA == null) {
            n1VarA = n1.a();
            ((k) this.f1107b).put(e1Var, n1VarA);
        }
        n1VarA.f15551a |= 1;
    }

    public final void b(e1 e1Var, k0 k0Var) {
        n1 n1VarA = (n1) ((k) this.f1107b).getOrDefault(e1Var, null);
        if (n1VarA == null) {
            n1VarA = n1.a();
            ((k) this.f1107b).put(e1Var, n1VarA);
        }
        n1VarA.f15553c = k0Var;
        n1VarA.f15551a |= 8;
    }

    public final void c(e1 e1Var, k0 k0Var) {
        n1 n1VarA = (n1) ((k) this.f1107b).getOrDefault(e1Var, null);
        if (n1VarA == null) {
            n1VarA = n1.a();
            ((k) this.f1107b).put(e1Var, n1VarA);
        }
        n1VarA.f15552b = k0Var;
        n1VarA.f15551a |= 4;
    }

    public final void d() {
        switch (this.f1106a) {
            case 0:
                int[] iArr = (int[]) this.f1107b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f1108c = null;
                break;
            default:
                ((k) this.f1107b).clear();
                ((s.e) this.f1108c).b();
                break;
        }
    }

    public final void e(int i10) {
        Object obj = this.f1107b;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i10, 10) + 1];
            this.f1107b = iArr;
            Arrays.fill(iArr, -1);
        } else if (i10 >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i10) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f1107b = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f1107b;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    public final View f(int i10, int i11, int i12, int i13) {
        int iA;
        int i14;
        int iB;
        View viewU;
        n0 n0Var = (n0) ((m1) this.f1107b);
        int i15 = n0Var.f15548a;
        Object obj = n0Var.f15549b;
        switch (i15) {
            case 0:
                iA = ((p0) obj).A();
                break;
            default:
                iA = ((p0) obj).C();
                break;
        }
        n0 n0Var2 = (n0) ((m1) this.f1107b);
        int i16 = n0Var2.f15548a;
        Object obj2 = n0Var2.f15549b;
        switch (i16) {
            case 0:
                p0 p0Var = (p0) obj2;
                i14 = p0Var.f15598n;
                iB = p0Var.B();
                break;
            default:
                p0 p0Var2 = (p0) obj2;
                i14 = p0Var2.f15599o;
                iB = p0Var2.z();
                break;
        }
        int i17 = i14 - iB;
        int i18 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            n0 n0Var3 = (n0) ((m1) this.f1107b);
            int i19 = n0Var3.f15548a;
            Object obj3 = n0Var3.f15549b;
            switch (i19) {
                case 0:
                    viewU = ((p0) obj3).u(i10);
                    break;
                default:
                    viewU = ((p0) obj3).u(i10);
                    break;
            }
            int iB2 = ((n0) ((m1) this.f1107b)).b(viewU);
            int iA2 = ((n0) ((m1) this.f1107b)).a(viewU);
            Object obj4 = this.f1108c;
            l1 l1Var = (l1) obj4;
            l1Var.f15539b = iA;
            l1Var.f15540c = i17;
            l1Var.f15541d = iB2;
            l1Var.f15542e = iA2;
            if (i12 != 0) {
                ((l1) obj4).f15538a = i12;
                if (((l1) obj4).a()) {
                    return viewU;
                }
            }
            if (i13 != 0) {
                Object obj5 = this.f1108c;
                ((l1) obj5).f15538a = i13;
                if (((l1) obj5).a()) {
                    view = viewU;
                }
            }
            i10 += i18;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f1107b
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f1108c
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L15
        L13:
            r0 = -1
            goto L72
        L15:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1b
            goto L36
        L1b:
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L21:
            if (r0 < 0) goto L36
            java.lang.Object r3 = r5.f1108c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r4 = r3.f1092a
            if (r4 != r6) goto L33
            r2 = r3
            goto L36
        L33:
            int r0 = r0 + (-1)
            goto L21
        L36:
            if (r2 == 0) goto L3f
            java.lang.Object r0 = r5.f1108c
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3f:
            java.lang.Object r0 = r5.f1108c
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L48:
            if (r2 >= r0) goto L5c
            java.lang.Object r3 = r5.f1108c
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r3
            int r3 = r3.f1092a
            if (r3 < r6) goto L59
            goto L5d
        L59:
            int r2 = r2 + 1
            goto L48
        L5c:
            r2 = -1
        L5d:
            if (r2 == r1) goto L13
            java.lang.Object r0 = r5.f1108c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) r0
            java.lang.Object r3 = r5.f1108c
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f1092a
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f1107b
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f1107b
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            java.lang.Object r2 = r5.f1107b
            int[] r2 = (int[]) r2
            int r0 = r0 + 1
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d.g(int):int");
    }

    public final boolean h(View view) {
        int iA;
        int i10;
        int iB;
        l1 l1Var = (l1) this.f1108c;
        n0 n0Var = (n0) ((m1) this.f1107b);
        int i11 = n0Var.f15548a;
        Object obj = n0Var.f15549b;
        switch (i11) {
            case 0:
                iA = ((p0) obj).A();
                break;
            default:
                iA = ((p0) obj).C();
                break;
        }
        n0 n0Var2 = (n0) ((m1) this.f1107b);
        int i12 = n0Var2.f15548a;
        Object obj2 = n0Var2.f15549b;
        switch (i12) {
            case 0:
                p0 p0Var = (p0) obj2;
                i10 = p0Var.f15598n;
                iB = p0Var.B();
                break;
            default:
                p0 p0Var2 = (p0) obj2;
                i10 = p0Var2.f15599o;
                iB = p0Var2.z();
                break;
        }
        int i13 = i10 - iB;
        int iB2 = ((n0) ((m1) this.f1107b)).b(view);
        int iA2 = ((n0) ((m1) this.f1107b)).a(view);
        l1Var.f15539b = iA;
        l1Var.f15540c = i13;
        l1Var.f15541d = iB2;
        l1Var.f15542e = iA2;
        Object obj3 = this.f1108c;
        ((l1) obj3).f15538a = 24579;
        return ((l1) obj3).a();
    }

    public final void i(int i10, int i11) {
        int[] iArr = (int[]) this.f1107b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        e(i12);
        int[] iArr2 = (int[]) this.f1107b;
        System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
        Arrays.fill((int[]) this.f1107b, i10, i12, -1);
        List list = (List) this.f1108c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((List) this.f1108c).get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1092a;
            if (i13 >= i10) {
                staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1092a = i13 + i11;
            }
        }
    }

    public final void j(int i10, int i11) {
        int[] iArr = (int[]) this.f1107b;
        if (iArr == null || i10 >= iArr.length) {
            return;
        }
        int i12 = i10 + i11;
        e(i12);
        int[] iArr2 = (int[]) this.f1107b;
        System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
        int[] iArr3 = (int[]) this.f1107b;
        Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
        List list = (List) this.f1108c;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem staggeredGridLayoutManager$LazySpanLookup$FullSpanItem = (StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem) ((List) this.f1108c).get(size);
            int i13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1092a;
            if (i13 >= i10) {
                if (i13 < i12) {
                    ((List) this.f1108c).remove(size);
                } else {
                    staggeredGridLayoutManager$LazySpanLookup$FullSpanItem.f1092a = i13 - i11;
                }
            }
        }
    }

    public final k0 k(e1 e1Var, int i10) {
        n1 n1Var;
        k0 k0Var;
        int iE = ((k) this.f1107b).e(e1Var);
        if (iE >= 0 && (n1Var = (n1) ((k) this.f1107b).j(iE)) != null) {
            int i11 = n1Var.f15551a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                n1Var.f15551a = i12;
                if (i10 == 4) {
                    k0Var = n1Var.f15552b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    k0Var = n1Var.f15553c;
                }
                if ((i12 & 12) == 0) {
                    ((k) this.f1107b).i(iE);
                    n1Var.f15551a = 0;
                    n1Var.f15552b = null;
                    n1Var.f15553c = null;
                    n1.f15550d.b(n1Var);
                }
                return k0Var;
            }
        }
        return null;
    }

    public final void l(e1 e1Var) {
        n1 n1Var = (n1) ((k) this.f1107b).getOrDefault(e1Var, null);
        if (n1Var == null) {
            return;
        }
        n1Var.f15551a &= -2;
    }

    public final void m(e1 e1Var) {
        int iG = ((s.e) this.f1108c).g() - 1;
        while (true) {
            if (iG < 0) {
                break;
            }
            if (e1Var == ((s.e) this.f1108c).h(iG)) {
                s.e eVar = (s.e) this.f1108c;
                Object[] objArr = eVar.f16601d;
                Object obj = objArr[iG];
                Object obj2 = s.e.f16598h;
                if (obj != obj2) {
                    objArr[iG] = obj2;
                    eVar.f16599a = true;
                }
            } else {
                iG--;
            }
        }
        n1 n1Var = (n1) ((k) this.f1107b).remove(e1Var);
        if (n1Var != null) {
            n1Var.f15551a = 0;
            n1Var.f15552b = null;
            n1Var.f15553c = null;
            n1.f15550d.b(n1Var);
        }
    }

    public d(n0 n0Var) {
        this.f1106a = 2;
        this.f1107b = n0Var;
        l1 l1Var = new l1();
        l1Var.f15538a = 0;
        this.f1108c = l1Var;
    }
}
