package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class rx0 implements Serializable, qx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qx0 f8719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile transient boolean f8720b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object f8721d;

    public rx0(qx0 qx0Var) {
        this.f8719a = qx0Var;
    }

    public final String toString() {
        return fb1.i("Suppliers.memoize(", (this.f8720b ? fb1.i("<supplier that returned ", String.valueOf(this.f8721d), ">") : this.f8719a).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.qx0
    /* JADX INFO: renamed from: zza */
    public final Object mo3zza() {
        if (!this.f8720b) {
            synchronized (this) {
                try {
                    if (!this.f8720b) {
                        Object objMo3zza = this.f8719a.mo3zza();
                        this.f8721d = objMo3zza;
                        this.f8720b = true;
                        return objMo3zza;
                    }
                } finally {
                }
            }
        }
        return this.f8721d;
    }
}
