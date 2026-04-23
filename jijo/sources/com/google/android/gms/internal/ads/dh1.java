package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class dh1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final dh1 f3669j = new dh1(1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final dh1 f3670k = new dh1(0.0d, 1.0d, -1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final dh1 f3671l = new dh1(-1.0d, 0.0d, 0.0d, -1.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final dh1 f3672m = new dh1(0.0d, -1.0d, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f3673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f3674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f3675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f3676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f3677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f3678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f3679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f3680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final double f3681i;

    public dh1(double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        this.f3673a = d14;
        this.f3674b = d15;
        this.f3675c = d16;
        this.f3676d = d10;
        this.f3677e = d11;
        this.f3678f = d12;
        this.f3679g = d13;
        this.f3680h = d17;
        this.f3681i = d18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dh1.class != obj.getClass()) {
            return false;
        }
        dh1 dh1Var = (dh1) obj;
        return Double.compare(dh1Var.f3676d, this.f3676d) == 0 && Double.compare(dh1Var.f3677e, this.f3677e) == 0 && Double.compare(dh1Var.f3678f, this.f3678f) == 0 && Double.compare(dh1Var.f3679g, this.f3679g) == 0 && Double.compare(dh1Var.f3680h, this.f3680h) == 0 && Double.compare(dh1Var.f3681i, this.f3681i) == 0 && Double.compare(dh1Var.f3673a, this.f3673a) == 0 && Double.compare(dh1Var.f3674b, this.f3674b) == 0 && Double.compare(dh1Var.f3675c, this.f3675c) == 0;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.f3673a);
        long j10 = jDoubleToLongBits ^ (jDoubleToLongBits >>> 32);
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.f3674b);
        long j11 = jDoubleToLongBits2 ^ (jDoubleToLongBits2 >>> 32);
        long jDoubleToLongBits3 = Double.doubleToLongBits(this.f3675c);
        long j12 = jDoubleToLongBits3 ^ (jDoubleToLongBits3 >>> 32);
        long jDoubleToLongBits4 = Double.doubleToLongBits(this.f3676d);
        long j13 = jDoubleToLongBits4 ^ (jDoubleToLongBits4 >>> 32);
        long jDoubleToLongBits5 = Double.doubleToLongBits(this.f3677e);
        long j14 = jDoubleToLongBits5 ^ (jDoubleToLongBits5 >>> 32);
        long jDoubleToLongBits6 = Double.doubleToLongBits(this.f3678f);
        long j15 = jDoubleToLongBits6 ^ (jDoubleToLongBits6 >>> 32);
        long jDoubleToLongBits7 = Double.doubleToLongBits(this.f3679g);
        long j16 = jDoubleToLongBits7 ^ (jDoubleToLongBits7 >>> 32);
        long jDoubleToLongBits8 = Double.doubleToLongBits(this.f3680h);
        long j17 = jDoubleToLongBits8 ^ (jDoubleToLongBits8 >>> 32);
        long jDoubleToLongBits9 = Double.doubleToLongBits(this.f3681i);
        return (((((((((((((((((int) j10) * 31) + ((int) j11)) * 31) + ((int) j12)) * 31) + ((int) j13)) * 31) + ((int) j14)) * 31) + ((int) j15)) * 31) + ((int) j16)) * 31) + ((int) j17)) * 31) + ((int) (jDoubleToLongBits9 ^ (jDoubleToLongBits9 >>> 32)));
    }

    public final String toString() {
        if (equals(f3669j)) {
            return "Rotate 0°";
        }
        if (equals(f3670k)) {
            return "Rotate 90°";
        }
        if (equals(f3671l)) {
            return "Rotate 180°";
        }
        if (equals(f3672m)) {
            return "Rotate 270°";
        }
        StringBuilder sb = new StringBuilder(260);
        sb.append("Matrix{u=");
        sb.append(this.f3673a);
        sb.append(", v=");
        sb.append(this.f3674b);
        sb.append(", w=");
        sb.append(this.f3675c);
        sb.append(", a=");
        sb.append(this.f3676d);
        sb.append(", b=");
        sb.append(this.f3677e);
        sb.append(", c=");
        sb.append(this.f3678f);
        sb.append(", d=");
        sb.append(this.f3679g);
        sb.append(", tx=");
        sb.append(this.f3680h);
        sb.append(", ty=");
        sb.append(this.f3681i);
        sb.append("}");
        return sb.toString();
    }
}
