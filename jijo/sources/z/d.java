package z;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20484a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f20485a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20486b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f20487b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20488c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f20489c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20490d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f20491d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20492e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f20493e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20494f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f20495f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20496g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f20497g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f20498h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f20499h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20500i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f20501i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20502j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f20503j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f20504k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f20505k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20506l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f20507l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20508m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f20509m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20510n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f20511n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f20512o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f20513o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f20514p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public w.d f20515p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f20516q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20517r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f20518s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f20519t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f20520u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f20521v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f20522w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20523x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f20524y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f20525z;

    public final void a() {
        this.f20491d0 = false;
        this.f20485a0 = true;
        this.f20487b0 = true;
        int i10 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i10 == -2 && this.W) {
            this.f20485a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i11 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i11 == -2 && this.X) {
            this.f20487b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f20485a0 = false;
            if (i10 == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i11 == 0 || i11 == -1) {
            this.f20487b0 = false;
            if (i11 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f20488c == -1.0f && this.f20484a == -1 && this.f20486b == -1) {
            return;
        }
        this.f20491d0 = true;
        this.f20485a0 = true;
        this.f20487b0 = true;
        if (!(this.f20515p0 instanceof w.h)) {
            this.f20515p0 = new w.h();
        }
        ((w.h) this.f20515p0).T(this.V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void resolveLayoutDirection(int r11) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z.d.resolveLayoutDirection(int):void");
    }
}
