package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class ya0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f10806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f10807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f10808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f10809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f10810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f10811f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f10812g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f10813h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f10814i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f10815j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qh1 f10816k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qh1 f10817l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final qh1 f10818m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qh1 f10819n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final qh1 f10820o;

    public ya0(nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, ry ryVar, nh1 nh1Var4, f40 f40Var, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8, nh1 nh1Var9, nh1 nh1Var10, nh1 nh1Var11, nh1 nh1Var12, nh1 nh1Var13) {
        this.f10806a = nh1Var;
        this.f10807b = nh1Var2;
        this.f10808c = nh1Var3;
        this.f10809d = ryVar;
        this.f10810e = nh1Var4;
        this.f10811f = f40Var;
        this.f10812g = nh1Var5;
        this.f10813h = nh1Var6;
        this.f10814i = nh1Var7;
        this.f10815j = nh1Var8;
        this.f10816k = nh1Var9;
        this.f10817l = nh1Var10;
        this.f10818m = nh1Var11;
        this.f10819n = nh1Var12;
        this.f10820o = nh1Var13;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final xa0 zzb() {
        Context context = (Context) this.f10806a.zzb();
        ra0 ra0Var = (ra0) this.f10807b.zzb();
        y9 y9Var = (y9) this.f10808c.zzb();
        VersionInfoParcel versionInfoParcelA = ((ry) this.f10809d).a();
        zza zzaVarZza = zza.zza();
        kd kdVar = (kd) this.f10810e.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new xa0(context, ra0Var, y9Var, versionInfoParcelA, zzaVarZza, kdVar, muVar, ((f40) this.f10811f).a(), (fb0) this.f10812g.zzb(), (kc0) this.f10813h.zzb(), (ScheduledExecutorService) this.f10814i.zzb(), (ed0) this.f10815j.zzb(), (vt0) this.f10816k.zzb(), (lh0) this.f10817l.zzb(), (xb0) this.f10818m.zzb(), (qh0) this.f10819n.zzb(), (pr0) this.f10820o.zzb());
    }
}
