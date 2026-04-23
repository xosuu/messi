package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.android.gms.internal.ads.fb1;
import g4.z;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class i extends Drawable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float f13585m = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f13586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13588c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13589d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13590e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13591f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f13592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13593h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13594i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f13595j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f13596k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13597l;

    public i(Context context) {
        Paint paint = new Paint();
        this.f13586a = paint;
        this.f13592g = new Path();
        this.f13594i = false;
        this.f13597l = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, e.a.f12607n, R.attr.kf, R.style.f5);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f13596k = (float) (Math.cos(f13585m) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f13591f != z9) {
            this.f13591f = z9;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f13590e) {
            this.f13590e = fRound;
            invalidateSelf();
        }
        this.f13593h = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f13588c = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f13587b = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f13589d = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float a(float f10, float f11, float f12) {
        return fb1.c(f11, f10, f12, f10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        boolean z9 = false;
        int i10 = this.f13597l;
        if (i10 != 0 && (i10 == 1 || (i10 == 3 ? z.n(this) == 0 : z.n(this) == 1))) {
            z9 = true;
        }
        float f10 = this.f13587b;
        float fSqrt = (float) Math.sqrt(f10 * f10 * 2.0f);
        float f11 = this.f13595j;
        float f12 = this.f13588c;
        float fA = a(f12, fSqrt, f11);
        float fA2 = a(f12, this.f13589d, this.f13595j);
        float fRound = Math.round(a(0.0f, this.f13596k, this.f13595j));
        float fA3 = a(0.0f, f13585m, this.f13595j);
        float fA4 = a(z9 ? 0.0f : -180.0f, z9 ? 180.0f : 0.0f, this.f13595j);
        double d10 = fA;
        double d11 = fA3;
        float fRound2 = Math.round(Math.cos(d11) * d10);
        float fRound3 = Math.round(Math.sin(d11) * d10);
        Path path = this.f13592g;
        path.rewind();
        float f13 = this.f13590e;
        Paint paint = this.f13586a;
        float fA5 = a(paint.getStrokeWidth() + f13, -this.f13596k, this.f13595j);
        float f14 = (-fA2) / 2.0f;
        path.moveTo(f14 + fRound, 0.0f);
        path.rLineTo(fA2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f14, fA5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f14, -fA5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), (strokeWidth * 1.5f) + this.f13590e + ((((int) (fHeight - (2.0f * r8))) / 4) * 2));
        if (this.f13591f) {
            canvas.rotate(fA4 * (this.f13594i ^ z9 ? -1 : 1));
        } else if (z9) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f13593h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f13593h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Paint paint = this.f13586a;
        if (i10 != paint.getAlpha()) {
            paint.setAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f13586a.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
