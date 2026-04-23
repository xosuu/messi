package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class jh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Drawable f5952c;

    public jh0(String str, String str2, Drawable drawable) {
        if (str == null) {
            throw new NullPointerException("Null advertiserName");
        }
        this.f5950a = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.f5951b = str2;
        this.f5952c = drawable;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jh0) {
            jh0 jh0Var = (jh0) obj;
            if (this.f5950a.equals(jh0Var.f5950a) && this.f5951b.equals(jh0Var.f5951b)) {
                Drawable drawable = jh0Var.f5952c;
                Drawable drawable2 = this.f5952c;
                if (drawable2 != null ? drawable2.equals(drawable) : drawable == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.f5950a.hashCode() ^ 1000003) * 1000003) ^ this.f5951b.hashCode();
        Drawable drawable = this.f5952c;
        return (iHashCode * 1000003) ^ (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        return "OfflineAdAssets{advertiserName=" + this.f5950a + ", imageUrl=" + this.f5951b + ", icon=" + String.valueOf(this.f5952c) + "}";
    }
}
