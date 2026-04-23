package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class kj0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f6303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f6304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f6305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f6306d;

    public kj0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4) {
        this.f6303a = nh1Var;
        this.f6304b = nh1Var2;
        this.f6305c = nh1Var3;
        this.f6306d = nh1Var4;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jt zzb() {
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f6303a.zzb();
        t20 t20Var = (t20) this.f6304b.zzb();
        tj0 tj0Var = (tj0) this.f6305c.zzb();
        ut0 ut0Var = (ut0) this.f6306d.zzb();
        jt jtVar = new jt();
        jtVar.f6077f = new u21();
        jtVar.f6078g = new AtomicBoolean();
        jtVar.f6072a = muVar;
        jtVar.f6073b = scheduledExecutorService;
        jtVar.f6074c = t20Var;
        jtVar.f6075d = tj0Var;
        jtVar.f6076e = ut0Var;
        return jtVar;
    }
}
