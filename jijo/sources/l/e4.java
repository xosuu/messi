package l;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f14850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f14851b;

    static {
        f14851b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f14850a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = o0.v0.f16075a;
        return o0.e0.d(view) == 1;
    }
}
