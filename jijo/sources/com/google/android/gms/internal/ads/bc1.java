package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class bc1 extends cc1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2984f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2985h;

    public bc1(byte[] bArr, int i10, int i11) {
        super(bArr);
        ec1.n(i10, i10 + i11, bArr.length);
        this.f2984f = i10;
        this.f2985h = i11;
    }

    @Override // com.google.android.gms.internal.ads.cc1, com.google.android.gms.internal.ads.ec1
    public final byte c(int i10) {
        ec1.r(i10, this.f2985h);
        return this.f3252d[this.f2984f + i10];
    }

    @Override // com.google.android.gms.internal.ads.cc1, com.google.android.gms.internal.ads.ec1
    public final byte d(int i10) {
        return this.f3252d[this.f2984f + i10];
    }

    @Override // com.google.android.gms.internal.ads.cc1, com.google.android.gms.internal.ads.ec1
    public final int f() {
        return this.f2985h;
    }

    @Override // com.google.android.gms.internal.ads.cc1, com.google.android.gms.internal.ads.ec1
    public final void g(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f3252d, this.f2984f + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.cc1
    public final int s() {
        return this.f2984f;
    }
}
