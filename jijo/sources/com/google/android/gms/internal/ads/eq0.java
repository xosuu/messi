package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class eq0 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep f4278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f4279b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final il0 f4280d = new il0(18, 0);

    public eq0(ep epVar, mu muVar) {
        this.f4278a = epVar;
        this.f4279b = muVar;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final /* bridge */ /* synthetic */ n5.a a(cj0 cj0Var, mq0 mq0Var) {
        return b(cj0Var, mq0Var, null);
    }

    public final n5.a b(cj0 cj0Var, mq0 mq0Var, x30 x30Var) {
        n5.a aVarD0;
        n5.a aVarP;
        ep epVar = this.f4278a;
        Executor executor = this.f4279b;
        xq xqVar = new xq(epVar, x30Var, executor);
        jq0 jq0Var = (jq0) xqVar.f10633h;
        int i10 = 0;
        if (jq0Var == null) {
            if (((Boolean) sh.f8868a.k()).booleanValue()) {
                x30 x30Var2 = (x30) xqVar.f10631d;
                ep epVar2 = (ep) xqVar.f10630b;
                f30 f30VarZzb = x30Var2.zzb();
                zzfhb zzfhbVar = (zzfhb) epVar2.f4270d;
                ws0 ws0Var = ws0.I;
                ts0 ts0VarD = f30VarZzb.f4369c.b(f30VarZzb.f4375i.e(), ws0Var).l(new jn(f30VarZzb, 4, zzfhbVar)).d();
                tc1.u0(ts0VarD, new jp0(9, f30VarZzb), f30VarZzb.f4376j);
                aVarP = tc1.P(tc1.o0(h21.r(ts0VarD), new iq0(xqVar, 1), (Executor) xqVar.f10632f), zzdyp.class, new iq0(xqVar, i10), (Executor) xqVar.f10632f);
            } else {
                jq0 jq0Var2 = new jq0(null, xqVar.B());
                xqVar.f10633h = jq0Var2;
                aVarP = tc1.d0(jq0Var2);
            }
            aVarD0 = tc1.o0(aVarP, new b3(19), (Executor) xqVar.f10632f);
        } else {
            aVarD0 = tc1.d0(jq0Var);
        }
        return tc1.P(tc1.q0(h21.r(aVarD0), new jn(this, 15, x30Var), executor), Exception.class, new b3(18, 0), executor);
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final /* bridge */ /* synthetic */ Object c() {
        return null;
    }
}
