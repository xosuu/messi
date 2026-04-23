package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public abstract class t01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9026a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d10) {
        if (!(Math.getExponent(d10) <= 1023)) {
            return false;
        }
        if (d10 == 0.0d) {
            return true;
        }
        en1.F0("not a normal value", Math.getExponent(d10) <= 1023);
        int exponent = Math.getExponent(d10);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d10) & 4503599627370495L;
        return 52 - Long.numberOfTrailingZeros(exponent == -1023 ? jDoubleToRawLongBits + jDoubleToRawLongBits : jDoubleToRawLongBits | 4503599627370496L) <= Math.getExponent(d10);
    }
}
