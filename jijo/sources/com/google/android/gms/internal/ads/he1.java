package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class he1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qz f5269a;

    static {
        yd1 yd1Var = yd1.f10857c;
        f5269a = new qz(2);
    }

    public static void A(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof oc1;
        mc1 mc1Var = nc1Var.f7244a;
        if (z10) {
            if (!z9) {
                throw null;
            }
            mc1Var.G0(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                mc1Var.A0(i10, Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Double) list.get(i13)).doubleValue();
            i12 += 8;
        }
        mc1Var.I0(i12);
        while (i11 < list.size()) {
            mc1Var.B0(Double.doubleToRawLongBits(((Double) list.get(i11)).doubleValue()));
            i11++;
        }
    }

    public static void B(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof xc1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.C0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int iT0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iT0 += mc1.t0(((Integer) list.get(i12)).intValue());
            }
            mc1Var.I0(iT0);
            while (i11 < list.size()) {
                mc1Var.D0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        xc1 xc1Var = (xc1) list;
        if (!z9) {
            while (i11 < xc1Var.f10538d) {
                mc1Var.C0(i10, xc1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int iT02 = 0;
        for (int i13 = 0; i13 < xc1Var.f10538d; i13++) {
            iT02 += mc1.t0(xc1Var.e(i13));
        }
        mc1Var.I0(iT02);
        while (i11 < xc1Var.f10538d) {
            mc1Var.D0(xc1Var.e(i11));
            i11++;
        }
    }

    public static void C(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof xc1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.y0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            mc1Var.I0(i12);
            while (i11 < list.size()) {
                mc1Var.z0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        xc1 xc1Var = (xc1) list;
        if (!z9) {
            while (i11 < xc1Var.f10538d) {
                mc1Var.y0(i10, xc1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < xc1Var.f10538d; i15++) {
            xc1Var.e(i15);
            i14 += 4;
        }
        mc1Var.I0(i14);
        while (i11 < xc1Var.f10538d) {
            mc1Var.z0(xc1Var.e(i11));
            i11++;
        }
    }

    public static void D(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof jd1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.A0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            mc1Var.I0(i12);
            while (i11 < list.size()) {
                mc1Var.B0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jd1 jd1Var = (jd1) list;
        if (!z9) {
            while (i11 < jd1Var.f5917d) {
                mc1Var.A0(i10, jd1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < jd1Var.f5917d; i15++) {
            jd1Var.e(i15);
            i14 += 8;
        }
        mc1Var.I0(i14);
        while (i11 < jd1Var.f5917d) {
            mc1Var.B0(jd1Var.e(i11));
            i11++;
        }
    }

    public static void E(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof sc1;
        mc1 mc1Var = nc1Var.f7244a;
        if (z10) {
            if (!z9) {
                throw null;
            }
            mc1Var.G0(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                mc1Var.y0(i10, Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Float) list.get(i13)).floatValue();
            i12 += 4;
        }
        mc1Var.I0(i12);
        while (i11 < list.size()) {
            mc1Var.z0(Float.floatToRawIntBits(((Float) list.get(i11)).floatValue()));
            i11++;
        }
    }

    public static void F(int i10, List list, nc1 nc1Var, ge1 ge1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            nc1Var.l(i10, ge1Var, list.get(i11));
        }
    }

    public static void G(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof xc1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.C0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int iT0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iT0 += mc1.t0(((Integer) list.get(i12)).intValue());
            }
            mc1Var.I0(iT0);
            while (i11 < list.size()) {
                mc1Var.D0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        xc1 xc1Var = (xc1) list;
        if (!z9) {
            while (i11 < xc1Var.f10538d) {
                mc1Var.C0(i10, xc1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int iT02 = 0;
        for (int i13 = 0; i13 < xc1Var.f10538d; i13++) {
            iT02 += mc1.t0(xc1Var.e(i13));
        }
        mc1Var.I0(iT02);
        while (i11 < xc1Var.f10538d) {
            mc1Var.D0(xc1Var.e(i11));
            i11++;
        }
    }

    public static void a(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof jd1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.J0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int iT0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iT0 += mc1.t0(((Long) list.get(i12)).longValue());
            }
            mc1Var.I0(iT0);
            while (i11 < list.size()) {
                mc1Var.K0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jd1 jd1Var = (jd1) list;
        if (!z9) {
            while (i11 < jd1Var.f5917d) {
                mc1Var.J0(i10, jd1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int iT02 = 0;
        for (int i13 = 0; i13 < jd1Var.f5917d; i13++) {
            iT02 += mc1.t0(jd1Var.e(i13));
        }
        mc1Var.I0(iT02);
        while (i11 < jd1Var.f5917d) {
            mc1Var.K0(jd1Var.e(i11));
            i11++;
        }
    }

    public static void b(int i10, List list, nc1 nc1Var, ge1 ge1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            nc1Var.o(i10, ge1Var, list.get(i11));
        }
    }

    public static void c(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof xc1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.y0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Integer) list.get(i13)).intValue();
                i12 += 4;
            }
            mc1Var.I0(i12);
            while (i11 < list.size()) {
                mc1Var.z0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        xc1 xc1Var = (xc1) list;
        if (!z9) {
            while (i11 < xc1Var.f10538d) {
                mc1Var.y0(i10, xc1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < xc1Var.f10538d; i15++) {
            xc1Var.e(i15);
            i14 += 4;
        }
        mc1Var.I0(i14);
        while (i11 < xc1Var.f10538d) {
            mc1Var.z0(xc1Var.e(i11));
            i11++;
        }
    }

    public static void d(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof jd1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.A0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int i12 = 0;
            for (int i13 = 0; i13 < list.size(); i13++) {
                ((Long) list.get(i13)).longValue();
                i12 += 8;
            }
            mc1Var.I0(i12);
            while (i11 < list.size()) {
                mc1Var.B0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jd1 jd1Var = (jd1) list;
        if (!z9) {
            while (i11 < jd1Var.f5917d) {
                mc1Var.A0(i10, jd1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int i14 = 0;
        for (int i15 = 0; i15 < jd1Var.f5917d; i15++) {
            jd1Var.e(i15);
            i14 += 8;
        }
        mc1Var.I0(i14);
        while (i11 < jd1Var.f5917d) {
            mc1Var.B0(jd1Var.e(i11));
            i11++;
        }
    }

    public static void e(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof xc1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    int iIntValue = ((Integer) list.get(i11)).intValue();
                    mc1Var.H0(i10, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int iS0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                int iIntValue2 = ((Integer) list.get(i12)).intValue();
                iS0 += mc1.s0((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
            }
            mc1Var.I0(iS0);
            while (i11 < list.size()) {
                int iIntValue3 = ((Integer) list.get(i11)).intValue();
                mc1Var.I0((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
                i11++;
            }
            return;
        }
        xc1 xc1Var = (xc1) list;
        if (!z9) {
            while (i11 < xc1Var.f10538d) {
                int iE = xc1Var.e(i11);
                mc1Var.H0(i10, (iE >> 31) ^ (iE + iE));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int iS02 = 0;
        for (int i13 = 0; i13 < xc1Var.f10538d; i13++) {
            int iE2 = xc1Var.e(i13);
            iS02 += mc1.s0((iE2 >> 31) ^ (iE2 + iE2));
        }
        mc1Var.I0(iS02);
        while (i11 < xc1Var.f10538d) {
            int iE3 = xc1Var.e(i11);
            mc1Var.I0((iE3 >> 31) ^ (iE3 + iE3));
            i11++;
        }
    }

    public static void f(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof jd1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    long jLongValue = ((Long) list.get(i11)).longValue();
                    mc1Var.J0(i10, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int iT0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                long jLongValue2 = ((Long) list.get(i12)).longValue();
                iT0 += mc1.t0((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
            }
            mc1Var.I0(iT0);
            while (i11 < list.size()) {
                long jLongValue3 = ((Long) list.get(i11)).longValue();
                mc1Var.K0((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
                i11++;
            }
            return;
        }
        jd1 jd1Var = (jd1) list;
        if (!z9) {
            while (i11 < jd1Var.f5917d) {
                long jE = jd1Var.e(i11);
                mc1Var.J0(i10, (jE >> 63) ^ (jE + jE));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int iT02 = 0;
        for (int i13 = 0; i13 < jd1Var.f5917d; i13++) {
            long jE2 = jd1Var.e(i13);
            iT02 += mc1.t0((jE2 >> 63) ^ (jE2 + jE2));
        }
        mc1Var.I0(iT02);
        while (i11 < jd1Var.f5917d) {
            long jE3 = jd1Var.e(i11);
            mc1Var.K0((jE3 >> 63) ^ (jE3 + jE3));
            i11++;
        }
    }

    public static void g(int i10, List list, nc1 nc1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z9 = list instanceof hd1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z9) {
            while (i11 < list.size()) {
                mc1Var.F0(i10, (String) list.get(i11));
                i11++;
            }
            return;
        }
        hd1 hd1Var = (hd1) list;
        while (i11 < list.size()) {
            Object objZzc = hd1Var.zzc();
            if (objZzc instanceof String) {
                mc1Var.F0(i10, (String) objZzc);
            } else {
                mc1Var.x0(i10, (ec1) objZzc);
            }
            i11++;
        }
    }

    public static void h(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof xc1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.H0(i10, ((Integer) list.get(i11)).intValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int iS0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iS0 += mc1.s0(((Integer) list.get(i12)).intValue());
            }
            mc1Var.I0(iS0);
            while (i11 < list.size()) {
                mc1Var.I0(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return;
        }
        xc1 xc1Var = (xc1) list;
        if (!z9) {
            while (i11 < xc1Var.f10538d) {
                mc1Var.H0(i10, xc1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int iS02 = 0;
        for (int i13 = 0; i13 < xc1Var.f10538d; i13++) {
            iS02 += mc1.s0(xc1Var.e(i13));
        }
        mc1Var.I0(iS02);
        while (i11 < xc1Var.f10538d) {
            mc1Var.I0(xc1Var.e(i11));
            i11++;
        }
    }

    public static void i(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof jd1;
        int i11 = 0;
        mc1 mc1Var = nc1Var.f7244a;
        if (!z10) {
            if (!z9) {
                while (i11 < list.size()) {
                    mc1Var.J0(i10, ((Long) list.get(i11)).longValue());
                    i11++;
                }
                return;
            }
            mc1Var.G0(i10, 2);
            int iT0 = 0;
            for (int i12 = 0; i12 < list.size(); i12++) {
                iT0 += mc1.t0(((Long) list.get(i12)).longValue());
            }
            mc1Var.I0(iT0);
            while (i11 < list.size()) {
                mc1Var.K0(((Long) list.get(i11)).longValue());
                i11++;
            }
            return;
        }
        jd1 jd1Var = (jd1) list;
        if (!z9) {
            while (i11 < jd1Var.f5917d) {
                mc1Var.J0(i10, jd1Var.e(i11));
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int iT02 = 0;
        for (int i13 = 0; i13 < jd1Var.f5917d; i13++) {
            iT02 += mc1.t0(jd1Var.e(i13));
        }
        mc1Var.I0(iT02);
        while (i11 < jd1Var.f5917d) {
            mc1Var.K0(jd1Var.e(i11));
            i11++;
        }
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int k(List list) {
        int iT0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof xc1) {
            xc1 xc1Var = (xc1) list;
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(xc1Var.e(i10));
                i10++;
            }
        } else {
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iT0;
    }

    public static int l(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mc1.s0(i10 << 3) + 4) * size;
    }

    public static int m(List list) {
        return list.size() * 4;
    }

    public static int n(int i10, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (mc1.s0(i10 << 3) + 8) * size;
    }

    public static int o(List list) {
        return list.size() * 8;
    }

    public static int p(List list) {
        int iT0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof xc1) {
            xc1 xc1Var = (xc1) list;
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(xc1Var.e(i10));
                i10++;
            }
        } else {
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iT0;
    }

    public static int q(List list) {
        int iT0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof jd1) {
            jd1 jd1Var = (jd1) list;
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(jd1Var.e(i10));
                i10++;
            }
        } else {
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iT0;
    }

    public static int r(int i10, ge1 ge1Var, Object obj) {
        return mc1.q0((rd1) obj, ge1Var) + mc1.s0(i10 << 3);
    }

    public static int s(List list) {
        int iS0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof xc1) {
            xc1 xc1Var = (xc1) list;
            iS0 = 0;
            while (i10 < size) {
                int iE = xc1Var.e(i10);
                iS0 += mc1.s0((iE >> 31) ^ (iE + iE));
                i10++;
            }
        } else {
            iS0 = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iS0 += mc1.s0((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
        }
        return iS0;
    }

    public static int t(List list) {
        int iT0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof jd1) {
            jd1 jd1Var = (jd1) list;
            iT0 = 0;
            while (i10 < size) {
                long jE = jd1Var.e(i10);
                iT0 += mc1.t0((jE >> 63) ^ (jE + jE));
                i10++;
            }
        } else {
            iT0 = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iT0 += mc1.t0((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
        }
        return iT0;
    }

    public static int u(List list) {
        int iS0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof xc1) {
            xc1 xc1Var = (xc1) list;
            iS0 = 0;
            while (i10 < size) {
                iS0 += mc1.s0(xc1Var.e(i10));
                i10++;
            }
        } else {
            iS0 = 0;
            while (i10 < size) {
                iS0 += mc1.s0(((Integer) list.get(i10)).intValue());
                i10++;
            }
        }
        return iS0;
    }

    public static int v(List list) {
        int iT0;
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof jd1) {
            jd1 jd1Var = (jd1) list;
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(jd1Var.e(i10));
                i10++;
            }
        } else {
            iT0 = 0;
            while (i10 < size) {
                iT0 += mc1.t0(((Long) list.get(i10)).longValue());
                i10++;
            }
        }
        return iT0;
    }

    public static Object w(Object obj, int i10, dd1 dd1Var, zc1 zc1Var, Object obj2, qz qzVar) {
        if (zc1Var == null) {
            return obj2;
        }
        if (dd1Var instanceof RandomAccess) {
            int size = dd1Var.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                int iIntValue = ((Integer) dd1Var.get(i12)).intValue();
                if (zc1Var.a(iIntValue)) {
                    if (i12 != i11) {
                        dd1Var.set(i11, Integer.valueOf(iIntValue));
                    }
                    i11++;
                } else {
                    if (obj2 == null) {
                        obj2 = qzVar.zza(obj);
                    }
                    qzVar.getClass();
                    ((ke1) obj2).c(i10 << 3, Long.valueOf(iIntValue));
                }
            }
            if (i11 != size) {
                dd1Var.subList(i11, size).clear();
                return obj2;
            }
        } else {
            Iterator it = dd1Var.iterator();
            while (it.hasNext()) {
                int iIntValue2 = ((Integer) it.next()).intValue();
                if (!zc1Var.a(iIntValue2)) {
                    if (obj2 == null) {
                        obj2 = qzVar.zza(obj);
                    }
                    qzVar.getClass();
                    ((ke1) obj2).c(i10 << 3, Long.valueOf(iIntValue2));
                    it.remove();
                }
            }
        }
        return obj2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void x(Object obj, Object obj2) {
        wc1 wc1Var = (wc1) obj;
        ke1 ke1Var = wc1Var.zzt;
        ke1 ke1Var2 = ((wc1) obj2).zzt;
        ke1 ke1Var3 = ke1.f6268f;
        if (!ke1Var3.equals(ke1Var2)) {
            if (ke1Var3.equals(ke1Var)) {
                int i10 = ke1Var.f6269a + ke1Var2.f6269a;
                int[] iArrCopyOf = Arrays.copyOf(ke1Var.f6270b, i10);
                System.arraycopy(ke1Var2.f6270b, 0, iArrCopyOf, ke1Var.f6269a, ke1Var2.f6269a);
                Object[] objArrCopyOf = Arrays.copyOf(ke1Var.f6271c, i10);
                System.arraycopy(ke1Var2.f6271c, 0, objArrCopyOf, ke1Var.f6269a, ke1Var2.f6269a);
                ke1Var = new ke1(i10, iArrCopyOf, objArrCopyOf, true);
            } else {
                ke1Var.getClass();
                if (!ke1Var2.equals(ke1Var3)) {
                    if (!ke1Var.f6273e) {
                        throw new UnsupportedOperationException();
                    }
                    int i11 = ke1Var.f6269a + ke1Var2.f6269a;
                    ke1Var.e(i11);
                    System.arraycopy(ke1Var2.f6270b, 0, ke1Var.f6270b, ke1Var.f6269a, ke1Var2.f6269a);
                    System.arraycopy(ke1Var2.f6271c, 0, ke1Var.f6271c, ke1Var.f6269a, ke1Var2.f6269a);
                    ke1Var.f6269a = i11;
                }
            }
        }
        wc1Var.zzt = ke1Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void y(int i10, List list, nc1 nc1Var, boolean z9) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        boolean z10 = list instanceof zb1;
        mc1 mc1Var = nc1Var.f7244a;
        if (z10) {
            if (!z9) {
                throw null;
            }
            mc1Var.G0(i10, 2);
            throw null;
        }
        int i11 = 0;
        if (!z9) {
            while (i11 < list.size()) {
                mc1Var.w0(i10, ((Boolean) list.get(i11)).booleanValue());
                i11++;
            }
            return;
        }
        mc1Var.G0(i10, 2);
        int i12 = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            ((Boolean) list.get(i13)).booleanValue();
            i12++;
        }
        mc1Var.I0(i12);
        while (i11 < list.size()) {
            mc1Var.v0(((Boolean) list.get(i11)).booleanValue() ? (byte) 1 : (byte) 0);
            i11++;
        }
    }

    public static void z(int i10, List list, nc1 nc1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        nc1Var.getClass();
        for (int i11 = 0; i11 < list.size(); i11++) {
            nc1Var.f7244a.x0(i10, (ec1) list.get(i11));
        }
    }
}
