package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ke1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ke1 f6268f = new ke1(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f6270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f6271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6272d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f6273e;

    public ke1(int i10, int[] iArr, Object[] objArr, boolean z9) {
        this.f6269a = i10;
        this.f6270b = iArr;
        this.f6271c = objArr;
        this.f6273e = z9;
    }

    public static ke1 b() {
        return new ke1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iS0;
        int iT0;
        int iS02;
        int i10 = this.f6272d;
        if (i10 != -1) {
            return i10;
        }
        int iS03 = 0;
        for (int i11 = 0; i11 < this.f6269a; i11++) {
            int i12 = this.f6270b[i11];
            int i13 = i12 >>> 3;
            int i14 = i12 & 7;
            if (i14 != 0) {
                if (i14 == 1) {
                    ((Long) this.f6271c[i11]).longValue();
                    iS02 = mc1.s0(i13 << 3) + 8;
                } else if (i14 == 2) {
                    int i15 = i13 << 3;
                    ec1 ec1Var = (ec1) this.f6271c[i11];
                    int iS04 = mc1.s0(i15);
                    int iF = ec1Var.f();
                    iS03 = mc1.s0(iF) + iF + iS04 + iS03;
                } else if (i14 == 3) {
                    int iS05 = mc1.s0(i13 << 3);
                    iS0 = iS05 + iS05;
                    iT0 = ((ke1) this.f6271c[i11]).a();
                } else {
                    if (i14 != 5) {
                        throw new IllegalStateException(zzgyn.a());
                    }
                    ((Integer) this.f6271c[i11]).intValue();
                    iS02 = mc1.s0(i13 << 3) + 4;
                }
                iS03 = iS02 + iS03;
            } else {
                int i16 = i13 << 3;
                long jLongValue = ((Long) this.f6271c[i11]).longValue();
                iS0 = mc1.s0(i16);
                iT0 = mc1.t0(jLongValue);
            }
            iS03 = iT0 + iS0 + iS03;
        }
        this.f6272d = iS03;
        return iS03;
    }

    public final void c(int i10, Object obj) {
        if (!this.f6273e) {
            throw new UnsupportedOperationException();
        }
        e(this.f6269a + 1);
        int[] iArr = this.f6270b;
        int i11 = this.f6269a;
        iArr[i11] = i10;
        this.f6271c[i11] = obj;
        this.f6269a = i11 + 1;
    }

    public final void d(nc1 nc1Var) {
        if (this.f6269a != 0) {
            for (int i10 = 0; i10 < this.f6269a; i10++) {
                int i11 = this.f6270b[i10];
                Object obj = this.f6271c[i10];
                int i12 = i11 & 7;
                int i13 = i11 >>> 3;
                if (i12 == 0) {
                    nc1Var.n(i13, ((Long) obj).longValue());
                } else if (i12 == 1) {
                    nc1Var.j(i13, ((Long) obj).longValue());
                } else if (i12 == 2) {
                    nc1Var.f(i13, (ec1) obj);
                } else if (i12 == 3) {
                    nc1Var.f7244a.G0(i13, 3);
                    ((ke1) obj).d(nc1Var);
                    nc1Var.f7244a.G0(i13, 4);
                } else {
                    if (i12 != 5) {
                        throw new RuntimeException(zzgyn.a());
                    }
                    nc1Var.i(i13, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i10) {
        int[] iArr = this.f6270b;
        if (i10 > iArr.length) {
            int i11 = this.f6269a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f6270b = Arrays.copyOf(iArr, i10);
            this.f6271c = Arrays.copyOf(this.f6271c, i10);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ke1)) {
            return false;
        }
        ke1 ke1Var = (ke1) obj;
        int i10 = this.f6269a;
        if (i10 == ke1Var.f6269a) {
            int[] iArr = this.f6270b;
            int[] iArr2 = ke1Var.f6270b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    Object[] objArr = this.f6271c;
                    Object[] objArr2 = ke1Var.f6271c;
                    int i12 = this.f6269a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
                if (iArr[i11] != iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f6269a;
        int i11 = i10 + 527;
        int[] iArr = this.f6270b;
        int iHashCode = 17;
        int i12 = 17;
        for (int i13 = 0; i13 < i10; i13++) {
            i12 = (i12 * 31) + iArr[i13];
        }
        int i14 = ((i11 * 31) + i12) * 31;
        Object[] objArr = this.f6271c;
        int i15 = this.f6269a;
        for (int i16 = 0; i16 < i15; i16++) {
            iHashCode = (iHashCode * 31) + objArr[i16].hashCode();
        }
        return i14 + iHashCode;
    }
}
