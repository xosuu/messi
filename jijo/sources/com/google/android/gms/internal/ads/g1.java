package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g1 implements g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a4 f4747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4748e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public h1 f4750g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4753j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public j1 f4754k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4758o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4759p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4746c = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f4744a = new ik0(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4.c f4745b = new b4.c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f4749f = new qz(7, (g1.a) null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j1[] f4752i = new j1[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f4756m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f4757n = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4755l = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4751h = -9223372036854775807L;

    public g1(qz qzVar) {
        this.f4747d = qzVar;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        this.f4753j = -1L;
        this.f4754k = null;
        for (j1 j1Var : this.f4752i) {
            if (j1Var.f5764j == 0) {
                j1Var.f5762h = 0;
            } else {
                j1Var.f5762h = j1Var.f5766l[yn0.l(j1Var.f5765k, j10, true)];
            }
        }
        if (j10 == 0) {
            this.f4748e = this.f4752i.length != 0 ? 3 : 0;
        } else {
            this.f4748e = 6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:171:0x039c  */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r27, com.google.android.gms.internal.ads.k0 r28) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 1098
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g1.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f4748e = 0;
        if (this.f4746c) {
            i0Var = new ur0(i0Var, this.f4747d);
        }
        this.f4749f = i0Var;
        this.f4753j = -1L;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        ik0 ik0Var = this.f4744a;
        ((a0) h0Var).m(ik0Var.f5633a, 0, 12, false);
        ik0Var.i(0);
        if (ik0Var.r() != 1179011410) {
            return false;
        }
        ik0Var.j(4);
        return ik0Var.r() == 541677121;
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
