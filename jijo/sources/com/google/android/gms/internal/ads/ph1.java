package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ph1 implements nh1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f7883c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile nh1 f7884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f7885b;

    public static nh1 a(jh1 jh1Var) {
        if ((jh1Var instanceof ph1) || (jh1Var instanceof ih1)) {
            return jh1Var;
        }
        ph1 ph1Var = new ph1();
        ph1Var.f7885b = f7883c;
        ph1Var.f7884a = jh1Var;
        return ph1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Object obj = this.f7885b;
        if (obj != f7883c) {
            return obj;
        }
        nh1 nh1Var = this.f7884a;
        if (nh1Var == null) {
            return this.f7885b;
        }
        Object objZzb = nh1Var.zzb();
        this.f7885b = objZzb;
        this.f7884a = null;
        return objZzb;
    }
}
