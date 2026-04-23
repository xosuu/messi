package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p41 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n41 f7804b;

    public p41(int i10, n41 n41Var) {
        this.f7803a = i10;
        this.f7804b = n41Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f7804b != n41.f7142d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p41)) {
            return false;
        }
        p41 p41Var = (p41) obj;
        return p41Var.f7803a == this.f7803a && p41Var.f7804b == this.f7804b;
    }

    public final int hashCode() {
        return Objects.hash(p41.class, Integer.valueOf(this.f7803a), this.f7804b);
    }

    public final String toString() {
        return l.a0.h(fb1.k("AesGcmSiv Parameters (variant: ", String.valueOf(this.f7804b), ", "), this.f7803a, "-byte key)");
    }
}
