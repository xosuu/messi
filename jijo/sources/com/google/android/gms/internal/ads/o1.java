package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f7458b;

    public o1(int i10) {
        this.f7457a = i10;
        if (i10 != 1) {
            this.f7458b = new x0(16973, 2, "image/bmp");
        } else {
            this.f7458b = new x0(35152, 2, "image/png");
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        int i10 = this.f7457a;
        g0 g0Var = this.f7458b;
        switch (i10) {
            case 0:
                ((x0) g0Var).c(j10, j11);
                break;
            case 1:
                ((x0) g0Var).c(j10, j11);
                break;
            default:
                g0Var.c(j10, j11);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final int d(h0 h0Var, k0 k0Var) {
        int i10 = this.f7457a;
        g0 g0Var = this.f7458b;
        switch (i10) {
            case 0:
                return ((x0) g0Var).d(h0Var, k0Var);
            case 1:
                return ((x0) g0Var).d(h0Var, k0Var);
            default:
                return g0Var.d(h0Var, k0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        int i10 = this.f7457a;
        g0 g0Var = this.f7458b;
        switch (i10) {
            case 0:
                ((x0) g0Var).e(i0Var);
                break;
            case 1:
                ((x0) g0Var).e(i0Var);
                break;
            default:
                g0Var.e(i0Var);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        int i10 = this.f7457a;
        g0 g0Var = this.f7458b;
        switch (i10) {
            case 0:
                return ((x0) g0Var).f(h0Var);
            case 1:
                return ((x0) g0Var).f(h0Var);
            default:
                return g0Var.f(h0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        switch (this.f7457a) {
            case 0:
                zy0 zy0Var = bz0.f3132b;
                break;
            case 1:
                zy0 zy0Var2 = bz0.f3132b;
                break;
            default:
                zy0 zy0Var3 = bz0.f3132b;
                break;
        }
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }

    public o1() {
        this.f7457a = 2;
        this.f7458b = new v1();
    }
}
