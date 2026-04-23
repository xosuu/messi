package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.customview.view.AbsSavedState;
import b5.d;
import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import com.google.android.gms.internal.ads.tp1;
import d0.f;
import d5.j;
import d5.u;
import g4.c;
import g4.z;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.r;
import o0.e0;
import o0.v0;
import p7.q;
import r4.b;
import s0.o;
import x4.y;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends r implements Checkable, u {
    public static final int[] C = {R.attr.state_checkable};
    public static final int[] D = {R.attr.state_checked};
    public boolean A;
    public int B;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f11801f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashSet f11802h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r4.a f11803q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f11804s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f11805t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f11806u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f11807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f11808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f11809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f11810y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f11811z;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11812d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            this.f11812d = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f570a, i10);
            parcel.writeInt(this.f11812d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(j5.a.a(context, attributeSet, xyz.easypro.httpcustom.R.attr.ts, xyz.easypro.httpcustom.R.style.a0v), attributeSet, xyz.easypro.httpcustom.R.attr.ts);
        this.f11802h = new LinkedHashSet();
        this.f11811z = false;
        this.A = false;
        Context context2 = getContext();
        TypedArray typedArrayE = y.e(context2, attributeSet, l4.a.f15199l, xyz.easypro.httpcustom.R.attr.ts, xyz.easypro.httpcustom.R.style.a0v, new int[0]);
        this.f11810y = typedArrayE.getDimensionPixelSize(12, 0);
        int i10 = typedArrayE.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f11804s = en1.y(i10, mode);
        this.f11805t = tp1.g(getContext(), typedArrayE, 14);
        this.f11806u = tp1.i(getContext(), typedArrayE, 10);
        this.B = typedArrayE.getInteger(11, 1);
        this.f11807v = typedArrayE.getDimensionPixelSize(13, 0);
        b bVar = new b(this, j.b(context2, attributeSet, xyz.easypro.httpcustom.R.attr.ts, xyz.easypro.httpcustom.R.style.a0v).a());
        this.f11801f = bVar;
        bVar.f16513c = typedArrayE.getDimensionPixelOffset(1, 0);
        bVar.f16514d = typedArrayE.getDimensionPixelOffset(2, 0);
        bVar.f16515e = typedArrayE.getDimensionPixelOffset(3, 0);
        bVar.f16516f = typedArrayE.getDimensionPixelOffset(4, 0);
        if (typedArrayE.hasValue(8)) {
            int dimensionPixelSize = typedArrayE.getDimensionPixelSize(8, -1);
            bVar.f16517g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            c cVarE = bVar.f16512b.e();
            cVarE.f13700e = new d5.a(f10);
            cVarE.f13701f = new d5.a(f10);
            cVarE.f13702g = new d5.a(f10);
            cVarE.f13703h = new d5.a(f10);
            bVar.c(cVarE.a());
            bVar.f16526p = true;
        }
        bVar.f16518h = typedArrayE.getDimensionPixelSize(20, 0);
        bVar.f16519i = en1.y(typedArrayE.getInt(7, -1), mode);
        bVar.f16520j = tp1.g(getContext(), typedArrayE, 6);
        bVar.f16521k = tp1.g(getContext(), typedArrayE, 19);
        bVar.f16522l = tp1.g(getContext(), typedArrayE, 16);
        bVar.f16527q = typedArrayE.getBoolean(5, false);
        bVar.f16530t = typedArrayE.getDimensionPixelSize(9, 0);
        bVar.f16528r = typedArrayE.getBoolean(21, true);
        WeakHashMap weakHashMap = v0.f16075a;
        int iF = e0.f(this);
        int paddingTop = getPaddingTop();
        int iE = e0.e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayE.hasValue(0)) {
            bVar.f16525o = true;
            setSupportBackgroundTintList(bVar.f16520j);
            setSupportBackgroundTintMode(bVar.f16519i);
        } else {
            bVar.e();
        }
        e0.k(this, iF + bVar.f16513c, paddingTop + bVar.f16515e, iE + bVar.f16514d, paddingBottom + bVar.f16516f);
        typedArrayE.recycle();
        setCompoundDrawablePadding(this.f11810y);
        d(this.f11806u != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        b bVar = this.f11801f;
        return bVar != null && bVar.f16527q;
    }

    public final boolean b() {
        b bVar = this.f11801f;
        return (bVar == null || bVar.f16525o) ? false : true;
    }

    public final void c() {
        int i10 = this.B;
        boolean z9 = true;
        if (i10 != 1 && i10 != 2) {
            z9 = false;
        }
        if (z9) {
            o.e(this, this.f11806u, null, null, null);
            return;
        }
        if (i10 == 3 || i10 == 4) {
            o.e(this, null, null, this.f11806u, null);
        } else if (i10 == 16 || i10 == 32) {
            o.e(this, null, this.f11806u, null, null);
        }
    }

    public final void d(boolean z9) {
        Drawable drawable = this.f11806u;
        if (drawable != null) {
            Drawable drawableMutate = z.I(drawable).mutate();
            this.f11806u = drawableMutate;
            h0.b.h(drawableMutate, this.f11805t);
            PorterDuff.Mode mode = this.f11804s;
            if (mode != null) {
                h0.b.i(this.f11806u, mode);
            }
            int intrinsicWidth = this.f11807v;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f11806u.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f11807v;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f11806u.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f11806u;
            int i10 = this.f11808w;
            int i11 = this.f11809x;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f11806u.setVisible(true, z9);
        }
        if (z9) {
            c();
            return;
        }
        Drawable[] drawableArrA = o.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        int i12 = this.B;
        if (((i12 == 1 || i12 == 2) && drawable3 != this.f11806u) || (((i12 == 3 || i12 == 4) && drawable5 != this.f11806u) || ((i12 == 16 || i12 == 32) && drawable4 != this.f11806u))) {
            c();
        }
    }

    public final void e(int i10, int i11) {
        if (this.f11806u == null || getLayout() == null) {
            return;
        }
        int i12 = this.B;
        if (!(i12 == 1 || i12 == 2) && i12 != 3 && i12 != 4) {
            if (i12 == 16 || i12 == 32) {
                this.f11808w = 0;
                if (i12 == 16) {
                    this.f11809x = 0;
                    d(false);
                    return;
                }
                int intrinsicHeight = this.f11807v;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f11806u.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f11810y) - getPaddingBottom()) / 2);
                if (this.f11809x != iMax) {
                    this.f11809x = iMax;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f11809x = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i13 = this.B;
        if (i13 == 1 || i13 == 3 || ((i13 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i13 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f11808w = 0;
            d(false);
            return;
        }
        int intrinsicWidth = this.f11807v;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f11806u.getIntrinsicWidth();
        }
        int textLayoutWidth = i10 - getTextLayoutWidth();
        WeakHashMap weakHashMap = v0.f16075a;
        int iE = (((textLayoutWidth - e0.e(this)) - intrinsicWidth) - this.f11810y) - e0.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iE /= 2;
        }
        if ((e0.d(this) == 1) != (this.B == 4)) {
            iE = -iE;
        }
        if (this.f11808w != iE) {
            this.f11808w = iE;
            d(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f11801f.f16517g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f11806u;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.f11810y;
    }

    public int getIconSize() {
        return this.f11807v;
    }

    public ColorStateList getIconTint() {
        return this.f11805t;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f11804s;
    }

    public int getInsetBottom() {
        return this.f11801f.f16516f;
    }

    public int getInsetTop() {
        return this.f11801f.f16515e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f11801f.f16522l;
        }
        return null;
    }

    public j getShapeAppearanceModel() {
        if (b()) {
            return this.f11801f.f16512b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f11801f.f16521k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f11801f.f16518h;
        }
        return 0;
    }

    @Override // l.r
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f11801f.f16520j : super.getSupportBackgroundTintList();
    }

    @Override // l.r
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f11801f.f16519i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f11811z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            en1.I(this, this.f11801f.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (a()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // l.r, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // l.r, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.r, android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        b bVar;
        super.onLayout(z9, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (bVar = this.f11801f) != null) {
            int i14 = i13 - i11;
            int i15 = i12 - i10;
            Drawable drawable = bVar.f16523m;
            if (drawable != null) {
                drawable.setBounds(bVar.f16513c, bVar.f16515e, i15 - bVar.f16514d, i14 - bVar.f16516f);
            }
        }
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f570a);
        setChecked(savedState.f11812d);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11812d = this.f11811z;
        return savedState;
    }

    @Override // l.r, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f11801f.f16528r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f11806u != null) {
            if (this.f11806u.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (!b()) {
            super.setBackgroundColor(i10);
            return;
        }
        b bVar = this.f11801f;
        if (bVar.b(false) != null) {
            bVar.b(false).setTint(i10);
        }
    }

    @Override // l.r, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        b bVar = this.f11801f;
        bVar.f16525o = true;
        ColorStateList colorStateList = bVar.f16520j;
        MaterialButton materialButton = bVar.f16511a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(bVar.f16519i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.r, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? q.g(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z9) {
        if (b()) {
            this.f11801f.f16527q = z9;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z9) {
        if (a() && isEnabled() && this.f11811z != z9) {
            this.f11811z = z9;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z10 = this.f11811z;
                if (!materialButtonToggleGroup.f11819q) {
                    materialButtonToggleGroup.b(getId(), z10);
                }
            }
            if (this.A) {
                return;
            }
            this.A = true;
            Iterator it = this.f11802h.iterator();
            if (it.hasNext()) {
                fb1.t(it.next());
                throw null;
            }
            this.A = false;
        }
    }

    public void setCornerRadius(int i10) {
        if (b()) {
            b bVar = this.f11801f;
            if (bVar.f16526p && bVar.f16517g == i10) {
                return;
            }
            bVar.f16517g = i10;
            bVar.f16526p = true;
            float f10 = i10;
            c cVarE = bVar.f16512b.e();
            cVarE.f13700e = new d5.a(f10);
            cVarE.f13701f = new d5.a(f10);
            cVarE.f13702g = new d5.a(f10);
            cVarE.f13703h = new d5.a(f10);
            bVar.c(cVarE.a());
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (b()) {
            this.f11801f.b(false).k(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f11806u != drawable) {
            this.f11806u = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.B != i10) {
            this.B = i10;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f11810y != i10) {
            this.f11810y = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? q.g(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f11807v != i10) {
            this.f11807v = i10;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f11805t != colorStateList) {
            this.f11805t = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f11804s != mode) {
            this.f11804s = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(f.c(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        b bVar = this.f11801f;
        bVar.d(bVar.f16515e, i10);
    }

    public void setInsetTop(int i10) {
        b bVar = this.f11801f;
        bVar.d(i10, bVar.f16516f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(r4.a aVar) {
        this.f11803q = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        r4.a aVar = this.f11803q;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((k.q) aVar).f14587b).invalidate();
        }
        super.setPressed(z9);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            b bVar = this.f11801f;
            if (bVar.f16522l != colorStateList) {
                bVar.f16522l = colorStateList;
                boolean z9 = b.f16509u;
                MaterialButton materialButton = bVar.f16511a;
                if (z9 && (materialButton.getBackground() instanceof RippleDrawable)) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(d.b(colorStateList));
                } else {
                    if (z9 || !(materialButton.getBackground() instanceof b5.b)) {
                        return;
                    }
                    ((b5.b) materialButton.getBackground()).setTintList(d.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i10) {
        if (b()) {
            setRippleColor(f.c(getContext(), i10));
        }
    }

    @Override // d5.u
    public void setShapeAppearanceModel(j jVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f11801f.c(jVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z9) {
        if (b()) {
            b bVar = this.f11801f;
            bVar.f16524n = z9;
            bVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            b bVar = this.f11801f;
            if (bVar.f16521k != colorStateList) {
                bVar.f16521k = colorStateList;
                bVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i10) {
        if (b()) {
            setStrokeColor(f.c(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (b()) {
            b bVar = this.f11801f;
            if (bVar.f16518h != i10) {
                bVar.f16518h = i10;
                bVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // l.r
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        b bVar = this.f11801f;
        if (bVar.f16520j != colorStateList) {
            bVar.f16520j = colorStateList;
            if (bVar.b(false) != null) {
                h0.b.h(bVar.b(false), bVar.f16520j);
            }
        }
    }

    @Override // l.r
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        b bVar = this.f11801f;
        if (bVar.f16519i != mode) {
            bVar.f16519i = mode;
            if (bVar.b(false) == null || bVar.f16519i == null) {
                return;
            }
            h0.b.i(bVar.b(false), bVar.f16519i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z9) {
        this.f11801f.f16528r = z9;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f11811z);
    }
}
