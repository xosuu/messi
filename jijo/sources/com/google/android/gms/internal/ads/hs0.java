package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hs0 implements fs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5388a;

    public hs0(String str) {
        this.f5388a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hs0) {
            return this.f5388a.equals(((hs0) obj).f5388a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5388a.hashCode();
    }

    public final String toString() {
        return this.f5388a;
    }
}
