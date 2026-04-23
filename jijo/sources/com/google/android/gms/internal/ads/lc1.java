package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class lc1 extends mc1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f6571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f6572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f6573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OutputStream f6574i;

    public lc1(int i10, OutputStream outputStream) {
        if (i10 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int iMax = Math.max(i10, 20);
        this.f6571f = new byte[iMax];
        this.f6572g = iMax;
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.f6574i = outputStream;
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void A0(int i10, long j10) throws IOException {
        N0(18);
        Q0((i10 << 3) | 1);
        P0(j10);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void B0(long j10) throws IOException {
        N0(8);
        P0(j10);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void C0(int i10, int i11) throws IOException {
        N0(20);
        Q0(i10 << 3);
        if (i11 >= 0) {
            Q0(i11);
        } else {
            R0(i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void D0(int i10) throws IOException {
        if (i10 >= 0) {
            I0(i10);
        } else {
            K0(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void E0(int i10, rd1 rd1Var, ge1 ge1Var) throws IOException {
        I0((i10 << 3) | 2);
        I0(((vb1) rd1Var).a(ge1Var));
        ge1Var.g(rd1Var, this.f6902c);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void F0(int i10, String str) throws IOException {
        I0((i10 << 3) | 2);
        try {
            int length = str.length() * 3;
            int iS0 = mc1.s0(length);
            int i11 = iS0 + length;
            int i12 = this.f6572g;
            if (i11 > i12) {
                byte[] bArr = new byte[length];
                int iB = re1.b(str, bArr, 0, length);
                I0(iB);
                S0(0, bArr, iB);
                return;
            }
            if (i11 > i12 - this.f6573h) {
                M0();
            }
            int iS02 = mc1.s0(str.length());
            int i13 = this.f6573h;
            byte[] bArr2 = this.f6571f;
            try {
                try {
                    if (iS02 == iS0) {
                        int i14 = i13 + iS02;
                        this.f6573h = i14;
                        int iB2 = re1.b(str, bArr2, i14, i12 - i14);
                        this.f6573h = i13;
                        Q0((iB2 - i13) - iS02);
                        this.f6573h = iB2;
                    } else {
                        int iC = re1.c(str);
                        Q0(iC);
                        this.f6573h = re1.b(str, bArr2, this.f6573h, iC);
                    }
                } catch (qe1 e10) {
                    this.f6573h = i13;
                    throw e10;
                }
            } catch (ArrayIndexOutOfBoundsException e11) {
                throw new zzgxa(e11);
            }
        } catch (qe1 e12) {
            u0(str, e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void G0(int i10, int i11) throws IOException {
        I0((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void H0(int i10, int i11) throws IOException {
        N0(20);
        Q0(i10 << 3);
        Q0(i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void I0(int i10) throws IOException {
        N0(5);
        Q0(i10);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void J0(int i10, long j10) throws IOException {
        N0(20);
        Q0(i10 << 3);
        R0(j10);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void K0(long j10) throws IOException {
        N0(10);
        R0(j10);
    }

    public final void M0() throws IOException {
        this.f6574i.write(this.f6571f, 0, this.f6573h);
        this.f6573h = 0;
    }

    public final void N0(int i10) throws IOException {
        if (this.f6572g - this.f6573h < i10) {
            M0();
        }
    }

    public final void O0(int i10) {
        int i11 = this.f6573h;
        byte[] bArr = this.f6571f;
        bArr[i11] = (byte) (i10 & 255);
        bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
        bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
        this.f6573h = i11 + 4;
        bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
    }

    public final void P0(long j10) {
        int i10 = this.f6573h;
        byte[] bArr = this.f6571f;
        bArr[i10] = (byte) (j10 & 255);
        bArr[i10 + 1] = (byte) ((j10 >> 8) & 255);
        bArr[i10 + 2] = (byte) ((j10 >> 16) & 255);
        bArr[i10 + 3] = (byte) (255 & (j10 >> 24));
        bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
        bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
        bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
        this.f6573h = i10 + 8;
        bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
    }

    public final void Q0(int i10) {
        boolean z9 = mc1.f6901e;
        byte[] bArr = this.f6571f;
        if (z9) {
            while ((i10 & (-128)) != 0) {
                int i11 = this.f6573h;
                this.f6573h = i11 + 1;
                pe1.n(bArr, i11, (byte) ((i10 | NotificationCompat.FLAG_HIGH_PRIORITY) & 255));
                i10 >>>= 7;
            }
            int i12 = this.f6573h;
            this.f6573h = i12 + 1;
            pe1.n(bArr, i12, (byte) i10);
            return;
        }
        while ((i10 & (-128)) != 0) {
            int i13 = this.f6573h;
            this.f6573h = i13 + 1;
            bArr[i13] = (byte) ((i10 | NotificationCompat.FLAG_HIGH_PRIORITY) & 255);
            i10 >>>= 7;
        }
        int i14 = this.f6573h;
        this.f6573h = i14 + 1;
        bArr[i14] = (byte) i10;
    }

    public final void R0(long j10) {
        boolean z9 = mc1.f6901e;
        byte[] bArr = this.f6571f;
        if (z9) {
            while (true) {
                int i10 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i11 = this.f6573h;
                    this.f6573h = i11 + 1;
                    pe1.n(bArr, i11, (byte) i10);
                    return;
                } else {
                    int i12 = this.f6573h;
                    this.f6573h = i12 + 1;
                    pe1.n(bArr, i12, (byte) ((i10 | NotificationCompat.FLAG_HIGH_PRIORITY) & 255));
                    j10 >>>= 7;
                }
            }
        } else {
            while (true) {
                int i13 = (int) j10;
                if ((j10 & (-128)) == 0) {
                    int i14 = this.f6573h;
                    this.f6573h = i14 + 1;
                    bArr[i14] = (byte) i13;
                    return;
                } else {
                    int i15 = this.f6573h;
                    this.f6573h = i15 + 1;
                    bArr[i15] = (byte) ((i13 | NotificationCompat.FLAG_HIGH_PRIORITY) & 255);
                    j10 >>>= 7;
                }
            }
        }
    }

    public final void S0(int i10, byte[] bArr, int i11) throws IOException {
        int i12 = this.f6573h;
        int i13 = this.f6572g;
        int i14 = i13 - i12;
        byte[] bArr2 = this.f6571f;
        if (i14 >= i11) {
            System.arraycopy(bArr, i10, bArr2, i12, i11);
            this.f6573h += i11;
            return;
        }
        System.arraycopy(bArr, i10, bArr2, i12, i14);
        int i15 = i10 + i14;
        this.f6573h = i13;
        M0();
        int i16 = i11 - i14;
        if (i16 > i13) {
            this.f6574i.write(bArr, i15, i16);
        } else {
            System.arraycopy(bArr, i15, bArr2, 0, i16);
            this.f6573h = i16;
        }
    }

    @Override // b4.f
    public final void Y(int i10, byte[] bArr, int i11) throws IOException {
        S0(i10, bArr, i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void v0(byte b10) throws IOException {
        if (this.f6573h == this.f6572g) {
            M0();
        }
        int i10 = this.f6573h;
        this.f6573h = i10 + 1;
        this.f6571f[i10] = b10;
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void w0(int i10, boolean z9) throws IOException {
        N0(11);
        Q0(i10 << 3);
        int i11 = this.f6573h;
        this.f6573h = i11 + 1;
        this.f6571f[i11] = z9 ? (byte) 1 : (byte) 0;
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void x0(int i10, ec1 ec1Var) throws IOException {
        I0((i10 << 3) | 2);
        I0(ec1Var.f());
        ec1Var.m(this);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void y0(int i10, int i11) throws IOException {
        N0(14);
        Q0((i10 << 3) | 5);
        O0(i11);
    }

    @Override // com.google.android.gms.internal.ads.mc1
    public final void z0(int i10) throws IOException {
        N0(4);
        O0(i10);
    }
}
