package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class z00 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f11085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f11086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f11087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f11088e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f11089f;

    public z00(jy jyVar, py pyVar, yg0 yg0Var, nh1 nh1Var, nh1 nh1Var2) {
        this.f11084a = 5;
        this.f11085b = jyVar;
        this.f11086c = pyVar;
        this.f11087d = yg0Var;
        this.f11088e = nh1Var;
        this.f11089f = nh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        boolean z9;
        boolean z10;
        int i10 = this.f11084a;
        qh1 qh1Var = this.f11088e;
        Object obj = this.f11089f;
        qh1 qh1Var2 = this.f11087d;
        qh1 qh1Var3 = this.f11086c;
        qh1 qh1Var4 = this.f11085b;
        switch (i10) {
            case 0:
                return new y00((kn) qh1Var4.zzb(), (w00) qh1Var3.zzb(), (Executor) qh1Var2.zzb(), (v00) qh1Var.zzb(), (y3.a) ((qh1) obj).zzb());
            case 1:
                return new j20(((jy) qh1Var4).a(), (fx) ((y10) qh1Var3).f10728a.f10633h, ((x20) qh1Var2).a(), ((ry) qh1Var).a(), (yh0) ((qh1) obj).zzb());
            case 2:
                d80 d80Var = (d80) qh1Var4;
                kt ktVar = new kt(((jy) d80Var.f3597a).a(), ((f40) d80Var.f3598b).a().f7646f);
                Context contextA = ((jy) qh1Var3).a();
                mt mtVar = (mt) qh1Var2.zzb();
                fx fxVar = (fx) ((b80) qh1Var).f2939a.f7835d;
                return new n80(ktVar, contextA, mtVar, fxVar == null ? null : fxVar.q(), (md) ((qh1) obj).zzb());
            case 3:
                Map mapZzb = ((lh1) qh1Var4).zzb();
                Map mapZzb2 = ((lh1) qh1Var3).zzb();
                Map mapZzb3 = ((lh1) qh1Var2).zzb();
                r90 r90Var = (r90) ((s80) ((qh1) obj)).f8819a.f7834b;
                tp1.b0(r90Var);
                return new o80(mapZzb, mapZzb2, mapZzb3, this.f11088e, r90Var);
            case 4:
                Context contextA2 = ((jy) qh1Var4).a();
                String packageName = ((jy) ((df0) qh1Var3).f3643a).a().getPackageName();
                tp1.b0(packageName);
                VersionInfoParcel versionInfoParcelA = ((ry) qh1Var2).a();
                md mdVar = (md) qh1Var.zzb();
                String str = (String) ((qh1) obj).zzb();
                kd kdVar = new kd(new v3.d0(contextA2));
                fe feVarB = ge.B();
                int i11 = versionInfoParcelA.buddyApkVersion;
                feVarB.d();
                ge.C((ge) feVarB.f9462b, i11);
                int i12 = versionInfoParcelA.clientJarVersion;
                feVarB.d();
                ge.D((ge) feVarB.f9462b, i12);
                int i13 = true != versionInfoParcelA.isClientJar ? 2 : 0;
                feVarB.d();
                ge.A((ge) feVarB.f9462b, i13);
                kdVar.a(new xq(mdVar, packageName, (ge) feVarB.b(), str, 13, (Object) null));
                return kdVar;
            case 5:
                Context contextA3 = ((jy) qh1Var4).a();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                pe peVar = new pe(17);
                gy gyVar = (gy) ((py) qh1Var3).f8009a.zzb();
                tp1.b0(gyVar);
                return new sg0(contextA3, muVar, peVar, gyVar, new rk0(17, ((ty) ((yg0) qh1Var2).f10874a).zzb()), (ArrayDeque) qh1Var.zzb(), (gt0) ((qh1) obj).zzb());
            case 6:
                return new oj0((gy) qh1Var4.zzb(), ((g40) qh1Var3).f4812a.a(), ((y60) qh1Var2).f10790a, (tj0) qh1Var.zzb(), (gi0) ((qh1) obj).zzb());
            case 7:
                return new qk0((Context) qh1Var4.zzb(), (z10) qh1Var3.zzb(), (xs0) qh1Var2.zzb(), (p21) qh1Var.zzb(), (og) ((sk0) ((qh1) obj)).f8903a.f8631b);
            case 8:
                return new dl0((Context) qh1Var4.zzb(), (zzbh) ((q80) qh1Var3).f8137a.f7835d, ((f40) qh1Var2).a(), ((o10) ((v10) qh1Var).f9730a).zzb(), (ed0) ((qh1) obj).zzb());
            case 9:
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                return new lo0(muVar2, (ScheduledExecutorService) qh1Var4.zzb(), (String) qh1Var3.zzb(), (Context) qh1Var2.zzb(), ((f40) qh1Var).a(), (gy) ((qh1) obj).zzb());
            case 10:
                zt ztVar = new zt();
                Context contextA4 = ((jy) qh1Var4).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) qh1Var3.zzb();
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                int iIntValue = Integer.valueOf(((lp0) qh1Var2).f6689a.zza()).intValue();
                gp0 gp0Var = ((mp0) qh1Var).f7028a;
                switch (gp0Var.f5024a) {
                    case 0:
                        z9 = ((zzbuc) gp0Var.f5026d).f11562u;
                        break;
                    default:
                        z9 = ((zzbvb) gp0Var.f5026d).f11585x;
                        break;
                }
                return new ep0(ztVar, contextA4, scheduledExecutorService, muVar3, iIntValue, Boolean.valueOf(z9).booleanValue(), Boolean.valueOf(((zzbvb) ((op0) ((qh1) obj)).f7631a.f5026d).f11584w).booleanValue());
            case 11:
                Integer.valueOf(((lp0) qh1Var4).f6689a.zza()).intValue();
                ((jy) qh1Var3).a();
                gu guVar = (gu) qh1Var2.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) qh1Var.zzb();
                mu muVar4 = nu.f7383a;
                tp1.b0(muVar4);
                tp1.b0(((kp0) ((qh1) obj)).f6363a.v());
                return new hm0(guVar, scheduledExecutorService2, muVar4);
            case 12:
                gu guVar2 = (gu) qh1Var4.zzb();
                gp0 gp0Var2 = ((np0) qh1Var3).f7352a;
                switch (gp0Var2.f5024a) {
                    case 0:
                        z10 = ((zzbuc) gp0Var2.f5026d).f11561t;
                        break;
                    default:
                        z10 = ((zzbvb) gp0Var2.f5026d).f11574a.getBoolean("is_gbid");
                        break;
                }
                boolean zBooleanValue = Boolean.valueOf(z10).booleanValue();
                boolean zBooleanValue2 = Boolean.valueOf(((zzbvb) ((op0) qh1Var2).f7631a.f5026d).f11584w).booleanValue();
                mu muVar5 = nu.f7383a;
                tp1.b0(muVar5);
                tp1.b0(((kp0) qh1Var).f6363a.v());
                return new pp0(guVar2, zBooleanValue, zBooleanValue2, muVar5, (ScheduledExecutorService) ((qh1) obj).zzb());
            case 13:
                return new uq0((Context) qh1Var4.zzb(), (Executor) qh1Var3.zzb(), (gy) qh1Var2.zzb(), (kl0) qh1Var.zzb(), (wq0) ((qh1) obj).zzb(), new nr0());
            default:
                y3.a aVar = (y3.a) qh1Var4.zzb();
                ep epVarA = ((vj0) qh1Var3).zzb();
                gi0 gi0Var = (gi0) qh1Var2.zzb();
                vt0 vt0Var = (vt0) qh1Var.zzb();
                tj0 tj0Var = (tj0) ((i10) obj).f5456b;
                return tj0Var != null ? tj0Var : new tj0(aVar, epVarA, gi0Var, vt0Var);
        }
    }

    public z00(i10 i10Var, nh1 nh1Var, vj0 vj0Var, nh1 nh1Var2, nh1 nh1Var3) {
        this.f11084a = 14;
        this.f11089f = i10Var;
        this.f11085b = nh1Var;
        this.f11086c = vj0Var;
        this.f11087d = nh1Var2;
        this.f11088e = nh1Var3;
    }

    public z00(nh1 nh1Var, jh1 jh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, jh1 jh1Var2, nh1 nh1Var5, int i10) {
        this.f11084a = i10;
        if (i10 == 11) {
            this.f11085b = jh1Var;
            this.f11086c = nh1Var2;
            this.f11087d = nh1Var3;
            this.f11088e = nh1Var4;
            this.f11089f = nh1Var5;
            return;
        }
        if (i10 != 12) {
            this.f11085b = jh1Var;
            this.f11086c = nh1Var2;
            this.f11087d = nh1Var4;
            this.f11088e = jh1Var2;
            this.f11089f = nh1Var5;
            return;
        }
        this.f11085b = nh1Var;
        this.f11086c = jh1Var;
        this.f11087d = nh1Var2;
        this.f11088e = jh1Var2;
        this.f11089f = nh1Var5;
    }

    public /* synthetic */ z00(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, int i10) {
        this.f11084a = i10;
        this.f11085b = nh1Var;
        this.f11086c = nh1Var2;
        this.f11087d = nh1Var3;
        this.f11088e = nh1Var4;
        this.f11089f = nh1Var5;
    }

    public z00(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, jh1 jh1Var, int i10) {
        this.f11084a = i10;
        if (i10 != 13) {
            this.f11085b = nh1Var2;
            this.f11086c = nh1Var3;
            this.f11087d = nh1Var4;
            this.f11088e = nh1Var5;
            this.f11089f = jh1Var;
            return;
        }
        this.f11085b = nh1Var;
        this.f11086c = nh1Var2;
        this.f11087d = nh1Var3;
        this.f11088e = nh1Var4;
        this.f11089f = nh1Var5;
    }
}
