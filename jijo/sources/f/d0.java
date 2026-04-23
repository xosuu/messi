package f;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, k0 k0Var) {
        Objects.requireNonNull(k0Var);
        androidx.activity.m mVar = new androidx.activity.m(2, k0Var);
        androidx.activity.j.e(obj).registerOnBackInvokedCallback(1000000, mVar);
        return mVar;
    }

    public static void c(Object obj, Object obj2) {
        androidx.activity.j.e(obj).unregisterOnBackInvokedCallback(androidx.activity.j.b(obj2));
    }
}
