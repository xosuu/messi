package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class xj0 implements jh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qh1 f10572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh1 f10573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qh1 f10574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qh1 f10575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qh1 f10576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qh1 f10577f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qh1 f10578g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final qh1 f10579h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qh1 f10580i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final qh1 f10581j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final qh1 f10582k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qh1 f10583l;

    public xj0(jy jyVar, nh1 nh1Var, nh1 nh1Var2, nh1 nh1Var3, nh1 nh1Var4, nh1 nh1Var5, nh1 nh1Var6, nh1 nh1Var7, nh1 nh1Var8, nh1 nh1Var9, kj0 kj0Var, nh1 nh1Var10) {
        this.f10572a = jyVar;
        this.f10573b = nh1Var;
        this.f10574c = nh1Var2;
        this.f10575d = nh1Var3;
        this.f10576e = nh1Var4;
        this.f10577f = nh1Var5;
        this.f10578g = nh1Var6;
        this.f10579h = nh1Var7;
        this.f10580i = nh1Var8;
        this.f10581j = nh1Var9;
        this.f10582k = kj0Var;
        this.f10583l = nh1Var10;
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final wj0 zzb() {
        Context contextA = ((jy) this.f10572a).a();
        xs0 xs0Var = (xs0) this.f10573b.zzb();
        tj0 tj0Var = (tj0) this.f10574c.zzb();
        m40 m40Var = (m40) this.f10575d.zzb();
        ut0 ut0Var = (ut0) this.f10576e.zzb();
        vt0 vt0Var = (vt0) this.f10577f.zzb();
        t20 t20Var = (t20) this.f10578g.zzb();
        mu muVar = nu.f7383a;
        tp1.b0(muVar);
        return new wj0(contextA, xs0Var, tj0Var, m40Var, ut0Var, vt0Var, t20Var, muVar, (ScheduledExecutorService) this.f10579h.zzb(), (gi0) this.f10580i.zzb(), (ft0) this.f10581j.zzb(), ((kj0) this.f10582k).zzb(), (cd0) this.f10583l.zzb());
    }
}
