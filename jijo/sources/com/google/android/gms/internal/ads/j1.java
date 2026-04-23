package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f5755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5758d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5759e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5760f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5762h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5764j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long[] f5765k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f5766l;

    public j1(int i10, int i11, long j10, int i12, b1 b1Var) {
        i11 = i11 != 1 ? 2 : i11;
        this.f5758d = j10;
        this.f5759e = i12;
        this.f5755a = b1Var;
        int i13 = (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48);
        this.f5756b = (i11 == 2 ? 1667497984 : 1651965952) | i13;
        this.f5757c = i11 == 2 ? i13 | 1650720768 : -1;
        this.f5765k = new long[512];
        this.f5766l = new int[512];
    }

    public final u0 a(long j10) {
        int i10 = (int) (j10 / ((this.f5758d * ((long) 1)) / ((long) this.f5759e)));
        int iK = yn0.k(this.f5766l, i10, true, true);
        if (this.f5766l[iK] == i10) {
            w0 w0VarB = b(iK);
            return new u0(w0VarB, w0VarB);
        }
        w0 w0VarB2 = b(iK);
        int i11 = iK + 1;
        return i11 < this.f5765k.length ? new u0(w0VarB2, b(i11)) : new u0(w0VarB2, w0VarB2);
    }

    public final w0 b(int i10) {
        return new w0(((this.f5758d * ((long) 1)) / ((long) this.f5759e)) * ((long) this.f5766l[i10]), this.f5765k[i10]);
    }
}
