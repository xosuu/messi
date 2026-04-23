package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class wp1 extends yp1 implements Comparable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10285h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f10286q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10287s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f10288t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f10289u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10290v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f10291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f10292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f10293y;

    public wp1(int i10, ow owVar, int i11, up1 up1Var, int i12, String str) {
        int iF;
        super(i10, owVar, i11);
        int i13 = 0;
        this.f10286q = tp1.O(i12, false);
        int i14 = this.f11003f.f10706e;
        up1Var.getClass();
        this.f10287s = 1 == (i14 & 1);
        this.f10288t = (i14 & 2) != 0;
        bz0 bz0Var = up1Var.f10681h;
        bz0 bz0VarN = bz0Var.isEmpty() ? bz0.n(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED) : bz0Var;
        int i15 = 0;
        while (true) {
            if (i15 >= bz0VarN.size()) {
                i15 = Integer.MAX_VALUE;
                iF = 0;
                break;
            } else {
                iF = aq1.f(this.f11003f, (String) bz0VarN.get(i15), false);
                if (iF > 0) {
                    break;
                } else {
                    i15++;
                }
            }
        }
        this.f10289u = i15;
        this.f10290v = iF;
        int iE = aq1.e(this.f11003f.f10707f, up1Var.f10682i);
        this.f10291w = iE;
        this.f10293y = (this.f11003f.f10707f & 1088) != 0;
        int iF2 = aq1.f(this.f11003f, str, aq1.g(str) == null);
        this.f10292x = iF2;
        boolean z9 = iF > 0 || (bz0Var.isEmpty() && iE > 0) || this.f10287s || (this.f10288t && iF2 > 0);
        if (tp1.O(i12, up1Var.f9567q) && z9) {
            i13 = 1;
        }
        this.f10285h = i13;
    }

    @Override // com.google.android.gms.internal.ads.yp1
    public final int a() {
        return this.f10285h;
    }

    @Override // com.google.android.gms.internal.ads.yp1
    public final /* bridge */ /* synthetic */ boolean d(yp1 yp1Var) {
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int compareTo(wp1 wp1Var) {
        uy0 uy0VarD = uy0.f9695a.d(this.f10286q, wp1Var.f10286q);
        Integer numValueOf = Integer.valueOf(this.f10289u);
        Integer numValueOf2 = Integer.valueOf(wp1Var.f10289u);
        Comparator comparator = uz0.f9712a;
        comparator.getClass();
        d01 d01Var = d01.f3528a;
        uy0 uy0VarC = uy0VarD.c(numValueOf, numValueOf2, d01Var);
        int i10 = this.f10290v;
        uy0 uy0VarB = uy0VarC.b(i10, wp1Var.f10290v);
        int i11 = this.f10291w;
        uy0 uy0VarD2 = uy0VarB.b(i11, wp1Var.f10291w).d(this.f10287s, wp1Var.f10287s);
        Boolean boolValueOf = Boolean.valueOf(this.f10288t);
        Boolean boolValueOf2 = Boolean.valueOf(wp1Var.f10288t);
        if (i10 != 0) {
            comparator = d01Var;
        }
        uy0 uy0VarB2 = uy0VarD2.c(boolValueOf, boolValueOf2, comparator).b(this.f10292x, wp1Var.f10292x);
        if (i11 == 0) {
            uy0VarB2 = uy0VarB2.e(this.f10293y, wp1Var.f10293y);
        }
        return uy0VarB2.a();
    }
}
