package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class mn1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7017c;

    public mn1(String str, boolean z9, boolean z10) {
        this.f7015a = str;
        this.f7016b = z9;
        this.f7017c = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == mn1.class) {
            mn1 mn1Var = (mn1) obj;
            if (TextUtils.equals(this.f7015a, mn1Var.f7015a) && this.f7016b == mn1Var.f7016b && this.f7017c == mn1Var.f7017c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f7015a.hashCode() + 31) * 31) + (true != this.f7016b ? 1237 : 1231)) * 31) + (true != this.f7017c ? 1237 : 1231);
    }
}
