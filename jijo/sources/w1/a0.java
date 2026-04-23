package w1;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends z {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static boolean f18072t = true;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static boolean f18073u = true;

    public void A(Matrix matrix, View view) {
        if (f18072t) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f18072t = false;
            }
        }
    }

    public void B(Matrix matrix, View view) {
        if (f18073u) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f18073u = false;
            }
        }
    }
}
