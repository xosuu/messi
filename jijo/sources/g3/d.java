package g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import com.github.clans.fab.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class d extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f13642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f13643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButton f13645d;

    public d(FloatingActionButton floatingActionButton) {
        this.f13645d = floatingActionButton;
        Paint paint = new Paint(1);
        this.f13642a = paint;
        Paint paint2 = new Paint(1);
        this.f13643b = paint2;
        floatingActionButton.setLayerType(1, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(floatingActionButton.f1793s);
        paint2.setXfermode(FloatingActionButton.f1776k0);
        if (!floatingActionButton.isInEditMode()) {
            paint.setShadowLayer(floatingActionButton.f1785f, floatingActionButton.f1788h, floatingActionButton.f1792q, floatingActionButton.f1782d);
        }
        float circleSize = floatingActionButton.getCircleSize() / 2;
        this.f13644c = circleSize;
        if (floatingActionButton.F && floatingActionButton.f1790i0) {
            this.f13644c = circleSize + floatingActionButton.G;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        PorterDuffXfermode porterDuffXfermode = FloatingActionButton.f1776k0;
        FloatingActionButton floatingActionButton = this.f13645d;
        canvas.drawCircle(floatingActionButton.getMeasuredWidth() / 2, floatingActionButton.getMeasuredHeight() / 2, this.f13644c, this.f13642a);
        canvas.drawCircle(floatingActionButton.getMeasuredWidth() / 2, floatingActionButton.getMeasuredHeight() / 2, this.f13644c, this.f13643b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
