package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.internal.ads.en1;
import d5.g;
import g4.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import o0.d0;
import o0.j0;
import o0.v0;
import x4.y;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f11719o0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Integer f11720j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public boolean f11721k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f11722l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public ImageView.ScaleType f11723m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Boolean f11724n0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(j5.a.a(context, attributeSet, R.attr.a6r, R.style.a3k), attributeSet, 0);
        Context context2 = getContext();
        TypedArray typedArrayE = y.e(context2, attributeSet, l4.a.f15208u, R.attr.a6r, R.style.a3k, new int[0]);
        if (typedArrayE.hasValue(2)) {
            setNavigationIconTint(typedArrayE.getColor(2, -1));
        }
        this.f11721k0 = typedArrayE.getBoolean(4, false);
        this.f11722l0 = typedArrayE.getBoolean(3, false);
        int i10 = typedArrayE.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f11719o0;
            if (i10 < scaleTypeArr.length) {
                this.f11723m0 = scaleTypeArr[i10];
            }
        }
        if (typedArrayE.hasValue(0)) {
            this.f11724n0 = Boolean.valueOf(typedArrayE.getBoolean(0, false));
        }
        typedArrayE.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            g gVar = new g();
            gVar.l(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            gVar.j(context2);
            WeakHashMap weakHashMap = v0.f16075a;
            gVar.k(j0.i(this));
            d0.q(this, gVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f11723m0;
    }

    public Integer getNavigationIconTint() {
        return this.f11720j0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        en1.H(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z9, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView2 = null;
        if (this.f11721k0 || this.f11722l0) {
            ArrayList arrayListD = y.d(this, getTitle());
            boolean zIsEmpty = arrayListD.isEmpty();
            b0.g gVar = y.f18483c;
            TextView textView = zIsEmpty ? null : (TextView) Collections.min(arrayListD, gVar);
            ArrayList arrayListD2 = y.d(this, getSubtitle());
            TextView textView2 = arrayListD2.isEmpty() ? null : (TextView) Collections.max(arrayListD2, gVar);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f11721k0 && textView != null) {
                    x(textView, pair);
                }
                if (this.f11722l0 && textView2 != null) {
                    x(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i14 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i14++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f11724n0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f11723m0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        en1.F(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z9) {
        Boolean bool = this.f11724n0;
        if (bool == null || bool.booleanValue() != z9) {
            this.f11724n0 = Boolean.valueOf(z9);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f11723m0 != scaleType) {
            this.f11723m0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f11720j0 != null) {
            drawable = z.I(drawable.mutate());
            h0.b.g(drawable, this.f11720j0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f11720j0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z9) {
        if (this.f11722l0 != z9) {
            this.f11722l0 = z9;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z9) {
        if (this.f11721k0 != z9) {
            this.f11721k0 = z9;
            requestLayout();
        }
    }

    public final void x(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i10, textView.getTop(), i11, textView.getBottom());
    }
}
