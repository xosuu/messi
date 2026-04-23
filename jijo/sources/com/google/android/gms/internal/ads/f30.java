package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class f30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jt f4367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final or0 f4368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xs0 f4369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yz f4370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final wj0 f4371e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n60 f4372f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public kr0 f4373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tl0 f4374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g4.c f4375i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Executor f4376j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vf0 f4377k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gi0 f4378l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ep f4379m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l2.l f4380n;

    public f30(jt jtVar, or0 or0Var, xs0 xs0Var, yz yzVar, wj0 wj0Var, n60 n60Var, kr0 kr0Var, tl0 tl0Var, g4.c cVar, mu muVar, vf0 vf0Var, gi0 gi0Var, ep epVar, l2.l lVar) {
        this.f4367a = jtVar;
        this.f4368b = or0Var;
        this.f4369c = xs0Var;
        this.f4370d = yzVar;
        this.f4371e = wj0Var;
        this.f4372f = n60Var;
        this.f4373g = kr0Var;
        this.f4374h = tl0Var;
        this.f4375i = cVar;
        this.f4376j = muVar;
        this.f4377k = vf0Var;
        this.f4378l = gi0Var;
        this.f4379m = epVar;
        this.f4380n = lVar;
    }

    public final ts0 a(n5.a aVar) {
        tl0 tl0VarL = this.f4369c.b(aVar, ws0.f10331h).j(new rk0(10, this)).l(this.f4371e);
        if (!((Boolean) zzba.zzc().a(eg.T4)).booleanValue()) {
            tl0VarL = tl0VarL.q(((Integer) zzba.zzc().a(eg.U4)).intValue(), TimeUnit.SECONDS);
        }
        return tl0VarL.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0164 A[Catch: all -> 0x00b4, TryCatch #2 {, blocks: (B:27:0x0085, B:29:0x00ab, B:33:0x00b7, B:34:0x00bc, B:36:0x00c7, B:39:0x00d1, B:43:0x00f5, B:45:0x010b, B:46:0x011e, B:42:0x00df, B:47:0x012b, B:50:0x0148, B:52:0x014e, B:53:0x015b, B:55:0x015e, B:58:0x0167, B:57:0x0164), top: B:88:0x0085, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ts0 b() {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f30.b():com.google.android.gms.internal.ads.ts0");
    }

    public final ts0 c(n5.a aVar) {
        kr0 kr0Var = this.f4373g;
        if (kr0Var != null) {
            return new tl0(this.f4369c, ws0.f10330f, null, us0.f9603d, Collections.emptyList(), tc1.d0(kr0Var)).d();
        }
        bd bdVarZzc = zzu.zzc();
        bdVarZzc.getClass();
        if (((Boolean) zzba.zzc().a(eg.N3)).booleanValue()) {
            synchronized (bdVarZzc.f2988c) {
                try {
                    bdVarZzc.e();
                    ScheduledFuture scheduledFuture = bdVarZzc.f2986a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    bdVarZzc.f2986a = nu.f7386d.schedule(bdVarZzc.f2987b, ((Long) zzba.zzc().a(eg.O3)).longValue(), TimeUnit.MILLISECONDS);
                } finally {
                }
            }
        }
        if (!((Boolean) zzba.zzc().a(eg.Fa)).booleanValue() || ((Boolean) rh.f8596c.k()).booleanValue()) {
            tl0 tl0VarB = this.f4369c.b(aVar, ws0.f10330f);
            vf0 vf0Var = this.f4377k;
            Objects.requireNonNull(vf0Var);
            return tl0VarB.l(new if0(7, vf0Var)).d();
        }
        ep epVar = this.f4379m;
        Objects.requireNonNull(epVar);
        r11 r11VarQ0 = tc1.q0(aVar, new if0(5, epVar), this.f4376j);
        tl0 tl0VarB2 = this.f4369c.b(r11VarQ0, ws0.f10333s);
        tl0 tl0Var = this.f4374h;
        Objects.requireNonNull(tl0Var);
        ts0 ts0VarD = tl0VarB2.l(new if0(6, tl0Var)).d();
        return this.f4369c.a(ws0.f10330f, aVar, r11VarQ0, ts0VarD).b(new d30(this, aVar, r11VarQ0, ts0VarD, 0)).l(new f00(1)).d();
    }
}
