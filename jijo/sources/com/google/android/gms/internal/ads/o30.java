package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f7481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f7482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f7483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f7484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f7485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final short[] f7486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f7487j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f7488k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f7489l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f7490m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public short[] f7491n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7492o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f7493p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f7494q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f7495r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f7496s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f7497t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f7498u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f7499v;

    public o30(int i10, int i11, float f10, float f11, int i12) {
        this.f7478a = i10;
        this.f7479b = i11;
        this.f7480c = f10;
        this.f7481d = f11;
        this.f7482e = i10 / i12;
        this.f7483f = i10 / 400;
        int i13 = i10 / 65;
        this.f7484g = i13;
        int i14 = i13 + i13;
        this.f7485h = i14;
        this.f7486i = new short[i14];
        int i15 = i14 * i11;
        this.f7487j = new short[i15];
        this.f7489l = new short[i15];
        this.f7491n = new short[i15];
    }

    public static void d(int i10, int i11, short[] sArr, int i12, short[] sArr2, int i13, short[] sArr3, int i14) {
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = (i13 * i11) + i15;
            int i17 = (i14 * i11) + i15;
            int i18 = (i12 * i11) + i15;
            for (int i19 = 0; i19 < i10; i19++) {
                sArr[i18] = (short) (((sArr3[i17] * i19) + ((i10 - i19) * sArr2[i16])) / i10);
                i18 += i11;
                i16 += i11;
                i17 += i11;
            }
        }
    }

    public final int a(short[] sArr, int i10, int i11, int i12) {
        int i13 = 1;
        int i14 = 255;
        int i15 = 0;
        int i16 = 0;
        while (i11 <= i12) {
            int iAbs = 0;
            for (int i17 = 0; i17 < i11; i17++) {
                int i18 = this.f7479b * i10;
                iAbs += Math.abs(sArr[i18 + i17] - sArr[(i18 + i11) + i17]);
            }
            int i19 = iAbs * i15;
            int i20 = i13 * i11;
            if (i19 < i20) {
                i13 = iAbs;
            }
            if (i19 < i20) {
                i15 = i11;
            }
            int i21 = iAbs * i14;
            int i22 = i16 * i11;
            if (i21 > i22) {
                i16 = iAbs;
            }
            if (i21 > i22) {
                i14 = i11;
            }
            i11++;
        }
        this.f7498u = i13 / i15;
        this.f7499v = i16 / i14;
        return i15;
    }

    public final void b(short[] sArr, int i10, int i11) {
        short[] sArrF = f(this.f7489l, this.f7490m, i11);
        this.f7489l = sArrF;
        int i12 = this.f7490m;
        int i13 = this.f7479b;
        System.arraycopy(sArr, i10 * i13, sArrF, i12 * i13, i11 * i13);
        this.f7490m += i11;
    }

    public final void c(short[] sArr, int i10, int i11) {
        int i12;
        for (int i13 = 0; i13 < this.f7485h / i11; i13++) {
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int i16 = this.f7479b;
                i12 = i16 * i11;
                if (i14 < i12) {
                    i15 += sArr[(i12 * i13) + (i16 * i10) + i14];
                    i14++;
                }
            }
            this.f7486i[i13] = (short) (i15 / i12);
        }
    }

    public final void e() {
        int i10;
        int i11;
        float f10;
        int iA;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        float f12 = this.f7480c;
        float f13 = this.f7481d;
        float f14 = f12 / f13;
        double d10 = f14;
        int i20 = this.f7478a;
        int i21 = this.f7479b;
        int i22 = 1;
        int i23 = this.f7490m;
        if (d10 > 1.00001d || d10 < 0.99999d) {
            int i24 = this.f7488k;
            int i25 = this.f7485h;
            if (i24 >= i25) {
                int i26 = 0;
                while (true) {
                    int i27 = this.f7495r;
                    if (i27 > 0) {
                        int iMin = Math.min(i25, i27);
                        b(this.f7487j, i26, iMin);
                        this.f7495r -= iMin;
                        i26 += iMin;
                        f10 = f13;
                        i11 = i23;
                        i10 = i20;
                    } else {
                        short[] sArr = this.f7487j;
                        int i28 = i20 > 4000 ? i20 / 4000 : 1;
                        int i29 = this.f7484g;
                        int i30 = this.f7483f;
                        if (i21 == i22 && i28 == i22) {
                            iA = a(sArr, i26, i30, i29);
                            f10 = f13;
                            i11 = i23;
                            i10 = i20;
                        } else {
                            c(sArr, i26, i28);
                            i10 = i20;
                            i11 = i23;
                            short[] sArr2 = this.f7486i;
                            f10 = f13;
                            int iA2 = a(sArr2, 0, i30 / i28, i29 / i28);
                            if (i28 != 1) {
                                int i31 = iA2 * i28;
                                int i32 = i28 * 4;
                                int i33 = i31 - i32;
                                if (i33 >= i30) {
                                    i30 = i33;
                                }
                                int i34 = i31 + i32;
                                if (i34 <= i29) {
                                    i29 = i34;
                                }
                                if (i21 == 1) {
                                    iA = a(sArr, i26, i30, i29);
                                } else {
                                    c(sArr, i26, 1);
                                    iA = a(sArr2, 0, i30, i29);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i35 = this.f7498u;
                        int i36 = this.f7499v;
                        if (i35 == 0 || (i12 = this.f7496s) == 0 || i36 > i35 * 3 || i35 + i35 <= this.f7497t * 3) {
                            i12 = iA;
                        }
                        int i37 = i26 + i12;
                        this.f7497t = i35;
                        this.f7496s = iA;
                        float f15 = i12;
                        if (d10 > 1.0d) {
                            short[] sArr3 = this.f7487j;
                            float f16 = (-1.0f) + f14;
                            if (f14 >= 2.0f) {
                                i14 = (int) (f15 / f16);
                            } else {
                                this.f7495r = (int) (((2.0f - f14) * f15) / f16);
                                i14 = i12;
                            }
                            short[] sArrF = f(this.f7489l, this.f7490m, i14);
                            this.f7489l = sArrF;
                            int i38 = i26;
                            d(i14, this.f7479b, sArrF, this.f7490m, sArr3, i38, sArr3, i37);
                            this.f7490m += i14;
                            i26 = i12 + i14 + i38;
                        } else {
                            int i39 = i26;
                            short[] sArr4 = this.f7487j;
                            float f17 = 1.0f - f14;
                            if (f14 < 0.5f) {
                                i13 = (int) ((f15 * f14) / f17);
                            } else {
                                this.f7495r = (int) ((((f14 + f14) - 1.0f) * f15) / f17);
                                i13 = i12;
                            }
                            int i40 = i12 + i13;
                            short[] sArrF2 = f(this.f7489l, this.f7490m, i40);
                            this.f7489l = sArrF2;
                            System.arraycopy(sArr4, i39 * i21, sArrF2, this.f7490m * i21, i12 * i21);
                            d(i13, this.f7479b, this.f7489l, this.f7490m + i12, sArr4, i37, sArr4, i39);
                            this.f7490m += i40;
                            i26 = i39 + i13;
                        }
                    }
                    if (i26 + i25 > i24) {
                        break;
                    }
                    i20 = i10;
                    i23 = i11;
                    f13 = f10;
                    i22 = 1;
                }
                int i41 = this.f7488k - i26;
                short[] sArr5 = this.f7487j;
                System.arraycopy(sArr5, i26 * i21, sArr5, 0, i41 * i21);
                this.f7488k = i41;
            }
            f11 = this.f7482e * f10;
            if (f11 != 1.0f || this.f7490m == (i15 = i11)) {
            }
            int i42 = i10;
            int i43 = (int) (i42 / f11);
            int i44 = i42;
            while (true) {
                if (i43 <= 16384 && i44 <= 16384) {
                    break;
                }
                i43 /= 2;
                i44 /= 2;
            }
            int i45 = this.f7490m - i15;
            short[] sArrF3 = f(this.f7491n, this.f7492o, i45);
            this.f7491n = sArrF3;
            System.arraycopy(this.f7489l, i15 * i21, sArrF3, this.f7492o * i21, i45 * i21);
            this.f7490m = i15;
            this.f7492o += i45;
            int i46 = 0;
            while (true) {
                i16 = this.f7492o;
                i17 = i16 - 1;
                if (i46 >= i17) {
                    break;
                }
                while (true) {
                    i18 = this.f7493p + 1;
                    int i47 = i18 * i43;
                    i19 = this.f7494q;
                    if (i47 <= i19 * i44) {
                        break;
                    }
                    this.f7489l = f(this.f7489l, this.f7490m, 1);
                    for (int i48 = 0; i48 < i21; i48++) {
                        short[] sArr6 = this.f7489l;
                        int i49 = this.f7490m * i21;
                        short[] sArr7 = this.f7491n;
                        int i50 = (i46 * i21) + i48;
                        short s9 = sArr7[i50];
                        short s10 = sArr7[i50 + i21];
                        int i51 = this.f7494q * i44;
                        int i52 = this.f7493p;
                        int i53 = i52 * i43;
                        int i54 = (i52 + 1) * i43;
                        int i55 = i54 - i51;
                        int i56 = i54 - i53;
                        sArr6[i49 + i48] = (short) ((((i56 - i55) * s10) + (s9 * i55)) / i56);
                    }
                    this.f7494q++;
                    this.f7490m++;
                }
                this.f7493p = i18;
                if (i18 == i44) {
                    this.f7493p = 0;
                    tc1.W(i19 == i43);
                    this.f7494q = 0;
                }
                i46++;
            }
            if (i17 != 0) {
                short[] sArr8 = this.f7491n;
                System.arraycopy(sArr8, i17 * i21, sArr8, 0, (i16 - i17) * i21);
                this.f7492o -= i17;
                return;
            }
            return;
        }
        b(this.f7487j, 0, this.f7488k);
        this.f7488k = 0;
        f10 = f13;
        i11 = i23;
        i10 = i20;
        f11 = this.f7482e * f10;
        if (f11 != 1.0f) {
        }
    }

    public final short[] f(short[] sArr, int i10, int i11) {
        int length = sArr.length;
        int i12 = this.f7479b;
        int i13 = length / i12;
        return i10 + i11 <= i13 ? sArr : Arrays.copyOf(sArr, (((i13 * 3) / 2) + i11) * i12);
    }
}
