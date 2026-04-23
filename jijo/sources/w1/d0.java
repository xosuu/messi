package w1;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends c0 {
    @Override // w1.a0
    public final void A(Matrix matrix, View view) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // w1.a0
    public final void B(Matrix matrix, View view) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // w1.b0, d5.e
    public final void u(View view, int i10, int i11, int i12, int i13) {
        view.setLeftTopRightBottom(i10, i11, i12, i13);
    }

    @Override // w1.c0, d5.e
    public final void w(View view, int i10) {
        view.setTransitionVisibility(i10);
    }

    @Override // w1.z
    public final float y(View view) {
        return view.getTransitionAlpha();
    }

    @Override // w1.z
    public final void z(View view, float f10) {
        view.setTransitionAlpha(f10);
    }
}
