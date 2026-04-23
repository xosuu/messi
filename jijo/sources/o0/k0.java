package o0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static t1 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        t1 t1VarH = t1.h(rootWindowInsets, null);
        r1 r1Var = t1VarH.f16068a;
        r1Var.p(t1VarH);
        r1Var.d(view.getRootView());
        return t1VarH;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void d(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
