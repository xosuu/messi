package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f2552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2554d;

    public a1(int i10, int i11, int i12, byte[] bArr) {
        this.f2551a = i10;
        this.f2552b = bArr;
        this.f2553c = i11;
        this.f2554d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a1.class == obj.getClass()) {
            a1 a1Var = (a1) obj;
            if (this.f2551a == a1Var.f2551a && this.f2553c == a1Var.f2553c && this.f2554d == a1Var.f2554d && Arrays.equals(this.f2552b, a1Var.f2552b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f2552b) + (this.f2551a * 31)) * 31) + this.f2553c) * 31) + this.f2554d;
    }
}
