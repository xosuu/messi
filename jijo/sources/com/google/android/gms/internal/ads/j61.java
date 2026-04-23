package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j61 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f31 f5809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5812d;

    public /* synthetic */ j61(f31 f31Var, int i10, String str, String str2) {
        this.f5809a = f31Var;
        this.f5810b = i10;
        this.f5811c = str;
        this.f5812d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j61)) {
            return false;
        }
        j61 j61Var = (j61) obj;
        return this.f5809a == j61Var.f5809a && this.f5810b == j61Var.f5810b && this.f5811c.equals(j61Var.f5811c) && this.f5812d.equals(j61Var.f5812d);
    }

    public final int hashCode() {
        return Objects.hash(this.f5809a, Integer.valueOf(this.f5810b), this.f5811c, this.f5812d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f5809a, Integer.valueOf(this.f5810b), this.f5811c, this.f5812d);
    }
}
