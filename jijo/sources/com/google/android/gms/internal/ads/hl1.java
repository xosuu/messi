package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hl1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final hl1 f5340d = new gl1().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5343c;

    public /* synthetic */ hl1(gl1 gl1Var) {
        this.f5341a = gl1Var.f4955a;
        this.f5342b = gl1Var.f4956b;
        this.f5343c = gl1Var.f4957c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hl1.class == obj.getClass()) {
            hl1 hl1Var = (hl1) obj;
            if (this.f5341a == hl1Var.f5341a && this.f5342b == hl1Var.f5342b && this.f5343c == hl1Var.f5343c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.f5341a ? 1 : 0) << 2;
        boolean z9 = this.f5342b;
        return (z9 ? 1 : 0) + (z9 ? 1 : 0) + i10 + (this.f5343c ? 1 : 0);
    }
}
