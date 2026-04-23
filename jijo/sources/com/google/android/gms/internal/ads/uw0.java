package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class uw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9638b;

    public uw0(String str, String str2) {
        this.f9637a = str;
        this.f9638b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uw0) {
            uw0 uw0Var = (uw0) obj;
            String str = this.f9637a;
            if (str != null ? str.equals(uw0Var.f9637a) : uw0Var.f9637a == null) {
                String str2 = this.f9638b;
                if (str2 != null ? str2.equals(uw0Var.f9638b) : uw0Var.f9638b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9637a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f9638b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayUpdateRequest{sessionToken=");
        sb.append(this.f9637a);
        sb.append(", appId=");
        return g1.a.r(sb, this.f9638b, "}");
    }
}
