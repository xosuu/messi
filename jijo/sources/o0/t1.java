package o0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1 f16067b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f16068a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f16067b = q1.f16061q;
        } else {
            f16067b = r1.f16062b;
        }
    }

    public t1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f16068a = new q1(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f16068a = new p1(this, windowInsets);
        } else if (i10 >= 28) {
            this.f16068a = new o1(this, windowInsets);
        } else {
            this.f16068a = new n1(this, windowInsets);
        }
    }

    public static g0.c e(g0.c cVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, cVar.f13601a - i10);
        int iMax2 = Math.max(0, cVar.f13602b - i11);
        int iMax3 = Math.max(0, cVar.f13603c - i12);
        int iMax4 = Math.max(0, cVar.f13604d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? cVar : g0.c.a(iMax, iMax2, iMax3, iMax4);
    }

    public static t1 h(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        t1 t1Var = new t1(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = v0.f16075a;
            if (g0.b(view)) {
                t1 t1VarA = Build.VERSION.SDK_INT >= 23 ? k0.a(view) : j0.j(view);
                r1 r1Var = t1Var.f16068a;
                r1Var.p(t1VarA);
                r1Var.d(view.getRootView());
            }
        }
        return t1Var;
    }

    public final int a() {
        return this.f16068a.j().f13604d;
    }

    public final int b() {
        return this.f16068a.j().f13601a;
    }

    public final int c() {
        return this.f16068a.j().f13603c;
    }

    public final int d() {
        return this.f16068a.j().f13602b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        return n0.b.a(this.f16068a, ((t1) obj).f16068a);
    }

    public final t1 f(int i10, int i11, int i12, int i13) {
        int i14 = Build.VERSION.SDK_INT;
        l1 k1Var = i14 >= 30 ? new k1(this) : i14 >= 29 ? new j1(this) : new i1(this);
        k1Var.d(g0.c.a(i10, i11, i12, i13));
        return k1Var.b();
    }

    public final WindowInsets g() {
        r1 r1Var = this.f16068a;
        if (r1Var instanceof m1) {
            return ((m1) r1Var).f16047c;
        }
        return null;
    }

    public final int hashCode() {
        r1 r1Var = this.f16068a;
        if (r1Var == null) {
            return 0;
        }
        return r1Var.hashCode();
    }

    public t1() {
        this.f16068a = new r1(this);
    }
}
