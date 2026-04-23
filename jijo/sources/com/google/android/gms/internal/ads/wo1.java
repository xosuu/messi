package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class wo1 implements io1, i0, lq1, nq1, bp1 {
    public static final Map X;
    public static final y1 Y;
    public zzafn A;
    public cp1[] B;
    public vo1[] C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public un1 H;
    public v0 I;
    public long J;
    public boolean K;
    public int L;
    public boolean M;
    public boolean N;
    public int O;
    public boolean P;
    public long Q;
    public long R;
    public boolean S;
    public int T;
    public boolean U;
    public boolean V;
    public final iq1 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f10259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hw0 f10260b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rm1 f10261d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pm1 f10262f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final yo1 f10263h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f10264q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f10265s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ep f10267u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler f10271y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ho1 f10272z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final oq1 f10266t = new oq1();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c8.a f10268v = new c8.a(0);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ro1 f10269w = new ro1(this, 1);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ro1 f10270x = new ro1(this, 2);

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        X = Collections.unmodifiableMap(map);
        q0 q0Var = new q0();
        q0Var.f8041a = "icy";
        q0Var.f("application/x-icy");
        Y = new y1(q0Var);
    }

    public wo1(Uri uri, hw0 hw0Var, ep epVar, rm1 rm1Var, pm1 pm1Var, pm1 pm1Var2, yo1 yo1Var, iq1 iq1Var, int i10, long j10) {
        this.f10259a = uri;
        this.f10260b = hw0Var;
        this.f10261d = rm1Var;
        this.f10262f = pm1Var2;
        this.f10263h = yo1Var;
        this.W = iq1Var;
        this.f10264q = i10;
        this.f10267u = epVar;
        this.f10265s = j10;
        Looper looperMyLooper = Looper.myLooper();
        tc1.A(looperMyLooper);
        this.f10271y = new Handler(looperMyLooper, null);
        this.C = new vo1[0];
        this.B = new cp1[0];
        this.R = -9223372036854775807L;
        this.L = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    @Override // com.google.android.gms.internal.ads.io1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(long r10) {
        /*
            r9 = this;
            r9.o()
            com.google.android.gms.internal.ads.un1 r0 = r9.H
            java.lang.Object r0 = r0.f9544b
            boolean[] r0 = (boolean[]) r0
            com.google.android.gms.internal.ads.v0 r1 = r9.I
            boolean r1 = r1.zzh()
            r2 = 1
            if (r2 == r1) goto L14
            r10 = 0
        L14:
            r1 = 0
            r9.N = r1
            r9.Q = r10
            boolean r2 = r9.u()
            if (r2 == 0) goto L22
            r9.R = r10
            return r10
        L22:
            int r2 = r9.L
            r3 = 7
            if (r2 == r3) goto L66
            com.google.android.gms.internal.ads.cp1[] r2 = r9.B
            int r2 = r2.length
            r3 = 0
        L2b:
            if (r3 >= r2) goto L9c
            com.google.android.gms.internal.ads.cp1[] r4 = r9.B
            r4 = r4[r3]
            boolean r5 = r9.G
            if (r5 == 0) goto L54
            int r5 = r4.f3373o
            monitor-enter(r4)
            r4.k()     // Catch: java.lang.Throwable -> L4e
            int r6 = r4.f3373o     // Catch: java.lang.Throwable -> L4e
            if (r5 < r6) goto L50
            int r7 = r4.f3372n     // Catch: java.lang.Throwable -> L4e
            int r7 = r7 + r6
            if (r5 <= r7) goto L45
            goto L50
        L45:
            r7 = -9223372036854775808
            r4.f3376r = r7     // Catch: java.lang.Throwable -> L4e
            int r5 = r5 - r6
            r4.f3375q = r5     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r4)
            goto L63
        L4e:
            r10 = move-exception
            goto L52
        L50:
            monitor-exit(r4)
            goto L5a
        L52:
            monitor-exit(r4)
            throw r10
        L54:
            boolean r4 = r4.r(r10, r1)
            if (r4 != 0) goto L63
        L5a:
            boolean r4 = r0[r3]
            if (r4 != 0) goto L66
            boolean r4 = r9.F
            if (r4 != 0) goto L63
            goto L66
        L63:
            int r3 = r3 + 1
            goto L2b
        L66:
            r9.S = r1
            r9.R = r10
            r9.U = r1
            com.google.android.gms.internal.ads.oq1 r0 = r9.f10266t
            com.google.android.gms.internal.ads.mq1 r2 = r0.f7639b
            if (r2 == 0) goto L8b
            com.google.android.gms.internal.ads.cp1[] r0 = r9.B
            int r2 = r0.length
            r3 = 0
        L76:
            if (r3 >= r2) goto L80
            r4 = r0[r3]
            r4.n()
            int r3 = r3 + 1
            goto L76
        L80:
            com.google.android.gms.internal.ads.oq1 r0 = r9.f10266t
            com.google.android.gms.internal.ads.mq1 r0 = r0.f7639b
            com.google.android.gms.internal.ads.tc1.A(r0)
            r0.a(r1)
            goto L9c
        L8b:
            r2 = 0
            r0.f7640c = r2
            com.google.android.gms.internal.ads.cp1[] r0 = r9.B
            int r2 = r0.length
            r3 = 0
        L92:
            if (r3 >= r2) goto L9c
            r4 = r0[r3]
            r4.o(r1)
            int r3 = r3 + 1
            goto L92
        L9c:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wo1.a(long):long");
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final void b(long j10) {
    }

    public final void c(to1 to1Var, long j10, long j11, boolean z9) {
        Uri uri = to1Var.f9210b.f3243d;
        this.f10262f.b(new bo1(), new gk1(-1, (y1) null, yn0.x(to1Var.f9217i), yn0.x(this.J)));
        if (z9) {
            return;
        }
        for (cp1 cp1Var : this.B) {
            cp1Var.o(false);
        }
        if (this.O > 0) {
            ho1 ho1Var = this.f10272z;
            ho1Var.getClass();
            ho1Var.c(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void d(long j10) {
        long jI;
        int i10;
        if (this.G) {
            return;
        }
        o();
        if (u()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.H.f9545d;
        int length = this.B.length;
        for (int i11 = 0; i11 < length; i11++) {
            cp1 cp1Var = this.B[i11];
            boolean z9 = zArr[i11];
            zo1 zo1Var = cp1Var.f3359a;
            synchronized (cp1Var) {
                try {
                    int i12 = cp1Var.f3372n;
                    if (i12 != 0) {
                        long[] jArr = cp1Var.f3370l;
                        int i13 = cp1Var.f3374p;
                        if (j10 >= jArr[i13]) {
                            int iG = cp1Var.g(i13, (!z9 || (i10 = cp1Var.f3375q) == i12) ? i12 : i10 + 1, j10, false);
                            jI = iG != -1 ? cp1Var.i(iG) : -1L;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            zo1Var.a(jI);
        }
    }

    public final void e(to1 to1Var, long j10, long j11) {
        v0 v0Var;
        if (this.J == -9223372036854775807L && (v0Var = this.I) != null) {
            boolean zZzh = v0Var.zzh();
            long jM = m(true);
            long j12 = jM == Long.MIN_VALUE ? 0L : jM + 10000;
            this.J = j12;
            this.f10263h.s(j12, zZzh, this.K);
        }
        Uri uri = to1Var.f9210b.f3243d;
        this.f10262f.c(new bo1(), new gk1(-1, (y1) null, yn0.x(to1Var.f9217i), yn0.x(this.J)));
        this.U = true;
        ho1 ho1Var = this.f10272z;
        ho1Var.getClass();
        ho1Var.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[PHI: r14
      0x0044: PHI (r14v1 long) = (r14v0 long), (r14v5 long), (r14v0 long) binds: [B:14:0x003a, B:23:0x004d, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.internal.ads.io1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f(com.google.android.gms.internal.ads.cq1[] r10, boolean[] r11, com.google.android.gms.internal.ads.dp1[] r12, boolean[] r13, long r14) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wo1.f(com.google.android.gms.internal.ads.cq1[], boolean[], com.google.android.gms.internal.ads.dp1[], boolean[], long):long");
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean g(fj1 fj1Var) {
        if (this.U) {
            return false;
        }
        oq1 oq1Var = this.f10266t;
        if (oq1Var.f7640c != null || this.S) {
            return false;
        }
        if (this.E && this.O == 0) {
            return false;
        }
        boolean zC = this.f10268v.c();
        if (oq1Var.f7639b != null) {
            return zC;
        }
        t();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void h(ho1 ho1Var, long j10) {
        this.f10272z = ho1Var;
        this.f10268v.c();
        t();
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void i() {
        this.D = true;
        this.f10271y.post(this.f10269w);
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final b1 j(int i10, int i11) {
        return n(new vo1(i10, false));
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long k(long j10, ak1 ak1Var) {
        o();
        if (!this.I.zzh()) {
            return 0L;
        }
        u0 u0VarB = this.I.b(j10);
        w0 w0Var = u0VarB.f9329a;
        long j11 = ak1Var.f2721a;
        long j12 = ak1Var.f2722b;
        if (j11 == 0) {
            if (j12 == 0) {
                return j10;
            }
            j11 = 0;
        }
        long j13 = w0Var.f10015a;
        int i10 = yn0.f10944a;
        long j14 = j10 - j11;
        long j15 = j10 + j12;
        long j16 = j10 ^ j15;
        long j17 = j12 ^ j15;
        if (((j10 ^ j11) & (j10 ^ j14)) < 0) {
            j14 = Long.MIN_VALUE;
        }
        if ((j16 & j17) < 0) {
            j15 = Long.MAX_VALUE;
        }
        boolean z9 = j14 <= j13 && j13 <= j15;
        long j18 = u0VarB.f9330b.f10015a;
        boolean z10 = j14 <= j18 && j18 <= j15;
        return (z9 && z10) ? Math.abs(j13 - j10) <= Math.abs(j18 - j10) ? j13 : j18 : z9 ? j13 : z10 ? j18 : j14;
    }

    public final int l() {
        int i10 = 0;
        for (cp1 cp1Var : this.B) {
            i10 += cp1Var.f3373o + cp1Var.f3372n;
        }
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long m(boolean r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = -9223372036854775808
        L3:
            com.google.android.gms.internal.ads.cp1[] r3 = r5.B
            int r4 = r3.length
            if (r0 >= r4) goto L24
            if (r6 != 0) goto L17
            com.google.android.gms.internal.ads.un1 r4 = r5.H
            r4.getClass()
            java.lang.Object r4 = r4.f9545d
            boolean[] r4 = (boolean[]) r4
            boolean r4 = r4[r0]
            if (r4 == 0) goto L21
        L17:
            r3 = r3[r0]
            long r3 = r3.l()
            long r1 = java.lang.Math.max(r1, r3)
        L21:
            int r0 = r0 + 1
            goto L3
        L24:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.wo1.m(boolean):long");
    }

    public final cp1 n(vo1 vo1Var) {
        int length = this.B.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (vo1Var.equals(this.C[i10])) {
                return this.B[i10];
            }
        }
        cp1 cp1Var = new cp1(this.W, this.f10261d);
        cp1Var.f3363e = this;
        int i11 = length + 1;
        vo1[] vo1VarArr = (vo1[]) Arrays.copyOf(this.C, i11);
        vo1VarArr[length] = vo1Var;
        int i12 = yn0.f10944a;
        this.C = vo1VarArr;
        cp1[] cp1VarArr = (cp1[]) Arrays.copyOf(this.B, i11);
        cp1VarArr[length] = cp1Var;
        this.B = cp1VarArr;
        return cp1Var;
    }

    public final void o() {
        tc1.W(this.E);
        this.H.getClass();
        this.I.getClass();
    }

    @Override // com.google.android.gms.internal.ads.i0
    public final void p(v0 v0Var) {
        this.f10271y.post(new vh0(this, 19, v0Var));
    }

    public final void q() {
        long j10;
        int i10;
        y1 y1Var;
        if (this.V || this.E || !this.D || this.I == null) {
            return;
        }
        for (cp1 cp1Var : this.B) {
            synchronized (cp1Var) {
                y1Var = cp1Var.f3381w ? null : cp1Var.f3382x;
            }
            if (y1Var == null) {
                return;
            }
        }
        this.f10268v.b();
        int length = this.B.length;
        ow[] owVarArr = new ow[length];
        boolean[] zArr = new boolean[length];
        int i11 = 0;
        while (true) {
            j10 = this.f10265s;
            if (i11 >= length) {
                break;
            }
            y1 y1VarM = this.B[i11].m();
            y1VarM.getClass();
            String str = y1VarM.f10714m;
            boolean zEquals = "audio".equals(xm.h(str));
            boolean z9 = zEquals || xm.g(str);
            zArr[i11] = z9;
            this.F = z9 | this.F;
            this.G = j10 != -9223372036854775807L && length == 1 && ("image".equals(xm.h(str)) || "application/x-image-uri".equals(str));
            zzafn zzafnVar = this.A;
            if (zzafnVar != null) {
                if (zEquals || this.C[i11].f9935b) {
                    zzbk zzbkVar = y1VarM.f10712k;
                    zzbk zzbkVar2 = zzbkVar == null ? new zzbk(-9223372036854775807L, zzafnVar) : zzbkVar.d(zzafnVar);
                    q0 q0Var = new q0(y1VarM);
                    q0Var.f8050j = zzbkVar2;
                    y1VarM = new y1(q0Var);
                }
                if (zEquals && y1VarM.f10708g == -1 && y1VarM.f10709h == -1 && (i10 = zzafnVar.f11406a) != -1) {
                    q0 q0Var2 = new q0(y1VarM);
                    q0Var2.f8047g = i10;
                    y1VarM = new y1(q0Var2);
                }
            }
            ((jk1) this.f10261d).getClass();
            int i12 = y1VarM.f10717p != null ? 1 : 0;
            q0 q0Var3 = new q0(y1VarM);
            q0Var3.F = i12;
            owVarArr[i11] = new ow(Integer.toString(i11), new y1(q0Var3));
            i11++;
        }
        this.H = new un1(new kp1(owVarArr), zArr);
        if (this.G && this.J == -9223372036854775807L) {
            this.J = j10;
            this.I = new so1(this, this.I);
        }
        this.f10263h.s(this.J, this.I.zzh(), this.K);
        this.E = true;
        ho1 ho1Var = this.f10272z;
        ho1Var.getClass();
        ho1Var.e(this);
    }

    public final void r(int i10) {
        o();
        un1 un1Var = this.H;
        boolean[] zArr = (boolean[]) un1Var.f9546f;
        if (zArr[i10]) {
            return;
        }
        y1 y1Var = ((kp1) un1Var.f9543a).a(i10).f7688d[0];
        this.f10262f.a(new gk1(xm.b(y1Var.f10714m), y1Var, yn0.x(this.Q), -9223372036854775807L));
        zArr[i10] = true;
    }

    public final void s(int i10) {
        o();
        boolean[] zArr = (boolean[]) this.H.f9544b;
        if (this.S && zArr[i10] && !this.B[i10].q(false)) {
            this.R = 0L;
            this.S = false;
            this.N = true;
            this.Q = 0L;
            this.T = 0;
            for (cp1 cp1Var : this.B) {
                cp1Var.o(false);
            }
            ho1 ho1Var = this.f10272z;
            ho1Var.getClass();
            ho1Var.c(this);
        }
    }

    public final void t() {
        to1 to1Var = new to1(this, this.f10259a, this.f10260b, this.f10267u, this, this.f10268v);
        if (this.E) {
            tc1.W(u());
            long j10 = this.J;
            if (j10 != -9223372036854775807L && this.R > j10) {
                this.U = true;
                this.R = -9223372036854775807L;
                return;
            }
            v0 v0Var = this.I;
            v0Var.getClass();
            w0 w0Var = v0Var.b(this.R).f9329a;
            long j11 = this.R;
            to1Var.f9214f.f6130a = w0Var.f10016b;
            to1Var.f9217i = j11;
            to1Var.f9216h = true;
            to1Var.f9220l = false;
            for (cp1 cp1Var : this.B) {
                cp1Var.f3376r = this.R;
            }
            this.R = -9223372036854775807L;
        }
        this.T = l();
        oq1 oq1Var = this.f10266t;
        oq1Var.getClass();
        Looper looperMyLooper = Looper.myLooper();
        tc1.A(looperMyLooper);
        oq1Var.f7640c = null;
        mq1 mq1Var = new mq1(oq1Var, looperMyLooper, to1Var, this, SystemClock.elapsedRealtime());
        tc1.W(oq1Var.f7639b == null);
        oq1Var.f7639b = mq1Var;
        mq1Var.f7032f = null;
        oq1Var.f7638a.execute(mq1Var);
        Uri uri = to1Var.f9218j.f5730a;
        Collections.emptyMap();
        this.f10262f.e(new bo1(), new gk1(-1, (y1) null, yn0.x(to1Var.f9217i), yn0.x(this.J)));
    }

    public final boolean u() {
        return this.R != -9223372036854775807L;
    }

    public final boolean v() {
        return this.N || u();
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzb() {
        long jM;
        boolean z9;
        o();
        if (this.U || this.O == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.R;
        }
        if (this.F) {
            int length = this.B.length;
            jM = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                un1 un1Var = this.H;
                if (((boolean[]) un1Var.f9544b)[i10] && ((boolean[]) un1Var.f9545d)[i10]) {
                    cp1 cp1Var = this.B[i10];
                    synchronized (cp1Var) {
                        z9 = cp1Var.f3379u;
                    }
                    if (!z9) {
                        jM = Math.min(jM, this.B[i10].l());
                    }
                }
            }
        } else {
            jM = Long.MAX_VALUE;
        }
        if (jM == Long.MAX_VALUE) {
            jM = m(false);
        }
        return jM == Long.MIN_VALUE ? this.Q : jM;
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final long zzc() {
        return zzb();
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final long zzd() {
        if (!this.N) {
            return -9223372036854775807L;
        }
        if (!this.U && l() <= this.T) {
            return -9223372036854775807L;
        }
        this.N = false;
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final kp1 zzi() {
        o();
        return (kp1) this.H.f9543a;
    }

    @Override // com.google.android.gms.internal.ads.io1
    public final void zzk() throws IOException {
        IOException iOException;
        int i10 = this.L == 7 ? 6 : 3;
        oq1 oq1Var = this.f10266t;
        IOException iOException2 = oq1Var.f7640c;
        if (iOException2 != null) {
            throw iOException2;
        }
        mq1 mq1Var = oq1Var.f7639b;
        if (mq1Var != null && (iOException = mq1Var.f7032f) != null && mq1Var.f7033h > i10) {
            throw iOException;
        }
        if (this.U && !this.E) {
            throw zzbo.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // com.google.android.gms.internal.ads.ep1
    public final boolean zzp() {
        boolean z9;
        if (this.f10266t.f7639b == null) {
            return false;
        }
        c8.a aVar = this.f10268v;
        synchronized (aVar) {
            z9 = aVar.f1584b;
        }
        return z9;
    }
}
