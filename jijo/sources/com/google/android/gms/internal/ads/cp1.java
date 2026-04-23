package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import java.io.EOFException;

/* JADX INFO: loaded from: classes.dex */
public final class cp1 implements b1 {
    public oi1 A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zo1 f3359a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rm1 f3362d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public bp1 f3363e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1 f3364f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f3372n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f3373o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f3374p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f3375q;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3379u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public y1 f3382x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3384z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f3360b = new e4();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3365g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long[] f3366h = new long[1000];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long[] f3367i = new long[1000];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long[] f3370l = new long[1000];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f3369k = new int[1000];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f3368j = new int[1000];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public a1[] f3371m = new a1[1000];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hp1 f3361c = new hp1(new jk1(29, (Object) null));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f3376r = Long.MIN_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f3377s = Long.MIN_VALUE;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f3378t = Long.MIN_VALUE;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3381w = true;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3380v = true;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f3383y = true;

    public cp1(iq1 iq1Var, rm1 rm1Var) {
        this.f3362d = rm1Var;
        this.f3359a = new zo1(iq1Var);
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void a(ik0 ik0Var, int i10, int i11) {
        while (true) {
            zo1 zo1Var = this.f3359a;
            if (i10 <= 0) {
                zo1Var.getClass();
                return;
            }
            int iB = zo1Var.b(i10);
            v2 v2Var = zo1Var.f11284d;
            ik0Var.e(v2Var.a(zo1Var.f11285e), ((fq1) v2Var.f9735d).f4599a, iB);
            i10 -= iB;
            long j10 = zo1Var.f11285e + ((long) iB);
            zo1Var.f11285e = j10;
            v2 v2Var2 = zo1Var.f11284d;
            if (j10 == v2Var2.f9734b) {
                zo1Var.f11284d = (v2) v2Var2.f9736f;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final int b(nl1 nl1Var, int i10, boolean z9) throws EOFException {
        zo1 zo1Var = this.f3359a;
        int iB = zo1Var.b(i10);
        v2 v2Var = zo1Var.f11284d;
        int iB2 = nl1Var.b(v2Var.a(zo1Var.f11285e), ((fq1) v2Var.f9735d).f4599a, iB);
        if (iB2 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        long j10 = zo1Var.f11285e + ((long) iB2);
        zo1Var.f11285e = j10;
        v2 v2Var2 = zo1Var.f11284d;
        if (j10 != v2Var2.f9734b) {
            return iB2;
        }
        zo1Var.f11284d = (v2) v2Var2.f9736f;
        return iB2;
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void c(y1 y1Var) {
        boolean z9;
        synchronized (this) {
            z9 = false;
            try {
                this.f3381w = false;
                if (!yn0.c(y1Var, this.f3382x)) {
                    if (this.f3361c.f5366b.size() != 0) {
                        if (((ap1) this.f3361c.f5366b.valueAt(r1.size() - 1)).f2763a.equals(y1Var)) {
                            this.f3382x = ((ap1) this.f3361c.f5366b.valueAt(r4.size() - 1)).f2763a;
                        }
                        boolean z10 = this.f3383y;
                        y1 y1Var2 = this.f3382x;
                        this.f3383y = z10 & xm.f(y1Var2.f10714m, y1Var2.f10711j);
                        this.f3384z = false;
                        z9 = true;
                    }
                    this.f3382x = y1Var;
                    boolean z102 = this.f3383y;
                    y1 y1Var22 = this.f3382x;
                    this.f3383y = z102 & xm.f(y1Var22.f10714m, y1Var22.f10711j);
                    this.f3384z = false;
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        bp1 bp1Var = this.f3363e;
        if (bp1Var == null || !z9) {
            return;
        }
        wo1 wo1Var = (wo1) bp1Var;
        wo1Var.f10271y.post(wo1Var.f10269w);
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final int d(nl1 nl1Var, int i10, boolean z9) {
        return b(nl1Var, i10, z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010d A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:21:0x003d, B:23:0x0042, B:27:0x0058, B:30:0x005f, B:34:0x0067, B:39:0x00b5, B:41:0x00ba, B:43:0x00cc, B:47:0x00d5, B:48:0x00da, B:50:0x00e0, B:54:0x00ee, B:56:0x00f3, B:57:0x0101, B:58:0x0104, B:60:0x010d, B:37:0x009c), top: B:65:0x003d }] */
    @Override // com.google.android.gms.internal.ads.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(long r10, int r12, int r13, int r14, com.google.android.gms.internal.ads.a1 r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cp1.e(long, int, int, int, com.google.android.gms.internal.ads.a1):void");
    }

    @Override // com.google.android.gms.internal.ads.b1
    public final void f(int i10, ik0 ik0Var) {
        a(ik0Var, i10, 0);
    }

    public final int g(int i10, int i11, long j10, boolean z9) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f3370l[i10];
            if (j11 > j10) {
                break;
            }
            if (!z9 || (this.f3369k[i10] & 1) != 0) {
                i12 = i13;
                if (j11 == j10) {
                    break;
                }
            }
            i10++;
            if (i10 == this.f3365g) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final int h(int i10) {
        int i11 = this.f3374p + i10;
        int i12 = this.f3365g;
        return i11 < i12 ? i11 : i11 - i12;
    }

    public final long i(int i10) {
        long j10 = this.f3377s;
        long jMax = Long.MIN_VALUE;
        int i11 = 0;
        if (i10 != 0) {
            int iH = h(i10 - 1);
            for (int i12 = 0; i12 < i10; i12++) {
                jMax = Math.max(jMax, this.f3370l[iH]);
                if ((this.f3369k[iH] & 1) != 0) {
                    break;
                }
                iH--;
                if (iH == -1) {
                    iH = this.f3365g - 1;
                }
            }
        }
        this.f3377s = Math.max(j10, jMax);
        this.f3372n -= i10;
        int i13 = this.f3373o + i10;
        this.f3373o = i13;
        int i14 = this.f3374p + i10;
        this.f3374p = i14;
        int i15 = this.f3365g;
        if (i14 >= i15) {
            this.f3374p = i14 - i15;
        }
        int i16 = this.f3375q - i10;
        this.f3375q = i16;
        if (i16 < 0) {
            this.f3375q = 0;
        }
        while (true) {
            hp1 hp1Var = this.f3361c;
            SparseArray sparseArray = hp1Var.f5366b;
            if (i11 >= sparseArray.size() - 1) {
                break;
            }
            int i17 = i11 + 1;
            if (i13 < sparseArray.keyAt(i17)) {
                break;
            }
            hp1Var.f5367c.mo0zza(sparseArray.valueAt(i11));
            sparseArray.removeAt(i11);
            int i18 = hp1Var.f5365a;
            if (i18 > 0) {
                hp1Var.f5365a = i18 - 1;
            }
            i11 = i17;
        }
        if (this.f3372n != 0) {
            return this.f3367i[this.f3374p];
        }
        int i19 = this.f3374p;
        if (i19 == 0) {
            i19 = this.f3365g;
        }
        int i20 = i19 - 1;
        return this.f3367i[i20] + ((long) this.f3368j[i20]);
    }

    public final void j(y1 y1Var, cj0 cj0Var) {
        y1 y1Var2 = this.f3364f;
        zzy zzyVar = y1Var2 == null ? null : y1Var2.f10717p;
        this.f3364f = y1Var;
        zzy zzyVar2 = y1Var.f10717p;
        ((jk1) this.f3362d).getClass();
        zzy zzyVar3 = y1Var.f10717p;
        int i10 = zzyVar3 != null ? 1 : 0;
        q0 q0Var = new q0(y1Var);
        q0Var.F = i10;
        cj0Var.f3301b = new y1(q0Var);
        cj0Var.f3302d = this.A;
        if (y1Var2 == null || !yn0.c(zzyVar, zzyVar2)) {
            oi1 oi1Var = zzyVar3 != null ? new oi1(2, new zzrb(new zzrl())) : null;
            this.A = oi1Var;
            cj0Var.f3302d = oi1Var;
        }
    }

    public final synchronized void k() {
        this.f3375q = 0;
        zo1 zo1Var = this.f3359a;
        zo1Var.f11283c = zo1Var.f11282b;
    }

    public final synchronized long l() {
        return this.f3378t;
    }

    public final synchronized y1 m() {
        if (this.f3381w) {
            return null;
        }
        return this.f3382x;
    }

    public final void n() {
        long jI;
        zo1 zo1Var = this.f3359a;
        synchronized (this) {
            int i10 = this.f3372n;
            jI = i10 == 0 ? -1L : i(i10);
        }
        zo1Var.a(jI);
    }

    public final void o(boolean z9) {
        SparseArray sparseArray;
        zo1 zo1Var = this.f3359a;
        v2 v2Var = zo1Var.f11282b;
        if (((fq1) v2Var.f9735d) != null) {
            iq1 iq1Var = zo1Var.f11286f;
            synchronized (iq1Var) {
                v2 v2Var2 = v2Var;
                while (v2Var2 != null) {
                    try {
                        fq1[] fq1VarArr = (fq1[]) iq1Var.f5677c;
                        int i10 = iq1Var.f5678d;
                        iq1Var.f5678d = i10 + 1;
                        fq1 fq1Var = (fq1) v2Var2.f9735d;
                        fq1Var.getClass();
                        fq1VarArr[i10] = fq1Var;
                        iq1Var.f5676b--;
                        v2Var2 = (v2) v2Var2.f9736f;
                        if (v2Var2 == null || ((fq1) v2Var2.f9735d) == null) {
                            v2Var2 = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iq1Var.notifyAll();
            }
            v2Var.f9735d = null;
            v2Var.f9736f = null;
        }
        v2 v2Var3 = zo1Var.f11282b;
        int i11 = 0;
        tc1.W(((fq1) v2Var3.f9735d) == null);
        v2Var3.f9733a = 0L;
        v2Var3.f9734b = 65536L;
        v2 v2Var4 = zo1Var.f11282b;
        zo1Var.f11283c = v2Var4;
        zo1Var.f11284d = v2Var4;
        zo1Var.f11285e = 0L;
        zo1Var.f11286f.g();
        this.f3372n = 0;
        this.f3373o = 0;
        this.f3374p = 0;
        this.f3375q = 0;
        this.f3380v = true;
        this.f3376r = Long.MIN_VALUE;
        this.f3377s = Long.MIN_VALUE;
        this.f3378t = Long.MIN_VALUE;
        this.f3379u = false;
        hp1 hp1Var = this.f3361c;
        while (true) {
            sparseArray = hp1Var.f5366b;
            if (i11 >= sparseArray.size()) {
                break;
            }
            hp1Var.f5367c.mo0zza(sparseArray.valueAt(i11));
            i11++;
        }
        hp1Var.f5365a = -1;
        sparseArray.clear();
        if (z9) {
            this.f3382x = null;
            this.f3381w = true;
            this.f3383y = true;
        }
    }

    public final synchronized void p(int i10) {
        boolean z9 = false;
        if (i10 >= 0) {
            try {
                if (this.f3375q + i10 <= this.f3372n) {
                    z9 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        tc1.K(z9);
        this.f3375q += i10;
    }

    public final synchronized boolean q(boolean z9) {
        int i10 = this.f3375q;
        boolean z10 = false;
        if (i10 != this.f3372n) {
            if (((ap1) this.f3361c.a(this.f3373o + i10)).f2763a != this.f3364f) {
                return true;
            }
            int iH = h(this.f3375q);
            if (this.A != null) {
                int i11 = this.f3369k[iH] & 1073741824;
            } else {
                z10 = true;
            }
            return z10;
        }
        if (z9 || this.f3379u) {
            z10 = true;
        } else {
            y1 y1Var = this.f3382x;
            if (y1Var != null) {
                if (y1Var == this.f3364f) {
                    return false;
                }
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0001, B:8:0x0017, B:10:0x001f, B:14:0x0028, B:16:0x002d, B:18:0x0031, B:20:0x0039, B:23:0x0040, B:33:0x0057, B:30:0x004c), top: B:40:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0001, B:8:0x0017, B:10:0x001f, B:14:0x0028, B:16:0x002d, B:18:0x0031, B:20:0x0039, B:23:0x0040, B:33:0x0057, B:30:0x004c), top: B:40:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057 A[Catch: all -> 0x0043, TRY_LEAVE, TryCatch #0 {all -> 0x0043, blocks: (B:3:0x0001, B:8:0x0017, B:10:0x001f, B:14:0x0028, B:16:0x002d, B:18:0x0031, B:20:0x0039, B:23:0x0040, B:33:0x0057, B:30:0x004c), top: B:40:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean r(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            r10.k()     // Catch: java.lang.Throwable -> L43
            int r0 = r10.f3375q     // Catch: java.lang.Throwable -> L43
            int r2 = r10.h(r0)     // Catch: java.lang.Throwable -> L43
            int r1 = r10.f3375q     // Catch: java.lang.Throwable -> L43
            int r3 = r10.f3372n     // Catch: java.lang.Throwable -> L43
            r7 = 0
            r8 = 1
            if (r1 == r3) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L60
            long[] r1 = r10.f3370l     // Catch: java.lang.Throwable -> L43
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L43
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 < 0) goto L60
            long r4 = r10.f3378t     // Catch: java.lang.Throwable -> L43
            int r1 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r1 <= 0) goto L28
            if (r13 == 0) goto L60
            r13 = 1
        L28:
            boolean r1 = r10.f3383y     // Catch: java.lang.Throwable -> L43
            r9 = -1
            if (r1 == 0) goto L4c
            int r3 = r3 - r0
            r0 = 0
        L2f:
            if (r0 >= r3) goto L47
            long[] r1 = r10.f3370l     // Catch: java.lang.Throwable -> L43
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L43
            int r1 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r1 >= 0) goto L45
            int r2 = r2 + 1
            int r1 = r10.f3365g     // Catch: java.lang.Throwable -> L43
            if (r2 != r1) goto L40
            r2 = 0
        L40:
            int r0 = r0 + 1
            goto L2f
        L43:
            r11 = move-exception
            goto L62
        L45:
            r3 = r0
            goto L54
        L47:
            if (r13 == 0) goto L4a
            goto L54
        L4a:
            r3 = -1
            goto L54
        L4c:
            int r3 = r3 - r0
            r6 = 1
            r1 = r10
            r4 = r11
            int r3 = r1.g(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L43
        L54:
            if (r3 != r9) goto L57
            goto L60
        L57:
            r10.f3376r = r11     // Catch: java.lang.Throwable -> L43
            int r11 = r10.f3375q     // Catch: java.lang.Throwable -> L43
            int r11 = r11 + r3
            r10.f3375q = r11     // Catch: java.lang.Throwable -> L43
            monitor-exit(r10)
            return r8
        L60:
            monitor-exit(r10)
            return r7
        L62:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.cp1.r(long, boolean):boolean");
    }
}
