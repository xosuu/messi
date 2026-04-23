package com.github.clans.fab;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.sf;
import g3.b;
import g3.c;
import g3.d;
import g3.k;
import g3.l;
import g4.d0;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends ImageButton {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final PorterDuffXfermode f1776k0 = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    public String A;
    public View.OnClickListener B;
    public RippleDrawable C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public int I;
    public boolean J;
    public float K;
    public float L;
    public boolean M;
    public RectF N;
    public final Paint O;
    public final Paint P;
    public boolean Q;
    public long R;
    public float S;
    public long T;
    public double U;
    public boolean V;
    public final int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1777a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f1778a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1779b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f1780b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f1781c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1782d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f1783d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f1784e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1785f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f1786f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f1787g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f1788h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1789h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f1790i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final GestureDetector f1791j0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f1792q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1793s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f1794t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1795u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1796v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f1797w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f1798x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Animation f1799y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Animation f1800z;

    public static class ProgressSavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<ProgressSavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f1801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f1802b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f1803d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1804f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1805h;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f1806q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f1807s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f1808t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f1809u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f1810v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f1811w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public boolean f1812x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public boolean f1813y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f1814z;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeFloat(this.f1801a);
            parcel.writeFloat(this.f1802b);
            parcel.writeInt(this.f1808t ? 1 : 0);
            parcel.writeFloat(this.f1803d);
            parcel.writeInt(this.f1804f);
            parcel.writeInt(this.f1805h);
            parcel.writeInt(this.f1806q);
            parcel.writeInt(this.f1807s);
            parcel.writeInt(this.f1809u ? 1 : 0);
            parcel.writeInt(this.f1810v ? 1 : 0);
            parcel.writeInt(this.f1811w ? 1 : 0);
            parcel.writeInt(this.f1812x ? 1 : 0);
            parcel.writeInt(this.f1813y ? 1 : 0);
            parcel.writeInt(this.f1814z ? 1 : 0);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1785f = d0.e(getContext(), 4.0f);
        this.f1788h = d0.e(getContext(), 1.0f);
        this.f1792q = d0.e(getContext(), 3.0f);
        this.f1798x = d0.e(getContext(), 24.0f);
        this.G = d0.e(getContext(), 6.0f);
        this.K = -1.0f;
        this.L = -1.0f;
        this.N = new RectF();
        this.O = new Paint(1);
        this.P = new Paint(1);
        this.S = 195.0f;
        this.T = 0L;
        this.V = true;
        this.W = 16;
        this.f1789h0 = 100;
        this.f1791j0 = new GestureDetector(getContext(), new b(this, 0));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13677a, 0, 0);
        this.f1793s = typedArrayObtainStyledAttributes.getColor(9, -2473162);
        this.f1794t = typedArrayObtainStyledAttributes.getColor(10, -1617853);
        this.f1795u = typedArrayObtainStyledAttributes.getColor(8, -5592406);
        this.f1796v = typedArrayObtainStyledAttributes.getColor(11, -1711276033);
        this.f1779b = typedArrayObtainStyledAttributes.getBoolean(26, true);
        this.f1782d = typedArrayObtainStyledAttributes.getColor(21, 1711276032);
        this.f1785f = typedArrayObtainStyledAttributes.getDimensionPixelSize(22, this.f1785f);
        this.f1788h = typedArrayObtainStyledAttributes.getDimensionPixelSize(23, this.f1788h);
        this.f1792q = typedArrayObtainStyledAttributes.getDimensionPixelSize(24, this.f1792q);
        this.f1777a = typedArrayObtainStyledAttributes.getInt(27, 0);
        this.A = typedArrayObtainStyledAttributes.getString(14);
        this.f1786f0 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        this.H = typedArrayObtainStyledAttributes.getColor(17, -16738680);
        this.I = typedArrayObtainStyledAttributes.getColor(16, 1291845632);
        this.f1789h0 = typedArrayObtainStyledAttributes.getInt(19, this.f1789h0);
        this.f1790i0 = typedArrayObtainStyledAttributes.getBoolean(20, true);
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            this.f1783d0 = typedArrayObtainStyledAttributes.getInt(15, 0);
            this.f1787g0 = true;
        }
        if (typedArrayObtainStyledAttributes.hasValue(12)) {
            float dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(12, 0);
            if (isInEditMode()) {
                setElevation(dimensionPixelOffset);
            } else {
                setElevationCompat(dimensionPixelOffset);
            }
        }
        this.f1799y = AnimationUtils.loadAnimation(getContext(), typedArrayObtainStyledAttributes.getResourceId(25, R.anim.a4));
        this.f1800z = AnimationUtils.loadAnimation(getContext(), typedArrayObtainStyledAttributes.getResourceId(13, R.anim.a3));
        typedArrayObtainStyledAttributes.recycle();
        if (isInEditMode()) {
            if (this.f1786f0) {
                setIndeterminate(true);
            } else if (this.f1787g0) {
                j();
                k(this.f1783d0, false);
            }
        }
        setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCircleSize() {
        return getResources().getDimensionPixelSize(this.f1777a == 0 ? R.dimen.e4 : R.dimen.e3);
    }

    private int getShadowX() {
        return Math.abs(this.f1788h) + this.f1785f;
    }

    private int getShadowY() {
        return Math.abs(this.f1792q) + this.f1785f;
    }

    @TargetApi(16)
    private void setBackgroundCompat(Drawable drawable) {
        setBackground(drawable);
    }

    public final int b() {
        int circleSize = getCircleSize() + (f() ? getShadowY() * 2 : 0);
        return this.F ? circleSize + (this.G * 2) : circleSize;
    }

    public final int c() {
        int circleSize = getCircleSize() + (f() ? getShadowX() * 2 : 0);
        return this.F ? circleSize + (this.G * 2) : circleSize;
    }

    public final c d(int i10) {
        c cVar = new c(this, new OvalShape());
        cVar.getPaint().setColor(i10);
        return cVar;
    }

    public final RippleDrawable e() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, d(this.f1795u));
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, d(this.f1794t));
        stateListDrawable.addState(new int[0], d(this.f1793s));
        RippleDrawable rippleDrawable = new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{this.f1796v}), stateListDrawable, null);
        setOutlineProvider(new g3.a(this, 0));
        setClipToOutline(true);
        this.C = rippleDrawable;
        return rippleDrawable;
    }

    public final boolean f() {
        return !this.D && this.f1779b;
    }

    public final void g(boolean z9) {
        if (getVisibility() == 4) {
            return;
        }
        if (z9) {
            this.f1799y.cancel();
            startAnimation(this.f1800z);
        }
        super.setVisibility(4);
    }

    public int getButtonSize() {
        return this.f1777a;
    }

    public int getColorDisabled() {
        return this.f1795u;
    }

    public int getColorNormal() {
        return this.f1793s;
    }

    public int getColorPressed() {
        return this.f1794t;
    }

    public int getColorRipple() {
        return this.f1796v;
    }

    public Animation getHideAnimation() {
        return this.f1800z;
    }

    public Drawable getIconDrawable() {
        Drawable drawable = this.f1797w;
        return drawable != null ? drawable : new ColorDrawable(0);
    }

    public String getLabelText() {
        return this.A;
    }

    public k getLabelView() {
        return (k) getTag(R.id.j1);
    }

    public int getLabelVisibility() {
        k labelView = getLabelView();
        if (labelView != null) {
            return labelView.getVisibility();
        }
        return -1;
    }

    public synchronized int getMax() {
        return this.f1789h0;
    }

    public View.OnClickListener getOnClickListener() {
        return this.B;
    }

    public synchronized int getProgress() {
        return this.Q ? 0 : this.f1783d0;
    }

    public int getShadowColor() {
        return this.f1782d;
    }

    public int getShadowRadius() {
        return this.f1785f;
    }

    public int getShadowXOffset() {
        return this.f1788h;
    }

    public int getShadowYOffset() {
        return this.f1792q;
    }

    public Animation getShowAnimation() {
        return this.f1799y;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        RippleDrawable rippleDrawable = this.C;
        if (rippleDrawable instanceof StateListDrawable) {
            ((StateListDrawable) rippleDrawable).setState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed});
            return;
        }
        rippleDrawable.setState(new int[]{android.R.attr.state_enabled, android.R.attr.state_pressed});
        rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        rippleDrawable.setVisible(true, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        RippleDrawable rippleDrawable = this.C;
        if (rippleDrawable instanceof StateListDrawable) {
            ((StateListDrawable) rippleDrawable).setState(new int[]{android.R.attr.state_enabled});
            return;
        }
        rippleDrawable.setState(new int[]{android.R.attr.state_enabled});
        rippleDrawable.setHotspot(getMeasuredWidth() / 2, getMeasuredHeight() / 2);
        rippleDrawable.setVisible(true, true);
    }

    public final void j() {
        if (this.M) {
            return;
        }
        if (this.K == -1.0f) {
            this.K = getX();
        }
        if (this.L == -1.0f) {
            this.L = getY();
        }
        this.M = true;
    }

    public final synchronized void k(int i10, boolean z9) {
        if (this.Q) {
            return;
        }
        this.f1783d0 = i10;
        this.f1784e0 = z9;
        if (!this.M) {
            this.f1787g0 = true;
            return;
        }
        this.F = true;
        this.J = true;
        l();
        j();
        n();
        if (i10 < 0) {
            i10 = 0;
        } else {
            int i11 = this.f1789h0;
            if (i10 > i11) {
                i10 = i11;
            }
        }
        float f10 = i10;
        if (f10 == this.f1781c0) {
            return;
        }
        int i12 = this.f1789h0;
        this.f1781c0 = i12 > 0 ? (f10 / i12) * 360.0f : 0.0f;
        this.R = SystemClock.uptimeMillis();
        if (!z9) {
            this.f1780b0 = this.f1781c0;
        }
        invalidate();
    }

    public final void l() {
        int shadowX = f() ? getShadowX() : 0;
        int shadowY = f() ? getShadowY() : 0;
        int i10 = this.G;
        this.N = new RectF((i10 / 2) + shadowX, (i10 / 2) + shadowY, (c() - shadowX) - (this.G / 2), (b() - shadowY) - (this.G / 2));
    }

    public final void m(boolean z9) {
        if (getVisibility() == 4) {
            if (z9) {
                this.f1800z.cancel();
                startAnimation(this.f1799y);
            }
            super.setVisibility(0);
        }
    }

    public final void n() {
        LayerDrawable layerDrawable = f() ? new LayerDrawable(new Drawable[]{new d(this), e(), getIconDrawable()}) : new LayerDrawable(new Drawable[]{e(), getIconDrawable()});
        int iMax = getIconDrawable() != null ? Math.max(getIconDrawable().getIntrinsicWidth(), getIconDrawable().getIntrinsicHeight()) : -1;
        int circleSize = getCircleSize();
        if (iMax <= 0) {
            iMax = this.f1798x;
        }
        int i10 = (circleSize - iMax) / 2;
        int iAbs = f() ? Math.abs(this.f1788h) + this.f1785f : 0;
        int iAbs2 = f() ? this.f1785f + Math.abs(this.f1792q) : 0;
        if (this.F) {
            int i11 = this.G;
            iAbs += i11;
            iAbs2 += i11;
        }
        int i12 = iAbs + i10;
        int i13 = iAbs2 + i10;
        layerDrawable.setLayerInset(f() ? 2 : 1, i12, i13, i12, i13);
        setBackgroundCompat(layerDrawable);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z9;
        float f10;
        float f11;
        super.onDraw(canvas);
        if (this.F) {
            if (this.f1790i0) {
                canvas.drawArc(this.N, 360.0f, 360.0f, false, this.O);
            }
            boolean z10 = this.Q;
            Paint paint = this.P;
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis() - this.R;
                float f12 = (jUptimeMillis * this.S) / 1000.0f;
                long j10 = this.T;
                int i10 = this.W;
                if (j10 >= 200) {
                    double d10 = this.U + jUptimeMillis;
                    this.U = d10;
                    if (d10 > 500.0d) {
                        this.U = d10 - 500.0d;
                        this.T = 0L;
                        this.V = true ^ this.V;
                    }
                    float fCos = (((float) Math.cos(((this.U / 500.0d) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    float f13 = 270 - i10;
                    if (this.V) {
                        this.f1778a0 = fCos * f13;
                    } else {
                        float f14 = (1.0f - fCos) * f13;
                        this.f1780b0 = (this.f1778a0 - f14) + this.f1780b0;
                        this.f1778a0 = f14;
                    }
                } else {
                    this.T = j10 + jUptimeMillis;
                }
                float f15 = this.f1780b0 + f12;
                this.f1780b0 = f15;
                if (f15 > 360.0f) {
                    this.f1780b0 = f15 - 360.0f;
                }
                this.R = SystemClock.uptimeMillis();
                float f16 = this.f1780b0 - 90.0f;
                float f17 = i10 + this.f1778a0;
                if (isInEditMode()) {
                    f10 = 0.0f;
                    f11 = 135.0f;
                } else {
                    f10 = f16;
                    f11 = f17;
                }
                canvas.drawArc(this.N, f10, f11, false, paint);
            } else {
                if (this.f1780b0 != this.f1781c0) {
                    float fUptimeMillis = ((SystemClock.uptimeMillis() - this.R) / 1000.0f) * this.S;
                    float f18 = this.f1780b0;
                    float f19 = this.f1781c0;
                    if (f18 > f19) {
                        this.f1780b0 = Math.max(f18 - fUptimeMillis, f19);
                    } else {
                        this.f1780b0 = Math.min(f18 + fUptimeMillis, f19);
                    }
                    this.R = SystemClock.uptimeMillis();
                    z9 = true;
                } else {
                    z9 = false;
                }
                canvas.drawArc(this.N, -90.0f, this.f1780b0, false, paint);
                if (!z9) {
                    return;
                }
            }
            invalidate();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(c(), b());
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ProgressSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ProgressSavedState progressSavedState = (ProgressSavedState) parcelable;
        super.onRestoreInstanceState(progressSavedState.getSuperState());
        this.f1780b0 = progressSavedState.f1801a;
        this.f1781c0 = progressSavedState.f1802b;
        this.S = progressSavedState.f1803d;
        this.G = progressSavedState.f1805h;
        this.H = progressSavedState.f1806q;
        this.I = progressSavedState.f1807s;
        this.f1786f0 = progressSavedState.f1811w;
        this.f1787g0 = progressSavedState.f1812x;
        this.f1783d0 = progressSavedState.f1804f;
        this.f1784e0 = progressSavedState.f1813y;
        this.f1790i0 = progressSavedState.f1814z;
        this.R = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ProgressSavedState progressSavedState = new ProgressSavedState(super.onSaveInstanceState());
        progressSavedState.f1801a = this.f1780b0;
        progressSavedState.f1802b = this.f1781c0;
        progressSavedState.f1803d = this.S;
        progressSavedState.f1805h = this.G;
        progressSavedState.f1806q = this.H;
        progressSavedState.f1807s = this.I;
        boolean z9 = this.Q;
        progressSavedState.f1811w = z9;
        progressSavedState.f1812x = this.F && this.f1783d0 > 0 && !z9;
        progressSavedState.f1804f = this.f1783d0;
        progressSavedState.f1813y = this.f1784e0;
        progressSavedState.f1814z = this.f1790i0;
        return progressSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        float x9;
        float y8;
        j();
        if (this.f1786f0) {
            setIndeterminate(true);
            this.f1786f0 = false;
        } else if (this.f1787g0) {
            k(this.f1783d0, this.f1784e0);
            this.f1787g0 = false;
        } else if (this.J) {
            if (this.F) {
                x9 = this.K > getX() ? getX() + this.G : getX() - this.G;
                y8 = this.L > getY() ? getY() + this.G : getY() - this.G;
            } else {
                x9 = this.K;
                y8 = this.L;
            }
            setX(x9);
            setY(y8);
            this.J = false;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        l();
        Paint paint = this.O;
        paint.setColor(this.I);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.G);
        Paint paint2 = this.P;
        paint2.setColor(this.H);
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.G);
        n();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.B != null && isEnabled()) {
            k kVar = (k) getTag(R.id.j1);
            if (kVar == null) {
                return super.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action == 1 || action == 3) {
                kVar.d();
                i();
            }
            this.f1791j0.onTouchEvent(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setButtonSize(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("Use @FabSize constants only!");
        }
        if (this.f1777a != i10) {
            this.f1777a = i10;
            n();
        }
    }

    public void setColorDisabled(int i10) {
        if (i10 != this.f1795u) {
            this.f1795u = i10;
            n();
        }
    }

    public void setColorDisabledResId(int i10) {
        setColorDisabled(getResources().getColor(i10));
    }

    public void setColorNormal(int i10) {
        if (this.f1793s != i10) {
            this.f1793s = i10;
            n();
        }
    }

    public void setColorNormalResId(int i10) {
        setColorNormal(getResources().getColor(i10));
    }

    public void setColorPressed(int i10) {
        if (i10 != this.f1794t) {
            this.f1794t = i10;
            n();
        }
    }

    public void setColorPressedResId(int i10) {
        setColorPressed(getResources().getColor(i10));
    }

    public void setColorRipple(int i10) {
        if (i10 != this.f1796v) {
            this.f1796v = i10;
            n();
        }
    }

    public void setColorRippleResId(int i10) {
        setColorRipple(getResources().getColor(i10));
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        if (f10 > 0.0f) {
            super.setElevation(f10);
            if (!isInEditMode()) {
                this.D = true;
                this.f1779b = false;
            }
            n();
        }
    }

    @TargetApi(sf.zzm)
    public void setElevationCompat(float f10) {
        this.f1782d = 637534208;
        float f11 = f10 / 2.0f;
        this.f1785f = Math.round(f11);
        this.f1788h = 0;
        if (this.f1777a == 0) {
            f11 = f10;
        }
        this.f1792q = Math.round(f11);
        super.setElevation(f10);
        this.E = true;
        this.f1779b = false;
        n();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z9) {
        super.setEnabled(z9);
        k kVar = (k) getTag(R.id.j1);
        if (kVar != null) {
            kVar.setEnabled(z9);
        }
    }

    public void setHideAnimation(Animation animation) {
        this.f1800z = animation;
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f1797w != drawable) {
            this.f1797w = drawable;
            n();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        Drawable drawable = getResources().getDrawable(i10);
        if (this.f1797w != drawable) {
            this.f1797w = drawable;
            n();
        }
    }

    public synchronized void setIndeterminate(boolean z9) {
        if (!z9) {
            try {
                this.f1780b0 = 0.0f;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.F = z9;
        this.J = true;
        this.Q = z9;
        this.R = SystemClock.uptimeMillis();
        l();
        n();
    }

    public void setLabelText(String str) {
        this.A = str;
        k labelView = getLabelView();
        if (labelView != null) {
            labelView.setText(str);
        }
    }

    public void setLabelTextColor(int i10) {
        getLabelView().setTextColor(i10);
    }

    public void setLabelVisibility(int i10) {
        k labelView = getLabelView();
        if (labelView != null) {
            labelView.setVisibility(i10);
            labelView.setHandleVisibilityChanges(i10 == 0);
        }
    }

    @Override // android.view.View
    @TargetApi(sf.zzm)
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && this.E) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin += getShadowX();
            marginLayoutParams.topMargin += getShadowY();
            marginLayoutParams.rightMargin += getShadowX();
            marginLayoutParams.bottomMargin += getShadowY();
        }
        super.setLayoutParams(layoutParams);
    }

    public synchronized void setMax(int i10) {
        this.f1789h0 = i10;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.B = onClickListener;
        View view = (View) getTag(R.id.j1);
        if (view != null) {
            view.setOnClickListener(new f.b(3, this));
        }
    }

    public void setShadowColor(int i10) {
        if (this.f1782d != i10) {
            this.f1782d = i10;
            n();
        }
    }

    public void setShadowColorResource(int i10) {
        int color = getResources().getColor(i10);
        if (this.f1782d != color) {
            this.f1782d = color;
            n();
        }
    }

    public void setShadowRadius(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f1785f != dimensionPixelSize) {
            this.f1785f = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShadowXOffset(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f1788h != dimensionPixelSize) {
            this.f1788h = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShadowYOffset(int i10) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i10);
        if (this.f1792q != dimensionPixelSize) {
            this.f1792q = dimensionPixelSize;
            requestLayout();
            n();
        }
    }

    public void setShowAnimation(Animation animation) {
        this.f1799y = animation;
    }

    public synchronized void setShowProgressBackground(boolean z9) {
        this.f1790i0 = z9;
    }

    public void setShowShadow(boolean z9) {
        if (this.f1779b != z9) {
            this.f1779b = z9;
            n();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        k kVar = (k) getTag(R.id.j1);
        if (kVar != null) {
            kVar.setVisibility(i10);
        }
    }

    public void setLabelTextColor(ColorStateList colorStateList) {
        getLabelView().setTextColor(colorStateList);
    }

    public void setShadowRadius(float f10) {
        this.f1785f = d0.e(getContext(), f10);
        requestLayout();
        n();
    }

    public void setShadowXOffset(float f10) {
        this.f1788h = d0.e(getContext(), f10);
        requestLayout();
        n();
    }

    public void setShadowYOffset(float f10) {
        this.f1792q = d0.e(getContext(), f10);
        requestLayout();
        n();
    }
}
