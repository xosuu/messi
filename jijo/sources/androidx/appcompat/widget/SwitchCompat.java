package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.l;
import com.google.android.gms.internal.ads.ur0;
import g4.z;
import java.util.WeakHashMap;
import l.b1;
import l.e4;
import l.l3;
import l.m3;
import l.n3;
import l.o3;
import l.r1;
import l.y;
import o0.g0;
import o0.v0;
import p7.q;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final l3 f321g0 = new l3(Float.class, "thumbPos", 0);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final int[] f322h0 = {R.attr.state_checked};
    public CharSequence A;
    public CharSequence B;
    public CharSequence C;
    public CharSequence D;
    public boolean E;
    public int F;
    public final int G;
    public float H;
    public float I;
    public final VelocityTracker J;
    public final int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public final TextPaint U;
    public final ColorStateList V;
    public StaticLayout W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f323a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public StaticLayout f324a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f325b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final i.a f326b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ObjectAnimator f327c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f328d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public y f329d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public n3 f330e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f331f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Rect f332f0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f333h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f334q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f335s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f336t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f337u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f338v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f339w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f340x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f341y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f342z;

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, xyz.easypro.httpcustom.R.attr.a2y);
        this.f325b = null;
        this.f328d = null;
        this.f331f = false;
        this.f333h = false;
        this.f335s = null;
        this.f336t = null;
        this.f337u = false;
        this.f338v = false;
        this.J = VelocityTracker.obtain();
        this.T = true;
        this.f332f0 = new Rect();
        o3.a(getContext(), this);
        TextPaint textPaint = new TextPaint(1);
        this.U = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = e.a.f12617x;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, xyz.easypro.httpcustom.R.attr.a2y, 0);
        ur0 ur0Var = new ur0(context, 5, typedArrayObtainStyledAttributes);
        v0.p(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, xyz.easypro.httpcustom.R.attr.a2y);
        Drawable drawableY = ur0Var.y(2);
        this.f323a = drawableY;
        if (drawableY != null) {
            drawableY.setCallback(this);
        }
        Drawable drawableY2 = ur0Var.y(11);
        this.f334q = drawableY2;
        if (drawableY2 != null) {
            drawableY2.setCallback(this);
        }
        setTextOnInternal(ur0Var.G(0));
        setTextOffInternal(ur0Var.G(1));
        this.E = ur0Var.u(3, true);
        this.f339w = ur0Var.x(8, 0);
        this.f340x = ur0Var.x(5, 0);
        this.f341y = ur0Var.x(6, 0);
        this.f342z = ur0Var.u(4, false);
        ColorStateList colorStateListV = ur0Var.v(9);
        if (colorStateListV != null) {
            this.f325b = colorStateListV;
            this.f331f = true;
        }
        PorterDuff.Mode modeC = r1.c(ur0Var.B(10, -1), null);
        if (this.f328d != modeC) {
            this.f328d = modeC;
            this.f333h = true;
        }
        if (this.f331f || this.f333h) {
            a();
        }
        ColorStateList colorStateListV2 = ur0Var.v(12);
        if (colorStateListV2 != null) {
            this.f335s = colorStateListV2;
            this.f337u = true;
        }
        PorterDuff.Mode modeC2 = r1.c(ur0Var.B(13, -1), null);
        if (this.f336t != modeC2) {
            this.f336t = modeC2;
            this.f338v = true;
        }
        if (this.f337u || this.f338v) {
            b();
        }
        int iD = ur0Var.D(7, 0);
        if (iD != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(iD, e.a.f12618y);
            ColorStateList colorStateList = (!typedArrayObtainStyledAttributes2.hasValue(3) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(3, 0)) == 0 || (colorStateList = d0.f.c(context, resourceId)) == null) ? typedArrayObtainStyledAttributes2.getColorStateList(3) : colorStateList;
            if (colorStateList != null) {
                this.V = colorStateList;
            } else {
                this.V = getTextColors();
            }
            int dimensionPixelSize = typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, 0);
            if (dimensionPixelSize != 0) {
                float f10 = dimensionPixelSize;
                if (f10 != textPaint.getTextSize()) {
                    textPaint.setTextSize(f10);
                    requestLayout();
                }
            }
            int i10 = typedArrayObtainStyledAttributes2.getInt(1, -1);
            int i11 = typedArrayObtainStyledAttributes2.getInt(2, -1);
            Typeface typeface = i10 != 1 ? i10 != 2 ? i10 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            if (i11 > 0) {
                Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i11) : Typeface.create(typeface, i11);
                setSwitchTypeface(typefaceDefaultFromStyle);
                int i12 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i11;
                textPaint.setFakeBoldText((i12 & 1) != 0);
                textPaint.setTextSkewX((2 & i12) != 0 ? -0.25f : 0.0f);
            } else {
                textPaint.setFakeBoldText(false);
                textPaint.setTextSkewX(0.0f);
                setSwitchTypeface(typeface);
            }
            if (typedArrayObtainStyledAttributes2.getBoolean(14, false)) {
                Context context2 = getContext();
                i.a aVar = new i.a();
                aVar.f14159a = context2.getResources().getConfiguration().locale;
                this.f326b0 = aVar;
            } else {
                this.f326b0 = null;
            }
            setTextOnInternal(this.A);
            setTextOffInternal(this.C);
            typedArrayObtainStyledAttributes2.recycle();
        }
        new b1(this).f(attributeSet, xyz.easypro.httpcustom.R.attr.a2y);
        ur0Var.M();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.G = viewConfiguration.getScaledTouchSlop();
        this.K = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().b(attributeSet, xyz.easypro.httpcustom.R.attr.a2y);
        refreshDrawableState();
        setChecked(isChecked());
    }

    private y getEmojiTextViewHelper() {
        if (this.f329d0 == null) {
            this.f329d0 = new y(this);
        }
        return this.f329d0;
    }

    private boolean getTargetCheckedState() {
        return this.L > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((e4.a(this) ? 1.0f - this.L : this.L) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f334q;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f332f0;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f323a;
        Rect rectB = drawable2 != null ? r1.b(drawable2) : r1.f14987c;
        return ((((this.M - this.O) - rect.left) - rect.right) - rectB.left) - rectB.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.C = charSequence;
        y emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodX = ((d5.e) emojiTextViewHelper.f15084b.f15701b).x(this.f326b0);
        if (transformationMethodX != null) {
            charSequence = transformationMethodX.getTransformation(charSequence, this);
        }
        this.D = charSequence;
        this.f324a0 = null;
        if (this.E) {
            d();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.A = charSequence;
        y emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod transformationMethodX = ((d5.e) emojiTextViewHelper.f15084b.f15701b).x(this.f326b0);
        if (transformationMethodX != null) {
            charSequence = transformationMethodX.getTransformation(charSequence, this);
        }
        this.B = charSequence;
        this.W = null;
        if (this.E) {
            d();
        }
    }

    public final void a() {
        Drawable drawable = this.f323a;
        if (drawable != null) {
            if (this.f331f || this.f333h) {
                Drawable drawableMutate = z.I(drawable).mutate();
                this.f323a = drawableMutate;
                if (this.f331f) {
                    h0.b.h(drawableMutate, this.f325b);
                }
                if (this.f333h) {
                    h0.b.i(this.f323a, this.f328d);
                }
                if (this.f323a.isStateful()) {
                    this.f323a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f334q;
        if (drawable != null) {
            if (this.f337u || this.f338v) {
                Drawable drawableMutate = z.I(drawable).mutate();
                this.f334q = drawableMutate;
                if (this.f337u) {
                    h0.b.h(drawableMutate, this.f335s);
                }
                if (this.f338v) {
                    h0.b.i(this.f334q, this.f336t);
                }
                if (this.f334q.isStateful()) {
                    this.f334q.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        setTextOnInternal(this.A);
        setTextOffInternal(this.C);
        requestLayout();
    }

    public final void d() {
        if (this.f330e0 == null && ((d5.e) this.f329d0.f15084b.f15701b).n() && l.f604j != null) {
            l lVarA = l.a();
            int iB = lVarA.b();
            if (iB == 3 || iB == 0) {
                n3 n3Var = new n3(this);
                this.f330e0 = n3Var;
                lVarA.g(n3Var);
            }
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        int i12 = this.P;
        int i13 = this.Q;
        int i14 = this.R;
        int i15 = this.S;
        int thumbOffset = getThumbOffset() + i12;
        Drawable drawable = this.f323a;
        Rect rectB = drawable != null ? r1.b(drawable) : r1.f14987c;
        Drawable drawable2 = this.f334q;
        Rect rect = this.f332f0;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i16 = rect.left;
            thumbOffset += i16;
            if (rectB != null) {
                int i17 = rectB.left;
                if (i17 > i16) {
                    i12 += i17 - i16;
                }
                int i18 = rectB.top;
                int i19 = rect.top;
                i10 = i18 > i19 ? (i18 - i19) + i13 : i13;
                int i20 = rectB.right;
                int i21 = rect.right;
                if (i20 > i21) {
                    i14 -= i20 - i21;
                }
                int i22 = rectB.bottom;
                int i23 = rect.bottom;
                if (i22 > i23) {
                    i11 = i15 - (i22 - i23);
                }
                this.f334q.setBounds(i12, i10, i14, i11);
            } else {
                i10 = i13;
            }
            i11 = i15;
            this.f334q.setBounds(i12, i10, i14, i11);
        }
        Drawable drawable3 = this.f323a;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i24 = thumbOffset - rect.left;
            int i25 = thumbOffset + this.O + rect.right;
            this.f323a.setBounds(i24, i13, i25, i15);
            Drawable background = getBackground();
            if (background != null) {
                h0.b.f(background, i24, i13, i25, i15);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.f323a;
        if (drawable != null) {
            h0.b.e(drawable, f10, f11);
        }
        Drawable drawable2 = this.f334q;
        if (drawable2 != null) {
            h0.b.e(drawable2, f10, f11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f323a;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f334q;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!e4.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f341y : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (e4.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.M;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f341y : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return z.G(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.E;
    }

    public boolean getSplitTrack() {
        return this.f342z;
    }

    public int getSwitchMinWidth() {
        return this.f340x;
    }

    public int getSwitchPadding() {
        return this.f341y;
    }

    public CharSequence getTextOff() {
        return this.C;
    }

    public CharSequence getTextOn() {
        return this.A;
    }

    public Drawable getThumbDrawable() {
        return this.f323a;
    }

    public final float getThumbPosition() {
        return this.L;
    }

    public int getThumbTextPadding() {
        return this.f339w;
    }

    public ColorStateList getThumbTintList() {
        return this.f325b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f328d;
    }

    public Drawable getTrackDrawable() {
        return this.f334q;
    }

    public ColorStateList getTrackTintList() {
        return this.f335s;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f336t;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f323a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f334q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f327c0;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f327c0.end();
        this.f327c0 = null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f322h0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f334q;
        Rect rect = this.f332f0;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i10 = this.Q;
        int i11 = this.S;
        int i12 = i10 + rect.top;
        int i13 = i11 - rect.bottom;
        Drawable drawable2 = this.f323a;
        if (drawable != null) {
            if (!this.f342z || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectB = r1.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectB.left;
                rect.right -= rectB.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        StaticLayout staticLayout = getTargetCheckedState() ? this.W : this.f324a0;
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.V;
            TextPaint textPaint = this.U;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i12 + i13) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.A : this.C;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z9, int i10, int i11, int i12, int i13) {
        int iMax;
        int width;
        int paddingLeft;
        int height;
        int paddingTop;
        super.onLayout(z9, i10, i11, i12, i13);
        int iMax2 = 0;
        if (this.f323a != null) {
            Drawable drawable = this.f334q;
            Rect rect = this.f332f0;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectB = r1.b(this.f323a);
            iMax = Math.max(0, rectB.left - rect.left);
            iMax2 = Math.max(0, rectB.right - rect.right);
        } else {
            iMax = 0;
        }
        if (e4.a(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.M + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.M) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int height2 = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i14 = this.N;
            int i15 = height2 - (i14 / 2);
            height = i14 + i15;
            paddingTop = i15;
        } else if (gravity != 80) {
            paddingTop = getPaddingTop();
            height = this.N + paddingTop;
        } else {
            height = getHeight() - getPaddingBottom();
            paddingTop = height - this.N;
        }
        this.P = paddingLeft;
        this.Q = paddingTop;
        this.S = height;
        this.R = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        int intrinsicWidth;
        int intrinsicHeight;
        int intrinsicHeight2 = 0;
        if (this.E) {
            StaticLayout staticLayout = this.W;
            TextPaint textPaint = this.U;
            if (staticLayout == null) {
                CharSequence charSequence = this.B;
                this.W = new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
            if (this.f324a0 == null) {
                CharSequence charSequence2 = this.D;
                this.f324a0 = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            }
        }
        Drawable drawable = this.f323a;
        Rect rect = this.f332f0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f323a.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f323a.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.O = Math.max(this.E ? (this.f339w * 2) + Math.max(this.W.getWidth(), this.f324a0.getWidth()) : 0, intrinsicWidth);
        Drawable drawable2 = this.f334q;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f334q.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f323a;
        if (drawable3 != null) {
            Rect rectB = r1.b(drawable3);
            iMax = Math.max(iMax, rectB.left);
            iMax2 = Math.max(iMax2, rectB.right);
        }
        int iMax3 = this.T ? Math.max(this.f340x, (this.O * 2) + iMax + iMax2) : this.f340x;
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.M = iMax3;
        this.N = iMax4;
        super.onMeasure(i10, i11);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.A : this.C;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0090  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z9) {
        super.setAllCaps(z9);
        getEmojiTextViewHelper().c(z9);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z9) {
        super.setChecked(z9);
        boolean zIsChecked = isChecked();
        if (zIsChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object string = this.A;
                if (string == null) {
                    string = getResources().getString(xyz.easypro.httpcustom.R.string.a2);
                }
                WeakHashMap weakHashMap = v0.f16075a;
                new o0.z(xyz.easypro.httpcustom.R.id.vc, 64, 30, 2).b(this, string);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object string2 = this.C;
            if (string2 == null) {
                string2 = getResources().getString(xyz.easypro.httpcustom.R.string.a1);
            }
            WeakHashMap weakHashMap2 = v0.f16075a;
            new o0.z(xyz.easypro.httpcustom.R.id.vc, 64, 30, 2).b(this, string2);
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = v0.f16075a;
            if (g0.c(this)) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f321g0, zIsChecked ? 1.0f : 0.0f);
                this.f327c0 = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(250L);
                m3.a(this.f327c0, true);
                this.f327c0.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.f327c0;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        setThumbPosition(zIsChecked ? 1.0f : 0.0f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(z.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z9) {
        getEmojiTextViewHelper().d(z9);
        setTextOnInternal(this.A);
        setTextOffInternal(this.C);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z9) {
        this.T = z9;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z9) {
        if (this.E != z9) {
            this.E = z9;
            requestLayout();
            if (z9) {
                d();
            }
        }
    }

    public void setSplitTrack(boolean z9) {
        this.f342z = z9;
        invalidate();
    }

    public void setSwitchMinWidth(int i10) {
        this.f340x = i10;
        requestLayout();
    }

    public void setSwitchPadding(int i10) {
        this.f341y = i10;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.U;
        if ((textPaint.getTypeface() == null || textPaint.getTypeface().equals(typeface)) && (textPaint.getTypeface() != null || typeface == null)) {
            return;
        }
        textPaint.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.C;
        if (string == null) {
            string = getResources().getString(xyz.easypro.httpcustom.R.string.a1);
        }
        WeakHashMap weakHashMap = v0.f16075a;
        new o0.z(xyz.easypro.httpcustom.R.id.vc, 64, 30, 2).b(this, string);
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (!isChecked() || Build.VERSION.SDK_INT < 30) {
            return;
        }
        Object string = this.A;
        if (string == null) {
            string = getResources().getString(xyz.easypro.httpcustom.R.string.a2);
        }
        WeakHashMap weakHashMap = v0.f16075a;
        new o0.z(xyz.easypro.httpcustom.R.id.vc, 64, 30, 2).b(this, string);
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f323a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f323a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f10) {
        this.L = f10;
        invalidate();
    }

    public void setThumbResource(int i10) {
        setThumbDrawable(q.g(getContext(), i10));
    }

    public void setThumbTextPadding(int i10) {
        this.f339w = i10;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f325b = colorStateList;
        this.f331f = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f328d = mode;
        this.f333h = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f334q;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f334q = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i10) {
        setTrackDrawable(q.g(getContext(), i10));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f335s = colorStateList;
        this.f337u = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f336t = mode;
        this.f338v = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f323a || drawable == this.f334q;
    }
}
