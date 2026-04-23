package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class jo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f6052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f6056e;

    public jo1(Object obj, int i10, int i11, long j10, int i12) {
        this.f6052a = obj;
        this.f6053b = i10;
        this.f6054c = i11;
        this.f6055d = j10;
        this.f6056e = i12;
    }

    public final jo1 a(Object obj) {
        return this.f6052a.equals(obj) ? this : new jo1(obj, this.f6053b, this.f6054c, this.f6055d, this.f6056e);
    }

    public final boolean b() {
        return this.f6053b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo1)) {
            return false;
        }
        jo1 jo1Var = (jo1) obj;
        return this.f6052a.equals(jo1Var.f6052a) && this.f6053b == jo1Var.f6053b && this.f6054c == jo1Var.f6054c && this.f6055d == jo1Var.f6055d && this.f6056e == jo1Var.f6056e;
    }

    public final int hashCode() {
        return ((((((((this.f6052a.hashCode() + 527) * 31) + this.f6053b) * 31) + this.f6054c) * 31) + ((int) this.f6055d)) * 31) + this.f6056e;
    }

    public jo1(long j10, Object obj) {
        this(obj, -1, -1, j10, -1);
    }

    public jo1(Object obj, long j10, int i10) {
        this(obj, -1, -1, j10, i10);
    }
}
