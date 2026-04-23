package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f7751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7752i;

    public p0(List list, int i10, int i11, int i12, int i13, int i14, int i15, float f10, String str) {
        this.f7744a = list;
        this.f7745b = i10;
        this.f7746c = i11;
        this.f7747d = i12;
        this.f7748e = i13;
        this.f7749f = i14;
        this.f7750g = i15;
        this.f7751h = f10;
        this.f7752i = str;
    }

    public static p0 a(ik0 ik0Var) {
        int i10;
        int i11;
        int i12;
        try {
            ik0Var.j(21);
            int iV = ik0Var.v() & 3;
            int iV2 = ik0Var.v();
            int i13 = ik0Var.f5634b;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < iV2; i16++) {
                ik0Var.j(1);
                int iZ = ik0Var.z();
                for (int i17 = 0; i17 < iZ; i17++) {
                    int iZ2 = ik0Var.z();
                    i15 += iZ2 + 4;
                    ik0Var.j(iZ2);
                }
            }
            ik0Var.i(i13);
            byte[] bArr = new byte[i15];
            String strF0 = null;
            int i18 = 0;
            int i19 = 0;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            float f10 = 1.0f;
            while (i18 < iV2) {
                int iV3 = ik0Var.v() & 63;
                int iZ3 = ik0Var.z();
                int i25 = 0;
                while (i25 < iZ3) {
                    int iZ4 = ik0Var.z();
                    int i26 = iV2;
                    System.arraycopy(ds0.f3727a, i14, bArr, i19, 4);
                    int i27 = i19 + 4;
                    System.arraycopy(ik0Var.f5633a, ik0Var.f5634b, bArr, i27, iZ4);
                    int i28 = i27 + iZ4;
                    if (iV3 == 33 && i25 == 0) {
                        zq0 zq0VarC = ds0.c(i19 + 6, bArr, i28);
                        i20 = zq0VarC.f11305e + 8;
                        i21 = zq0VarC.f11306f + 8;
                        i22 = zq0VarC.f11312l;
                        int i29 = zq0VarC.f11313m;
                        int i30 = zq0VarC.f11314n;
                        float f11 = zq0VarC.f11311k;
                        i10 = i28;
                        i23 = i29;
                        i24 = i30;
                        i11 = iV3;
                        i12 = iZ3;
                        strF0 = en1.f0(zq0VarC.f11301a, zq0VarC.f11302b, zq0VarC.f11303c, zq0VarC.f11304d, zq0VarC.f11307g, zq0VarC.f11308h);
                        f10 = f11;
                        i25 = 0;
                    } else {
                        i10 = i28;
                        i11 = iV3;
                        i12 = iZ3;
                    }
                    ik0Var.j(iZ4);
                    i25++;
                    iV2 = i26;
                    i19 = i10;
                    iV3 = i11;
                    iZ3 = i12;
                    i14 = 0;
                }
                i18++;
                i14 = 0;
            }
            return new p0(i15 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iV + 1, i20, i21, i22, i23, i24, f10, strF0);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzbo.a("Error parsing HEVC config", e10);
        }
    }
}
