package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class e10 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e10 f3801d = new e10(1.0f, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3804c;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
    }

    public e10(float f10, int i10, int i11) {
        this.f3802a = i10;
        this.f3803b = i11;
        this.f3804c = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e10) {
            e10 e10Var = (e10) obj;
            if (this.f3802a == e10Var.f3802a && this.f3803b == e10Var.f3803b && this.f3804c == e10Var.f3804c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f3804c) + ((((this.f3802a + 217) * 31) + this.f3803b) * 961);
    }
}
