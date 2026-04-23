package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9935b;

    public vo1(int i10, boolean z9) {
        this.f9934a = i10;
        this.f9935b = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vo1.class == obj.getClass()) {
            vo1 vo1Var = (vo1) obj;
            if (this.f9934a == vo1Var.f9934a && this.f9935b == vo1Var.f9935b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f9934a * 31) + (this.f9935b ? 1 : 0);
    }
}
