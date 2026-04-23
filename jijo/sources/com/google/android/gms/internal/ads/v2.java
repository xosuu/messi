package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class v2 implements u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f9733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f9734b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f9735d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9736f;

    public v2(String str, byte[] bArr, long j10, long j11) {
        this.f9735d = str;
        this.f9736f = bArr;
        this.f9733a = j10;
        this.f9734b = j11;
    }

    public final int a(long j10) {
        long j11 = j10 - this.f9733a;
        ((fq1) this.f9735d).getClass();
        return (int) j11;
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final void b(long j10) {
        long[] jArr = (long[]) ((m20) this.f9736f).f6809b;
        this.f9734b = jArr[yn0.l(jArr, j10, true)];
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final long d(h0 h0Var) {
        long j10 = this.f9734b;
        if (j10 < 0) {
            return -1L;
        }
        this.f9734b = -1L;
        return -(j10 + 2);
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final v0 zze() {
        tc1.W(this.f9733a != -1);
        return new l0((m0) this.f9735d, this.f9733a, 0);
    }

    public v2(long j10) {
        tc1.W(((fq1) this.f9735d) == null);
        this.f9733a = j10;
        this.f9734b = j10 + 65536;
    }
}
