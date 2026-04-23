package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class cc1 extends ec1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f3252d;

    public cc1(byte[] bArr) {
        bArr.getClass();
        this.f3252d = bArr;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public byte c(int i10) {
        return this.f3252d[i10];
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public byte d(int i10) {
        return this.f3252d[i10];
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec1) || f() != ((ec1) obj).f()) {
            return false;
        }
        if (f() == 0) {
            return true;
        }
        if (!(obj instanceof cc1)) {
            return obj.equals(this);
        }
        cc1 cc1Var = (cc1) obj;
        int i10 = this.f3904a;
        int i11 = cc1Var.f3904a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return t(cc1Var, 0, f());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public int f() {
        return this.f3252d.length;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public void g(int i10, int i11, int i12, byte[] bArr) {
        System.arraycopy(this.f3252d, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final /* bridge */ /* synthetic */ int h() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final /* bridge */ /* synthetic */ boolean i() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final int j(int i10, int i11, int i12) {
        int iS = s() + i11;
        Charset charset = ed1.f3910a;
        for (int i13 = iS; i13 < iS + i12; i13++) {
            i10 = (i10 * 31) + this.f3252d[i13];
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final ec1 k(int i10, int i11) {
        int iN = ec1.n(i10, i11, f());
        if (iN == 0) {
            return ec1.f3903b;
        }
        return new bc1(this.f3252d, s() + i10, iN);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final ic1 l() {
        return ic1.e(this.f3252d, s(), f(), true);
    }

    @Override // com.google.android.gms.internal.ads.ec1
    public final void m(b4.f fVar) {
        fVar.Y(s(), this.f3252d, f());
    }

    public int s() {
        return 0;
    }

    public final boolean t(ec1 ec1Var, int i10, int i11) {
        if (i11 > ec1Var.f()) {
            throw new IllegalArgumentException("Length too large: " + i11 + f());
        }
        int i12 = i10 + i11;
        if (i12 > ec1Var.f()) {
            throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + ec1Var.f());
        }
        if (!(ec1Var instanceof cc1)) {
            return ec1Var.k(i10, i12).equals(k(0, i11));
        }
        cc1 cc1Var = (cc1) ec1Var;
        int iS = s() + i11;
        int iS2 = s();
        int iS3 = cc1Var.s() + i10;
        while (iS2 < iS) {
            if (this.f3252d[iS2] != cc1Var.f3252d[iS3]) {
                return false;
            }
            iS2++;
            iS3++;
        }
        return true;
    }
}
