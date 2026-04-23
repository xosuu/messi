package r;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f16475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f16476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f16477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16478e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f16481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuffColorFilter f16482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f16483j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16479f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f16480g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f16484k = PorterDuff.Mode.SRC_IN;

    public a(float f10, ColorStateList colorStateList) {
        this.f16474a = f10;
        Paint paint = new Paint(5);
        this.f16475b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f16481h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f16481h.getDefaultColor()));
        this.f16476c = new RectF();
        this.f16477d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f16476c;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f16477d;
        rect2.set(rect);
        if (this.f16479f) {
            rect2.inset((int) Math.ceil(b.a(this.f16478e, this.f16474a, this.f16480g)), (int) Math.ceil(b.b(this.f16478e, this.f16474a, this.f16480g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z9;
        Paint paint = this.f16475b;
        if (this.f16482i == null || paint.getColorFilter() != null) {
            z9 = false;
        } else {
            paint.setColorFilter(this.f16482i);
            z9 = true;
        }
        RectF rectF = this.f16476c;
        float f10 = this.f16474a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z9) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f16477d, this.f16474a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f16483j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f16481h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f16481h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f16475b;
        boolean z9 = colorForState != paint.getColor();
        if (z9) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f16483j;
        if (colorStateList2 == null || (mode = this.f16484k) == null) {
            return z9;
        }
        this.f16482i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        this.f16475b.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f16475b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f16483j = colorStateList;
        this.f16482i = a(colorStateList, this.f16484k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f16484k = mode;
        this.f16482i = a(this.f16483j, mode);
        invalidateSelf();
    }
}
