package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y41 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x41 f10769b;

    public y41(String str, x41 x41Var) {
        this.f10768a = str;
        this.f10769b = x41Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f10769b != x41.f10427c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y41)) {
            return false;
        }
        y41 y41Var = (y41) obj;
        return y41Var.f10768a.equals(this.f10768a) && y41Var.f10769b.equals(this.f10769b);
    }

    public final int hashCode() {
        return Objects.hash(y41.class, this.f10768a, this.f10769b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f10768a + ", variant: " + this.f10769b.f10428a + ")";
    }
}
