package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class z5 implements p5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ik0 f11131c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d1 f11132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f11133e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11134f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1 f11135g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11136h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f11139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f11140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f11141m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11142n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11143o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f11144p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f11145q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f11146r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f11147s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f11148t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f11149u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f11150v;

    public z5(String str, int i10) {
        this.f11129a = str;
        this.f11130b = i10;
        ik0 ik0Var = new ik0(1024);
        this.f11131c = ik0Var;
        byte[] bArr = ik0Var.f5633a;
        this.f11132d = new d1(bArr, bArr.length);
        this.f11140l = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void b(boolean z9) {
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void c(ik0 ik0Var) throws zzbo {
        int iE;
        int i10;
        int iE2;
        boolean zO;
        int i11;
        tc1.A(this.f11133e);
        while (ik0Var.n() > 0) {
            int i12 = this.f11136h;
            if (i12 != 0) {
                if (i12 != 1) {
                    d1 d1Var = this.f11132d;
                    ik0 ik0Var2 = this.f11131c;
                    if (i12 != 2) {
                        int iMin = Math.min(ik0Var.n(), this.f11138j - this.f11137i);
                        ik0Var.e(this.f11137i, d1Var.f3531c, iMin);
                        int i13 = this.f11137i + iMin;
                        this.f11137i = i13;
                        if (i13 == this.f11138j) {
                            d1Var.k(0);
                            if (d1Var.o()) {
                                if (this.f11141m) {
                                }
                                this.f11136h = 0;
                            } else {
                                this.f11141m = true;
                                int iE3 = d1Var.e(1);
                                if (iE3 == 1) {
                                    iE2 = d1Var.e(1);
                                    i10 = 1;
                                } else {
                                    i10 = iE3;
                                    iE2 = 0;
                                }
                                this.f11142n = iE2;
                                if (iE2 != 0) {
                                    throw zzbo.a(null, null);
                                }
                                if (i10 == 1) {
                                    d1Var.e((d1Var.e(2) + 1) * 8);
                                    i10 = 1;
                                }
                                if (!d1Var.o()) {
                                    throw zzbo.a(null, null);
                                }
                                this.f11143o = d1Var.e(6);
                                int iE4 = d1Var.e(4);
                                int iE5 = d1Var.e(3);
                                if (iE4 != 0 || iE5 != 0) {
                                    throw zzbo.a(null, null);
                                }
                                if (i10 == 0) {
                                    int i14 = (d1Var.f3530b * 8) + d1Var.f3532d;
                                    int iA = d1Var.a();
                                    z0.b bVarW = tc1.w(d1Var, true);
                                    this.f11150v = (String) bVarW.f20648c;
                                    this.f11147s = bVarW.f20646a;
                                    this.f11149u = bVarW.f20647b;
                                    int iA2 = iA - d1Var.a();
                                    d1Var.k(i14);
                                    byte[] bArr = new byte[(iA2 + 7) / 8];
                                    d1Var.i(bArr, iA2);
                                    q0 q0Var = new q0();
                                    q0Var.f8041a = this.f11134f;
                                    q0Var.f("audio/mp4a-latm");
                                    q0Var.f8049i = this.f11150v;
                                    q0Var.f8065y = this.f11149u;
                                    q0Var.f8066z = this.f11147s;
                                    q0Var.f8054n = Collections.singletonList(bArr);
                                    q0Var.f8044d = this.f11129a;
                                    q0Var.f8046f = this.f11130b;
                                    y1 y1Var = new y1(q0Var);
                                    if (!y1Var.equals(this.f11135g)) {
                                        this.f11135g = y1Var;
                                        this.f11148t = 1024000000 / ((long) y1Var.A);
                                        this.f11133e.c(y1Var);
                                    }
                                } else {
                                    int iA3 = d1Var.a();
                                    z0.b bVarW2 = tc1.w(d1Var, true);
                                    this.f11150v = (String) bVarW2.f20648c;
                                    this.f11147s = bVarW2.f20646a;
                                    this.f11149u = bVarW2.f20647b;
                                    d1Var.m(d1Var.e((d1Var.e(2) + 1) * 8) - (iA3 - d1Var.a()));
                                }
                                int iE6 = d1Var.e(3);
                                this.f11144p = iE6;
                                if (iE6 == 0) {
                                    d1Var.m(8);
                                } else if (iE6 == 1) {
                                    d1Var.m(9);
                                } else if (iE6 == 3 || iE6 == 4 || iE6 == 5) {
                                    d1Var.m(6);
                                } else {
                                    if (iE6 != 6 && iE6 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    d1Var.m(1);
                                }
                                boolean zO2 = d1Var.o();
                                this.f11145q = zO2;
                                this.f11146r = 0L;
                                if (zO2) {
                                    if (i10 != 1) {
                                        do {
                                            zO = d1Var.o();
                                            this.f11146r = (this.f11146r << 8) + ((long) d1Var.e(8));
                                        } while (zO);
                                    } else {
                                        this.f11146r = d1Var.e((d1Var.e(2) + 1) * 8);
                                    }
                                }
                                if (d1Var.o()) {
                                    d1Var.m(8);
                                }
                            }
                            if (this.f11142n != 0) {
                                throw zzbo.a(null, null);
                            }
                            if (this.f11143o != 0) {
                                throw zzbo.a(null, null);
                            }
                            if (this.f11144p != 0) {
                                throw zzbo.a(null, null);
                            }
                            int i15 = 0;
                            do {
                                iE = d1Var.e(8);
                                i15 += iE;
                            } while (iE == 255);
                            int i16 = (d1Var.f3530b * 8) + d1Var.f3532d;
                            if ((i16 & 7) == 0) {
                                ik0Var2.i(i16 >> 3);
                            } else {
                                d1Var.i(ik0Var2.f5633a, i15 * 8);
                                ik0Var2.i(0);
                            }
                            this.f11133e.f(i15, ik0Var2);
                            tc1.W(this.f11140l != -9223372036854775807L);
                            this.f11133e.e(this.f11140l, 1, i15, 0, null);
                            this.f11140l += this.f11148t;
                            if (this.f11145q) {
                                d1Var.m((int) this.f11146r);
                            }
                            this.f11136h = 0;
                        } else {
                            continue;
                        }
                    } else {
                        int iV = ((this.f11139k & (-225)) << 8) | ik0Var.v();
                        this.f11138j = iV;
                        if (iV > ik0Var2.f5633a.length) {
                            ik0Var2.f(iV);
                            byte[] bArr2 = ik0Var2.f5633a;
                            int length = bArr2.length;
                            d1Var.f3531c = bArr2;
                            i11 = 0;
                            d1Var.f3530b = 0;
                            d1Var.f3532d = 0;
                            d1Var.f3533e = length;
                        } else {
                            i11 = 0;
                        }
                        this.f11137i = i11;
                        this.f11136h = 3;
                    }
                } else {
                    int iV2 = ik0Var.v();
                    if ((iV2 & 224) == 224) {
                        this.f11139k = iV2;
                        this.f11136h = 2;
                    } else if (iV2 != 86) {
                        this.f11136h = 0;
                    }
                }
            } else if (ik0Var.v() == 86) {
                this.f11136h = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void d(i0 i0Var, q2.d dVar) {
        dVar.c();
        dVar.d();
        this.f11133e = i0Var.j(dVar.f16414c, 1);
        dVar.d();
        this.f11134f = dVar.f16416e;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void e(int i10, long j10) {
        this.f11140l = j10;
    }

    @Override // com.google.android.gms.internal.ads.p5
    public final void zze() {
        this.f11136h = 0;
        this.f11140l = -9223372036854775807L;
        this.f11141m = false;
    }
}
