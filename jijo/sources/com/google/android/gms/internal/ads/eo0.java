package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class eo0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to0 f4262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f4264c;

    public eo0(to0 to0Var, long j10, ScheduledExecutorService scheduledExecutorService) {
        this.f4262a = to0Var;
        this.f4263b = j10;
        this.f4264c = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return this.f4262a.zza();
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        n5.a aVarZzb = this.f4262a.zzb();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (((Boolean) zzba.zzc().a(eg.X1)).booleanValue()) {
            timeUnit = TimeUnit.MICROSECONDS;
        }
        long j10 = this.f4263b;
        if (j10 > 0) {
            aVarZzb = tc1.r0(aVarZzb, j10, timeUnit, this.f4264c);
        }
        return tc1.V(aVarZzb, Throwable.class, new if0(14, this), nu.f7388f);
    }
}
