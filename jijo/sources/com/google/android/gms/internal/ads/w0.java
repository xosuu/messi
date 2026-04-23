package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w0 f10014c = new w0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f10016b;

    public w0(long j10, long j11) {
        this.f10015a = j10;
        this.f10016b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w0.class == obj.getClass()) {
            w0 w0Var = (w0) obj;
            if (this.f10015a == w0Var.f10015a && this.f10016b == w0Var.f10016b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10015a) * 31) + ((int) this.f10016b);
    }

    public final String toString() {
        return "[timeUs=" + this.f10015a + ", position=" + this.f10016b + "]";
    }
}
