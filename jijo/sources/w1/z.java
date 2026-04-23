package w1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class z extends d5.e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static boolean f18152s = true;

    public float y(View view) {
        if (f18152s) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f18152s = false;
            }
        }
        return view.getAlpha();
    }

    public void z(View view, float f10) {
        if (f18152s) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f18152s = false;
            }
        }
        view.setAlpha(f10);
    }
}
