package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ui1 extends pi1 {
    public static final /* synthetic */ int V = 0;
    public int A;
    public final ak1 B;
    public final ii1 C;
    public qq D;
    public fk E;
    public Object F;
    public Surface G;
    public final int H;
    public vk0 I;
    public final ce1 J;
    public float K;
    public boolean L;
    public final boolean M;
    public boolean N;
    public final int O;
    public fk P;
    public sj1 Q;
    public int R;
    public long S;
    public final rk0 T;
    public fp1 U;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6 f9498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qq f9499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c8.a f9500d = new c8.a(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f9501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final is f9502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vh1[] f9503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dq1 f9504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final tm0 f9505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final aj1 f9506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final x.e f9507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArraySet f9508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final vu f9509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f9510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f9511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dk1 f9512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Looper f9513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final kq1 f9514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jl0 f9515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ri1 f9516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final si1 f9517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final uh1 f9518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f9519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9522z;

    static {
        vg.a("media3.exoplayer");
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.android.gms.internal.ads.dk1, java.lang.Object] */
    public ui1(hi1 hi1Var, is isVar) {
        boolean z9;
        int i10 = 0;
        try {
            fg0.e("Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.0-alpha02] [" + yn0.f10948e + "]");
            this.f9501e = hi1Var.f5289a.getApplicationContext();
            this.f9512p = hi1Var.f5296h.apply(hi1Var.f5290b);
            this.O = hi1Var.f5298j;
            this.J = hi1Var.f5299k;
            this.H = hi1Var.f5300l;
            this.L = false;
            this.f9519w = hi1Var.f5304p;
            ri1 ri1Var = new ri1(this);
            this.f9516t = ri1Var;
            this.f9517u = new si1();
            Handler handler = new Handler(hi1Var.f5297i);
            this.f9503g = hi1Var.f5291c.f3686a.d(handler, ri1Var, ri1Var);
            this.f9504h = (dq1) hi1Var.f5293e.mo3zza();
            Context context = hi1Var.f5292d.f4206a;
            new c0();
            ok0 ok0Var = new ok0(context, 4);
            ep epVar = new ep();
            if (ok0Var != ((cw0) epVar.f4271f)) {
                epVar.f4271f = ok0Var;
                ((Map) epVar.f4269b).clear();
                ((Map) epVar.f4270d).clear();
            }
            this.f9514r = kq1.c(hi1Var.f5295g.f4931a);
            this.f9511o = hi1Var.f5301m;
            this.B = hi1Var.f5302n;
            Looper looper = hi1Var.f5297i;
            this.f9513q = looper;
            jl0 jl0Var = hi1Var.f5290b;
            this.f9515s = jl0Var;
            this.f9502f = isVar;
            this.f9507k = new x.e(looper, jl0Var, new mb1(9, i10));
            this.f9508l = new CopyOnWriteArraySet();
            this.f9510n = new ArrayList();
            this.U = new fp1();
            this.C = ii1.f5619a;
            this.f9498b = new k6(new zj1[2], new cq1[2], mz.f7078b, null);
            this.f9509m = new vu();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            for (int i11 = 0; i11 < 20; i11++) {
                int i12 = iArr[i11];
                tc1.W(!false);
                sparseBooleanArray.append(i12, true);
            }
            this.f9504h.getClass();
            tc1.W(!false);
            sparseBooleanArray.append(29, true);
            tc1.W(!false);
            p pVar = new p(sparseBooleanArray);
            this.f9499c = new qq(pVar);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i13 = 0; i13 < pVar.f7743a.size(); i13++) {
                int iA = pVar.a(i13);
                tc1.W(!false);
                sparseBooleanArray2.append(iA, true);
            }
            tc1.W(!false);
            sparseBooleanArray2.append(4, true);
            tc1.W(!false);
            sparseBooleanArray2.append(10, true);
            tc1.W(!false);
            this.D = new qq(new p(sparseBooleanArray2));
            this.f9505i = this.f9515s.a(this.f9513q, null);
            rk0 rk0Var = new rk0(28, this);
            this.T = rk0Var;
            this.Q = sj1.g(this.f9498b);
            this.f9512p.l(this.f9502f, this.f9513q);
            this.f9506j = new aj1(this.f9503g, this.f9504h, this.f9498b, (dj1) hi1Var.f5294f.mo3zza(), this.f9514r, this.f9512p, this.B, hi1Var.f5308t, hi1Var.f5303o, this.f9513q, this.f9515s, rk0Var, yn0.f10944a < 31 ? new vk1(hi1Var.f5307s) : qi1.a(this.f9501e, this, hi1Var.f5305q, hi1Var.f5307s), this.C);
            this.K = 1.0f;
            fk fkVar = fk.f4541y;
            this.E = fkVar;
            this.P = fkVar;
            this.R = -1;
            AudioManager audioManager = (AudioManager) this.f9501e.getSystemService("audio");
            int iGenerateAudioSessionId = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            int i14 = o60.f7519a;
            this.M = true;
            dk1 dk1Var = this.f9512p;
            x.e eVar = this.f9507k;
            dk1Var.getClass();
            eVar.h(dk1Var);
            kq1 kq1Var = this.f9514r;
            Handler handler2 = new Handler(this.f9513q);
            dk1 dk1Var2 = this.f9512p;
            kq1Var.getClass();
            dk1Var2.getClass();
            oi1 oi1Var = kq1Var.f6372b;
            oi1Var.d(dk1Var2);
            ((CopyOnWriteArrayList) oi1Var.f7585b).add(new gq1(handler2, dk1Var2));
            this.f9508l.add(this.f9516t);
            hi1Var.f5289a.getApplicationContext();
            new gh1(handler);
            this.f9518v = new uh1(hi1Var.f5289a, handler, this.f9516t);
            yn0.c(null, null);
            e10 e10Var = e10.f3801d;
            this.I = vk0.f9903c;
            dq1 dq1Var = this.f9504h;
            ce1 ce1Var = this.J;
            aq1 aq1Var = (aq1) dq1Var;
            synchronized (aq1Var.f2770c) {
                z9 = !aq1Var.f2775h.equals(ce1Var);
                aq1Var.f2775h = ce1Var;
            }
            if (z9) {
                aq1Var.i();
            }
            l(1, 10, Integer.valueOf(iGenerateAudioSessionId));
            l(2, 10, Integer.valueOf(iGenerateAudioSessionId));
            l(1, 3, this.J);
            l(2, 4, Integer.valueOf(this.H));
            l(2, 5, 0);
            l(1, 9, Boolean.valueOf(this.L));
            l(2, 7, this.f9517u);
            l(6, 8, this.f9517u);
            l(-1, 16, Integer.valueOf(this.O));
            this.f9500d.c();
        } catch (Throwable th) {
            this.f9500d.c();
            throw th;
        }
    }

    public static long h(sj1 sj1Var) {
        hv hvVar = new hv();
        vu vuVar = new vu();
        sj1Var.f8883a.n(sj1Var.f8884b.f6052a, vuVar);
        long j10 = sj1Var.f8885c;
        if (j10 != -9223372036854775807L) {
            return j10;
        }
        sj1Var.f8883a.e(vuVar.f9970c, hvVar, 0L).getClass();
        return 0L;
    }

    public final void A() {
        String str;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = yn0.f10948e;
        HashSet hashSet = vg.f9838a;
        synchronized (vg.class) {
            str = vg.f9839b;
        }
        StringBuilder sbL = l.a0.l("Release ", hexString, " [AndroidXMedia3/1.4.0-alpha02] [", str2, "] [");
        sbL.append(str);
        sbL.append("]");
        fg0.e(sbL.toString());
        q();
        uh1 uh1Var = this.f9518v;
        uh1Var.f9490c = null;
        uh1Var.a();
        if (!this.f9506j.J()) {
            x.e eVar = this.f9507k;
            eVar.j(10, new mb1(8));
            eVar.i();
        }
        this.f9507k.k();
        this.f9505i.f9195a.removeCallbacksAndMessages(null);
        kq1 kq1Var = this.f9514r;
        kq1Var.f6372b.d(this.f9512p);
        this.Q.getClass();
        sj1 sj1VarE = this.Q.e(1);
        this.Q = sj1VarE;
        sj1 sj1VarA = sj1VarE.a(sj1VarE.f8884b);
        this.Q = sj1VarA;
        sj1VarA.f8897o = sj1VarA.f8899q;
        this.Q.f8898p = 0L;
        this.f9512p.zzP();
        this.f9504h.b();
        Surface surface = this.G;
        if (surface != null) {
            surface.release();
            this.G = null;
        }
        int i10 = o60.f7519a;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void a(int i10, long j10) {
        q();
        if (i10 == -1) {
            return;
        }
        tc1.K(i10 >= 0);
        wv wvVar = this.Q.f8883a;
        if (wvVar.o() || i10 < wvVar.c()) {
            this.f9512p.zzu();
            this.f9520x++;
            if (b()) {
                fg0.f("seekTo ignored because an ad is playing");
                yi1 yi1Var = new yi1(this.Q);
                yi1Var.a(1);
                ui1 ui1Var = (ui1) this.T.f8631b;
                ui1Var.getClass();
                ui1Var.f9505i.b(new vh0(ui1Var, 16, yi1Var));
                return;
            }
            sj1 sj1VarE = this.Q;
            int i11 = sj1VarE.f8887e;
            if (i11 == 3 || (i11 == 4 && !wvVar.o())) {
                sj1VarE = this.Q.e(2);
            }
            int iZzd = zzd();
            sj1 sj1VarJ = j(sj1VarE, wvVar, i(wvVar, i10, j10));
            long jU = yn0.u(j10);
            aj1 aj1Var = this.f9506j;
            aj1Var.getClass();
            aj1Var.f2711t.a(3, new zi1(wvVar, i10, jU)).a();
            p(sj1VarJ, 0, 1, true, 1, g(sj1VarJ), iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean b() {
        q();
        return this.Q.f8884b.b();
    }

    public final void c(fk1 fk1Var) {
        q();
        this.f9512p.Y(fk1Var);
    }

    public final void d(qn1 qn1Var) {
        q();
        List listSingletonList = Collections.singletonList(qn1Var);
        q();
        q();
        e(this.Q);
        zzk();
        this.f9520x++;
        ArrayList arrayList = this.f9510n;
        boolean z9 = false;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                arrayList.remove(i10);
            }
            fp1 fp1Var = this.U;
            int[] iArr = fp1Var.f4597b;
            int[] iArr2 = new int[iArr.length - size];
            int i11 = 0;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                int i13 = iArr[i12];
                if (i13 < 0 || i13 >= size) {
                    int i14 = i12 - i11;
                    if (i13 >= 0) {
                        i13 -= size;
                    }
                    iArr2[i14] = i13;
                } else {
                    i11++;
                }
            }
            this.U = new fp1(iArr2, new Random(fp1Var.f4596a.nextLong()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i15 = 0; i15 < listSingletonList.size(); i15++) {
            pj1 pj1Var = new pj1((qn1) listSingletonList.get(i15), this.f9511o);
            arrayList2.add(pj1Var);
            arrayList.add(i15, new ti1(pj1Var.f7901b, pj1Var.f7900a));
        }
        this.U = this.U.a(arrayList2.size());
        xj1 xj1Var = new xj1(arrayList, this.U);
        boolean zO = xj1Var.o();
        int i16 = xj1Var.f10587d;
        if (!zO && i16 < 0) {
            throw new zzaj();
        }
        int iG = xj1Var.g(false);
        sj1 sj1VarJ = j(this.Q, xj1Var, i(xj1Var, iG, -9223372036854775807L));
        int i17 = sj1VarJ.f8887e;
        if (iG != -1 && i17 != 1) {
            i17 = 4;
            if (!xj1Var.o() && iG < i16) {
                i17 = 2;
            }
        }
        sj1 sj1VarE = sj1VarJ.e(i17);
        long jU = yn0.u(-9223372036854775807L);
        fp1 fp1Var2 = this.U;
        aj1 aj1Var = this.f9506j;
        aj1Var.getClass();
        aj1Var.f2711t.a(17, new xi1(arrayList2, fp1Var2, iG, jU)).a();
        if (!this.Q.f8884b.f6052a.equals(sj1VarE.f8884b.f6052a) && !this.Q.f8883a.o()) {
            z9 = true;
        }
        p(sj1VarE, 0, 1, z9, 4, g(sj1VarE), -1);
    }

    public final int e(sj1 sj1Var) {
        if (sj1Var.f8883a.o()) {
            return this.R;
        }
        return sj1Var.f8883a.n(sj1Var.f8884b.f6052a, this.f9509m).f9970c;
    }

    public final long f(sj1 sj1Var) {
        if (!sj1Var.f8884b.b()) {
            return yn0.x(g(sj1Var));
        }
        Object obj = sj1Var.f8884b.f6052a;
        vu vuVar = this.f9509m;
        wv wvVar = sj1Var.f8883a;
        wvVar.n(obj, vuVar);
        long j10 = sj1Var.f8885c;
        if (j10 != -9223372036854775807L) {
            return yn0.x(j10) + yn0.x(0L);
        }
        wvVar.e(e(sj1Var), this.f7889a, 0L).getClass();
        return yn0.x(0L);
    }

    public final long g(sj1 sj1Var) {
        if (sj1Var.f8883a.o()) {
            return yn0.u(this.S);
        }
        long j10 = sj1Var.f8899q;
        if (sj1Var.f8884b.b()) {
            return j10;
        }
        sj1Var.f8883a.n(sj1Var.f8884b.f6052a, this.f9509m);
        return j10;
    }

    public final Pair i(wv wvVar, int i10, long j10) {
        if (wvVar.o()) {
            this.R = i10;
            if (j10 == -9223372036854775807L) {
                j10 = 0;
            }
            this.S = j10;
            return null;
        }
        if (i10 == -1 || i10 >= wvVar.c()) {
            i10 = wvVar.g(false);
            wvVar.e(i10, this.f7889a, 0L).getClass();
            j10 = yn0.x(0L);
        }
        return wvVar.l(this.f7889a, this.f9509m, i10, yn0.u(j10));
    }

    public final sj1 j(sj1 sj1Var, wv wvVar, Pair pair) {
        List list;
        tc1.K(wvVar.o() || pair != null);
        wv wvVar2 = sj1Var.f8883a;
        long jF = f(sj1Var);
        sj1 sj1VarF = sj1Var.f(wvVar);
        if (wvVar.o()) {
            jo1 jo1Var = sj1.f8882s;
            long jU = yn0.u(this.S);
            sj1 sj1VarA = sj1VarF.b(jo1Var, jU, jU, jU, 0L, kp1.f6364d, this.f9498b, wz0.f10382h).a(jo1Var);
            sj1VarA.f8897o = sj1VarA.f8899q;
            return sj1VarA;
        }
        Object obj = sj1VarF.f8884b.f6052a;
        int i10 = yn0.f10944a;
        boolean z9 = !obj.equals(pair.first);
        jo1 jo1Var2 = z9 ? new jo1(-1L, pair.first) : sj1VarF.f8884b;
        long jLongValue = ((Long) pair.second).longValue();
        long jU2 = yn0.u(jF);
        if (!wvVar2.o()) {
            wvVar2.n(obj, this.f9509m);
        }
        if (z9 || jLongValue < jU2) {
            tc1.W(!jo1Var2.b());
            kp1 kp1Var = z9 ? kp1.f6364d : sj1VarF.f8890h;
            k6 k6Var = z9 ? this.f9498b : sj1VarF.f8891i;
            if (z9) {
                zy0 zy0Var = bz0.f3132b;
                list = wz0.f10382h;
            } else {
                list = sj1VarF.f8892j;
            }
            sj1 sj1VarA2 = sj1VarF.b(jo1Var2, jLongValue, jLongValue, jLongValue, 0L, kp1Var, k6Var, list).a(jo1Var2);
            sj1VarA2.f8897o = jLongValue;
            return sj1VarA2;
        }
        if (jLongValue != jU2) {
            tc1.W(!jo1Var2.b());
            long jMax = Math.max(0L, sj1VarF.f8898p - (jLongValue - jU2));
            long j10 = sj1VarF.f8897o;
            if (sj1VarF.f8893k.equals(sj1VarF.f8884b)) {
                j10 = jLongValue + jMax;
            }
            sj1 sj1VarB = sj1VarF.b(jo1Var2, jLongValue, jLongValue, jLongValue, jMax, sj1VarF.f8890h, sj1VarF.f8891i, sj1VarF.f8892j);
            sj1VarB.f8897o = j10;
            return sj1VarB;
        }
        int iA = wvVar.a(sj1VarF.f8893k.f6052a);
        if (iA != -1 && wvVar.d(iA, this.f9509m, false).f9970c == wvVar.n(jo1Var2.f6052a, this.f9509m).f9970c) {
            return sj1VarF;
        }
        wvVar.n(jo1Var2.f6052a, this.f9509m);
        long jA = jo1Var2.b() ? this.f9509m.a(jo1Var2.f6053b, jo1Var2.f6054c) : this.f9509m.f9971d;
        sj1 sj1VarA3 = sj1VarF.b(jo1Var2, sj1VarF.f8899q, sj1VarF.f8899q, sj1VarF.f8886d, jA - sj1VarF.f8899q, sj1VarF.f8890h, sj1VarF.f8891i, sj1VarF.f8892j).a(jo1Var2);
        sj1VarA3.f8897o = jA;
        return sj1VarA3;
    }

    public final void k(int i10, int i11) {
        vk0 vk0Var = this.I;
        if (i10 == vk0Var.f9904a && i11 == vk0Var.f9905b) {
            return;
        }
        this.I = new vk0(i10, i11);
        o0.s sVar = new o0.s(i10, i11);
        x.e eVar = this.f9507k;
        eVar.j(24, sVar);
        eVar.i();
        l(2, 14, new vk0(i10, i11));
    }

    public final void l(int i10, int i11, Object obj) {
        vh1[] vh1VarArr = this.f9503g;
        int length = vh1VarArr.length;
        for (int i12 = 0; i12 < 2; i12++) {
            vh1 vh1Var = vh1VarArr[i12];
            if (i10 == -1 || vh1Var.f9849b == i10) {
                e(this.Q);
                wv wvVar = this.Q.f8883a;
                aj1 aj1Var = this.f9506j;
                vj1 vj1Var = new vj1(aj1Var, vh1Var, aj1Var.f2713v);
                tc1.W(!vj1Var.f9874f);
                vj1Var.f9871c = i11;
                tc1.W(!vj1Var.f9874f);
                vj1Var.f9872d = obj;
                vj1Var.b();
            }
        }
    }

    public final void m(Object obj) {
        ArrayList arrayList = new ArrayList();
        vh1[] vh1VarArr = this.f9503g;
        int length = vh1VarArr.length;
        boolean z9 = false;
        for (int i10 = 0; i10 < 2; i10++) {
            vh1 vh1Var = vh1VarArr[i10];
            if (vh1Var.f9849b == 2) {
                e(this.Q);
                wv wvVar = this.Q.f8883a;
                aj1 aj1Var = this.f9506j;
                vj1 vj1Var = new vj1(aj1Var, vh1Var, aj1Var.f2713v);
                tc1.W(!vj1Var.f9874f);
                vj1Var.f9871c = 1;
                tc1.W(true ^ vj1Var.f9874f);
                vj1Var.f9872d = obj;
                vj1Var.b();
                arrayList.add(vj1Var);
            }
        }
        Object obj2 = this.F;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((vj1) it.next()).d(this.f9519w);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z9 = true;
            }
            Object obj3 = this.F;
            Surface surface = this.G;
            if (obj3 == surface) {
                surface.release();
                this.G = null;
            }
        }
        this.F = obj;
        if (z9) {
            n(new zzhw(2, new zzjy(3), 1003));
        }
    }

    public final void n(zzhw zzhwVar) {
        sj1 sj1Var = this.Q;
        sj1 sj1VarA = sj1Var.a(sj1Var.f8884b);
        sj1VarA.f8897o = sj1VarA.f8899q;
        sj1VarA.f8898p = 0L;
        sj1 sj1VarE = sj1VarA.e(1);
        if (zzhwVar != null) {
            sj1VarE = sj1VarE.d(zzhwVar);
        }
        sj1 sj1Var2 = sj1VarE;
        this.f9520x++;
        tm0 tm0Var = this.f9506j.f2711t;
        tm0Var.getClass();
        fm0 fm0VarE = tm0.e();
        fm0VarE.f4572a = tm0Var.f9195a.obtainMessage(6);
        fm0VarE.a();
        p(sj1Var2, 0, 1, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void o(int i10, int i11, boolean z9) {
        int i12 = 0;
        ?? r15 = (!z9 || i10 == -1) ? 0 : 1;
        if (r15 != 0 && i10 != 1) {
            i12 = 1;
        }
        sj1 sj1Var = this.Q;
        if (sj1Var.f8894l == r15 && sj1Var.f8895m == i12) {
            return;
        }
        this.f9520x++;
        sj1 sj1VarC = sj1Var.c(i12, r15);
        tm0 tm0Var = this.f9506j.f2711t;
        tm0Var.getClass();
        fm0 fm0VarE = tm0.e();
        fm0VarE.f4572a = tm0Var.f9195a.obtainMessage(1, r15, i12);
        fm0VarE.a();
        p(sj1VarC, 0, i11, false, 5, -9223372036854775807L, -1);
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0532 A[LOOP:0: B:252:0x052a->B:254:0x0532, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0553 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x055d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0570 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x057c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0592 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x059f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(final com.google.android.gms.internal.ads.sj1 r43, final int r44, final int r45, boolean r46, int r47, long r48, int r50) {
        /*
            Method dump skipped, instruction units count: 1490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ui1.p(com.google.android.gms.internal.ads.sj1, int, int, boolean, int, long, int):void");
    }

    public final void q() {
        this.f9500d.a();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f9513q;
        if (threadCurrentThread != looper.getThread()) {
            String str = String.format(Locale.US, "Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (this.M) {
                throw new IllegalStateException(str);
            }
            fg0.g(str, this.N ? null : new IllegalStateException());
            this.N = true;
        }
    }

    public final long r() {
        q();
        if (b()) {
            sj1 sj1Var = this.Q;
            return sj1Var.f8893k.equals(sj1Var.f8884b) ? yn0.x(this.Q.f8897o) : s();
        }
        q();
        if (this.Q.f8883a.o()) {
            return this.S;
        }
        sj1 sj1Var2 = this.Q;
        long j10 = 0;
        if (sj1Var2.f8893k.f6055d != sj1Var2.f8884b.f6055d) {
            return yn0.x(sj1Var2.f8883a.e(zzd(), this.f7889a, 0L).f5416j);
        }
        long j11 = sj1Var2.f8897o;
        if (this.Q.f8893k.b()) {
            sj1 sj1Var3 = this.Q;
            sj1Var3.f8883a.n(sj1Var3.f8893k.f6052a, this.f9509m).f9973f.a(this.Q.f8893k.f6053b).getClass();
        } else {
            j10 = j11;
        }
        sj1 sj1Var4 = this.Q;
        sj1Var4.f8883a.n(sj1Var4.f8893k.f6052a, this.f9509m);
        return yn0.x(j10);
    }

    public final long s() {
        q();
        if (!b()) {
            wv wvVarZzn = zzn();
            if (wvVarZzn.o()) {
                return -9223372036854775807L;
            }
            return yn0.x(wvVarZzn.e(zzd(), this.f7889a, 0L).f5416j);
        }
        sj1 sj1Var = this.Q;
        jo1 jo1Var = sj1Var.f8884b;
        Object obj = jo1Var.f6052a;
        wv wvVar = sj1Var.f8883a;
        vu vuVar = this.f9509m;
        wvVar.n(obj, vuVar);
        return yn0.x(vuVar.a(jo1Var.f6053b, jo1Var.f6054c));
    }

    public final void t() {
        q();
        boolean zZzu = zzu();
        this.f9518v.a();
        int i10 = zZzu ? 1 : -1;
        o(i10, (!zZzu || i10 == 1) ? 1 : 2, zZzu);
        sj1 sj1Var = this.Q;
        if (sj1Var.f8887e != 1) {
            return;
        }
        sj1 sj1VarD = sj1Var.d(null);
        sj1 sj1VarE = sj1VarD.e(true == sj1VarD.f8883a.o() ? 4 : 2);
        this.f9520x++;
        tm0 tm0Var = this.f9506j.f2711t;
        tm0Var.getClass();
        fm0 fm0VarE = tm0.e();
        fm0VarE.f4572a = tm0Var.f9195a.obtainMessage(0);
        fm0VarE.a();
        p(sj1VarE, 1, 1, false, 5, -9223372036854775807L, -1);
    }

    public final void u(boolean z9) {
        q();
        zzf();
        this.f9518v.a();
        int i10 = 1;
        int i11 = z9 ? 1 : -1;
        if (z9 && i11 != 1) {
            i10 = 2;
        }
        o(i11, i10, z9);
    }

    public final void v(Surface surface) {
        q();
        m(surface);
        int i10 = surface == null ? 0 : -1;
        k(i10, i10);
    }

    public final void w(float f10) {
        q();
        final float fMax = Math.max(0.0f, Math.min(f10, 1.0f));
        if (this.K == fMax) {
            return;
        }
        this.K = fMax;
        l(1, 2, Float.valueOf(this.f9518v.f9492e * fMax));
        qe0 qe0Var = new qe0() { // from class: com.google.android.gms.internal.ads.mi1
            @Override // com.google.android.gms.internal.ads.qe0
            /* JADX INFO: renamed from: zza */
            public final void mo0zza(Object obj) {
                int i10 = ui1.V;
                ((dk1) obj).z(fMax);
            }
        };
        x.e eVar = this.f9507k;
        eVar.j(22, qe0Var);
        eVar.i();
    }

    public final void x() {
        q();
        uh1 uh1Var = this.f9518v;
        zzu();
        uh1Var.a();
        n(null);
        int i10 = o60.f7519a;
        wz0 wz0Var = wz0.f10382h;
        long j10 = this.Q.f8899q;
        bz0.k(wz0Var);
    }

    public final void y() {
        q();
        int length = this.f9503g.length;
    }

    public final void z(fk1 fk1Var) {
        this.f9512p.L(fk1Var);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final int zzb() {
        q();
        if (b()) {
            return this.Q.f8884b.f6053b;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final int zzc() {
        q();
        if (b()) {
            return this.Q.f8884b.f6054c;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final int zzd() {
        q();
        int iE = e(this.Q);
        if (iE == -1) {
            return 0;
        }
        return iE;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final int zze() {
        q();
        if (this.Q.f8883a.o()) {
            return 0;
        }
        sj1 sj1Var = this.Q;
        return sj1Var.f8883a.a(sj1Var.f8884b.f6052a);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final int zzf() {
        q();
        return this.Q.f8887e;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final int zzg() {
        q();
        return this.Q.f8895m;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void zzh() {
        q();
    }

    @Override // com.google.android.gms.internal.ads.is
    public final long zzj() {
        q();
        return f(this.Q);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final long zzk() {
        q();
        return yn0.x(g(this.Q));
    }

    @Override // com.google.android.gms.internal.ads.is
    public final long zzm() {
        q();
        return yn0.x(this.Q.f8898p);
    }

    @Override // com.google.android.gms.internal.ads.is
    public final wv zzn() {
        q();
        return this.Q.f8883a;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final mz zzo() {
        q();
        return (mz) this.Q.f8891i.f6200f;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final boolean zzu() {
        q();
        return this.Q.f8894l;
    }

    @Override // com.google.android.gms.internal.ads.is
    public final void zzv() {
        q();
    }
}
