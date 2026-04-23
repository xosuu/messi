package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class e01 extends vz0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vz0 f3785a;

    public e01(ry0 ry0Var) {
        this.f3785a = ry0Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f3785a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e01) {
            return this.f3785a.equals(((e01) obj).f3785a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f3785a.hashCode();
    }

    public final String toString() {
        return this.f3785a.toString().concat(".reverse()");
    }
}
