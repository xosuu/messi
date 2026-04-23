package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class h2 implements g0 {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f5131e0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f5132f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final byte[] f5133g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f5134h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final UUID f5135i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final Map f5136j0;
    public boolean A;
    public long B;
    public long C;
    public long D;
    public gp0 E;
    public gp0 F;
    public boolean G;
    public boolean H;
    public int I;
    public long J;
    public long K;
    public int L;
    public int M;
    public int[] N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public long T;
    public int U;
    public int V;
    public int W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f5137a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f5138a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2 f5139b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public byte f5140b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f5141c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f5142c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5143d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public i0 f5144d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a4 f5146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ik0 f5147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ik0 f5148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ik0 f5149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ik0 f5150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ik0 f5151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ik0 f5152l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ik0 f5153m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ik0 f5154n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ik0 f5155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ik0 f5156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ByteBuffer f5157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f5158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f5160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f5161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f5162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public g2 f5163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5165y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5166z;

    static {
        int i10 = yn0.f10944a;
        f5132f0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(fx0.f4681c);
        f5133g0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f5134h0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f5135i0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        g1.a.t(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        g1.a.t(180, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f5136j0 = Collections.unmodifiableMap(map);
    }

    public h2() {
        this(new e2(), 2, a4.f2573j);
    }

    public static byte[] q(long j10, String str, long j11) {
        tc1.K(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        int i13 = yn0.f10944a;
        return str2.getBytes(fx0.f4681c);
    }

    public final void a(int i10, int i11, h0 h0Var) throws zzbo {
        long j10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i10;
        h0 h0Var2 = h0Var;
        SparseArray sparseArray = this.f5141c;
        int i17 = 1;
        int i18 = 0;
        if (i16 != 161 && i16 != 163) {
            if (i16 == 165) {
                if (this.I != 2) {
                    return;
                }
                g2 g2Var = (g2) sparseArray.get(this.O);
                if (this.R != 4 || !"V_VP9".equals(g2Var.f4771b)) {
                    ((a0) h0Var2).j(i11);
                    return;
                }
                ik0 ik0Var = this.f5156p;
                ik0Var.f(i11);
                ((a0) h0Var2).h(ik0Var.f5633a, 0, i11, false);
                return;
            }
            if (i16 == 16877) {
                l(i10);
                g2 g2Var2 = this.f5163w;
                int i19 = g2Var2.f4776g;
                if (i19 != 1685485123 && i19 != 1685480259) {
                    ((a0) h0Var2).j(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                g2Var2.O = bArr;
                ((a0) h0Var2).h(bArr, 0, i11, false);
                return;
            }
            if (i16 == 16981) {
                l(i10);
                byte[] bArr2 = new byte[i11];
                this.f5163w.f4778i = bArr2;
                ((a0) h0Var2).h(bArr2, 0, i11, false);
                return;
            }
            if (i16 == 18402) {
                byte[] bArr3 = new byte[i11];
                ((a0) h0Var2).h(bArr3, 0, i11, false);
                l(i10);
                this.f5163w.f4779j = new a1(1, 0, 0, bArr3);
                return;
            }
            if (i16 == 21419) {
                ik0 ik0Var2 = this.f5151k;
                Arrays.fill(ik0Var2.f5633a, (byte) 0);
                ((a0) h0Var2).h(ik0Var2.f5633a, 4 - i11, i11, false);
                ik0Var2.i(0);
                this.f5165y = (int) ik0Var2.D();
                return;
            }
            if (i16 == 25506) {
                l(i10);
                byte[] bArr4 = new byte[i11];
                this.f5163w.f4780k = bArr4;
                ((a0) h0Var2).h(bArr4, 0, i11, false);
                return;
            }
            if (i16 != 30322) {
                throw zzbo.a("Unexpected id: " + i16, null);
            }
            l(i10);
            byte[] bArr5 = new byte[i11];
            this.f5163w.f4792w = bArr5;
            ((a0) h0Var2).h(bArr5, 0, i11, false);
            return;
        }
        int i20 = this.I;
        int i21 = 8;
        ik0 ik0Var3 = this.f5149i;
        if (i20 == 0) {
            i2 i2Var = this.f5139b;
            this.O = (int) i2Var.l(h0Var2, false, true, 8);
            this.P = i2Var.f5460c;
            this.K = -9223372036854775807L;
            this.I = 1;
            ik0Var3.f(0);
        }
        g2 g2Var3 = (g2) sparseArray.get(this.O);
        if (g2Var3 == null) {
            ((a0) h0Var2).j(i11 - this.P);
            this.I = 0;
            return;
        }
        g2Var3.Y.getClass();
        if (this.I == 1) {
            n(h0Var2, 3);
            int i22 = (ik0Var3.f5633a[2] & 6) >> 1;
            if (i22 == 0) {
                this.M = 1;
                int[] iArr = this.N;
                if (iArr == null) {
                    iArr = new int[1];
                } else {
                    int length = iArr.length;
                    if (length < 1) {
                        iArr = new int[Math.max(length + length, 1)];
                    }
                }
                this.N = iArr;
                iArr[0] = (i11 - this.P) - 3;
            } else {
                n(h0Var2, 4);
                int i23 = (ik0Var3.f5633a[3] & 255) + 1;
                this.M = i23;
                int[] iArr2 = this.N;
                if (iArr2 == null) {
                    iArr2 = new int[i23];
                } else {
                    int length2 = iArr2.length;
                    if (length2 < i23) {
                        iArr2 = new int[Math.max(length2 + length2, i23)];
                    }
                }
                this.N = iArr2;
                if (i22 == 2) {
                    int i24 = (i11 - this.P) - 4;
                    int i25 = this.M;
                    Arrays.fill(iArr2, 0, i25, i24 / i25);
                } else {
                    if (i22 != 1) {
                        if (i22 != 3) {
                            throw zzbo.a("Unexpected lacing value: 2", null);
                        }
                        int i26 = 0;
                        int i27 = 4;
                        int i28 = 0;
                        while (true) {
                            int i29 = this.M - 1;
                            if (i26 >= i29) {
                                this.N[i29] = ((i11 - this.P) - i27) - i28;
                                break;
                            }
                            this.N[i26] = i18;
                            int i30 = i27 + 1;
                            n(h0Var2, i30);
                            if (ik0Var3.f5633a[i27] == 0) {
                                throw zzbo.a("No valid varint length mask found", null);
                            }
                            int i31 = 0;
                            while (true) {
                                if (i31 >= i21) {
                                    j10 = 0;
                                    i27 = i30;
                                    break;
                                }
                                int i32 = i17 << (7 - i31);
                                if ((ik0Var3.f5633a[i27] & i32) != 0) {
                                    int i33 = i30 + i31;
                                    n(h0Var2, i33);
                                    j10 = ik0Var3.f5633a[i27] & 255 & (~i32);
                                    while (i30 < i33) {
                                        j10 = (j10 << i21) | ((long) (ik0Var3.f5633a[i30] & 255));
                                        i30++;
                                        i33 = i33;
                                        i21 = 8;
                                    }
                                    int i34 = i33;
                                    if (i26 > 0) {
                                        j10 -= (1 << ((i31 * 7) + 6)) - 1;
                                    }
                                    i27 = i34;
                                } else {
                                    i31++;
                                    h0Var2 = h0Var;
                                    i17 = 1;
                                    i21 = 8;
                                }
                            }
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                break;
                            }
                            int[] iArr3 = this.N;
                            int i35 = (int) j10;
                            if (i26 != 0) {
                                i35 += iArr3[i26 - 1];
                            }
                            iArr3[i26] = i35;
                            i28 += i35;
                            i26++;
                            h0Var2 = h0Var;
                            i17 = 1;
                            i18 = 0;
                            i21 = 8;
                        }
                        throw zzbo.a("EBML lacing sample size out of range.", null);
                    }
                    int i36 = 0;
                    int i37 = 4;
                    int i38 = 0;
                    while (true) {
                        i12 = this.M - 1;
                        if (i36 >= i12) {
                            break;
                        }
                        this.N[i36] = 0;
                        while (true) {
                            i13 = i37 + 1;
                            n(h0Var2, i13);
                            int i39 = ik0Var3.f5633a[i37] & 255;
                            int[] iArr4 = this.N;
                            i14 = iArr4[i36] + i39;
                            iArr4[i36] = i14;
                            if (i39 != 255) {
                                break;
                            } else {
                                i37 = i13;
                            }
                        }
                        i38 += i14;
                        i36++;
                        i37 = i13;
                    }
                    this.N[i12] = ((i11 - this.P) - i37) - i38;
                }
            }
            byte[] bArr6 = ik0Var3.f5633a;
            int i40 = bArr6[0] << 8;
            int i41 = bArr6[1] & 255;
            this.J = j(i41 | i40) + this.D;
            if (g2Var3.f4773d == 2) {
                i15 = 1;
                this.Q = i15;
                this.I = 2;
                this.L = 0;
            } else {
                if (i16 == 163) {
                    if ((ik0Var3.f5633a[2] & 128) == 128) {
                        i16 = 163;
                        i15 = 1;
                        this.Q = i15;
                        this.I = 2;
                        this.L = 0;
                    } else {
                        i16 = 163;
                    }
                }
                i15 = 0;
                this.Q = i15;
                this.I = 2;
                this.L = 0;
            }
        }
        if (i16 == 163) {
            while (true) {
                int i42 = this.L;
                if (i42 >= this.M) {
                    this.I = 0;
                    return;
                }
                m(g2Var3, ((long) ((this.L * g2Var3.f4774e) / 1000)) + this.J, this.Q, i(h0Var, g2Var3, this.N[i42], false), 0);
                this.L++;
            }
        } else {
            while (true) {
                int i43 = this.L;
                if (i43 >= this.M) {
                    return;
                }
                int[] iArr5 = this.N;
                iArr5[i43] = i(h0Var, g2Var3, iArr5[i43], true);
                this.L++;
            }
        }
    }

    public final void b(int i10, double d10) throws zzbo {
        if (i10 == 181) {
            l(i10);
            this.f5163w.R = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f5161u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                l(i10);
                this.f5163w.E = (float) d10;
                break;
            case 21970:
                l(i10);
                this.f5163w.F = (float) d10;
                break;
            case 21971:
                l(i10);
                this.f5163w.G = (float) d10;
                break;
            case 21972:
                l(i10);
                this.f5163w.H = (float) d10;
                break;
            case 21973:
                l(i10);
                this.f5163w.I = (float) d10;
                break;
            case 21974:
                l(i10);
                this.f5163w.J = (float) d10;
                break;
            case 21975:
                l(i10);
                this.f5163w.K = (float) d10;
                break;
            case 21976:
                l(i10);
                this.f5163w.L = (float) d10;
                break;
            case 21977:
                l(i10);
                this.f5163w.M = (float) d10;
                break;
            case 21978:
                l(i10);
                this.f5163w.N = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        l(i10);
                        this.f5163w.f4789t = (float) d10;
                        break;
                    case 30324:
                        l(i10);
                        this.f5163w.f4790u = (float) d10;
                        break;
                    case 30325:
                        l(i10);
                        this.f5163w.f4791v = (float) d10;
                        break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        this.D = -9223372036854775807L;
        this.I = 0;
        e2 e2Var = this.f5137a;
        e2Var.f3814e = 0;
        e2Var.f3811b.clear();
        i2 i2Var = e2Var.f3812c;
        i2Var.f5459b = 0;
        i2Var.f5460c = 0;
        i2 i2Var2 = this.f5139b;
        i2Var2.f5459b = 0;
        i2Var2.f5460c = 0;
        o();
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f5141c;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c1 c1Var = ((g2) sparseArray.valueAt(i10)).U;
            if (c1Var != null) {
                c1Var.f3151b = false;
                c1Var.f3152c = 0;
            }
            i10++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0b35, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x0b90, code lost:
    
        r9 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x0d15, code lost:
    
        r3 = r30.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x0d1b, code lost:
    
        if (r2.A == false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x0d1d, code lost:
    
        r2.C = r3;
        r31.f6130a = r2.B;
        r2.A = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:715:0x0d27, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x0d2d, code lost:
    
        if (r2.f5164x == false) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x0d2f, code lost:
    
        r3 = r2.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x0d35, code lost:
    
        if (r3 == (-1)) goto L762;
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x0d37, code lost:
    
        r31.f6130a = r3;
        r2.C = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x0d3d, code lost:
    
        r0 = r2;
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:329:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0851  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0869  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x087e  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0a64  */
    /* JADX WARN: Removed duplicated region for block: B:660:0x0bf1 A[LOOP:1: B:6:0x0014->B:660:0x0bf1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:764:0x0c03 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0c41 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0c4c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0c6b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:768:0x0d02 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d8  */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.google.android.gms.internal.ads.a0] */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.google.android.gms.internal.ads.g2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v68 */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r30, com.google.android.gms.internal.ads.k0 r31) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 4200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h2.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f5144d0 = i0Var;
        if (this.f5145e) {
            i0Var = new ur0(i0Var, this.f5146f);
        }
        this.f5144d0 = i0Var;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        gp0 gp0Var = new gp0(4);
        long jZzd = h0Var.zzd();
        long j10 = 1024;
        if (jZzd != -1 && jZzd <= 1024) {
            j10 = jZzd;
        }
        a0 a0Var = (a0) h0Var;
        a0Var.m(((ik0) gp0Var.f5026d).f5633a, 0, 4, false);
        gp0Var.f5025b = 4;
        for (long jD = ((ik0) gp0Var.f5026d).D(); jD != 440786851; jD = ((jD << 8) & (-256)) | ((long) (((ik0) gp0Var.f5026d).f5633a[0] & 255))) {
            int i10 = (int) j10;
            int i11 = gp0Var.f5025b + 1;
            gp0Var.f5025b = i11;
            if (i11 == i10) {
                return false;
            }
            a0Var.m(((ik0) gp0Var.f5026d).f5633a, 0, 1, false);
        }
        long jU = gp0Var.u(h0Var);
        long j11 = gp0Var.f5025b;
        if (jU == Long.MIN_VALUE) {
            return false;
        }
        long j12 = j11 + jU;
        if (jZzd != -1 && j12 >= jZzd) {
            return false;
        }
        while (true) {
            long j13 = gp0Var.f5025b;
            if (j13 >= j12) {
                return j13 == j12;
            }
            if (gp0Var.u(h0Var) == Long.MIN_VALUE) {
                return false;
            }
            long jU2 = gp0Var.u(h0Var);
            if (jU2 < 0) {
                return false;
            }
            if (jU2 != 0) {
                int i12 = (int) jU2;
                a0Var.i(i12, false);
                gp0Var.f5025b += i12;
            }
        }
    }

    public final void g(int i10, long j10) throws zzbo {
        boolean z9;
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw zzbo.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw zzbo.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                l(i10);
                this.f5163w.f4773d = (int) j10;
                return;
            case 136:
                z9 = j10 == 1;
                l(i10);
                this.f5163w.W = z9;
                return;
            case 155:
                this.K = j(j10);
                return;
            case 159:
                l(i10);
                this.f5163w.P = (int) j10;
                return;
            case 176:
                l(i10);
                this.f5163w.f4782m = (int) j10;
                return;
            case 179:
                k(i10);
                this.E.w(j(j10));
                return;
            case 186:
                l(i10);
                this.f5163w.f4783n = (int) j10;
                return;
            case 215:
                l(i10);
                this.f5163w.f4772c = (int) j10;
                return;
            case 231:
                this.D = j(j10);
                return;
            case 238:
                this.R = (int) j10;
                return;
            case 241:
                if (this.G) {
                    return;
                }
                k(i10);
                this.F.w(j10);
                this.G = true;
                return;
            case 251:
                this.S = true;
                return;
            case 16871:
                l(i10);
                this.f5163w.f4776g = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw zzbo.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw zzbo.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw zzbo.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw zzbo.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw zzbo.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f5166z = j10 + this.f5159s;
                return;
            case 21432:
                int i11 = (int) j10;
                l(i10);
                if (i11 == 0) {
                    this.f5163w.f4793x = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f5163w.f4793x = 2;
                    return;
                } else if (i11 == 3) {
                    this.f5163w.f4793x = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f5163w.f4793x = 3;
                    return;
                }
            case 21680:
                l(i10);
                this.f5163w.f4785p = (int) j10;
                return;
            case 21682:
                l(i10);
                this.f5163w.f4787r = (int) j10;
                return;
            case 21690:
                l(i10);
                this.f5163w.f4786q = (int) j10;
                return;
            case 21930:
                z9 = j10 == 1;
                l(i10);
                this.f5163w.V = z9;
                return;
            case 21938:
                l(i10);
                g2 g2Var = this.f5163w;
                g2Var.f4794y = true;
                g2Var.f4784o = (int) j10;
                return;
            case 21998:
                l(i10);
                this.f5163w.f4775f = (int) j10;
                return;
            case 22186:
                l(i10);
                this.f5163w.S = j10;
                return;
            case 22203:
                l(i10);
                this.f5163w.T = j10;
                return;
            case 25188:
                l(i10);
                this.f5163w.Q = (int) j10;
                return;
            case 30114:
                this.T = j10;
                return;
            case 30321:
                int i12 = (int) j10;
                l(i10);
                if (i12 == 0) {
                    this.f5163w.f4788s = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f5163w.f4788s = 1;
                    return;
                } else if (i12 == 2) {
                    this.f5163w.f4788s = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f5163w.f4788s = 3;
                    return;
                }
            case 2352003:
                l(i10);
                this.f5163w.f4774e = (int) j10;
                return;
            case 2807729:
                this.f5160t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i13 = (int) j10;
                        l(i10);
                        if (i13 == 1) {
                            this.f5163w.B = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f5163w.B = 1;
                            return;
                        }
                    case 21946:
                        l(i10);
                        int iB = wk1.b((int) j10);
                        if (iB != -1) {
                            this.f5163w.A = iB;
                            return;
                        }
                        return;
                    case 21947:
                        l(i10);
                        this.f5163w.f4794y = true;
                        int iA = wk1.a((int) j10);
                        if (iA != -1) {
                            this.f5163w.f4795z = iA;
                            return;
                        }
                        return;
                    case 21948:
                        l(i10);
                        this.f5163w.C = (int) j10;
                        return;
                    case 21949:
                        l(i10);
                        this.f5163w.D = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void h(long j10, long j11, int i10) throws zzbo {
        tc1.A(this.f5144d0);
        if (i10 == 160) {
            this.S = false;
            this.T = 0L;
            return;
        }
        if (i10 != 174) {
            if (i10 == 187) {
                this.G = false;
                return;
            }
            if (i10 == 19899) {
                this.f5165y = -1;
                this.f5166z = -1L;
                return;
            }
            if (i10 == 20533) {
                l(i10);
                this.f5163w.f4777h = true;
                return;
            }
            if (i10 == 21968) {
                l(i10);
                this.f5163w.f4794y = true;
                return;
            }
            if (i10 == 408125543) {
                long j12 = this.f5159s;
                if (j12 != -1 && j12 != j10) {
                    throw zzbo.a("Multiple Segment elements not supported", null);
                }
                this.f5159s = j10;
                this.f5158r = j11;
                return;
            }
            if (i10 == 475249515) {
                this.E = new gp0(32, 6);
                this.F = new gp0(32, 6);
                return;
            } else {
                if (i10 == 524531317 && !this.f5164x) {
                    if (this.f5143d && this.B != -1) {
                        this.A = true;
                        return;
                    } else {
                        this.f5144d0.p(new l0(this.f5162v, 0L));
                        this.f5164x = true;
                        return;
                    }
                }
                return;
            }
        }
        g2 g2Var = new g2();
        g2Var.f4782m = -1;
        g2Var.f4783n = -1;
        g2Var.f4784o = -1;
        g2Var.f4785p = -1;
        g2Var.f4786q = -1;
        g2Var.f4787r = 0;
        g2Var.f4788s = -1;
        g2Var.f4789t = 0.0f;
        g2Var.f4790u = 0.0f;
        g2Var.f4791v = 0.0f;
        g2Var.f4792w = null;
        g2Var.f4793x = -1;
        g2Var.f4794y = false;
        g2Var.f4795z = -1;
        g2Var.A = -1;
        g2Var.B = -1;
        g2Var.C = 1000;
        g2Var.D = 200;
        g2Var.E = -1.0f;
        g2Var.F = -1.0f;
        g2Var.G = -1.0f;
        g2Var.H = -1.0f;
        g2Var.I = -1.0f;
        g2Var.J = -1.0f;
        g2Var.K = -1.0f;
        g2Var.L = -1.0f;
        g2Var.M = -1.0f;
        g2Var.N = -1.0f;
        g2Var.P = 1;
        g2Var.Q = -1;
        g2Var.R = 8000;
        g2Var.S = 0L;
        g2Var.T = 0L;
        g2Var.W = true;
        g2Var.X = "eng";
        this.f5163w = g2Var;
    }

    public final int i(h0 h0Var, g2 g2Var, int i10, boolean z9) throws zzbo {
        int iD;
        int iD2;
        int i11;
        if ("S_TEXT/UTF8".equals(g2Var.f4771b)) {
            p(h0Var, f5131e0, i10);
            int i12 = this.V;
            o();
            return i12;
        }
        if ("S_TEXT/ASS".equals(g2Var.f4771b)) {
            p(h0Var, f5133g0, i10);
            int i13 = this.V;
            o();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(g2Var.f4771b)) {
            p(h0Var, f5134h0, i10);
            int i14 = this.V;
            o();
            return i14;
        }
        b1 b1Var = g2Var.Y;
        boolean z10 = this.X;
        ik0 ik0Var = this.f5152l;
        if (!z10) {
            boolean z11 = g2Var.f4777h;
            ik0 ik0Var2 = this.f5149i;
            if (z11) {
                this.Q &= -1073741825;
                if (!this.Y) {
                    ((a0) h0Var).h(ik0Var2.f5633a, 0, 1, false);
                    this.U++;
                    byte b10 = ik0Var2.f5633a[0];
                    if ((b10 & 128) == 128) {
                        throw zzbo.a("Extension bit is set in signal byte", null);
                    }
                    this.f5140b0 = b10;
                    this.Y = true;
                }
                byte b11 = this.f5140b0;
                if ((b11 & 1) == 1) {
                    int i15 = b11 & 2;
                    this.Q |= 1073741824;
                    if (!this.f5142c0) {
                        ik0 ik0Var3 = this.f5154n;
                        ((a0) h0Var).h(ik0Var3.f5633a, 0, 8, false);
                        this.U += 8;
                        this.f5142c0 = true;
                        ik0Var2.f5633a[0] = (byte) ((i15 == 2 ? NotificationCompat.FLAG_HIGH_PRIORITY : 0) | 8);
                        ik0Var2.i(0);
                        b1Var.a(ik0Var2, 1, 1);
                        this.V++;
                        ik0Var3.i(0);
                        b1Var.a(ik0Var3, 8, 1);
                        this.V += 8;
                    }
                    if (i15 == 2) {
                        if (!this.Z) {
                            ((a0) h0Var).h(ik0Var2.f5633a, 0, 1, false);
                            this.U++;
                            ik0Var2.i(0);
                            this.f5138a0 = ik0Var2.v();
                            this.Z = true;
                        }
                        int i16 = this.f5138a0 * 4;
                        ik0Var2.f(i16);
                        ((a0) h0Var).h(ik0Var2.f5633a, 0, i16, false);
                        this.U += i16;
                        int i17 = (this.f5138a0 >> 1) + 1;
                        int i18 = (i17 * 6) + 2;
                        ByteBuffer byteBuffer = this.f5157q;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f5157q = ByteBuffer.allocate(i18);
                        }
                        this.f5157q.position(0);
                        this.f5157q.putShort((short) i17);
                        int i19 = 0;
                        int i20 = 0;
                        while (true) {
                            i11 = this.f5138a0;
                            if (i19 >= i11) {
                                break;
                            }
                            int iY = ik0Var2.y();
                            int i21 = iY - i20;
                            if (i19 % 2 == 0) {
                                this.f5157q.putShort((short) i21);
                            } else {
                                this.f5157q.putInt(i21);
                            }
                            i19++;
                            i20 = iY;
                        }
                        int i22 = (i10 - this.U) - i20;
                        if ((i11 & 1) == 1) {
                            this.f5157q.putInt(i22);
                        } else {
                            this.f5157q.putShort((short) i22);
                            this.f5157q.putInt(0);
                        }
                        byte[] bArrArray = this.f5157q.array();
                        ik0 ik0Var4 = this.f5155o;
                        ik0Var4.g(bArrArray, i18);
                        b1Var.a(ik0Var4, i18, 1);
                        this.V += i18;
                    }
                }
            } else {
                byte[] bArr = g2Var.f4778i;
                if (bArr != null) {
                    ik0Var.g(bArr, bArr.length);
                }
            }
            if (!"A_OPUS".equals(g2Var.f4771b) ? g2Var.f4775f > 0 : z9) {
                this.Q |= 268435456;
                this.f5156p.f(0);
                int i23 = (ik0Var.f5635c + i10) - this.U;
                ik0Var2.f(4);
                byte[] bArr2 = ik0Var2.f5633a;
                bArr2[0] = (byte) ((i23 >> 24) & 255);
                bArr2[1] = (byte) ((i23 >> 16) & 255);
                bArr2[2] = (byte) ((i23 >> 8) & 255);
                bArr2[3] = (byte) (i23 & 255);
                b1Var.a(ik0Var2, 4, 2);
                this.V += 4;
            }
            this.X = true;
        }
        int i24 = i10 + ik0Var.f5635c;
        if (!"V_MPEG4/ISO/AVC".equals(g2Var.f4771b) && !"V_MPEGH/ISO/HEVC".equals(g2Var.f4771b)) {
            if (g2Var.U != null) {
                tc1.W(ik0Var.f5635c == 0);
                g2Var.U.c(h0Var);
            }
            while (true) {
                int i25 = this.U;
                if (i25 >= i24) {
                    break;
                }
                int i26 = i24 - i25;
                int iN = ik0Var.n();
                if (iN > 0) {
                    iD2 = Math.min(i26, iN);
                    b1Var.f(iD2, ik0Var);
                } else {
                    iD2 = b1Var.d(h0Var, i26, false);
                }
                this.U += iD2;
                this.V += iD2;
            }
        } else {
            ik0 ik0Var5 = this.f5148h;
            byte[] bArr3 = ik0Var5.f5633a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i27 = g2Var.Z;
            int i28 = 4 - i27;
            while (this.U < i24) {
                int i29 = this.W;
                if (i29 == 0) {
                    int iMin = Math.min(i27, ik0Var.n());
                    ((a0) h0Var).h(bArr3, i28 + iMin, i27 - iMin, false);
                    if (iMin > 0) {
                        ik0Var.e(i28, bArr3, iMin);
                    }
                    this.U += i27;
                    ik0Var5.i(0);
                    this.W = ik0Var5.y();
                    ik0 ik0Var6 = this.f5147g;
                    ik0Var6.i(0);
                    b1Var.f(4, ik0Var6);
                    this.V += 4;
                } else {
                    int iN2 = ik0Var.n();
                    if (iN2 > 0) {
                        iD = Math.min(i29, iN2);
                        b1Var.f(iD, ik0Var);
                    } else {
                        iD = b1Var.d(h0Var, i29, false);
                    }
                    this.U += iD;
                    this.V += iD;
                    this.W -= iD;
                }
            }
        }
        if ("A_VORBIS".equals(g2Var.f4771b)) {
            ik0 ik0Var7 = this.f5150j;
            ik0Var7.i(0);
            b1Var.f(4, ik0Var7);
            this.V += 4;
        }
        int i30 = this.V;
        o();
        return i30;
    }

    public final long j(long j10) throws zzbo {
        long j11 = this.f5160t;
        if (j11 != -9223372036854775807L) {
            return yn0.w(j10, j11, 1000L, RoundingMode.FLOOR);
        }
        throw zzbo.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    public final void k(int i10) throws zzbo {
        if (this.E == null || this.F == null) {
            throw zzbo.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    public final void l(int i10) throws zzbo {
        if (this.f5163w != null) {
            return;
        }
        throw zzbo.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ce A[EDGE_INSN: B:62:0x00ce->B:51:0x00ce BREAK  A[LOOP:0: B:45:0x00bd->B:50:0x00cb], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(com.google.android.gms.internal.ads.g2 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h2.m(com.google.android.gms.internal.ads.g2, long, int, int, int):void");
    }

    public final void n(h0 h0Var, int i10) {
        ik0 ik0Var = this.f5149i;
        if (ik0Var.f5635c >= i10) {
            return;
        }
        byte[] bArr = ik0Var.f5633a;
        if (bArr.length < i10) {
            int length = bArr.length;
            ik0Var.d(Math.max(length + length, i10));
        }
        byte[] bArr2 = ik0Var.f5633a;
        int i11 = ik0Var.f5635c;
        ((a0) h0Var).h(bArr2, i11, i10 - i11, false);
        ik0Var.h(i10);
    }

    public final void o() {
        this.U = 0;
        this.V = 0;
        this.W = 0;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f5138a0 = 0;
        this.f5140b0 = (byte) 0;
        this.f5142c0 = false;
        this.f5152l.f(0);
    }

    public final void p(h0 h0Var, byte[] bArr, int i10) {
        int length = bArr.length;
        int i11 = length + i10;
        ik0 ik0Var = this.f5153m;
        byte[] bArr2 = ik0Var.f5633a;
        if (bArr2.length < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            ik0Var.g(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, length);
        }
        ((a0) h0Var).h(ik0Var.f5633a, length, i10, false);
        ik0Var.i(0);
        ik0Var.h(i11);
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

    public h2(e2 e2Var, int i10, qz qzVar) {
        this.f5159s = -1L;
        this.f5160t = -9223372036854775807L;
        this.f5161u = -9223372036854775807L;
        this.f5162v = -9223372036854775807L;
        this.B = -1L;
        this.C = -1L;
        this.D = -9223372036854775807L;
        this.f5137a = e2Var;
        e2Var.f3813d = new f2(this);
        this.f5146f = qzVar;
        this.f5143d = 1 == ((i10 & 1) ^ 1);
        this.f5145e = (i10 & 2) == 0;
        this.f5139b = new i2();
        this.f5141c = new SparseArray();
        this.f5149i = new ik0(4);
        this.f5150j = new ik0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f5151k = new ik0(4);
        this.f5147g = new ik0(ds0.f3727a);
        this.f5148h = new ik0(4);
        this.f5152l = new ik0();
        this.f5153m = new ik0();
        this.f5154n = new ik0(8);
        this.f5155o = new ik0();
        this.f5156p = new ik0();
        this.N = new int[1];
    }
}
