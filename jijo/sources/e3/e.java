package e3;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.fragment.app.w;
import v5.l;
import v5.r;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class e extends View {
    public int A;
    public int B;
    public float C;
    public float D;
    public int E;
    public int F;
    public d G;
    public int H;
    public double I;
    public boolean J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f12669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12670b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12671d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f12672f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f12673h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f12674q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f12675s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f12676t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f12677u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f12678v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f12679w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f12680x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f12681y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f12682z;

    public e(Context context) {
        super(context);
        this.f12669a = new Paint();
        this.f12670b = false;
    }

    public final int a(float f10, float f11, boolean z9, Boolean[] boolArr) {
        if (!this.f12671d) {
            return -1;
        }
        float f12 = f11 - this.A;
        float f13 = f10 - this.f12682z;
        double dSqrt = Math.sqrt((f13 * f13) + (f12 * f12));
        if (this.f12680x) {
            if (z9) {
                boolArr[0] = Boolean.valueOf(((int) Math.abs(dSqrt - ((double) ((int) (((float) this.B) * this.f12674q))))) <= ((int) Math.abs(dSqrt - ((double) ((int) (((float) this.B) * this.f12675s))))));
            } else {
                float f14 = this.B;
                float f15 = this.f12674q;
                int i10 = this.F;
                int i11 = ((int) (f14 * f15)) - i10;
                float f16 = this.f12675s;
                int i12 = ((int) (f14 * f16)) + i10;
                int i13 = (int) (((f16 + f15) / 2.0f) * f14);
                if (dSqrt >= i11 && dSqrt <= i13) {
                    boolArr[0] = Boolean.TRUE;
                } else {
                    if (dSqrt > i12 || dSqrt < i13) {
                        return -1;
                    }
                    boolArr[0] = Boolean.FALSE;
                }
            }
        } else if (!z9) {
            if (((int) Math.abs(dSqrt - ((double) this.E))) > ((int) ((1.0f - this.f12676t) * this.B))) {
                return -1;
            }
        }
        int iAsin = (int) ((Math.asin(((double) Math.abs(f11 - this.A)) / dSqrt) * 180.0d) / 3.141592653589793d);
        boolean z10 = f10 > ((float) this.f12682z);
        boolean z11 = f11 < ((float) this.A);
        return (z10 && z11) ? 90 - iAsin : (!z10 || z11) ? (z10 || z11) ? (z10 || !z11) ? iAsin : iAsin + 270 : 270 - iAsin : iAsin + 90;
    }

    public final void b(w wVar, boolean z9, boolean z10, boolean z11, int i10, boolean z12) {
        if (this.f12670b) {
            return;
        }
        Resources resources = wVar.getResources();
        this.f12669a.setAntiAlias(true);
        this.f12679w = z9;
        if (z9) {
            this.f12672f = Float.parseFloat(resources.getString(R.string.dp));
        } else {
            this.f12672f = Float.parseFloat(resources.getString(R.string.do_res_0x7f1200a2));
            this.f12673h = Float.parseFloat(resources.getString(R.string.bi));
        }
        this.f12680x = z10;
        if (z10) {
            this.f12674q = Float.parseFloat(resources.getString(R.string.q_));
            this.f12675s = Float.parseFloat(resources.getString(R.string.qb));
        } else {
            this.f12676t = Float.parseFloat(resources.getString(R.string.qa));
        }
        this.f12677u = Float.parseFloat(resources.getString(R.string.vi));
        this.f12678v = 1.0f;
        this.C = ((z11 ? -1 : 1) * 0.05f) + 1.0f;
        this.D = ((z11 ? 1 : -1) * 0.3f) + 1.0f;
        this.G = new d(this);
        c(i10, z12, false);
        this.f12670b = true;
    }

    public final void c(int i10, boolean z9, boolean z10) {
        this.H = i10;
        this.I = (((double) i10) * 3.141592653589793d) / 180.0d;
        this.J = z10;
        if (this.f12680x) {
            if (z9) {
                this.f12676t = this.f12674q;
            } else {
                this.f12676t = this.f12675s;
            }
        }
    }

    public l getDisappearAnimator() {
        if (!this.f12670b || !this.f12671d) {
            return null;
        }
        l lVarO = l.o(x5.a.C ? x5.a.e(this) : this, r.e("animationRadiusMultiplier", new v5.j(0.0f, 1.0f), new v5.j(0.2f, this.C), new v5.j(1.0f, this.D)), r.e("alpha", new v5.j(0.0f, 1.0f), new v5.j(1.0f, 0.0f)));
        lVarO.p(500);
        lVarO.g(this.G);
        return lVarO;
    }

    public l getReappearAnimator() {
        if (!this.f12670b || !this.f12671d) {
            return null;
        }
        float f10 = 500;
        int i10 = (int) (1.25f * f10);
        float f11 = (f10 * 0.25f) / i10;
        float f12 = this.D;
        l lVarO = l.o(x5.a.C ? x5.a.e(this) : this, r.e("animationRadiusMultiplier", new v5.j(0.0f, f12), new v5.j(f11, f12), new v5.j(1.0f - ((1.0f - f11) * 0.2f), this.C), new v5.j(1.0f, 1.0f)), r.e("alpha", new v5.j(0.0f, 0.0f), new v5.j(f11, 0.0f), new v5.j(1.0f, 1.0f)));
        lVarO.p(i10);
        lVarO.g(this.G);
        return lVarO;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (getWidth() == 0 || !this.f12670b) {
            return;
        }
        if (!this.f12671d) {
            this.f12682z = getWidth() / 2;
            this.A = getHeight() / 2;
            int iMin = (int) (Math.min(this.f12682z, r0) * this.f12672f);
            this.B = iMin;
            if (!this.f12679w) {
                this.A -= ((int) (iMin * this.f12673h)) / 2;
            }
            this.F = (int) (iMin * this.f12677u);
            this.f12671d = true;
        }
        int i10 = (int) (this.B * this.f12676t * this.f12678v);
        this.E = i10;
        int iSin = this.f12682z + ((int) (Math.sin(this.I) * ((double) i10)));
        int iCos = this.A - ((int) (Math.cos(this.I) * ((double) this.E)));
        Paint paint = this.f12669a;
        paint.setAlpha(this.f12681y);
        float f10 = iSin;
        float f11 = iCos;
        canvas.drawCircle(f10, f11, this.F, paint);
        if ((this.H % 30 != 0) || this.J) {
            paint.setAlpha(255);
            canvas.drawCircle(f10, f11, (this.F * 2) / 7, paint);
        } else {
            double d10 = this.E - this.F;
            int iSin2 = ((int) (Math.sin(this.I) * d10)) + this.f12682z;
            int iCos2 = this.A - ((int) (Math.cos(this.I) * d10));
            iSin = iSin2;
            iCos = iCos2;
        }
        paint.setAlpha(255);
        paint.setStrokeWidth(1.0f);
        canvas.drawLine(this.f12682z, this.A, iSin, iCos, paint);
    }

    public void setAnimationRadiusMultiplier(float f10) {
        this.f12678v = f10;
    }

    public void setTheme(TypedArray typedArray) {
        this.f12669a.setColor(typedArray.getColor(15, d0.f.b(getContext(), R.color.a9)));
        this.f12681y = typedArray.getInt(14, 35);
    }
}
