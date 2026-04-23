package d5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class n extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f12438c;

    public n(p pVar) {
        this.f12438c = pVar;
    }

    @Override // d5.s
    public final void a(Matrix matrix, c5.a aVar, int i10, Canvas canvas) {
        p pVar = this.f12438c;
        float f10 = pVar.f12447f;
        float f11 = pVar.f12448g;
        RectF rectF = new RectF(pVar.f12443b, pVar.f12444c, pVar.f12445d, pVar.f12446e);
        aVar.getClass();
        boolean z9 = f11 < 0.0f;
        Path path = aVar.f1576g;
        int[] iArr = c5.a.f1568k;
        if (z9) {
            iArr[0] = 0;
            iArr[1] = aVar.f1575f;
            iArr[2] = aVar.f1574e;
            iArr[3] = aVar.f1573d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i10;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f1573d;
            iArr[2] = aVar.f1574e;
            iArr[3] = aVar.f1575f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f13 = 1.0f - (i10 / fWidth);
        float[] fArr = c5.a.f1569l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = aVar.f1571b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z9) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.f1577h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}
