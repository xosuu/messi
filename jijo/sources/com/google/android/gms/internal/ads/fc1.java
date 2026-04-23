package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fc1 extends ic1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4475i = Integer.MAX_VALUE;

    public /* synthetic */ fc1(byte[] bArr, int i10, int i11) {
        this.f4469c = bArr;
        this.f4470d = i11 + i10;
        this.f4472f = i10;
        this.f4473g = i10;
    }

    public final void A() {
        int i10 = this.f4470d + this.f4471e;
        this.f4470d = i10;
        int i11 = i10 - this.f4473g;
        int i12 = this.f4475i;
        if (i11 <= i12) {
            this.f4471e = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f4471e = i13;
        this.f4470d = i10 - i13;
    }

    public final int B() throws zzgyn {
        int i10 = this.f4472f;
        if (this.f4470d - i10 < 4) {
            throw zzgyn.e();
        }
        this.f4472f = i10 + 4;
        byte[] bArr = this.f4469c;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final int C() {
        int i10;
        int i11 = this.f4472f;
        int i12 = this.f4470d;
        if (i12 != i11) {
            int i13 = i11 + 1;
            byte[] bArr = this.f4469c;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f4472f = i13;
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
                this.f4472f = i14;
                return i10;
            }
        }
        return (int) F();
    }

    public final long D() throws zzgyn {
        int i10 = this.f4472f;
        if (this.f4470d - i10 < 8) {
            throw zzgyn.e();
        }
        this.f4472f = i10 + 8;
        byte[] bArr = this.f4469c;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    public final long E() {
        long j10;
        long j11;
        long j12;
        int i10 = this.f4472f;
        int i11 = this.f4470d;
        if (i11 != i10) {
            int i12 = i10 + 1;
            byte[] bArr = this.f4469c;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f4472f = i12;
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
                this.f4472f = i13;
                return j10;
            }
        }
        return F();
    }

    public final long F() throws zzgyn {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            int i11 = this.f4472f;
            if (i11 == this.f4470d) {
                throw zzgyn.e();
            }
            this.f4472f = i11 + 1;
            byte b10 = this.f4469c[i11];
            j10 |= ((long) (b10 & 127)) << i10;
            if ((b10 & 128) == 0) {
                return j10;
            }
        }
        throw new zzgyn("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final boolean a() {
        return this.f4472f == this.f4470d;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final boolean b() {
        return E() != 0;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final double f() {
        return Double.longBitsToDouble(D());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final float g() {
        return Float.intBitsToFloat(B());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int h() {
        return this.f4472f - this.f4473g;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int i(int i10) throws zzgyn {
        if (i10 < 0) {
            throw zzgyn.c();
        }
        int i11 = (this.f4472f - this.f4473g) + i10;
        if (i11 < 0) {
            throw zzgyn.d();
        }
        int i12 = this.f4475i;
        if (i11 > i12) {
            throw zzgyn.e();
        }
        this.f4475i = i11;
        A();
        return i12;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int j() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int k() {
        return B();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int l() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int m() {
        return B();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int n() {
        return ic1.c(C());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int o() throws zzgyn {
        if (a()) {
            this.f4474h = 0;
            return 0;
        }
        int iC = C();
        this.f4474h = iC;
        if ((iC >>> 3) != 0) {
            return iC;
        }
        throw new zzgyn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int p() {
        return C();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long q() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long r() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long s() {
        return D();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long t() {
        return ic1.d(E());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long u() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final cc1 v() throws zzgyn {
        int iC = C();
        byte[] bArr = this.f4469c;
        if (iC > 0) {
            int i10 = this.f4470d;
            int i11 = this.f4472f;
            if (iC <= i10 - i11) {
                cc1 cc1VarQ = ec1.q(i11, bArr, iC);
                this.f4472f += iC;
                return cc1VarQ;
            }
        }
        if (iC == 0) {
            return ec1.f3903b;
        }
        if (iC > 0) {
            int i12 = this.f4470d;
            int i13 = this.f4472f;
            if (iC <= i12 - i13) {
                int i14 = iC + i13;
                this.f4472f = i14;
                return new cc1(Arrays.copyOfRange(bArr, i13, i14));
            }
        }
        if (iC <= 0) {
            throw zzgyn.c();
        }
        throw zzgyn.e();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final String w() throws zzgyn {
        int iC = C();
        if (iC > 0) {
            int i10 = this.f4470d;
            int i11 = this.f4472f;
            if (iC <= i10 - i11) {
                String str = new String(this.f4469c, i11, iC, ed1.f3910a);
                this.f4472f += iC;
                return str;
            }
        }
        if (iC == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iC < 0) {
            throw zzgyn.c();
        }
        throw zzgyn.e();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final String x() throws zzgyn {
        int iC = C();
        if (iC > 0) {
            int i10 = this.f4470d;
            int i11 = this.f4472f;
            if (iC <= i10 - i11) {
                re1.f8585a.getClass();
                String strE = mb1.e(i11, this.f4469c, iC);
                this.f4472f += iC;
                return strE;
            }
        }
        if (iC == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iC <= 0) {
            throw zzgyn.c();
        }
        throw zzgyn.e();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final void y() throws zzgyn {
        if (this.f4474h != 0) {
            throw new zzgyn("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final void z(int i10) {
        this.f4475i = i10;
        A();
    }
}
