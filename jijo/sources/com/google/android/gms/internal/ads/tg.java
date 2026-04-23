package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class tg implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f9151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f9152b;

    public tg(nh1 nh1Var, nh1 nh1Var2) {
        this.f9151a = nh1Var;
        this.f9152b = nh1Var2;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        return new sg((ScheduledExecutorService) this.f9151a.zzb(), (zze) this.f9152b.zzb());
    }
}
