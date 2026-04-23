package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q1 implements g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i0 f8073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b1 f8074e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public zzbk f8076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m0 f8077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public p1 f8080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f8082m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8070a = new byte[42];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ik0 f8071b = new ik0(new byte[32768], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f8072c = new k0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8075f = 0;

    @Override // com.google.android.gms.internal.ads.g0
    public final void c(long j10, long j11) {
        if (j10 == 0) {
            this.f8075f = 0;
        } else {
            p1 p1Var = this.f8080k;
            if (p1Var != null) {
                p1Var.b(j11);
            }
        }
        this.f8082m = j11 != 0 ? -1L : 0L;
        this.f8081l = 0;
        this.f8071b.f(0);
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final int d(h0 h0Var, k0 k0Var) throws zzbo {
        i0 i0Var;
        v0 l0Var;
        i0 i0Var2;
        xg xgVar;
        long j10;
        long j11;
        boolean zF0;
        h0 h0Var2 = h0Var;
        int i10 = this.f8075f;
        zzbk zzbkVar = null;
        if (i10 == 0) {
            h0Var.zzj();
            long jZze = h0Var.zze();
            zzbk zzbkVarA = new r0(0).a(h0Var2, null);
            if (zzbkVarA != null && zzbkVarA.f11487a.length != 0) {
                zzbkVar = zzbkVarA;
            }
            ((a0) h0Var2).j((int) (h0Var.zze() - jZze));
            this.f8076g = zzbkVar;
            this.f8075f = 1;
            return 0;
        }
        byte[] bArr = this.f8070a;
        if (i10 == 1) {
            ((a0) h0Var2).m(bArr, 0, 42, false);
            h0Var.zzj();
            this.f8075f = 2;
            return 0;
        }
        int i11 = 3;
        int i12 = 4;
        if (i10 == 2) {
            ik0 ik0Var = new ik0(4);
            ((a0) h0Var).h(ik0Var.f5633a, 0, 4, false);
            if (ik0Var.D() != 1716281667) {
                throw zzbo.a("Failed to read FLAC stream marker.", null);
            }
            this.f8075f = 3;
            return 0;
        }
        if (i10 != 3) {
            long j12 = 0;
            if (i10 == 4) {
                h0Var.zzj();
                ik0 ik0Var2 = new ik0(2);
                ((a0) h0Var2).m(ik0Var2.f5633a, 0, 2, false);
                int iZ = ik0Var2.z();
                if ((iZ >> 2) != 16382) {
                    h0Var.zzj();
                    throw zzbo.a("First frame does not start with sync code.", null);
                }
                h0Var.zzj();
                this.f8079j = iZ;
                i0 i0Var3 = this.f8073d;
                int i13 = yn0.f10944a;
                long jZzf = h0Var.zzf();
                long jZzd = h0Var.zzd();
                m0 m0Var = this.f8077h;
                m0Var.getClass();
                if (m0Var.f6794k != null) {
                    l0Var = new l0(m0Var, jZzf, 0);
                    i0Var2 = i0Var3;
                } else {
                    if (jZzd == -1 || m0Var.f6793j <= 0) {
                        i0Var = i0Var3;
                        l0Var = new l0(m0Var.a(), 0L);
                    } else {
                        int i14 = this.f8079j;
                        aa aaVar = new aa(i, m0Var);
                        xg xgVar2 = new xg(m0Var, i14);
                        long jA = m0Var.a();
                        long j13 = m0Var.f6793j;
                        int i15 = m0Var.f6786c;
                        int i16 = m0Var.f6787d;
                        if (i16 > 0) {
                            xgVar = xgVar2;
                            i0Var = i0Var3;
                            j10 = ((((long) i16) + ((long) i15)) / 2) + 1;
                        } else {
                            xgVar = xgVar2;
                            int i17 = m0Var.f6785b;
                            long j14 = 4096;
                            int i18 = m0Var.f6784a;
                            if (i18 == i17 && i18 > 0) {
                                j14 = i18;
                            }
                            i0Var = i0Var3;
                            j10 = (((j14 * ((long) m0Var.f6790g)) * ((long) m0Var.f6791h)) / 8) + 64;
                        }
                        p1 p1Var = new p1(aaVar, xgVar, jA, j13, jZzf, jZzd, j10, Math.max(6, i15));
                        this.f8080k = p1Var;
                        l0Var = p1Var.f10688a;
                    }
                    i0Var2 = i0Var;
                }
                i0Var2.p(l0Var);
                this.f8075f = 5;
                return 0;
            }
            this.f8074e.getClass();
            m0 m0Var2 = this.f8077h;
            m0Var2.getClass();
            p1 p1Var2 = this.f8080k;
            if (p1Var2 != null && p1Var2.f10690c != null) {
                return p1Var2.a(h0Var2, k0Var);
            }
            if (this.f8082m == -1) {
                h0Var.zzj();
                a0 a0Var = (a0) h0Var2;
                a0Var.i(1, false);
                byte[] bArr2 = new byte[1];
                a0Var.m(bArr2, 0, 1, false);
                int i19 = bArr2[0] & 1;
                boolean z9 = 1 == i19;
                a0Var.i(2, false);
                i = 1 != i19 ? 6 : 7;
                ik0 ik0Var3 = new ik0(i);
                byte[] bArr3 = ik0Var3.f5633a;
                int i20 = 0;
                while (i20 < i) {
                    int iL = h0Var2.l(i20, bArr3, i - i20);
                    if (iL == -1) {
                        break;
                    }
                    i20 += iL;
                }
                ik0Var3.h(i20);
                h0Var.zzj();
                try {
                    long jF = ik0Var3.F();
                    if (!z9) {
                        jF *= (long) m0Var2.f6785b;
                    }
                    j12 = jF;
                } catch (NumberFormatException unused) {
                    i = 0;
                }
                if (i == 0) {
                    throw zzbo.a(null, null);
                }
                this.f8082m = j12;
                return 0;
            }
            ik0 ik0Var4 = this.f8071b;
            int i21 = ik0Var4.f5635c;
            if (i21 < 32768) {
                int iB = h0Var2.b(i21, ik0Var4.f5633a, 32768 - i21);
                i = iB != -1 ? 0 : 1;
                if (i == 0) {
                    ik0Var4.h(i21 + iB);
                } else if (ik0Var4.n() == 0) {
                    long j15 = this.f8082m * 1000000;
                    m0 m0Var3 = this.f8077h;
                    int i22 = yn0.f10944a;
                    this.f8074e.e(j15 / ((long) m0Var3.f6788e), 1, this.f8081l, 0, null);
                    return -1;
                }
            } else {
                i = 0;
            }
            int i23 = ik0Var4.f5634b;
            int i24 = this.f8081l;
            int i25 = this.f8078i;
            if (i24 < i25) {
                ik0Var4.j(Math.min(i25 - i24, ik0Var4.n()));
            }
            this.f8077h.getClass();
            int i26 = ik0Var4.f5634b;
            while (true) {
                int i27 = ik0Var4.f5635c - 16;
                k0 k0Var2 = this.f8072c;
                if (i26 <= i27) {
                    ik0Var4.i(i26);
                    if (z3.a.f0(ik0Var4, this.f8077h, this.f8079j, k0Var2)) {
                        ik0Var4.i(i26);
                        j11 = k0Var2.f6130a;
                        break;
                    }
                    i26++;
                } else {
                    if (i != 0) {
                        while (true) {
                            int i28 = ik0Var4.f5635c;
                            if (i26 > i28 - this.f8078i) {
                                ik0Var4.i(i28);
                                break;
                            }
                            ik0Var4.i(i26);
                            try {
                                zF0 = z3.a.f0(ik0Var4, this.f8077h, this.f8079j, k0Var2);
                            } catch (IndexOutOfBoundsException unused2) {
                                zF0 = false;
                            }
                            if (ik0Var4.f5634b <= ik0Var4.f5635c && zF0) {
                                ik0Var4.i(i26);
                                j11 = k0Var2.f6130a;
                                break;
                            }
                            i26++;
                        }
                    } else {
                        ik0Var4.i(i26);
                    }
                    j11 = -1;
                }
            }
            int i29 = ik0Var4.f5634b - i23;
            ik0Var4.i(i23);
            this.f8074e.f(i29, ik0Var4);
            int i30 = this.f8081l + i29;
            this.f8081l = i30;
            if (j11 != -1) {
                long j16 = this.f8082m * 1000000;
                m0 m0Var4 = this.f8077h;
                int i31 = yn0.f10944a;
                this.f8074e.e(j16 / ((long) m0Var4.f6788e), 1, i30, 0, null);
                this.f8081l = 0;
                this.f8082m = j11;
            }
            if (ik0Var4.n() >= 16) {
                return 0;
            }
            int iN = ik0Var4.n();
            byte[] bArr4 = ik0Var4.f5633a;
            System.arraycopy(bArr4, ik0Var4.f5634b, bArr4, 0, iN);
            ik0Var4.i(0);
            ik0Var4.h(iN);
            return 0;
        }
        m0 m0Var5 = this.f8077h;
        while (true) {
            h0Var.zzj();
            d1 d1Var = new d1(new byte[i12], i12);
            a0 a0Var2 = (a0) h0Var2;
            a0Var2.m(d1Var.f3531c, 0, i12, false);
            boolean zO = d1Var.o();
            int iE = d1Var.e(i);
            int iE2 = d1Var.e(24) + i12;
            if (iE == 0) {
                byte[] bArr5 = new byte[38];
                a0Var2.h(bArr5, 0, 38, false);
                m0Var5 = new m0(bArr5, i12);
            } else {
                if (m0Var5 == null) {
                    throw new IllegalArgumentException();
                }
                if (iE == i11) {
                    ik0 ik0Var5 = new ik0(iE2);
                    a0Var2.h(ik0Var5.f5633a, 0, iE2, false);
                    m0Var5 = new m0(m0Var5.f6784a, m0Var5.f6785b, m0Var5.f6786c, m0Var5.f6787d, m0Var5.f6788e, m0Var5.f6790g, m0Var5.f6791h, m0Var5.f6793j, t3.i.I(ik0Var5), m0Var5.f6795l);
                } else {
                    zzbk zzbkVar2 = m0Var5.f6795l;
                    if (iE == 4) {
                        ik0 ik0Var6 = new ik0(iE2);
                        a0Var2.h(ik0Var6.f5633a, 0, iE2, false);
                        ik0Var6.j(4);
                        zzbk zzbkVarC0 = b4.f.c0(Arrays.asList((String[]) b4.f.i0(ik0Var6, false, false).f6060b));
                        if (zzbkVar2 != null) {
                            zzbkVarC0 = zzbkVar2.e(zzbkVarC0);
                        }
                        m0Var5 = new m0(m0Var5.f6784a, m0Var5.f6785b, m0Var5.f6786c, m0Var5.f6787d, m0Var5.f6788e, m0Var5.f6790g, m0Var5.f6791h, m0Var5.f6793j, m0Var5.f6794k, zzbkVarC0);
                    } else if (iE == 6) {
                        ik0 ik0Var7 = new ik0(iE2);
                        a0Var2.h(ik0Var7.f5633a, 0, iE2, false);
                        ik0Var7.j(4);
                        zzbk zzbkVar3 = new zzbk(bz0.n(zzafj.b(ik0Var7)));
                        if (zzbkVar2 != null) {
                            zzbkVar3 = zzbkVar2.e(zzbkVar3);
                        }
                        m0Var5 = new m0(m0Var5.f6784a, m0Var5.f6785b, m0Var5.f6786c, m0Var5.f6787d, m0Var5.f6788e, m0Var5.f6790g, m0Var5.f6791h, m0Var5.f6793j, m0Var5.f6794k, zzbkVar3);
                    } else {
                        a0Var2.j(iE2);
                    }
                }
            }
            int i32 = yn0.f10944a;
            this.f8077h = m0Var5;
            if (zO) {
                this.f8078i = Math.max(m0Var5.f6786c, 6);
                this.f8074e.c(this.f8077h.b(bArr, this.f8076g));
                this.f8075f = 4;
                return 0;
            }
            h0Var2 = h0Var;
            i11 = 3;
            i12 = 4;
            i = 7;
        }
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final void e(i0 i0Var) {
        this.f8073d = i0Var;
        this.f8074e = i0Var.j(0, 1);
        i0Var.i();
    }

    @Override // com.google.android.gms.internal.ads.g0
    public final boolean f(h0 h0Var) {
        zzbk zzbkVarA = new r0(0).a(h0Var, tc1.f9126x);
        if (zzbkVarA != null) {
            int length = zzbkVarA.f11487a.length;
        }
        ik0 ik0Var = new ik0(4);
        ((a0) h0Var).m(ik0Var.f5633a, 0, 4, false);
        return ik0Var.D() == 1716281667;
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
