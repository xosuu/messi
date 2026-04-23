package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class nf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f.x0 f7255b = new f.x0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7257d;

    public nf0(Object obj) {
        this.f7254a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nf0.class != obj.getClass()) {
            return false;
        }
        return this.f7254a.equals(((nf0) obj).f7254a);
    }

    public final int hashCode() {
        return this.f7254a.hashCode();
    }
}
