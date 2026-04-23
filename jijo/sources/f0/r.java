package f0;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final r f13042k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13047e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f13048f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f13049g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f13050h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f13051i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f13052j;

    static {
        float[] fArr = b.f13010c;
        float fC = (float) ((((double) b.c()) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f13008a;
        float f10 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f10;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f10);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f10 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fExp = (1.0f - (((float) Math.exp(((-fC) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d10 = fExp;
        if (d10 > 1.0d) {
            fExp = 1.0f;
        } else if (d10 < 0.0d) {
            fExp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f15) * fExp) + 1.0f) - fExp, (((100.0f / f16) * fExp) + 1.0f) - fExp, (((100.0f / f17) * fExp) + 1.0f) - fExp};
        float f19 = 1.0f / ((5.0f * fC) + 1.0f);
        float f20 = f19 * f19 * f19 * f19;
        float f21 = 1.0f - f20;
        float fCbrt = (0.1f * f21 * f21 * ((float) Math.cbrt(((double) fC) * 5.0d))) + (f20 * fC);
        float fC2 = b.c() / fArr[1];
        double d11 = fC2;
        float fSqrt = ((float) Math.sqrt(d11)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d11, 0.2d));
        float fPow2 = (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f17)) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f15)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f16)) / 100.0d, 0.42d), fPow2};
        float f22 = fArr7[0];
        float f23 = fArr7[1];
        f13042k = new r(fC2, ((((400.0f * fPow2) / (fPow2 + 27.13f)) * 0.05f) + (((f22 * 400.0f) / (f22 + 27.13f)) * 2.0f) + ((f23 * 400.0f) / (f23 + 27.13f))) * fPow, fPow, fPow, f18, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public r(float f10, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f13048f = f10;
        this.f13043a = f11;
        this.f13044b = f12;
        this.f13045c = f13;
        this.f13046d = f14;
        this.f13047e = f15;
        this.f13049g = fArr;
        this.f13050h = f16;
        this.f13051i = f17;
        this.f13052j = f18;
    }
}
