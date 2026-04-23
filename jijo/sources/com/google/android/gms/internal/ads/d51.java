package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d51 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c51 f3570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b51 f3572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t31 f3573d;

    public d51(c51 c51Var, String str, b51 b51Var, t31 t31Var) {
        this.f3570a = c51Var;
        this.f3571b = str;
        this.f3572c = b51Var;
        this.f3573d = t31Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f3570a != c51.f3189c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d51)) {
            return false;
        }
        d51 d51Var = (d51) obj;
        return d51Var.f3572c.equals(this.f3572c) && d51Var.f3573d.equals(this.f3573d) && d51Var.f3571b.equals(this.f3571b) && d51Var.f3570a.equals(this.f3570a);
    }

    public final int hashCode() {
        return Objects.hash(d51.class, this.f3571b, this.f3572c, this.f3573d, this.f3570a);
    }

    public final String toString() {
        return "LegacyKmsEnvelopeAead Parameters (kekUri: " + this.f3571b + ", dekParsingStrategy: " + String.valueOf(this.f3572c) + ", dekParametersForNewKeys: " + String.valueOf(this.f3573d) + ", variant: " + String.valueOf(this.f3570a) + ")";
    }
}
