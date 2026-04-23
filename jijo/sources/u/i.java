package u;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17495a;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f17499h;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f17506x;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17496b = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f17497d = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17498f = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17500q = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f17501s = new float[9];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float[] f17502t = new float[9];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c[] f17503u = new c[16];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f17504v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f17505w = 0;

    public i(int i10) {
        this.f17506x = i10;
    }

    public final void a(c cVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f17504v;
            if (i10 >= i11) {
                c[] cVarArr = this.f17503u;
                if (i11 >= cVarArr.length) {
                    this.f17503u = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.f17503u;
                int i12 = this.f17504v;
                cVarArr2[i12] = cVar;
                this.f17504v = i12 + 1;
                return;
            }
            if (this.f17503u[i10] == cVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f17496b - ((i) obj).f17496b;
    }

    public final void d(c cVar) {
        int i10 = this.f17504v;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f17503u[i11] == cVar) {
                while (i11 < i10 - 1) {
                    c[] cVarArr = this.f17503u;
                    int i12 = i11 + 1;
                    cVarArr[i11] = cVarArr[i12];
                    i11 = i12;
                }
                this.f17504v--;
                return;
            }
            i11++;
        }
    }

    public final void e() {
        this.f17506x = 5;
        this.f17498f = 0;
        this.f17496b = -1;
        this.f17497d = -1;
        this.f17499h = 0.0f;
        this.f17500q = false;
        int i10 = this.f17504v;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17503u[i11] = null;
        }
        this.f17504v = 0;
        this.f17505w = 0;
        this.f17495a = false;
        Arrays.fill(this.f17502t, 0.0f);
    }

    public final void f(d dVar, float f10) {
        this.f17499h = f10;
        this.f17500q = true;
        int i10 = this.f17504v;
        this.f17497d = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17503u[i11].h(dVar, this, false);
        }
        this.f17504v = 0;
    }

    public final void g(d dVar, c cVar) {
        int i10 = this.f17504v;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f17503u[i11].i(dVar, cVar, false);
        }
        this.f17504v = 0;
    }

    public final String toString() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED + this.f17496b;
    }
}
