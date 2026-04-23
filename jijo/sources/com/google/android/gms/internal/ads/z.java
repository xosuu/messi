package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class z implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f11079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f11080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f11081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f11082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f11083f;

    public z(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11079b = iArr;
        this.f11080c = jArr;
        this.f11081d = jArr2;
        this.f11082e = jArr3;
        int length = iArr.length;
        this.f11078a = length;
        if (length <= 0) {
            this.f11083f = 0L;
        } else {
            int i10 = length - 1;
            this.f11083f = jArr2[i10] + jArr3[i10];
        }
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        long[] jArr = this.f11082e;
        int iL = yn0.l(jArr, j10, true);
        long j11 = jArr[iL];
        long[] jArr2 = this.f11080c;
        w0 w0Var = new w0(j11, jArr2[iL]);
        if (j11 >= j10 || iL == this.f11078a - 1) {
            return new u0(w0Var, w0Var);
        }
        int i10 = iL + 1;
        return new u0(w0Var, new w0(jArr[i10], jArr2[i10]));
    }

    public final String toString() {
        String string = Arrays.toString(this.f11079b);
        String string2 = Arrays.toString(this.f11080c);
        String string3 = Arrays.toString(this.f11082e);
        String string4 = Arrays.toString(this.f11081d);
        StringBuilder sb = new StringBuilder("ChunkIndex(length=");
        sb.append(this.f11078a);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        return g1.a.r(sb, string4, ")");
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f11083f;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return true;
    }
}
