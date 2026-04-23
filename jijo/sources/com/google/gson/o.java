package com.google.gson;

/* JADX INFO: loaded from: classes.dex */
public final class o extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.gson.internal.k f12257a = new com.google.gson.internal.k(false);

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f12257a.equals(this.f12257a));
    }

    public final int hashCode() {
        return this.f12257a.hashCode();
    }
}
