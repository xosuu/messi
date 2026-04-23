package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import d5.e;
import f.f;
import q.a;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f401q = {R.attr.colorBackground};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e f402s = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f404b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f405d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f406f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f407h;

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, xyz.easypro.httpcustom.R.attr.ed);
        Rect rect = new Rect();
        this.f405d = rect;
        this.f406f = new Rect();
        f fVar = new f(this);
        this.f407h = fVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f16376a, xyz.easypro.httpcustom.R.attr.ed, xyz.easypro.httpcustom.R.style.h8);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f401q);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(xyz.easypro.httpcustom.R.color.b5) : getResources().getColor(xyz.easypro.httpcustom.R.color.b4));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f403a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f404b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        e eVar = f402s;
        r.a aVar = new r.a(dimension, colorStateListValueOf);
        fVar.f12832b = aVar;
        ((CardView) fVar.f12833d).setBackgroundDrawable(aVar);
        CardView cardView = (CardView) fVar.f12833d;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        eVar.v(fVar, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((r.a) ((Drawable) this.f407h.f12832b)).f16481h;
    }

    public float getCardElevation() {
        return ((CardView) this.f407h.f12833d).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f405d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f405d.left;
    }

    public int getContentPaddingRight() {
        return this.f405d.right;
    }

    public int getContentPaddingTop() {
        return this.f405d.top;
    }

    public float getMaxCardElevation() {
        return ((r.a) ((Drawable) this.f407h.f12832b)).f16478e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f404b;
    }

    public float getRadius() {
        return ((r.a) ((Drawable) this.f407h.f12832b)).f16474a;
    }

    public boolean getUseCompatPadding() {
        return this.f403a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
        r.a aVar = (r.a) ((Drawable) this.f407h.f12832b);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.f16481h = colorStateListValueOf;
        aVar.f16475b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.f16481h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f407h.f12833d).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f402s.v(this.f407h, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z9) {
        if (z9 != this.f404b) {
            this.f404b = z9;
            e eVar = f402s;
            f fVar = this.f407h;
            eVar.v(fVar, ((r.a) ((Drawable) fVar.f12832b)).f16478e);
        }
    }

    public void setRadius(float f10) {
        r.a aVar = (r.a) ((Drawable) this.f407h.f12832b);
        if (f10 == aVar.f16474a) {
            return;
        }
        aVar.f16474a = f10;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f403a != z9) {
            this.f403a = z9;
            e eVar = f402s;
            f fVar = this.f407h;
            eVar.v(fVar, ((r.a) ((Drawable) fVar.f12832b)).f16478e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        r.a aVar = (r.a) ((Drawable) this.f407h.f12832b);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.f16481h = colorStateList;
        aVar.f16475b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.f16481h.getDefaultColor()));
        aVar.invalidateSelf();
    }
}
