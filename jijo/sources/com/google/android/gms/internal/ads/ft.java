package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzb;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.joda.time.DateTimeConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ft implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f4651c;

    public ft(nh1 nh1Var, nh1 nh1Var2) {
        this.f4649a = 14;
        this.f4650b = nh1Var;
        this.f4651c = nh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f4649a;
        qh1 qh1Var = this.f4651c;
        qh1 qh1Var2 = this.f4650b;
        switch (i10) {
            case 0:
                return new et((Context) qh1Var2.zzb(), (zzg) qh1Var.zzb());
            case 1:
                ht htVar = (ht) qh1Var;
                return new pt((Context) qh1Var2.zzb(), new p80((y3.a) htVar.f5389a.zzb(), 11, (gt) htVar.f5390b.zzb()));
            case 2:
                return new o00(((x20) qh1Var2).a(), ((sy) qh1Var).zzb());
            case 3:
                return new w00(((jy) qh1Var2).a(), (ub) qh1Var.zzb());
            case 4:
                ub ubVar = (ub) qh1Var2.zzb();
                kn knVar = (kn) qh1Var.zzb();
                mu muVarW = tp1.w();
                tp1.b0(muVarW);
                return new v00(ubVar.f9446c, knVar, muVarW);
            case 5:
                y00 y00Var = (y00) qh1Var2.zzb();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                Set setEmptySet = ((JSONObject) qh1Var.zzb()) == null ? Collections.emptySet() : Collections.singleton(new n70(y00Var, muVar));
                tp1.b0(setEmptySet);
                return setEmptySet;
            case 6:
                y00 y00Var2 = (y00) qh1Var2.zzb();
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                Set setEmptySet2 = ((JSONObject) qh1Var.zzb()) == null ? Collections.emptySet() : Collections.singleton(new n70(y00Var2, muVar2));
                tp1.b0(setEmptySet2);
                return setEmptySet2;
            case 7:
                y00 y00Var3 = (y00) qh1Var2.zzb();
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                Set setEmptySet3 = ((JSONObject) qh1Var.zzb()) == null ? Collections.emptySet() : Collections.singleton(new n70(y00Var3, muVar3));
                tp1.b0(setEmptySet3);
                return setEmptySet3;
            case 8:
                y00 y00Var4 = (y00) qh1Var2.zzb();
                mu muVar4 = nu.f7383a;
                tp1.b0(muVar4);
                Set setEmptySet4 = ((JSONObject) qh1Var.zzb()) == null ? Collections.emptySet() : Collections.singleton(new n70(y00Var4, muVar4));
                tp1.b0(setEmptySet4);
                return setEmptySet4;
            case 9:
                return new eo0(((zl0) qh1Var2).zzb(), ((Integer) zzba.zzc().a(eg.xb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 10:
                cn0 cn0Var = (cn0) qh1Var2;
                cn0Var.getClass();
                tp1.b0(nu.f7383a);
                return new eo0(new ul0(((f40) cn0Var.f3342a).a()), ((Integer) zzba.zzc().a(eg.Cb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 11:
                return new eo0(((un0) qh1Var2).zzb(), ((Integer) zzba.zzc().a(eg.yb)).intValue(), (ScheduledExecutorService) qh1Var.zzb());
            case 12:
                return new g30((y3.a) qh1Var2.zzb(), (bu) qh1Var.zzb());
            case 13:
                return new h30((k30) qh1Var2.zzb(), ((f40) qh1Var).a());
            case 14:
                return new zzb((Context) qh1Var2.zzb(), (dt) qh1Var.zzb(), null);
            case 15:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case 16:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case 17:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case 18:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case 19:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case 20:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case sf.zzm /* 21 */:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case 22:
                return new n70((d60) qh1Var2.zzb(), (Executor) qh1Var.zzb());
            case 23:
                return new t30(((x20) qh1Var).a());
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                return new m50(((oh1) qh1Var2).zzb(), ((x20) qh1Var).a());
            case 25:
                return new s70(((x20) qh1Var2).a(), (vt0) qh1Var.zzb());
            case 26:
                return new h80((l50) qh1Var2.zzb(), (j70) qh1Var.zzb());
            case 27:
                return new o70((Context) qh1Var2.zzb(), new HashSet(), ((x20) qh1Var).a());
            case 28:
                fr0 fr0VarA = ((x20) qh1Var2).a();
                JSONObject jSONObject = (JSONObject) ((y80) qh1Var).f10798a.f6809b;
                tp1.b0(jSONObject);
                return new o90(fr0VarA, jSONObject);
            default:
                tb0 tb0Var = (tb0) ((b90) qh1Var2).f2941a.f6810d;
                tp1.b0(tb0Var);
                return new z90(tb0Var, (y3.a) qh1Var.zzb());
        }
    }

    public /* synthetic */ ft(nh1 nh1Var, nh1 nh1Var2, int i10) {
        this.f4649a = i10;
        this.f4650b = nh1Var;
        this.f4651c = nh1Var2;
    }

    public /* synthetic */ ft(nh1 nh1Var, nh1 nh1Var2, int i10, int i11) {
        this.f4649a = i10;
        this.f4650b = nh1Var;
        this.f4651c = nh1Var2;
    }

    public /* synthetic */ ft(nh1 nh1Var, nh1 nh1Var2, int i10, Object obj) {
        this.f4649a = i10;
        this.f4650b = nh1Var;
        this.f4651c = nh1Var2;
    }
}
