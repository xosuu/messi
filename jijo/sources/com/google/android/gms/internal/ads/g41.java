package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g41 extends t31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e41 f4815c;

    public g41(int i10, int i11, e41 e41Var) {
        this.f4813a = i10;
        this.f4814b = i11;
        this.f4815c = e41Var;
    }

    @Override // com.google.android.gms.internal.ads.l31
    public final boolean a() {
        return this.f4815c != e41.f3857d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g41)) {
            return false;
        }
        g41 g41Var = (g41) obj;
        return g41Var.f4813a == this.f4813a && g41Var.f4814b == this.f4814b && g41Var.f4815c == this.f4815c;
    }

    public final int hashCode() {
        return Objects.hash(g41.class, Integer.valueOf(this.f4813a), Integer.valueOf(this.f4814b), 16, this.f4815c);
    }

    public final String toString() {
        StringBuilder sbK = fb1.k("AesEax Parameters (variant: ", String.valueOf(this.f4815c), ", ");
        sbK.append(this.f4814b);
        sbK.append("-byte IV, 16-byte tag, and ");
        return l.a0.h(sbK, this.f4813a, "-byte key)");
    }
}
