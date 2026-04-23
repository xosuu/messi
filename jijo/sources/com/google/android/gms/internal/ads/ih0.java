package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ih0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f5613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f5614b;

    public ih0(nh1 nh1Var, fh0 fh0Var) {
        this.f5613a = nh1Var;
        this.f5614b = fh0Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        dh0 dh0Var = (dh0) this.f5613a.zzb();
        fh0 fh0Var = (fh0) this.f5614b;
        return new wc0(dh0Var, new eh0(((bh0) fh0Var.f4526a).zzb(), ((iy) fh0Var.f4527b).zzb()));
    }
}
