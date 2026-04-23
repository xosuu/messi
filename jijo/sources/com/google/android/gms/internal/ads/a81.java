package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a81 extends c81 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z71 f2622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y71 f2623d;

    public a81(int i10, int i11, z71 z71Var, y71 y71Var) {
        this.f2620a = i10;
        this.f2621b = i11;
        this.f2622c = z71Var;
        this.f2623d = y71Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f2622c != z71.f11181e;
    }

    public final int b() {
        z71 z71Var = z71.f11181e;
        int i10 = this.f2621b;
        z71 z71Var2 = this.f2622c;
        if (z71Var2 == z71Var) {
            return i10;
        }
        if (z71Var2 == z71.f11178b || z71Var2 == z71.f11179c || z71Var2 == z71.f11180d) {
            return i10 + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a81)) {
            return false;
        }
        a81 a81Var = (a81) obj;
        return a81Var.f2620a == this.f2620a && a81Var.b() == b() && a81Var.f2622c == this.f2622c && a81Var.f2623d == this.f2623d;
    }

    public final int hashCode() {
        return Objects.hash(a81.class, Integer.valueOf(this.f2620a), Integer.valueOf(this.f2621b), this.f2622c, this.f2623d);
    }

    public final String toString() {
        StringBuilder sbL = l.a0.l("HMAC Parameters (variant: ", String.valueOf(this.f2622c), ", hashType: ", String.valueOf(this.f2623d), ", ");
        sbL.append(this.f2621b);
        sbL.append("-byte tags, and ");
        return l.a0.h(sbL, this.f2620a, "-byte key)");
    }
}
