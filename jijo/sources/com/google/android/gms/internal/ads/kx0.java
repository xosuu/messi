package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kx0 extends hx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6411a;

    public kx0(Object obj) {
        this.f6411a = obj;
    }

    @Override // com.google.android.gms.internal.ads.hx0
    public final hx0 a(b3 b3Var) {
        Object objApply = b3Var.apply(this.f6411a);
        en1.t0(objApply, "the Function passed to Optional.transform() must not return null.");
        return new kx0(objApply);
    }

    @Override // com.google.android.gms.internal.ads.hx0
    public final Object b() {
        return this.f6411a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kx0) {
            return this.f6411a.equals(((kx0) obj).f6411a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6411a.hashCode() + 1502476572;
    }

    public final String toString() {
        return fb1.i("Optional.of(", this.f6411a.toString(), ")");
    }
}
