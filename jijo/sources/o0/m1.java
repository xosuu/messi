package o0;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1 extends r1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f16042h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Method f16043i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Class f16044j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static Field f16045k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static Field f16046l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f16047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0.c[] f16048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g0.c f16049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t1 f16050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g0.c f16051g;

    public m1(t1 t1Var, WindowInsets windowInsets) {
        super(t1Var);
        this.f16049e = null;
        this.f16047c = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private g0.c r(int i10, boolean z9) {
        g0.c cVarA = g0.c.f13600e;
        for (int i11 = 1; i11 <= 256; i11 <<= 1) {
            if ((i10 & i11) != 0) {
                g0.c cVarS = s(i11, z9);
                cVarA = g0.c.a(Math.max(cVarA.f13601a, cVarS.f13601a), Math.max(cVarA.f13602b, cVarS.f13602b), Math.max(cVarA.f13603c, cVarS.f13603c), Math.max(cVarA.f13604d, cVarS.f13604d));
            }
        }
        return cVarA;
    }

    private g0.c t() {
        t1 t1Var = this.f16050f;
        return t1Var != null ? t1Var.f16068a.h() : g0.c.f13600e;
    }

    private g0.c u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f16042h) {
            v();
        }
        Method method = f16043i;
        if (method != null && f16044j != null && f16045k != null) {
            try {
                Object objInvoke = method.invoke(view, new Object[0]);
                if (objInvoke == null) {
                    return null;
                }
                Rect rect = (Rect) f16045k.get(f16046l.get(objInvoke));
                if (rect != null) {
                    return g0.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e10) {
                e10.getMessage();
            }
        }
        return null;
    }

    @SuppressLint({"PrivateApi"})
    private static void v() {
        try {
            f16043i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f16044j = cls;
            f16045k = cls.getDeclaredField("mVisibleInsets");
            f16046l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f16045k.setAccessible(true);
            f16046l.setAccessible(true);
        } catch (ReflectiveOperationException e10) {
            e10.getMessage();
        }
        f16042h = true;
    }

    @Override // o0.r1
    public void d(View view) {
        g0.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = g0.c.f13600e;
        }
        w(cVarU);
    }

    @Override // o0.r1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f16051g, ((m1) obj).f16051g);
        }
        return false;
    }

    @Override // o0.r1
    public g0.c f(int i10) {
        return r(i10, false);
    }

    @Override // o0.r1
    public final g0.c j() {
        if (this.f16049e == null) {
            WindowInsets windowInsets = this.f16047c;
            this.f16049e = g0.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f16049e;
    }

    @Override // o0.r1
    public t1 l(int i10, int i11, int i12, int i13) {
        t1 t1VarH = t1.h(this.f16047c, null);
        int i14 = Build.VERSION.SDK_INT;
        l1 k1Var = i14 >= 30 ? new k1(t1VarH) : i14 >= 29 ? new j1(t1VarH) : new i1(t1VarH);
        k1Var.d(t1.e(j(), i10, i11, i12, i13));
        k1Var.c(t1.e(h(), i10, i11, i12, i13));
        return k1Var.b();
    }

    @Override // o0.r1
    public boolean n() {
        return this.f16047c.isRound();
    }

    @Override // o0.r1
    public void o(g0.c[] cVarArr) {
        this.f16048d = cVarArr;
    }

    @Override // o0.r1
    public void p(t1 t1Var) {
        this.f16050f = t1Var;
    }

    public g0.c s(int i10, boolean z9) {
        g0.c cVarH;
        int i11;
        if (i10 == 1) {
            return z9 ? g0.c.a(0, Math.max(t().f13602b, j().f13602b), 0, 0) : g0.c.a(0, j().f13602b, 0, 0);
        }
        if (i10 == 2) {
            if (z9) {
                g0.c cVarT = t();
                g0.c cVarH2 = h();
                return g0.c.a(Math.max(cVarT.f13601a, cVarH2.f13601a), 0, Math.max(cVarT.f13603c, cVarH2.f13603c), Math.max(cVarT.f13604d, cVarH2.f13604d));
            }
            g0.c cVarJ = j();
            t1 t1Var = this.f16050f;
            cVarH = t1Var != null ? t1Var.f16068a.h() : null;
            int iMin = cVarJ.f13604d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.f13604d);
            }
            return g0.c.a(cVarJ.f13601a, 0, cVarJ.f13603c, iMin);
        }
        g0.c cVar = g0.c.f13600e;
        if (i10 == 8) {
            g0.c[] cVarArr = this.f16048d;
            cVarH = cVarArr != null ? cVarArr[3] : null;
            if (cVarH != null) {
                return cVarH;
            }
            g0.c cVarJ2 = j();
            g0.c cVarT2 = t();
            int i12 = cVarJ2.f13604d;
            if (i12 > cVarT2.f13604d) {
                return g0.c.a(0, 0, 0, i12);
            }
            g0.c cVar2 = this.f16051g;
            return (cVar2 == null || cVar2.equals(cVar) || (i11 = this.f16051g.f13604d) <= cVarT2.f13604d) ? cVar : g0.c.a(0, 0, 0, i11);
        }
        if (i10 == 16) {
            return i();
        }
        if (i10 == 32) {
            return g();
        }
        if (i10 == 64) {
            return k();
        }
        if (i10 != 128) {
            return cVar;
        }
        t1 t1Var2 = this.f16050f;
        j jVarE = t1Var2 != null ? t1Var2.f16068a.e() : e();
        if (jVarE == null) {
            return cVar;
        }
        int i13 = Build.VERSION.SDK_INT;
        DisplayCutout displayCutout = jVarE.f16040a;
        return g0.c.a(i13 >= 28 ? i.d(displayCutout) : 0, i13 >= 28 ? i.f(displayCutout) : 0, i13 >= 28 ? i.e(displayCutout) : 0, i13 >= 28 ? i.c(displayCutout) : 0);
    }

    public void w(g0.c cVar) {
        this.f16051g = cVar;
    }
}
