package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class d7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3591b;

    public d7(String str, String str2) {
        this.f3590a = str;
        this.f3591b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d7.class == obj.getClass()) {
            d7 d7Var = (d7) obj;
            if (TextUtils.equals(this.f3590a, d7Var.f3590a) && TextUtils.equals(this.f3591b, d7Var.f3591b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f3591b.hashCode() + (this.f3590a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f3590a);
        sb.append(",value=");
        return g1.a.r(sb, this.f3591b, "]");
    }
}
