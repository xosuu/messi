package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class qw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8307b;

    public qw0(String str, String str2) {
        this.f8306a = str;
        this.f8307b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qw0) {
            qw0 qw0Var = (qw0) obj;
            String str = this.f8306a;
            if (str != null ? str.equals(qw0Var.f8306a) : qw0Var.f8306a == null) {
                String str2 = this.f8307b;
                if (str2 != null ? str2.equals(qw0Var.f8307b) : qw0Var.f8307b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8306a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f8307b;
        return (str2 != null ? str2.hashCode() : 0) ^ ((iHashCode ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayDismissRequest{sessionToken=");
        sb.append(this.f8306a);
        sb.append(", appId=");
        return g1.a.r(sb, this.f8307b, "}");
    }
}
