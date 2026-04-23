package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class gf0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f4903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f4904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f4905c;

    public gf0(nh1 nh1Var, pf0 pf0Var, z00 z00Var) {
        this.f4903a = nh1Var;
        this.f4904b = pf0Var;
        this.f4905c = z00Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ff0 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f4903a.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        mu muVar2 = nu.f7384b;
        tp1.b0(muVar2);
        Context contextA = ((jy) ((pf0) this.f4904b).f7873a).a();
        tp1.b0(muVar);
        return new ff0(scheduledExecutorService, muVar, muVar2, new kf0(contextA, muVar, 1), ih1.a(en1.Q(this.f4905c)));
    }
}
