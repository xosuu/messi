package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class lp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6691b;

    public lp1(long j10, long j11) {
        this.f6690a = j10;
        this.f6691b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp1)) {
            return false;
        }
        lp1 lp1Var = (lp1) obj;
        return this.f6690a == lp1Var.f6690a && this.f6691b == lp1Var.f6691b;
    }

    public final int hashCode() {
        return (((int) this.f6690a) * 31) + ((int) this.f6691b);
    }
}
