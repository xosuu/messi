package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class hj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io1 f5315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dp1[] f5317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ij1 f5320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f5322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final vh1[] f5323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dq1 f5324j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rj1 f5325k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public hj1 f5326l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kp1 f5327m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k6 f5328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f5329o;

    public hj1(vh1[] vh1VarArr, long j10, dq1 dq1Var, iq1 iq1Var, rj1 rj1Var, ij1 ij1Var, k6 k6Var) {
        this.f5323i = vh1VarArr;
        this.f5329o = j10;
        this.f5324j = dq1Var;
        this.f5325k = rj1Var;
        jo1 jo1Var = ij1Var.f5622a;
        this.f5316b = jo1Var.f6052a;
        this.f5320f = ij1Var;
        this.f5327m = kp1.f6364d;
        this.f5328n = k6Var;
        this.f5317c = new dp1[2];
        this.f5322h = new boolean[2];
        rj1Var.getClass();
        int i10 = xj1.f10584k;
        Pair pair = (Pair) jo1Var.f6052a;
        Object obj = pair.first;
        jo1 jo1VarA = jo1Var.a(pair.second);
        pj1 pj1Var = (pj1) rj1Var.f8619d.get(obj);
        pj1Var.getClass();
        rj1Var.f8622g.add(pj1Var);
        oj1 oj1Var = (oj1) rj1Var.f8621f.get(pj1Var);
        if (oj1Var != null) {
            oj1Var.f7591a.g(oj1Var.f7592b);
        }
        pj1Var.f7902c.add(jo1VarA);
        do1 do1VarB = pj1Var.f7900a.b(jo1VarA, iq1Var, ij1Var.f5623b);
        rj1Var.f8618c.put(do1VarB, pj1Var);
        rj1Var.k();
        long j11 = ij1Var.f5625d;
        this.f5315a = j11 != -9223372036854775807L ? new sn1(do1VarB, j11) : do1VarB;
    }

    public final long a(k6 k6Var, long j10, boolean z9, boolean[] zArr) {
        vh1[] vh1VarArr;
        int i10 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= k6Var.f6197a) {
                break;
            }
            if (z9 || !k6Var.a(this.f5328n, i10)) {
                z10 = false;
            }
            this.f5322h[i10] = z10;
            i10++;
        }
        int i11 = 0;
        while (true) {
            vh1VarArr = this.f5323i;
            if (i11 >= 2) {
                break;
            }
            vh1VarArr[i11].getClass();
            i11++;
        }
        k();
        this.f5328n = k6Var;
        l();
        io1 io1Var = this.f5315a;
        cq1[] cq1VarArr = (cq1[]) k6Var.f6199d;
        long jF = io1Var.f(cq1VarArr, this.f5322h, this.f5317c, zArr, j10);
        for (int i12 = 0; i12 < 2; i12++) {
            vh1VarArr[i12].getClass();
        }
        this.f5319e = false;
        for (int i13 = 0; i13 < 2; i13++) {
            if (this.f5317c[i13] != null) {
                tc1.W(k6Var.d(i13));
                vh1VarArr[i13].getClass();
                this.f5319e = true;
            } else {
                tc1.W(cq1VarArr[i13] == null);
            }
        }
        return jF;
    }

    public final long b() {
        if (!this.f5318d) {
            return this.f5320f.f5623b;
        }
        long jZzb = this.f5319e ? this.f5315a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f5320f.f5626e : jZzb;
    }

    public final long c() {
        return this.f5329o;
    }

    public final long d() {
        return this.f5320f.f5623b + this.f5329o;
    }

    public final hj1 e() {
        return this.f5326l;
    }

    public final k6 f() {
        return this.f5328n;
    }

    public final k6 g(wv wvVar) {
        vh1[] vh1VarArr;
        List[] listArr;
        boolean z9;
        y1[] y1VarArr;
        int i10;
        int[] iArr;
        kp1 kp1Var = this.f5327m;
        jo1 jo1Var = this.f5320f.f5622a;
        dq1 dq1Var = this.f5324j;
        dq1Var.getClass();
        int[] iArr2 = new int[3];
        ow[][] owVarArr = new ow[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = kp1Var.f6365a;
            owVarArr[i11] = new ow[i12];
            iArr3[i11] = new int[i12][];
        }
        int i13 = 2;
        int[] iArr4 = new int[2];
        int i14 = 0;
        while (true) {
            vh1VarArr = this.f5323i;
            if (i14 >= 2) {
                break;
            }
            vh1VarArr[i14].getClass();
            iArr4[i14] = 8;
            i14++;
        }
        int i15 = 0;
        while (i15 < kp1Var.f6365a) {
            ow owVarA = kp1Var.a(i15);
            int i16 = 0;
            int i17 = 2;
            int i18 = 0;
            boolean z10 = true;
            while (true) {
                y1VarArr = owVarA.f7688d;
                i10 = owVarA.f7685a;
                if (i16 >= i13) {
                    break;
                }
                vh1 vh1Var = vh1VarArr[i16];
                kp1 kp1Var2 = kp1Var;
                int i19 = 0;
                int iMax = 0;
                while (i19 < i10) {
                    iMax = Math.max(iMax, vh1Var.s(y1VarArr[i19]) & 7);
                    i19++;
                    dq1Var = dq1Var;
                }
                dq1 dq1Var2 = dq1Var;
                boolean z11 = iArr2[i16] == 0;
                if (iMax > i18) {
                    z10 = z11;
                    i18 = iMax;
                    i17 = i16;
                } else if (iMax == i18 && owVarA.f7687c == 5 && !z10 && z11) {
                    i18 = iMax;
                    i17 = i16;
                    z10 = true;
                }
                i16++;
                kp1Var = kp1Var2;
                dq1Var = dq1Var2;
                i13 = 2;
            }
            kp1 kp1Var3 = kp1Var;
            dq1 dq1Var3 = dq1Var;
            if (i17 == 2) {
                iArr = new int[i10];
            } else {
                vh1 vh1Var2 = vh1VarArr[i17];
                int[] iArr5 = new int[i10];
                for (int i20 = 0; i20 < i10; i20++) {
                    iArr5[i20] = vh1Var2.s(y1VarArr[i20]);
                }
                iArr = iArr5;
            }
            int i21 = iArr2[i17];
            owVarArr[i17][i21] = owVarA;
            iArr3[i17][i21] = iArr;
            iArr2[i17] = i21 + 1;
            i15++;
            kp1Var = kp1Var3;
            dq1Var = dq1Var3;
            i13 = 2;
        }
        dq1 dq1Var4 = dq1Var;
        int i22 = 2;
        kp1[] kp1VarArr = new kp1[2];
        String[] strArr = new String[2];
        int[] iArr6 = new int[2];
        int i23 = 0;
        while (i23 < i22) {
            int i24 = iArr2[i23];
            kp1VarArr[i23] = new kp1((ow[]) yn0.h(i24, owVarArr[i23]));
            iArr3[i23] = (int[][]) yn0.h(i24, iArr3[i23]);
            strArr[i23] = vh1VarArr[i23].o();
            iArr6[i23] = vh1VarArr[i23].f9849b;
            i23++;
            i22 = 2;
        }
        qp0 qp0Var = new qp0(iArr6, kp1VarArr, iArr4, iArr3, new kp1((ow[]) yn0.h(iArr2[i22], owVarArr[i22])));
        Pair pairA = dq1Var4.a(qp0Var, iArr3, iArr4);
        cq1[] cq1VarArr = (cq1[]) pairA.second;
        List[] listArr2 = new List[cq1VarArr.length];
        for (int i25 = 0; i25 < cq1VarArr.length; i25++) {
            cq1 cq1Var = cq1VarArr[i25];
            listArr2[i25] = cq1Var != null ? bz0.n(cq1Var) : wz0.f10382h;
        }
        int i26 = 4;
        yy0 yy0Var = new yy0(4);
        int i27 = 0;
        for (int i28 = 2; i27 < i28; i28 = 2) {
            kp1 kp1VarI = qp0Var.i(i27);
            List list = listArr2[i27];
            int i29 = 0;
            while (i29 < kp1VarI.f6365a) {
                ow owVarA2 = kp1VarI.a(i29);
                int i30 = ((kp1[]) qp0Var.f8252d)[i27].a(i29).f7685a;
                int[] iArr7 = new int[i30];
                int i31 = 0;
                for (int i32 = 0; i32 < i30; i32++) {
                    if ((((int[][][]) qp0Var.f8254h)[i27][i29][i32] & 7) == i26) {
                        iArr7[i31] = i32;
                        i31++;
                    }
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr7, i31);
                String str = null;
                int iMin = 16;
                int i33 = 0;
                boolean z12 = false;
                int i34 = 0;
                while (i33 < iArrCopyOf.length) {
                    String str2 = ((kp1[]) qp0Var.f8252d)[i27].a(i29).f7688d[iArrCopyOf[i33]].f10714m;
                    int i35 = i34 + 1;
                    if (i34 == 0) {
                        str = str2;
                    } else {
                        z12 |= !yn0.c(str, str2);
                    }
                    iMin = Math.min(iMin, ((int[][][]) qp0Var.f8254h)[i27][i29][i33] & 24);
                    i33++;
                    i34 = i35;
                }
                if (z12) {
                    iMin = Math.min(iMin, ((int[]) qp0Var.f8253f)[i27]);
                }
                boolean z13 = iMin != 0;
                int i36 = owVarA2.f7685a;
                int[] iArr8 = new int[i36];
                boolean[] zArr = new boolean[i36];
                int i37 = 0;
                while (i37 < i36) {
                    iArr8[i37] = ((int[][][]) qp0Var.f8254h)[i27][i29][i37] & 7;
                    int i38 = 0;
                    while (true) {
                        if (i38 >= list.size()) {
                            listArr = listArr2;
                            z9 = false;
                            break;
                        }
                        cq1 cq1Var2 = (cq1) list.get(i38);
                        listArr = listArr2;
                        if (cq1Var2.zze().equals(owVarA2) && cq1Var2.zzb(i37) != -1) {
                            z9 = true;
                            break;
                        }
                        i38++;
                        listArr2 = listArr;
                    }
                    zArr[i37] = z9;
                    i37++;
                    listArr2 = listArr;
                }
                yy0Var.a(new hz(owVarA2, z13, iArr8, zArr));
                i29++;
                listArr2 = listArr2;
                i26 = 4;
            }
            i27++;
            i26 = 4;
        }
        kp1 kp1Var4 = (kp1) qp0Var.f8255q;
        for (int i39 = 0; i39 < kp1Var4.f6365a; i39++) {
            ow owVarA3 = kp1Var4.a(i39);
            int i40 = owVarA3.f7685a;
            int[] iArr9 = new int[i40];
            Arrays.fill(iArr9, 0);
            yy0Var.a(new hz(owVarA3, false, iArr9, new boolean[i40]));
        }
        k6 k6Var = new k6((zj1[]) pairA.first, (cq1[]) pairA.second, new mz(yy0Var.g()), qp0Var);
        for (cq1 cq1Var3 : (cq1[]) k6Var.f6199d) {
        }
        return k6Var;
    }

    public final void h(float f10, wv wvVar) {
        this.f5318d = true;
        this.f5327m = this.f5315a.zzi();
        k6 k6VarG = g(wvVar);
        ij1 ij1Var = this.f5320f;
        long jMax = ij1Var.f5623b;
        long j10 = ij1Var.f5626e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(k6VarG, jMax, false, new boolean[2]);
        long j11 = this.f5329o;
        ij1 ij1Var2 = this.f5320f;
        long j12 = ij1Var2.f5623b;
        this.f5329o = (j12 - jA) + j11;
        if (jA != j12) {
            ij1Var2 = new ij1(ij1Var2.f5622a, jA, ij1Var2.f5624c, ij1Var2.f5625d, ij1Var2.f5626e, ij1Var2.f5627f, ij1Var2.f5628g, ij1Var2.f5629h);
        }
        this.f5320f = ij1Var2;
    }

    public final void i() {
        k();
        io1 io1Var = this.f5315a;
        try {
            boolean z9 = io1Var instanceof sn1;
            rj1 rj1Var = this.f5325k;
            if (z9) {
                rj1Var.e(((sn1) io1Var).f8930a);
            } else {
                rj1Var.e(io1Var);
            }
        } catch (RuntimeException e10) {
            fg0.d("Period release failed.", e10);
        }
    }

    public final boolean j() {
        if (this.f5318d) {
            return !this.f5319e || this.f5315a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final void k() {
        if (this.f5326l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            k6 k6Var = this.f5328n;
            if (i10 >= k6Var.f6197a) {
                return;
            }
            k6Var.d(i10);
            cq1 cq1Var = ((cq1[]) this.f5328n.f6199d)[i10];
            i10++;
        }
    }

    public final void l() {
        if (this.f5326l != null) {
            return;
        }
        int i10 = 0;
        while (true) {
            k6 k6Var = this.f5328n;
            if (i10 >= k6Var.f6197a) {
                return;
            }
            k6Var.d(i10);
            cq1 cq1Var = ((cq1[]) this.f5328n.f6199d)[i10];
            i10++;
        }
    }
}
