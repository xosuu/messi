package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l5 implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f6495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1 f6496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i0 f6497e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f6498f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f6500h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f6501i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m5 f6493a = new m5(0, null, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f6494b = new ik0(2048);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f6499g = -1;

    public l5() {
        ik0 ik0Var = new ik0(10);
        this.f6495c = ik0Var;
        byte[] bArr = ik0Var.f5633a;
        this.f6496d = new d1(bArr, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        this.f6500h = false;
        this.f6493a.zze();
        this.f6498f = j11;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final int d(h0 h0Var, k0 k0Var) {
        tc1.A(this.f6497e);
        ik0 ik0Var = this.f6494b;
        int iB = h0Var.b(0, ik0Var.f5633a, 2048);
        if (!this.f6501i) {
            this.f6497e.p(new l0(-9223372036854775807L, 0L));
            this.f6501i = true;
        }
        if (iB == -1) {
            return -1;
        }
        ik0Var.i(0);
        ik0Var.h(iB);
        boolean z9 = this.f6500h;
        m5 m5Var = this.f6493a;
        if (!z9) {
            m5Var.f6866t = this.f6498f;
            this.f6500h = true;
        }
        m5Var.c(ik0Var);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f6497e = i0Var;
        this.f6493a.d(i0Var, new q2.d(Integer.MIN_VALUE, 0, 1));
        i0Var.i();
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        ik0 ik0Var;
        int i10 = 0;
        while (true) {
            ik0Var = this.f6495c;
            a0 a0Var = (a0) h0Var;
            a0Var.m(ik0Var.f5633a, 0, 10, false);
            ik0Var.i(0);
            if (ik0Var.x() != 4801587) {
                break;
            }
            ik0Var.j(3);
            int iU = ik0Var.u();
            i10 += iU + 10;
            a0Var.i(iU, false);
        }
        h0Var.zzj();
        a0 a0Var2 = (a0) h0Var;
        a0Var2.i(i10, false);
        if (this.f6499g == -1) {
            this.f6499g = i10;
        }
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        do {
            a0Var2.m(ik0Var.f5633a, 0, 2, false);
            ik0Var.i(0);
            if ((ik0Var.z() & 65526) == 65520) {
                i12++;
                if (i12 >= 4 && i13 > 188) {
                    return true;
                }
                a0Var2.m(ik0Var.f5633a, 0, 4, false);
                d1 d1Var = this.f6496d;
                d1Var.k(14);
                int iE = d1Var.e(13);
                if (iE <= 6) {
                    i11++;
                    h0Var.zzj();
                    a0Var2.i(i11, false);
                } else {
                    a0Var2.i(iE - 6, false);
                    i13 += iE;
                }
            } else {
                i11++;
                h0Var.zzj();
                a0Var2.i(i11, false);
            }
            i12 = 0;
            i13 = 0;
        } while (i11 - i10 < 8192);
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
