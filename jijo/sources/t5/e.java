package t5;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f16928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f16929f = new int[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f16930g = new int[1];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int[] f16931h = new int[1];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f16932i = new int[1];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[][] f16933j = new int[1][];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int[][] f16934k = new int[1][];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f16935l = new int[1];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f16936m = new int[1];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f16937n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16938o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f16941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final byte[] f16942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f16943t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16944u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16945v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f16946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f16947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f16948y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f16923z = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    public static final int[] A = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    public e(l lVar, int i10) {
        g gVar = new g();
        gVar.f16972a = null;
        gVar.f16973b = null;
        gVar.f16974c = null;
        gVar.f16975d = null;
        gVar.f16976e = null;
        gVar.f16977f = null;
        this.f16947x = gVar;
        this.f16948y = lVar;
        this.f16937n = new f(lVar, this);
        this.f16941r = new int[4320];
        this.f16942s = new byte[i10];
        this.f16943t = i10;
        this.f16946w = lVar.f17021j.f16982d != 0;
        this.f16924a = 0;
        c();
    }

    public final int a(int i10) {
        l lVar = this.f16948y;
        int i11 = lVar.f17016e;
        int i12 = this.f16944u;
        int i13 = this.f16945v;
        int i14 = this.f16943t;
        if (i12 > i13) {
            i13 = i14;
        }
        int i15 = i13 - i12;
        int i16 = lVar.f17017f;
        if (i15 > i16) {
            i15 = i16;
        }
        if (i15 != 0 && i10 == -5) {
            i10 = 0;
        }
        lVar.f17017f = i16 - i15;
        lVar.f17018g += (long) i15;
        boolean z9 = this.f16946w;
        if (z9 && i15 > 0) {
            lVar.f17022k.update(this.f16942s, i12, i15);
        }
        System.arraycopy(this.f16942s, i12, lVar.f17015d, i11, i15);
        int i17 = i11 + i15;
        int i18 = i12 + i15;
        if (i18 == i14) {
            if (this.f16945v == i14) {
                this.f16945v = 0;
            }
            i18 = this.f16945v;
            int i19 = lVar.f17017f;
            if (i18 > i19) {
                i18 = i19;
            }
            if (i18 != 0 && i10 == -5) {
                i10 = 0;
            }
            lVar.f17017f = i19 - i18;
            lVar.f17018g += (long) i18;
            if (z9 && i18 > 0) {
                lVar.f17022k.update(this.f16942s, 0, i18);
            }
            System.arraycopy(this.f16942s, 0, lVar.f17015d, i17, i18);
            i17 += i18;
        }
        lVar.f17016e = i17;
        this.f16944u = i18;
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02da, code lost:
    
        r33.f16945v = r7;
        r2 = a(r2);
        r7 = r33.f16945v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x02e4, code lost:
    
        if (r33.f16944u == r7) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x02e6, code lost:
    
        r33.f16940q = r5;
        r33.f16939p = r6;
        r1.f17014c = r4;
        r1.f17013b = r3;
        r33.f16945v = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x02f4, code lost:
    
        return a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02f5, code lost:
    
        r33.f16924a = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02f9, code lost:
    
        r33.f16940q = r5;
        r33.f16939p = r6;
        r1.f17014c = r4;
        r1.f17013b = r3;
        r33.f16945v = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0308, code lost:
    
        return a(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03f0, code lost:
    
        r33.f16928e = null;
        r33.f16924a = 9;
        r1.f17019h = "invalid bit length repeat";
        r33.f16940q = r2;
        r33.f16939p = r6;
        r1.f17014c = r4;
        r1.f17013b = r7;
        r33.f16945v = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0409, code lost:
    
        return a(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x040a, code lost:
    
        r33.f16924a = 9;
        r1.f17019h = "too many length or distance symbols";
        r33.f16940q = r5;
        r33.f16939p = r6;
        r1.f17014c = r4;
        r1.f17013b = r3;
        r33.f16945v = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x041e, code lost:
    
        return a(-3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0092, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[LOOP:9: B:39:0x00c7->B:42:0x00cc, LOOP_START, PHI: r2 r3 r4 r5 r6
      0x00c7: PHI (r2v12 int) = (r2v4 int), (r2v17 int) binds: [B:38:0x00c5, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r3v5 int) = (r3v4 int), (r3v6 int) binds: [B:38:0x00c5, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r4v5 int) = (r4v4 int), (r4v6 int) binds: [B:38:0x00c5, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r5v5 int) = (r5v4 int), (r5v7 int) binds: [B:38:0x00c5, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r6v5 int) = (r6v4 int), (r6v7 int) binds: [B:38:0x00c5, B:42:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x03e9 -> B:15:0x0058). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r34) {
        /*
            Method dump skipped, instruction units count: 1474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.e.b(int):int");
    }

    public final void c() {
        if (this.f16924a == 6) {
            this.f16937n.getClass();
        }
        this.f16924a = 0;
        this.f16939p = 0;
        this.f16940q = 0;
        this.f16945v = 0;
        this.f16944u = 0;
        if (this.f16946w) {
            this.f16948y.f17022k.reset();
        }
    }
}
