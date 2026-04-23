package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2889b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public b4(String str, String str2) {
        this.f2888a = yn0.a(str);
        this.f2889b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b4.class == obj.getClass()) {
            b4 b4Var = (b4) obj;
            if (yn0.c(this.f2888a, b4Var.f2888a) && yn0.c(this.f2889b, b4Var.f2889b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f2889b.hashCode() * 31;
        String str = this.f2888a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
