package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o3 implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3 f7477a;

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        p3 p3Var = this.f7477a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((long) p3Var.f7775f.f10047i) * j10) / 1000000);
        long j11 = p3Var.f7774d;
        w0 w0Var = new w0(j10, Math.max(p3Var.f7773b, Math.min((bigIntegerValueOf.multiply(BigInteger.valueOf(j11 - r4)).divide(BigInteger.valueOf(p3Var.f7777q)).longValue() + r4) - 30000, j11 - 1)));
        return new u0(w0Var, w0Var);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        p3 p3Var = this.f7477a;
        w3 w3Var = p3Var.f7775f;
        return (p3Var.f7777q * 1000000) / ((long) w3Var.f10047i);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return true;
    }
}
