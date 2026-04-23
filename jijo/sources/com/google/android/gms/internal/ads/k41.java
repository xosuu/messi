package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k41 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j41 f6178b;

    public k41(int i10, j41 j41Var) {
        this.f6177a = i10;
        this.f6178b = j41Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f6178b != j41.f5799d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k41)) {
            return false;
        }
        k41 k41Var = (k41) obj;
        return k41Var.f6177a == this.f6177a && k41Var.f6178b == this.f6178b;
    }

    public final int hashCode() {
        return Objects.hash(k41.class, Integer.valueOf(this.f6177a), 12, 16, this.f6178b);
    }

    public final String toString() {
        return l.a0.h(fb1.k("AesGcm Parameters (variant: ", String.valueOf(this.f6178b), ", 12-byte IV, 16-byte tag, and "), this.f6177a, "-byte key)");
    }
}
