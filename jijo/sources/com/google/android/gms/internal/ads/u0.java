package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0 f9329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f9330b;

    public u0(w0 w0Var, w0 w0Var2) {
        this.f9329a = w0Var;
        this.f9330b = w0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u0.class == obj.getClass()) {
            u0 u0Var = (u0) obj;
            if (this.f9329a.equals(u0Var.f9329a) && this.f9330b.equals(u0Var.f9330b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9330b.hashCode() + (this.f9329a.hashCode() * 31);
    }

    public final String toString() {
        w0 w0Var = this.f9329a;
        String string = w0Var.toString();
        w0 w0Var2 = this.f9330b;
        return "[" + string + (w0Var.equals(w0Var2) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : ", ".concat(w0Var2.toString())) + "]";
    }
}
