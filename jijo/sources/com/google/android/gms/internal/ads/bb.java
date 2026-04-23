package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;

/* JADX INFO: loaded from: classes.dex */
public final class bb extends ib {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final aa f2949h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f2950i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f2951j;

    public bb(ja jaVar, j8 j8Var, int i10, aa aaVar, long j10, long j11) {
        super(jaVar, "gAg/p/cQzJRjYz9LhE8cRk72DVV1Cpozf/TbzvACqLcTgM3sRjMEb3DCmwYhMmhP", "avDZD6/xoSbFYvWCy23XLncB75oD5DxKdrTKFY2O0hY=", j8Var, i10, 11);
        this.f2949h = aaVar;
        this.f2950i = j10;
        this.f2951j = j11;
    }

    @Override // com.google.android.gms.internal.ads.ib
    public final void a() {
        aa aaVar = this.f2949h;
        if (aaVar != null) {
            z9 z9Var = new z9((String) this.f5556e.invoke(null, (NetworkCapabilities) aaVar.f2626b, Long.valueOf(this.f2950i), Long.valueOf(this.f2951j)), 0);
            synchronized (this.f5555d) {
                try {
                    j8 j8Var = this.f5555d;
                    long jLongValue = z9Var.f11185b.longValue();
                    j8Var.d();
                    x8.E0((x8) j8Var.f9462b, jLongValue);
                    if (((Long) z9Var.f11186c).longValue() >= 0) {
                        j8 j8Var2 = this.f5555d;
                        long jLongValue2 = ((Long) z9Var.f11186c).longValue();
                        j8Var2.d();
                        x8.b0((x8) j8Var2.f9462b, jLongValue2);
                    }
                    if (((Long) z9Var.f11187d).longValue() >= 0) {
                        j8 j8Var3 = this.f5555d;
                        long jLongValue3 = ((Long) z9Var.f11187d).longValue();
                        j8Var3.d();
                        x8.c0((x8) j8Var3.f9462b, jLongValue3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
