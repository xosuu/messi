package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r71 extends c81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q71 f8432c;

    public r71(int i10, int i11, q71 q71Var) {
        this.f8430a = i10;
        this.f8431b = i11;
        this.f8432c = q71Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f8432c != q71.f8134e;
    }

    public final int b() {
        q71 q71Var = q71.f8134e;
        int i10 = this.f8431b;
        q71 q71Var2 = this.f8432c;
        if (q71Var2 == q71Var) {
            return i10;
        }
        if (q71Var2 == q71.f8131b || q71Var2 == q71.f8132c || q71Var2 == q71.f8133d) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r71)) {
            return false;
        }
        r71 r71Var = (r71) obj;
        return r71Var.f8430a == this.f8430a && r71Var.b() == b() && r71Var.f8432c == this.f8432c;
    }

    public final int hashCode() {
        return Objects.hash(r71.class, Integer.valueOf(this.f8430a), Integer.valueOf(this.f8431b), this.f8432c);
    }

    public final String toString() {
        StringBuilder sbK = fb1.k("AES-CMAC Parameters (variant: ", String.valueOf(this.f8432c), ", ");
        sbK.append(this.f8431b);
        sbK.append("-byte tags, and ");
        return l.a0.h(sbK, this.f8430a, "-byte key)");
    }
}
