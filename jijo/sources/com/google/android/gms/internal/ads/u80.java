package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzj;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class u80 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f9414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f9415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f9416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f9417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f9418g;

    public u80(jh1 jh1Var, jh1 jh1Var2, nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, int i10) {
        this.f9412a = i10;
        if (i10 == 4) {
            this.f9413b = jh1Var;
            this.f9414c = jh1Var2;
            this.f9415d = nh1Var;
            this.f9416e = nh1Var3;
            this.f9417f = nh1Var4;
            this.f9418g = nh1Var5;
            return;
        }
        if (i10 != 8) {
            this.f9413b = jh1Var;
            this.f9414c = jh1Var2;
            this.f9415d = nh1Var;
            this.f9416e = nh1Var2;
            this.f9417f = nh1Var4;
            this.f9418g = nh1Var5;
            return;
        }
        this.f9413b = jh1Var;
        this.f9414c = jh1Var2;
        this.f9415d = nh1Var2;
        this.f9416e = nh1Var3;
        this.f9417f = nh1Var4;
        this.f9418g = nh1Var5;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f9412a;
        qh1 qh1Var = this.f9418g;
        qh1 qh1Var2 = this.f9417f;
        qh1 qh1Var3 = this.f9416e;
        qh1 qh1Var4 = this.f9415d;
        qh1 qh1Var5 = this.f9414c;
        qh1 qh1Var6 = this.f9413b;
        switch (i10) {
            case 0:
                gy gyVar = (gy) qh1Var6.zzb();
                tl0 tl0VarA = ((g40) qh1Var5).f4812a.a();
                u60 u60Var = ((y60) qh1Var4).f10790a;
                p80 p80Var = ((r80) qh1Var3).f8433a;
                r50 r50VarZzb = ((k10) qh1Var2).zzb();
                tj0 tj0Var = (tj0) qh1Var.zzb();
                l2.l lVar = new l2.l(((zy) gyVar).f11340c);
                lVar.f15165h = new z30(tl0VarA);
                lVar.f15164f = u60Var;
                lVar.f15170v = p80Var;
                lVar.f15166q = new rk0(0, null);
                lVar.f15167s = new m20(r50VarZzb, 0, (Object) null);
                lVar.f15169u = new i10(0, null);
                if (((Boolean) zzba.zzc().a(eg.f4058l3)).booleanValue()) {
                    lVar.f15168t = new i10(24, tj0Var);
                }
                t20 t20Var = (t20) lVar.p().W.zzb();
                tp1.b0(t20Var);
                return t20Var;
            case 1:
                Context contextA = ((jy) qh1Var6).a();
                zzj zzjVarZzb = ((iy) qh1Var5).zzb();
                ai0 ai0Var = (ai0) qh1Var4.zzb();
                nc0 nc0Var = (nc0) qh1Var3.zzb();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new n00(contextA, zzjVarZzb, ai0Var, nc0Var, muVar, (p21) qh1Var2.zzb(), (ScheduledExecutorService) qh1Var.zzb());
            case 2:
                return new p30(((jy) qh1Var6).a(), ((f40) qh1Var5).a(), ((ry) qh1Var4).a(), ((iy) qh1Var3).zzb(), (be0) qh1Var2.zzb(), (gt0) qh1Var.zzb());
            case 3:
                return new k80(((jy) qh1Var6).a(), (fx) ((g80) qh1Var5).f4844a.f7835d, ((x20) qh1Var4).a(), ((ry) qh1Var3).a(), (md) qh1Var2.zzb(), (yh0) qh1Var.zzb());
            case 4:
                Context contextA2 = ((jy) qh1Var6).a();
                or0 or0VarA = ((f40) qh1Var5).a();
                xq xqVarA = ((ze0) qh1Var4).zzb();
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                return new hf0(contextA2, or0VarA, xqVarA, muVar2, (ScheduledExecutorService) qh1Var3.zzb(), (dh0) qh1Var2.zzb(), (ft0) qh1Var.zzb());
            case 5:
                return new mj0((gy) qh1Var6.zzb(), ((r80) qh1Var5).f8433a, ((g40) qh1Var4).f4812a.a(), ((y60) qh1Var3).f10790a, (tj0) qh1Var2.zzb(), (gi0) qh1Var.zzb());
            case 6:
                return new mj0((gy) qh1Var6.zzb(), ((g40) qh1Var5).f4812a.a(), ((tk0) qh1Var4).f9183a, ((y60) qh1Var3).f10790a, (tj0) qh1Var2.zzb(), (gi0) qh1Var.zzb());
            case 7:
                return new mj0((gy) qh1Var6.zzb(), ((g40) qh1Var5).f4812a.a(), ((y60) qh1Var4).f10790a, ((e40) qh1Var3).f3854a.f11097d, (tj0) qh1Var2.zzb(), (gi0) qh1Var.zzb());
            case 8:
                zzj zzjVarZzb2 = ((iy) qh1Var6).zzb();
                Context contextA3 = ((jy) qh1Var5).a();
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                return new cp0(zzjVarZzb2, contextA3, muVar3, (ScheduledExecutorService) qh1Var4.zzb(), new lf0(((jy) ((bi0) qh1Var3).f3025a).a()), ((f40) qh1Var2).a(), ((ry) qh1Var).a());
            case 9:
                return new tp0((Context) qh1Var6.zzb(), (Executor) qh1Var5.zzb(), (gy) qh1Var4.zzb(), ((oq0) qh1Var3).zzb(), (sp0) qh1Var2.zzb(), new nr0(), ((ry) qh1Var).a());
            case 10:
                return new yq0((Context) qh1Var6.zzb(), (Executor) qh1Var5.zzb(), (gy) qh1Var4.zzb(), ((pq0) qh1Var3).zzb(), (wq0) qh1Var2.zzb(), new nr0(), (lr0) qh1Var.zzb());
            default:
                return new qr0((lh0) qh1Var6.zzb(), (vt0) qh1Var5.zzb(), ((x20) qh1Var4).a(), ((z20) qh1Var3).f11093a.h(), (n00) qh1Var2.zzb(), (ft0) qh1Var.zzb());
        }
    }

    public /* synthetic */ u80(nh1 nh1Var, nh1 nh1Var2, kh1 kh1Var, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, int i10) {
        this.f9412a = i10;
        this.f9413b = nh1Var;
        this.f9414c = nh1Var2;
        this.f9415d = kh1Var;
        this.f9416e = nh1Var3;
        this.f9417f = nh1Var4;
        this.f9418g = nh1Var5;
    }

    public /* synthetic */ u80(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, jh1 jh1Var, nh1 nh1Var4, nh1 nh1Var5, int i10) {
        this.f9412a = i10;
        this.f9413b = nh1Var;
        this.f9414c = nh1Var2;
        this.f9415d = nh1Var3;
        this.f9416e = jh1Var;
        this.f9417f = nh1Var4;
        this.f9418g = nh1Var5;
    }
}
