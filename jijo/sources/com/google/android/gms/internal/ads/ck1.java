package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class ck1 implements gj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f3319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3320b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3321d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public to f3322f;

    @Override // com.google.android.gms.internal.ads.gj1
    public final to a() {
        return this.f3322f;
    }

    public final void b(long j10) {
        this.f3320b = j10;
        if (this.f3319a) {
            this.f3321d = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final void c(to toVar) {
        if (this.f3319a) {
            b(zza());
        }
        this.f3322f = toVar;
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final /* synthetic */ boolean d() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.gj1
    public final long zza() {
        long j10 = this.f3320b;
        if (!this.f3319a) {
            return j10;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3321d;
        to toVar = this.f3322f;
        return j10 + (toVar.f9206a == 1.0f ? yn0.u(jElapsedRealtime) : jElapsedRealtime * ((long) toVar.f9208c));
    }
}
