package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tb1 f5825b;

    public /* synthetic */ j71(Class cls, tb1 tb1Var) {
        this.f5824a = cls;
        this.f5825b = tb1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j71)) {
            return false;
        }
        j71 j71Var = (j71) obj;
        return j71Var.f5824a.equals(this.f5824a) && j71Var.f5825b.equals(this.f5825b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5824a, this.f5825b);
    }

    public final String toString() {
        return fb1.x(this.f5824a.getSimpleName(), ", object identifier: ", String.valueOf(this.f5825b));
    }
}
