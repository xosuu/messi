package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h3 implements g0, v0 {
    public zzagr A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4 f5168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f5170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ik0 f5171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ik0 f5172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ik0 f5173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f5174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j3 f5175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f5176i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public wz0 f5177j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5178k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5179l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5180m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5181n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ik0 f5182o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f5183p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f5184q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5185r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f5186s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5187t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i0 f5188u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g3[] f5189v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long[][] f5190w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5191x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f5192y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f5193z;

    public h3() {
        this(16, a4.f2573j);
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final u0 b(long j10) {
        long j11;
        long j12;
        long j13;
        long jMin;
        int[] iArr;
        long j14;
        int i10;
        long j15;
        int iA;
        long j16 = j10;
        g3[] g3VarArr = this.f5189v;
        int length = g3VarArr.length;
        w0 w0Var = w0.f10014c;
        if (length == 0) {
            return new u0(w0Var, w0Var);
        }
        int i11 = this.f5191x;
        boolean z9 = false;
        int i12 = -1;
        if (i11 != -1) {
            n3 n3Var = g3VarArr[i11].f4799b;
            int iL = yn0.l(n3Var.f7120f, j16, false);
            while (true) {
                if (iL < 0) {
                    iL = -1;
                    break;
                }
                if ((n3Var.f7121g[iL] & 1) != 0) {
                    break;
                }
                iL--;
            }
            if (iL == -1) {
                iL = n3Var.a(j16);
            }
            if (iL == -1) {
                return new u0(w0Var, w0Var);
            }
            long[] jArr = n3Var.f7120f;
            long j17 = jArr[iL];
            long[] jArr2 = n3Var.f7117c;
            j11 = jArr2[iL];
            if (j17 >= j16 || iL >= n3Var.f7116b - 1 || (iA = n3Var.a(j16)) == -1 || iA == iL) {
                j15 = -9223372036854775807L;
                j13 = -1;
            } else {
                j15 = jArr[iA];
                j13 = jArr2[iA];
            }
            j12 = j15;
            j16 = j17;
        } else {
            j11 = Long.MAX_VALUE;
            j12 = -9223372036854775807L;
            j13 = -1;
        }
        long jMin2 = j11;
        int i13 = 0;
        while (true) {
            g3[] g3VarArr2 = this.f5189v;
            if (i13 >= g3VarArr2.length) {
                break;
            }
            if (i13 != this.f5191x) {
                n3 n3Var2 = g3VarArr2[i13].f4799b;
                int iL2 = yn0.l(n3Var2.f7120f, j16, z9);
                while (true) {
                    iArr = n3Var2.f7121g;
                    if (iL2 < 0) {
                        iL2 = -1;
                        break;
                    }
                    if ((iArr[iL2] & 1) != 0) {
                        break;
                    }
                    iL2--;
                }
                if (iL2 == i12) {
                    iL2 = n3Var2.a(j16);
                }
                long[] jArr3 = n3Var2.f7117c;
                if (iL2 == i12) {
                    j14 = j13;
                } else {
                    j14 = j13;
                    jMin2 = Math.min(jArr3[iL2], jMin2);
                }
                if (j12 != -9223372036854775807L) {
                    int iL3 = yn0.l(n3Var2.f7120f, j12, false);
                    while (true) {
                        if (iL3 < 0) {
                            i10 = -1;
                            iL3 = -1;
                            break;
                        }
                        if ((iArr[iL3] & 1) != 0) {
                            i10 = -1;
                            break;
                        }
                        iL3--;
                    }
                    if (iL3 == i10) {
                        iL3 = n3Var2.a(j12);
                    }
                    jMin = iL3 == i10 ? j14 : Math.min(jArr3[iL3], j14);
                    i13++;
                    j13 = jMin;
                    z9 = false;
                    i12 = -1;
                } else {
                    jMin = j14;
                }
            } else {
                jMin = j13;
            }
            i13++;
            j13 = jMin;
            z9 = false;
            i12 = -1;
        }
        long j18 = j13;
        w0 w0Var2 = new w0(j16, jMin2);
        return j12 == -9223372036854775807L ? new u0(w0Var2, w0Var2) : new u0(w0Var2, new w0(j12, j18));
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        this.f5174g.clear();
        this.f5181n = 0;
        this.f5183p = -1;
        this.f5184q = 0;
        this.f5185r = 0;
        this.f5186s = 0;
        if (j10 == 0) {
            if (this.f5178k != 3) {
                this.f5178k = 0;
                this.f5181n = 0;
                return;
            } else {
                j3 j3Var = this.f5175h;
                j3Var.f5784a.clear();
                j3Var.f5785b = 0;
                this.f5176i.clear();
                return;
            }
        }
        for (g3 g3Var : this.f5189v) {
            n3 n3Var = g3Var.f4799b;
            int iL = yn0.l(n3Var.f7120f, j11, false);
            while (true) {
                if (iL < 0) {
                    iL = -1;
                    break;
                } else if ((n3Var.f7121g[iL] & 1) != 0) {
                    break;
                } else {
                    iL--;
                }
            }
            if (iL == -1) {
                iL = n3Var.a(j11);
            }
            g3Var.f4802e = iL;
            c1 c1Var = g3Var.f4801d;
            if (c1Var != null) {
                c1Var.f3151b = false;
                c1Var.f3152c = 0;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x02a6 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(com.google.android.gms.internal.ads.h0 r34, com.google.android.gms.internal.ads.k0 r35) throws com.google.android.gms.internal.ads.zzbo {
        /*
            Method dump skipped, instruction units count: 1690
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h3.d(com.google.android.gms.internal.ads.h0, com.google.android.gms.internal.ads.k0):int");
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        if ((this.f5169b & 16) == 0) {
            i0Var = new ur0(i0Var, this.f5168a);
        }
        this.f5188u = i0Var;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        wz0 wz0VarN;
        z0 z0VarN0 = en1.n0(h0Var, false, (this.f5169b & 2) != 0);
        if (z0VarN0 != null) {
            wz0VarN = bz0.n(z0VarN0);
        } else {
            zy0 zy0Var = bz0.f3132b;
            wz0VarN = wz0.f10382h;
        }
        this.f5177j = wz0VarN;
        return z0VarN0 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x020a, code lost:
    
        if (r11 != 757935405) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x020c, code lost:
    
        r2 = null;
        r3 = null;
        r11 = -1;
        r12 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0210, code lost:
    
        r0 = r7.f5634b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0212, code lost:
    
        if (r0 >= r8) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0214, code lost:
    
        r19 = r7.q();
        r9 = r7.q();
        r7.j(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0225, code lost:
    
        if (r9 != 1835360622) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0227, code lost:
    
        r2 = r7.I(r19 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x022f, code lost:
    
        r0 = r19 - 12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0234, code lost:
    
        if (r9 != 1851878757) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0236, code lost:
    
        r3 = r7.I(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0241, code lost:
    
        if (r9 != 1684108385) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0243, code lost:
    
        r12 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0245, code lost:
    
        if (r9 != 1684108385) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0247, code lost:
    
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0249, code lost:
    
        r7.j(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x024d, code lost:
    
        if (r2 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x024f, code lost:
    
        if (r3 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0252, code lost:
    
        if (r11 != (-1)) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0256, code lost:
    
        r7.i(r11);
        r7.j(16);
        r3 = new com.google.android.gms.internal.ads.zzagg(r2, r3, r7.I(r12 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x026c, code lost:
    
        r0 = r11 & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0271, code lost:
    
        if (r0 != 6516084) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0273, code lost:
    
        r0 = r7.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x027e, code lost:
    
        if (r7.q() != 1684108385) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0280, code lost:
    
        r7.j(8);
        r0 = r7.I(r0 - 16);
        r3 = new com.google.android.gms.internal.ads.zzafx("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0294, code lost:
    
        com.google.android.gms.internal.ads.fg0.f("Failed to parse comment attribute: ".concat(com.google.android.gms.internal.ads.t2.c(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02a6, code lost:
    
        if (r0 == 7233901) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02ab, code lost:
    
        if (r0 != 7631467) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b2, code lost:
    
        if (r0 == 6516589) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b7, code lost:
    
        if (r0 != 7828084) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02be, code lost:
    
        if (r0 != 6578553) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02c0, code lost:
    
        r3 = y3.c.w(r11, "TDRC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02cb, code lost:
    
        if (r0 != 4280916) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02cd, code lost:
    
        r3 = y3.c.w(r11, "TPE1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d7, code lost:
    
        if (r0 != 7630703) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02d9, code lost:
    
        r3 = y3.c.w(r11, "TSSE", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e3, code lost:
    
        if (r0 != 6384738) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02e5, code lost:
    
        r3 = y3.c.w(r11, "TALB", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ef, code lost:
    
        if (r0 != 7108978) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02f1, code lost:
    
        r3 = y3.c.w(r11, "USLT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02fb, code lost:
    
        if (r0 != 6776174) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02fd, code lost:
    
        r3 = y3.c.w(r11, "TCON", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0305, code lost:
    
        if (r0 != 6779504) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0307, code lost:
    
        r3 = y3.c.w(r11, "TIT1", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x030e, code lost:
    
        com.google.android.gms.internal.ads.fg0.b("Skipped unknown metadata entry: " + com.google.android.gms.internal.ads.t2.c(r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0323, code lost:
    
        r3 = y3.c.w(r11, "TCOM", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x032a, code lost:
    
        r3 = y3.c.w(r11, "TIT2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0333, code lost:
    
        if (r3 == null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0335, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0338, code lost:
    
        r0 = r27;
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0343, code lost:
    
        r7.i(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0346, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0347, code lost:
    
        r27 = r0;
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034f, code lost:
    
        if (r4.isEmpty() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0351, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0353, code lost:
    
        r9 = new com.google.android.gms.internal.ads.zzbk(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039f, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
    
        r7.i(r4);
        r7.j(r9);
        r4 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
    
        r8 = r7.f5634b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (r8 >= r15) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a1, code lost:
    
        r8 = r7.q() + r8;
        r11 = r7.q();
        r3 = (r11 >> 24) & 255;
        r27 = r0;
        r29 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00be, code lost:
    
        if (r3 == 169) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c2, code lost:
    
        if (r3 != 253) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c9, code lost:
    
        if (r11 != 1735291493) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cb, code lost:
    
        r0 = com.google.android.gms.internal.ads.c2.a(y3.c.n(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d5, code lost:
    
        if (r0 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d7, code lost:
    
        r3 = new com.google.android.gms.internal.ads.zzagm("TCON", null, com.google.android.gms.internal.ads.bz0.n(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        com.google.android.gms.internal.ads.fg0.f("Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00eb, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f1, code lost:
    
        if (r11 != 1684632427) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f3, code lost:
    
        r3 = y3.c.t(1684632427, "TPOS", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fe, code lost:
    
        if (r11 != 1953655662) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0100, code lost:
    
        r3 = y3.c.t(1953655662, "TRCK", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x010b, code lost:
    
        if (r11 != 1953329263) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x010d, code lost:
    
        r0 = y3.c.r(1953329263, "TBPM", r7, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0115, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (r11 != 1668311404) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011e, code lost:
    
        r3 = y3.c.r(1668311404, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0129, code lost:
    
        if (r11 != 1668249202) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012b, code lost:
    
        r0 = r7.q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0136, code lost:
    
        if (r7.q() != 1684108385) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0138, code lost:
    
        r2 = r7.q() & 16777215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0140, code lost:
    
        if (r2 != 13) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0142, code lost:
    
        r3 = "image/jpeg";
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0147, code lost:
    
        if (r2 != 14) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r3 = "image/png";
        r2 = 14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0150, code lost:
    
        if (r3 != null) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0152, code lost:
    
        com.google.android.gms.internal.ads.fg0.f("Unrecognized cover art flags: " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0162, code lost:
    
        r7.j(4);
        r0 = r0 - 16;
        r2 = new byte[r0];
        r7.e(0, r2, r0);
        r0 = new com.google.android.gms.internal.ads.zzafp(3, r3, null, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0176, code lost:
    
        com.google.android.gms.internal.ads.fg0.f("Failed to parse cover art attribute");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0185, code lost:
    
        if (r11 != 1631670868) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0187, code lost:
    
        r3 = y3.c.w(1631670868, "TPE2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
    
        if (r11 != 1936682605) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0194, code lost:
    
        r3 = y3.c.w(1936682605, "TSOT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019f, code lost:
    
        if (r11 != 1936679276) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a1, code lost:
    
        r3 = y3.c.w(1936679276, "TSOA", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01ac, code lost:
    
        if (r11 != 1936679282) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ae, code lost:
    
        r3 = y3.c.w(1936679282, "TSOP", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
    
        if (r11 != 1936679265) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01bb, code lost:
    
        r3 = y3.c.w(1936679265, "TSO2", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c6, code lost:
    
        if (r11 != 1936679791) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01c8, code lost:
    
        r3 = y3.c.w(1936679791, "TSOC", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01d3, code lost:
    
        if (r11 != 1920233063) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01d5, code lost:
    
        r3 = y3.c.r(1920233063, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01e2, code lost:
    
        if (r11 != 1885823344) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01e4, code lost:
    
        r3 = y3.c.r(1885823344, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f0, code lost:
    
        if (r11 != 1936683886) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f2, code lost:
    
        r3 = y3.c.w(1936683886, "TVSHOWSORT", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01fd, code lost:
    
        if (r11 != 1953919848) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ff, code lost:
    
        r3 = y3.c.w(1953919848, "TVSHOW", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:205:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0579  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(long r31) {
        /*
            Method dump skipped, instruction units count: 1981
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.h3.g(long):void");
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final long zza() {
        return this.f5192y;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ g0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final /* synthetic */ List zzd() {
        return this.f5177j;
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.v0
    public final boolean zzh() {
        return true;
    }

    public h3(int i10, qz qzVar) {
        this.f5168a = qzVar;
        this.f5169b = i10;
        zy0 zy0Var = bz0.f3132b;
        this.f5177j = wz0.f10382h;
        this.f5178k = (i10 & 4) != 0 ? 3 : 0;
        this.f5175h = new j3();
        this.f5176i = new ArrayList();
        this.f5173f = new ik0(16);
        this.f5174g = new ArrayDeque();
        this.f5170c = new ik0(ds0.f3727a);
        this.f5171d = new ik0(4);
        this.f5172e = new ik0();
        this.f5183p = -1;
        this.f5188u = i0.f5449i;
        this.f5189v = new g3[0];
    }
}
