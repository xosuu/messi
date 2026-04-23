package f5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.tp1;
import d5.g;
import d5.j;
import g4.a0;
import g4.z;
import java.util.WeakHashMap;
import o0.d0;
import o0.h0;
import o0.j0;
import o0.v0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends FrameLayout {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c f13092u = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f13093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13094b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13095d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13096f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13097h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f13098q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f13099s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f13100t;

    public d(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        Drawable drawableI;
        super(j5.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, l4.a.B);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = v0.f16075a;
            j0.s(this, dimensionPixelSize);
        }
        this.f13094b = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f13093a = j.b(context2, attributeSet, 0, 0).a();
        }
        this.f13095d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(tp1.g(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(en1.y(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f13096f = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f13097h = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f13098q = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f13092u);
        setFocusable(true);
        if (getBackground() == null) {
            int iP = a0.p(getBackgroundOverlayColorAlpha(), a0.i(this, R.attr.ho), a0.i(this, R.attr.h8));
            j jVar = this.f13093a;
            if (jVar != null) {
                int i10 = e.f13101a;
                g gVar = new g(jVar);
                gVar.l(ColorStateList.valueOf(iP));
                drawable = gVar;
            } else {
                Resources resources = getResources();
                int i11 = e.f13101a;
                float dimension = resources.getDimension(R.dimen.si);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iP);
                drawable = gradientDrawable;
            }
            if (this.f13099s != null) {
                drawableI = z.I(drawable);
                h0.b.h(drawableI, this.f13099s);
            } else {
                drawableI = z.I(drawable);
            }
            WeakHashMap weakHashMap2 = v0.f16075a;
            d0.q(this, drawableI);
        }
    }

    private void setBaseTransientBottomBar(e eVar) {
    }

    public float getActionTextColorAlpha() {
        return this.f13096f;
    }

    public int getAnimationMode() {
        return this.f13094b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f13095d;
    }

    public int getMaxInlineActionWidth() {
        return this.f13098q;
    }

    public int getMaxWidth() {
        return this.f13097h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = v0.f16075a;
        h0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        super.onLayout(z9, i10, i11, i12, i13);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int i12 = this.f13097h;
        if (i12 <= 0 || getMeasuredWidth() <= i12) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
    }

    public void setAnimationMode(int i10) {
        this.f13094b = i10;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f13099s != null) {
            drawable = z.I(drawable.mutate());
            h0.b.h(drawable, this.f13099s);
            h0.b.i(drawable, this.f13100t);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f13099s = colorStateList;
        if (getBackground() != null) {
            Drawable drawableI = z.I(getBackground().mutate());
            h0.b.h(drawableI, colorStateList);
            h0.b.i(drawableI, this.f13100t);
            if (drawableI != getBackground()) {
                super.setBackgroundDrawable(drawableI);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f13100t = mode;
        if (getBackground() != null) {
            Drawable drawableI = z.I(getBackground().mutate());
            h0.b.i(drawableI, mode);
            if (drawableI != getBackground()) {
                super.setBackgroundDrawable(drawableI);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f13092u);
        super.setOnClickListener(onClickListener);
    }
}
