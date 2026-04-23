package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzu;
import java.util.Collections;
import java.util.Set;
import java.util.UUID;
import org.joda.time.DateTimeConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class e80 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f3877b;

    public e80(nh1 nh1Var) {
        this.f3876a = 29;
        this.f3877b = nh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f3876a;
        qh1 qh1Var = this.f3877b;
        switch (i10) {
            case 0:
                Set setSingleton = Collections.singleton(new n70((m80) qh1Var.zzb(), nu.f7388f));
                tp1.b0(setSingleton);
                return setSingleton;
            case 1:
                return new n70((g70) qh1Var.zzb(), nu.f7388f);
            case 2:
                return new m80((z40) qh1Var.zzb());
            case 3:
                r90 r90Var = (r90) ((s80) qh1Var).f8819a.f7834b;
                tp1.b0(r90Var);
                Set setSingleton2 = r90Var.f8540d != null ? Collections.singleton("banner") : Collections.emptySet();
                tp1.b0(setSingleton2);
                return setSingleton2;
            case 4:
                o90 o90Var = (o90) ((z80) qh1Var).f11183a.zzb();
                tp1.b0(o90Var);
                JSONObject jSONObject = o90Var.f7538b;
                if (jSONObject != null) {
                    return jSONObject;
                }
                try {
                    return new JSONObject(o90Var.f7838a.f4648z);
                } catch (JSONException unused) {
                    return null;
                }
            case 5:
                VersionInfoParcel versionInfoParcelA = ((ry) qh1Var).a();
                zzu.zzp();
                return new ub(UUID.randomUUID().toString(), versionInfoParcelA, "native", new JSONObject(), true);
            case 6:
                return new n70((ia0) qh1Var.zzb(), nu.f7383a);
            case 7:
                c90 c90Var = new c90(((t90) ((d90) qh1Var).f3600a).a());
                k90 k90Var = new k90();
                k90Var.f6217a = c90Var;
                return k90Var;
            case 8:
                return new p90(((x20) qh1Var).a());
            case 9:
                ll0 ll0Var = (ll0) qh1Var.zzb();
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                return new n70(ll0Var, muVar);
            case 10:
                ja0 ja0Var = (ja0) qh1Var.zzb();
                tp1.b0(ja0Var);
                return ja0Var;
            case 11:
                return new n70((g70) qh1Var.zzb(), nu.f7388f);
            case 12:
                return ((f40) qh1Var).a().f7655o.f1331b == 3 ? md.REWARDED_INTERSTITIAL : md.REWARD_BASED_VIDEO_AD;
            case 13:
                return ((f40) qh1Var).a().f7655o.f1331b == 3 ? "rewarded_interstitial" : "rewarded";
            case 14:
                return new n70(new k00(1, (fx) ((oc0) qh1Var).f7559a.zzb()), nu.f7387e);
            case 15:
                uc0 uc0Var = (uc0) qh1Var.zzb();
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                return new n70(uc0Var, muVar2);
            case 16:
                uc0 uc0Var2 = (uc0) qh1Var.zzb();
                mu muVar3 = nu.f7383a;
                tp1.b0(muVar3);
                return new n70(uc0Var2, muVar3);
            case 17:
                uc0 uc0Var3 = (uc0) qh1Var.zzb();
                mu muVar4 = nu.f7383a;
                tp1.b0(muVar4);
                return new n70(uc0Var3, muVar4);
            case 18:
                uc0 uc0Var4 = (uc0) qh1Var.zzb();
                mu muVar5 = nu.f7383a;
                tp1.b0(muVar5);
                return new n70(uc0Var4, muVar5);
            case 19:
                uc0 uc0Var5 = (uc0) qh1Var.zzb();
                mu muVar6 = nu.f7383a;
                tp1.b0(muVar6);
                return new n70(uc0Var5, muVar6);
            case 20:
                uc0 uc0Var6 = (uc0) qh1Var.zzb();
                mu muVar7 = nu.f7383a;
                tp1.b0(muVar7);
                return new n70(uc0Var6, muVar7);
            case sf.zzm /* 21 */:
                mu muVar8 = nu.f7383a;
                tp1.b0(muVar8);
                xc0 xc0Var = (xc0) qh1Var;
                Set setSingleton3 = ((Boolean) zzba.zzc().a(eg.f4138t4)).booleanValue() ? Collections.singleton(new n70(new wc0((kd) xc0Var.f10534a.zzb(), ((lh1) xc0Var.f10535b).zzb()), muVar8)) : Collections.emptySet();
                tp1.b0(setSingleton3);
                return setSingleton3;
            case 22:
                ad0 ad0Var = (ad0) qh1Var.zzb();
                mu muVar9 = nu.f7383a;
                tp1.b0(muVar9);
                return new n70(ad0Var, muVar9);
            case 23:
                ad0 ad0Var2 = (ad0) qh1Var.zzb();
                mu muVar10 = nu.f7383a;
                tp1.b0(muVar10);
                return new n70(ad0Var2, muVar10);
            case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                ad0 ad0Var3 = (ad0) qh1Var.zzb();
                mu muVar11 = nu.f7383a;
                tp1.b0(muVar11);
                return new n70(ad0Var3, muVar11);
            case 25:
                ad0 ad0Var4 = (ad0) qh1Var.zzb();
                mu muVar12 = nu.f7383a;
                tp1.b0(muVar12);
                return new n70(ad0Var4, muVar12);
            case 26:
                gd0 gd0Var = (gd0) qh1Var.zzb();
                mu muVar13 = nu.f7383a;
                tp1.b0(muVar13);
                return new n70(gd0Var, muVar13);
            case 27:
                hd0 hd0Var = (hd0) qh1Var.zzb();
                mu muVar14 = nu.f7383a;
                tp1.b0(muVar14);
                return new ed0(hd0Var, muVar14);
            case 28:
                return new kd0((y3.a) qh1Var.zzb());
            default:
                nd0 nd0Var = (nd0) qh1Var.zzb();
                mu muVar15 = nu.f7383a;
                tp1.b0(muVar15);
                Set setC = k70.c(nd0Var, muVar15);
                tp1.b0(setC);
                return setC;
        }
    }

    public /* synthetic */ e80(nh1 nh1Var, int i10) {
        this.f3876a = i10;
        this.f3877b = nh1Var;
    }

    public /* synthetic */ e80(nh1 nh1Var, int i10, int i11) {
        this.f3876a = i10;
        this.f3877b = nh1Var;
    }

    public /* synthetic */ e80(nh1 nh1Var, int i10, Object obj) {
        this.f3876a = i10;
        this.f3877b = nh1Var;
    }
}
