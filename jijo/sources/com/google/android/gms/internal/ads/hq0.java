package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class hq0 implements nq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq0 f5368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x30 f5369b;

    public hq0(gq0 gq0Var) {
        this.f5368a = gq0Var;
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final /* bridge */ /* synthetic */ n5.a a(cj0 cj0Var, mq0 mq0Var) {
        return b(cj0Var, mq0Var, null);
    }

    public final synchronized n5.a b(cj0 cj0Var, mq0 mq0Var, x30 x30Var) {
        this.f5369b = x30Var;
        if (((zzbvb) cj0Var.f3301b) == null) {
            return ((gq0) this.f5368a).b(cj0Var, mq0Var, x30Var);
        }
        f30 f30VarZzb = x30Var.zzb();
        return f30VarZzb.a(f30VarZzb.c(tc1.d0((zzbvb) cj0Var.f3301b)));
    }

    @Override // com.google.android.gms.internal.ads.nq0
    public final Object c() {
        x30 x30Var;
        synchronized (this) {
            x30Var = this.f5369b;
        }
        return x30Var;
    }
}
