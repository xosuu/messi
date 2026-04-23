package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class p3 implements u3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t3 f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7773b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7774d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w3 f7775f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7776h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f7777q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f7778s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f7779t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f7780u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f7781v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f7782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f7783x;

    public p3(w3 w3Var, long j10, long j11, long j12, long j13, boolean z9) {
        tc1.K(j10 >= 0 && j11 > j10);
        this.f7775f = w3Var;
        this.f7773b = j10;
        this.f7774d = j11;
        if (j12 == j11 - j10 || z9) {
            this.f7777q = j13;
            this.f7776h = 4;
        } else {
            this.f7776h = 0;
        }
        this.f7772a = new t3();
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final void b(long j10) {
        this.f7779t = Math.max(0L, Math.min(j10, this.f7777q - 1));
        this.f7776h = 2;
        this.f7780u = this.f7773b;
        this.f7781v = this.f7774d;
        this.f7782w = 0L;
        this.f7783x = this.f7777q;
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final long d(h0 h0Var) throws IOException {
        long j10;
        long jMax;
        int i10 = this.f7776h;
        long j11 = this.f7774d;
        t3 t3Var = this.f7772a;
        if (i10 == 0) {
            long jZzf = h0Var.zzf();
            this.f7778s = jZzf;
            this.f7776h = 1;
            long j12 = (-65307) + j11;
            if (j12 > jZzf) {
                return j12;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long j13 = this.f7780u;
                long j14 = this.f7781v;
                if (j13 == j14) {
                    j10 = -1;
                    jMax = -1;
                } else {
                    long jZzf2 = h0Var.zzf();
                    if (t3Var.b(h0Var, j14)) {
                        t3Var.a(h0Var, false);
                        h0Var.zzj();
                        long j15 = this.f7779t;
                        long j16 = t3Var.f9038b;
                        long j17 = j15 - j16;
                        int i11 = t3Var.f9040d + t3Var.f9041e;
                        if (j17 < 0 || j17 >= 72000) {
                            if (j17 < 0) {
                                this.f7781v = jZzf2;
                                this.f7783x = j16;
                            } else {
                                this.f7780u = h0Var.zzf() + ((long) i11);
                                this.f7782w = j16;
                            }
                            long j18 = this.f7781v;
                            long j19 = this.f7780u;
                            long j20 = j18 - j19;
                            if (j20 < 100000) {
                                this.f7781v = j19;
                                jMax = j19;
                                j10 = -1;
                            } else {
                                j10 = -1;
                                jMax = Math.max(j19, Math.min(((j17 * j20) / (this.f7783x - this.f7782w)) + (h0Var.zzf() - (((long) i11) * (j17 <= 0 ? 2L : 1L))), j18 - 1));
                            }
                        } else {
                            j10 = -1;
                            jMax = -1;
                        }
                    } else {
                        long j21 = this.f7780u;
                        if (j21 == jZzf2) {
                            throw new IOException("No ogg page can be found.");
                        }
                        jMax = j21;
                        j10 = -1;
                    }
                }
                if (jMax != j10) {
                    return jMax;
                }
                this.f7776h = 3;
            } else {
                if (i10 != 3) {
                    return -1L;
                }
                j10 = -1;
            }
            while (true) {
                t3Var.b(h0Var, j10);
                t3Var.a(h0Var, false);
                if (t3Var.f9038b > this.f7779t) {
                    h0Var.zzj();
                    this.f7776h = 4;
                    return -(this.f7782w + 2);
                }
                ((a0) h0Var).j(t3Var.f9040d + t3Var.f9041e);
                this.f7780u = h0Var.zzf();
                this.f7782w = t3Var.f9038b;
                j10 = -1;
            }
        }
        t3Var.f9037a = 0;
        t3Var.f9038b = 0L;
        t3Var.f9039c = 0;
        t3Var.f9040d = 0;
        t3Var.f9041e = 0;
        if (!t3Var.b(h0Var, -1L)) {
            throw new EOFException();
        }
        t3Var.a(h0Var, false);
        ((a0) h0Var).j(t3Var.f9040d + t3Var.f9041e);
        long j22 = t3Var.f9038b;
        while ((t3Var.f9037a & 4) != 4 && t3Var.b(h0Var, -1L) && h0Var.zzf() < j11 && t3Var.a(h0Var, true)) {
            try {
                ((a0) h0Var).j(t3Var.f9040d + t3Var.f9041e);
                j22 = t3Var.f9038b;
            } catch (EOFException unused) {
            }
        }
        this.f7777q = j22;
        this.f7776h = 4;
        return this.f7778s;
    }

    @Override // com.google.android.gms.internal.ads.u3
    public final /* bridge */ /* synthetic */ v0 zze() {
        if (this.f7777q != 0) {
            return new o3(this);
        }
        return null;
    }
}
