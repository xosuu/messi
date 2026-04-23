package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class dz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zy f3764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f3765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f3766c;

    public /* synthetic */ dz(zy zyVar) {
        this.f3764a = zyVar;
    }

    public final jt a() {
        tp1.h0(this.f3765b, Context.class);
        Context context = this.f3765b;
        String str = this.f3766c;
        jt jtVar = new jt();
        jtVar.f6072a = this.f3764a;
        kh1 kh1VarA = kh1.a(context);
        jtVar.f6073b = kh1VarA;
        zy zyVar = (zy) jtVar.f6072a;
        nh1 nh1Var = zyVar.f11361m0;
        jtVar.f6074c = new pq0(kh1VarA, nh1Var, zyVar.f11363n0);
        jtVar.f6075d = ih1.b(new hp0(nh1Var, 4));
        nh1 nh1VarB = ih1.b(tc1.L);
        jtVar.f6076e = nh1VarB;
        nh1 nh1Var2 = zyVar.f11342d;
        kh1 kh1Var = zyVar.A;
        nh1 nh1Var3 = (nh1) jtVar.f6074c;
        nh1 nh1Var4 = (nh1) jtVar.f6075d;
        nh1 nh1VarB2 = ih1.b(new u80(kh1VarA, nh1Var2, kh1Var, nh1Var3, nh1Var4, nh1VarB, 10));
        jtVar.f6077f = nh1VarB2;
        jtVar.f6078g = ih1.b(new dr0(nh1VarB2, nh1Var4, nh1VarB));
        kh1 kh1VarB = kh1.b(str);
        jtVar.f6079h = kh1VarB;
        jtVar.f6080i = ih1.b(new gb0(kh1VarB, nh1VarB2, kh1VarA, nh1Var4, nh1VarB, zyVar.f11356k, zyVar.C, zyVar.f11377y, 5));
        return jtVar;
    }
}
