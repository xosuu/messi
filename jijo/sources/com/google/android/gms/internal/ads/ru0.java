package com.google.android.gms.internal.ads;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public final class ru0 extends rt0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Uri f8690h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f8691q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final ww f8695v;

    public ru0(byte[] bArr) {
        ww wwVar = new ww(bArr);
        super(false);
        this.f8695v = wwVar;
        tc1.K(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.nl1
    public final int b(int i10, byte[] bArr, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f8693t;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        byte[] bArr2 = this.f8691q;
        tc1.A(bArr2);
        System.arraycopy(bArr2, this.f8692s, bArr, i10, iMin);
        this.f8692s += iMin;
        this.f8693t -= iMin;
        c(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final long g(iz0 iz0Var) throws zzft {
        j(iz0Var);
        this.f8690h = iz0Var.f5730a;
        byte[] bArr = this.f8695v.f10363a;
        this.f8691q = bArr;
        int length = bArr.length;
        long j10 = length;
        long j11 = iz0Var.f5732c;
        if (j11 > j10) {
            throw new zzft(2008);
        }
        int i10 = (int) j11;
        this.f8692s = i10;
        int i11 = length - i10;
        this.f8693t = i11;
        long j12 = iz0Var.f5733d;
        if (j12 != -1) {
            this.f8693t = (int) Math.min(i11, j12);
        }
        this.f8694u = true;
        n(iz0Var);
        return j12 != -1 ? j12 : this.f8693t;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final Uri zzc() {
        return this.f8690h;
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void zzd() {
        if (this.f8694u) {
            this.f8694u = false;
            i();
        }
        this.f8690h = null;
        this.f8691q = null;
    }
}
