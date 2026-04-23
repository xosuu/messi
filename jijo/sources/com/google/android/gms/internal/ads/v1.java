package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v1 implements g0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f9721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9724e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzagr f9726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h0 f9727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x1 f9728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h3 f9729j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f9720a = new ik0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f9725f = -1;

    public final int a(h0 h0Var) {
        ik0 ik0Var = this.f9720a;
        ik0Var.f(2);
        ((a0) h0Var).m(ik0Var.f5633a, 0, 2, false);
        return ik0Var.z();
    }

    public final void b() {
        i0 i0Var = this.f9721b;
        i0Var.getClass();
        i0Var.i();
        this.f9721b.p(new l0(-9223372036854775807L, 0L));
        this.f9722c = 6;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        if (j10 == 0) {
            this.f9722c = 0;
            this.f9729j = null;
        } else if (this.f9722c == 5) {
            h3 h3Var = this.f9729j;
            h3Var.getClass();
            h3Var.c(j10, j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:74:0x018c, code lost:
    
        r12 = -9223372036854775807L;
     */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r33, com.google.android.gms.internal.ads.k0 r34) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 717
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.v1.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f9721b = i0Var;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        if (a(h0Var) != 65496) {
            return false;
        }
        int iA = a(h0Var);
        this.f9723d = iA;
        ik0 ik0Var = this.f9720a;
        if (iA == 65504) {
            ik0Var.f(2);
            a0 a0Var = (a0) h0Var;
            a0Var.m(ik0Var.f5633a, 0, 2, false);
            a0Var.i(ik0Var.z() - 2, false);
            iA = a(h0Var);
            this.f9723d = iA;
        }
        if (iA == 65505) {
            a0 a0Var2 = (a0) h0Var;
            a0Var2.i(2, false);
            ik0Var.f(6);
            a0Var2.m(ik0Var.f5633a, 0, 6, false);
            if (ik0Var.D() == 1165519206 && ik0Var.z() == 0) {
                return true;
            }
        }
        return false;
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
