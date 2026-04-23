package o0;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {
    public static int a(ViewGroup viewGroup) {
        return viewGroup.getNestedScrollAxes();
    }

    public static boolean b(ViewGroup viewGroup) {
        return viewGroup.isTransitionGroup();
    }

    public static void c(ViewGroup viewGroup, boolean z9) {
        viewGroup.setTransitionGroup(z9);
    }
}
