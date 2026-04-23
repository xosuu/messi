package w1;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends b0 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f18076w = true;

    @Override // d5.e
    public void w(View view, int i10) {
        if (Build.VERSION.SDK_INT == 28) {
            super.w(view, i10);
        } else if (f18076w) {
            try {
                view.setTransitionVisibility(i10);
            } catch (NoSuchMethodError unused) {
                f18076w = false;
            }
        }
    }
}
