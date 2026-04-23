package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class tw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9298b;

    public tw0(int i10, String str) {
        this.f9297a = i10;
        this.f9298b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tw0) {
            tw0 tw0Var = (tw0) obj;
            if (this.f9297a == tw0Var.f9297a) {
                String str = tw0Var.f9298b;
                String str2 = this.f9298b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9298b;
        return (str == null ? 0 : str.hashCode()) ^ ((this.f9297a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OverlayDisplayState{statusCode=");
        sb.append(this.f9297a);
        sb.append(", sessionToken=");
        return g1.a.r(sb, this.f9298b, "}");
    }
}
