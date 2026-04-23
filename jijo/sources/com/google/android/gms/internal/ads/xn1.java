package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xn1 implements ep1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ep1 f10622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bz0 f10623b;

    public xn1(ep1 ep1Var, List list) {
        this.f10622a = ep1Var;
        this.f10623b = bz0.k(list);
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final void b(long j10) {
        this.f10622a.b(j10);
    }

    public final bz0 c() {
        return this.f10623b;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean g(fj1 fj1Var) {
        return this.f10622a.g(fj1Var);
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzb() {
        return this.f10622a.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzc() {
        return this.f10622a.zzc();
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean zzp() {
        return this.f10622a.zzp();
    }
}
