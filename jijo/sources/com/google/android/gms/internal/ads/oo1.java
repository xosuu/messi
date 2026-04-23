package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class oo1 implements cq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cq1 f7627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ow f7628b;

    public oo1(cq1 cq1Var, ow owVar) {
        this.f7627a = cq1Var;
        this.f7628b = owVar;
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final int a(int i10) {
        return this.f7627a.a(i10);
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final y1 b(int i10) {
        return this.f7628b.f7688d[this.f7627a.a(i10)];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo1)) {
            return false;
        }
        oo1 oo1Var = (oo1) obj;
        return this.f7627a.equals(oo1Var.f7627a) && this.f7628b.equals(oo1Var.f7628b);
    }

    public final int hashCode() {
        return this.f7627a.hashCode() + ((this.f7628b.hashCode() + 527) * 31);
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final int zzb(int i10) {
        return this.f7627a.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final int zzc() {
        return this.f7627a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.cq1
    public final ow zze() {
        return this.f7628b;
    }
}
