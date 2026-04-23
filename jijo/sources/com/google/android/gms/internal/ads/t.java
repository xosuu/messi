package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class t implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f8999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9004f;

    public t(v vVar, long j10, long j11, long j12, long j13, long j14) {
        this.f8999a = vVar;
        this.f9000b = j10;
        this.f9001c = j11;
        this.f9002d = j12;
        this.f9003e = j13;
        this.f9004f = j14;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        w0 w0Var = new w0(j10, u.a(this.f8999a.f(j10), 0L, this.f9001c, this.f9002d, this.f9003e, this.f9004f));
        return new u0(w0Var, w0Var);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f9000b;
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return true;
    }
}
