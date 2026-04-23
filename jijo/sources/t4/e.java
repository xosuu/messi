package t4;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.en1;
import com.google.android.material.chip.Chip;
import d5.f;
import d5.g;
import d5.l;
import g4.z;
import h0.i;
import h0.j;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import x4.v;
import x4.w;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g implements Drawable.Callback, v {
    public static final int[] S0 = {R.attr.state_enabled};
    public static final ShapeDrawable T0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public int C0;
    public boolean D0;
    public int E0;
    public int F0;
    public ColorFilter G0;
    public PorterDuffColorFilter H0;
    public ColorStateList I0;
    public ColorStateList J;
    public PorterDuff.Mode J0;
    public ColorStateList K;
    public int[] K0;
    public float L;
    public boolean L0;
    public float M;
    public ColorStateList M0;
    public ColorStateList N;
    public WeakReference N0;
    public float O;
    public TextUtils.TruncateAt O0;
    public ColorStateList P;
    public boolean P0;
    public CharSequence Q;
    public int Q0;
    public boolean R;
    public boolean R0;
    public Drawable S;
    public ColorStateList T;
    public float U;
    public boolean V;
    public boolean W;
    public Drawable X;
    public RippleDrawable Y;
    public ColorStateList Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f16858a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public SpannableStringBuilder f16859b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f16860c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f16861d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Drawable f16862e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorStateList f16863f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public m4.b f16864g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public m4.b f16865h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f16866i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f16867j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f16868k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f16869l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f16870m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f16871n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f16872o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public float f16873p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Context f16874q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Paint f16875r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final Paint.FontMetrics f16876s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final RectF f16877t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final PointF f16878u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Path f16879v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final w f16880w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f16881x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f16882y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f16883z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, xyz.easypro.httpcustom.R.attr.fm, xyz.easypro.httpcustom.R.style.a19);
        this.M = -1.0f;
        this.f16875r0 = new Paint(1);
        this.f16876s0 = new Paint.FontMetrics();
        this.f16877t0 = new RectF();
        this.f16878u0 = new PointF();
        this.f16879v0 = new Path();
        this.F0 = 255;
        this.J0 = PorterDuff.Mode.SRC_IN;
        this.N0 = new WeakReference(null);
        j(context);
        this.f16874q0 = context;
        w wVar = new w(this);
        this.f16880w0 = wVar;
        this.Q = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        wVar.f18475a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = S0;
        setState(iArr);
        if (!Arrays.equals(this.K0, iArr)) {
            this.K0 = iArr;
            if (U()) {
                x(getState(), iArr);
            }
        }
        this.P0 = true;
        T0.setTint(-1);
    }

    public static void V(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean u(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean v(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f16863f0 != colorStateList) {
            this.f16863f0 = colorStateList;
            if (this.f16861d0 && (drawable = this.f16862e0) != null && this.f16860c0) {
                h0.b.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(boolean z9) {
        if (this.f16861d0 != z9) {
            boolean zS = S();
            this.f16861d0 = z9;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    p(this.f16862e0);
                } else {
                    V(this.f16862e0);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void C(float f10) {
        if (this.M != f10) {
            this.M = f10;
            g4.c cVarE = this.f12396a.f12375a.e();
            cVarE.f13700e = new d5.a(f10);
            cVarE.f13701f = new d5.a(f10);
            cVarE.f13702g = new d5.a(f10);
            cVarE.f13703h = new d5.a(f10);
            setShapeAppearanceModel(cVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void D(Drawable drawable) {
        ?? r02;
        Object obj = this.S;
        if (obj != null) {
            boolean z9 = obj instanceof i;
            r02 = obj;
            if (z9) {
                r02 = ((j) ((i) obj)).f13921q;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fR = r();
            this.S = drawable != null ? z.I(drawable).mutate() : null;
            float fR2 = r();
            V(r02);
            if (T()) {
                p(this.S);
            }
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void E(float f10) {
        if (this.U != f10) {
            float fR = r();
            this.U = f10;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        this.V = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (T()) {
                h0.b.h(this.S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(boolean z9) {
        if (this.R != z9) {
            boolean zT = T();
            this.R = z9;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    p(this.S);
                } else {
                    V(this.S);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        if (this.N != colorStateList) {
            this.N = colorStateList;
            if (this.R0) {
                f fVar = this.f12396a;
                if (fVar.f12378d != colorStateList) {
                    fVar.f12378d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void I(float f10) {
        if (this.O != f10) {
            this.O = f10;
            this.f16875r0.setStrokeWidth(f10);
            if (this.R0) {
                this.f12396a.f12385k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void J(Drawable drawable) {
        ?? r02;
        Object obj = this.X;
        if (obj != null) {
            boolean z9 = obj instanceof i;
            r02 = obj;
            if (z9) {
                r02 = ((j) ((i) obj)).f13921q;
            }
        } else {
            r02 = 0;
        }
        if (r02 != drawable) {
            float fS = s();
            this.X = drawable != null ? z.I(drawable).mutate() : null;
            this.Y = new RippleDrawable(b5.d.b(this.P), this.X, T0);
            float fS2 = s();
            V(r02);
            if (U()) {
                p(this.X);
            }
            invalidateSelf();
            if (fS != fS2) {
                w();
            }
        }
    }

    public final void K(float f10) {
        if (this.f16872o0 != f10) {
            this.f16872o0 = f10;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void L(float f10) {
        if (this.f16858a0 != f10) {
            this.f16858a0 = f10;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void M(float f10) {
        if (this.f16871n0 != f10) {
            this.f16871n0 = f10;
            invalidateSelf();
            if (U()) {
                w();
            }
        }
    }

    public final void N(ColorStateList colorStateList) {
        if (this.Z != colorStateList) {
            this.Z = colorStateList;
            if (U()) {
                h0.b.h(this.X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void O(boolean z9) {
        if (this.W != z9) {
            boolean zU = U();
            this.W = z9;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    p(this.X);
                } else {
                    V(this.X);
                }
                invalidateSelf();
                w();
            }
        }
    }

    public final void P(float f10) {
        if (this.f16868k0 != f10) {
            float fR = r();
            this.f16868k0 = f10;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void Q(float f10) {
        if (this.f16867j0 != f10) {
            float fR = r();
            this.f16867j0 = f10;
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void R(ColorStateList colorStateList) {
        if (this.P != colorStateList) {
            this.P = colorStateList;
            this.M0 = this.L0 ? b5.d.b(colorStateList) : null;
            onStateChange(getState());
        }
    }

    public final boolean S() {
        return this.f16861d0 && this.f16862e0 != null && this.D0;
    }

    public final boolean T() {
        return this.R && this.S != null;
    }

    public final boolean U() {
        return this.W && this.X != null;
    }

    @Override // x4.v
    public final void a() {
        w();
        invalidateSelf();
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int iSaveLayerAlpha;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i10 = this.F0) == 0) {
            return;
        }
        if (i10 < 255) {
            float f10 = bounds.left;
            float f11 = bounds.top;
            float f12 = bounds.right;
            float f13 = bounds.bottom;
            iSaveLayerAlpha = Build.VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f10, f11, f12, f13, i10) : canvas.saveLayerAlpha(f10, f11, f12, f13, i10, 31);
        } else {
            iSaveLayerAlpha = 0;
        }
        boolean z9 = this.R0;
        Paint paint = this.f16875r0;
        RectF rectF2 = this.f16877t0;
        if (!z9) {
            paint.setColor(this.f16881x0);
            paint.setStyle(Paint.Style.FILL);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, t(), t(), paint);
        }
        if (!this.R0) {
            paint.setColor(this.f16882y0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.G0;
            if (colorFilter == null) {
                colorFilter = this.H0;
            }
            paint.setColorFilter(colorFilter);
            rectF2.set(bounds);
            canvas.drawRoundRect(rectF2, t(), t(), paint);
        }
        if (this.R0) {
            super.draw(canvas);
        }
        if (this.O > 0.0f && !this.R0) {
            paint.setColor(this.A0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.R0) {
                ColorFilter colorFilter2 = this.G0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.H0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f14 = bounds.left;
            float f15 = this.O / 2.0f;
            rectF2.set(f14 + f15, bounds.top + f15, bounds.right - f15, bounds.bottom - f15);
            float f16 = this.M - (this.O / 2.0f);
            canvas.drawRoundRect(rectF2, f16, f16, paint);
        }
        paint.setColor(this.B0);
        paint.setStyle(Paint.Style.FILL);
        rectF2.set(bounds);
        if (this.R0) {
            RectF rectF3 = new RectF(bounds);
            Path path = this.f16879v0;
            l lVar = this.D;
            f fVar = this.f12396a;
            lVar.a(fVar.f12375a, fVar.f12384j, rectF3, this.C, path);
            i11 = 0;
            f(canvas, paint, path, this.f12396a.f12375a, h());
        } else {
            canvas.drawRoundRect(rectF2, t(), t(), paint);
            i11 = 0;
        }
        if (T()) {
            q(bounds, rectF2);
            float f17 = rectF2.left;
            float f18 = rectF2.top;
            canvas.translate(f17, f18);
            this.S.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
            this.S.draw(canvas);
            canvas.translate(-f17, -f18);
        }
        if (S()) {
            q(bounds, rectF2);
            float f19 = rectF2.left;
            float f20 = rectF2.top;
            canvas.translate(f19, f20);
            this.f16862e0.setBounds(i11, i11, (int) rectF2.width(), (int) rectF2.height());
            this.f16862e0.draw(canvas);
            canvas.translate(-f19, -f20);
        }
        if (!this.P0 || this.Q == null) {
            rectF = rectF2;
            i12 = iSaveLayerAlpha;
            i13 = 255;
        } else {
            PointF pointF = this.f16878u0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.Q;
            w wVar = this.f16880w0;
            if (charSequence != null) {
                float fR = r() + this.f16866i0 + this.f16869l0;
                if (z.n(this) == 0) {
                    pointF.x = bounds.left + fR;
                } else {
                    pointF.x = bounds.right - fR;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = wVar.f18475a;
                Paint.FontMetrics fontMetrics = this.f16876s0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF2.setEmpty();
            if (this.Q != null) {
                float fR2 = r() + this.f16866i0 + this.f16869l0;
                float fS = s() + this.f16873p0 + this.f16870m0;
                if (z.n(this) == 0) {
                    rectF2.left = bounds.left + fR2;
                    rectF2.right = bounds.right - fS;
                } else {
                    rectF2.left = bounds.left + fS;
                    rectF2.right = bounds.right - fR2;
                }
                rectF2.top = bounds.top;
                rectF2.bottom = bounds.bottom;
            }
            a5.d dVar = wVar.f18480f;
            TextPaint textPaint2 = wVar.f18475a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                wVar.f18480f.e(this.f16874q0, textPaint2, wVar.f18476b);
            }
            textPaint2.setTextAlign(align);
            boolean z10 = Math.round(wVar.a(this.Q.toString())) > Math.round(rectF2.width());
            if (z10) {
                iSave = canvas.save();
                canvas.clipRect(rectF2);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.Q;
            if (z10 && this.O0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF2.width(), this.O0);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f21 = pointF.x;
            float f22 = pointF.y;
            i13 = 255;
            rectF = rectF2;
            i12 = iSaveLayerAlpha;
            canvas.drawText(charSequence2, 0, length, f21, f22, textPaint2);
            if (z10) {
                canvas.restoreToCount(iSave);
            }
        }
        if (U()) {
            rectF.setEmpty();
            if (U()) {
                float f23 = this.f16873p0 + this.f16872o0;
                if (z.n(this) == 0) {
                    float f24 = bounds.right - f23;
                    rectF.right = f24;
                    rectF.left = f24 - this.f16858a0;
                } else {
                    float f25 = bounds.left + f23;
                    rectF.left = f25;
                    rectF.right = f25 + this.f16858a0;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f26 = this.f16858a0;
                float f27 = fExactCenterY - (f26 / 2.0f);
                rectF.top = f27;
                rectF.bottom = f27 + f26;
            }
            float f28 = rectF.left;
            float f29 = rectF.top;
            canvas.translate(f28, f29);
            this.X.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.Y.setBounds(this.X.getBounds());
            this.Y.jumpToCurrentState();
            this.Y.draw(canvas);
            canvas.translate(-f28, -f29);
        }
        if (this.F0 < i13) {
            canvas.restoreToCount(i12);
        }
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.G0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.L;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(s() + this.f16880w0.a(this.Q.toString()) + r() + this.f16866i0 + this.f16869l0 + this.f16870m0 + this.f16873p0), this.Q0);
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.R0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.L, this.M);
        } else {
            outline.setRoundRect(bounds, this.M);
        }
        outline.setAlpha(this.F0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        a5.d dVar;
        ColorStateList colorStateList;
        return u(this.J) || u(this.K) || u(this.N) || (this.L0 && u(this.M0)) || (!((dVar = this.f16880w0.f18480f) == null || (colorStateList = dVar.f38j) == null || !colorStateList.isStateful()) || ((this.f16861d0 && this.f16862e0 != null && this.f16860c0) || v(this.S) || v(this.f16862e0) || u(this.I0)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (T()) {
            zOnLayoutDirectionChanged |= z.A(this.S, i10);
        }
        if (S()) {
            zOnLayoutDirectionChanged |= z.A(this.f16862e0, i10);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= z.A(this.X, i10);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean zOnLevelChange = super.onLevelChange(i10);
        if (T()) {
            zOnLevelChange |= this.S.setLevel(i10);
        }
        if (S()) {
            zOnLevelChange |= this.f16862e0.setLevel(i10);
        }
        if (U()) {
            zOnLevelChange |= this.X.setLevel(i10);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.R0) {
            super.onStateChange(iArr);
        }
        return x(iArr, this.K0);
    }

    public final void p(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        z.A(drawable, z.n(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X) {
            if (drawable.isStateful()) {
                drawable.setState(this.K0);
            }
            h0.b.h(drawable, this.Z);
            return;
        }
        Drawable drawable2 = this.S;
        if (drawable == drawable2 && this.V) {
            h0.b.h(drawable2, this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void q(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (T() || S()) {
            float f10 = this.f16866i0 + this.f16867j0;
            Drawable drawable = this.D0 ? this.f16862e0 : this.S;
            float intrinsicWidth = this.U;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (z.n(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.D0 ? this.f16862e0 : this.S;
            float fCeil = this.U;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(en1.n(this.f16874q0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float r() {
        if (!T() && !S()) {
            return 0.0f;
        }
        float f10 = this.f16867j0;
        Drawable drawable = this.D0 ? this.f16862e0 : this.S;
        float intrinsicWidth = this.U;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f16868k0;
    }

    public final float s() {
        if (U()) {
            return this.f16871n0 + this.f16858a0 + this.f16872o0;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.F0 != i10) {
            this.F0 = i10;
            invalidateSelf();
        }
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.G0 != colorFilter) {
            this.G0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.I0 != colorStateList) {
            this.I0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // d5.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.J0 != mode) {
            this.J0 = mode;
            ColorStateList colorStateList = this.I0;
            this.H0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (T()) {
            visible |= this.S.setVisible(z9, z10);
        }
        if (S()) {
            visible |= this.f16862e0.setVisible(z9, z10);
        }
        if (U()) {
            visible |= this.X.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        return this.R0 ? this.f12396a.f12375a.f12415e.a(h()) : this.M;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void w() {
        d dVar = (d) this.N0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.c(chip.B);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean x(int[] iArr, int[] iArr2) {
        boolean z9;
        boolean z10;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.J;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f16881x0) : 0);
        boolean state = true;
        if (this.f16881x0 != iD) {
            this.f16881x0 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.K;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f16882y0) : 0);
        if (this.f16882y0 != iD2) {
            this.f16882y0 = iD2;
            zOnStateChange = true;
        }
        int iB = g0.a.b(iD2, iD);
        if ((this.f16883z0 != iB) | (this.f12396a.f12377c == null)) {
            this.f16883z0 = iB;
            l(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.N;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.A0) : 0;
        if (this.A0 != colorForState) {
            this.A0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.M0 == null || !b5.d.c(iArr)) ? 0 : this.M0.getColorForState(iArr, this.B0);
        if (this.B0 != colorForState2) {
            this.B0 = colorForState2;
            if (this.L0) {
                zOnStateChange = true;
            }
        }
        a5.d dVar = this.f16880w0.f18480f;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f38j) == null) ? 0 : colorStateList.getColorForState(iArr, this.C0);
        if (this.C0 != colorForState3) {
            this.C0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (state2[i10] == 16842912) {
                    z9 = this.f16860c0;
                } else {
                    i10++;
                }
            }
        }
        if (this.D0 == z9 || this.f16862e0 == null) {
            z10 = false;
        } else {
            float fR = r();
            this.D0 = z9;
            if (fR != r()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                zOnStateChange = true;
                z10 = false;
            }
        }
        ColorStateList colorStateList5 = this.I0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.E0) : 0;
        if (this.E0 != colorForState4) {
            this.E0 = colorForState4;
            ColorStateList colorStateList6 = this.I0;
            PorterDuff.Mode mode = this.J0;
            this.H0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (v(this.S)) {
            state |= this.S.setState(iArr);
        }
        if (v(this.f16862e0)) {
            state |= this.f16862e0.setState(iArr);
        }
        if (v(this.X)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.X.setState(iArr3);
        }
        if (v(this.Y)) {
            state |= this.Y.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            w();
        }
        return state;
    }

    public final void y(boolean z9) {
        if (this.f16860c0 != z9) {
            this.f16860c0 = z9;
            float fR = r();
            if (!z9 && this.D0) {
                this.D0 = false;
            }
            float fR2 = r();
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }

    public final void z(Drawable drawable) {
        if (this.f16862e0 != drawable) {
            float fR = r();
            this.f16862e0 = drawable;
            float fR2 = r();
            V(this.f16862e0);
            p(this.f16862e0);
            invalidateSelf();
            if (fR != fR2) {
                w();
            }
        }
    }
}
