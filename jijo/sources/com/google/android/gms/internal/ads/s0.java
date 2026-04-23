package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class s0 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f8738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f8739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f8741d;

    public s0(long j10, long[] jArr, long[] jArr2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        tc1.K(length == length2);
        boolean z9 = length2 > 0;
        this.f8741d = z9;
        if (!z9 || jArr2[0] <= 0) {
            this.f8738a = jArr;
            this.f8739b = jArr2;
        } else {
            int i10 = length2 + 1;
            long[] jArr3 = new long[i10];
            this.f8738a = jArr3;
            long[] jArr4 = new long[i10];
            this.f8739b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f8740c = j10;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        if (!this.f8741d) {
            w0 w0Var = w0.f10014c;
            return new u0(w0Var, w0Var);
        }
        long[] jArr = this.f8739b;
        int iL = yn0.l(jArr, j10, true);
        long j11 = jArr[iL];
        long[] jArr2 = this.f8738a;
        w0 w0Var2 = new w0(j11, jArr2[iL]);
        if (j11 == j10 || iL == jArr.length - 1) {
            return new u0(w0Var2, w0Var2);
        }
        int i10 = iL + 1;
        return new u0(w0Var2, new w0(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f8740c;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return this.f8741d;
    }
}
