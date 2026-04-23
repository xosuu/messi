package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class e6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3869f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3864a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nn0 f3865b = new nn0();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f3870g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f3871h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f3872i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f3866c = new ik0();

    public e6() {
    }

    public static long b(ik0 ik0Var) {
        int i10 = ik0Var.f5634b;
        if (ik0Var.n() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        ik0Var.e(0, bArr, 9);
        ik0Var.i(i10);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j10 = b10;
        long j11 = b11;
        long j12 = (248 & j11) >> 3;
        long j13 = (j11 & 3) << 13;
        return j13 | ((bArr[1] & 255) << 20) | ((j10 & 3) << 28) | (((j10 & 56) >> 3) << 30) | (j12 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    public static final int d(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    public final long a() {
        switch (this.f3864a) {
        }
        return this.f3872i;
    }

    public final void c(h0 h0Var) {
        byte[] bArr = yn0.f10949f;
        int length = bArr.length;
        this.f3866c.g(bArr, 0);
        this.f3867d = true;
        h0Var.zzj();
    }

    public e6(int i10) {
    }
}
