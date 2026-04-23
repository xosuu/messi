package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ij1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo1 f5622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f5628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f5629h;

    public ij1(jo1 jo1Var, long j10, long j11, long j12, long j13, boolean z9, boolean z10, boolean z11) {
        tc1.K(!z11 || z9);
        tc1.K(!z10 || z9);
        this.f5622a = jo1Var;
        this.f5623b = j10;
        this.f5624c = j11;
        this.f5625d = j12;
        this.f5626e = j13;
        this.f5627f = z9;
        this.f5628g = z10;
        this.f5629h = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ij1.class == obj.getClass()) {
            ij1 ij1Var = (ij1) obj;
            if (this.f5623b == ij1Var.f5623b && this.f5624c == ij1Var.f5624c && this.f5625d == ij1Var.f5625d && this.f5626e == ij1Var.f5626e && this.f5627f == ij1Var.f5627f && this.f5628g == ij1Var.f5628g && this.f5629h == ij1Var.f5629h && yn0.c(this.f5622a, ij1Var.f5622a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f5622a.hashCode() + 527) * 31) + ((int) this.f5623b)) * 31) + ((int) this.f5624c)) * 31) + ((int) this.f5625d)) * 31) + ((int) this.f5626e)) * 961) + (this.f5627f ? 1 : 0)) * 31) + (this.f5628g ? 1 : 0)) * 31) + (this.f5629h ? 1 : 0);
    }
}
