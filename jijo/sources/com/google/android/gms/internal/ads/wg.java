package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzu;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class wg implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f10177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f10178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f10179d;

    public wg(jh1 jh1Var, jh1 jh1Var2, nh1 nh1Var, nh1 nh1Var2, int i10) {
        this.f10176a = i10;
        if (i10 != 29) {
            this.f10177b = jh1Var;
            this.f10178c = jh1Var2;
            this.f10179d = nh1Var;
        } else {
            this.f10177b = jh1Var;
            this.f10178c = nh1Var;
            this.f10179d = nh1Var2;
        }
    }

    private final bu a() {
        String string;
        y3.a aVar = (y3.a) this.f10177b.zzb();
        ju juVarZzb = ((sy) this.f10178c).zzb();
        String str = ((f40) this.f10179d).a().f7646f;
        iu iuVar = juVarZzb.f6083c;
        synchronized (iuVar) {
            string = iuVar.f5698a.toString();
            iuVar.f5698a = iuVar.f5698a.add(BigInteger.ONE);
            iuVar.f5699b = string;
        }
        return new bu(aVar, juVarZzb, string, str);
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Set setEmptySet;
        int i10 = 1;
        switch (this.f10176a) {
            case 0:
                ((jy) this.f10177b).a();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f10178c.zzb();
                return new ug(scheduledExecutorService);
            case 1:
                zzg zzgVar = (zzg) this.f10178c.zzb();
                return new gt(zzgVar);
            case 2:
                VersionInfoParcel versionInfoParcelA = ((ry) this.f10177b).a();
                JSONObject jSONObject = (JSONObject) this.f10178c.zzb();
                String str = (String) this.f10179d.zzb();
                boolean zEquals = "native".equals(str);
                zzu.zzp();
                return new ub(UUID.randomUUID().toString(), versionInfoParcelA, str, jSONObject, zEquals);
            case 3:
                return ((f40) this.f10177b).a().a() == null ? ((ri0) this.f10179d).zzb() : ((yi0) this.f10178c).zzb();
            case 4:
                return true != ((a20) this.f10177b).zzb().booleanValue() ? ((mk0) this.f10179d).zzb() : ((qj0) this.f10178c).zzb();
            case 5:
                return new k20(((x20) this.f10177b).a(), (v40) this.f10178c.zzb(), (j50) this.f10179d.zzb());
            case 6:
                return a();
            case 7:
                Context contextA = ((jy) this.f10177b).a();
                gt0 gt0Var = (gt0) this.f10178c.zzb();
                VersionInfoParcel versionInfoParcelA2 = ((ry) this.f10179d).a();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new n30(contextA, gt0Var, versionInfoParcelA2, muVar);
            case 8:
                return new q30((Context) this.f10177b.zzb(), ((ry) this.f10178c).a(), ((f40) this.f10179d).a());
            case 9:
                Context context = (Context) this.f10177b.zzb();
                VersionInfoParcel versionInfoParcelA3 = ((ry) this.f10178c).a();
                fr0 fr0VarA = ((x20) this.f10179d).a();
                zzbxi zzbxiVar = fr0VarA.A;
                if (zzbxiVar == null) {
                    return null;
                }
                ir0 ir0Var = fr0VarA.f4636s;
                return new ct(context, versionInfoParcelA3, zzbxiVar, ir0Var != null ? ir0Var.f5680b : null);
            case 10:
                r40 r40Var = new r40(((oh1) ((t40) this.f10177b).f9045a).zzb());
                Set setZzb = ((oh1) this.f10178c).zzb();
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                return new s40(r40Var, setZzb, muVar2, (ScheduledExecutorService) this.f10179d.zzb());
            case 11:
                return new o70((Context) this.f10177b.zzb(), ((oh1) this.f10178c).zzb(), ((x20) this.f10179d).a());
            case 12:
                n90 n90VarA = ((t90) this.f10177b).a();
                o90 o90Var = (o90) ((z80) this.f10178c).f11183a.zzb();
                tp1.b0(o90Var);
                Executor executor = (Executor) this.f10179d.zzb();
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                return new ia0(n90VarA, o90Var, executor, muVar3);
            case 13:
                return new kb0((String) ((y20) this.f10177b).f10732a.f4271f, (i90) this.f10178c.zzb(), ((t90) this.f10179d).a());
            case 14:
                return new lb0((String) ((y20) this.f10177b).f10732a.f4271f, (i90) this.f10178c.zzb(), ((t90) this.f10179d).a());
            case 15:
                int i11 = ((f40) this.f10179d).a().f7655o.f1331b;
                if (i11 != 0) {
                    return i11 + (-1) != 0 ? ((mk0) this.f10178c).zzb() : ((mk0) this.f10177b).zzb();
                }
                throw null;
            case 16:
                String str2 = (String) this.f10177b.zzb();
                Context contextA2 = ((jy) this.f10178c).a();
                mu muVar4 = nu.f7383a;
                tp1.b0(muVar4);
                Map mapZzb = ((lh1) this.f10179d).zzb();
                if (((Boolean) zzba.zzc().a(eg.f4138t4)).booleanValue()) {
                    kd kdVar = new kd(new v3.d0(contextA2));
                    synchronized (kdVar) {
                        if (kdVar.f6261c) {
                            try {
                                rf rfVar = kdVar.f6260b;
                                rfVar.d();
                                sf.A((sf) rfVar.f9462b, str2);
                            } catch (NullPointerException e10) {
                                zzu.zzo().i("AdMobClearcutLogger.modify", e10);
                            }
                        }
                    }
                    setEmptySet = Collections.singleton(new n70(new wc0(kdVar, mapZzb), muVar4));
                } else {
                    setEmptySet = Collections.emptySet();
                }
                tp1.b0(setEmptySet);
                return setEmptySet;
            case 17:
                return new gd0((cd0) this.f10177b.zzb(), ((oh1) this.f10178c).zzb(), (y3.a) this.f10179d.zzb());
            case 18:
                return new fe0((le0) this.f10177b.zzb(), ((f40) this.f10178c).a(), (String) this.f10179d.zzb());
            case 19:
                Context contextA3 = ((jy) this.f10177b).a();
                WeakReference weakReference = ((ky) this.f10178c).f6412a.f5435d;
                tp1.b0(weakReference);
                me0 me0Var = (me0) this.f10179d.zzb();
                mu muVar5 = nu.f7383a;
                tp1.b0(muVar5);
                return new te0(contextA3, weakReference, me0Var, muVar5);
            case 20:
                return new ni0((Context) this.f10177b.zzb(), (z10) this.f10178c.zzb(), (Executor) this.f10179d.zzb(), i10);
            case sf.zzm /* 21 */:
                Context context2 = (Context) this.f10177b.zzb();
                VersionInfoParcel versionInfoParcelA4 = ((ry) this.f10178c).a();
                i80 i80Var = (i80) this.f10179d.zzb();
                mu muVar6 = nu.f7383a;
                tp1.b0(muVar6);
                return new ui0(context2, versionInfoParcelA4, i80Var, muVar6);
            case 22:
                return new ni0((Context) this.f10177b.zzb(), (t80) this.f10178c.zzb(), (Executor) this.f10179d.zzb(), 2);
            case 23:
                return new ui0((Context) this.f10177b.zzb(), (t80) this.f10178c.zzb(), ((ry) this.f10179d).a());
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new yj0((Context) this.f10177b.zzb(), (Executor) this.f10178c.zzb(), (ec0) this.f10179d.zzb(), 0);
            case 25:
                return new yj0((Context) this.f10177b.zzb(), (Executor) this.f10178c.zzb(), (ec0) this.f10179d.zzb(), 1);
            case 26:
                mu muVar7 = nu.f7383a;
                tp1.b0(muVar7);
                return new im0(muVar7, ((f40) this.f10177b).a(), ((ry) this.f10178c).a(), ((sy) this.f10179d).zzb(), 2);
            case 27:
                Context contextA4 = ((jy) this.f10177b).a();
                gu guVar = (gu) this.f10178c.zzb();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.f10179d.zzb();
                mu muVar8 = nu.f7383a;
                tp1.b0(muVar8);
                return new xl0(contextA4, guVar, scheduledExecutorService2, muVar8);
            case 28:
                mu muVar9 = nu.f7383a;
                tp1.b0(muVar9);
                return new im0(muVar9, ((f40) this.f10177b).a(), (PackageInfo) this.f10178c.zzb(), ((iy) this.f10179d).zzb(), 5);
            default:
                tp1.b0(((kp0) this.f10177b).f6363a.v());
                gu guVar2 = (gu) this.f10178c.zzb();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.f10179d.zzb();
                mu muVar10 = nu.f7383a;
                tp1.b0(muVar10);
                return new hm0(guVar2, scheduledExecutorService3, muVar10, 0);
        }
    }

    public /* synthetic */ wg(jh1 jh1Var, nh1 nh1Var, nh1 nh1Var2, int i10) {
        this.f10176a = i10;
        this.f10177b = jh1Var;
        this.f10178c = nh1Var;
        this.f10179d = nh1Var2;
    }

    public wg(nh1 nh1Var, ry ryVar, nh1 nh1Var2) {
        this.f10176a = 9;
        this.f10177b = nh1Var;
        this.f10178c = ryVar;
        this.f10179d = nh1Var2;
    }

    public /* synthetic */ wg(nh1 nh1Var, nh1 nh1Var2, jh1 jh1Var, int i10) {
        this.f10176a = i10;
        this.f10177b = nh1Var;
        this.f10178c = nh1Var2;
        this.f10179d = jh1Var;
    }

    public /* synthetic */ wg(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, int i10) {
        this.f10176a = i10;
        this.f10177b = nh1Var;
        this.f10178c = nh1Var2;
        this.f10179d = nh1Var3;
    }

    public /* synthetic */ wg(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, int i10, int i11) {
        this.f10176a = i10;
        this.f10177b = nh1Var;
        this.f10178c = nh1Var2;
        this.f10179d = nh1Var3;
    }
}
