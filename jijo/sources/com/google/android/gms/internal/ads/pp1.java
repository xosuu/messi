package com.google.android.gms.internal.ads;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class pp1 extends yp1 implements Comparable {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final boolean G;
    public final boolean H;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7943h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7944q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f7945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final up1 f7946t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f7947u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f7948v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f7949w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f7950x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f7951y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f7952z;

    public pp1(int i10, ow owVar, int i11, up1 up1Var, int i12, boolean z9, op1 op1Var) {
        int i13;
        int iF;
        int iF2;
        boolean z10;
        super(i10, owVar, i11);
        this.f7946t = up1Var;
        int i14 = 1;
        int i15 = true != up1Var.f9565o ? 16 : 24;
        this.f7945s = aq1.g(this.f11003f.f10705d);
        this.f7947u = tp1.O(i12, false);
        int i16 = 0;
        while (true) {
            bz0 bz0Var = up1Var.f10678e;
            i13 = Integer.MAX_VALUE;
            if (i16 >= bz0Var.size()) {
                i16 = Integer.MAX_VALUE;
                iF = 0;
                break;
            } else {
                iF = aq1.f(this.f11003f, (String) bz0Var.get(i16), false);
                if (iF > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.f7949w = i16;
        this.f7948v = iF;
        this.f7950x = aq1.e(this.f11003f.f10707f, 0);
        y1 y1Var = this.f11003f;
        int i17 = y1Var.f10707f;
        this.f7951y = i17 == 0 || (i17 & 1) != 0;
        this.B = 1 == (y1Var.f10706e & 1);
        this.C = y1Var.f10727z;
        this.D = y1Var.A;
        this.E = y1Var.f10710i;
        this.f7944q = op1Var.zza(y1Var);
        Configuration configuration = Resources.getSystem().getConfiguration();
        String[] strArrSplit = yn0.f10944a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
        for (int i18 = 0; i18 < strArrSplit.length; i18++) {
            strArrSplit[i18] = yn0.a(strArrSplit[i18]);
        }
        int i19 = 0;
        while (true) {
            if (i19 >= strArrSplit.length) {
                i19 = Integer.MAX_VALUE;
                iF2 = 0;
                break;
            } else {
                iF2 = aq1.f(this.f11003f, strArrSplit[i19], false);
                if (iF2 > 0) {
                    break;
                } else {
                    i19++;
                }
            }
        }
        this.f7952z = i19;
        this.A = iF2;
        int i20 = 0;
        while (true) {
            bz0 bz0Var2 = up1Var.f10679f;
            if (i20 >= bz0Var2.size()) {
                break;
            }
            String str = this.f11003f.f10714m;
            if (str != null && str.equals(bz0Var2.get(i20))) {
                i13 = i20;
                break;
            }
            i20++;
        }
        this.F = i13;
        this.G = (i12 & 384) == 128;
        this.H = (i12 & 64) == 64;
        up1 up1Var2 = this.f7946t;
        if (!tp1.O(i12, up1Var2.f9567q) || (!(z10 = this.f7944q) && !up1Var2.f9564n)) {
            i14 = 0;
        } else if (tp1.O(i12, false) && z10 && this.f11003f.f10710i != -1 && ((up1Var2.f9568r || !z9) && (i15 & i12) != 0)) {
            i14 = 2;
        }
        this.f7943h = i14;
    }

    @Override // com.google.android.gms.internal.ads.yp1
    public final int a() {
        return this.f7943h;
    }

    @Override // com.google.android.gms.internal.ads.yp1
    public final /* bridge */ /* synthetic */ boolean d(yp1 yp1Var) {
        String str;
        int i10;
        pp1 pp1Var = (pp1) yp1Var;
        this.f7946t.getClass();
        y1 y1Var = this.f11003f;
        int i11 = y1Var.f10727z;
        if (i11 == -1) {
            return false;
        }
        y1 y1Var2 = pp1Var.f11003f;
        return i11 == y1Var2.f10727z && (str = y1Var.f10714m) != null && TextUtils.equals(str, y1Var2.f10714m) && (i10 = y1Var.A) != -1 && i10 == y1Var2.A && this.G == pp1Var.G && this.H == pp1Var.H;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(pp1 pp1Var) {
        Comparator e01Var;
        boolean z9 = this.f7947u;
        boolean z10 = this.f7944q;
        if (z10 && z9) {
            e01Var = aq1.f2769j;
        } else {
            ry0 ry0Var = aq1.f2769j;
            ry0Var.getClass();
            e01Var = new e01(ry0Var);
        }
        uy0 uy0VarD = uy0.f9695a.d(z9, pp1Var.f7947u);
        Integer numValueOf = Integer.valueOf(this.f7949w);
        Integer numValueOf2 = Integer.valueOf(pp1Var.f7949w);
        uz0.f9712a.getClass();
        d01 d01Var = d01.f3528a;
        uy0 uy0VarC = uy0VarD.c(numValueOf, numValueOf2, d01Var).b(this.f7948v, pp1Var.f7948v).b(this.f7950x, pp1Var.f7950x).d(this.B, pp1Var.B).d(this.f7951y, pp1Var.f7951y).c(Integer.valueOf(this.f7952z), Integer.valueOf(pp1Var.f7952z), d01Var).b(this.A, pp1Var.A).d(z10, pp1Var.f7944q).c(Integer.valueOf(this.F), Integer.valueOf(pp1Var.F), d01Var);
        this.f7946t.getClass();
        uy0 uy0VarC2 = uy0VarC.d(this.G, pp1Var.G).d(this.H, pp1Var.H).c(Integer.valueOf(this.C), Integer.valueOf(pp1Var.C), e01Var).c(Integer.valueOf(this.D), Integer.valueOf(pp1Var.D), e01Var);
        if (yn0.c(this.f7945s, pp1Var.f7945s)) {
            uy0VarC2 = uy0VarC2.c(Integer.valueOf(this.E), Integer.valueOf(pp1Var.E), e01Var);
        }
        return uy0VarC2.a();
    }
}
