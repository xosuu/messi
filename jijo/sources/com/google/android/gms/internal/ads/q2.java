package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class q2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8087c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8088d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8089e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8090f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long[] f8091g;

    public q2(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f8085a = j10;
        this.f8086b = i10;
        this.f8087c = j11;
        this.f8088d = i11;
        this.f8089e = j12;
        this.f8091g = jArr;
        this.f8090f = j12 != -1 ? j10 + j12 : -1L;
    }

    public static q2 c(p2 p2Var, long j10) {
        long[] jArr;
        long jA = p2Var.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = p2Var.f7767c;
        t0 t0Var = p2Var.f7765a;
        return (j11 == -1 || (jArr = p2Var.f7770f) == null) ? new q2(j10, t0Var.f9006b, jA, t0Var.f9009e, -1L, null) : new q2(j10, t0Var.f9006b, jA, t0Var.f9009e, j11, jArr);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long a(long j10) {
        if (!zzh()) {
            return 0L;
        }
        long j11 = j10 - this.f8085a;
        if (j11 <= this.f8086b) {
            return 0L;
        }
        long[] jArr = this.f8091g;
        tc1.A(jArr);
        double d10 = (j11 * 256.0d) / this.f8089e;
        int iL = yn0.l(jArr, (long) d10, true);
        long j12 = this.f8087c;
        long j13 = (((long) iL) * j12) / 100;
        long j14 = jArr[iL];
        int i10 = iL + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        return Math.round((j14 == (iL == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        boolean zZzh = zzh();
        int i10 = this.f8086b;
        long j11 = this.f8085a;
        if (!zZzh) {
            w0 w0Var = new w0(0L, j11 + ((long) i10));
            return new u0(w0Var, w0Var);
        }
        long j12 = this.f8087c;
        long jMax = Math.max(0L, Math.min(j10, j12));
        double d10 = (jMax * 100.0d) / j12;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i11 = (int) d10;
                long[] jArr = this.f8091g;
                tc1.A(jArr);
                double d12 = jArr[i11];
                d11 = (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d12) * (d10 - ((double) i11))) + d12;
            }
        }
        long j13 = this.f8089e;
        w0 w0Var2 = new w0(jMax, Math.max(i10, Math.min(Math.round((d11 / 256.0d) * j13), j13 - 1)) + j11);
        return new u0(w0Var2, w0Var2);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f8087c;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int zzc() {
        return this.f8088d;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long zzd() {
        return this.f8090f;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return this.f8091g != null;
    }
}
