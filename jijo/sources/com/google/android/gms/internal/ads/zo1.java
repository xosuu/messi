package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ik0 f11281a = new ik0(32);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v2 f11282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public v2 f11283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2 f11284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f11285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final iq1 f11286f;

    public zo1(iq1 iq1Var) {
        this.f11286f = iq1Var;
        v2 v2Var = new v2(0L);
        this.f11282b = v2Var;
        this.f11283c = v2Var;
        this.f11284d = v2Var;
    }

    public static v2 c(v2 v2Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= v2Var.f9734b) {
            v2Var = (v2) v2Var.f9736f;
        }
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (v2Var.f9734b - j10));
            byteBuffer.put(((fq1) v2Var.f9735d).f4599a, v2Var.a(j10), iMin);
            i10 -= iMin;
            j10 += (long) iMin;
            if (j10 == v2Var.f9734b) {
                v2Var = (v2) v2Var.f9736f;
            }
        }
        return v2Var;
    }

    public static v2 d(v2 v2Var, long j10, byte[] bArr, int i10) {
        while (j10 >= v2Var.f9734b) {
            v2Var = (v2) v2Var.f9736f;
        }
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (v2Var.f9734b - j10));
            System.arraycopy(((fq1) v2Var.f9735d).f4599a, v2Var.a(j10), bArr, i10 - i11, iMin);
            i11 -= iMin;
            j10 += (long) iMin;
            if (j10 == v2Var.f9734b) {
                v2Var = (v2) v2Var.f9736f;
            }
        }
        return v2Var;
    }

    public static v2 e(v2 v2Var, wf1 wf1Var, e4 e4Var, ik0 ik0Var) {
        if (wf1Var.a(1073741824)) {
            long j10 = e4Var.f3852d;
            int iZ = 1;
            ik0Var.f(1);
            v2 v2VarD = d(v2Var, j10, ik0Var.f5633a, 1);
            long j11 = j10 + 1;
            byte b10 = ik0Var.f5633a[0];
            int i10 = b10 & 128;
            int i11 = b10 & 127;
            de1 de1Var = wf1Var.f10170d;
            byte[] bArr = de1Var.f3632a;
            if (bArr == null) {
                de1Var.f3632a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z9 = i10 != 0;
            v2Var = d(v2VarD, j11, de1Var.f3632a, i11);
            long j12 = j11 + ((long) i11);
            if (z9) {
                ik0Var.f(2);
                v2Var = d(v2Var, j12, ik0Var.f5633a, 2);
                j12 += 2;
                iZ = ik0Var.z();
            }
            int[] iArr = de1Var.f3635d;
            if (iArr == null || iArr.length < iZ) {
                iArr = new int[iZ];
            }
            int[] iArr2 = de1Var.f3636e;
            if (iArr2 == null || iArr2.length < iZ) {
                iArr2 = new int[iZ];
            }
            if (z9) {
                int i12 = iZ * 6;
                ik0Var.f(i12);
                v2Var = d(v2Var, j12, ik0Var.f5633a, i12);
                j12 += (long) i12;
                ik0Var.i(0);
                for (int i13 = 0; i13 < iZ; i13++) {
                    iArr[i13] = ik0Var.z();
                    iArr2[i13] = ik0Var.y();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = e4Var.f3851b - ((int) (j12 - e4Var.f3852d));
            }
            a1 a1Var = (a1) e4Var.f3853f;
            int i14 = yn0.f10944a;
            byte[] bArr2 = a1Var.f2552b;
            byte[] bArr3 = de1Var.f3632a;
            de1Var.f3637f = iZ;
            de1Var.f3635d = iArr;
            de1Var.f3636e = iArr2;
            de1Var.f3633b = bArr2;
            de1Var.f3632a = bArr3;
            int i15 = a1Var.f2551a;
            de1Var.f3634c = i15;
            int i16 = a1Var.f2553c;
            de1Var.f3638g = i16;
            int i17 = a1Var.f2554d;
            de1Var.f3639h = i17;
            MediaCodec.CryptoInfo cryptoInfo = de1Var.f3640i;
            cryptoInfo.numSubSamples = iZ;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (yn0.f10944a >= 24) {
                ld1 ld1Var = de1Var.f3641j;
                ld1Var.getClass();
                MediaCodec.CryptoInfo.Pattern pattern = ld1Var.f6577b;
                pattern.set(i16, i17);
                ld1Var.f6576a.setPattern(pattern);
            }
            long j13 = e4Var.f3852d;
            int i18 = (int) (j12 - j13);
            e4Var.f3852d = j13 + ((long) i18);
            e4Var.f3851b -= i18;
        }
        if (!wf1Var.a(268435456)) {
            wf1Var.e(e4Var.f3851b);
            return c(v2Var, e4Var.f3852d, wf1Var.f10171e, e4Var.f3851b);
        }
        ik0Var.f(4);
        v2 v2VarD2 = d(v2Var, e4Var.f3852d, ik0Var.f5633a, 4);
        int iY = ik0Var.y();
        e4Var.f3852d += 4;
        e4Var.f3851b -= 4;
        wf1Var.e(iY);
        v2 v2VarC = c(v2VarD2, e4Var.f3852d, wf1Var.f10171e, iY);
        e4Var.f3852d += (long) iY;
        int i19 = e4Var.f3851b - iY;
        e4Var.f3851b = i19;
        ByteBuffer byteBuffer = wf1Var.f10174h;
        if (byteBuffer == null || byteBuffer.capacity() < i19) {
            wf1Var.f10174h = ByteBuffer.allocate(i19);
        } else {
            wf1Var.f10174h.clear();
        }
        return c(v2VarC, e4Var.f3852d, wf1Var.f10174h, e4Var.f3851b);
    }

    public final void a(long j10) {
        v2 v2Var;
        if (j10 != -1) {
            while (true) {
                v2Var = this.f11282b;
                if (j10 < v2Var.f9734b) {
                    break;
                }
                iq1 iq1Var = this.f11286f;
                fq1 fq1Var = (fq1) v2Var.f9735d;
                synchronized (iq1Var) {
                    fq1[] fq1VarArr = (fq1[]) iq1Var.f5677c;
                    int i10 = iq1Var.f5678d;
                    iq1Var.f5678d = i10 + 1;
                    fq1VarArr[i10] = fq1Var;
                    iq1Var.f5676b--;
                    iq1Var.notifyAll();
                }
                v2 v2Var2 = this.f11282b;
                v2Var2.f9735d = null;
                v2 v2Var3 = (v2) v2Var2.f9736f;
                v2Var2.f9736f = null;
                this.f11282b = v2Var3;
            }
            if (this.f11283c.f9733a < v2Var.f9733a) {
                this.f11283c = v2Var;
            }
        }
    }

    public final int b(int i10) {
        fq1 fq1Var;
        v2 v2Var = this.f11284d;
        if (((fq1) v2Var.f9735d) == null) {
            iq1 iq1Var = this.f11286f;
            synchronized (iq1Var) {
                try {
                    int i11 = iq1Var.f5676b + 1;
                    iq1Var.f5676b = i11;
                    int i12 = iq1Var.f5678d;
                    if (i12 > 0) {
                        fq1[] fq1VarArr = (fq1[]) iq1Var.f5677c;
                        int i13 = i12 - 1;
                        iq1Var.f5678d = i13;
                        fq1Var = fq1VarArr[i13];
                        fq1Var.getClass();
                        fq1VarArr[i13] = null;
                    } else {
                        fq1Var = new fq1(new byte[65536]);
                        fq1[] fq1VarArr2 = (fq1[]) iq1Var.f5677c;
                        int length = fq1VarArr2.length;
                        if (i11 > length) {
                            iq1Var.f5677c = (fq1[]) Arrays.copyOf(fq1VarArr2, length + length);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            v2 v2Var2 = new v2(this.f11284d.f9734b);
            v2Var.f9735d = fq1Var;
            v2Var.f9736f = v2Var2;
        }
        return Math.min(i10, (int) (this.f11284d.f9734b - this.f11285e));
    }
}
