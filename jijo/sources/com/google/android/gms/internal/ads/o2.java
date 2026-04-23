package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f7469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f7470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7473e;

    public o2(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f7469a = jArr;
        this.f7470b = jArr2;
        this.f7471c = j10;
        this.f7472d = j11;
        this.f7473e = i10;
    }

    public static o2 c(long j10, long j11, t0 t0Var, ik0 ik0Var) {
        int iV;
        ik0Var.j(10);
        int iQ = ik0Var.q();
        if (iQ <= 0) {
            return null;
        }
        int i10 = t0Var.f9007c;
        long jW = yn0.w(iQ, ((long) (i10 >= 32000 ? 1152 : 576)) * 1000000, i10, RoundingMode.FLOOR);
        int iZ = ik0Var.z();
        int iZ2 = ik0Var.z();
        int iZ3 = ik0Var.z();
        ik0Var.j(2);
        long j12 = j11 + ((long) t0Var.f9006b);
        long[] jArr = new long[iZ];
        long[] jArr2 = new long[iZ];
        long j13 = j11;
        int i11 = 0;
        while (i11 < iZ) {
            long j14 = jW;
            jArr[i11] = (((long) i11) * jW) / ((long) iZ);
            jArr2[i11] = Math.max(j13, j12);
            if (iZ3 == 1) {
                iV = ik0Var.v();
            } else if (iZ3 == 2) {
                iV = ik0Var.z();
            } else if (iZ3 == 3) {
                iV = ik0Var.x();
            } else {
                if (iZ3 != 4) {
                    return null;
                }
                iV = ik0Var.y();
            }
            j13 += ((long) iV) * ((long) iZ2);
            i11++;
            jW = j14;
        }
        long j15 = jW;
        if (j10 != -1 && j10 != j13) {
            fg0.f("VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new o2(jArr, jArr2, j15, j13, t0Var.f9009e);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long a(long j10) {
        return this.f7469a[yn0.l(this.f7470b, j10, true)];
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        long[] jArr = this.f7469a;
        int iL = yn0.l(jArr, j10, true);
        long j11 = jArr[iL];
        long[] jArr2 = this.f7470b;
        w0 w0Var = new w0(j11, jArr2[iL]);
        if (j11 >= j10 || iL == jArr.length - 1) {
            return new u0(w0Var, w0Var);
        }
        int i10 = iL + 1;
        return new u0(w0Var, new w0(jArr[i10], jArr2[i10]));
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f7471c;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int zzc() {
        return this.f7473e;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long zzd() {
        return this.f7472d;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return true;
    }
}
