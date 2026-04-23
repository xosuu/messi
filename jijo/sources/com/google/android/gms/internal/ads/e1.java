package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e1 implements g0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f3786k = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f3787l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final byte[] f3788m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f3789n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f3790o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3796f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i0 f3798h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b1 f3799i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f3800j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f3791a = new byte[1];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3797g = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f3787l = iArr;
        int i10 = yn0.f10944a;
        Charset charset = fx0.f4681c;
        f3788m = "#!AMR\n".getBytes(charset);
        f3789n = "#!AMR-WB\n".getBytes(charset);
        f3790o = iArr[8];
    }

    public final boolean a(h0 h0Var) {
        h0Var.zzj();
        byte[] bArr = f3788m;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        a0 a0Var = (a0) h0Var;
        a0Var.m(bArr2, 0, length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f3792b = false;
            a0Var.j(bArr.length);
            return true;
        }
        h0Var.zzj();
        byte[] bArr3 = f3789n;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        a0Var.m(bArr4, 0, length2, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f3792b = true;
        a0Var.j(bArr3.length);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        this.f3793c = 0L;
        this.f3794d = 0;
        this.f3795e = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:22:0x0062, B:24:0x0071, B:38:0x008f, B:42:0x009c, B:41:0x0097, B:56:0x00d7, B:57:0x00ef, B:58:0x00f0, B:59:0x0100), top: B:65:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0097 A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:22:0x0062, B:24:0x0071, B:38:0x008f, B:42:0x009c, B:41:0x0097, B:56:0x00d7, B:57:0x00ef, B:58:0x00f0, B:59:0x0100), top: B:65:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00af  */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r20, com.google.android.gms.internal.ads.k0 r21) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.e1.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f3798h = i0Var;
        this.f3799i = i0Var.j(0, 1);
        i0Var.i();
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        return a(h0Var);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final List zzd() {
        zy0 zy0Var = bz0.f3132b;
        return wz0.f10382h;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }
}
