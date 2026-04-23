package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.gy;
import com.google.android.gms.internal.ads.hd0;
import com.google.android.gms.internal.ads.jh1;
import com.google.android.gms.internal.ads.jy;
import com.google.android.gms.internal.ads.mu;
import com.google.android.gms.internal.ads.nu;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.qh1;
import com.google.android.gms.internal.ads.ry;
import com.google.android.gms.internal.ads.sg;
import com.google.android.gms.internal.ads.tg;
import com.google.android.gms.internal.ads.tp1;
import com.google.android.gms.internal.ads.vt0;
import com.google.android.gms.internal.ads.wr0;
import com.google.android.gms.internal.ads.y9;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class zzal implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f2370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f2371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f2372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f2373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f2374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f2375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f2376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f2377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f2378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f2379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qh1 f2380k;

    public zzal(qh1 qh1Var, qh1 qh1Var2, qh1 qh1Var3, qh1 qh1Var4, qh1 qh1Var5, qh1 qh1Var6, qh1 qh1Var7, qh1 qh1Var8, qh1 qh1Var9, qh1 qh1Var10, qh1 qh1Var11, qh1 qh1Var12) {
        this.f2370a = qh1Var;
        this.f2371b = qh1Var2;
        this.f2372c = qh1Var3;
        this.f2373d = qh1Var4;
        this.f2374e = qh1Var6;
        this.f2375f = qh1Var7;
        this.f2376g = qh1Var8;
        this.f2377h = qh1Var9;
        this.f2378i = qh1Var10;
        this.f2379j = qh1Var11;
        this.f2380k = qh1Var12;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    public final Object zzb() {
        gy gyVar = (gy) this.f2370a.zzb();
        Context contextA = ((jy) this.f2371b).a();
        y9 y9Var = (y9) this.f2372c.zzb();
        wr0 wr0Var = (wr0) this.f2373d.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.f2374e.zzb();
        hd0 hd0Var = (hd0) this.f2375f.zzb();
        vt0 vt0Var = (vt0) this.f2376g.zzb();
        VersionInfoParcel versionInfoParcelA = ((ry) this.f2377h).a();
        tg tgVar = (tg) this.f2378i;
        return new zzak(gyVar, contextA, y9Var, wr0Var, muVar, scheduledExecutorService, hd0Var, vt0Var, versionInfoParcelA, new sg((ScheduledExecutorService) tgVar.f9151a.zzb(), (zze) tgVar.f9152b.zzb()), (pr0) this.f2379j.zzb(), (zze) this.f2380k.zzb());
    }
}
