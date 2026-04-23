package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public final class fa0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f4437c;

    public fa0(nh1 nh1Var, nh1 nh1Var2) {
        this.f4435a = 18;
        this.f4436b = nh1Var;
        this.f4437c = nh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f4435a;
        int i11 = 0;
        qh1 qh1Var = this.f4437c;
        qh1 qh1Var2 = this.f4436b;
        switch (i10) {
            case 0:
                kc0 kc0Var = (kc0) qh1Var2.zzb();
                tb0 tb0Var = (tb0) ((b90) qh1Var).f2941a.f6810d;
                tp1.b0(tb0Var);
                return new ea0(kc0Var, tb0Var);
            case 1:
                com.google.android.gms.ads.internal.util.zzbo zzboVar = (com.google.android.gms.ads.internal.util.zzbo) qh1Var2.zzb();
                y3.a aVar = (y3.a) qh1Var.zzb();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new ra0(zzboVar, aVar, muVar);
            case 2:
                i90 i90Var = (i90) qh1Var2.zzb();
                n90 n90VarA = ((t90) qh1Var).a();
                jb0 jb0Var = new jb0("com.google.android.gms.ads.internal.instream.client.IInstreamAd");
                jb0Var.f5881a = n90VarA.E();
                jb0Var.f5882b = n90VarA.G();
                jb0Var.f5883d = i90Var;
                jb0Var.f5884f = false;
                jb0Var.f5885h = false;
                if (n90VarA.O() != null) {
                    n90VarA.O().j0(jb0Var);
                }
                return jb0Var;
            case 3:
                return new ac0((b50) qh1Var2.zzb(), ((x20) qh1Var).a());
            case 4:
                return new rc0(ur0.S(((jy) ((wz) qh1Var2).f10381a).a()), (qc0) qh1Var.zzb());
            case 5:
                return new uc0((kd) qh1Var2.zzb(), (qq0) qh1Var.zzb());
            case 6:
                return new ad0((cd0) qh1Var2.zzb(), (hd0) qh1Var.zzb());
            case 7:
                return new jd0((String) qh1Var2.zzb(), (hd0) qh1Var.zzb());
            case 8:
                return new nd0((kd0) qh1Var2.zzb(), (gy) qh1Var.zzb());
            case 9:
                return new qd0((jz) qh1Var2.zzb(), new jp0(16, (jl) ((pd0) qh1Var).f7859a.zzb()));
            case 10:
                return new ie0((be0) qh1Var2.zzb(), (qc0) qh1Var.zzb());
            case 11:
                return new me0(((jy) qh1Var2).a(), ((ry) qh1Var).a());
            case 12:
                y9 y9Var = (y9) qh1Var2.zzb();
                Context contextA = ((jy) qh1Var).a();
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                n5.a aVarB = muVar2.b(new xa(y9Var, 5, contextA));
                tp1.b0(aVarB);
                return aVarB;
            case 13:
                xs0 xs0Var = (xs0) qh1Var2.zzb();
                CookieManager cookieManagerZza = zzu.zzq().zza((Context) qh1Var.zzb());
                tl0 tl0Var = new tl0(xs0Var, ws0.G, null, us0.f9603d, Collections.emptyList(), tc1.r0(((q11) xs0Var.f9604a).b(new du(3, cookieManagerZza)), 1L, TimeUnit.SECONDS, xs0Var.f9605b));
                return new tl0((us0) tl0Var.f9190q, tl0Var.f9185a, (String) tl0Var.f9186b, (n5.a) tl0Var.f9187d, (List) tl0Var.f9188f, tc1.V((n5.a) tl0Var.f9189h, Exception.class, new f00(22, i11), ((us0) tl0Var.f9190q).f9604a)).d();
            case 14:
                try {
                    return z3.b.a((Context) qh1Var2.zzb()).d(0, ((af0) qh1Var).zzb().packageName);
                } catch (PackageManager.NameNotFoundException unused) {
                    return null;
                }
            case 15:
                return new ch0(((hh0) qh1Var2).zzb(), ((iy) qh1Var).zzb());
            case 16:
                Context context = (Context) qh1Var2.zzb();
                d10 d10Var = (d10) qh1Var.zzb();
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                return new ni0(context, d10Var, muVar3, i11);
            case 17:
                return new am0((y3.a) qh1Var2.zzb(), 0, ((f40) qh1Var).a());
            case 18:
                n5.a aVar2 = (n5.a) qh1Var2.zzb();
                mu muVar4 = nu.f7383a;
                tp1.b0(muVar4);
                return new hm0(aVar2, muVar4, (ScheduledExecutorService) qh1Var.zzb(), i11);
            case 19:
                fn0 fn0Var = (fn0) qh1Var2;
                fn0Var.getClass();
                mu muVar5 = nu.f7383a;
                tp1.b0(muVar5);
                return new jn0(new pm0(muVar5, ((jy) fn0Var.f4579a).a(), 2), 10000L, (y3.a) qh1Var.zzb());
            case 20:
                Context contextA2 = ((jy) ((xo0) qh1Var2).f10624a).a();
                mu muVar6 = nu.f7383a;
                tp1.b0(muVar6);
                return new jn0(new pm0(contextA2, muVar6, 6), 2147483647L, (y3.a) qh1Var.zzb());
            case sf.zzm /* 21 */:
                zo0 zo0Var = (zo0) qh1Var2;
                zo0Var.getClass();
                mu muVar7 = nu.f7383a;
                tp1.b0(muVar7);
                return new jn0(new pm0(muVar7, ((jy) zo0Var.f11280a).a(), 7), ((Long) bh.f3020a.k()).longValue(), (y3.a) qh1Var.zzb());
            case 22:
                em0 em0Var = (em0) qh1Var2;
                em0Var.getClass();
                mu muVar8 = nu.f7383a;
                tp1.b0(muVar8);
                or0 or0VarA = ((f40) em0Var.f4240a).a();
                return new eo0(new cm0(muVar8, or0VarA), ((Integer) zzba.zzc().a(eg.ub)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 23:
                return new eo0(((km0) qh1Var2).zzb(), ((Integer) zzba.zzc().a(eg.tb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new eo0(((om0) qh1Var2).zzb(), ((Integer) zzba.zzc().a(eg.vb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 25:
                rm0 rm0Var = (rm0) qh1Var2;
                rm0Var.getClass();
                mu muVar9 = nu.f7383a;
                tp1.b0(muVar9);
                return new eo0(new pm0(muVar9, ((jy) rm0Var.f8663a).a(), 0), ((Integer) zzba.zzc().a(eg.Db)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 26:
                um0 um0Var = (um0) qh1Var2;
                um0Var.getClass();
                mu muVar10 = nu.f7383a;
                tp1.b0(muVar10);
                return new eo0(new am0(muVar10, 1, (gu) um0Var.f9534a.zzb()), ((Integer) zzba.zzc().a(eg.ib)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 27:
                VersionInfoParcel versionInfoParcelA = ((ry) ((zm0) qh1Var2).f11277a).a();
                mu muVar11 = nu.f7383a;
                tp1.b0(muVar11);
                return new eo0(new am0(versionInfoParcelA, muVar11), ((Integer) zzba.zzc().a(eg.sb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 28:
                bn0 bn0Var = (bn0) qh1Var2;
                bn0Var.getClass();
                mu muVar12 = nu.f7383a;
                tp1.b0(muVar12);
                return new eo0(new pm0(muVar12, ((jy) bn0Var.f3066a).a(), 1), ((Integer) zzba.zzc().a(eg.rb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            default:
                return new eo0((jn0) qh1Var2.zzb(), ((Integer) zzba.zzc().a(eg.qb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
        }
    }

    public /* synthetic */ fa0(nh1 nh1Var, nh1 nh1Var2, int i10) {
        this.f4435a = i10;
        this.f4436b = nh1Var;
        this.f4437c = nh1Var2;
    }

    public /* synthetic */ fa0(nh1 nh1Var, nh1 nh1Var2, int i10, int i11) {
        this.f4435a = i10;
        this.f4436b = nh1Var;
        this.f4437c = nh1Var2;
    }
}
