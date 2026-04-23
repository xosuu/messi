package d5;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class q extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12450c;

    @Override // d5.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12451a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f12449b, this.f12450c);
        path.transform(matrix);
    }
}
