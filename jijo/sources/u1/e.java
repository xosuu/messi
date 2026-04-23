package u1;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.ads.fb1;

/* JADX INFO: loaded from: classes.dex */
public final class e extends Drawable implements Animatable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final LinearInterpolator f17534s = new LinearInterpolator();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b1.b f17535t = new b1.b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f17536u = {-16777216};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f17537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f17538b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Resources f17539d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ValueAnimator f17540f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17541h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17542q;

    public e(Context context) {
        context.getClass();
        this.f17539d = context.getResources();
        d dVar = new d();
        this.f17537a = dVar;
        dVar.f17521i = f17536u;
        dVar.a(0);
        dVar.f17520h = 2.5f;
        dVar.f17514b.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new b(this, dVar));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f17534s);
        valueAnimatorOfFloat.addListener(new c(this, dVar));
        this.f17540f = valueAnimatorOfFloat;
    }

    public static void d(float f10, d dVar) {
        if (f10 <= 0.75f) {
            dVar.f17533u = dVar.f17521i[dVar.f17522j];
            return;
        }
        float f11 = (f10 - 0.75f) / 0.25f;
        int[] iArr = dVar.f17521i;
        int i10 = dVar.f17522j;
        int i11 = iArr[i10];
        int i12 = iArr[(i10 + 1) % iArr.length];
        dVar.f17533u = ((((i11 >> 24) & 255) + ((int) ((((i12 >> 24) & 255) - r1) * f11))) << 24) | ((((i11 >> 16) & 255) + ((int) ((((i12 >> 16) & 255) - r3) * f11))) << 16) | ((((i11 >> 8) & 255) + ((int) ((((i12 >> 8) & 255) - r4) * f11))) << 8) | ((i11 & 255) + ((int) (f11 * ((i12 & 255) - r2))));
    }

    public final void a(float f10, d dVar, boolean z9) {
        float interpolation;
        float interpolation2;
        if (this.f17542q) {
            d(f10, dVar);
            float fFloor = (float) (Math.floor(dVar.f17525m / 0.8f) + 1.0d);
            float f11 = dVar.f17523k;
            float f12 = dVar.f17524l;
            dVar.f17517e = (((f12 - 0.01f) - f11) * f10) + f11;
            dVar.f17518f = f12;
            float f13 = dVar.f17525m;
            dVar.f17519g = fb1.c(fFloor, f13, f10, f13);
            return;
        }
        if (f10 != 1.0f || z9) {
            float f14 = dVar.f17525m;
            b1.b bVar = f17535t;
            if (f10 < 0.5f) {
                interpolation = dVar.f17523k;
                interpolation2 = (bVar.getInterpolation(f10 / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f15 = dVar.f17523k + 0.79f;
                interpolation = f15 - (((1.0f - bVar.getInterpolation((f10 - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f15;
            }
            float f16 = (0.20999998f * f10) + f14;
            float f17 = (f10 + this.f17541h) * 216.0f;
            dVar.f17517e = interpolation;
            dVar.f17518f = interpolation2;
            dVar.f17519g = f16;
            this.f17538b = f17;
        }
    }

    public final void b(float f10, float f11, float f12, float f13) {
        float f14 = this.f17539d.getDisplayMetrics().density;
        float f15 = f11 * f14;
        d dVar = this.f17537a;
        dVar.f17520h = f15;
        dVar.f17514b.setStrokeWidth(f15);
        dVar.f17529q = f10 * f14;
        dVar.a(0);
        dVar.f17530r = (int) (f12 * f14);
        dVar.f17531s = (int) (f13 * f14);
    }

    public final void c(int i10) {
        if (i10 == 0) {
            b(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            b(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f17538b, bounds.exactCenterX(), bounds.exactCenterY());
        d dVar = this.f17537a;
        RectF rectF = dVar.f17513a;
        float f10 = dVar.f17529q;
        float fMin = (dVar.f17520h / 2.0f) + f10;
        if (f10 <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((dVar.f17530r * dVar.f17528p) / 2.0f, dVar.f17520h / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f11 = dVar.f17517e;
        float f12 = dVar.f17519g;
        float f13 = (f11 + f12) * 360.0f;
        float f14 = ((dVar.f17518f + f12) * 360.0f) - f13;
        Paint paint = dVar.f17514b;
        paint.setColor(dVar.f17533u);
        paint.setAlpha(dVar.f17532t);
        float f15 = dVar.f17520h / 2.0f;
        rectF.inset(f15, f15);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, dVar.f17516d);
        float f16 = -f15;
        rectF.inset(f16, f16);
        canvas.drawArc(rectF, f13, f14, false, paint);
        if (dVar.f17526n) {
            Path path = dVar.f17527o;
            if (path == null) {
                Path path2 = new Path();
                dVar.f17527o = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f17 = (dVar.f17530r * dVar.f17528p) / 2.0f;
            dVar.f17527o.moveTo(0.0f, 0.0f);
            dVar.f17527o.lineTo(dVar.f17530r * dVar.f17528p, 0.0f);
            Path path3 = dVar.f17527o;
            float f18 = dVar.f17530r;
            float f19 = dVar.f17528p;
            path3.lineTo((f18 * f19) / 2.0f, dVar.f17531s * f19);
            dVar.f17527o.offset((rectF.centerX() + fMin2) - f17, (dVar.f17520h / 2.0f) + rectF.centerY());
            dVar.f17527o.close();
            Paint paint2 = dVar.f17515c;
            paint2.setColor(dVar.f17533u);
            paint2.setAlpha(dVar.f17532t);
            canvas.save();
            canvas.rotate(f13 + f14, rectF.centerX(), rectF.centerY());
            canvas.drawPath(dVar.f17527o, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f17537a.f17532t;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f17540f.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f17537a.f17532t = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f17537a.f17514b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f17540f.cancel();
        d dVar = this.f17537a;
        float f10 = dVar.f17517e;
        dVar.f17523k = f10;
        float f11 = dVar.f17518f;
        dVar.f17524l = f11;
        dVar.f17525m = dVar.f17519g;
        if (f11 != f10) {
            this.f17542q = true;
            this.f17540f.setDuration(666L);
            this.f17540f.start();
            return;
        }
        dVar.a(0);
        dVar.f17523k = 0.0f;
        dVar.f17524l = 0.0f;
        dVar.f17525m = 0.0f;
        dVar.f17517e = 0.0f;
        dVar.f17518f = 0.0f;
        dVar.f17519g = 0.0f;
        this.f17540f.setDuration(1332L);
        this.f17540f.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f17540f.cancel();
        this.f17538b = 0.0f;
        d dVar = this.f17537a;
        if (dVar.f17526n) {
            dVar.f17526n = false;
        }
        dVar.a(0);
        dVar.f17523k = 0.0f;
        dVar.f17524l = 0.0f;
        dVar.f17525m = 0.0f;
        dVar.f17517e = 0.0f;
        dVar.f17518f = 0.0f;
        dVar.f17519g = 0.0f;
        invalidateSelf();
    }
}
