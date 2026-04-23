package com.google.android.gms.internal.ads;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class hp0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f5364b;

    public /* synthetic */ hp0(jh1 jh1Var, int i10) {
        this.f5363a = i10;
        this.f5364b = jh1Var;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        int i10 = this.f5363a;
        qh1 qh1Var = this.f5364b;
        switch (i10) {
            case 0:
                mu muVar = nu.f7383a;
                tp1.b0(muVar);
                ((jy) qh1Var).a();
                break;
            case 2:
                tp1.b0(nu.f7383a);
                tp1.b0(((kp0) qh1Var).f6363a.v());
                break;
            case 7:
                ScheduledExecutorService scheduledExecutorServiceUnconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, (ThreadFactory) qh1Var.zzb()));
                tp1.b0(scheduledExecutorServiceUnconfigurableScheduledExecutorService);
                break;
        }
        return new ft0((gt0) qh1Var.zzb());
    }

    public hp0(nh1 nh1Var) {
        this.f5363a = 6;
        this.f5364b = nh1Var;
    }

    public /* synthetic */ hp0(nh1 nh1Var, int i10) {
        this.f5363a = i10;
        this.f5364b = nh1Var;
    }
}
