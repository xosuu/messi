package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class z1 extends n0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f11090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f11091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(x1 x1Var, v0 v0Var, v0 v0Var2) {
        super(v0Var);
        this.f11090b = v0Var2;
        this.f11091c = x1Var;
    }

    @Override // com.google.android.gms.internal.ads.n0, com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        u0 u0VarB = this.f11090b.b(j10);
        w0 w0Var = u0VarB.f9329a;
        long j11 = w0Var.f10016b;
        long j12 = this.f11091c.f10399b;
        w0 w0Var2 = new w0(w0Var.f10015a, j11 + j12);
        w0 w0Var3 = u0VarB.f9330b;
        return new u0(w0Var2, new w0(w0Var3.f10015a, w0Var3.f10016b + j12));
    }
}
