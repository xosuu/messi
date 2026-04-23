package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class pp0 implements to0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gu f7938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f7940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f7941d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p21 f7942e;

    public pp0(gu guVar, boolean z9, boolean z10, mu muVar, ScheduledExecutorService scheduledExecutorService) {
        this.f7938a = guVar;
        this.f7939b = z9;
        this.f7940c = z10;
        this.f7942e = muVar;
        this.f7941d = scheduledExecutorService;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.to0
    public final n5.a zzb() {
        if (((Boolean) zzba.zzc().a(eg.f4149u6)).booleanValue() && this.f7940c) {
            return tc1.d0(null);
        }
        if (!this.f7939b) {
            return tc1.d0(null);
        }
        m21 m21VarD0 = tc1.d0(null);
        b3 b3Var = new b3(17);
        p21 p21Var = this.f7942e;
        return tc1.P(tc1.r0(tc1.o0(m21VarD0, b3Var, p21Var), ((Long) zh.f11240a.k()).longValue(), TimeUnit.MILLISECONDS, this.f7941d), Exception.class, new qr(8, this), p21Var);
    }
}
