package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class do1 implements io1, ho1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo1 f3709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3710b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public qn1 f3711d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public io1 f3712f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ho1 f3713h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f3714q = -9223372036854775807L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final iq1 f3715s;

    public do1(jo1 jo1Var, iq1 iq1Var, long j10) {
        this.f3709a = jo1Var;
        this.f3715s = iq1Var;
        this.f3710b = j10;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long a(long j10) {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        return io1Var.a(j10);
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final void b(long j10) {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        io1Var.b(j10);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final /* bridge */ /* synthetic */ void c(ep1 ep1Var) {
        ho1 ho1Var = this.f3713h;
        int i10 = yn0.f10944a;
        ho1Var.c(this);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void d(long j10) {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        io1Var.d(j10);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final void e(io1 io1Var) {
        ho1 ho1Var = this.f3713h;
        int i10 = yn0.f10944a;
        ho1Var.e(this);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long f(cq1[] cq1VarArr, boolean[] zArr, dp1[] dp1VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f3714q;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f3710b) ? j10 : j11;
        this.f3714q = -9223372036854775807L;
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        return io1Var.f(cq1VarArr, zArr, dp1VarArr, zArr2, j12);
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean g(fj1 fj1Var) {
        io1 io1Var = this.f3712f;
        return io1Var != null && io1Var.g(fj1Var);
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void h(ho1 ho1Var, long j10) {
        this.f3713h = ho1Var;
        io1 io1Var = this.f3712f;
        if (io1Var != null) {
            long j11 = this.f3714q;
            if (j11 == -9223372036854775807L) {
                j11 = this.f3710b;
            }
            io1Var.h(this, j11);
        }
    }

    public final void i(jo1 jo1Var) {
        long j10 = this.f3714q;
        if (j10 == -9223372036854775807L) {
            j10 = this.f3710b;
        }
        qn1 qn1Var = this.f3711d;
        qn1Var.getClass();
        io1 io1VarB = qn1Var.b(jo1Var, this.f3715s, j10);
        this.f3712f = io1VarB;
        if (this.f3713h != null) {
            io1VarB.h(this, j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long k(long j10, ak1 ak1Var) {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        return io1Var.k(j10, ak1Var);
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzb() {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        return io1Var.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzc() {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        return io1Var.zzc();
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long zzd() {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        return io1Var.zzd();
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final kp1 zzi() {
        io1 io1Var = this.f3712f;
        int i10 = yn0.f10944a;
        return io1Var.zzi();
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void zzk() {
        io1 io1Var = this.f3712f;
        if (io1Var != null) {
            io1Var.zzk();
            return;
        }
        qn1 qn1Var = this.f3711d;
        if (qn1Var != null) {
            qn1Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean zzp() {
        io1 io1Var = this.f3712f;
        return io1Var != null && io1Var.zzp();
    }
}
