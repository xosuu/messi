package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class sx0 implements qx0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final vq0 f8991d = new vq0(15, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile qx0 f8992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f8993b;

    public final String toString() {
        Object objI = this.f8992a;
        if (objI == f8991d) {
            objI = fb1.i("<supplier that returned ", String.valueOf(this.f8993b), ">");
        }
        return fb1.i("Suppliers.memoize(", String.valueOf(objI), ")");
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        qx0 qx0Var = this.f8992a;
        vq0 vq0Var = f8991d;
        if (qx0Var != vq0Var) {
            synchronized (this) {
                try {
                    if (this.f8992a != vq0Var) {
                        Object objMo3zza = this.f8992a.mo3zza();
                        this.f8993b = objMo3zza;
                        this.f8992a = vq0Var;
                        return objMo3zza;
                    }
                } finally {
                }
            }
        }
        return this.f8993b;
    }
}
