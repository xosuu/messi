package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class r6 implements q6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f8420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b1 f8421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d1 f8422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y1 f8423d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8424e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8425f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8426g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f8427h;

    public r6(i0 i0Var, b1 b1Var, d1 d1Var, String str, int i10) throws zzbo {
        this.f8420a = i0Var;
        this.f8421b = b1Var;
        this.f8422c = d1Var;
        int i11 = d1Var.f3529a * d1Var.f3533e;
        int i12 = d1Var.f3532d;
        int i13 = i11 / 8;
        if (i12 != i13) {
            throw zzbo.a("Expected block size: " + i13 + "; got: " + i12, null);
        }
        int i14 = d1Var.f3530b * i13;
        int i15 = i14 * 8;
        int iMax = Math.max(i13, i14 / 10);
        this.f8424e = iMax;
        q0 q0Var = new q0();
        q0Var.f(str);
        q0Var.f8047g = i15;
        q0Var.f8048h = i15;
        q0Var.f8053m = iMax;
        q0Var.f8065y = d1Var.f3529a;
        q0Var.f8066z = d1Var.f3530b;
        q0Var.A = i10;
        this.f8423d = new y1(q0Var);
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void a(long j10) {
        this.f8425f = j10;
        this.f8426g = 0;
        this.f8427h = 0L;
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final void b(int i10, long j10) {
        this.f8420a.p(new u6(this.f8422c, 1, i10, j10));
        this.f8421b.c(this.f8423d);
    }

    @Override // com.google.android.gms.internal.ads.q6
    public final boolean c(h0 h0Var, long j10) {
        int i10;
        int i11;
        long j11 = j10;
        while (j11 > 0 && (i10 = this.f8426g) < (i11 = this.f8424e)) {
            int iD = this.f8421b.d(h0Var, (int) Math.min(i11 - i10, j11), true);
            if (iD == -1) {
                j11 = 0;
            } else {
                this.f8426g += iD;
                j11 -= (long) iD;
            }
        }
        int i12 = this.f8426g;
        int i13 = this.f8422c.f3532d;
        int i14 = i12 / i13;
        if (i14 > 0) {
            long jW = this.f8425f + yn0.w(this.f8427h, 1000000L, r2.f3530b, RoundingMode.FLOOR);
            int i15 = i14 * i13;
            int i16 = this.f8426g - i15;
            this.f8421b.e(jW, 1, i15, i16, null);
            this.f8427h += (long) i14;
            this.f8426g = i16;
        }
        return j11 <= 0;
    }
}
