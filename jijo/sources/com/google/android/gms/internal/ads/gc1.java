package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class gc1 extends ic1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Iterator f4873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ByteBuffer f4874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f4875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f4876f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4878h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f4880j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4881k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f4882l;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4877g = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4879i = 0;

    public /* synthetic */ gc1(ArrayList arrayList, int i10) {
        this.f4875e = i10;
        this.f4873c = arrayList.iterator();
        if (i10 != 0) {
            D();
            return;
        }
        this.f4874d = ed1.f3912c;
        this.f4880j = 0L;
        this.f4881k = 0L;
        this.f4882l = 0L;
    }

    public final long A() throws zzgyn {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bE = E();
            j10 |= ((long) (bE & 127)) << i10;
            if ((bE & 128) == 0) {
                return j10;
            }
        }
        throw new zzgyn("CodedInputStream encountered a malformed varint.");
    }

    public final int B() {
        return (int) ((((long) (this.f4875e - this.f4879i)) - this.f4880j) + this.f4881k);
    }

    public final void C(byte[] bArr, int i10) throws zzgyn {
        if (i10 > B()) {
            if (i10 > 0) {
                throw zzgyn.e();
            }
            return;
        }
        int i11 = i10;
        while (i11 > 0) {
            if (this.f4882l - this.f4880j == 0) {
                if (!this.f4873c.hasNext()) {
                    throw zzgyn.e();
                }
                D();
            }
            int iMin = Math.min(i11, (int) (this.f4882l - this.f4880j));
            long j10 = iMin;
            pe1.f7866c.A0(this.f4880j, bArr, i10 - i11, j10);
            i11 -= iMin;
            this.f4880j += j10;
        }
    }

    public final void D() {
        ByteBuffer byteBuffer = (ByteBuffer) this.f4873c.next();
        this.f4874d = byteBuffer;
        this.f4879i += (int) (this.f4880j - this.f4881k);
        long jPosition = byteBuffer.position();
        this.f4880j = jPosition;
        this.f4881k = jPosition;
        this.f4882l = this.f4874d.limit();
        long jH = pe1.h(this.f4874d);
        this.f4880j += jH;
        this.f4881k += jH;
        this.f4882l += jH;
    }

    public final byte E() throws zzgyn {
        if (this.f4882l - this.f4880j == 0) {
            if (!this.f4873c.hasNext()) {
                throw zzgyn.e();
            }
            D();
        }
        long j10 = this.f4880j;
        this.f4880j = 1 + j10;
        return pe1.f7866c.v0(j10);
    }

    public final int F() {
        long j10 = this.f4882l;
        long j11 = this.f4880j;
        if (j10 - j11 < 4) {
            int iE = E() & 255;
            int iE2 = (E() & 255) << 8;
            return iE | iE2 | ((E() & 255) << 16) | ((E() & 255) << 24);
        }
        this.f4880j = 4 + j11;
        oe1 oe1Var = pe1.f7866c;
        int iV0 = oe1Var.v0(j11) & 255;
        int iV02 = (oe1Var.v0(1 + j11) & 255) << 8;
        return ((oe1Var.v0(j11 + 3) & 255) << 24) | iV0 | iV02 | ((oe1Var.v0(2 + j11) & 255) << 16);
    }

    public final int G() {
        int i10;
        long j10 = this.f4880j;
        if (this.f4882l != j10) {
            long j11 = j10 + 1;
            oe1 oe1Var = pe1.f7866c;
            byte bV0 = oe1Var.v0(j10);
            if (bV0 >= 0) {
                this.f4880j++;
                return bV0;
            }
            if (this.f4882l - this.f4880j >= 10) {
                long j12 = 2 + j10;
                int iV0 = (oe1Var.v0(j11) << 7) ^ bV0;
                if (iV0 < 0) {
                    i10 = iV0 ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int iV02 = (oe1Var.v0(j12) << 14) ^ iV0;
                    if (iV02 >= 0) {
                        i10 = iV02 ^ 16256;
                    } else {
                        long j14 = 4 + j10;
                        int iV03 = iV02 ^ (oe1Var.v0(j13) << 21);
                        if (iV03 < 0) {
                            i10 = (-2080896) ^ iV03;
                        } else {
                            j13 = 5 + j10;
                            byte bV02 = oe1Var.v0(j14);
                            int i11 = (iV03 ^ (bV02 << 28)) ^ 266354560;
                            if (bV02 < 0) {
                                j14 = 6 + j10;
                                if (oe1Var.v0(j13) < 0) {
                                    j13 = 7 + j10;
                                    if (oe1Var.v0(j14) < 0) {
                                        j14 = 8 + j10;
                                        if (oe1Var.v0(j13) < 0) {
                                            j13 = 9 + j10;
                                            if (oe1Var.v0(j14) < 0) {
                                                long j15 = j10 + 10;
                                                if (oe1Var.v0(j13) >= 0) {
                                                    i10 = i11;
                                                    j12 = j15;
                                                }
                                            }
                                        }
                                    }
                                }
                                i10 = i11;
                            }
                            i10 = i11;
                        }
                        j12 = j14;
                    }
                    j12 = j13;
                }
                this.f4880j = j12;
                return i10;
            }
        }
        return (int) A();
    }

    public final long H() {
        long j10 = this.f4882l;
        long j11 = this.f4880j;
        if (j10 - j11 < 8) {
            long jE = ((long) E()) & 255;
            long jE2 = (((long) E()) & 255) << 8;
            long jE3 = (((long) E()) & 255) << 16;
            long jE4 = (((long) E()) & 255) << 24;
            long jE5 = (((long) E()) & 255) << 32;
            long jE6 = (((long) E()) & 255) << 40;
            return jE6 | jE | jE2 | jE3 | jE4 | jE5 | ((((long) E()) & 255) << 48) | ((((long) E()) & 255) << 56);
        }
        this.f4880j = 8 + j11;
        oe1 oe1Var = pe1.f7866c;
        long jV0 = ((long) oe1Var.v0(j11)) & 255;
        long jV02 = (((long) oe1Var.v0(j11 + 1)) & 255) << 8;
        long jV03 = (((long) oe1Var.v0(j11 + 2)) & 255) << 16;
        long jV04 = (((long) oe1Var.v0(3 + j11)) & 255) << 24;
        long jV05 = (((long) oe1Var.v0(j11 + 4)) & 255) << 32;
        long jV06 = (((long) oe1Var.v0(j11 + 5)) & 255) << 40;
        return ((((long) oe1Var.v0(j11 + 7)) & 255) << 56) | jV0 | jV02 | jV03 | jV04 | jV05 | jV06 | ((((long) oe1Var.v0(j11 + 6)) & 255) << 48);
    }

    public final long I() {
        long j10;
        long j11;
        long j12;
        long j13 = this.f4880j;
        if (this.f4882l != j13) {
            long j14 = j13 + 1;
            oe1 oe1Var = pe1.f7866c;
            byte bV0 = oe1Var.v0(j13);
            if (bV0 >= 0) {
                this.f4880j++;
                return bV0;
            }
            if (this.f4882l - this.f4880j >= 10) {
                long j15 = 2 + j13;
                int iV0 = (oe1Var.v0(j14) << 7) ^ bV0;
                if (iV0 < 0) {
                    j10 = iV0 ^ (-128);
                } else {
                    long j16 = 3 + j13;
                    int iV02 = (oe1Var.v0(j15) << 14) ^ iV0;
                    if (iV02 >= 0) {
                        j10 = iV02 ^ 16256;
                    } else {
                        long j17 = 4 + j13;
                        int iV03 = iV02 ^ (oe1Var.v0(j16) << 21);
                        if (iV03 < 0) {
                            j10 = (-2080896) ^ iV03;
                            j15 = j17;
                        } else {
                            j16 = 5 + j13;
                            long jV0 = (((long) oe1Var.v0(j17)) << 28) ^ ((long) iV03);
                            if (jV0 >= 0) {
                                j12 = 266354560;
                            } else {
                                long j18 = 6 + j13;
                                long jV02 = jV0 ^ (((long) oe1Var.v0(j16)) << 35);
                                if (jV02 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    j16 = 7 + j13;
                                    jV0 = jV02 ^ (((long) oe1Var.v0(j18)) << 42);
                                    if (jV0 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        j18 = 8 + j13;
                                        jV02 = jV0 ^ (((long) oe1Var.v0(j16)) << 49);
                                        if (jV02 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            j16 = 9 + j13;
                                            long jV03 = (jV02 ^ (((long) oe1Var.v0(j18)) << 56)) ^ 71499008037633920L;
                                            if (jV03 < 0) {
                                                long j19 = j13 + 10;
                                                if (oe1Var.v0(j16) >= 0) {
                                                    j10 = jV03;
                                                    j15 = j19;
                                                }
                                            } else {
                                                j10 = jV03;
                                            }
                                        }
                                    }
                                }
                                j10 = j11 ^ jV02;
                                j15 = j18;
                            }
                            j10 = j12 ^ jV0;
                        }
                    }
                    j15 = j16;
                }
                this.f4880j = j15;
                return j10;
            }
        }
        return A();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final boolean a() {
        return (((long) this.f4879i) + this.f4880j) - this.f4881k == ((long) this.f4875e);
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final boolean b() {
        return I() != 0;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final double f() {
        return Double.longBitsToDouble(H());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final float g() {
        return Float.intBitsToFloat(F());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int h() {
        return (int) ((((long) this.f4879i) + this.f4880j) - this.f4881k);
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int i(int i10) throws zzgyn {
        if (i10 < 0) {
            throw zzgyn.c();
        }
        int iH = h() + i10;
        int i11 = this.f4877g;
        if (iH > i11) {
            throw zzgyn.e();
        }
        this.f4877g = iH;
        int i12 = this.f4875e + this.f4876f;
        this.f4875e = i12;
        if (i12 > iH) {
            int i13 = i12 - iH;
            this.f4876f = i13;
            this.f4875e = i12 - i13;
        } else {
            this.f4876f = 0;
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int j() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int k() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int l() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int m() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int n() {
        return ic1.c(G());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int o() throws zzgyn {
        if (a()) {
            this.f4878h = 0;
            return 0;
        }
        int iG = G();
        this.f4878h = iG;
        if ((iG >>> 3) != 0) {
            return iG;
        }
        throw new zzgyn("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final int p() {
        return G();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long q() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long r() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long s() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long t() {
        return ic1.d(I());
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final long u() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final cc1 v() throws zzgyn {
        int iG = G();
        if (iG > 0) {
            long j10 = this.f4882l;
            long j11 = this.f4880j;
            long j12 = iG;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iG];
                pe1.f7866c.A0(j11, bArr, 0L, j12);
                this.f4880j += j12;
                return new cc1(bArr);
            }
        }
        if (iG > 0 && iG <= B()) {
            byte[] bArr2 = new byte[iG];
            C(bArr2, iG);
            return new cc1(bArr2);
        }
        if (iG == 0) {
            return ec1.f3903b;
        }
        if (iG < 0) {
            throw zzgyn.c();
        }
        throw zzgyn.e();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final String w() throws zzgyn {
        int iG = G();
        if (iG > 0) {
            long j10 = this.f4882l;
            long j11 = this.f4880j;
            long j12 = iG;
            if (j12 <= j10 - j11) {
                byte[] bArr = new byte[iG];
                pe1.f7866c.A0(j11, bArr, 0L, j12);
                String str = new String(bArr, ed1.f3910a);
                this.f4880j += j12;
                return str;
            }
        }
        if (iG > 0 && iG <= B()) {
            byte[] bArr2 = new byte[iG];
            C(bArr2, iG);
            return new String(bArr2, ed1.f3910a);
        }
        if (iG == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iG < 0) {
            throw zzgyn.c();
        }
        throw zzgyn.e();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final String x() throws zzgyn {
        String strF;
        int iG = G();
        if (iG > 0) {
            long j10 = this.f4882l;
            long j11 = this.f4880j;
            long j12 = iG;
            if (j12 <= j10 - j11) {
                long j13 = j11 - this.f4881k;
                ByteBuffer byteBuffer = this.f4874d;
                int i10 = (int) j13;
                mb1 mb1Var = re1.f8585a;
                if (byteBuffer.hasArray()) {
                    int iArrayOffset = byteBuffer.arrayOffset();
                    byte[] bArrArray = byteBuffer.array();
                    re1.f8585a.getClass();
                    strF = mb1.e(iArrayOffset + i10, bArrArray, iG);
                } else {
                    strF = byteBuffer.isDirect() ? mb1.f(byteBuffer, i10, iG) : mb1.f(byteBuffer, i10, iG);
                }
                this.f4880j += j12;
                return strF;
            }
        }
        if (iG >= 0 && iG <= B()) {
            byte[] bArr = new byte[iG];
            C(bArr, iG);
            re1.f8585a.getClass();
            return mb1.e(0, bArr, iG);
        }
        if (iG == 0) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        if (iG <= 0) {
            throw zzgyn.c();
        }
        throw zzgyn.e();
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final void y() throws zzgyn {
        if (this.f4878h != 0) {
            throw new zzgyn("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.ic1
    public final void z(int i10) {
        this.f4877g = i10;
        int i11 = this.f4875e + this.f4876f;
        this.f4875e = i11;
        if (i11 <= i10) {
            this.f4876f = 0;
            return;
        }
        int i12 = i11 - i10;
        this.f4876f = i12;
        this.f4875e = i11 - i12;
    }
}
