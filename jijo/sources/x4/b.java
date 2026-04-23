package x4;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.google.android.gms.internal.ads.fb1;
import g4.a0;
import java.util.WeakHashMap;
import o0.d0;
import o0.e0;
import o0.v0;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f18392a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f18393a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f18394b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f18395b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f18396c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f18397c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f18398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RectF f18400e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f18407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f18408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f18409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f18410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f18411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f18412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f18413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f18414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f18415r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f18416s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f18417t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f18418u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f18419v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f18420w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f18421x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a5.a f18422y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18402f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18404g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f18405h = 15.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f18406i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f18423z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f18399d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f18401e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f18403f0 = u.f18459m;

    public b(View view) {
        this.f18392a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f18398d = new Rect();
        this.f18396c = new Rect();
        this.f18400e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = m4.a.f15740a;
        return fb1.c(f11, f10, f12, f10);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f16075a;
        boolean z9 = e0.d(this.f18392a) == 1;
        if (this.D) {
            return (z9 ? m0.l.f15394d : m0.l.f15393c).d(charSequence, charSequence.length());
        }
        return z9;
    }

    public final void c(float f10, boolean z9) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z10;
        StaticLayout staticLayoutA;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float fWidth = this.f18398d.width();
        float fWidth2 = this.f18396c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.f18406i;
            f12 = this.V;
            this.F = 1.0f;
            typeface = this.f18415r;
        } else {
            float f13 = this.f18405h;
            float f14 = this.W;
            Typeface typeface2 = this.f18418u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f18405h, this.f18406i, f10, this.Q) / this.f18405h;
            }
            float f15 = this.f18406i / this.f18405h;
            fWidth = (!z9 && fWidth2 * f15 > fWidth) ? Math.min(fWidth / f15, fWidth2) : fWidth2;
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (fWidth > 0.0f) {
            boolean z11 = this.G != f11;
            boolean z12 = this.X != f12;
            boolean z13 = this.f18421x != typeface;
            StaticLayout staticLayout = this.Y;
            z10 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.M;
            this.G = f11;
            this.X = f12;
            this.f18421x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
        } else {
            z10 = false;
        }
        if (this.B == null || z10) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f18421x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.A);
            this.C = zB;
            int i10 = this.f18399d0;
            if (i10 <= 1 || zB) {
                i10 = 1;
            }
            try {
                if (i10 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f18402f, zB ? 1 : 0) & 7;
                    alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
                }
                u uVar = new u(this.A, textPaint, (int) fWidth);
                uVar.f18474l = this.f18423z;
                uVar.f18473k = zB;
                uVar.f18467e = alignment;
                uVar.f18472j = false;
                uVar.f18468f = i10;
                float f16 = this.f18401e0;
                uVar.f18469g = 0.0f;
                uVar.f18470h = f16;
                uVar.f18471i = this.f18403f0;
                staticLayoutA = uVar.a();
            } catch (t e10) {
                e10.getCause().getMessage();
                staticLayoutA = null;
            }
            staticLayoutA.getClass();
            this.Y = staticLayoutA;
            this.B = staticLayoutA.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f18406i);
        textPaint.setTypeface(this.f18415r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f18417t;
            if (typeface != null) {
                this.f18416s = a0.s(configuration, typeface);
            }
            Typeface typeface2 = this.f18420w;
            if (typeface2 != null) {
                this.f18419v = a0.s(configuration, typeface2);
            }
            Typeface typeface3 = this.f18416s;
            if (typeface3 == null) {
                typeface3 = this.f18417t;
            }
            this.f18415r = typeface3;
            Typeface typeface4 = this.f18419v;
            if (typeface4 == null) {
                typeface4 = this.f18420w;
            }
            this.f18418u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z9) {
        float fMeasureText;
        StaticLayout staticLayout;
        View view = this.f18392a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z9) {
            return;
        }
        c(1.0f, z9);
        CharSequence charSequence = this.B;
        TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.f18397c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f18423z);
        }
        CharSequence charSequence2 = this.f18397c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f18404g, this.C ? 1 : 0);
        int i10 = absoluteGravity & 112;
        Rect rect = this.f18398d;
        if (i10 == 48) {
            this.f18410m = rect.top;
        } else if (i10 != 80) {
            this.f18410m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f18410m = textPaint.ascent() + rect.bottom;
        }
        int i11 = absoluteGravity & 8388615;
        if (i11 == 1) {
            this.f18412o = rect.centerX() - (this.Z / 2.0f);
        } else if (i11 != 5) {
            this.f18412o = rect.left;
        } else {
            this.f18412o = rect.right - this.Z;
        }
        c(0.0f, z9);
        float height = this.Y != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.Y;
        if (staticLayout2 == null || this.f18399d0 <= 1) {
            CharSequence charSequence3 = this.B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 != null) {
            staticLayout3.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f18402f, this.C ? 1 : 0);
        int i12 = absoluteGravity2 & 112;
        Rect rect2 = this.f18396c;
        if (i12 == 48) {
            this.f18409l = rect2.top;
        } else if (i12 != 80) {
            this.f18409l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f18409l = textPaint.descent() + (rect2.bottom - height);
        }
        int i13 = absoluteGravity2 & 8388615;
        if (i13 == 1) {
            this.f18411n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i13 != 5) {
            this.f18411n = rect2.left;
        } else {
            this.f18411n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.f18394b);
        float f10 = this.f18394b;
        float f11 = f(rect2.left, rect.left, f10, this.P);
        RectF rectF = this.f18400e;
        rectF.left = f11;
        rectF.top = f(this.f18409l, this.f18410m, f10, this.P);
        rectF.right = f(rect2.right, rect.right, f10, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.P);
        this.f18413p = f(this.f18411n, this.f18412o, f10, this.P);
        this.f18414q = f(this.f18409l, this.f18410m, f10, this.P);
        l(f10);
        b1.b bVar = m4.a.f15741b;
        this.f18393a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
        WeakHashMap weakHashMap = v0.f16075a;
        d0.k(view);
        this.f18395b0 = f(1.0f, 0.0f, f10, bVar);
        d0.k(view);
        ColorStateList colorStateList = this.f18408k;
        ColorStateList colorStateList2 = this.f18407j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, e(colorStateList2), e(this.f18408k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f12 = this.V;
        float f13 = this.W;
        if (f12 != f13) {
            textPaint.setLetterSpacing(f(f13, f12, f10, bVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.H = f(0.0f, this.R, f10, null);
        this.I = f(0.0f, this.S, f10, null);
        this.J = f(0.0f, this.T, f10, null);
        int iA = a(f10, e(null), e(this.U));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        d0.k(view);
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f18408k == colorStateList && this.f18407j == colorStateList) {
            return;
        }
        this.f18408k = colorStateList;
        this.f18407j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        a5.a aVar = this.f18422y;
        if (aVar != null) {
            aVar.f22f = true;
        }
        if (this.f18417t == typeface) {
            return false;
        }
        this.f18417t = typeface;
        Typeface typefaceS = a0.s(this.f18392a.getContext().getResources().getConfiguration(), typeface);
        this.f18416s = typefaceS;
        if (typefaceS == null) {
            typefaceS = this.f18417t;
        }
        this.f18415r = typefaceS;
        return true;
    }

    public final void k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f18394b) {
            this.f18394b = f10;
            float f11 = this.f18396c.left;
            Rect rect = this.f18398d;
            float f12 = f(f11, rect.left, f10, this.P);
            RectF rectF = this.f18400e;
            rectF.left = f12;
            rectF.top = f(this.f18409l, this.f18410m, f10, this.P);
            rectF.right = f(r2.right, rect.right, f10, this.P);
            rectF.bottom = f(r2.bottom, rect.bottom, f10, this.P);
            this.f18413p = f(this.f18411n, this.f18412o, f10, this.P);
            this.f18414q = f(this.f18409l, this.f18410m, f10, this.P);
            l(f10);
            b1.b bVar = m4.a.f15741b;
            this.f18393a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
            WeakHashMap weakHashMap = v0.f16075a;
            View view = this.f18392a;
            d0.k(view);
            this.f18395b0 = f(1.0f, 0.0f, f10, bVar);
            d0.k(view);
            ColorStateList colorStateList = this.f18408k;
            ColorStateList colorStateList2 = this.f18407j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.f18408k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.V;
            float f14 = this.W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f10, bVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.H = f(0.0f, this.R, f10, null);
            this.I = f(0.0f, this.S, f10, null);
            this.J = f(0.0f, this.T, f10, null);
            int iA = a(f10, e(null), e(this.U));
            this.K = iA;
            textPaint.setShadowLayer(this.H, this.I, this.J, iA);
            d0.k(view);
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap weakHashMap = v0.f16075a;
        d0.k(this.f18392a);
    }

    public final void m(Typeface typeface) {
        boolean z9;
        boolean zJ = j(typeface);
        if (this.f18420w != typeface) {
            this.f18420w = typeface;
            Typeface typefaceS = a0.s(this.f18392a.getContext().getResources().getConfiguration(), typeface);
            this.f18419v = typefaceS;
            if (typefaceS == null) {
                typefaceS = this.f18420w;
            }
            this.f18418u = typefaceS;
            z9 = true;
        } else {
            z9 = false;
        }
        if (zJ || z9) {
            h(false);
        }
    }
}
