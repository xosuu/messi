package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class kc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6246c;

    public kc(int i10, String str, long j10) {
        this.f6244a = j10;
        this.f6245b = str;
        this.f6246c = i10;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof kc)) {
            kc kcVar = (kc) obj;
            if (kcVar.f6244a == this.f6244a && kcVar.f6246c == this.f6246c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f6244a;
    }
}
