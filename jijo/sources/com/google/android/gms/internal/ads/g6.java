package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g6 implements g0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p1 f4833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0 f4834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4835k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nn0 f4825a = new nn0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f4827c = new ik0(NotificationCompat.FLAG_BUBBLE);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseArray f4826b = new SparseArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e6 f4828d = new e6();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.nn0 r5 = r4.f4825a
            long r0 = r5.e()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.d()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.f(r7)
        L24:
            com.google.android.gms.internal.ads.p1 r5 = r4.f4833i
            r6 = 0
            if (r5 == 0) goto L2c
            r5.b(r7)
        L2c:
            r5 = 0
        L2d:
            android.util.SparseArray r7 = r4.f4826b
            int r8 = r7.size()
            if (r5 >= r8) goto L45
            java.lang.Object r7 = r7.valueAt(r5)
            com.google.android.gms.internal.ads.f6 r7 = (com.google.android.gms.internal.ads.f6) r7
            r7.f4418f = r6
            com.google.android.gms.internal.ads.p5 r7 = r7.f4413a
            r7.zze()
            int r5 = r5 + 1
            goto L2d
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.g6.c(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final int d(h0 h0Var, k0 k0Var) {
        long jB;
        long j10;
        int i10;
        p5 r5Var;
        tc1.A(this.f4834j);
        long jZzd = h0Var.zzd();
        long j11 = -9223372036854775807L;
        e6 e6Var = this.f4828d;
        int i11 = 1;
        if (jZzd != -1 && !e6Var.f3867d) {
            boolean z9 = e6Var.f3869f;
            ik0 ik0Var = e6Var.f3866c;
            if (!z9) {
                long jZzd2 = h0Var.zzd();
                int iMin = (int) Math.min(20000L, jZzd2);
                long j12 = jZzd2 - ((long) iMin);
                if (h0Var.zzf() != j12) {
                    k0Var.f6130a = j12;
                } else {
                    ik0Var.f(iMin);
                    h0Var.zzj();
                    ((a0) h0Var).m(ik0Var.f5633a, 0, iMin, false);
                    int i12 = ik0Var.f5634b;
                    int i13 = ik0Var.f5635c - 4;
                    while (true) {
                        if (i13 < i12) {
                            break;
                        }
                        if (e6.d(ik0Var.f5633a, i13) == 442) {
                            ik0Var.i(i13 + 4);
                            long jB2 = e6.b(ik0Var);
                            if (jB2 != -9223372036854775807L) {
                                j11 = jB2;
                                break;
                            }
                        }
                        i13--;
                    }
                    e6Var.f3871h = j11;
                    e6Var.f3869f = true;
                    i11 = 0;
                }
            } else {
                if (e6Var.f3871h == -9223372036854775807L) {
                    byte[] bArr = yn0.f10949f;
                    int length = bArr.length;
                    ik0Var.g(bArr, 0);
                    e6Var.f3867d = true;
                    h0Var.zzj();
                    return 0;
                }
                if (e6Var.f3868e) {
                    long j13 = e6Var.f3870g;
                    if (j13 == -9223372036854775807L) {
                        byte[] bArr2 = yn0.f10949f;
                        int length2 = bArr2.length;
                        ik0Var.g(bArr2, 0);
                        e6Var.f3867d = true;
                        h0Var.zzj();
                        return 0;
                    }
                    nn0 nn0Var = e6Var.f3865b;
                    e6Var.f3872i = nn0Var.c(e6Var.f3871h) - nn0Var.b(j13);
                    byte[] bArr3 = yn0.f10949f;
                    int length3 = bArr3.length;
                    ik0Var.g(bArr3, 0);
                    e6Var.f3867d = true;
                    h0Var.zzj();
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, h0Var.zzd());
                if (h0Var.zzf() != 0) {
                    k0Var.f6130a = 0L;
                } else {
                    ik0Var.f(iMin2);
                    h0Var.zzj();
                    ((a0) h0Var).m(ik0Var.f5633a, 0, iMin2, false);
                    int i14 = ik0Var.f5634b;
                    int i15 = ik0Var.f5635c;
                    while (true) {
                        if (i14 >= i15 - 3) {
                            break;
                        }
                        if (e6.d(ik0Var.f5633a, i14) == 442) {
                            ik0Var.i(i14 + 4);
                            long jB3 = e6.b(ik0Var);
                            if (jB3 != -9223372036854775807L) {
                                j11 = jB3;
                                break;
                            }
                        }
                        i14++;
                    }
                    e6Var.f3870g = j11;
                    e6Var.f3868e = true;
                    i11 = 0;
                }
            }
            return i11;
        }
        if (!this.f4835k) {
            this.f4835k = true;
            if (e6Var.a() != -9223372036854775807L) {
                long jA = e6Var.a();
                p1 p1Var = new p1(new qz(4, (g1.a) null), new m20(e6Var.f3865b), jA, jA + 1, 0L, jZzd, 188L, 1000);
                this.f4833i = p1Var;
                this.f4834j.p(p1Var.f10688a);
            } else {
                this.f4834j.p(new l0(e6Var.a(), 0L));
            }
        }
        p1 p1Var2 = this.f4833i;
        if (p1Var2 != null && p1Var2.f10690c != null) {
            return p1Var2.a(h0Var, k0Var);
        }
        h0Var.zzj();
        long jZze = jZzd != -1 ? jZzd - h0Var.zze() : -1L;
        if (jZze != -1 && jZze < 4) {
            return -1;
        }
        ik0 ik0Var2 = this.f4827c;
        if (!h0Var.m(ik0Var2.f5633a, 0, 4, true)) {
            return -1;
        }
        ik0Var2.i(0);
        int iQ = ik0Var2.q();
        if (iQ == 441) {
            return -1;
        }
        if (iQ == 442) {
            a0 a0Var = (a0) h0Var;
            a0Var.m(ik0Var2.f5633a, 0, 10, false);
            ik0Var2.i(9);
            a0Var.j((ik0Var2.v() & 7) + 14);
            return 0;
        }
        if (iQ == 443) {
            a0 a0Var2 = (a0) h0Var;
            a0Var2.m(ik0Var2.f5633a, 0, 2, false);
            ik0Var2.i(0);
            a0Var2.j(ik0Var2.z() + 6);
            return 0;
        }
        if ((iQ >> 8) != 1) {
            ((a0) h0Var).j(1);
            return 0;
        }
        int i16 = iQ & 255;
        SparseArray sparseArray = this.f4826b;
        f6 f6Var = (f6) sparseArray.get(i16);
        if (!this.f4829e) {
            if (f6Var == null) {
                if (i16 == 189) {
                    r5Var = new k5(null, 0, 0);
                    this.f4830f = true;
                    this.f4832h = h0Var.zzf();
                } else if ((iQ & 224) == 192) {
                    r5Var = new a6(null, 0);
                    this.f4830f = true;
                    this.f4832h = h0Var.zzf();
                } else if ((iQ & 240) == 224) {
                    r5Var = new r5(null);
                    this.f4831g = true;
                    this.f4832h = h0Var.zzf();
                } else {
                    r5Var = null;
                }
                if (r5Var != null) {
                    r5Var.d(this.f4834j, new q2.d(Integer.MIN_VALUE, i16, NotificationCompat.FLAG_LOCAL_ONLY));
                    f6Var = new f6(r5Var, this.f4825a);
                    sparseArray.put(i16, f6Var);
                }
            }
            long j14 = 1048576;
            if (this.f4830f && this.f4831g) {
                j14 = this.f4832h + 8192;
            }
            if (h0Var.zzf() > j14) {
                this.f4829e = true;
                this.f4834j.i();
            }
        }
        a0 a0Var3 = (a0) h0Var;
        a0Var3.m(ik0Var2.f5633a, 0, 2, false);
        ik0Var2.i(0);
        int iZ = ik0Var2.z() + 6;
        if (f6Var == null) {
            a0Var3.j(iZ);
            return 0;
        }
        ik0Var2.f(iZ);
        a0Var3.h(ik0Var2.f5633a, 0, iZ, false);
        ik0Var2.i(6);
        d1 d1Var = f6Var.f4415c;
        ik0Var2.e(0, d1Var.f3531c, 3);
        d1Var.k(0);
        d1Var.m(8);
        f6Var.f4416d = d1Var.o();
        f6Var.f4417e = d1Var.o();
        d1Var.m(6);
        ik0Var2.e(0, d1Var.f3531c, d1Var.e(8));
        d1Var.k(0);
        if (f6Var.f4416d) {
            d1Var.m(4);
            long jE = d1Var.e(3);
            d1Var.m(1);
            int iE = d1Var.e(15) << 15;
            d1Var.m(1);
            long jE2 = d1Var.e(15);
            d1Var.m(1);
            boolean z10 = f6Var.f4418f;
            nn0 nn0Var2 = f6Var.f4414b;
            if (z10 || !f6Var.f4417e) {
                j10 = jE;
                i10 = iE;
            } else {
                d1Var.m(4);
                i10 = iE;
                long jE3 = ((long) d1Var.e(3)) << 30;
                d1Var.m(1);
                int iE2 = d1Var.e(15) << 15;
                d1Var.m(1);
                j10 = jE;
                long jE4 = d1Var.e(15);
                d1Var.m(1);
                nn0Var2.b(((long) iE2) | jE3 | jE4);
                f6Var.f4418f = true;
            }
            jB = nn0Var2.b((j10 << 30) | ((long) i10) | jE2);
        } else {
            jB = 0;
        }
        p5 p5Var = f6Var.f4413a;
        p5Var.e(4, jB);
        p5Var.c(ik0Var2);
        p5Var.b(false);
        ik0Var2.h(ik0Var2.f5633a.length);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f4834j = i0Var;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        byte[] bArr = new byte[14];
        a0 a0Var = (a0) h0Var;
        a0Var.m(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        a0Var.i(bArr[13] & 7, false);
        a0Var.m(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
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
