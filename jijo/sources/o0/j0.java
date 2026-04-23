package o0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.vg);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static t1 b(View view, t1 t1Var, Rect rect) {
        WindowInsets windowInsetsG = t1Var.g();
        if (windowInsetsG != null) {
            return t1.h(view.computeSystemWindowInsets(windowInsetsG, rect), view);
        }
        rect.setEmpty();
        return t1Var;
    }

    public static boolean c(View view, float f10, float f11, boolean z9) {
        return view.dispatchNestedFling(f10, f11, z9);
    }

    public static boolean d(View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i10, int i11, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i10, i11, iArr, iArr2);
    }

    public static boolean f(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        return view.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static t1 j(View view) {
        if (!h1.f16030d || !view.isAttachedToWindow()) {
            return null;
        }
        try {
            Object obj = h1.f16027a.get(view.getRootView());
            if (obj == null) {
                return null;
            }
            Rect rect = (Rect) h1.f16028b.get(obj);
            Rect rect2 = (Rect) h1.f16029c.get(obj);
            if (rect == null || rect2 == null) {
                return null;
            }
            k.q qVar = new k.q(7);
            ((l1) qVar.f14587b).c(g0.c.a(rect.left, rect.top, rect.right, rect.bottom));
            ((l1) qVar.f14587b).d(g0.c.a(rect2.left, rect2.top, rect2.right, rect2.bottom));
            t1 t1VarB = ((l1) qVar.f14587b).b();
            t1VarB.f16068a.p(t1VarB);
            t1VarB.f16068a.d(view.getRootView());
            return t1VarB;
        } catch (IllegalAccessException e10) {
            e10.getMessage();
            return null;
        }
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f10) {
        view.setElevation(f10);
    }

    public static void t(View view, boolean z9) {
        view.setNestedScrollingEnabled(z9);
    }

    public static void u(View view, t tVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.v9, tVar);
        }
        if (tVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.vg));
        } else {
            view.setOnApplyWindowInsetsListener(new i0(view, tVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void x(View view, float f10) {
        view.setZ(f10);
    }

    public static boolean y(View view, int i10) {
        return view.startNestedScroll(i10);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}
