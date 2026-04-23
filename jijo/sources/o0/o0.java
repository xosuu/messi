package o0;

import android.view.View;
import java.util.Objects;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {
    public static void a(View view, t0 t0Var) {
        s.k kVar = (s.k) view.getTag(R.id.vf);
        if (kVar == null) {
            kVar = new s.k();
            view.setTag(R.id.vf, kVar);
        }
        Objects.requireNonNull(t0Var);
        View.OnUnhandledKeyEventListener n0Var = new n0();
        kVar.put(t0Var, n0Var);
        view.addOnUnhandledKeyEventListener(n0Var);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, t0 t0Var) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        s.k kVar = (s.k) view.getTag(R.id.vf);
        if (kVar == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kVar.getOrDefault(t0Var, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    public static <T> T f(View view, int i10) {
        return (T) view.requireViewById(i10);
    }

    public static void g(View view, boolean z9) {
        view.setAccessibilityHeading(z9);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, boolean z9) {
        view.setScreenReaderFocusable(z9);
    }
}
