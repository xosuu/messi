package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class jc1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic1 f5905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5908d = 0;

    public jc1(ic1 ic1Var) {
        Charset charset = ed1.f3910a;
        if (ic1Var == null) {
            throw new NullPointerException("input");
        }
        this.f5905a = ic1Var;
        ic1Var.f5562b = this;
    }

    public static final void r(int i10) throws zzgyn {
        if ((i10 & 3) != 0) {
            throw zzgyn.d();
        }
    }

    public static final void s(int i10) throws zzgyn {
        if ((i10 & 7) != 0) {
            throw zzgyn.d();
        }
    }

    public final void a(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof jd1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            jd1 jd1Var = (jd1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iP = ic1Var.p();
                s(iP);
                int iH = ic1Var.h() + iP;
                do {
                    jd1Var.f(ic1Var.q());
                } while (ic1Var.h() < iH);
                return;
            }
            do {
                jd1Var.f(ic1Var.q());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iP2 = ic1Var.p();
                s(iP2);
                int iH2 = ic1Var.h() + iP2;
                do {
                    dd1Var.add(Long.valueOf(ic1Var.q()));
                } while (ic1Var.h() < iH2);
                return;
            }
            do {
                dd1Var.add(Long.valueOf(ic1Var.q()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void b(dd1 dd1Var) throws zzgyn {
        int iO;
        int i10 = this.f5906b & 7;
        ic1 ic1Var = this.f5905a;
        if (i10 == 2) {
            int iP = ic1Var.p();
            r(iP);
            int iH = ic1Var.h() + iP;
            do {
                dd1Var.add(Float.valueOf(ic1Var.g()));
            } while (ic1Var.h() < iH);
            return;
        }
        if (i10 != 5) {
            throw zzgyn.a();
        }
        do {
            dd1Var.add(Float.valueOf(ic1Var.g()));
            if (ic1Var.a()) {
                return;
            } else {
                iO = ic1Var.o();
            }
        } while (iO == this.f5906b);
        this.f5908d = iO;
    }

    public final void c(dd1 dd1Var, ge1 ge1Var, pc1 pc1Var) throws zzgym {
        int iO;
        int i10 = this.f5906b;
        if ((i10 & 7) != 3) {
            throw zzgyn.a();
        }
        do {
            wc1 wc1VarZze = ge1Var.zze();
            n(wc1VarZze, ge1Var, pc1Var);
            ge1Var.b(wc1VarZze);
            dd1Var.add(wc1VarZze);
            ic1 ic1Var = this.f5905a;
            if (ic1Var.a() || this.f5908d != 0) {
                return;
            } else {
                iO = ic1Var.o();
            }
        } while (iO == i10);
        this.f5908d = iO;
    }

    public final void d(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof xc1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            xc1 xc1Var = (xc1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iH = ic1Var.h() + ic1Var.p();
                do {
                    xc1Var.f(ic1Var.l());
                } while (ic1Var.h() < iH);
                p(iH);
                return;
            }
            do {
                xc1Var.f(ic1Var.l());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iH2 = ic1Var.h() + ic1Var.p();
                do {
                    dd1Var.add(Integer.valueOf(ic1Var.l()));
                } while (ic1Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                dd1Var.add(Integer.valueOf(ic1Var.l()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void e(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof jd1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            jd1 jd1Var = (jd1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iH = ic1Var.h() + ic1Var.p();
                do {
                    jd1Var.f(ic1Var.r());
                } while (ic1Var.h() < iH);
                p(iH);
                return;
            }
            do {
                jd1Var.f(ic1Var.r());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iH2 = ic1Var.h() + ic1Var.p();
                do {
                    dd1Var.add(Long.valueOf(ic1Var.r()));
                } while (ic1Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                dd1Var.add(Long.valueOf(ic1Var.r()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void f(dd1 dd1Var, ge1 ge1Var, pc1 pc1Var) throws zzgyn {
        int iO;
        int i10 = this.f5906b;
        if ((i10 & 7) != 2) {
            throw zzgyn.a();
        }
        do {
            wc1 wc1VarZze = ge1Var.zze();
            o(wc1VarZze, ge1Var, pc1Var);
            ge1Var.b(wc1VarZze);
            dd1Var.add(wc1VarZze);
            ic1 ic1Var = this.f5905a;
            if (ic1Var.a() || this.f5908d != 0) {
                return;
            } else {
                iO = ic1Var.o();
            }
        } while (iO == i10);
        this.f5908d = iO;
    }

    public final void g(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof xc1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            xc1 xc1Var = (xc1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 == 2) {
                int iP = ic1Var.p();
                r(iP);
                int iH = ic1Var.h() + iP;
                do {
                    xc1Var.f(ic1Var.m());
                } while (ic1Var.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw zzgyn.a();
            }
            do {
                xc1Var.f(ic1Var.m());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 == 2) {
                int iP2 = ic1Var.p();
                r(iP2);
                int iH2 = ic1Var.h() + iP2;
                do {
                    dd1Var.add(Integer.valueOf(ic1Var.m()));
                } while (ic1Var.h() < iH2);
                return;
            }
            if (i11 != 5) {
                throw zzgyn.a();
            }
            do {
                dd1Var.add(Integer.valueOf(ic1Var.m()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void h(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof jd1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            jd1 jd1Var = (jd1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iP = ic1Var.p();
                s(iP);
                int iH = ic1Var.h() + iP;
                do {
                    jd1Var.f(ic1Var.s());
                } while (ic1Var.h() < iH);
                return;
            }
            do {
                jd1Var.f(ic1Var.s());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 1) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iP2 = ic1Var.p();
                s(iP2);
                int iH2 = ic1Var.h() + iP2;
                do {
                    dd1Var.add(Long.valueOf(ic1Var.s()));
                } while (ic1Var.h() < iH2);
                return;
            }
            do {
                dd1Var.add(Long.valueOf(ic1Var.s()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void i(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof xc1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            xc1 xc1Var = (xc1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iH = ic1Var.h() + ic1Var.p();
                do {
                    xc1Var.f(ic1Var.n());
                } while (ic1Var.h() < iH);
                p(iH);
                return;
            }
            do {
                xc1Var.f(ic1Var.n());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iH2 = ic1Var.h() + ic1Var.p();
                do {
                    dd1Var.add(Integer.valueOf(ic1Var.n()));
                } while (ic1Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                dd1Var.add(Integer.valueOf(ic1Var.n()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void j(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof jd1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            jd1 jd1Var = (jd1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iH = ic1Var.h() + ic1Var.p();
                do {
                    jd1Var.f(ic1Var.t());
                } while (ic1Var.h() < iH);
                p(iH);
                return;
            }
            do {
                jd1Var.f(ic1Var.t());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iH2 = ic1Var.h() + ic1Var.p();
                do {
                    dd1Var.add(Long.valueOf(ic1Var.t()));
                } while (ic1Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                dd1Var.add(Long.valueOf(ic1Var.t()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void k(dd1 dd1Var, boolean z9) throws zzgym {
        String strW;
        int iO;
        if ((this.f5906b & 7) != 2) {
            throw zzgyn.a();
        }
        do {
            ic1 ic1Var = this.f5905a;
            if (z9) {
                q(2);
                strW = ic1Var.x();
            } else {
                q(2);
                strW = ic1Var.w();
            }
            dd1Var.add(strW);
            if (ic1Var.a()) {
                return;
            } else {
                iO = ic1Var.o();
            }
        } while (iO == this.f5906b);
        this.f5908d = iO;
    }

    public final void l(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof xc1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            xc1 xc1Var = (xc1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iH = ic1Var.h() + ic1Var.p();
                do {
                    xc1Var.f(ic1Var.p());
                } while (ic1Var.h() < iH);
                p(iH);
                return;
            }
            do {
                xc1Var.f(ic1Var.p());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iH2 = ic1Var.h() + ic1Var.p();
                do {
                    dd1Var.add(Integer.valueOf(ic1Var.p()));
                } while (ic1Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                dd1Var.add(Integer.valueOf(ic1Var.p()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void m(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof jd1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            jd1 jd1Var = (jd1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iH = ic1Var.h() + ic1Var.p();
                do {
                    jd1Var.f(ic1Var.u());
                } while (ic1Var.h() < iH);
                p(iH);
                return;
            }
            do {
                jd1Var.f(ic1Var.u());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iH2 = ic1Var.h() + ic1Var.p();
                do {
                    dd1Var.add(Long.valueOf(ic1Var.u()));
                } while (ic1Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                dd1Var.add(Long.valueOf(ic1Var.u()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void n(Object obj, ge1 ge1Var, pc1 pc1Var) {
        int i10 = this.f5907c;
        this.f5907c = ((this.f5906b >>> 3) << 3) | 4;
        try {
            ge1Var.e(obj, this, pc1Var);
            if (this.f5906b == this.f5907c) {
            } else {
                throw zzgyn.d();
            }
        } finally {
            this.f5907c = i10;
        }
    }

    public final void o(Object obj, ge1 ge1Var, pc1 pc1Var) throws zzgyn {
        ic1 ic1Var = this.f5905a;
        int iP = ic1Var.p();
        if (ic1Var.f5561a >= 100) {
            throw new zzgyn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int i10 = ic1Var.i(iP);
        ic1Var.f5561a++;
        ge1Var.e(obj, this, pc1Var);
        ic1Var.y();
        ic1Var.f5561a--;
        ic1Var.z(i10);
    }

    public final void p(int i10) throws zzgyn {
        if (this.f5905a.h() != i10) {
            throw zzgyn.e();
        }
    }

    public final void q(int i10) {
        if ((this.f5906b & 7) != i10) {
            throw zzgyn.a();
        }
    }

    public final int t() {
        int iO = this.f5908d;
        if (iO != 0) {
            this.f5906b = iO;
            this.f5908d = 0;
        } else {
            iO = this.f5905a.o();
            this.f5906b = iO;
        }
        if (iO == 0 || iO == this.f5907c) {
            return Integer.MAX_VALUE;
        }
        return iO >>> 3;
    }

    public final ec1 u() {
        q(2);
        return this.f5905a.v();
    }

    public final void v(dd1 dd1Var) throws zzgyn {
        int iO;
        int i10 = this.f5906b & 7;
        ic1 ic1Var = this.f5905a;
        if (i10 == 0) {
            do {
                dd1Var.add(Boolean.valueOf(ic1Var.b()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            this.f5908d = iO;
            return;
        }
        if (i10 != 2) {
            throw zzgyn.a();
        }
        int iH = ic1Var.h() + ic1Var.p();
        do {
            dd1Var.add(Boolean.valueOf(ic1Var.b()));
        } while (ic1Var.h() < iH);
        p(iH);
    }

    public final void w(dd1 dd1Var) throws zzgym {
        int iO;
        if ((this.f5906b & 7) != 2) {
            throw zzgyn.a();
        }
        do {
            dd1Var.add(u());
            ic1 ic1Var = this.f5905a;
            if (ic1Var.a()) {
                return;
            } else {
                iO = ic1Var.o();
            }
        } while (iO == this.f5906b);
        this.f5908d = iO;
    }

    public final void x(dd1 dd1Var) throws zzgyn {
        int iO;
        int i10 = this.f5906b & 7;
        ic1 ic1Var = this.f5905a;
        if (i10 == 1) {
            do {
                dd1Var.add(Double.valueOf(ic1Var.f()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            this.f5908d = iO;
            return;
        }
        if (i10 != 2) {
            throw zzgyn.a();
        }
        int iP = ic1Var.p();
        s(iP);
        int iH = ic1Var.h() + iP;
        do {
            dd1Var.add(Double.valueOf(ic1Var.f()));
        } while (ic1Var.h() < iH);
    }

    public final void y(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof xc1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            xc1 xc1Var = (xc1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw zzgyn.a();
                }
                int iH = ic1Var.h() + ic1Var.p();
                do {
                    xc1Var.f(ic1Var.j());
                } while (ic1Var.h() < iH);
                p(iH);
                return;
            }
            do {
                xc1Var.f(ic1Var.j());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 != 0) {
                if (i11 != 2) {
                    throw zzgyn.a();
                }
                int iH2 = ic1Var.h() + ic1Var.p();
                do {
                    dd1Var.add(Integer.valueOf(ic1Var.j()));
                } while (ic1Var.h() < iH2);
                p(iH2);
                return;
            }
            do {
                dd1Var.add(Integer.valueOf(ic1Var.j()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }

    public final void z(dd1 dd1Var) throws zzgyn {
        int iO;
        int iO2;
        boolean z9 = dd1Var instanceof xc1;
        ic1 ic1Var = this.f5905a;
        if (z9) {
            xc1 xc1Var = (xc1) dd1Var;
            int i10 = this.f5906b & 7;
            if (i10 == 2) {
                int iP = ic1Var.p();
                r(iP);
                int iH = ic1Var.h() + iP;
                do {
                    xc1Var.f(ic1Var.k());
                } while (ic1Var.h() < iH);
                return;
            }
            if (i10 != 5) {
                throw zzgyn.a();
            }
            do {
                xc1Var.f(ic1Var.k());
                if (ic1Var.a()) {
                    return;
                } else {
                    iO2 = ic1Var.o();
                }
            } while (iO2 == this.f5906b);
        } else {
            int i11 = this.f5906b & 7;
            if (i11 == 2) {
                int iP2 = ic1Var.p();
                r(iP2);
                int iH2 = ic1Var.h() + iP2;
                do {
                    dd1Var.add(Integer.valueOf(ic1Var.k()));
                } while (ic1Var.h() < iH2);
                return;
            }
            if (i11 != 5) {
                throw zzgyn.a();
            }
            do {
                dd1Var.add(Integer.valueOf(ic1Var.k()));
                if (ic1Var.a()) {
                    return;
                } else {
                    iO = ic1Var.o();
                }
            } while (iO == this.f5906b);
            iO2 = iO;
        }
        this.f5908d = iO2;
    }
}
