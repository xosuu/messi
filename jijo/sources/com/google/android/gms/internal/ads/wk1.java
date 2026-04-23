package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wk1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wk1 f10217h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f10221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10224g;

    static {
        int i10 = -1;
        f10217h = new wk1(1, 2, 3, null, i10, i10);
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ wk1(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f10218a = i10;
        this.f10219b = i11;
        this.f10220c = i12;
        this.f10221d = bArr;
        this.f10222e = i13;
        this.f10223f = i14;
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static boolean d(wk1 wk1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (wk1Var == null) {
            return true;
        }
        int i14 = wk1Var.f10218a;
        return (i14 == -1 || i14 == 1 || i14 == 2) && ((i10 = wk1Var.f10219b) == -1 || i10 == 2) && (((i11 = wk1Var.f10220c) == -1 || i11 == 3) && wk1Var.f10221d == null && (((i12 = wk1Var.f10223f) == -1 || i12 == 8) && ((i13 = wk1Var.f10222e) == -1 || i13 == 8)));
    }

    public static String e(int i10) {
        return i10 != -1 ? i10 != 1 ? i10 != 2 ? fb1.g("Undefined color range ", i10) : "Limited range" : "Full range" : "Unset color range";
    }

    public static String f(int i10) {
        return i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? fb1.g("Undefined color space ", i10) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    public static String g(int i10) {
        return i10 != -1 ? i10 != 10 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 6 ? i10 != 7 ? fb1.g("Undefined color transfer ", i10) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    public final boolean c() {
        return (this.f10218a == -1 || this.f10219b == -1 || this.f10220c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wk1.class == obj.getClass()) {
            wk1 wk1Var = (wk1) obj;
            if (this.f10218a == wk1Var.f10218a && this.f10219b == wk1Var.f10219b && this.f10220c == wk1Var.f10220c && Arrays.equals(this.f10221d, wk1Var.f10221d) && this.f10222e == wk1Var.f10222e && this.f10223f == wk1Var.f10223f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f10224g;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((Arrays.hashCode(this.f10221d) + ((((((this.f10218a + 527) * 31) + this.f10219b) * 31) + this.f10220c) * 31)) * 31) + this.f10222e) * 31) + this.f10223f;
        this.f10224g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        String str;
        String strF = f(this.f10218a);
        String strE = e(this.f10219b);
        String strG = g(this.f10220c);
        String str2 = "NA";
        int i10 = this.f10222e;
        if (i10 != -1) {
            str = i10 + "bit Luma";
        } else {
            str = "NA";
        }
        int i11 = this.f10223f;
        if (i11 != -1) {
            str2 = i11 + "bit Chroma";
        }
        boolean z9 = this.f10221d != null;
        StringBuilder sbL = l.a0.l("ColorInfo(", strF, ", ", strE, ", ");
        sbL.append(strG);
        sbL.append(", ");
        sbL.append(z9);
        sbL.append(", ");
        sbL.append(str);
        sbL.append(", ");
        sbL.append(str2);
        sbL.append(")");
        return sbL.toString();
    }
}
