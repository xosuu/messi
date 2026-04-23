package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f9040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f9042f = new int[255];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ik0 f9043g = new ik0(255);

    public final boolean a(h0 h0Var, boolean z9) throws zzbo, EOFException {
        this.f9037a = 0;
        this.f9038b = 0L;
        this.f9039c = 0;
        this.f9040d = 0;
        this.f9041e = 0;
        ik0 ik0Var = this.f9043g;
        ik0Var.f(27);
        try {
            if (h0Var.m(ik0Var.f5633a, 0, 27, z9) && ik0Var.D() == 1332176723) {
                if (ik0Var.v() != 0) {
                    if (z9) {
                        return false;
                    }
                    throw zzbo.b("unsupported bit stream revision");
                }
                this.f9037a = ik0Var.v();
                this.f9038b = ik0Var.A();
                ik0Var.B();
                ik0Var.B();
                ik0Var.B();
                int iV = ik0Var.v();
                this.f9039c = iV;
                this.f9040d = iV + 27;
                ik0Var.f(iV);
                try {
                    if (h0Var.m(ik0Var.f5633a, 0, this.f9039c, z9)) {
                        for (int i10 = 0; i10 < this.f9039c; i10++) {
                            int iV2 = ik0Var.v();
                            this.f9042f[i10] = iV2;
                            this.f9041e += iV2;
                        }
                        return true;
                    }
                } catch (EOFException e10) {
                    if (!z9) {
                        throw e10;
                    }
                }
                return false;
            }
        } catch (EOFException e11) {
            if (!z9) {
                throw e11;
            }
        }
        return false;
    }

    public final boolean b(h0 h0Var, long j10) {
        tc1.K(h0Var.zzf() == h0Var.zze());
        ik0 ik0Var = this.f9043g;
        ik0Var.f(4);
        while (true) {
            if (j10 != -1 && h0Var.zzf() + 4 >= j10) {
                break;
            }
            try {
                if (!h0Var.m(ik0Var.f5633a, 0, 4, true)) {
                    break;
                }
                ik0Var.i(0);
                if (ik0Var.D() == 1332176723) {
                    h0Var.zzj();
                    return true;
                }
                ((a0) h0Var).j(1);
            } catch (EOFException unused) {
            }
        }
        do {
            if (j10 != -1 && h0Var.zzf() >= j10) {
                break;
            }
        } while (h0Var.k(1) != -1);
        return false;
    }
}
