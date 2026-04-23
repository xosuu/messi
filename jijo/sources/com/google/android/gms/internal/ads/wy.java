package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class wy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10374a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy f10375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nh1 f10376c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final nh1 f10377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final nh1 f10378e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k21 f10379f;

    public wy(zy zyVar, gp0 gp0Var) {
        this.f10375b = zyVar;
        this.f10379f = gp0Var;
        this.f10376c = ih1.b(new hp0(zyVar.f11368q, 9));
        f80 f80Var = new f80(1, gp0Var);
        nh1 nh1VarB = ih1.b(tp1.f9246n);
        nh1 nh1VarB2 = ih1.b(en1.K);
        nh1 nh1VarB3 = ih1.b(tc1.H);
        nh1 nh1VarB4 = ih1.b(en1.L);
        int i10 = lh1.f6629b;
        LinkedHashMap linkedHashMapW = tp1.W(4);
        linkedHashMapW.put(ws0.f10332q, nh1VarB);
        linkedHashMapW.put(ws0.f10333s, nh1VarB2);
        linkedHashMapW.put(ws0.f10335u, nh1VarB3);
        linkedHashMapW.put(ws0.f10337w, nh1VarB4);
        nh1 nh1VarB5 = ih1.b(new wg((jh1) f80Var, (nh1) zyVar.f11350h, (nh1) new lh1(linkedHashMapW), 16));
        int i11 = oh1.f7580c;
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(nh1VarB5);
        zs0 zs0Var = new zs0(new oh1(listEmptyList, arrayList));
        this.f10377d = zs0Var;
        this.f10378e = ih1.b(new on0(zyVar.f11344e, (jh1) zs0Var, 19));
    }

    public final uo0 a() {
        boolean z9;
        eo0 eo0Var;
        boolean z10;
        List list;
        String string;
        int i10 = this.f10374a;
        k21 k21Var = this.f10379f;
        zy zyVar = this.f10375b;
        switch (i10) {
            case 0:
                Context context = zyVar.f11338b.f5433b;
                tp1.b0(context);
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                tp1.b0(((zzbug) ((jp0) k21Var).f6060b).f11570q);
                co0 co0Var = new co0();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) zyVar.f11344e.zzb();
                ft0 ft0Var = (ft0) this.f10378e.zzb();
                ed0 ed0Var = (ed0) zyVar.f11377y.zzb();
                HashSet hashSet = new HashSet();
                hashSet.add(new eo0(co0Var, 0L, scheduledExecutorService));
                return new uo0(context, muVar, hashSet, ft0Var, ed0Var);
            default:
                Context context2 = zyVar.f11338b.f5433b;
                tp1.b0(context2);
                mu muVar2 = nu.f7383a;
                tp1.b0(muVar2);
                gp0 gp0Var = (gp0) k21Var;
                tp1.b0(gp0Var.v());
                co0 co0Var2 = new co0(0);
                nh1 nh1Var = zyVar.f11344e;
                eo0 eo0Var2 = new eo0(co0Var2, 0L, (ScheduledExecutorService) nh1Var.zzb());
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) nh1Var.zzb();
                hy hyVar = zyVar.f11338b;
                tp1.b0(hyVar.f5433b);
                eo0 eo0Var3 = new eo0(new ul0(scheduledExecutorService2), ((Long) zzba.zzc().a(eg.K3)).longValue(), (ScheduledExecutorService) nh1Var.zzb());
                zt ztVar = new zt();
                Context context3 = hyVar.f5433b;
                tp1.b0(context3);
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) nh1Var.zzb();
                int iZza = gp0Var.zza();
                int i11 = gp0Var.f5024a;
                switch (i11) {
                    case 0:
                        z9 = ((zzbuc) gp0Var.f5026d).f11562u;
                        break;
                    default:
                        z9 = ((zzbvb) gp0Var.f5026d).f11585x;
                        break;
                }
                boolean z11 = z9;
                switch (i11) {
                    case 0:
                        eo0Var = eo0Var3;
                        z10 = ((zzbuc) gp0Var.f5026d).f11561t;
                        break;
                    default:
                        eo0Var = eo0Var3;
                        z10 = ((zzbvb) gp0Var.f5026d).f11574a.getBoolean("is_gbid");
                        break;
                }
                eo0 eo0Var4 = new eo0(new ep0(ztVar, context3, scheduledExecutorService3, muVar2, iZza, z11, z10), 0L, (ScheduledExecutorService) nh1Var.zzb());
                eo0 eo0Var5 = new eo0(new kn0(muVar2, 5, 0), 0L, (ScheduledExecutorService) nh1Var.zzb());
                co0 co0Var3 = new co0(2);
                tp1.b0(hyVar.f5433b);
                kn0 kn0Var = new kn0(muVar2);
                to0[] to0VarArr = new to0[5];
                switch (i11) {
                    case 0:
                        list = ((zzbuc) gp0Var.f5026d).f11560s;
                        break;
                    default:
                        list = ((zzbvb) gp0Var.f5026d).f11578h;
                        break;
                }
                tp1.b0(list);
                to0VarArr[0] = new am0(muVar2, list);
                switch (i11) {
                    case 0:
                        string = ((zzbuc) gp0Var.f5026d).f11557f;
                        break;
                    default:
                        string = ((zzbvb) gp0Var.f5026d).f11574a.getString("ms");
                        if (string == null) {
                            string = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                        }
                        break;
                }
                tp1.b0(string);
                switch (i11) {
                    case 0:
                        PackageInfo packageInfo = ((zzbuc) gp0Var.f5026d).f11556d;
                        break;
                    default:
                        PackageInfo packageInfo2 = ((zzbvb) gp0Var.f5026d).f11579q;
                        break;
                }
                gp0Var.zza();
                to0VarArr[1] = new am0(muVar2, string);
                gp0Var.zza();
                tp1.b0(hyVar.f5433b);
                nh1 nh1Var2 = zyVar.N;
                gu guVar = (gu) nh1Var2.zzb();
                ScheduledExecutorService scheduledExecutorService4 = (ScheduledExecutorService) nh1Var.zzb();
                tp1.b0(gp0Var.v());
                to0VarArr[2] = new hm0(guVar, scheduledExecutorService4, muVar2);
                to0VarArr[3] = (to0) zyVar.f11369q0.zzb();
                tp1.b0(gp0Var.v());
                to0VarArr[4] = new hm0((gu) nh1Var2.zzb(), (ScheduledExecutorService) nh1Var.zzb(), muVar2, 0);
                return new uo0(context2, muVar2, fz0.l(eo0Var2, eo0Var, eo0Var4, eo0Var5, co0Var3, kn0Var, to0VarArr), (ft0) this.f10376c.zzb(), (ed0) zyVar.f11377y.zzb());
        }
    }

    public wy(zy zyVar, jp0 jp0Var) {
        this.f10375b = zyVar;
        this.f10379f = jp0Var;
        f80 f80Var = new f80(2, jp0Var);
        this.f10376c = f80Var;
        nh1 nh1VarB = ih1.b(tp1.f9246n);
        nh1 nh1VarB2 = ih1.b(en1.K);
        nh1 nh1VarB3 = ih1.b(tc1.H);
        nh1 nh1VarB4 = ih1.b(en1.L);
        int i10 = lh1.f6629b;
        LinkedHashMap linkedHashMapW = tp1.W(4);
        linkedHashMapW.put(ws0.f10332q, nh1VarB);
        linkedHashMapW.put(ws0.f10333s, nh1VarB2);
        linkedHashMapW.put(ws0.f10335u, nh1VarB3);
        linkedHashMapW.put(ws0.f10337w, nh1VarB4);
        nh1 nh1VarB5 = ih1.b(new wg((jh1) f80Var, (nh1) zyVar.f11350h, (nh1) new lh1(linkedHashMapW), 16));
        int i11 = oh1.f7580c;
        List listEmptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(nh1VarB5);
        this.f10377d = ih1.b(new on0(zyVar.f11344e, (jh1) new zs0(new oh1(listEmptyList, arrayList)), 19));
        this.f10378e = ih1.b(new hp0(zyVar.f11368q, 9));
    }
}
