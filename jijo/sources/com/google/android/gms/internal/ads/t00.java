package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class t00 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9012a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f9014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f9015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f9016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f9017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f9018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f9019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f9020i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f9021j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qh1 f9022k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qh1 f9023l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qh1 f9024m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qh1 f9025n;

    public t00(jy jyVar, nh1 nh1Var, nh1 nh1Var2, a30 a30Var, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, jh1 jh1Var, jh1 jh1Var2, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8, c40 c40Var) {
        this.f9013b = jyVar;
        this.f9014c = nh1Var;
        this.f9015d = nh1Var2;
        this.f9016e = a30Var;
        this.f9017f = nh1Var3;
        this.f9018g = nh1Var4;
        this.f9019h = nh1Var5;
        this.f9020i = jh1Var;
        this.f9021j = jh1Var2;
        this.f9022k = nh1Var6;
        this.f9023l = nh1Var7;
        this.f9024m = nh1Var8;
        this.f9025n = c40Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f9012a;
        qh1 qh1Var = this.f9025n;
        qh1 qh1Var2 = this.f9024m;
        qh1 qh1Var3 = this.f9023l;
        qh1 qh1Var4 = this.f9022k;
        qh1 qh1Var5 = this.f9021j;
        qh1 qh1Var6 = this.f9020i;
        qh1 qh1Var7 = this.f9019h;
        qh1 qh1Var8 = this.f9018g;
        qh1 qh1Var9 = this.f9017f;
        qh1 qh1Var10 = this.f9016e;
        qh1 qh1Var11 = this.f9015d;
        qh1 qh1Var12 = this.f9014c;
        qh1 qh1Var13 = this.f9013b;
        switch (i10) {
            case 0:
                Context contextA = ((jy) qh1Var13).a();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                Executor executor = (Executor) qh1Var12.zzb();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) qh1Var11.zzb();
                kr0 kr0VarK = ((a30) qh1Var10).f2572a.k();
                tp1.b0(kr0VarK);
                fr0 fr0VarA = ((x20) qh1Var9).a();
                ut0 ut0Var = (ut0) qh1Var8.zzb();
                qr0 qr0Var = (qr0) qh1Var7.zzb();
                View view = (View) qh1Var6.zzb();
                fx fxVar = (fx) qh1Var5.zzb();
                y9 y9Var = (y9) qh1Var4.zzb();
                ug ugVar = (ug) qh1Var3.zzb();
                return new s00(contextA, muVar, executor, scheduledExecutorService, kr0VarK, fr0VarA, ut0Var, qr0Var, view, fxVar, y9Var, ugVar, ((c40) qh1Var).f3167a.f11098e);
            default:
                jt jtVarA = ((jf0) qh1Var13).zzb();
                or0 or0VarA = ((f40) qh1Var12).a();
                xs0 xs0Var = (xs0) qh1Var11.zzb();
                zz zzVar = (zz) qh1Var10;
                yz yzVar = new yz(((lh1) zzVar.f11380a).zzb(), ((lh1) zzVar.f11381b).zzb());
                wj0 wj0VarA = ((xj0) qh1Var9).zzb();
                n60 n60Var = (n60) qh1Var8.zzb();
                kr0 kr0Var = (kr0) qh1Var7.zzb();
                tl0 tl0VarA = ((ag0) qh1Var6).zzb();
                g4.c cVarA = ((v30) qh1Var5).zzb();
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                wf0 wf0Var = (wf0) qh1Var4;
                Map map = ((mh1) wf0Var.f10167a).f4528a;
                tp1.b0(muVar2);
                vf0 vf0Var = new vf0(map, muVar2, new s50(((oh1) ((t50) wf0Var.f10168b).f9055a).zzb()));
                gi0 gi0Var = (gi0) qh1Var3.zzb();
                eg0 eg0Var = (eg0) qh1Var2;
                eg0Var.getClass();
                tp1.b0(muVar2);
                cg0 cg0Var = (cg0) eg0Var.f4199a;
                cg0Var.getClass();
                mu muVar3 = nu.f7384b;
                tp1.b0(muVar3);
                jg0 jg0Var = (jg0) cg0Var.f3270a;
                return new f30(jtVarA, or0VarA, xs0Var, yzVar, wj0VarA, n60Var, kr0Var, tl0VarA, cVarA, muVar2, vf0Var, gi0Var, new ep(muVar2, new ep(muVar3, muVar2, new hg0(((jy) jg0Var.f5937a).a(), (ScheduledExecutorService) jg0Var.f5938b.zzb(), 1), 9, 0), (xs0) eg0Var.f4200b.zzb(), 10, 0), ((gg0) qh1Var).zzb());
        }
    }

    public t00(nh1 nh1Var, f40 f40Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8, wf0 wf0Var, nh1 nh1Var9, eg0 eg0Var, gg0 gg0Var) {
        this.f9013b = nh1Var;
        this.f9014c = f40Var;
        this.f9015d = nh1Var2;
        this.f9016e = nh1Var3;
        this.f9017f = nh1Var4;
        this.f9018g = nh1Var5;
        this.f9019h = nh1Var6;
        this.f9020i = nh1Var7;
        this.f9021j = nh1Var8;
        this.f9022k = wf0Var;
        this.f9023l = nh1Var9;
        this.f9024m = eg0Var;
        this.f9025n = gg0Var;
    }
}
