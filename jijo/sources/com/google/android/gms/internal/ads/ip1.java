package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class ip1 implements dp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp1 f5671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5672b;

    public ip1(dp1 dp1Var, long j10) {
        this.f5671a = dp1Var;
        this.f5672b = j10;
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final int a(long j10) {
        return this.f5671a.a(j10 - this.f5672b);
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final int b(cj0 cj0Var, wf1 wf1Var, int i10) {
        int iB = this.f5671a.b(cj0Var, wf1Var, i10);
        if (iB != -4) {
            return iB;
        }
        wf1Var.f10173g += this.f5672b;
        return -4;
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final void zzd() {
        this.f5671a.zzd();
    }

    @Override // com.google.android.gms.internal.ads.dp1
    public final boolean zze() {
        return this.f5671a.zze();
    }
}
