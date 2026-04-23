package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f6206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f6207b;

    public /* synthetic */ k71(Class cls, Class cls2) {
        this.f6206a = cls;
        this.f6207b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k71)) {
            return false;
        }
        k71 k71Var = (k71) obj;
        return k71Var.f6206a.equals(this.f6206a) && k71Var.f6207b.equals(this.f6207b);
    }

    public final int hashCode() {
        return Objects.hash(this.f6206a, this.f6207b);
    }

    public final String toString() {
        return fb1.x(this.f6206a.getSimpleName(), " with serialization type: ", this.f6207b.getSimpleName());
    }
}
