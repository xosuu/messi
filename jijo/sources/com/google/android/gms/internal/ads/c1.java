package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3150a = new byte[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3156g;

    public final void a(b1 b1Var, a1 a1Var) {
        if (this.f3152c > 0) {
            b1Var.e(this.f3153d, this.f3154e, this.f3155f, this.f3156g, a1Var);
            this.f3152c = 0;
        }
    }

    public final void b(b1 b1Var, long j10, int i10, int i11, int i12, a1 a1Var) {
        if (!(this.f3156g <= i11 + i12)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.f3151b) {
            int i13 = this.f3152c;
            int i14 = i13 + 1;
            this.f3152c = i14;
            if (i13 == 0) {
                this.f3153d = j10;
                this.f3154e = i10;
                this.f3155f = 0;
            }
            this.f3155f += i11;
            this.f3156g = i12;
            if (i14 >= 16) {
                a(b1Var, a1Var);
            }
        }
    }

    public final void c(h0 h0Var) {
        if (this.f3151b) {
            return;
        }
        byte[] bArr = this.f3150a;
        h0Var.e(0, bArr, 10);
        h0Var.zzj();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.f3151b = true;
        }
    }
}
