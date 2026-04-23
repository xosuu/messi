package t5;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import m1.l1;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Cloneable {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final l1[] f16886r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String[] f16887s0;
    public short[] A;
    public short[] B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public short[] U;
    public short[] V;
    public short[] W;
    public k X;
    public k Y;
    public k Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f16888a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public short[] f16889a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16890b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public short[] f16891b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int[] f16892c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f16893d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f16894d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f16895e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16896f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public byte[] f16897f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public byte[] f16898g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16899h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f16900h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f16901i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f16902j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f16903k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f16904l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f16905m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f16906n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public short f16907o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f16908p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f16909q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public d f16910q0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16911s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f16912t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16913u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16914v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f16915w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f16916x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[] f16917y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f16918z;

    static {
        f16886r0 = new l1[]{new l1(0, 0, 0, 0, 0), new l1(4, 4, 8, 4, 1), new l1(i, 5, 16, 8, i), new l1(i, 6, 32, 32, i), new l1(i, 4, 16, 16, i), new l1(i, i, 32, 32, i), new l1(i, i, i, NotificationCompat.FLAG_HIGH_PRIORITY, i), new l1(i, 32, i, NotificationCompat.FLAG_LOCAL_ONLY, i), new l1(i, NotificationCompat.FLAG_HIGH_PRIORITY, i, 1024, i), new l1(i, 258, i, NotificationCompat.FLAG_BUBBLE, i)};
        int i10 = 4;
        int i11 = 1;
        int i12 = 2;
        int i13 = 8;
        int i14 = 16;
        int i15 = NotificationCompat.FLAG_HIGH_PRIORITY;
        int i16 = 32;
        int i17 = 258;
        f16887s0 = new String[]{"need dictionary", "stream end", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "file error", "stream error", "data error", "insufficient memory", "buffer error", "incompatible version", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED};
    }

    public static short[] d(short[] sArr) {
        int length = sArr.length;
        short[] sArr2 = new short[length];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        return sArr2;
    }

    public final boolean a(int i10, int i11) {
        byte[] bArr = this.f16893d;
        int i12 = this.f16902j0;
        int i13 = this.f16901i0;
        int i14 = (i13 * 2) + i12;
        bArr[i14] = (byte) (i10 >>> 8);
        bArr[i14 + 1] = (byte) i10;
        this.f16898g0[i13] = (byte) i11;
        int i15 = i13 + 1;
        this.f16901i0 = i15;
        if (i10 == 0) {
            short[] sArr = this.U;
            int i16 = i11 * 2;
            sArr[i16] = (short) (sArr[i16] + 1);
        } else {
            this.f16905m0++;
            int i17 = i10 - 1;
            short[] sArr2 = this.U;
            int i18 = (k.f17006i[i11] + 257) * 2;
            sArr2[i18] = (short) (sArr2[i18] + 1);
            short[] sArr3 = this.V;
            byte[] bArr2 = k.f17005h;
            int i19 = (i17 < 256 ? bArr2[i17] : bArr2[(i17 >>> 7) + NotificationCompat.FLAG_LOCAL_ONLY]) * 2;
            sArr3[i19] = (short) (sArr3[i19] + 1);
        }
        if ((i15 & 8191) == 0 && this.Q > 2) {
            int i20 = i15 * 8;
            int i21 = this.K - this.G;
            for (int i22 = 0; i22 < 30; i22++) {
                i20 = (int) (((((long) k.f17002e[i22]) + 5) * ((long) this.V[i22 * 2])) + ((long) i20));
            }
            int i23 = i20 >>> 3;
            if (this.f16905m0 < this.f16901i0 / 2 && i23 < i21 / 2) {
                return true;
            }
        }
        return this.f16901i0 == this.f16900h0 - 1;
    }

    public final void b() {
        int i10 = this.f16908p0;
        if (i10 == 16) {
            l(this.f16907o0);
            this.f16907o0 = (short) 0;
            this.f16908p0 = 0;
        } else if (i10 >= 8) {
            j((byte) this.f16907o0);
            this.f16907o0 = (short) (this.f16907o0 >>> 8);
            this.f16908p0 -= 8;
        }
    }

    public final void c(short[] sArr, short[] sArr2) {
        if (this.f16901i0 != 0) {
            int i10 = 0;
            do {
                byte[] bArr = this.f16893d;
                int i11 = (i10 * 2) + this.f16902j0;
                int i12 = (bArr[i11 + 1] & 255) | ((bArr[i11] << 8) & 65280);
                int i13 = this.f16898g0[i10] & 255;
                i10++;
                if (i12 == 0) {
                    o(i13, sArr);
                } else {
                    byte b10 = k.f17006i[i13];
                    o(b10 + 257, sArr);
                    int i14 = k.f17001d[b10];
                    if (i14 != 0) {
                        n(i13 - k.f17007j[b10], i14);
                    }
                    int i15 = i12 - 1;
                    byte[] bArr2 = k.f17005h;
                    byte b11 = i15 < 256 ? bArr2[i15] : bArr2[(i15 >>> 7) + NotificationCompat.FLAG_LOCAL_ONLY];
                    o(b11, sArr2);
                    int i16 = k.f17002e[b11];
                    if (i16 != 0) {
                        n(i15 - k.f17008k[b11], i16);
                    }
                }
            } while (i10 < this.f16901i0);
        }
        o(NotificationCompat.FLAG_LOCAL_ONLY, sArr);
        this.f16906n0 = sArr[513];
    }

    public final Object clone() {
        c cVar = (c) super.clone();
        byte[] bArr = cVar.f16893d;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        cVar.f16893d = bArr2;
        cVar.f16902j0 = cVar.f16902j0;
        byte[] bArr3 = cVar.f16898g0;
        int length2 = bArr3.length;
        byte[] bArr4 = new byte[length2];
        System.arraycopy(bArr3, 0, bArr4, 0, length2);
        cVar.f16898g0 = bArr4;
        byte[] bArr5 = cVar.f16917y;
        int length3 = bArr5.length;
        byte[] bArr6 = new byte[length3];
        System.arraycopy(bArr5, 0, bArr6, 0, length3);
        cVar.f16917y = bArr6;
        cVar.A = d(cVar.A);
        cVar.B = d(cVar.B);
        cVar.U = d(cVar.U);
        cVar.V = d(cVar.V);
        cVar.W = d(cVar.W);
        cVar.f16889a0 = d(cVar.f16889a0);
        cVar.f16891b0 = d(cVar.f16891b0);
        int[] iArr = cVar.f16892c0;
        int length4 = iArr.length;
        int[] iArr2 = new int[length4];
        System.arraycopy(iArr, 0, iArr2, 0, length4);
        cVar.f16892c0 = iArr2;
        byte[] bArr7 = cVar.f16897f0;
        int length5 = bArr7.length;
        byte[] bArr8 = new byte[length5];
        System.arraycopy(bArr7, 0, bArr8, 0, length5);
        cVar.f16897f0 = bArr8;
        cVar.X.f17009a = cVar.U;
        cVar.Y.f17009a = cVar.V;
        cVar.Z.f17009a = cVar.W;
        d dVar = cVar.f16910q0;
        if (dVar != null) {
            cVar.f16910q0 = (d) dVar.clone();
        }
        return cVar;
    }

    public final void e() {
        int i10;
        int i11;
        l lVar;
        do {
            int i12 = this.f16918z;
            int i13 = this.M;
            int i14 = this.K;
            int i15 = (i12 - i13) - i14;
            int i16 = 0;
            if (i15 == 0 && i14 == 0 && i13 == 0) {
                i15 = this.f16914v;
            } else if (i15 == -1) {
                i15--;
            } else {
                int i17 = this.f16914v;
                if (i14 >= (i17 + i17) - 262) {
                    byte[] bArr = this.f16917y;
                    System.arraycopy(bArr, i17, bArr, 0, i17);
                    int i18 = this.L;
                    int i19 = this.f16914v;
                    this.L = i18 - i19;
                    this.K -= i19;
                    this.G -= i19;
                    int i20 = this.D;
                    int i21 = i20;
                    do {
                        short[] sArr = this.B;
                        i20--;
                        int i22 = sArr[i20] & 65535;
                        i10 = this.f16914v;
                        sArr[i20] = i22 >= i10 ? (short) (i22 - i10) : (short) 0;
                        i21--;
                    } while (i21 != 0);
                    int i23 = i10;
                    do {
                        short[] sArr2 = this.A;
                        i10--;
                        int i24 = sArr2[i10] & 65535;
                        i11 = this.f16914v;
                        sArr2[i10] = i24 >= i11 ? (short) (i24 - i11) : (short) 0;
                        i23--;
                    } while (i23 != 0);
                    i15 += i11;
                }
            }
            lVar = this.f16888a;
            int i25 = lVar.f17014c;
            if (i25 == 0) {
                return;
            }
            byte[] bArr2 = this.f16917y;
            int i26 = this.K + this.M;
            if (i25 <= i15) {
                i15 = i25;
            }
            if (i15 != 0) {
                lVar.f17014c = i25 - i15;
                if (lVar.f17020i.f16911s != 0) {
                    lVar.f17022k.update(lVar.f17012a, lVar.f17013b, i15);
                }
                System.arraycopy(lVar.f17012a, lVar.f17013b, bArr2, i26, i15);
                lVar.f17013b += i15;
                i16 = i15;
            }
            int i27 = this.M + i16;
            this.M = i27;
            if (i27 >= 3) {
                byte[] bArr3 = this.f16917y;
                int i28 = this.K;
                this.C = ((bArr3[i28 + 1] & 255) ^ ((bArr3[i28] & 255) << this.F)) & this.E;
            }
            if (i27 >= 262) {
                return;
            }
        } while (lVar.f17014c != 0);
    }

    public final void f(boolean z9) {
        int i10;
        int i11;
        int i12;
        int i13 = this.G;
        int i14 = i13 >= 0 ? i13 : -1;
        int i15 = this.K - i13;
        int i16 = this.Q;
        byte[] bArr = k.f17004g;
        k kVar = this.Y;
        k kVar2 = this.X;
        if (i16 > 0) {
            if (this.f16912t == 2) {
                int i17 = 0;
                int i18 = 0;
                while (i17 < 7) {
                    i18 += this.U[i17 * 2];
                    i17++;
                }
                int i19 = 0;
                while (i17 < 128) {
                    i19 += this.U[i17 * 2];
                    i17++;
                }
                while (i17 < 256) {
                    i18 += this.U[i17 * 2];
                    i17++;
                }
                this.f16912t = (byte) (i18 > (i19 >>> 2) ? 0 : 1);
            }
            kVar2.a(this);
            kVar.a(this);
            m(kVar2.f17010b, this.U);
            m(kVar.f17010b, this.V);
            this.Z.a(this);
            i12 = 18;
            while (i12 >= 3 && this.W[(bArr[i12] * 2) + 1] == 0) {
                i12--;
            }
            int i20 = ((i12 + 1) * 3) + 14 + this.f16903k0;
            this.f16903k0 = i20;
            i10 = (i20 + 10) >>> 3;
            i11 = (this.f16904l0 + 10) >>> 3;
            if (i11 <= i10) {
                i10 = i11;
            }
        } else {
            i10 = i15 + 5;
            i11 = i10;
            i12 = 0;
        }
        if (i15 + 4 <= i10 && i14 != -1) {
            n(z9 ? 1 : 0, 3);
            int i21 = this.f16908p0;
            if (i21 > 8) {
                l(this.f16907o0);
            } else if (i21 > 0) {
                j((byte) this.f16907o0);
            }
            this.f16907o0 = (short) 0;
            this.f16908p0 = 0;
            this.f16906n0 = 8;
            l((short) i15);
            l((short) (~i15));
            k(i14, this.f16917y, i15);
        } else if (i11 == i10) {
            n((z9 ? 1 : 0) + 2, 3);
            c(j.f16991f, j.f16992g);
        } else {
            n((z9 ? 1 : 0) + 4, 3);
            int i22 = kVar2.f17010b;
            int i23 = kVar.f17010b;
            int i24 = i12 + 1;
            n(i22 - 256, 5);
            n(i23, 5);
            n(i12 - 3, 4);
            for (int i25 = 0; i25 < i24; i25++) {
                n(this.W[(bArr[i25] * 2) + 1], 3);
            }
            p(i22, this.U);
            p(i23, this.V);
            c(this.U, this.V);
        }
        g();
        if (z9) {
            int i26 = this.f16908p0;
            if (i26 > 8) {
                l(this.f16907o0);
            } else if (i26 > 0) {
                j((byte) this.f16907o0);
            }
            this.f16907o0 = (short) 0;
            this.f16908p0 = 0;
        }
        this.G = this.K;
        this.f16888a.a();
    }

    public final void g() {
        for (int i10 = 0; i10 < 286; i10++) {
            this.U[i10 * 2] = 0;
        }
        for (int i11 = 0; i11 < 30; i11++) {
            this.V[i11 * 2] = 0;
        }
        for (int i12 = 0; i12 < 19; i12++) {
            this.W[i12 * 2] = 0;
        }
        this.U[512] = 1;
        this.f16904l0 = 0;
        this.f16903k0 = 0;
        this.f16905m0 = 0;
        this.f16901i0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b6, code lost:
    
        r14 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int h(int r19) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.c.h(int):int");
    }

    public final void i(int i10, short[] sArr) {
        int i11 = this.f16892c0[i10];
        int i12 = i10 << 1;
        while (true) {
            int i13 = this.f16894d0;
            if (i12 > i13) {
                break;
            }
            if (i12 < i13) {
                int[] iArr = this.f16892c0;
                int i14 = i12 + 1;
                int i15 = iArr[i14];
                int i16 = iArr[i12];
                byte[] bArr = this.f16897f0;
                short s9 = sArr[i15 * 2];
                short s10 = sArr[i16 * 2];
                if (s9 < s10 || (s9 == s10 && bArr[i15] <= bArr[i16])) {
                    i12 = i14;
                }
            }
            int[] iArr2 = this.f16892c0;
            int i17 = iArr2[i12];
            byte[] bArr2 = this.f16897f0;
            short s11 = sArr[i11 * 2];
            short s12 = sArr[i17 * 2];
            if (s11 < s12 || (s11 == s12 && bArr2[i11] <= bArr2[i17])) {
                break;
            }
            iArr2[i10] = i17;
            int i18 = i12;
            i12 <<= 1;
            i10 = i18;
        }
        this.f16892c0[i10] = i11;
    }

    public final void j(byte b10) {
        byte[] bArr = this.f16893d;
        int i10 = this.f16909q;
        this.f16909q = i10 + 1;
        bArr[i10] = b10;
    }

    public final void k(int i10, byte[] bArr, int i11) {
        System.arraycopy(bArr, i10, this.f16893d, this.f16909q, i11);
        this.f16909q += i11;
    }

    public final void l(int i10) {
        j((byte) i10);
        j((byte) (i10 >>> 8));
    }

    public final void m(int i10, short[] sArr) {
        int i11;
        int i12;
        short s9 = sArr[1];
        if (s9 == 0) {
            i11 = 138;
            i12 = 3;
        } else {
            i11 = 7;
            i12 = 4;
        }
        short s10 = -1;
        sArr[((i10 + 1) * 2) + 1] = -1;
        int i13 = 0;
        int i14 = 0;
        while (i13 <= i10) {
            i13++;
            short s11 = sArr[(i13 * 2) + 1];
            i14++;
            if (i14 >= i11 || s9 != s11) {
                if (i14 < i12) {
                    short[] sArr2 = this.W;
                    int i15 = s9 * 2;
                    sArr2[i15] = (short) (sArr2[i15] + i14);
                } else if (s9 != 0) {
                    if (s9 != s10) {
                        short[] sArr3 = this.W;
                        int i16 = s9 * 2;
                        sArr3[i16] = (short) (sArr3[i16] + 1);
                    }
                    short[] sArr4 = this.W;
                    sArr4[32] = (short) (sArr4[32] + 1);
                } else if (i14 <= 10) {
                    short[] sArr5 = this.W;
                    sArr5[34] = (short) (sArr5[34] + 1);
                } else {
                    short[] sArr6 = this.W;
                    sArr6[36] = (short) (sArr6[36] + 1);
                }
                if (s11 == 0) {
                    s10 = s9;
                    i11 = 138;
                } else if (s9 == s11) {
                    i11 = 6;
                    s10 = s9;
                } else {
                    s10 = s9;
                    i11 = 7;
                    i12 = 4;
                    i14 = 0;
                }
                i12 = 3;
                i14 = 0;
            }
            s9 = s11;
        }
    }

    public final void n(int i10, int i11) {
        int i12 = this.f16908p0;
        if (i12 <= 16 - i11) {
            this.f16907o0 = (short) (((i10 << i12) & 65535) | this.f16907o0);
            this.f16908p0 = i12 + i11;
            return;
        }
        short s9 = (short) (((i10 << i12) & 65535) | this.f16907o0);
        this.f16907o0 = s9;
        l(s9);
        int i13 = this.f16908p0;
        this.f16907o0 = (short) (i10 >>> (16 - i13));
        this.f16908p0 = (i11 - 16) + i13;
    }

    public final void o(int i10, short[] sArr) {
        int i11 = i10 * 2;
        n(sArr[i11] & 65535, sArr[i11 + 1] & 65535);
    }

    public final void p(int i10, short[] sArr) {
        int i11;
        int i12;
        int i13 = 1;
        short s9 = sArr[1];
        if (s9 == 0) {
            i11 = 138;
            i12 = 3;
        } else {
            i11 = 7;
            i12 = 4;
        }
        int i14 = 0;
        int i15 = 0;
        short s10 = -1;
        while (i14 <= i10) {
            i14++;
            short s11 = sArr[(i14 * 2) + i13];
            int i16 = i15 + 1;
            if (i16 >= i11 || s9 != s11) {
                if (i16 < i12) {
                    do {
                        o(s9, this.W);
                        i16--;
                    } while (i16 != 0);
                } else if (s9 != 0) {
                    if (s9 != s10) {
                        o(s9, this.W);
                    } else {
                        i15 = i16;
                    }
                    o(16, this.W);
                    n(i15 - 3, 2);
                } else if (i16 <= 10) {
                    o(17, this.W);
                    n(i15 - 2, 3);
                } else {
                    o(18, this.W);
                    n(i15 - 10, 7);
                }
                if (s11 == 0) {
                    s10 = s9;
                    i11 = 138;
                } else if (s9 == s11) {
                    s10 = s9;
                    i11 = 6;
                } else {
                    s10 = s9;
                    i11 = 7;
                    i12 = 4;
                    i15 = 0;
                }
                i12 = 3;
                i15 = 0;
            } else {
                i15 = i16;
            }
            s9 = s11;
            i13 = 1;
        }
    }
}
