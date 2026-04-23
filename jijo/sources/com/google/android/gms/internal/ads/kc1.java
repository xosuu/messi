package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;

/* JADX INFO: loaded from: classes.dex */
public final class kc1 extends mc1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f6256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6258h;

    public kc1(byte[] bArr, int i10) {
        int length = bArr.length;
        if (((length - i10) | i10) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i10)));
        }
        this.f6256f = bArr;
        this.f6258h = 0;
        this.f6257g = i10;
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void A0(int i10, long j10) throws zzgxa {
        I0((i10 << 3) | 1);
        B0(j10);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void B0(long j10) throws zzgxa {
        try {
            byte[] bArr = this.f6256f;
            int i10 = this.f6258h;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            this.f6258h = i10 + 8;
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6258h), Integer.valueOf(this.f6257g), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void C0(int i10, int i11) throws zzgxa {
        I0(i10 << 3);
        D0(i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void D0(int i10) throws zzgxa {
        if (i10 >= 0) {
            I0(i10);
        } else {
            K0(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void E0(int i10, rd1 rd1Var, ge1 ge1Var) throws zzgxa {
        I0((i10 << 3) | 2);
        I0(((vb1) rd1Var).a(ge1Var));
        ge1Var.g(rd1Var, this.f6902c);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void F0(int i10, String str) throws zzgxa {
        I0((i10 << 3) | 2);
        int i11 = this.f6258h;
        try {
            int iS0 = mc1.s0(str.length() * 3);
            int iS02 = mc1.s0(str.length());
            int i12 = this.f6257g;
            byte[] bArr = this.f6256f;
            if (iS02 == iS0) {
                int i13 = i11 + iS02;
                this.f6258h = i13;
                int iB = re1.b(str, bArr, i13, i12 - i13);
                this.f6258h = i11;
                I0((iB - i11) - iS02);
                this.f6258h = iB;
            } else {
                I0(re1.c(str));
                int i14 = this.f6258h;
                this.f6258h = re1.b(str, bArr, i14, i12 - i14);
            }
        } catch (qe1 e10) {
            this.f6258h = i11;
            u0(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new zzgxa(e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void G0(int i10, int i11) throws zzgxa {
        I0((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void H0(int i10, int i11) throws zzgxa {
        I0(i10 << 3);
        I0(i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void I0(int i10) throws zzgxa {
        while (true) {
            int i11 = i10 & (-128);
            byte[] bArr = this.f6256f;
            if (i11 == 0) {
                int i12 = this.f6258h;
                this.f6258h = i12 + 1;
                bArr[i12] = (byte) i10;
                return;
            } else {
                try {
                    int i13 = this.f6258h;
                    this.f6258h = i13 + 1;
                    bArr[i13] = (byte) ((i10 | NotificationCompat.FLAG_HIGH_PRIORITY) & 255);
                    i10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6258h), Integer.valueOf(this.f6257g), 1), e10);
                }
            }
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6258h), Integer.valueOf(this.f6257g), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void J0(int i10, long j10) throws zzgxa {
        I0(i10 << 3);
        K0(j10);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void K0(long j10) throws zzgxa {
        boolean z9 = mc1.f6901e;
        int i10 = this.f6257g;
        byte[] bArr = this.f6256f;
        if (!z9 || i10 - this.f6258h < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i11 = this.f6258h;
                    this.f6258h = i11 + 1;
                    bArr[i11] = (byte) ((((int) j10) | NotificationCompat.FLAG_HIGH_PRIORITY) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6258h), Integer.valueOf(i10), 1), e10);
                }
            }
            int i12 = this.f6258h;
            this.f6258h = i12 + 1;
            bArr[i12] = (byte) j10;
            return;
        }
        while (true) {
            int i13 = (int) j10;
            if ((j10 & (-128)) == 0) {
                int i14 = this.f6258h;
                this.f6258h = i14 + 1;
                pe1.n(bArr, i14, (byte) i13);
                return;
            } else {
                int i15 = this.f6258h;
                this.f6258h = i15 + 1;
                pe1.n(bArr, i15, (byte) ((i13 | NotificationCompat.FLAG_HIGH_PRIORITY) & 255));
                j10 >>>= 7;
            }
        }
    }

    public final int M0() {
        return this.f6257g - this.f6258h;
    }

    @Override // b4.f
    public final void Y(int i10, byte[] bArr, int i11) throws zzgxa {
        try {
            System.arraycopy(bArr, i10, this.f6256f, this.f6258h, i11);
            this.f6258h += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6258h), Integer.valueOf(this.f6257g), Integer.valueOf(i11)), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void v0(byte b10) throws zzgxa {
        try {
            byte[] bArr = this.f6256f;
            int i10 = this.f6258h;
            this.f6258h = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6258h), Integer.valueOf(this.f6257g), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void w0(int i10, boolean z9) throws zzgxa {
        I0(i10 << 3);
        v0(z9 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void x0(int i10, ec1 ec1Var) throws zzgxa {
        I0((i10 << 3) | 2);
        I0(ec1Var.f());
        ec1Var.m(this);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void y0(int i10, int i11) throws zzgxa {
        I0((i10 << 3) | 5);
        z0(i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void z0(int i10) throws zzgxa {
        try {
            byte[] bArr = this.f6256f;
            int i11 = this.f6258h;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            this.f6258h = i11 + 4;
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzgxa(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6258h), Integer.valueOf(this.f6257g), 1), e10);
        }
    }
}
