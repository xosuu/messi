package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class vk0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vk0 f9903c = new vk0(-1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9905b;

    static {
        new vk0(0, 0);
    }

    public vk0(int i10, int i11) {
        boolean z9 = false;
        if ((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0)) {
            z9 = true;
        }
        tc1.K(z9);
        this.f9904a = i10;
        this.f9905b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof vk0) {
            vk0 vk0Var = (vk0) obj;
            if (this.f9904a == vk0Var.f9904a && this.f9905b == vk0Var.f9905b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f9904a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f9905b;
    }

    public final String toString() {
        return this.f9904a + "x" + this.f9905b;
    }
}
