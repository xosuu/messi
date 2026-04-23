package com.google.android.gms.internal.ads;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class hc1 extends ic1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InputStream f5254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f5255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5261j = Integer.MAX_VALUE;

    public /* synthetic */ hc1(InputStream inputStream) {
        Charset charset = ed1.f3910a;
        this.f5254c = inputStream;
        this.f5255d = new byte[NotificationCompat.FLAG_BUBBLE];
        this.f5256e = 0;
        this.f5258g = 0;
        this.f5260i = 0;
    }

    public final void A(int i10) throws zzgyn {
        InputStream inputStream = this.f5254c;
        int i11 = this.f5256e;
        int i12 = this.f5258g;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f5258g = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw zzgyn.c();
        }
        int i14 = this.f5260i;
        int i15 = i14 + i12;
        int i16 = this.f5261j;
        if (i15 + i10 > i16) {
            A((i16 - i14) - i12);
            throw zzgyn.e();
        }
        this.f5260i = i15;
        this.f5256e = 0;
        this.f5258g = 0;
        while (i13 < i10) {
            long j10 = i10 - i13;
            try {
                try {
                    long jSkip = inputStream.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzgyn e10) {
                    e10.f11646a = true;
                    throw e10;
                }
            } catch (Throwable th) {
                this.f5260i += i13;
                C();
                throw th;
            }
        }
        this.f5260i += i13;
        C();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.f5256e;
        int i18 = i17 - this.f5258g;
        this.f5258g = i17;
        D(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.f5256e;
            if (i19 <= i20) {
                this.f5258g = i19;
                return;
            } else {
                i18 += i20;
                this.f5258g = i20;
                D(1);
            }
        }
    }

    public final ArrayList B(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, NotificationCompat.FLAG_BUBBLE);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f5254c.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw zzgyn.e();
                }
                this.f5260i += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void C() {
        int i10 = this.f5256e + this.f5257f;
        this.f5256e = i10;
        int i11 = this.f5260i + i10;
        int i12 = this.f5261j;
        if (i11 <= i12) {
            this.f5257f = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f5257f = i13;
        this.f5256e = i10 - i13;
    }

    public final void D(int i10) throws zzgyn {
        if (E(i10)) {
            return;
        }
        if (i10 <= (Integer.MAX_VALUE - this.f5260i) - this.f5258g) {
            throw zzgyn.e();
        }
        throw new zzgyn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final boolean E(int i10) throws IOException {
        InputStream inputStream = this.f5254c;
        int i11 = this.f5258g;
        int i12 = i11 + i10;
        int i13 = this.f5256e;
        if (i12 <= i13) {
            throw new IllegalStateException(fb1.h("refillBuffer() called when ", i10, " bytes were already available in buffer"));
        }
        int i14 = this.f5260i;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.f5261j) {
            return false;
        }
        byte[] bArr = this.f5255d;
        if (i11 > 0) {
            if (i13 > i11) {
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.f5260i + i11;
            this.f5260i = i14;
            i13 = this.f5256e - i11;
            this.f5256e = i13;
            this.f5258g = 0;
        }
        try {
            int i15 = inputStream.read(bArr, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 == 0 || i15 < -1 || i15 > 4096) {
                throw new IllegalStateException(String.valueOf(inputStream.getClass()) + "#read(byte[]) returned invalid result: " + i15 + "\nThe InputStream implementation is buggy.");
            }
            if (i15 <= 0) {
                return false;
            }
            this.f5256e += i15;
            C();
            if (this.f5256e >= i10) {
                return true;
            }
            return E(i10);
        } catch (zzgyn e10) {
            e10.f11646a = true;
            throw e10;
        }
    }

    public final byte[] F(int i10) throws IOException {
        byte[] bArrG = G(i10);
        if (bArrG != null) {
            return bArrG;
        }
        int i11 = this.f5258g;
        int i12 = this.f5256e;
        int i13 = i12 - i11;
        this.f5260i += i12;
        this.f5258g = 0;
        this.f5256e = 0;
        ArrayList<byte[]> arrayListB = B(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f5255d, i11, bArr, 0, i13);
        for (byte[] bArr2 : arrayListB) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    public final byte[] G(int i10) throws IOException {
        if (i10 == 0) {
            return ed1.f3911b;
        }
        int i11 = this.f5260i;
        int i12 = this.f5258g;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzgyn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f5261j;
        if (i13 > i14) {
            A((i14 - i11) - i12);
            throw zzgyn.e();
        }
        int i15 = this.f5256e - i12;
        int i16 = i10 - i15;
        InputStream inputStream = this.f5254c;
        if (i16 >= 4096) {
            try {
                if (i16 > inputStream.available()) {
                    return null;
                }
            } catch (zzgyn e10) {
                e10.f11646a = true;
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f5255d, this.f5258g, bArr, 0, i15);
        this.f5260i += this.f5256e;
        this.f5258g = 0;
        this.f5256e = 0;
        while (i15 < i10) {
            try {
                int i17 = inputStream.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw zzgyn.e();
                }
                this.f5260i += i17;
                i15 += i17;
            } catch (zzgyn e11) {
                e11.f11646a = true;
                throw e11;
            }
        }
        return bArr;
    }

    public final int H() throws zzgyn {
        int i10 = this.f5258g;
        if (this.f5256e - i10 < 4) {
            D(4);
            i10 = this.f5258g;
        }
        this.f5258g = i10 + 4;
        byte[] bArr = this.f5255d;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int I() {
        int i10;
        int i11 = this.f5258g;
        int i12 = this.f5256e;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f5255d;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f5258g = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                i18 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i18] < 0) {
                                        i18 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i18] < 0) {
                                                int i21 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i14 = i21;
                                                    i10 = i20;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i20;
                            }
                            i10 = i20;
                        }
                        i14 = i18;
                    }
                    i14 = i16;
                }
                this.f5258g = i14;
                return i10;
            }
        }
        return (int) L();
    }

    public final long J() throws zzgyn {
        int i10 = this.f5258g;
        if (this.f5256e - i10 < 8) {
            D(8);
            i10 = this.f5258g;
        }
        this.f5258g = i10 + 8;
        byte[] bArr = this.f5255d;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long K() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f5258g;
        int i11 = this.f5256e;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f5255d;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f5258g = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            long j13 = (-2080896) ^ i18;
                            i13 = i17;
                            j10 = j13;
                        } else {
                            i15 = i10 + 5;
                            long j14 = ((long) i18) ^ (((long) bArr[i17]) << 28);
                            if (j14 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j15 = j14 ^ (((long) bArr[i15]) << 35);
                                if (j15 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i15 = i10 + 7;
                                    j14 = j15 ^ (((long) bArr[i19]) << 42);
                                    if (j14 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j15 = j14 ^ (((long) bArr[i15]) << 49);
                                        if (j15 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i15 = i10 + 9;
                                            long j16 = (j15 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                            if (j16 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i15] >= 0) {
                                                    j10 = j16;
                                                    i13 = i20;
                                                }
                                            } else {
                                                j10 = j16;
                                            }
                                        }
                                    }
                                }
                                j10 = j15 ^ j11;
                                i13 = i19;
                            }
                            j10 = j14 ^ j12;
                        }
                    }
                    i13 = i15;
                }
                this.f5258g = i13;
                return j10;
            }
        }
        return L();
    }

    public final long L() throws zzgyn {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            if (this.f5258g == this.f5256e) {
                D(1);
            }
            int i11 = this.f5258g;
            this.f5258g = i11 + 1;
            byte b10 = this.f5255d[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new zzgyn("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final boolean a() {
        return this.f5258g == this.f5256e && !E(1);
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final boolean b() {
        return K() != 0;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final double f() {
        return Double.longBitsToDouble(J());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final float g() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int h() {
        return this.f5260i + this.f5258g;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int i(int i10) throws zzgyn {
        if (i10 < 0) {
            throw zzgyn.c();
        }
        int i11 = this.f5260i + this.f5258g + i10;
        if (i11 < 0) {
            throw zzgyn.d();
        }
        int i12 = this.f5261j;
        if (i11 > i12) {
            throw zzgyn.e();
        }
        this.f5261j = i11;
        C();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int j() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int k() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int l() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int m() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int n() {
        return ic1.c(I());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int o() throws zzgyn {
        if (a()) {
            this.f5259h = 0;
            return 0;
        }
        int I = I();
        this.f5259h = I;
        if ((I >>> 3) != 0) {
            return I;
        }
        throw new zzgyn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int p() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long q() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long r() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long s() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long t() {
        return ic1.d(K());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long u() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final cc1 v() throws IOException {
        int I = I();
        int i10 = this.f5256e;
        int i11 = this.f5258g;
        int i12 = i10 - i11;
        byte[] bArr = this.f5255d;
        if (I <= i12 && I > 0) {
            cc1 cc1VarQ = ec1.q(i11, bArr, I);
            this.f5258g += I;
            return cc1VarQ;
        }
        if (I == 0) {
            return ec1.f3903b;
        }
        if (I < 0) {
            throw zzgyn.c();
        }
        byte[] bArrG = G(I);
        if (bArrG != null) {
            return ec1.q(0, bArrG, bArrG.length);
        }
        int i13 = this.f5258g;
        int i14 = this.f5256e;
        int i15 = i14 - i13;
        this.f5260i += i14;
        this.f5258g = 0;
        this.f5256e = 0;
        ArrayList<byte[]> arrayListB = B(I - i15);
        byte[] bArr2 = new byte[I];
        System.arraycopy(bArr, i13, bArr2, 0, i15);
        for (byte[] bArr3 : arrayListB) {
            int length = bArr3.length;
            System.arraycopy(bArr3, 0, bArr2, i15, length);
            i15 += length;
        }
        return new cc1(bArr2);
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final String w() throws zzgyn {
        int I = I();
        byte[] bArr = this.f5255d;
        if (I > 0) {
            int i10 = this.f5256e;
            int i11 = this.f5258g;
            if (I <= i10 - i11) {
                String str = new String(bArr, i11, I, ed1.f3910a);
                this.f5258g += I;
                return str;
            }
        }
        if (I == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (I < 0) {
            throw zzgyn.c();
        }
        if (I > this.f5256e) {
            return new String(F(I), ed1.f3910a);
        }
        D(I);
        String str2 = new String(bArr, this.f5258g, I, ed1.f3910a);
        this.f5258g += I;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final String x() throws IOException {
        int I = I();
        int i10 = this.f5258g;
        int i11 = this.f5256e;
        int i12 = i11 - i10;
        byte[] bArrF = this.f5255d;
        if (I <= i12 && I > 0) {
            this.f5258g = i10 + I;
        } else {
            if (I == 0) {
                return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            }
            if (I < 0) {
                throw zzgyn.c();
            }
            i10 = 0;
            if (I <= i11) {
                D(I);
                this.f5258g = I;
            } else {
                bArrF = F(I);
            }
        }
        re1.f8585a.getClass();
        return mb1.e(i10, bArrF, I);
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final void y() throws zzgyn {
        if (this.f5259h != 0) {
            throw new zzgyn("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final void z(int i10) {
        this.f5261j = i10;
        C();
    }
}
