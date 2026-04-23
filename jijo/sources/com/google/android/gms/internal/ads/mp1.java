package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class mp1 extends np1 {
    public mp1(ow owVar, int i10) {
        super(owVar, new int[]{i10});
    }

    public static /* bridge */ /* synthetic */ wz0 c(bq1[] bq1VarArr) {
        int i10;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        char c10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            bq1 bq1Var = bq1VarArr[i11];
            if (bq1Var == null || bq1Var.f3079b.length <= 1) {
                arrayList.add(null);
            } else {
                yy0 yy0Var = new yy0();
                yy0Var.f(new lp1(0L, 0L));
                arrayList.add(yy0Var);
            }
            i11++;
        }
        long[][] jArr = new long[2][];
        for (int i12 = 0; i12 < 2; i12++) {
            bq1 bq1Var2 = bq1VarArr[i12];
            if (bq1Var2 == null) {
                jArr[i12] = new long[0];
            } else {
                int[] iArr2 = bq1Var2.f3079b;
                jArr[i12] = new long[iArr2.length];
                for (int i13 = 0; i13 < iArr2.length; i13++) {
                    long j10 = bq1Var2.f3078a.a(iArr2[i13]).f10710i;
                    long[] jArr2 = jArr[i12];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i13] = j10;
                }
                Arrays.sort(jArr[i12]);
            }
        }
        int[] iArr3 = new int[2];
        long[] jArr3 = new long[2];
        for (int i14 = 0; i14 < 2; i14++) {
            long[] jArr4 = jArr[i14];
            jArr3[i14] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        d(arrayList, jArr3);
        sz0 sz0VarX = q7.b.w(vz0.a()).J().x();
        int i15 = 0;
        for (i10 = 2; i15 < i10; i10 = 2) {
            int length = jArr[i15].length;
            if (length <= 1) {
                iArr = iArr3;
            } else {
                double[] dArr = new double[length];
                int i16 = 0;
                while (true) {
                    long[] jArr5 = jArr[i15];
                    double dLog = 0.0d;
                    if (i16 >= jArr5.length) {
                        break;
                    }
                    int[] iArr4 = iArr3;
                    long j11 = jArr5[i16];
                    if (j11 != -1) {
                        dLog = Math.log(j11);
                    }
                    dArr[i16] = dLog;
                    i16++;
                    iArr3 = iArr4;
                }
                iArr = iArr3;
                int i17 = length - 1;
                double d10 = dArr[i17] - dArr[c10];
                int i18 = 0;
                while (i18 < i17) {
                    double d11 = dArr[i18];
                    i18++;
                    sz0VarX.d(Double.valueOf(d10 == 0.0d ? 1.0d : (((d11 + dArr[i18]) * 0.5d) - dArr[c10]) / d10), Integer.valueOf(i15));
                    c10 = 0;
                }
            }
            i15++;
            iArr3 = iArr;
            c10 = 0;
        }
        int[] iArr5 = iArr3;
        bz0 bz0VarK = bz0.k(sz0VarX.a());
        for (int i19 = 0; i19 < bz0VarK.size(); i19++) {
            int iIntValue = ((Integer) bz0VarK.get(i19)).intValue();
            int i20 = iArr5[iIntValue] + 1;
            iArr5[iIntValue] = i20;
            jArr3[iIntValue] = jArr[iIntValue][i20];
            d(arrayList, jArr3);
        }
        for (int i21 = 0; i21 < 2; i21++) {
            if (arrayList.get(i21) != null) {
                long j12 = jArr3[i21];
                jArr3[i21] = j12 + j12;
            }
        }
        d(arrayList, jArr3);
        yy0 yy0Var2 = new yy0();
        for (int i22 = 0; i22 < arrayList.size(); i22++) {
            yy0 yy0Var3 = (yy0) arrayList.get(i22);
            yy0Var2.f(yy0Var3 == null ? bz0.m() : yy0Var3.g());
        }
        return yy0Var2.g();
    }

    public static void d(ArrayList arrayList, long[] jArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            j10 += jArr[i10];
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            yy0 yy0Var = (yy0) arrayList.get(i11);
            if (yy0Var != null) {
                yy0Var.a(new lp1(j10, jArr[i11]));
            }
        }
    }
}
