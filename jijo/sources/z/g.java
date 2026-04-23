package z;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f20537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f20538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20539c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f20540d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f20541e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20542f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int[] f20543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String[] f20544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f20545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f20546j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean[] f20547k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f20548l;

    public final void a(int i10, float f10) {
        int i11 = this.f20542f;
        int[] iArr = this.f20540d;
        if (i11 >= iArr.length) {
            this.f20540d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f20541e;
            this.f20541e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f20540d;
        int i12 = this.f20542f;
        iArr2[i12] = i10;
        float[] fArr2 = this.f20541e;
        this.f20542f = i12 + 1;
        fArr2[i12] = f10;
    }

    public final void b(int i10, int i11) {
        int i12 = this.f20539c;
        int[] iArr = this.f20537a;
        if (i12 >= iArr.length) {
            this.f20537a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f20538b;
            this.f20538b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f20537a;
        int i13 = this.f20539c;
        iArr3[i13] = i10;
        int[] iArr4 = this.f20538b;
        this.f20539c = i13 + 1;
        iArr4[i13] = i11;
    }

    public final void c(int i10, String str) {
        int i11 = this.f20545i;
        int[] iArr = this.f20543g;
        if (i11 >= iArr.length) {
            this.f20543g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f20544h;
            this.f20544h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f20543g;
        int i12 = this.f20545i;
        iArr2[i12] = i10;
        String[] strArr2 = this.f20544h;
        this.f20545i = i12 + 1;
        strArr2[i12] = str;
    }

    public final void d(int i10, boolean z9) {
        int i11 = this.f20548l;
        int[] iArr = this.f20546j;
        if (i11 >= iArr.length) {
            this.f20546j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f20547k;
            this.f20547k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f20546j;
        int i12 = this.f20548l;
        iArr2[i12] = i10;
        boolean[] zArr2 = this.f20547k;
        this.f20548l = i12 + 1;
        zArr2[i12] = z9;
    }
}
