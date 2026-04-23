package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.ads.internal.zzu;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class ny implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f7411b;

    public ny(nh1 nh1Var) {
        this.f7410a = 25;
        this.f7411b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        Object j01Var;
        int i10 = this.f7410a;
        int i11 = 1;
        int i12 = 0;
        qh1 qh1Var = this.f7411b;
        switch (i10) {
            case 0:
                return new y9((zzj) qh1Var.zzb());
            case 1:
                ce0 ce0Var = (ce0) qh1Var.zzb();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                Set setSingleton = ((Boolean) zzba.zzc().a(eg.f4135t1)).booleanValue() ? Collections.singleton(new n70(ce0Var, muVar)) : Collections.emptySet();
                tp1.b0(setSingleton);
                return setSingleton;
            case 2:
                return new fj0((rc0) qh1Var.zzb());
            case 3:
                return new dk0((rc0) qh1Var.zzb());
            case 4:
                rb0 rb0Var = (rb0) qh1Var.zzb();
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                return new wr0(rb0Var, muVar2);
            case 5:
                return new fv0(((jy) qh1Var).a(), zzu.zzt().zzb());
            case 6:
                return new com.google.android.gms.ads.internal.util.zzbo(((jy) qh1Var).a());
            case 7:
                return new zzr((String) qh1Var.zzb());
            case 8:
                return new d00(((iy) qh1Var).zzb(), 0);
            case 9:
                return new d00(((iy) qh1Var).zzb(), 1);
            case 10:
                return new e00((le0) qh1Var.zzb(), 0);
            case 11:
                return new g00(i12, new lf0(((jy) ((bi0) qh1Var).f3025a).a()));
            case 12:
                return new h00(0, (le0) qh1Var.zzb());
            case 13:
                return new j00(((jy) qh1Var).a());
            case 14:
                return new g00(i11, (er0) qh1Var.zzb());
            case 15:
                jt jtVarE = jt.e(((jy) ((vz) qh1Var).f10009a).a());
                return new h00(1, new p80((y3.a) jtVarE.f6072a, 11, (gt) ((nh1) jtVarE.f6078g).zzb()));
            case 16:
                return new g00((Context) qh1Var.zzb());
            case 17:
                return new e00((le0) qh1Var.zzb(), 1);
            case 18:
                return new kn(((fn) qh1Var.zzb()).f4578a);
            case 19:
                try {
                    return new JSONObject(((x20) qh1Var).a().f4648z);
                } catch (JSONException unused) {
                    return null;
                }
            case 20:
                c20 c20Var = (c20) qh1Var;
                b20 b20Var = new b20((fx) ((y10) c20Var.f3160a).f10728a.f10633h, (Executor) c20Var.f3161b.zzb());
                if (((Boolean) zzba.zzc().a(eg.Fb)).booleanValue()) {
                    n70 n70Var = new n70(b20Var, nu.f7383a);
                    int i13 = fz0.f4738d;
                    j01Var = new j01(n70Var);
                } else {
                    int i14 = fz0.f4738d;
                    j01Var = c01.f3144v;
                }
                tp1.b0(j01Var);
                return j01Var;
            case sf.zzm /* 21 */:
                Set setSingleton2 = Collections.singleton(new n70((k20) qh1Var.zzb(), nu.f7388f));
                tp1.b0(setSingleton2);
                return setSingleton2;
            case 22:
                return new n70((j20) qh1Var.zzb(), nu.f7387e);
            case 23:
                return new n70((j20) qh1Var.zzb(), nu.f7387e);
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                Set setSingleton3 = Collections.singleton(new n70((k20) qh1Var.zzb(), nu.f7388f));
                tp1.b0(setSingleton3);
                return setSingleton3;
            case 25:
                p20 p20Var = (p20) qh1Var.zzb();
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                return new n70(p20Var, muVar3);
            case 26:
                return new n70(new q10(i12, (r50) ((o20) qh1Var).f7474a.f6809b), nu.f7388f);
            case 27:
                x10 x10Var = (x10) qh1Var;
                return new p20(new kt(((jy) x10Var.f10401a).a(), ((f40) x10Var.f10402b).a().f7646f));
            case 28:
                return new s20(((lh1) qh1Var).zzb());
            default:
                return new b30((b50) qh1Var.zzb());
        }
    }

    public /* synthetic */ ny(nh1 nh1Var, int i10) {
        this.f7410a = i10;
        this.f7411b = nh1Var;
    }

    public /* synthetic */ ny(nh1 nh1Var, int i10, int i11) {
        this.f7410a = i10;
        this.f7411b = nh1Var;
    }

    public /* synthetic */ ny(nh1 nh1Var, int i10, Object obj) {
        this.f7410a = i10;
        this.f7411b = nh1Var;
    }
}
