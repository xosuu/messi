package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class gq0 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x30 f5033a;

    @Override // com.google.android.gms.internal.ads.nq0
    public final /* bridge */ /* synthetic */ n5.a a(cj0 cj0Var, mq0 mq0Var) {
        return b(cj0Var, mq0Var, null);
    }

    public final synchronized n5.a b(cj0 cj0Var, mq0 mq0Var, x30 x30Var) {
        f30 f30VarZzb;
        try {
            if (x30Var != null) {
                this.f5033a = x30Var;
            } else {
                this.f5033a = (x30) mq0Var.j((lq0) cj0Var.f3302d).e();
            }
            f30VarZzb = this.f5033a.zzb();
        } catch (Throwable th) {
            throw th;
        }
        return f30VarZzb.a(f30VarZzb.b());
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final Object c() {
        x30 x30Var;
        synchronized (this) {
            x30Var = this.f5033a;
        }
        return x30Var;
    }
}
