package d5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class p extends r {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final RectF f12442h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f12443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f12444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f12447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f12448g;

    public p(float f10, float f11, float f12, float f13) {
        this.f12443b = f10;
        this.f12444c = f11;
        this.f12445d = f12;
        this.f12446e = f13;
    }

    @Override // d5.r
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f12451a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f12442h;
        rectF.set(this.f12443b, this.f12444c, this.f12445d, this.f12446e);
        path.arcTo(rectF, this.f12447f, this.f12448g, false);
        path.transform(matrix);
    }
}
