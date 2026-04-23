package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s1 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f8757a = new ik0(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f8758b = new ik0(9);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f8759c = new ik0(11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik0 f8760d = new ik0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t1 f8761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i0 f8762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f8765i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8766j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8767k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8768l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8769m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8770n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public r1 f8771o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public u1 f8772p;

    public s1() {
        t1 t1Var = new t1(new f0());
        t1Var.f9027b = -9223372036854775807L;
        t1Var.f9028d = new long[0];
        t1Var.f9029f = new long[0];
        this.f8761e = t1Var;
        this.f8763g = 1;
    }

    public final ik0 a(h0 h0Var) {
        int i10 = this.f8768l;
        ik0 ik0Var = this.f8760d;
        byte[] bArr = ik0Var.f5633a;
        if (i10 > bArr.length) {
            int length = bArr.length;
            ik0Var.g(new byte[Math.max(length + length, i10)], 0);
        } else {
            ik0Var.i(0);
        }
        ik0Var.h(this.f8768l);
        ((a0) h0Var).h(ik0Var.f5633a, 0, this.f8768l, false);
        return ik0Var;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        if (j10 == 0) {
            this.f8763g = 1;
            this.f8764h = false;
        } else {
            this.f8763g = 3;
        }
        this.f8766j = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r17, com.google.android.gms.internal.ads.k0 r18) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.s1.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f8762f = i0Var;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        ik0 ik0Var = this.f8757a;
        a0 a0Var = (a0) h0Var;
        a0Var.m(ik0Var.f5633a, 0, 3, false);
        ik0Var.i(0);
        if (ik0Var.x() != 4607062) {
            return false;
        }
        a0Var.m(ik0Var.f5633a, 0, 2, false);
        ik0Var.i(0);
        if ((ik0Var.z() & 250) != 0) {
            return false;
        }
        a0Var.m(ik0Var.f5633a, 0, 4, false);
        ik0Var.i(0);
        int iQ = ik0Var.q();
        h0Var.zzj();
        a0 a0Var2 = (a0) h0Var;
        a0Var2.i(iQ, false);
        a0Var2.m(ik0Var.f5633a, 0, 4, false);
        ik0Var.i(0);
        return ik0Var.q() == 0;
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
