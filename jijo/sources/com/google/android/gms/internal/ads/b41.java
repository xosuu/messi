package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b41 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a41 f2895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final z31 f2896f;

    public b41(int i10, int i11, int i12, int i13, a41 a41Var, z31 z31Var) {
        this.f2891a = i10;
        this.f2892b = i11;
        this.f2893c = i12;
        this.f2894d = i13;
        this.f2895e = a41Var;
        this.f2896f = z31Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f2895e != a41.f2579d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b41)) {
            return false;
        }
        b41 b41Var = (b41) obj;
        return b41Var.f2891a == this.f2891a && b41Var.f2892b == this.f2892b && b41Var.f2893c == this.f2893c && b41Var.f2894d == this.f2894d && b41Var.f2895e == this.f2895e && b41Var.f2896f == this.f2896f;
    }

    public final int hashCode() {
        return Objects.hash(b41.class, Integer.valueOf(this.f2891a), Integer.valueOf(this.f2892b), Integer.valueOf(this.f2893c), Integer.valueOf(this.f2894d), this.f2895e, this.f2896f);
    }

    public final String toString() {
        StringBuilder sbL = l.a0.l("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.f2895e), ", hashType: ", String.valueOf(this.f2896f), ", ");
        sbL.append(this.f2893c);
        sbL.append("-byte IV, and ");
        sbL.append(this.f2894d);
        sbL.append("-byte tags, and ");
        sbL.append(this.f2891a);
        sbL.append("-byte AES key, and ");
        return l.a0.h(sbL, this.f2892b, "-byte HMAC key)");
    }
}
