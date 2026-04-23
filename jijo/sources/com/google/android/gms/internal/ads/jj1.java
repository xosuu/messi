package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class jj1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dk1 f5972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ld0 f5973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public hj1 f5977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public hj1 f5978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public hj1 f5979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f5980k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f5981l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5982m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final mx0 f5984o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vu f5970a = new vu();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hv f5971b = new hv();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f5983n = new ArrayList();

    public jj1(dk1 dk1Var, tm0 tm0Var, mx0 mx0Var, ii1 ii1Var) {
        this.f5972c = dk1Var;
        this.f5973d = tm0Var;
        this.f5984o = mx0Var;
    }

    public static jo1 b(wv wvVar, Object obj, long j10, long j11, hv hvVar, vu vuVar) {
        wvVar.n(obj, vuVar);
        wvVar.e(vuVar.f9970c, hvVar, 0L);
        wvVar.a(obj);
        vuVar.f9973f.getClass();
        wvVar.n(obj, vuVar);
        vuVar.f9973f.a(-1);
        int i10 = a.f2535f;
        return new jo1(obj, j11, -1);
    }

    public final ij1 A(wv wvVar, Object obj, int i10, int i11, long j10, long j11) {
        int i12;
        jo1 jo1Var = new jo1(obj, i10, i11, j11, -1);
        vu vuVar = this.f5970a;
        long jA = wvVar.n(obj, vuVar).a(i10, i11);
        a aVarA = vuVar.f9973f.a(i10);
        int i13 = 0;
        while (true) {
            int[] iArr = aVarA.f2539d;
            if (i13 >= iArr.length || (i12 = iArr[i13]) == 0 || i12 == 1) {
                break;
            }
            i13++;
        }
        if (i11 == i13) {
            vuVar.f9973f.getClass();
        }
        vuVar.c(i10);
        long jMax = 0;
        if (jA != -9223372036854775807L && jA <= 0) {
            jMax = Math.max(0L, (-1) + jA);
        }
        return new ij1(jo1Var, jMax, j10, -9223372036854775807L, jA, false, false, false);
    }

    public final ij1 a(wv wvVar, Object obj, long j10, long j11, long j12) {
        vu vuVar = this.f5970a;
        wvVar.n(obj, vuVar);
        vuVar.getClass();
        vuVar.f9973f.getClass();
        jo1 jo1Var = new jo1(obj, j12, -1);
        boolean z9 = !jo1Var.b();
        boolean zE = e(wvVar, jo1Var);
        boolean zD = d(wvVar, jo1Var, z9);
        long j13 = vuVar.f9971d;
        return new ij1(jo1Var, (j13 == -9223372036854775807L || j10 < j13) ? j10 : Math.max(0L, (-1) + j13), j11, -9223372036854775807L, j13, z9, zE, zD);
    }

    public final void c() {
        yy0 yy0Var = new yy0(4);
        for (hj1 hj1Var = this.f5977h; hj1Var != null; hj1Var = hj1Var.f5326l) {
            yy0Var.a(hj1Var.f5320f.f5622a);
        }
        hj1 hj1Var2 = this.f5978i;
        ((tm0) this.f5973d).b(new l0.a(this, yy0Var, hj1Var2 == null ? null : hj1Var2.f5320f.f5622a, 21, 0));
    }

    public final boolean d(wv wvVar, jo1 jo1Var, boolean z9) {
        int iA = wvVar.a(jo1Var.f6052a);
        return !wvVar.e(wvVar.d(iA, this.f5970a, false).f9970c, this.f5971b, 0L).f5413g && wvVar.i(iA, this.f5970a, this.f5971b, this.f5975f, this.f5976g) == -1 && z9;
    }

    public final boolean e(wv wvVar, jo1 jo1Var) {
        if (!(!jo1Var.b() && jo1Var.f6056e == -1)) {
            return false;
        }
        Object obj = jo1Var.f6052a;
        return wvVar.e(wvVar.n(obj, this.f5970a).f9970c, this.f5971b, 0L).f5418l == wvVar.a(obj);
    }

    public final boolean f(wv wvVar) {
        hj1 hj1Var;
        hj1 hj1Var2 = this.f5977h;
        if (hj1Var2 == null) {
            return true;
        }
        int iA = wvVar.a(hj1Var2.f5316b);
        while (true) {
            iA = wvVar.i(iA, this.f5970a, this.f5971b, this.f5975f, this.f5976g);
            while (true) {
                hj1Var2.getClass();
                hj1Var = hj1Var2.f5326l;
                if (hj1Var == null || hj1Var2.f5320f.f5627f) {
                    break;
                }
                hj1Var2 = hj1Var;
            }
            if (iA == -1 || hj1Var == null || wvVar.a(hj1Var.f5316b) != iA) {
                break;
            }
            hj1Var2 = hj1Var;
        }
        boolean zS = s(hj1Var2);
        hj1Var2.f5320f = n(wvVar, hj1Var2.f5320f);
        return !zS;
    }

    public final hj1 g() {
        hj1 hj1Var = this.f5977h;
        if (hj1Var == null) {
            return null;
        }
        if (hj1Var == this.f5978i) {
            this.f5978i = hj1Var.f5326l;
        }
        hj1Var.i();
        int i10 = this.f5980k - 1;
        this.f5980k = i10;
        if (i10 == 0) {
            this.f5979j = null;
            hj1 hj1Var2 = this.f5977h;
            this.f5981l = hj1Var2.f5316b;
            this.f5982m = hj1Var2.f5320f.f5622a.f6055d;
        }
        this.f5977h = this.f5977h.f5326l;
        c();
        return this.f5977h;
    }

    public final hj1 h() {
        hj1 hj1Var = this.f5978i;
        tc1.A(hj1Var);
        this.f5978i = hj1Var.f5326l;
        c();
        hj1 hj1Var2 = this.f5978i;
        tc1.A(hj1Var2);
        return hj1Var2;
    }

    public final hj1 i(ij1 ij1Var) {
        hj1 hj1Var;
        hj1 hj1Var2 = this.f5979j;
        long j10 = ij1Var.f5623b;
        long j11 = hj1Var2 == null ? 1000000000000L : (hj1Var2.f5329o + hj1Var2.f5320f.f5626e) - j10;
        int i10 = 0;
        while (true) {
            if (i10 >= this.f5983n.size()) {
                hj1Var = null;
                break;
            }
            ij1 ij1Var2 = ((hj1) this.f5983n.get(i10)).f5320f;
            long j12 = ij1Var2.f5626e;
            if ((j12 == -9223372036854775807L || j12 == ij1Var.f5626e) && ij1Var2.f5623b == j10 && ij1Var2.f5622a.equals(ij1Var.f5622a)) {
                hj1Var = (hj1) this.f5983n.remove(i10);
                break;
            }
            i10++;
        }
        if (hj1Var == null) {
            aj1 aj1Var = (aj1) this.f5984o.f7073a;
            hj1Var = new hj1(aj1Var.f2706d, j11, aj1Var.f2707f, aj1Var.f2709q.zzj(), aj1Var.D, ij1Var, aj1Var.f2708h);
        } else {
            hj1Var.f5320f = ij1Var;
            hj1Var.f5329o = j11;
        }
        hj1 hj1Var3 = this.f5979j;
        if (hj1Var3 == null) {
            this.f5977h = hj1Var;
            this.f5978i = hj1Var;
        } else if (hj1Var != hj1Var3.f5326l) {
            hj1Var3.k();
            hj1Var3.f5326l = hj1Var;
            hj1Var3.l();
        }
        this.f5981l = null;
        this.f5979j = hj1Var;
        this.f5980k++;
        c();
        return hj1Var;
    }

    public final hj1 j() {
        return this.f5979j;
    }

    public final hj1 k() {
        return this.f5977h;
    }

    public final hj1 l() {
        return this.f5978i;
    }

    public final ij1 m(long j10, sj1 sj1Var) {
        hj1 hj1Var = this.f5979j;
        return hj1Var == null ? z(sj1Var.f8883a, sj1Var.f8884b, sj1Var.f8885c, sj1Var.f8899q) : y(sj1Var.f8883a, hj1Var, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.ij1 n(com.google.android.gms.internal.ads.wv r19, com.google.android.gms.internal.ads.ij1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.jo1 r3 = r2.f5622a
            boolean r4 = r3.b()
            r5 = -1
            int r6 = r3.f6056e
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
            r11 = 1
            goto L18
        L16:
            r4 = 0
            r11 = 0
        L18:
            boolean r12 = r0.e(r1, r3)
            boolean r13 = r0.d(r1, r3, r11)
            com.google.android.gms.internal.ads.jo1 r4 = r2.f5622a
            java.lang.Object r4 = r4.f6052a
            com.google.android.gms.internal.ads.vu r7 = r0.f5970a
            r1.n(r4, r7)
            boolean r1 = r3.b()
            r8 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L38
            if (r6 != r5) goto L3b
        L38:
            r16 = r14
            goto L46
        L3b:
            com.google.android.gms.internal.ads.zc r1 = r7.f9973f
            com.google.android.gms.internal.ads.a r1 = r1.a(r6)
            r1.getClass()
            r16 = r8
        L46:
            boolean r1 = r3.b()
            int r4 = r3.f6053b
            if (r1 == 0) goto L56
            int r1 = r3.f6054c
            long r8 = r7.a(r4, r1)
        L54:
            r9 = r8
            goto L62
        L56:
            int r1 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r1 == 0) goto L5f
            r16 = r8
            r9 = r16
            goto L62
        L5f:
            long r8 = r7.f9971d
            goto L54
        L62:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            r7.c(r4)
            goto L71
        L6c:
            if (r6 == r5) goto L71
            r7.c(r6)
        L71:
            com.google.android.gms.internal.ads.ij1 r14 = new com.google.android.gms.internal.ads.ij1
            long r4 = r2.f5623b
            long r6 = r2.f5624c
            r1 = r14
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jj1.n(com.google.android.gms.internal.ads.wv, com.google.android.gms.internal.ads.ij1):com.google.android.gms.internal.ads.ij1");
    }

    public final jo1 o(wv wvVar, Object obj, long j10) {
        long jX;
        int iA;
        vu vuVar = this.f5970a;
        int i10 = wvVar.n(obj, vuVar).f9970c;
        Object obj2 = this.f5981l;
        if (obj2 == null || (iA = wvVar.a(obj2)) == -1 || wvVar.d(iA, vuVar, false).f9970c != i10) {
            hj1 hj1Var = this.f5977h;
            while (true) {
                if (hj1Var == null) {
                    hj1 hj1Var2 = this.f5977h;
                    while (true) {
                        if (hj1Var2 != null) {
                            int iA2 = wvVar.a(hj1Var2.f5316b);
                            if (iA2 != -1 && wvVar.d(iA2, vuVar, false).f9970c == i10) {
                                jX = hj1Var2.f5320f.f5622a.f6055d;
                                break;
                            }
                            hj1Var2 = hj1Var2.f5326l;
                        } else {
                            jX = x(obj);
                            if (jX == -1) {
                                jX = this.f5974e;
                                this.f5974e = 1 + jX;
                                if (this.f5977h == null) {
                                    this.f5981l = obj;
                                    this.f5982m = jX;
                                }
                            }
                        }
                    }
                } else {
                    if (hj1Var.f5316b.equals(obj)) {
                        jX = hj1Var.f5320f.f5622a.f6055d;
                        break;
                    }
                    hj1Var = hj1Var.f5326l;
                }
            }
        } else {
            jX = this.f5982m;
        }
        long j11 = jX;
        wvVar.n(obj, vuVar);
        int i11 = vuVar.f9970c;
        hv hvVar = this.f5971b;
        wvVar.e(i11, hvVar, 0L);
        for (int iA3 = wvVar.a(obj); iA3 >= hvVar.f5417k; iA3--) {
            wvVar.d(iA3, vuVar, true);
            vuVar.f9973f.getClass();
            vuVar.f9973f.a(-1);
            int i12 = a.f2535f;
        }
        return b(wvVar, obj, j10, j11, hvVar, this.f5970a);
    }

    public final void p() {
        if (this.f5980k == 0) {
            return;
        }
        hj1 hj1Var = this.f5977h;
        tc1.A(hj1Var);
        this.f5981l = hj1Var.f5316b;
        this.f5982m = hj1Var.f5320f.f5622a.f6055d;
        while (hj1Var != null) {
            hj1Var.i();
            hj1Var = hj1Var.f5326l;
        }
        this.f5977h = null;
        this.f5979j = null;
        this.f5978i = null;
        this.f5980k = 0;
        c();
    }

    public final void q() {
        if (this.f5983n.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.f5983n.size(); i10++) {
            ((hj1) this.f5983n.get(i10)).i();
        }
        this.f5983n = arrayList;
    }

    public final void r(ii1 ii1Var) {
        ii1Var.getClass();
        q();
    }

    public final boolean s(hj1 hj1Var) {
        tc1.A(hj1Var);
        boolean z9 = false;
        if (hj1Var.equals(this.f5979j)) {
            return false;
        }
        this.f5979j = hj1Var;
        while (true) {
            hj1Var = hj1Var.f5326l;
            if (hj1Var == null) {
                break;
            }
            if (hj1Var == this.f5978i) {
                this.f5978i = this.f5977h;
                z9 = true;
            }
            hj1Var.i();
            this.f5980k--;
        }
        hj1 hj1Var2 = this.f5979j;
        hj1Var2.getClass();
        if (hj1Var2.f5326l != null) {
            hj1Var2.k();
            hj1Var2.f5326l = null;
            hj1Var2.l();
        }
        c();
        return z9;
    }

    public final boolean t() {
        hj1 hj1Var = this.f5979j;
        if (hj1Var != null) {
            return !hj1Var.f5320f.f5629h && hj1Var.j() && this.f5979j.f5320f.f5626e != -9223372036854775807L && this.f5980k < 100;
        }
        return true;
    }

    public final boolean u(wv wvVar, long j10, long j11) {
        ij1 ij1VarN;
        wv wvVar2 = wvVar;
        hj1 hj1Var = this.f5977h;
        hj1 hj1Var2 = null;
        while (hj1Var != null) {
            ij1 ij1Var = hj1Var.f5320f;
            if (hj1Var2 == null) {
                ij1VarN = n(wvVar2, ij1Var);
            } else {
                ij1 ij1VarY = y(wvVar2, hj1Var2, j10);
                if (ij1VarY == null) {
                    return !s(hj1Var2);
                }
                if (ij1Var.f5623b != ij1VarY.f5623b || !ij1Var.f5622a.equals(ij1VarY.f5622a)) {
                    return !s(hj1Var2);
                }
                ij1VarN = ij1VarY;
            }
            long j12 = ij1Var.f5624c;
            ij1 ij1Var2 = j12 == ij1VarN.f5624c ? ij1VarN : new ij1(ij1VarN.f5622a, ij1VarN.f5623b, j12, ij1VarN.f5625d, ij1VarN.f5626e, ij1VarN.f5627f, ij1VarN.f5628g, ij1VarN.f5629h);
            hj1Var.f5320f = ij1Var2;
            long j13 = ij1Var.f5626e;
            if (j13 != -9223372036854775807L) {
                long j14 = ij1VarN.f5626e;
                if (j13 != j14) {
                    io1 io1Var = hj1Var.f5315a;
                    if (io1Var instanceof sn1) {
                        long j15 = ij1Var2.f5625d;
                        if (j15 == -9223372036854775807L) {
                            j15 = Long.MIN_VALUE;
                        }
                        ((sn1) io1Var).f8934h = j15;
                    }
                    return (s(hj1Var) || (hj1Var == this.f5978i && ((j11 > Long.MIN_VALUE ? 1 : (j11 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j11 > ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : hj1Var.f5329o + j14) ? 1 : (j11 == ((j14 > (-9223372036854775807L) ? 1 : (j14 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : hj1Var.f5329o + j14) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            hj1Var2 = hj1Var;
            hj1Var = hj1Var.f5326l;
            wvVar2 = wvVar;
        }
        return true;
    }

    public final boolean v(wv wvVar, int i10) {
        this.f5975f = i10;
        return f(wvVar);
    }

    public final boolean w(wv wvVar, boolean z9) {
        this.f5976g = z9;
        return f(wvVar);
    }

    public final long x(Object obj) {
        for (int i10 = 0; i10 < this.f5983n.size(); i10++) {
            hj1 hj1Var = (hj1) this.f5983n.get(i10);
            if (hj1Var.f5316b.equals(obj)) {
                return hj1Var.f5320f.f5622a.f6055d;
            }
        }
        return -1L;
    }

    public final ij1 y(wv wvVar, hj1 hj1Var, long j10) {
        int i10;
        ij1 ij1Var;
        long j11;
        long jLongValue;
        int i11;
        jo1 jo1Var;
        long j12;
        long j13;
        long jX;
        ij1 ij1Var2 = hj1Var.f5320f;
        long j14 = (hj1Var.f5329o + ij1Var2.f5626e) - j10;
        boolean z9 = ij1Var2.f5627f;
        vu vuVar = this.f5970a;
        long j15 = ij1Var2.f5624c;
        jo1 jo1Var2 = ij1Var2.f5622a;
        if (z9) {
            int i12 = wvVar.i(wvVar.a(jo1Var2.f6052a), this.f5970a, this.f5971b, this.f5975f, this.f5976g);
            if (i12 != -1) {
                int i13 = wvVar.d(i12, vuVar, true).f9970c;
                Object obj = vuVar.f9969b;
                obj.getClass();
                if (wvVar.e(i13, this.f5971b, 0L).f5417k == i12) {
                    Pair pairM = wvVar.m(this.f5971b, this.f5970a, i13, -9223372036854775807L, Math.max(0L, j14));
                    if (pairM != null) {
                        obj = pairM.first;
                        long jLongValue2 = ((Long) pairM.second).longValue();
                        hj1 hj1Var2 = hj1Var.f5326l;
                        if (hj1Var2 == null || !hj1Var2.f5316b.equals(obj)) {
                            jX = x(obj);
                            if (jX == -1) {
                                jX = this.f5974e;
                                this.f5974e = 1 + jX;
                            }
                        } else {
                            jX = hj1Var2.f5320f.f5622a.f6055d;
                        }
                        j13 = jLongValue2;
                        j12 = -9223372036854775807L;
                        jo1Var = jo1Var2;
                    }
                } else {
                    jo1Var = jo1Var2;
                    j12 = 0;
                    j13 = 0;
                    jX = jo1Var.f6055d;
                }
                jo1 jo1VarB = b(wvVar, obj, j13, jX, this.f5971b, this.f5970a);
                if (j12 != -9223372036854775807L && j15 != -9223372036854775807L) {
                    wvVar.n(jo1Var.f6052a, vuVar).f9973f.getClass();
                    vuVar.f9973f.getClass();
                }
                return z(wvVar, jo1VarB, j12, j13);
            }
        } else {
            wvVar.n(jo1Var2.f6052a, vuVar);
            boolean zB = jo1Var2.b();
            Object obj2 = jo1Var2.f6052a;
            if (!zB) {
                int i14 = jo1Var2.f6056e;
                if (i14 != -1) {
                    vuVar.f9973f.getClass();
                    if (i14 == -1) {
                        vuVar.f9973f.a(-1);
                        int i15 = a.f2535f;
                    }
                }
                a aVarA = vuVar.f9973f.a(i14);
                int i16 = 0;
                while (true) {
                    int[] iArr = aVarA.f2539d;
                    if (i16 >= iArr.length || (i10 = iArr[i16]) == 0 || i10 == 1) {
                        break;
                    }
                    i16++;
                }
                vuVar.c(i14);
                if (i16 != vuVar.f9973f.a(i14).f2536a) {
                    return A(wvVar, jo1Var2.f6052a, jo1Var2.f6056e, i16, ij1Var2.f5626e, jo1Var2.f6055d);
                }
                wvVar.n(obj2, vuVar);
                vuVar.f9973f.a(i14).getClass();
                vuVar.f9973f.a(i14).getClass();
                return a(wvVar, jo1Var2.f6052a, 0L, ij1Var2.f5626e, jo1Var2.f6055d);
            }
            int i17 = jo1Var2.f6053b;
            if (vuVar.f9973f.a(i17).f2536a != -1) {
                a aVarA2 = vuVar.f9973f.a(i17);
                int i18 = jo1Var2.f6054c + 1;
                while (true) {
                    int[] iArr2 = aVarA2.f2539d;
                    if (i18 >= iArr2.length || (i11 = iArr2[i18]) == 0 || i11 == 1) {
                        break;
                    }
                    i18++;
                }
                if (i18 < 0) {
                    return A(wvVar, jo1Var2.f6052a, i17, i18, ij1Var2.f5624c, jo1Var2.f6055d);
                }
                if (j15 == -9223372036854775807L) {
                    ij1Var = ij1Var2;
                    j11 = 0;
                    Pair pairM2 = wvVar.m(this.f5971b, vuVar, vuVar.f9970c, -9223372036854775807L, Math.max(0L, j14));
                    if (pairM2 != null) {
                        jLongValue = ((Long) pairM2.second).longValue();
                    }
                } else {
                    ij1Var = ij1Var2;
                    j11 = 0;
                    jLongValue = j15;
                }
                wvVar.n(obj2, vuVar);
                zc zcVar = vuVar.f9973f;
                int i19 = jo1Var2.f6053b;
                zcVar.a(i19).getClass();
                vuVar.f9973f.a(i19).getClass();
                return a(wvVar, jo1Var2.f6052a, Math.max(j11, jLongValue), ij1Var.f5624c, jo1Var2.f6055d);
            }
        }
        return null;
    }

    public final ij1 z(wv wvVar, jo1 jo1Var, long j10, long j11) {
        wvVar.n(jo1Var.f6052a, this.f5970a);
        return jo1Var.b() ? A(wvVar, jo1Var.f6052a, jo1Var.f6053b, jo1Var.f6054c, j10, jo1Var.f6055d) : a(wvVar, jo1Var.f6052a, j11, j10, jo1Var.f6055d);
    }
}
