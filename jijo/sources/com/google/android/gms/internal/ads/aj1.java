package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class aj1 implements Handler.Callback, ho1, eq1, qj1, bi1, tj1 {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final long f2700d0 = yn0.x(10000);
    public final ArrayList A;
    public final l90 B;
    public final jj1 C;
    public final rj1 D;
    public final long E;
    public final vk1 F;
    public ak1 G;
    public sj1 H;
    public yi1 I;
    public boolean J;
    public boolean L;
    public boolean M;
    public boolean O;
    public boolean R;
    public int S;
    public zi1 T;
    public long U;
    public long V;
    public int W;
    public boolean X;
    public zzhw Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vh1[] f2701a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ii1 f2702a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2703b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final rk0 f2704b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final yh1 f2705c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vh1[] f2706d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dq1 f2707f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k6 f2708h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dj1 f2709q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final hq1 f2710s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tm0 f2711t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HandlerThread f2712u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Looper f2713v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final hv f2714w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vu f2715x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f2716y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ci1 f2717z;
    public int P = 0;
    public boolean Q = false;
    public boolean K = false;
    public long Z = -9223372036854775807L;
    public long N = -9223372036854775807L;

    public aj1(vh1[] vh1VarArr, dq1 dq1Var, k6 k6Var, dj1 dj1Var, hq1 hq1Var, dk1 dk1Var, ak1 ak1Var, yh1 yh1Var, long j10, Looper looper, l90 l90Var, rk0 rk0Var, vk1 vk1Var, ii1 ii1Var) {
        this.f2704b0 = rk0Var;
        this.f2701a = vh1VarArr;
        this.f2707f = dq1Var;
        this.f2708h = k6Var;
        this.f2709q = dj1Var;
        this.f2710s = hq1Var;
        this.G = ak1Var;
        this.f2705c0 = yh1Var;
        this.E = j10;
        this.B = l90Var;
        this.F = vk1Var;
        this.f2702a0 = ii1Var;
        this.f2716y = dj1Var.zzb();
        dj1Var.zzg();
        eu euVar = wv.f10355a;
        sj1 sj1VarG = sj1.g(k6Var);
        this.H = sj1VarG;
        this.I = new yi1(sj1VarG);
        int length = vh1VarArr.length;
        this.f2706d = new vh1[2];
        aq1 aq1Var = (aq1) dq1Var;
        aq1Var.getClass();
        for (int i10 = 0; i10 < 2; i10++) {
            vh1 vh1Var = vh1VarArr[i10];
            vh1Var.f9852h = i10;
            vh1Var.f9853q = vk1Var;
            vh1Var.f9854s = l90Var;
            vh1Var.D();
            vh1[] vh1VarArr2 = this.f2706d;
            vh1 vh1Var2 = vh1VarArr[i10];
            vh1Var2.getClass();
            vh1VarArr2[i10] = vh1Var2;
            vh1 vh1Var3 = this.f2706d[i10];
            synchronized (vh1Var3.f9848a) {
                vh1Var3.C = aq1Var;
            }
        }
        this.f2717z = new ci1(this);
        this.A = new ArrayList();
        this.f2703b = Collections.newSetFromMap(new IdentityHashMap());
        this.f2714w = new hv();
        this.f2715x = new vu();
        dq1Var.f3721a = this;
        dq1Var.f3722b = hq1Var;
        this.X = true;
        jl0 jl0Var = (jl0) l90Var;
        tm0 tm0VarA = jl0Var.a(looper, null);
        this.C = new jj1(dk1Var, tm0VarA, new mx0(this), ii1Var);
        this.D = new rj1(this, dk1Var, tm0VarA, vk1Var);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f2712u = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f2713v = looper2;
        this.f2711t = jl0Var.a(looper2, this);
    }

    public static boolean C(vh1 vh1Var) {
        return vh1Var.f9855t != 0;
    }

    public static final void G(vj1 vj1Var) {
        synchronized (vj1Var) {
        }
        try {
            vj1Var.f9869a.b(vj1Var.f9871c, vj1Var.f9872d);
        } finally {
            vj1Var.c(true);
        }
    }

    public static final void H(vh1 vh1Var) {
        vh1Var.f9861z = true;
    }

    public static int I(hv hvVar, vu vuVar, int i10, boolean z9, Object obj, wv wvVar, wv wvVar2) {
        Object obj2 = wvVar.e(wvVar.n(obj, vuVar).f9970c, hvVar, 0L).f5407a;
        for (int i11 = 0; i11 < wvVar2.c(); i11++) {
            if (wvVar2.e(i11, hvVar, 0L).f5407a.equals(obj2)) {
                return i11;
            }
        }
        int iA = wvVar.a(obj);
        int iB = wvVar.b();
        int i12 = iA;
        int iA2 = -1;
        int i13 = 0;
        while (true) {
            if (i13 >= iB || iA2 != -1) {
                break;
            }
            i12 = wvVar.i(i12, vuVar, hvVar, i10, z9);
            if (i12 == -1) {
                iA2 = -1;
                break;
            }
            iA2 = wvVar2.a(wvVar.f(i12));
            i13++;
        }
        if (iA2 == -1) {
            return -1;
        }
        return wvVar2.d(iA2, vuVar, false).f9970c;
    }

    public static Pair N(wv wvVar, zi1 zi1Var, int i10, boolean z9, hv hvVar, vu vuVar) {
        Pair pairL;
        wv wvVar2 = zi1Var.f11247a;
        if (wvVar.o()) {
            return null;
        }
        wv wvVar3 = true == wvVar2.o() ? wvVar : wvVar2;
        try {
            pairL = wvVar3.l(hvVar, vuVar, zi1Var.f11248b, zi1Var.f11249c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (wvVar.equals(wvVar3)) {
            return pairL;
        }
        if (wvVar.a(pairL.first) != -1) {
            return (wvVar3.n(pairL.first, vuVar).f9972e && wvVar3.e(vuVar.f9970c, hvVar, 0L).f5417k == wvVar3.a(pairL.first)) ? wvVar.l(hvVar, vuVar, wvVar.n(pairL.first, vuVar).f9970c, zi1Var.f11249c) : pairL;
        }
        int I = I(hvVar, vuVar, i10, z9, pairL.first, wvVar3, wvVar);
        if (I != -1) {
            return wvVar.l(hvVar, vuVar, I, -9223372036854775807L);
        }
        return null;
    }

    public final synchronized void A(vi1 vi1Var, long j10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime() + j10;
        boolean z9 = false;
        while (!Boolean.valueOf(vi1Var.f9865a.J).booleanValue() && j10 > 0) {
            try {
                wait(j10);
            } catch (InterruptedException unused) {
                z9 = true;
            }
            j10 = jElapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean B() {
        hj1 hj1Var = this.C.f5979j;
        if (hj1Var == null) {
            return false;
        }
        return (!hj1Var.f5318d ? 0L : hj1Var.f5315a.zzc()) != Long.MIN_VALUE;
    }

    public final boolean D() {
        hj1 hj1Var = this.C.f5977h;
        long j10 = hj1Var.f5320f.f5626e;
        if (hj1Var.f5318d) {
            return j10 == -9223372036854775807L || this.H.f8899q < j10 || !E();
        }
        return false;
    }

    public final boolean E() {
        sj1 sj1Var = this.H;
        return sj1Var.f8894l && sj1Var.f8895m == 0;
    }

    public final boolean F(wv wvVar, jo1 jo1Var) {
        if (!jo1Var.b() && !wvVar.o()) {
            int i10 = wvVar.n(jo1Var.f6052a, this.f2715x).f9970c;
            hv hvVar = this.f2714w;
            wvVar.e(i10, hvVar, 0L);
            if (hvVar.b() && hvVar.f5413g && hvVar.f5410d != -9223372036854775807L) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean J() {
        if (!this.J && this.f2713v.getThread().isAlive()) {
            this.f2711t.c(7);
            A(new vi1(this), this.E);
            return this.J;
        }
        return true;
    }

    public final long K(wv wvVar, Object obj, long j10) {
        int i10 = wvVar.n(obj, this.f2715x).f9970c;
        hv hvVar = this.f2714w;
        wvVar.e(i10, hvVar, 0L);
        if (hvVar.f5410d == -9223372036854775807L || !hvVar.b() || !hvVar.f5413g) {
            return -9223372036854775807L;
        }
        long j11 = hvVar.f5411e;
        return yn0.u((j11 == -9223372036854775807L ? System.currentTimeMillis() : j11 + SystemClock.elapsedRealtime()) - hvVar.f5410d) - j10;
    }

    public final long L(jo1 jo1Var, long j10, boolean z9, boolean z10) throws zzhw {
        aj1 aj1Var;
        hj1 hj1Var;
        long j11 = j10;
        v();
        z(false, true);
        if (z10 || this.H.f8887e == 3) {
            s(2);
        }
        jj1 jj1Var = this.C;
        hj1 hj1Var2 = jj1Var.f5977h;
        hj1 hj1Var3 = hj1Var2;
        while (hj1Var3 != null && !jo1Var.equals(hj1Var3.f5320f.f5622a)) {
            hj1Var3 = hj1Var3.f5326l;
        }
        if (z9 || hj1Var2 != hj1Var3 || (hj1Var3 != null && hj1Var3.f5329o + j11 < 0)) {
            vh1[] vh1VarArr = this.f2701a;
            int length = vh1VarArr.length;
            for (int i10 = 0; i10 < 2; i10++) {
                P(vh1VarArr[i10]);
            }
            if (hj1Var3 != null) {
                while (jj1Var.f5977h != hj1Var3) {
                    jj1Var.g();
                }
                jj1Var.s(hj1Var3);
                hj1Var3.f5329o = 1000000000000L;
                a();
            }
        }
        if (hj1Var3 != null) {
            jj1Var.s(hj1Var3);
            if (hj1Var3.f5318d) {
                hj1 hj1Var4 = hj1Var3;
                if (hj1Var4.f5319e) {
                    io1 io1Var = hj1Var4.f5315a;
                    long jA = io1Var.a(j11);
                    aj1Var = this;
                    io1Var.d(jA - aj1Var.f2716y);
                    j11 = jA;
                }
                aj1Var.n(j11);
                i();
            } else {
                ij1 ij1Var = hj1Var3.f5320f;
                if (j11 == ij1Var.f5623b) {
                    hj1Var = hj1Var3;
                } else {
                    hj1Var = hj1Var3;
                    ij1Var = new ij1(ij1Var.f5622a, j10, ij1Var.f5624c, ij1Var.f5625d, ij1Var.f5626e, ij1Var.f5627f, ij1Var.f5628g, ij1Var.f5629h);
                }
                hj1Var.f5320f = ij1Var;
            }
            aj1Var = this;
            aj1Var.n(j11);
            i();
        } else {
            aj1Var = this;
            jj1Var.p();
            aj1Var.n(j11);
        }
        aj1Var.f(false);
        aj1Var.f2711t.c(2);
        return j11;
    }

    public final Pair M(wv wvVar) {
        int i10;
        long j10 = 0;
        if (wvVar.o()) {
            return Pair.create(sj1.f8882s, 0L);
        }
        Pair pairL = wvVar.l(this.f2714w, this.f2715x, wvVar.g(this.Q), -9223372036854775807L);
        jo1 jo1VarO = this.C.o(wvVar, pairL.first, 0L);
        long jLongValue = ((Long) pairL.second).longValue();
        if (jo1VarO.b()) {
            Object obj = jo1VarO.f6052a;
            vu vuVar = this.f2715x;
            wvVar.n(obj, vuVar);
            a aVarA = vuVar.f9973f.a(-1);
            int i11 = 0;
            while (true) {
                int[] iArr = aVarA.f2539d;
                if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                    break;
                }
                i11++;
            }
            if (-1 == i11) {
                vuVar.f9973f.getClass();
            }
        } else {
            j10 = jLongValue;
        }
        return Pair.create(jo1VarO, Long.valueOf(j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.ads.sj1 O(com.google.android.gms.internal.ads.jo1 r26, long r27, long r29, long r31, boolean r33, int r34) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj1.O(com.google.android.gms.internal.ads.jo1, long, long, long, boolean, int):com.google.android.gms.internal.ads.sj1");
    }

    public final void P(vh1 vh1Var) {
        int i10 = vh1Var.f9855t;
        if (i10 != 0) {
            ci1 ci1Var = this.f2717z;
            if (vh1Var == ((vh1) ci1Var.f3298h)) {
                ci1Var.f3299q = null;
                ci1Var.f3298h = null;
                ci1Var.f3294a = true;
            }
            if (i10 == 2) {
                tc1.W(i10 == 2);
                vh1Var.f9855t = 1;
                vh1Var.h();
            }
            tc1.W(vh1Var.f9855t == 1);
            cj0 cj0Var = vh1Var.f9850d;
            cj0Var.f3302d = null;
            cj0Var.f3301b = null;
            vh1Var.f9855t = 0;
            vh1Var.f9856u = null;
            vh1Var.f9857v = null;
            vh1Var.f9861z = false;
            vh1Var.B();
            this.S--;
        }
    }

    public final void a() throws zzhw {
        int length = this.f2701a.length;
        b(new boolean[2], this.C.f5978i.d());
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean[] r22, long r23) throws com.google.android.gms.internal.ads.zzhw {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj1.b(boolean[], long):void");
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final /* bridge */ /* synthetic */ void c(ep1 ep1Var) {
        this.f2711t.a(9, (io1) ep1Var).a();
    }

    public final void d(IOException iOException, int i10) {
        zzhw zzhwVar = new zzhw(0, iOException, i10);
        hj1 hj1Var = this.C.f5977h;
        if (hj1Var != null) {
            zzhwVar = zzhwVar.a(hj1Var.f5320f.f5622a);
        }
        fg0.d("Playback error", zzhwVar);
        u(false, false);
        this.H = this.H.d(zzhwVar);
    }

    @Override // com.google.android.gms.internal.ads.ho1
    public final void e(io1 io1Var) {
        this.f2711t.a(8, io1Var).a();
    }

    public final void f(boolean z9) {
        hj1 hj1Var = this.C.f5979j;
        jo1 jo1Var = hj1Var == null ? this.H.f8884b : hj1Var.f5320f.f5622a;
        boolean z10 = !this.H.f8893k.equals(jo1Var);
        if (z10) {
            this.H = this.H.a(jo1Var);
        }
        sj1 sj1Var = this.H;
        sj1Var.f8897o = hj1Var == null ? sj1Var.f8899q : hj1Var.b();
        sj1 sj1Var2 = this.H;
        long j10 = sj1Var2.f8897o;
        hj1 hj1Var2 = this.C.f5979j;
        sj1Var2.f8898p = hj1Var2 != null ? Math.max(0L, j10 - (this.U - hj1Var2.f5329o)) : 0L;
        if ((z10 || z9) && hj1Var != null && hj1Var.f5318d) {
            jo1 jo1Var2 = hj1Var.f5320f.f5622a;
            k6 k6Var = hj1Var.f5328n;
            wv wvVar = this.H.f8883a;
            this.f2709q.e(this.F, this.f2701a, (cq1[]) k6Var.f6199d);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x047c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(com.google.android.gms.internal.ads.wv r30, boolean r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1161
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj1.g(com.google.android.gms.internal.ads.wv, boolean):void");
    }

    public final void h(to toVar, float f10, boolean z9, boolean z10) {
        int i10;
        aj1 aj1Var = this;
        if (z9) {
            if (z10) {
                aj1Var.I.a(1);
            }
            sj1 sj1Var = aj1Var.H;
            aj1Var = this;
            aj1Var.H = new sj1(sj1Var.f8883a, sj1Var.f8884b, sj1Var.f8885c, sj1Var.f8886d, sj1Var.f8887e, sj1Var.f8888f, sj1Var.f8889g, sj1Var.f8890h, sj1Var.f8891i, sj1Var.f8892j, sj1Var.f8893k, sj1Var.f8894l, sj1Var.f8895m, toVar, sj1Var.f8897o, sj1Var.f8898p, sj1Var.f8899q, sj1Var.f8900r);
        }
        float f11 = toVar.f9206a;
        hj1 hj1Var = aj1Var.C.f5977h;
        while (true) {
            i10 = 0;
            if (hj1Var == null) {
                break;
            }
            cq1[] cq1VarArr = (cq1[]) hj1Var.f5328n.f6199d;
            int length = cq1VarArr.length;
            while (i10 < length) {
                cq1 cq1Var = cq1VarArr[i10];
                i10++;
            }
            hj1Var = hj1Var.f5326l;
        }
        vh1[] vh1VarArr = aj1Var.f2701a;
        int length2 = vh1VarArr.length;
        while (i10 < 2) {
            vh1 vh1Var = vh1VarArr[i10];
            if (vh1Var != null) {
                vh1Var.l(f10, toVar.f9206a);
            }
            i10++;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:189|(10:656|191|(1:199)(1:197)|200|201|651|202|(1:215)(4:208|209|210|211)|248|249)(1:218)|647|219|(1:221)(1:222)|223|(1:225)(1:226)|227|643|228|229|(1:231)(1:232)|233|661|234|235|236|237|211) */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x049b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x049c, code lost:
    
        r17 = r0;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04a2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04a5, code lost:
    
        r17 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x08cf, code lost:
    
        if (D() != false) goto L482;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:278:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x09a5 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002e, zzti -> 0x0032, zzft -> 0x0036, zzbo -> 0x003a, zzrb -> 0x003e, zzhw -> 0x0042, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x000a, B:4:0x0014, B:6:0x0018, B:22:0x0046, B:23:0x005d, B:24:0x0064, B:25:0x006b, B:29:0x0072, B:31:0x007b, B:33:0x0089, B:34:0x0090, B:35:0x009a, B:36:0x00ae, B:37:0x00c6, B:38:0x00d0, B:39:0x00d1, B:41:0x00e0, B:42:0x00e4, B:43:0x00f5, B:45:0x0104, B:46:0x0122, B:47:0x0135, B:48:0x0140, B:50:0x0152, B:51:0x015c, B:52:0x0170, B:54:0x017c, B:57:0x0187, B:58:0x018e, B:59:0x019b, B:63:0x01a2, B:65:0x01aa, B:67:0x01ae, B:69:0x01b4, B:71:0x01bc, B:73:0x01c4, B:74:0x01c7, B:76:0x01cc, B:83:0x01d9, B:84:0x01da, B:88:0x01e1, B:90:0x01ef, B:91:0x01f2, B:92:0x01f7, B:94:0x0207, B:95:0x020a, B:96:0x020f, B:97:0x0214, B:99:0x021e, B:101:0x0222, B:103:0x0226, B:107:0x022d, B:109:0x0234, B:110:0x023c, B:111:0x0241, B:113:0x024b, B:115:0x024f, B:117:0x0283, B:118:0x02a3, B:127:0x02cf, B:129:0x02d3, B:130:0x02d6, B:137:0x02e1, B:149:0x02f5, B:150:0x02fa, B:151:0x0302, B:152:0x0321, B:154:0x0348, B:237:0x0496, B:211:0x0446, B:210:0x0442, B:248:0x04b3, B:249:0x04bf, B:155:0x036b, B:159:0x037e, B:161:0x038e, B:162:0x03a2, B:164:0x03a7, B:168:0x03ae, B:170:0x03b3, B:172:0x03c0, B:250:0x04c0, B:252:0x04da, B:255:0x04e5, B:257:0x04ed, B:261:0x04f4, B:263:0x04fb, B:264:0x0503, B:266:0x050b, B:268:0x0517, B:270:0x052c, B:271:0x0531, B:272:0x0535, B:274:0x0539, B:276:0x0546, B:343:0x0692, B:345:0x069a, B:347:0x06a2, B:350:0x06a8, B:351:0x06b4, B:353:0x06ba, B:355:0x06c2, B:358:0x06d2, B:360:0x06d8, B:362:0x06e0, B:364:0x06e6, B:366:0x06eb, B:367:0x06f4, B:368:0x070c, B:370:0x0712, B:372:0x0717, B:374:0x071c, B:376:0x0720, B:414:0x07d8, B:415:0x07dd, B:420:0x07e9, B:422:0x07f1, B:423:0x07f6, B:425:0x0802, B:426:0x081b, B:428:0x0821, B:430:0x0829, B:432:0x0832, B:436:0x083b, B:441:0x084a, B:447:0x0857, B:449:0x085d, B:458:0x086f, B:459:0x0877, B:461:0x0881, B:463:0x0887, B:467:0x0894, B:476:0x08c0, B:478:0x08c7, B:480:0x08cb, B:512:0x0975, B:514:0x0981, B:516:0x0992, B:517:0x099b, B:536:0x09e8, B:539:0x09f0, B:541:0x09f5, B:543:0x09fd, B:545:0x0a0b, B:546:0x0a17, B:547:0x0a1b, B:549:0x0a21, B:551:0x0a2a, B:553:0x0a30, B:555:0x0a3b, B:562:0x0a5f, B:564:0x0a65, B:568:0x0a6e, B:578:0x0a8b, B:575:0x0a82, B:577:0x0a86, B:556:0x0a42, B:559:0x0a50, B:560:0x0a57, B:561:0x0a58, B:486:0x08dc, B:488:0x08e0, B:490:0x08f4, B:492:0x08ff, B:494:0x090b, B:498:0x0914, B:500:0x091e, B:506:0x0929, B:510:0x0956, B:518:0x099f, B:520:0x09a5, B:522:0x09a9, B:526:0x09b2, B:528:0x09c2, B:530:0x09ca, B:532:0x09d6, B:533:0x09db, B:534:0x09e0, B:535:0x09e5, B:509:0x0946, B:469:0x089c, B:471:0x08a0, B:472:0x08ab, B:474:0x08b1, B:460:0x087a, B:379:0x0729, B:381:0x072d, B:383:0x0735, B:385:0x073b, B:387:0x0745, B:390:0x074b, B:391:0x074e, B:393:0x0757, B:395:0x0769, B:397:0x0771, B:399:0x0779, B:403:0x0782, B:405:0x07aa, B:406:0x07ad, B:407:0x07b8, B:409:0x07be, B:411:0x07c4, B:412:0x07cb, B:279:0x0556, B:281:0x055c, B:284:0x0568, B:287:0x0573, B:289:0x0579, B:292:0x0587, B:294:0x058d, B:295:0x0593, B:296:0x0596, B:298:0x059e, B:300:0x05ac, B:302:0x05de, B:304:0x05ed, B:307:0x05f7, B:309:0x05ff, B:310:0x0602, B:311:0x0605, B:313:0x060b, B:316:0x0621, B:318:0x0627, B:320:0x0631, B:322:0x063b, B:324:0x0650, B:326:0x0656, B:327:0x0660, B:328:0x0663, B:330:0x0669, B:333:0x066e, B:335:0x0674, B:337:0x067c, B:339:0x0682, B:341:0x0688, B:342:0x068f, B:275:0x0543, B:579:0x0a90, B:583:0x0a97, B:584:0x0a9f, B:588:0x0abf, B:138:0x02e2, B:140:0x02e6, B:141:0x02e9, B:144:0x02f0, B:148:0x02f4), top: B:653:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:528:0x09c2 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002e, zzti -> 0x0032, zzft -> 0x0036, zzbo -> 0x003a, zzrb -> 0x003e, zzhw -> 0x0042, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x000a, B:4:0x0014, B:6:0x0018, B:22:0x0046, B:23:0x005d, B:24:0x0064, B:25:0x006b, B:29:0x0072, B:31:0x007b, B:33:0x0089, B:34:0x0090, B:35:0x009a, B:36:0x00ae, B:37:0x00c6, B:38:0x00d0, B:39:0x00d1, B:41:0x00e0, B:42:0x00e4, B:43:0x00f5, B:45:0x0104, B:46:0x0122, B:47:0x0135, B:48:0x0140, B:50:0x0152, B:51:0x015c, B:52:0x0170, B:54:0x017c, B:57:0x0187, B:58:0x018e, B:59:0x019b, B:63:0x01a2, B:65:0x01aa, B:67:0x01ae, B:69:0x01b4, B:71:0x01bc, B:73:0x01c4, B:74:0x01c7, B:76:0x01cc, B:83:0x01d9, B:84:0x01da, B:88:0x01e1, B:90:0x01ef, B:91:0x01f2, B:92:0x01f7, B:94:0x0207, B:95:0x020a, B:96:0x020f, B:97:0x0214, B:99:0x021e, B:101:0x0222, B:103:0x0226, B:107:0x022d, B:109:0x0234, B:110:0x023c, B:111:0x0241, B:113:0x024b, B:115:0x024f, B:117:0x0283, B:118:0x02a3, B:127:0x02cf, B:129:0x02d3, B:130:0x02d6, B:137:0x02e1, B:149:0x02f5, B:150:0x02fa, B:151:0x0302, B:152:0x0321, B:154:0x0348, B:237:0x0496, B:211:0x0446, B:210:0x0442, B:248:0x04b3, B:249:0x04bf, B:155:0x036b, B:159:0x037e, B:161:0x038e, B:162:0x03a2, B:164:0x03a7, B:168:0x03ae, B:170:0x03b3, B:172:0x03c0, B:250:0x04c0, B:252:0x04da, B:255:0x04e5, B:257:0x04ed, B:261:0x04f4, B:263:0x04fb, B:264:0x0503, B:266:0x050b, B:268:0x0517, B:270:0x052c, B:271:0x0531, B:272:0x0535, B:274:0x0539, B:276:0x0546, B:343:0x0692, B:345:0x069a, B:347:0x06a2, B:350:0x06a8, B:351:0x06b4, B:353:0x06ba, B:355:0x06c2, B:358:0x06d2, B:360:0x06d8, B:362:0x06e0, B:364:0x06e6, B:366:0x06eb, B:367:0x06f4, B:368:0x070c, B:370:0x0712, B:372:0x0717, B:374:0x071c, B:376:0x0720, B:414:0x07d8, B:415:0x07dd, B:420:0x07e9, B:422:0x07f1, B:423:0x07f6, B:425:0x0802, B:426:0x081b, B:428:0x0821, B:430:0x0829, B:432:0x0832, B:436:0x083b, B:441:0x084a, B:447:0x0857, B:449:0x085d, B:458:0x086f, B:459:0x0877, B:461:0x0881, B:463:0x0887, B:467:0x0894, B:476:0x08c0, B:478:0x08c7, B:480:0x08cb, B:512:0x0975, B:514:0x0981, B:516:0x0992, B:517:0x099b, B:536:0x09e8, B:539:0x09f0, B:541:0x09f5, B:543:0x09fd, B:545:0x0a0b, B:546:0x0a17, B:547:0x0a1b, B:549:0x0a21, B:551:0x0a2a, B:553:0x0a30, B:555:0x0a3b, B:562:0x0a5f, B:564:0x0a65, B:568:0x0a6e, B:578:0x0a8b, B:575:0x0a82, B:577:0x0a86, B:556:0x0a42, B:559:0x0a50, B:560:0x0a57, B:561:0x0a58, B:486:0x08dc, B:488:0x08e0, B:490:0x08f4, B:492:0x08ff, B:494:0x090b, B:498:0x0914, B:500:0x091e, B:506:0x0929, B:510:0x0956, B:518:0x099f, B:520:0x09a5, B:522:0x09a9, B:526:0x09b2, B:528:0x09c2, B:530:0x09ca, B:532:0x09d6, B:533:0x09db, B:534:0x09e0, B:535:0x09e5, B:509:0x0946, B:469:0x089c, B:471:0x08a0, B:472:0x08ab, B:474:0x08b1, B:460:0x087a, B:379:0x0729, B:381:0x072d, B:383:0x0735, B:385:0x073b, B:387:0x0745, B:390:0x074b, B:391:0x074e, B:393:0x0757, B:395:0x0769, B:397:0x0771, B:399:0x0779, B:403:0x0782, B:405:0x07aa, B:406:0x07ad, B:407:0x07b8, B:409:0x07be, B:411:0x07c4, B:412:0x07cb, B:279:0x0556, B:281:0x055c, B:284:0x0568, B:287:0x0573, B:289:0x0579, B:292:0x0587, B:294:0x058d, B:295:0x0593, B:296:0x0596, B:298:0x059e, B:300:0x05ac, B:302:0x05de, B:304:0x05ed, B:307:0x05f7, B:309:0x05ff, B:310:0x0602, B:311:0x0605, B:313:0x060b, B:316:0x0621, B:318:0x0627, B:320:0x0631, B:322:0x063b, B:324:0x0650, B:326:0x0656, B:327:0x0660, B:328:0x0663, B:330:0x0669, B:333:0x066e, B:335:0x0674, B:337:0x067c, B:339:0x0682, B:341:0x0688, B:342:0x068f, B:275:0x0543, B:579:0x0a90, B:583:0x0a97, B:584:0x0a9f, B:588:0x0abf, B:138:0x02e2, B:140:0x02e6, B:141:0x02e9, B:144:0x02f0, B:148:0x02f4), top: B:653:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:538:0x09ef  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0a58 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002e, zzti -> 0x0032, zzft -> 0x0036, zzbo -> 0x003a, zzrb -> 0x003e, zzhw -> 0x0042, TryCatch #6 {RuntimeException -> 0x002a, blocks: (B:3:0x000a, B:4:0x0014, B:6:0x0018, B:22:0x0046, B:23:0x005d, B:24:0x0064, B:25:0x006b, B:29:0x0072, B:31:0x007b, B:33:0x0089, B:34:0x0090, B:35:0x009a, B:36:0x00ae, B:37:0x00c6, B:38:0x00d0, B:39:0x00d1, B:41:0x00e0, B:42:0x00e4, B:43:0x00f5, B:45:0x0104, B:46:0x0122, B:47:0x0135, B:48:0x0140, B:50:0x0152, B:51:0x015c, B:52:0x0170, B:54:0x017c, B:57:0x0187, B:58:0x018e, B:59:0x019b, B:63:0x01a2, B:65:0x01aa, B:67:0x01ae, B:69:0x01b4, B:71:0x01bc, B:73:0x01c4, B:74:0x01c7, B:76:0x01cc, B:83:0x01d9, B:84:0x01da, B:88:0x01e1, B:90:0x01ef, B:91:0x01f2, B:92:0x01f7, B:94:0x0207, B:95:0x020a, B:96:0x020f, B:97:0x0214, B:99:0x021e, B:101:0x0222, B:103:0x0226, B:107:0x022d, B:109:0x0234, B:110:0x023c, B:111:0x0241, B:113:0x024b, B:115:0x024f, B:117:0x0283, B:118:0x02a3, B:127:0x02cf, B:129:0x02d3, B:130:0x02d6, B:137:0x02e1, B:149:0x02f5, B:150:0x02fa, B:151:0x0302, B:152:0x0321, B:154:0x0348, B:237:0x0496, B:211:0x0446, B:210:0x0442, B:248:0x04b3, B:249:0x04bf, B:155:0x036b, B:159:0x037e, B:161:0x038e, B:162:0x03a2, B:164:0x03a7, B:168:0x03ae, B:170:0x03b3, B:172:0x03c0, B:250:0x04c0, B:252:0x04da, B:255:0x04e5, B:257:0x04ed, B:261:0x04f4, B:263:0x04fb, B:264:0x0503, B:266:0x050b, B:268:0x0517, B:270:0x052c, B:271:0x0531, B:272:0x0535, B:274:0x0539, B:276:0x0546, B:343:0x0692, B:345:0x069a, B:347:0x06a2, B:350:0x06a8, B:351:0x06b4, B:353:0x06ba, B:355:0x06c2, B:358:0x06d2, B:360:0x06d8, B:362:0x06e0, B:364:0x06e6, B:366:0x06eb, B:367:0x06f4, B:368:0x070c, B:370:0x0712, B:372:0x0717, B:374:0x071c, B:376:0x0720, B:414:0x07d8, B:415:0x07dd, B:420:0x07e9, B:422:0x07f1, B:423:0x07f6, B:425:0x0802, B:426:0x081b, B:428:0x0821, B:430:0x0829, B:432:0x0832, B:436:0x083b, B:441:0x084a, B:447:0x0857, B:449:0x085d, B:458:0x086f, B:459:0x0877, B:461:0x0881, B:463:0x0887, B:467:0x0894, B:476:0x08c0, B:478:0x08c7, B:480:0x08cb, B:512:0x0975, B:514:0x0981, B:516:0x0992, B:517:0x099b, B:536:0x09e8, B:539:0x09f0, B:541:0x09f5, B:543:0x09fd, B:545:0x0a0b, B:546:0x0a17, B:547:0x0a1b, B:549:0x0a21, B:551:0x0a2a, B:553:0x0a30, B:555:0x0a3b, B:562:0x0a5f, B:564:0x0a65, B:568:0x0a6e, B:578:0x0a8b, B:575:0x0a82, B:577:0x0a86, B:556:0x0a42, B:559:0x0a50, B:560:0x0a57, B:561:0x0a58, B:486:0x08dc, B:488:0x08e0, B:490:0x08f4, B:492:0x08ff, B:494:0x090b, B:498:0x0914, B:500:0x091e, B:506:0x0929, B:510:0x0956, B:518:0x099f, B:520:0x09a5, B:522:0x09a9, B:526:0x09b2, B:528:0x09c2, B:530:0x09ca, B:532:0x09d6, B:533:0x09db, B:534:0x09e0, B:535:0x09e5, B:509:0x0946, B:469:0x089c, B:471:0x08a0, B:472:0x08ab, B:474:0x08b1, B:460:0x087a, B:379:0x0729, B:381:0x072d, B:383:0x0735, B:385:0x073b, B:387:0x0745, B:390:0x074b, B:391:0x074e, B:393:0x0757, B:395:0x0769, B:397:0x0771, B:399:0x0779, B:403:0x0782, B:405:0x07aa, B:406:0x07ad, B:407:0x07b8, B:409:0x07be, B:411:0x07c4, B:412:0x07cb, B:279:0x0556, B:281:0x055c, B:284:0x0568, B:287:0x0573, B:289:0x0579, B:292:0x0587, B:294:0x058d, B:295:0x0593, B:296:0x0596, B:298:0x059e, B:300:0x05ac, B:302:0x05de, B:304:0x05ed, B:307:0x05f7, B:309:0x05ff, B:310:0x0602, B:311:0x0605, B:313:0x060b, B:316:0x0621, B:318:0x0627, B:320:0x0631, B:322:0x063b, B:324:0x0650, B:326:0x0656, B:327:0x0660, B:328:0x0663, B:330:0x0669, B:333:0x066e, B:335:0x0674, B:337:0x067c, B:339:0x0682, B:341:0x0688, B:342:0x068f, B:275:0x0543, B:579:0x0a90, B:583:0x0a97, B:584:0x0a9f, B:588:0x0abf, B:138:0x02e2, B:140:0x02e6, B:141:0x02e9, B:144:0x02f0, B:148:0x02f4), top: B:653:0x000a }] */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.internal.ads.hq1, com.google.android.gms.internal.ads.va1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj1.handleMessage(android.os.Message):boolean");
    }

    public final void i() {
        boolean zC;
        boolean z9;
        long j10 = -9223372036854775807L;
        if (B()) {
            hj1 hj1Var = this.C.f5979j;
            long jZzc = !hj1Var.f5318d ? 0L : hj1Var.f5315a.zzc();
            hj1 hj1Var2 = this.C.f5979j;
            long jMax = hj1Var2 == null ? 0L : Math.max(0L, jZzc - (this.U - hj1Var2.f5329o));
            if (hj1Var != this.C.f5977h) {
                long j11 = hj1Var.f5320f.f5623b;
            }
            long j12 = F(this.H.f8883a, hj1Var.f5320f.f5622a) ? this.f2705c0.f10896h : -9223372036854775807L;
            vk1 vk1Var = this.F;
            wv wvVar = this.H.f8883a;
            jo1 jo1Var = hj1Var.f5320f.f5622a;
            float f10 = this.f2717z.a().f9206a;
            boolean z10 = this.H.f8894l;
            cj1 cj1Var = new cj1(vk1Var, jMax, f10, this.M, j12);
            zC = this.f2709q.c(cj1Var);
            hj1 hj1Var3 = this.C.f5977h;
            if (!zC && hj1Var3.f5318d && jMax < 500000 && this.f2716y > 0) {
                hj1Var3.f5315a.d(this.H.f8899q);
                zC = this.f2709q.c(cj1Var);
            }
        } else {
            zC = false;
        }
        this.O = zC;
        if (zC) {
            hj1 hj1Var4 = this.C.f5979j;
            long j13 = this.U;
            float f11 = this.f2717z.a().f9206a;
            long j14 = this.N;
            tc1.W(hj1Var4.f5326l == null);
            long j15 = j13 - hj1Var4.f5329o;
            ej1 ej1Var = new ej1();
            ej1Var.f4210b = -3.4028235E38f;
            ej1Var.f4211c = -9223372036854775807L;
            ej1Var.f4209a = j15;
            tc1.K(f11 > 0.0f || f11 == -3.4028235E38f);
            ej1Var.f4210b = f11;
            if (j14 < 0) {
                if (j14 != -9223372036854775807L) {
                    j10 = j14;
                    z9 = false;
                }
                tc1.K(z9);
                ej1Var.f4211c = j10;
                hj1Var4.f5315a.g(new fj1(ej1Var));
            } else {
                j10 = j14;
            }
            z9 = true;
            tc1.K(z9);
            ej1Var.f4211c = j10;
            hj1Var4.f5315a.g(new fj1(ej1Var));
        }
        w();
    }

    public final void j() {
        yi1 yi1Var = this.I;
        sj1 sj1Var = this.H;
        boolean z9 = yi1Var.f10908a | (yi1Var.f10909b != sj1Var);
        yi1Var.f10908a = z9;
        yi1Var.f10909b = sj1Var;
        if (z9) {
            ui1 ui1Var = (ui1) this.f2704b0.f8631b;
            ui1Var.getClass();
            ui1Var.f9505i.b(new vh0(ui1Var, 16, yi1Var));
            this.I = new yi1(this.H);
        }
    }

    public final void k() throws zzhw {
        int i10;
        float f10 = this.f2717z.a().f9206a;
        jj1 jj1Var = this.C;
        hj1 hj1Var = jj1Var.f5977h;
        hj1 hj1Var2 = jj1Var.f5978i;
        k6 k6Var = null;
        hj1 hj1Var3 = hj1Var;
        boolean z9 = true;
        while (hj1Var3 != null && hj1Var3.f5318d) {
            k6 k6VarG = hj1Var3.g(this.H.f8883a);
            k6 k6Var2 = hj1Var3 == this.C.f5977h ? k6VarG : k6Var;
            k6 k6Var3 = hj1Var3.f5328n;
            boolean z10 = false;
            if (k6Var3 != null) {
                if (((cq1[]) k6Var3.f6199d).length == ((cq1[]) k6VarG.f6199d).length) {
                    for (int i11 = 0; i11 < ((cq1[]) k6VarG.f6199d).length; i11++) {
                        if (k6VarG.a(k6Var3, i11)) {
                        }
                    }
                    if (hj1Var3 != hj1Var2) {
                        z10 = true;
                    }
                    z9 &= z10;
                    hj1Var3 = hj1Var3.f5326l;
                    k6Var = k6Var2;
                }
            }
            if (z9) {
                jj1 jj1Var2 = this.C;
                hj1 hj1Var4 = jj1Var2.f5977h;
                boolean zS = jj1Var2.s(hj1Var4);
                int length = this.f2701a.length;
                boolean[] zArr = new boolean[2];
                k6Var2.getClass();
                long jA = hj1Var4.a(k6Var2, this.H.f8899q, zS, zArr);
                sj1 sj1Var = this.H;
                boolean z11 = (sj1Var.f8887e == 4 || jA == sj1Var.f8899q) ? false : true;
                sj1 sj1Var2 = this.H;
                i10 = 2;
                this.H = O(sj1Var2.f8884b, jA, sj1Var2.f8885c, sj1Var2.f8886d, z11, 5);
                if (z11) {
                    n(jA);
                }
                int length2 = this.f2701a.length;
                boolean[] zArr2 = new boolean[2];
                int i12 = 0;
                while (true) {
                    vh1[] vh1VarArr = this.f2701a;
                    int length3 = vh1VarArr.length;
                    if (i12 >= 2) {
                        break;
                    }
                    vh1 vh1Var = vh1VarArr[i12];
                    boolean zC = C(vh1Var);
                    zArr2[i12] = zC;
                    dp1 dp1Var = hj1Var4.f5317c[i12];
                    if (zC) {
                        if (dp1Var != vh1Var.f9856u) {
                            P(vh1Var);
                        } else if (zArr[i12]) {
                            long j10 = this.U;
                            vh1Var.f9861z = false;
                            vh1Var.f9859x = j10;
                            vh1Var.f9860y = j10;
                            vh1Var.E(j10, false);
                        }
                    }
                    i12++;
                }
                b(zArr2, this.U);
            } else {
                i10 = 2;
                this.C.s(hj1Var3);
                if (hj1Var3.f5318d) {
                    hj1Var3.a(k6VarG, Math.max(hj1Var3.f5320f.f5623b, this.U - hj1Var3.f5329o), false, new boolean[2]);
                }
            }
            f(true);
            if (this.H.f8887e != 4) {
                i();
                x();
                this.f2711t.c(i10);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4 A[PHI: r2 r6 r8
      0x00c4: PHI (r2v2 com.google.android.gms.internal.ads.jo1) = (r2v1 com.google.android.gms.internal.ads.jo1), (r2v8 com.google.android.gms.internal.ads.jo1) binds: [B:34:0x0099, B:36:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r6v4 long) = (r6v3 long), (r6v15 long) binds: [B:34:0x0099, B:36:0x00be] A[DONT_GENERATE, DONT_INLINE]
      0x00c4: PHI (r8v2 long) = (r8v1 long), (r8v6 long) binds: [B:34:0x0099, B:36:0x00be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(boolean r32, boolean r33, boolean r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj1.l(boolean, boolean, boolean, boolean):void");
    }

    public final void m() {
        hj1 hj1Var = this.C.f5977h;
        boolean z9 = false;
        if (hj1Var != null && hj1Var.f5320f.f5628g && this.K) {
            z9 = true;
        }
        this.L = z9;
    }

    public final void n(long j10) {
        hj1 hj1Var = this.C.f5977h;
        long j11 = j10 + (hj1Var == null ? 1000000000000L : hj1Var.f5329o);
        this.U = j11;
        ((ck1) this.f2717z.f3296d).b(j11);
        vh1[] vh1VarArr = this.f2701a;
        int length = vh1VarArr.length;
        for (int i10 = 0; i10 < 2; i10++) {
            vh1 vh1Var = vh1VarArr[i10];
            if (C(vh1Var)) {
                long j12 = this.U;
                vh1Var.f9861z = false;
                vh1Var.f9859x = j12;
                vh1Var.f9860y = j12;
                vh1Var.E(j12, false);
            }
        }
        for (hj1 hj1Var2 = r0.f5977h; hj1Var2 != null; hj1Var2 = hj1Var2.f5326l) {
            for (cq1 cq1Var : (cq1[]) hj1Var2.f5328n.f6199d) {
            }
        }
    }

    public final void o(wv wvVar, wv wvVar2) {
        if (wvVar.o() && wvVar2.o()) {
            return;
        }
        ArrayList arrayList = this.A;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            fb1.t(arrayList.get(size));
            throw null;
        }
    }

    public final void p(long j10) {
        this.f2711t.f9195a.sendEmptyMessageAtTime(2, j10 + ((this.H.f8887e != 3 || E()) ? f2700d0 : 1000L));
    }

    public final void q(boolean z9) throws zzhw {
        jo1 jo1Var = this.C.f5977h.f5320f.f5622a;
        long jL = L(jo1Var, this.H.f8899q, true, false);
        if (jL != this.H.f8899q) {
            sj1 sj1Var = this.H;
            this.H = O(jo1Var, jL, sj1Var.f8885c, sj1Var.f8886d, z9, 5);
        }
    }

    public final void r(int i10, int i11, boolean z9, boolean z10) {
        this.I.a(z10 ? 1 : 0);
        yi1 yi1Var = this.I;
        yi1Var.f10908a = true;
        yi1Var.f10913f = true;
        yi1Var.f10914g = i11;
        this.H = this.H.c(i10, z9);
        z(false, false);
        for (hj1 hj1Var = this.C.f5977h; hj1Var != null; hj1Var = hj1Var.f5326l) {
            for (cq1 cq1Var : (cq1[]) hj1Var.f5328n.f6199d) {
            }
        }
        if (!E()) {
            v();
            x();
            return;
        }
        int i12 = this.H.f8887e;
        tm0 tm0Var = this.f2711t;
        if (i12 != 3) {
            if (i12 == 2) {
                tm0Var.c(2);
                return;
            }
            return;
        }
        ci1 ci1Var = this.f2717z;
        ci1Var.f3295b = true;
        ck1 ck1Var = (ck1) ci1Var.f3296d;
        if (!ck1Var.f3319a) {
            ck1Var.f3321d = SystemClock.elapsedRealtime();
            ck1Var.f3319a = true;
        }
        t();
        tm0Var.c(2);
    }

    public final void s(int i10) {
        sj1 sj1Var = this.H;
        if (sj1Var.f8887e != i10) {
            if (i10 != 2) {
                this.Z = -9223372036854775807L;
            }
            this.H = sj1Var.e(i10);
        }
    }

    public final void t() {
        hj1 hj1Var = this.C.f5977h;
        if (hj1Var == null) {
            return;
        }
        k6 k6Var = hj1Var.f5328n;
        int i10 = 0;
        while (true) {
            vh1[] vh1VarArr = this.f2701a;
            int length = vh1VarArr.length;
            if (i10 >= 2) {
                return;
            }
            if (k6Var.d(i10)) {
                vh1 vh1Var = vh1VarArr[i10];
                int i11 = vh1Var.f9855t;
                if (i11 == 1) {
                    tc1.W(i11 == 1);
                    vh1Var.f9855t = 2;
                    vh1Var.g();
                }
            }
            i10++;
        }
    }

    public final void u(boolean z9, boolean z10) {
        l(z9 || !this.R, false, true, false);
        this.I.a(z10 ? 1 : 0);
        this.f2709q.b(this.F);
        s(1);
    }

    public final void v() {
        int i10;
        ci1 ci1Var = this.f2717z;
        ci1Var.f3295b = false;
        ck1 ck1Var = (ck1) ci1Var.f3296d;
        if (ck1Var.f3319a) {
            ck1Var.b(ck1Var.zza());
            ck1Var.f3319a = false;
        }
        vh1[] vh1VarArr = this.f2701a;
        int length = vh1VarArr.length;
        for (int i11 = 0; i11 < 2; i11++) {
            vh1 vh1Var = vh1VarArr[i11];
            if (C(vh1Var) && (i10 = vh1Var.f9855t) == 2) {
                tc1.W(i10 == 2);
                vh1Var.f9855t = 1;
                vh1Var.h();
            }
        }
    }

    public final void w() {
        hj1 hj1Var = this.C.f5979j;
        boolean z9 = this.O || (hj1Var != null && hj1Var.f5315a.zzp());
        sj1 sj1Var = this.H;
        if (z9 != sj1Var.f8889g) {
            this.H = new sj1(sj1Var.f8883a, sj1Var.f8884b, sj1Var.f8885c, sj1Var.f8886d, sj1Var.f8887e, sj1Var.f8888f, z9, sj1Var.f8890h, sj1Var.f8891i, sj1Var.f8892j, sj1Var.f8893k, sj1Var.f8894l, sj1Var.f8895m, sj1Var.f8896n, sj1Var.f8897o, sj1Var.f8898p, sj1Var.f8899q, sj1Var.f8900r);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x() {
        /*
            Method dump skipped, instruction units count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.aj1.x():void");
    }

    public final void y(wv wvVar, jo1 jo1Var, wv wvVar2, jo1 jo1Var2, long j10, boolean z9) {
        if (!F(wvVar, jo1Var)) {
            to toVar = jo1Var.b() ? to.f9205d : this.H.f8896n;
            ci1 ci1Var = this.f2717z;
            if (ci1Var.a().equals(toVar)) {
                return;
            }
            this.f2711t.f9195a.removeMessages(16);
            ci1Var.c(toVar);
            h(this.H.f8896n, toVar.f9206a, false, false);
            return;
        }
        Object obj = jo1Var.f6052a;
        vu vuVar = this.f2715x;
        int i10 = wvVar.n(obj, vuVar).f9970c;
        hv hvVar = this.f2714w;
        wvVar.e(i10, hvVar, 0L);
        da daVar = hvVar.f5414h;
        int i11 = yn0.f10944a;
        yh1 yh1Var = this.f2705c0;
        yh1Var.getClass();
        daVar.getClass();
        long jU = yn0.u(-9223372036854775807L);
        yh1Var.f10891c = jU;
        yh1Var.f10894f = jU;
        yh1Var.f10895g = jU;
        yh1Var.f10898j = 0.97f;
        yh1Var.f10897i = 1.03f;
        yh1Var.c();
        if (j10 != -9223372036854775807L) {
            yh1Var.f10892d = K(wvVar, obj, j10);
            yh1Var.c();
            return;
        }
        if (!yn0.c(!wvVar2.o() ? wvVar2.e(wvVar2.n(jo1Var2.f6052a, vuVar).f9970c, hvVar, 0L).f5407a : null, hvVar.f5407a) || z9) {
            yh1Var.f10892d = -9223372036854775807L;
            yh1Var.c();
        }
    }

    public final void z(boolean z9, boolean z10) {
        this.M = z9;
        long jElapsedRealtime = -9223372036854775807L;
        if (z9 && !z10) {
            jElapsedRealtime = SystemClock.elapsedRealtime();
        }
        this.N = jElapsedRealtime;
    }
}
