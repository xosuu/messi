package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f7765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f7770f;

    public p2(t0 t0Var, long j10, long j11, long[] jArr, int i10, int i11) {
        t0 t0Var2 = new t0();
        t0Var2.f9005a = t0Var.f9005a;
        t0Var2.f9011g = (String) t0Var.f9011g;
        t0Var2.f9006b = t0Var.f9006b;
        t0Var2.f9007c = t0Var.f9007c;
        t0Var2.f9008d = t0Var.f9008d;
        t0Var2.f9009e = t0Var.f9009e;
        t0Var2.f9010f = t0Var.f9010f;
        this.f7765a = t0Var2;
        this.f7766b = j10;
        this.f7767c = j11;
        this.f7770f = jArr;
        this.f7768d = i10;
        this.f7769e = i11;
    }

    public static p2 b(t0 t0Var, ik0 ik0Var) {
        long[] jArr;
        int i10;
        int i11;
        int iQ = ik0Var.q();
        int iY = (iQ & 1) != 0 ? ik0Var.y() : -1;
        long jD = (iQ & 2) != 0 ? ik0Var.D() : -1L;
        if ((iQ & 4) == 4) {
            long[] jArr2 = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr2[i12] = ik0Var.v();
            }
            jArr = jArr2;
        } else {
            jArr = null;
        }
        if ((iQ & 8) != 0) {
            ik0Var.j(4);
        }
        if (ik0Var.n() >= 24) {
            ik0Var.j(21);
            int iX = ik0Var.x();
            i11 = iX & 4095;
            i10 = iX >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new p2(t0Var, iY, jD, jArr, i10, i11);
    }

    public final long a() {
        long j10 = this.f7766b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        return yn0.v(this.f7765a.f9007c, (j10 * ((long) r4.f9010f)) - 1);
    }
}
