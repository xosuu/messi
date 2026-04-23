package w1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import l.l3;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f18150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l3 f18151b;

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f18150a = new d0();
        } else if (i10 >= 23) {
            f18150a = new c0();
        } else if (i10 >= 22) {
            f18150a = new b0();
        } else {
            f18150a = new a0();
        }
        f18151b = new l3(Float.class, "translationAlpha", 6);
        new l3(Rect.class, "clipBounds", 7);
    }

    public static void a(View view, int i10, int i11, int i12, int i13) {
        f18150a.u(view, i10, i11, i12, i13);
    }
}
