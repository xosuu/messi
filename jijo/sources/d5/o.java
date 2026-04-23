package d5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f12439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f12440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f12441e;

    public o(q qVar, float f10, float f11) {
        this.f12439c = qVar;
        this.f12440d = f10;
        this.f12441e = f11;
    }

    @Override // d5.s
    public final void a(Matrix matrix, c5.a aVar, int i10, Canvas canvas) {
        q qVar = this.f12439c;
        float f10 = qVar.f12450c;
        float f11 = this.f12441e;
        float f12 = qVar.f12449b;
        float f13 = this.f12440d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f12453a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = c5.a.f1566i;
        iArr[0] = aVar.f1575f;
        iArr[1] = aVar.f1574e;
        iArr[2] = aVar.f1573d;
        Paint paint = aVar.f1572c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, c5.a.f1567j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        q qVar = this.f12439c;
        return (float) Math.toDegrees(Math.atan((qVar.f12450c - this.f12441e) / (qVar.f12449b - this.f12440d)));
    }
}
