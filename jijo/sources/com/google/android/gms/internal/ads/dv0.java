package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class dv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3755c;

    public dv0(String str, boolean z9, boolean z10) {
        this.f3753a = str;
        this.f3754b = z9;
        this.f3755c = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dv0) {
            dv0 dv0Var = (dv0) obj;
            if (this.f3753a.equals(dv0Var.f3753a) && this.f3754b == dv0Var.f3754b && this.f3755c == dv0Var.f3755c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3753a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f3754b ? 1237 : 1231)) * 1000003) ^ (true != this.f3755c ? 1237 : 1231);
    }

    public final String toString() {
        return "AdShield2Options{clientVersion=" + this.f3753a + ", shouldGetAdvertisingId=" + this.f3754b + ", isGooglePlayServicesAvailable=" + this.f3755c + "}";
    }
}
