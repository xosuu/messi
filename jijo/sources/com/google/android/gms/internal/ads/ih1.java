package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ih1 implements nh1, eh1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f5615c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile nh1 f5616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f5617b = f5615c;

    public ih1(nh1 nh1Var) {
        this.f5616a = nh1Var;
    }

    public static eh1 a(nh1 nh1Var) {
        return nh1Var instanceof eh1 ? (eh1) nh1Var : new ih1(nh1Var);
    }

    public static nh1 b(jh1 jh1Var) {
        return jh1Var instanceof ih1 ? jh1Var : new ih1(jh1Var);
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Object objZzb = this.f5617b;
        Object obj = f5615c;
        if (objZzb == obj) {
            synchronized (this) {
                try {
                    objZzb = this.f5617b;
                    if (objZzb == obj) {
                        objZzb = this.f5616a.zzb();
                        Object obj2 = this.f5617b;
                        if (obj2 != obj && obj2 != objZzb) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                        }
                        this.f5617b = objZzb;
                        this.f5616a = null;
                    }
                } finally {
                }
            }
        }
        return objZzb;
    }
}
