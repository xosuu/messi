package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class b71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f2932b;

    public /* synthetic */ b71(Class cls, Class cls2) {
        this.f2931a = cls;
        this.f2932b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b71)) {
            return false;
        }
        b71 b71Var = (b71) obj;
        return b71Var.f2931a.equals(this.f2931a) && b71Var.f2932b.equals(this.f2932b);
    }

    public final int hashCode() {
        return Objects.hash(this.f2931a, this.f2932b);
    }

    public final String toString() {
        return fb1.x(this.f2931a.getSimpleName(), " with primitive type: ", this.f2932b.getSimpleName());
    }
}
