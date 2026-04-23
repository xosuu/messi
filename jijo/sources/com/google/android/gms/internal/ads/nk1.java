package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class nk1 implements dk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l90 f7289a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vu f7290b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hv f7291d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final mk1 f7292f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SparseArray f7293h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public x.e f7294q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public is f7295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public tm0 f7296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7297u;

    public nk1(l90 l90Var) {
        l90Var.getClass();
        this.f7289a = l90Var;
        int i10 = yn0.f10944a;
        Looper looperMyLooper = Looper.myLooper();
        this.f7294q = new x.e(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, l90Var, new jk1(3, (Object) null));
        vu vuVar = new vu();
        this.f7290b = vuVar;
        this.f7291d = new hv();
        this.f7292f = new mk1(vuVar);
        this.f7293h = new SparseArray();
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void A(zzhw zzhwVar) {
        jo1 jo1Var;
        G((!(zzhwVar instanceof zzhw) || (jo1Var = zzhwVar.f11652t) == null) ? a() : S(jo1Var), 10, new jk1(1, 0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void B(Exception exc) {
        G(b0(), 1030, new mb1(22, (Object) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void C(wz0 wz0Var, jo1 jo1Var) {
        is isVar = this.f7295s;
        isVar.getClass();
        mk1 mk1Var = this.f7292f;
        mk1Var.getClass();
        mk1Var.f6997b = bz0.k(wz0Var);
        if (!wz0Var.isEmpty()) {
            mk1Var.f7000e = (jo1) wz0Var.get(0);
            jo1Var.getClass();
            mk1Var.f7001f = jo1Var;
        }
        if (mk1Var.f6999d == null) {
            mk1Var.f6999d = mk1.a(isVar, mk1Var.f6997b, mk1Var.f7000e, mk1Var.f6996a);
        }
        mk1Var.c(isVar.zzn());
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void D(int i10, long j10) {
        G(S(this.f7292f.f7000e), 1021, new jk1((fb1) null));
    }

    public final ek1 E(wv wvVar, int i10, jo1 jo1Var) {
        jo1 jo1Var2 = true == wvVar.o() ? null : jo1Var;
        ((jl0) this.f7289a).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z9 = wvVar.equals(this.f7295s.zzn()) && i10 == this.f7295s.zzd();
        long jX = 0;
        if (jo1Var2 == null || !jo1Var2.b()) {
            if (z9) {
                jX = this.f7295s.zzj();
            } else if (!wvVar.o()) {
                wvVar.e(i10, this.f7291d, 0L).getClass();
                jX = yn0.x(0L);
            }
        } else if (z9 && this.f7295s.zzb() == jo1Var2.f6053b && this.f7295s.zzc() == jo1Var2.f6054c) {
            jX = this.f7295s.zzk();
        }
        return new ek1(jElapsedRealtime, wvVar, i10, jo1Var2, jX, this.f7295s.zzn(), this.f7295s.zzd(), this.f7292f.f6999d, this.f7295s.zzk(), this.f7295s.zzm());
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void F(y1 y1Var, xh1 xh1Var) {
        ek1 ek1VarB0 = b0();
        G(ek1VarB0, 1017, new kk1(ek1VarB0, y1Var, xh1Var, 0));
    }

    public final void G(ek1 ek1Var, int i10, qe0 qe0Var) {
        this.f7293h.put(i10, ek1Var);
        x.e eVar = this.f7294q;
        eVar.j(i10, qe0Var);
        eVar.i();
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void H(e10 e10Var) {
        ek1 ek1VarB0 = b0();
        G(ek1VarB0, 25, new ok0(ek1VarB0, 9, e10Var));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void I(wh1 wh1Var) {
        G(b0(), 1015, new jk1(10, 0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void J(int i10, sr srVar, sr srVar2) {
        if (i10 == 1) {
            this.f7297u = false;
            i10 = 1;
        }
        is isVar = this.f7295s;
        isVar.getClass();
        mk1 mk1Var = this.f7292f;
        mk1Var.f6999d = mk1.a(isVar, mk1Var.f6997b, mk1Var.f7000e, mk1Var.f6996a);
        ek1 ek1VarA = a();
        G(ek1VarA, 11, new lj0(i10, srVar, srVar2, ek1VarA));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void K(boolean z9) {
        G(a(), 3, new mb1(14, (fb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void L(fk1 fk1Var) {
        this.f7294q.h(fk1Var);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void M(int i10, boolean z9) {
        G(a(), -1, new mb1((ib1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void N(zzhw zzhwVar) {
        jo1 jo1Var;
        ek1 ek1VarA = (!(zzhwVar instanceof zzhw) || (jo1Var = zzhwVar.f11652t) == null) ? a() : S(jo1Var);
        G(ek1VarA, 10, new ok0(ek1VarA, 8, zzhwVar));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void O(fk fkVar) {
        G(a(), 14, new jk1(15, 0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void P(long j10, String str, long j11) {
        G(b0(), 1016, new jk1(0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void Q(wh1 wh1Var) {
        G(b0(), 1007, new mb1(13, (Object) null));
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void R(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        G(a0(i10, jo1Var), 1000, new mb1((gb1) null));
    }

    public final ek1 S(jo1 jo1Var) {
        this.f7295s.getClass();
        wv wvVar = jo1Var == null ? null : (wv) this.f7292f.f6998c.get(jo1Var);
        if (jo1Var != null && wvVar != null) {
            return E(wvVar, wvVar.n(jo1Var.f6052a, this.f7290b).f9970c, jo1Var);
        }
        int iZzd = this.f7295s.zzd();
        wv wvVarZzn = this.f7295s.zzn();
        if (iZzd >= wvVarZzn.c()) {
            wvVarZzn = wv.f10355a;
        }
        return E(wvVarZzn, iZzd, null);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void T(int i10) {
        is isVar = this.f7295s;
        isVar.getClass();
        mk1 mk1Var = this.f7292f;
        mk1Var.f6999d = mk1.a(isVar, mk1Var.f6997b, mk1Var.f7000e, mk1Var.f6996a);
        mk1Var.c(isVar.zzn());
        G(a(), 0, new mb1(18, (jb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void U(wh1 wh1Var) {
        ek1 ek1VarS = S(this.f7292f.f7000e);
        G(ek1VarS, 1020, new cj0(ek1VarS, 12, wh1Var));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void V(Exception exc) {
        G(b0(), 1014, new jk1(14, 0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void W(int i10, long j10) {
        ek1 ek1VarS = S(this.f7292f.f7000e);
        G(ek1VarS, 1018, new e4(i10, j10, ek1VarS));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void X(Exception exc) {
        G(b0(), 1029, new jk1(11, 0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void Y(fk1 fk1Var) {
        x.e eVar = this.f7294q;
        eVar.l();
        CopyOnWriteArraySet<nf0> copyOnWriteArraySet = (CopyOnWriteArraySet) eVar.f18228f;
        for (nf0 nf0Var : copyOnWriteArraySet) {
            if (nf0Var.f7254a.equals(fk1Var)) {
                bf0 bf0Var = (bf0) eVar.f18227e;
                nf0Var.f7257d = true;
                if (nf0Var.f7256c) {
                    nf0Var.f7256c = false;
                    bf0Var.G(nf0Var.f7254a, nf0Var.f7255b.e());
                }
                copyOnWriteArraySet.remove(nf0Var);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void Z(String str) {
        G(b0(), 1019, new jk1(0, 0));
    }

    public final ek1 a() {
        return S(this.f7292f.f6999d);
    }

    public final ek1 a0(int i10, jo1 jo1Var) {
        is isVar = this.f7295s;
        isVar.getClass();
        if (jo1Var != null) {
            return ((wv) this.f7292f.f6998c.get(jo1Var)) != null ? S(jo1Var) : E(wv.f10355a, i10, jo1Var);
        }
        wv wvVarZzn = isVar.zzn();
        if (i10 >= wvVarZzn.c()) {
            wvVarZzn = wv.f10355a;
        }
        return E(wvVarZzn, i10, null);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void b(boolean z9) {
        G(a(), 7, new mb1(26, (fb1) null));
    }

    public final ek1 b0() {
        return S(this.f7292f.f7001f);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void c(to toVar) {
        G(a(), 12, new mb1(11, (Object) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void d(mz mzVar) {
        G(a(), 2, new mb1(27, (Object) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void e(long j10) {
        G(b0(), 1010, new mb1((kb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void f(int i10) {
        ek1 ek1VarA = a();
        G(ek1VarA, 4, new gp0(i10, 11, ek1VarA));
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void g(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        G(a0(i10, jo1Var), 1002, new jk1(5, (fb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void h(boolean z9) {
        G(b0(), 23, new mb1(20, (fb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void i(wh1 wh1Var) {
        G(S(this.f7292f.f7000e), 1013, new jk1(6, 0));
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void j(int i10, jo1 jo1Var, gk1 gk1Var) {
        ek1 ek1VarA0 = a0(i10, jo1Var);
        G(ek1VarA0, 1004, new cj0(ek1VarA0, 11, gk1Var));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void k(int i10) {
        G(a(), 6, new mb1(29, (jb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void l(is isVar, Looper looper) {
        boolean z9 = true;
        if (this.f7295s != null && !this.f7292f.f6997b.isEmpty()) {
            z9 = false;
        }
        tc1.W(z9);
        isVar.getClass();
        this.f7295s = isVar;
        this.f7296t = ((jl0) this.f7289a).a(looper, null);
        x.e eVar = this.f7294q;
        this.f7294q = new x.e((CopyOnWriteArraySet) eVar.f18228f, looper, (l90) eVar.f18225c, new ok0(this, 7, isVar), eVar.f18224b);
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void m(jk1 jk1Var) {
        G(b0(), 1032, new jk1(13, 0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void n(final long j10, final Object obj) {
        final ek1 ek1VarB0 = b0();
        G(ek1VarB0, 26, new qe0(ek1VarB0, obj, j10) { // from class: com.google.android.gms.internal.ads.lk1

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Object f6653a;

            {
                this.f6653a = obj;
            }

            @Override // com.google.android.gms.internal.ads.qe0
            /* JADX INFO: renamed from: zza */
            public final void mo0zza(Object obj2) {
                ((fk1) obj2).p();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void o(qq qqVar) {
        G(a(), 13, new mb1(17, (Object) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void p(long j10, long j11, int i10) {
        G(b0(), 1011, new mb1((Object) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void q(int i10, boolean z9) {
        G(a(), 5, new jk1((Object) null));
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void r(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var, IOException iOException, boolean z9) {
        ek1 ek1VarA0 = a0(i10, jo1Var);
        G(ek1VarA0, 1003, new androidx.emoji2.text.r(ek1VarA0, bo1Var, gk1Var, iOException, z9));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void s(int i10, int i11) {
        G(b0(), 24, new jk1((hk1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void t(fg fgVar, int i10) {
        G(a(), 1, new mb1((hb1) null));
    }

    @Override // com.google.android.gms.internal.ads.no1
    public final void u(int i10, jo1 jo1Var, bo1 bo1Var, gk1 gk1Var) {
        G(a0(i10, jo1Var), 1001, new jk1(7, (fb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void v(y1 y1Var, xh1 xh1Var) {
        ek1 ek1VarB0 = b0();
        G(ek1VarB0, 1009, new kk1(ek1VarB0, y1Var, xh1Var, 1));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void w(long j10, String str, long j11) {
        G(b0(), 1008, new mb1((fb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void x(jk1 jk1Var) {
        G(b0(), 1031, new jk1(8, 0));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void y(long j10, long j11, int i10) {
        Object next;
        Object obj;
        jo1 jo1Var;
        mk1 mk1Var = this.f7292f;
        if (mk1Var.f6997b.isEmpty()) {
            jo1Var = null;
        } else {
            bz0 bz0Var = mk1Var.f6997b;
            if (!(bz0Var instanceof List)) {
                zy0 zy0VarListIterator = bz0Var.listIterator(0);
                do {
                    next = zy0VarListIterator.next();
                } while (zy0VarListIterator.hasNext());
                obj = next;
            } else {
                if (bz0Var.isEmpty()) {
                    throw new NoSuchElementException();
                }
                obj = bz0Var.get(bz0Var.size() - 1);
            }
            jo1Var = (jo1) obj;
        }
        ek1 ek1VarS = S(jo1Var);
        G(ek1VarS, 1006, new gk1(ek1VarS, i10, j10, j11));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void z(float f10) {
        G(b0(), 22, new mb1((lb1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzP() {
        tm0 tm0Var = this.f7296t;
        tc1.A(tm0Var);
        tm0Var.b(new yd0(20, this));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzu() {
        if (this.f7297u) {
            return;
        }
        ek1 ek1VarA = a();
        this.f7297u = true;
        G(ek1VarA, -1, new jk1(9, (ik1) null));
    }

    @Override // com.google.android.gms.internal.ads.dk1
    public final void zzx(String str) {
        G(b0(), 1012, new mb1(15, (Object) null));
    }
}
