package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults_Factory;
import com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder_Factory;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class f10 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f4351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f4352d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f4353e;

    public f10(jy jyVar, yy yyVar, yy yyVar2, nh1 nh1Var) {
        this.f4349a = 15;
        this.f4350b = jyVar;
        this.f4351c = yyVar;
        this.f4352d = yyVar2;
        this.f4353e = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f4349a;
        qh1 qh1Var = this.f4353e;
        qh1 qh1Var2 = this.f4352d;
        qh1 qh1Var3 = this.f4351c;
        qh1 qh1Var4 = this.f4350b;
        switch (i10) {
            case 0:
                qi0 qi0Var = (qi0) qh1Var2;
                return new wi0((xs0) qh1Var4.zzb(), (p21) qh1Var3.zzb(), ((hk0) qh1Var).zzb(), new pi0(0, (Context) qi0Var.f8193a.zzb(), (d10) qi0Var.f8194b.zzb()));
            case 1:
                return new n70(new p10((Context) qh1Var4.zzb(), ((ry) qh1Var3).a(), ((x20) qh1Var2).a(), ((f40) qh1Var).a(), 0), nu.f7388f);
            case 2:
                vi0 vi0Var = (vi0) qh1Var2;
                return new wi0((xs0) qh1Var4.zzb(), (p21) qh1Var3.zzb(), ((hk0) qh1Var).zzb(), new ui0((Context) vi0Var.f9863a.zzb(), (z10) vi0Var.f9864b.zzb()));
            case 3:
                jt jtVarZzb = ((l30) qh1Var4).zzb();
                ak akVar = (ak) ((h20) qh1Var3).f5167a.f7834b;
                tp1.b0(akVar);
                return new f20(jtVarZzb, akVar, (Runnable) ((g20) qh1Var2).f4796a.f7835d, (Executor) qh1Var.zzb());
            case 4:
                return new i30((y3.a) qh1Var4.zzb(), (k30) qh1Var3.zzb(), ((f40) qh1Var2).a(), (String) qh1Var.zzb());
            case 5:
                v40 v40Var = (v40) qh1Var4.zzb();
                fr0 fr0VarA = ((x20) qh1Var3).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) qh1Var2.zzb();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new r30(v40Var, fr0VarA, scheduledExecutorService, muVar, (String) ((y20) qh1Var).f10732a.f4271f);
            case 6:
                return new n70(new p10((Context) qh1Var4.zzb(), ((ry) qh1Var3).a(), ((x20) qh1Var2).a(), ((f40) qh1Var).a(), 1), nu.f7388f);
            case 7:
                ej0 ej0Var = (ej0) qh1Var2;
                return new wi0((xs0) qh1Var4.zzb(), (p21) qh1Var3.zzb(), ((hk0) qh1Var).zzb(), new pi0(1, (Context) ej0Var.f4207a.zzb(), (i80) ej0Var.f4208b.zzb()));
            case 8:
                ub ubVar = (ub) qh1Var4.zzb();
                Executor executor = (Executor) qh1Var3.zzb();
                Context context = (Context) qh1Var2.zzb();
                return new a10(executor, new w00(context, ubVar), (y3.a) qh1Var.zzb());
            case 9:
                kc0 kc0Var = (kc0) qh1Var4.zzb();
                tb0 tb0Var = (tb0) ((b90) qh1Var3).f2941a.f6810d;
                tp1.b0(tb0Var);
                a10 a10Var = (a10) qh1Var2.zzb();
                w80 w80Var = (w80) ((a90) qh1Var).f2624a.zzb();
                tp1.b0(w80Var);
                return new ba0(kc0Var, tb0Var, a10Var, w80Var);
            case 10:
                return new eb0((Executor) qh1Var4.zzb(), (a10) qh1Var3.zzb(), (o70) qh1Var2.zzb(), (n00) qh1Var.zzb());
            case 11:
                return new mb0(((jy) qh1Var4).a(), ((t90) qh1Var3).a(), ((x90) qh1Var2).zzb(), (i90) qh1Var.zzb());
            case 12:
                return new nb0((String) ((y20) qh1Var4).f10732a.f4271f, (i90) qh1Var3.zzb(), ((t90) qh1Var2).a(), (ed0) qh1Var.zzb());
            case 13:
                ak0 ak0Var = (ak0) qh1Var2;
                return new wi0((xs0) qh1Var4.zzb(), (p21) qh1Var3.zzb(), ((hk0) qh1Var).zzb(), new pi0(2, (Context) ak0Var.f2718a.zzb(), (ec0) ak0Var.f2719b.zzb()));
            case 14:
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                return new hd0(muVar2, (zzr) qh1Var4.zzb(), ((CsiParamDefaults_Factory) qh1Var3).zzb(), ((CsiUrlBuilder_Factory) qh1Var2).zzb(), ((jy) qh1Var).a());
            case 15:
                Context contextA = ((jy) qh1Var4).a();
                Object objZzb = qh1Var3.zzb();
                Object objZzb2 = qh1Var2.zzb();
                int i11 = 17;
                rk0 rk0Var = new rk0(i11, ((ty) ((yg0) qh1Var).f10874a).zzb());
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                return new tg0(contextA, (p80) objZzb, (m20) objZzb2, rk0Var, muVar3, new pe(i11));
            case 16:
                return new qh0(((jy) qh1Var4).a(), (lh0) qh1Var3.zzb(), (zzr) qh1Var2.zzb(), (ed0) qh1Var.zzb());
            case 17:
                return new yh0(((jy) qh1Var4).a(), ((ry) qh1Var3).a(), ((x20) qh1Var2).a(), (fx) qh1Var.zzb());
            case 18:
                return new wi0((Context) qh1Var4.zzb(), (Executor) qh1Var3.zzb(), (i80) qh1Var2.zzb(), (er0) qh1Var.zzb());
            case 19:
                t80 t80Var = (t80) qh1Var4.zzb();
                mu muVar4 = nu.f7383a;
                tp1.b0(muVar4);
                ta0 ta0Var = (ta0) qh1Var3;
                ta0Var.getClass();
                tp1.b0(muVar4);
                xa0 xa0VarA = ((ya0) ta0Var.f9094a).zzb();
                ab0 ab0Var = (ab0) ta0Var.f9095b;
                ab0Var.getClass();
                return new hj0(t80Var, muVar4, new ep(muVar4, xa0VarA, new m20(muVar4, 20, ((ya0) ab0Var.f2631a).zzb()), 7, 0), (wr0) qh1Var2.zzb(), (xb0) qh1Var.zzb());
            case 20:
                return new wi0((xs0) qh1Var4.zzb(), (p21) qh1Var3.zzb(), (og) ((sk0) qh1Var2).f8903a.f8631b, new jp0(22, (i80) ((wk0) qh1Var).f10216a.zzb()));
            default:
                return new fo0(((af0) qh1Var4).zzb(), (PackageInfo) qh1Var3.zzb(), ((jy) qh1Var2).a(), (cd0) qh1Var.zzb());
        }
    }

    public /* synthetic */ f10(nh1 nh1Var, jh1 jh1Var, nh1 nh1Var2, jh1 jh1Var2, int i10) {
        this.f4349a = i10;
        this.f4350b = nh1Var;
        this.f4351c = jh1Var;
        this.f4352d = nh1Var2;
        this.f4353e = jh1Var2;
    }

    public /* synthetic */ f10(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, int i10) {
        this.f4349a = i10;
        this.f4350b = nh1Var;
        this.f4351c = nh1Var2;
        this.f4352d = nh1Var3;
        this.f4353e = nh1Var4;
    }

    public f10(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, int i10) {
        this.f4349a = i10;
        if (i10 != 19) {
            this.f4350b = nh1Var;
            this.f4351c = nh1Var2;
            this.f4352d = nh1Var3;
            this.f4353e = nh1Var5;
            return;
        }
        this.f4350b = nh1Var;
        this.f4351c = nh1Var3;
        this.f4352d = nh1Var4;
        this.f4353e = nh1Var5;
    }
}
