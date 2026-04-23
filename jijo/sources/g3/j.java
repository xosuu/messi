package g3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class j extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f13660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f13661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f13662c;

    public j(k kVar) {
        this.f13662c = kVar;
        Paint paint = new Paint(1);
        this.f13660a = paint;
        Paint paint2 = new Paint(1);
        this.f13661b = paint2;
        kVar.setLayerType(1, null);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(kVar.f13671u);
        paint2.setXfermode(k.E);
        if (kVar.isInEditMode()) {
            return;
        }
        paint.setShadowLayer(kVar.f13663a, kVar.f13664b, kVar.f13665d, kVar.f13666f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        k kVar = this.f13662c;
        RectF rectF = new RectF(Math.abs(kVar.f13664b) + kVar.f13663a, Math.abs(kVar.f13665d) + kVar.f13663a, kVar.f13669s, kVar.f13670t);
        int i10 = kVar.f13674x;
        canvas.drawRoundRect(rectF, i10, i10, this.f13660a);
        int i11 = kVar.f13674x;
        canvas.drawRoundRect(rectF, i11, i11, this.f13661b);
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
