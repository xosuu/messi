package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d4 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f3560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a4 f3561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ur0 f3562c;

    public d4(g0 g0Var, qz qzVar) {
        this.f3560a = g0Var;
        this.f3561b = qzVar;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        ur0 ur0Var = this.f3562c;
        if (ur0Var != null) {
            ur0Var.Q();
        }
        this.f3560a.c(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final int d(h0 h0Var, k0 k0Var) {
        return this.f3560a.d(h0Var, k0Var);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        ur0 ur0Var = new ur0(i0Var, this.f3561b);
        this.f3562c = ur0Var;
        this.f3560a.e(ur0Var);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        return this.f3560a.f(h0Var);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final g0 zzc() {
        return this.f3560a;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        zy0 zy0Var = bz0.f3132b;
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
        this.f3560a.zzf();
    }
}
