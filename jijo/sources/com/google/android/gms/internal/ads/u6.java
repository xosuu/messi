package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class u6 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d1 f9384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9388e;

    public u6(d1 d1Var, int i10, long j10, long j11) {
        this.f9384a = d1Var;
        this.f9385b = i10;
        this.f9386c = j10;
        long j12 = (j11 - j10) / ((long) d1Var.f3532d);
        this.f9387d = j12;
        this.f9388e = c(j12);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        long j11 = this.f9385b;
        d1 d1Var = this.f9384a;
        long j12 = (((long) d1Var.f3530b) * j10) / (j11 * 1000000);
        long j13 = this.f9387d;
        long jMax = Math.max(0L, Math.min(j12, j13 - 1));
        long j14 = ((long) d1Var.f3532d) * jMax;
        long jC = c(jMax);
        long j15 = this.f9386c;
        w0 w0Var = new w0(jC, j14 + j15);
        if (jC >= j10 || jMax == j13 - 1) {
            return new u0(w0Var, w0Var);
        }
        long j16 = jMax + 1;
        return new u0(w0Var, new w0(c(j16), (j16 * ((long) d1Var.f3532d)) + j15));
    }

    public final long c(long j10) {
        return yn0.w(j10 * ((long) this.f9385b), 1000000L, this.f9384a.f3530b, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f9388e;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return true;
    }
}
