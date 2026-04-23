package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4540c;

    public /* synthetic */ fj1(ej1 ej1Var) {
        this.f4538a = ej1Var.f4209a;
        this.f4539b = ej1Var.f4210b;
        this.f4540c = ej1Var.f4211c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj1)) {
            return false;
        }
        fj1 fj1Var = (fj1) obj;
        return this.f4538a == fj1Var.f4538a && this.f4539b == fj1Var.f4539b && this.f4540c == fj1Var.f4540c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f4538a), Float.valueOf(this.f4539b), Long.valueOf(this.f4540c)});
    }
}
