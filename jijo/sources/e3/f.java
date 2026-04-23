package e3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.view.View;
import v5.l;
import v5.r;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class f extends View {
    public float A;
    public int B;
    public int C;
    public float D;
    public boolean E;
    public float F;
    public float G;
    public float[] H;
    public float[] I;
    public float[] J;
    public float[] K;
    public float L;
    public float M;
    public float N;
    public l O;
    public l P;
    public d Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f12683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12684b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12685d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Typeface f12686f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Typeface f12687h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String[] f12688q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String[] f12689s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f12690t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f12691u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f12692v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f12693w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f12694x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f12695y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f12696z;

    public f(Context context) {
        super(context);
        this.f12683a = new Paint();
        this.f12685d = false;
    }

    public final void a(float f10, float f11, float f12, float f13, float[] fArr, float[] fArr2) {
        float fSqrt = (((float) Math.sqrt(3.0d)) * f10) / 2.0f;
        float f14 = f10 / 2.0f;
        Paint paint = this.f12683a;
        paint.setTextSize(f13);
        float fAscent = f12 - ((paint.ascent() + paint.descent()) / 2.0f);
        fArr[0] = fAscent - f10;
        fArr2[0] = f11 - f10;
        fArr[1] = fAscent - fSqrt;
        fArr2[1] = f11 - fSqrt;
        fArr[2] = fAscent - f14;
        fArr2[2] = f11 - f14;
        fArr[3] = fAscent;
        fArr2[3] = f11;
        fArr[4] = fAscent + f14;
        fArr2[4] = f14 + f11;
        fArr[5] = fAscent + fSqrt;
        fArr2[5] = fSqrt + f11;
        fArr[6] = fAscent + f10;
        fArr2[6] = f11 + f10;
    }

    public final void b(Canvas canvas, float f10, Typeface typeface, String[] strArr, float[] fArr, float[] fArr2) {
        Paint paint = this.f12683a;
        paint.setTextSize(f10);
        paint.setTypeface(typeface);
        canvas.drawText(strArr[0], fArr[3], fArr2[0], paint);
        canvas.drawText(strArr[1], fArr[4], fArr2[1], paint);
        canvas.drawText(strArr[2], fArr[5], fArr2[2], paint);
        canvas.drawText(strArr[3], fArr[6], fArr2[3], paint);
        canvas.drawText(strArr[4], fArr[5], fArr2[4], paint);
        canvas.drawText(strArr[5], fArr[4], fArr2[5], paint);
        canvas.drawText(strArr[6], fArr[3], fArr2[6], paint);
        canvas.drawText(strArr[7], fArr[2], fArr2[5], paint);
        canvas.drawText(strArr[8], fArr[1], fArr2[4], paint);
        canvas.drawText(strArr[9], fArr[0], fArr2[3], paint);
        canvas.drawText(strArr[10], fArr[1], fArr2[2], paint);
        canvas.drawText(strArr[11], fArr[2], fArr2[1], paint);
    }

    public final void c(Resources resources, String[] strArr, String[] strArr2, boolean z9, boolean z10) {
        if (this.f12685d) {
            return;
        }
        Paint paint = this.f12683a;
        paint.setColor(resources.getColor(R.color.s1));
        this.f12686f = Typeface.create(resources.getString(R.string.si), 0);
        this.f12687h = Typeface.create(resources.getString(R.string.us), 0);
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        this.f12688q = strArr;
        this.f12689s = strArr2;
        this.f12690t = z9;
        this.f12691u = strArr2 != null;
        if (z9) {
            this.f12692v = Float.parseFloat(resources.getString(R.string.dp));
        } else {
            this.f12692v = Float.parseFloat(resources.getString(R.string.do_res_0x7f1200a2));
            this.f12693w = Float.parseFloat(resources.getString(R.string.bi));
        }
        this.H = new float[7];
        this.I = new float[7];
        if (this.f12691u) {
            this.f12694x = Float.parseFloat(resources.getString(R.string.qb));
            this.f12696z = Float.parseFloat(resources.getString(R.string.y9));
            this.f12695y = Float.parseFloat(resources.getString(R.string.q_));
            this.A = Float.parseFloat(resources.getString(R.string.y7));
            this.J = new float[7];
            this.K = new float[7];
        } else {
            this.f12694x = Float.parseFloat(resources.getString(R.string.qa));
            this.f12696z = Float.parseFloat(resources.getString(R.string.y8));
        }
        this.L = 1.0f;
        this.M = ((z10 ? -1 : 1) * 0.05f) + 1.0f;
        this.N = ((z10 ? 1 : -1) * 0.3f) + 1.0f;
        this.Q = new d(this);
        this.E = true;
        this.f12685d = true;
    }

    public l getDisappearAnimator() {
        l lVar;
        if (this.f12685d && this.f12684b && (lVar = this.O) != null) {
            return lVar;
        }
        return null;
    }

    public l getReappearAnimator() {
        l lVar;
        if (this.f12685d && this.f12684b && (lVar = this.P) != null) {
            return lVar;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f12685d) {
            return;
        }
        if (!this.f12684b) {
            this.B = getWidth() / 2;
            this.C = getHeight() / 2;
            float fMin = Math.min(this.B, r0) * this.f12692v;
            this.D = fMin;
            if (!this.f12690t) {
                this.C = (int) (this.C - ((this.f12693w * fMin) / 2.0f));
            }
            this.F = this.f12696z * fMin;
            if (this.f12691u) {
                this.G = fMin * this.A;
            }
            r rVarE = r.e("animationRadiusMultiplier", new v5.j(0.0f, 1.0f), new v5.j(0.2f, this.M), new v5.j(1.0f, this.N));
            r rVarE2 = r.e("alpha", new v5.j(0.0f, 1.0f), new v5.j(1.0f, 0.0f));
            boolean z9 = x5.a.C;
            l lVarO = l.o(z9 ? x5.a.e(this) : this, rVarE, rVarE2);
            lVarO.p(500);
            this.O = lVarO;
            lVarO.g(this.Q);
            float f10 = 500;
            int i10 = (int) (1.25f * f10);
            float f11 = (f10 * 0.25f) / i10;
            float f12 = this.N;
            l lVarO2 = l.o(z9 ? x5.a.e(this) : this, r.e("animationRadiusMultiplier", new v5.j(0.0f, f12), new v5.j(f11, f12), new v5.j(1.0f - ((1.0f - f11) * 0.2f), this.M), new v5.j(1.0f, 1.0f)), r.e("alpha", new v5.j(0.0f, 0.0f), new v5.j(f11, 0.0f), new v5.j(1.0f, 1.0f)));
            lVarO2.p(i10);
            this.P = lVarO2;
            lVarO2.g(this.Q);
            this.E = true;
            this.f12684b = true;
        }
        if (this.E) {
            a(this.L * this.D * this.f12694x, this.B, this.C, this.F, this.H, this.I);
            if (this.f12691u) {
                a(this.L * this.D * this.f12695y, this.B, this.C, this.G, this.J, this.K);
            }
            this.E = false;
        }
        b(canvas, this.F, this.f12686f, this.f12688q, this.I, this.H);
        if (this.f12691u) {
            b(canvas, this.G, this.f12687h, this.f12689s, this.K, this.J);
        }
    }

    public void setAnimationRadiusMultiplier(float f10) {
        this.L = f10;
        this.E = true;
    }

    public void setTheme(TypedArray typedArray) {
        this.f12683a.setColor(typedArray.getColor(16, d0.f.b(getContext(), R.color.a9)));
    }
}
