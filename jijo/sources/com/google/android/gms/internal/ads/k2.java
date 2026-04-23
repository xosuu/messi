package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class k2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f6144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f6145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6146c;

    public k2(long j10, long[] jArr, long[] jArr2) {
        this.f6144a = jArr;
        this.f6145b = jArr2;
        this.f6146c = j10 == -9223372036854775807L ? yn0.u(jArr2[jArr2.length - 1]) : j10;
    }

    public static k2 c(long j10, zzagi zzagiVar, long j11) {
        int length = zzagiVar.f11442h.length;
        int i10 = length + 1;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        jArr[0] = j10;
        long j12 = 0;
        jArr2[0] = 0;
        for (int i11 = 1; i11 <= length; i11++) {
            int i12 = i11 - 1;
            j10 += (long) (zzagiVar.f11440d + zzagiVar.f11442h[i12]);
            j12 += (long) (zzagiVar.f11441f + zzagiVar.f11443q[i12]);
            jArr[i11] = j10;
            jArr2[i11] = j12;
        }
        return new k2(j11, jArr, jArr2);
    }

    public static Pair d(long j10, long[] jArr, long[] jArr2) {
        int iL = yn0.l(jArr, j10, true);
        long j11 = jArr[iL];
        long j12 = jArr2[iL];
        int i10 = iL + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((jArr[i10] == j11 ? 0.0d : (j10 - j11) / (r6 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long a(long j10) {
        return yn0.u(((Long) d(j10, this.f6144a, this.f6145b).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        Pair pairD = d(yn0.x(Math.max(0L, Math.min(j10, this.f6146c))), this.f6145b, this.f6144a);
        w0 w0Var = new w0(yn0.u(((Long) pairD.first).longValue()), ((Long) pairD.second).longValue());
        return new u0(w0Var, w0Var);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f6146c;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return true;
    }
}
