package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hh1 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nh1 f5288a;

    public static void a(hh1 hh1Var, nh1 nh1Var) {
        if (hh1Var.f5288a != null) {
            throw new IllegalStateException();
        }
        hh1Var.f5288a = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        nh1 nh1Var = this.f5288a;
        if (nh1Var != null) {
            return nh1Var.zzb();
        }
        throw new IllegalStateException();
    }
}
