package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class p6 implements q6 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f7811m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f7812n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f7813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f7814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f7815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f7817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ik0 f7818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y1 f7820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f7822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7824l;

    public p6(i0 i0Var, b1 b1Var, d1 d1Var) throws zzbo {
        this.f7813a = i0Var;
        this.f7814b = b1Var;
        this.f7815c = d1Var;
        int iMax = Math.max(1, d1Var.f3530b / 10);
        this.f7819g = iMax;
        ik0 ik0Var = new ik0(d1Var.f3531c);
        ik0Var.t();
        int iT = ik0Var.t();
        this.f7816d = iT;
        int i10 = d1Var.f3529a;
        int i11 = d1Var.f3532d;
        int i12 = (((i11 - (i10 * 4)) * 8) / (d1Var.f3533e * i10)) + 1;
        if (iT != i12) {
            throw zzbo.a("Expected frames per block: " + i12 + "; got: " + iT, null);
        }
        int i13 = yn0.f10944a;
        int i14 = ((iMax + iT) - 1) / iT;
        this.f7817e = new byte[i11 * i14];
        this.f7818f = new ik0((iT + iT) * i10 * i14);
        int i15 = ((d1Var.f3530b * d1Var.f3532d) * 8) / iT;
        q0 q0Var = new q0();
        q0Var.f("audio/raw");
        q0Var.f8047g = i15;
        q0Var.f8048h = i15;
        q0Var.f8053m = (iMax + iMax) * i10;
        q0Var.f8065y = d1Var.f3529a;
        q0Var.f8066z = d1Var.f3530b;
        q0Var.A = 2;
        this.f7820h = new y1(q0Var);
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void a(long j10) {
        this.f7821i = 0;
        this.f7822j = j10;
        this.f7823k = 0;
        this.f7824l = 0L;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void b(int i10, long j10) {
        this.f7813a.p(new u6(this.f7815c, this.f7816d, i10, j10));
        this.f7814b.c(this.f7820h);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0046 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0046->B:14:0x0046 BREAK  A[LOOP:0: B:6:0x0025->B:13:0x0040], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003d -> B:4:0x0022). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.google.android.gms.internal.ads.q6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(com.google.android.gms.internal.ads.h0 r26, long r27) {
        /*
            Method dump skipped, instruction units count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.p6.c(com.google.android.gms.internal.ads.h0, long):boolean");
    }

    public final void d(int i10) {
        d1 d1Var = this.f7815c;
        long jW = this.f7822j + yn0.w(this.f7824l, 1000000L, d1Var.f3530b, RoundingMode.FLOOR);
        int i11 = (i10 + i10) * d1Var.f3529a;
        this.f7814b.e(jW, 1, i11, this.f7823k - i11, null);
        this.f7824l += (long) i10;
        this.f7823k -= i11;
    }
}
