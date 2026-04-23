package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y1 {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f10704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10705d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10706e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10707f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f10708g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10709h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10710i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f10711j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final zzbk f10712k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f10713l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f10714m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10715n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f10716o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zzy f10717p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f10718q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f10719r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f10720s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f10721t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10722u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f10723v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final byte[] f10724w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10725x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wk1 f10726y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f10727z;

    static {
        new y1(new q0());
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
    }

    public y1(q0 q0Var) {
        boolean z9;
        String str;
        this.f10702a = q0Var.f8041a;
        String strA = yn0.a(q0Var.f8044d);
        this.f10705d = strA;
        if (q0Var.f8043c.isEmpty() && q0Var.f8042b != null) {
            this.f10704c = bz0.n(new b4(strA, q0Var.f8042b));
            this.f10703b = q0Var.f8042b;
        } else if (!q0Var.f8043c.isEmpty() && q0Var.f8042b == null) {
            List list = q0Var.f8043c;
            this.f10704c = list;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((b4) list.get(0)).f2889b;
                    break;
                }
                b4 b4Var = (b4) it.next();
                if (TextUtils.equals(b4Var.f2888a, strA)) {
                    str = b4Var.f2889b;
                    break;
                }
            }
            this.f10703b = str;
        } else if (q0Var.f8043c.isEmpty() && q0Var.f8042b == null) {
            z9 = true;
            tc1.W(z9);
            this.f10704c = q0Var.f8043c;
            this.f10703b = q0Var.f8042b;
        } else {
            for (int i10 = 0; i10 < q0Var.f8043c.size(); i10++) {
                if (((b4) q0Var.f8043c.get(i10)).f2889b.equals(q0Var.f8042b)) {
                    z9 = true;
                    break;
                }
            }
            z9 = false;
            tc1.W(z9);
            this.f10704c = q0Var.f8043c;
            this.f10703b = q0Var.f8042b;
        }
        this.f10706e = q0Var.f8045e;
        this.f10707f = q0Var.f8046f;
        int i11 = q0Var.f8047g;
        this.f10708g = i11;
        int i12 = q0Var.f8048h;
        this.f10709h = i12;
        this.f10710i = i12 != -1 ? i12 : i11;
        this.f10711j = q0Var.f8049i;
        this.f10712k = q0Var.f8050j;
        this.f10713l = q0Var.f8051k;
        this.f10714m = q0Var.f8052l;
        this.f10715n = q0Var.f8053m;
        List list2 = q0Var.f8054n;
        this.f10716o = list2 == null ? Collections.emptyList() : list2;
        zzy zzyVar = q0Var.f8055o;
        this.f10717p = zzyVar;
        this.f10718q = q0Var.f8056p;
        this.f10719r = q0Var.f8057q;
        this.f10720s = q0Var.f8058r;
        this.f10721t = q0Var.f8059s;
        int i13 = q0Var.f8060t;
        this.f10722u = i13 == -1 ? 0 : i13;
        float f10 = q0Var.f8061u;
        this.f10723v = f10 == -1.0f ? 1.0f : f10;
        this.f10724w = q0Var.f8062v;
        this.f10725x = q0Var.f8063w;
        this.f10726y = q0Var.f8064x;
        this.f10727z = q0Var.f8065y;
        this.A = q0Var.f8066z;
        this.B = q0Var.A;
        int i14 = q0Var.B;
        this.C = i14 == -1 ? 0 : i14;
        int i15 = q0Var.C;
        this.D = i15 != -1 ? i15 : 0;
        this.E = q0Var.D;
        this.F = q0Var.E;
        int i16 = q0Var.F;
        if (i16 != 0 || zzyVar == null) {
            this.G = i16;
        } else {
            this.G = 1;
        }
    }

    public final int a() {
        int i10;
        int i11 = this.f10719r;
        if (i11 == -1 || (i10 = this.f10720s) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final q0 b() {
        return new q0(this);
    }

    public final boolean c(y1 y1Var) {
        List list = this.f10716o;
        if (list.size() != y1Var.f10716o.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) y1Var.f10716o.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && y1.class == obj.getClass()) {
            y1 y1Var = (y1) obj;
            int i11 = this.H;
            if ((i11 == 0 || (i10 = y1Var.H) == 0 || i11 == i10) && this.f10706e == y1Var.f10706e && this.f10707f == y1Var.f10707f && this.f10708g == y1Var.f10708g && this.f10709h == y1Var.f10709h && this.f10715n == y1Var.f10715n && this.f10718q == y1Var.f10718q && this.f10719r == y1Var.f10719r && this.f10720s == y1Var.f10720s && this.f10722u == y1Var.f10722u && this.f10725x == y1Var.f10725x && this.f10727z == y1Var.f10727z && this.A == y1Var.A && this.B == y1Var.B && this.C == y1Var.C && this.D == y1Var.D && this.E == y1Var.E && this.G == y1Var.G && Float.compare(this.f10721t, y1Var.f10721t) == 0 && Float.compare(this.f10723v, y1Var.f10723v) == 0 && yn0.c(this.f10702a, y1Var.f10702a) && yn0.c(this.f10703b, y1Var.f10703b) && this.f10704c.equals(y1Var.f10704c) && yn0.c(this.f10711j, y1Var.f10711j) && yn0.c(this.f10713l, y1Var.f10713l) && yn0.c(this.f10714m, y1Var.f10714m) && yn0.c(this.f10705d, y1Var.f10705d) && Arrays.equals(this.f10724w, y1Var.f10724w) && yn0.c(this.f10712k, y1Var.f10712k) && yn0.c(this.f10726y, y1Var.f10726y) && yn0.c(this.f10717p, y1Var.f10717p) && c(y1Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.H;
        if (i10 != 0) {
            return i10;
        }
        String str = this.f10702a;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.f10703b;
        int iHashCode2 = this.f10704c.hashCode() + ((((iHashCode + 527) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31);
        String str3 = this.f10705d;
        int iHashCode3 = ((((((((((iHashCode2 * 31) + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f10706e) * 31) + this.f10707f) * 31) + this.f10708g) * 31) + this.f10709h) * 31;
        String str4 = this.f10711j;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzbk zzbkVar = this.f10712k;
        int iHashCode5 = (iHashCode4 + (zzbkVar == null ? 0 : zzbkVar.hashCode())) * 31;
        String str5 = this.f10713l;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        int iFloatToIntBits = this.G + ((((((((((((((((((((Float.floatToIntBits(this.f10723v) + ((((Float.floatToIntBits(this.f10721t) + ((((((((((iHashCode6 + (this.f10714m != null ? r1.hashCode() : 0)) * 31) + this.f10715n) * 31) + ((int) this.f10718q)) * 31) + this.f10719r) * 31) + this.f10720s) * 31)) * 31) + this.f10722u) * 31)) * 31) + this.f10725x) * 31) + this.f10727z) * 31) + this.A) * 31) + this.B) * 31) + this.C) * 31) + this.D) * 31) + this.E) * 31) - 1) * 31) - 1) * 31);
        this.H = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f10726y);
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.f10702a);
        sb.append(", ");
        sb.append(this.f10703b);
        sb.append(", ");
        sb.append(this.f10713l);
        sb.append(", ");
        sb.append(this.f10714m);
        sb.append(", ");
        sb.append(this.f10711j);
        sb.append(", ");
        sb.append(this.f10710i);
        sb.append(", ");
        sb.append(this.f10705d);
        sb.append(", [");
        sb.append(this.f10719r);
        sb.append(", ");
        sb.append(this.f10720s);
        sb.append(", ");
        sb.append(this.f10721t);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(this.f10727z);
        sb.append(", ");
        return l.a0.h(sb, this.A, "])");
    }
}
