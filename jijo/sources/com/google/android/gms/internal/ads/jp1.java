package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class jp1 implements io1, ho1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io1 f6061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6062b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ho1 f6063d;

    public jp1(io1 io1Var, long j10) {
        this.f6061a = io1Var;
        this.f6062b = j10;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long a(long j10) {
        io1 io1Var = this.f6061a;
        long j11 = this.f6062b;
        return io1Var.a(j10 - j11) + j11;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final void b(long j10) {
        this.f6061a.b(j10 - this.f6062b);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final /* bridge */ /* synthetic */ void c(ep1 ep1Var) {
        ho1 ho1Var = this.f6063d;
        ho1Var.getClass();
        ho1Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void d(long j10) {
        this.f6061a.d(j10 - this.f6062b);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final void e(io1 io1Var) {
        ho1 ho1Var = this.f6063d;
        ho1Var.getClass();
        ho1Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long f(cq1[] cq1VarArr, boolean[] zArr, dp1[] dp1VarArr, boolean[] zArr2, long j10) {
        dp1[] dp1VarArr2 = new dp1[dp1VarArr.length];
        int i10 = 0;
        while (true) {
            dp1 dp1Var = null;
            if (i10 >= dp1VarArr.length) {
                break;
            }
            ip1 ip1Var = (ip1) dp1VarArr[i10];
            if (ip1Var != null) {
                dp1Var = ip1Var.f5671a;
            }
            dp1VarArr2[i10] = dp1Var;
            i10++;
        }
        io1 io1Var = this.f6061a;
        long j11 = this.f6062b;
        long jF = io1Var.f(cq1VarArr, zArr, dp1VarArr2, zArr2, j10 - j11);
        for (int i11 = 0; i11 < dp1VarArr.length; i11++) {
            dp1 dp1Var2 = dp1VarArr2[i11];
            if (dp1Var2 == null) {
                dp1VarArr[i11] = null;
            } else {
                dp1 dp1Var3 = dp1VarArr[i11];
                if (dp1Var3 == null || ((ip1) dp1Var3).f5671a != dp1Var2) {
                    dp1VarArr[i11] = new ip1(dp1Var2, j11);
                }
            }
        }
        return jF + j11;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean g(fj1 fj1Var) {
        ej1 ej1Var = new ej1();
        ej1Var.f4210b = fj1Var.f4539b;
        ej1Var.f4211c = fj1Var.f4540c;
        ej1Var.f4209a = fj1Var.f4538a - this.f6062b;
        return this.f6061a.g(new fj1(ej1Var));
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void h(ho1 ho1Var, long j10) {
        this.f6063d = ho1Var;
        this.f6061a.h(this, j10 - this.f6062b);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long k(long j10, ak1 ak1Var) {
        long j11 = this.f6062b;
        return this.f6061a.k(j10 - j11, ak1Var) + j11;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzb() {
        long jZzb = this.f6061a.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.f6062b;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzc() {
        long jZzc = this.f6061a.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.f6062b;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long zzd() {
        long jZzd = this.f6061a.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.f6062b;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final kp1 zzi() {
        return this.f6061a.zzi();
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void zzk() {
        this.f6061a.zzk();
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean zzp() {
        return this.f6061a.zzp();
    }
}
