package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f10390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b1 f10391g;

    public x0(int i10, int i11, String str) {
        this.f10385a = i10;
        this.f10386b = i11;
        this.f10387c = str;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        if (j10 == 0 || this.f10389e == 1) {
            this.f10389e = 1;
            this.f10388d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final int d(h0 h0Var, k0 k0Var) {
        int i10 = this.f10389e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        b1 b1Var = this.f10391g;
        b1Var.getClass();
        int iD = b1Var.d(h0Var, 1024, true);
        if (iD == -1) {
            this.f10389e = 2;
            this.f10391g.e(0L, 1, this.f10388d, 0, null);
            this.f10388d = 0;
        } else {
            this.f10388d += iD;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f10390f = i0Var;
        b1 b1VarJ = i0Var.j(1024, 4);
        this.f10391g = b1VarJ;
        q0 q0Var = new q0();
        q0Var.f(this.f10387c);
        b1VarJ.c(new y1(q0Var));
        this.f10390f.i();
        this.f10390f.p(new y0());
        this.f10389e = 1;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        int i10 = this.f10386b;
        int i11 = this.f10385a;
        tc1.W((i11 == -1 || i10 == -1) ? false : true);
        ik0 ik0Var = new ik0(i10);
        ((a0) h0Var).m(ik0Var.f5633a, 0, i10, false);
        return ik0Var.z() == i11;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        zy0 zy0Var = bz0.f3132b;
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }
}
