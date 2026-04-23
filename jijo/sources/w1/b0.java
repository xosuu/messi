package w1;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class b0 extends a0 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f18075v = true;

    @Override // d5.e
    public void u(View view, int i10, int i11, int i12, int i13) {
        if (f18075v) {
            try {
                view.setLeftTopRightBottom(i10, i11, i12, i13);
            } catch (NoSuchMethodError unused) {
                f18075v = false;
            }
        }
    }
}
