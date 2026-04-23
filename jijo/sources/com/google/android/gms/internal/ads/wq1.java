package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class wq1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final rq1 f10302m = new rq1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vq1 f10303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f10304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f10305c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tq1 f10306d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArraySet f10307e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l90 f10308f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1 f10309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public si1 f10310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public tm0 f10311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Pair f10312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10314l;

    public /* synthetic */ wq1(androidx.emoji2.text.r rVar) {
        vq1 vq1Var = new vq1(this, (Context) rVar.f632b);
        this.f10303a = vq1Var;
        e eVar = (e) rVar.f633d;
        this.f10304b = eVar;
        this.f10305c = new k(new mx0(this, 0), eVar);
        tq1 tq1Var = (tq1) rVar.f635h;
        tc1.A(tq1Var);
        this.f10306d = tq1Var;
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.f10307e = copyOnWriteArraySet;
        this.f10314l = 0;
        copyOnWriteArraySet.add(vq1Var);
    }

    public static void a(wq1 wq1Var, y1 y1Var, l90 l90Var) {
        tc1.W(wq1Var.f10314l == 0);
        wq1Var.f10308f = l90Var;
        Looper looperMyLooper = Looper.myLooper();
        tc1.A(looperMyLooper);
        wq1Var.f10311i = ((jl0) l90Var).a(looperMyLooper, null);
        wk1 wk1Var = y1Var.f10726y;
        if (wk1Var == null || !wk1Var.c()) {
            wk1Var = wk1.f10217h;
        }
        if (wk1Var.f10220c != 7 || yn0.f10944a < 34) {
        }
        try {
            tq1 tq1Var = wq1Var.f10306d;
            Objects.requireNonNull(wq1Var.f10311i);
            zy0 zy0Var = bz0.f3132b;
            wz0 wz0Var = wz0.f10382h;
            tq1Var.a();
            Pair pair = wq1Var.f10312j;
            if (pair == null) {
                throw null;
            }
            ((vk0) pair.second).getClass();
            throw null;
        } catch (zzcl e10) {
            throw new zzabb(e10, y1Var);
        }
    }

    public final void b(long j10, long j11) throws zzhw {
        k kVar;
        iq1 iq1Var;
        int i10;
        if (this.f10313k != 0 || (i10 = (iq1Var = (kVar = this.f10305c).f6124e).f5676b) == 0) {
            return;
        }
        if (i10 == 0) {
            throw new NoSuchElementException();
        }
        long j12 = ((long[]) iq1Var.f5677c)[iq1Var.f5675a];
        Long l9 = (Long) kVar.f6123d.c(j12);
        e eVar = kVar.f6120a;
        if (l9 != null && l9.longValue() != kVar.f6127h) {
            kVar.f6127h = l9.longValue();
            eVar.e(2);
        }
        int iA = kVar.f6120a.a(j12, j10, j11, kVar.f6127h, false, kVar.f6121b);
        final int i11 = 1;
        mx0 mx0Var = kVar.f6129j;
        if (iA != 0 && iA != 1) {
            if (iA == 2 || iA == 3 || iA == 4) {
                kVar.f6128i = j12;
                iq1Var.e();
                for (final vq1 vq1Var : ((wq1) mx0Var.f7073a).f10307e) {
                    final q qVar = vq1Var.f9946g;
                    final int i12 = 0;
                    vq1Var.f9947h.execute(new Runnable(vq1Var, qVar, i12) { // from class: com.google.android.gms.internal.ads.uq1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f9581a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ q f9582b;

                        {
                            this.f9581a = i12;
                            this.f9582b = qVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i13 = this.f9581a;
                            q qVar2 = this.f9582b;
                            switch (i13) {
                                case 0:
                                    qVar2.c();
                                    break;
                                default:
                                    qVar2.e();
                                    break;
                            }
                        }
                    });
                }
                tc1.A(null);
                throw null;
            }
            return;
        }
        kVar.f6128i = j12;
        e10 e10Var = (e10) kVar.f6122c.c(Long.valueOf(iq1Var.e()).longValue());
        if (e10Var != null && !e10Var.equals(e10.f3801d) && !e10Var.equals(kVar.f6126g)) {
            kVar.f6126g = e10Var;
            q0 q0Var = new q0();
            q0Var.f8057q = e10Var.f3802a;
            q0Var.f8058r = e10Var.f3803b;
            q0Var.f("video/raw");
            y1 y1Var = new y1(q0Var);
            wq1 wq1Var = (wq1) mx0Var.f7073a;
            wq1Var.f10309g = y1Var;
            for (vq1 vq1Var2 : wq1Var.f10307e) {
                vq1Var2.f9947h.execute(new l0.a(vq1Var2, vq1Var2.f9946g, e10Var, 25, 0));
            }
        }
        int i13 = eVar.f3773d;
        eVar.f3773d = 3;
        eVar.f3775f = yn0.u(SystemClock.elapsedRealtime());
        if (i13 != 3) {
            wq1 wq1Var2 = (wq1) mx0Var.f7073a;
            if (wq1Var2.f10312j != null) {
                for (final vq1 vq1Var3 : wq1Var2.f10307e) {
                    final q qVar2 = vq1Var3.f9946g;
                    vq1Var3.f9947h.execute(new Runnable(vq1Var3, qVar2, i11) { // from class: com.google.android.gms.internal.ads.uq1

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f9581a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ q f9582b;

                        {
                            this.f9581a = i11;
                            this.f9582b = qVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i132 = this.f9581a;
                            q qVar22 = this.f9582b;
                            switch (i132) {
                                case 0:
                                    qVar22.c();
                                    break;
                                default:
                                    qVar22.e();
                                    break;
                            }
                        }
                    });
                }
            }
        }
        wq1 wq1Var3 = (wq1) mx0Var.f7073a;
        if (wq1Var3.f10310h != null) {
            if (wq1Var3.f10309g == null) {
                new y1(new q0());
            }
            wq1 wq1Var4 = (wq1) mx0Var.f7073a;
            si1 si1Var = wq1Var4.f10310h;
            tc1.A(wq1Var4.f10308f);
            System.nanoTime();
            si1Var.getClass();
        }
        tc1.A(null);
        throw null;
    }
}
