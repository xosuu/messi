package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zp0 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x30 f11288a;

    @Override // com.google.android.gms.internal.ads.nq0
    public final /* bridge */ /* synthetic */ n5.a a(cj0 cj0Var, mq0 mq0Var) {
        return b(cj0Var, mq0Var, null);
    }

    public final n5.a b(cj0 cj0Var, mq0 mq0Var, x30 x30Var) {
        bz bzVarJ = mq0Var.j((lq0) cj0Var.f3302d);
        bzVarJ.b(new qq0());
        x30 x30Var2 = (x30) bzVarJ.e();
        this.f11288a = x30Var2;
        f30 f30VarZzb = x30Var2.zzb();
        es0 es0Var = new es0();
        h21 h21VarR = h21.r(f30VarZzb.b());
        jn jnVar = new jn(es0Var, f30VarZzb, 14);
        d21 d21Var = d21.f3541a;
        return tc1.o0(tc1.q0(h21VarR, jnVar, d21Var), new qr(9, es0Var), d21Var);
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final /* synthetic */ Object c() {
        return this.f11288a;
    }
}
