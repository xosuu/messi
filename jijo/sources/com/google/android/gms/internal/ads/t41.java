package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t41 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s41 f9046a;

    public t41(s41 s41Var) {
        this.f9046a = s41Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f9046a != s41.f8794d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof t41) && ((t41) obj).f9046a == this.f9046a;
    }

    public final int hashCode() {
        return Objects.hash(t41.class, this.f9046a);
    }

    public final String toString() {
        return fb1.i("ChaCha20Poly1305 Parameters (variant: ", this.f9046a.f8795a, ")");
    }
}
