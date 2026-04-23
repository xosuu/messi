package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h61 extends l31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g71 f5224a;

    public h61(g71 g71Var) {
        this.f5224a = g71Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f5224a.f4843b.D() != ua1.RAW;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h61)) {
            return false;
        }
        g71 g71Var = ((h61) obj).f5224a;
        g71 g71Var2 = this.f5224a;
        if (g71Var2.f4843b.D().equals(g71Var.f4843b.D())) {
            String strF = g71Var2.f4843b.F();
            ba1 ba1Var = g71Var.f4843b;
            if (strF.equals(ba1Var.F()) && g71Var2.f4843b.E().equals(ba1Var.E())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        g71 g71Var = this.f5224a;
        return Objects.hash(g71Var.f4843b, g71Var.f4842a);
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        g71 g71Var = this.f5224a;
        objArr[0] = g71Var.f4843b.F();
        int iOrdinal = g71Var.f4843b.D().ordinal();
        objArr[1] = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
