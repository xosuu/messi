package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class mp0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gp0 f7028a;

    public mp0(gp0 gp0Var) {
        this.f7028a = gp0Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        boolean z9;
        gp0 gp0Var = this.f7028a;
        switch (gp0Var.f5024a) {
            case 0:
                z9 = ((zzbuc) gp0Var.f5026d).f11562u;
                break;
            default:
                z9 = ((zzbvb) gp0Var.f5026d).f11585x;
                break;
        }
        return Boolean.valueOf(z9);
    }
}
