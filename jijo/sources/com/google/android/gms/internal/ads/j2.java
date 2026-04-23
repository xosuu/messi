package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class j2 implements n2, v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5772e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5773f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5774g;

    public j2(int i10, int i11, long j10, long j11) {
        long jMax;
        this.f5768a = j10;
        this.f5769b = j11;
        this.f5770c = i11 == -1 ? 1 : i11;
        this.f5772e = i10;
        if (j10 == -1) {
            this.f5771d = -1L;
            jMax = -9223372036854775807L;
        } else {
            long j12 = j10 - j11;
            this.f5771d = j12;
            jMax = (Math.max(0L, j12) * 8000000) / ((long) i10);
        }
        this.f5773f = jMax;
        this.f5774g = i10;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long a(long j10) {
        return (Math.max(0L, j10 - this.f5769b) * 8000000) / ((long) this.f5772e);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        long j11 = this.f5769b;
        long j12 = this.f5771d;
        if (j12 == -1) {
            w0 w0Var = new w0(0L, j11);
            return new u0(w0Var, w0Var);
        }
        int i10 = this.f5772e;
        long j13 = this.f5770c;
        long jMin = (((((long) i10) * j10) / 8000000) / j13) * j13;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - j13);
        }
        long jMax = Math.max(jMin, 0L) + j11;
        long jMax2 = (Math.max(0L, jMax - j11) * 8000000) / ((long) i10);
        w0 w0Var2 = new w0(jMax2, jMax);
        if (j12 != -1 && jMax2 < j10) {
            long j14 = jMax + j13;
            if (j14 < this.f5768a) {
                return new u0(w0Var2, new w0((Math.max(0L, j14 - j11) * 8000000) / ((long) i10), j14));
            }
        }
        return new u0(w0Var2, w0Var2);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f5773f;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int zzc() {
        return this.f5774g;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return this.f5771d != -1;
    }
}
