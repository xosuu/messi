package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ry0 extends vz0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f8723a;

    public ry0(e5 e5Var) {
        this.f8723a = e5Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f8723a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ry0) {
            return this.f8723a.equals(((ry0) obj).f8723a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8723a.hashCode();
    }

    public final String toString() {
        return this.f8723a.toString();
    }
}
