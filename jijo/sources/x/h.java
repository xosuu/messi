package x;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18245a = new b();

    public static boolean a(w.d dVar) {
        int[] iArr = dVar.f18013p0;
        int i10 = iArr[0];
        int i11 = iArr[1];
        w.d dVar2 = dVar.T;
        w.e eVar = dVar2 != null ? (w.e) dVar2 : null;
        if (eVar != null) {
            int i12 = eVar.f18013p0[0];
        }
        if (eVar != null) {
            int i13 = eVar.f18013p0[1];
        }
        boolean z9 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f18015r == 0 && dVar.W == 0.0f && dVar.u(0)) || (i10 == 3 && dVar.f18015r == 1 && dVar.v(0, dVar.r()));
        boolean z10 = i11 == 1 || dVar.C() || i11 == 2 || (i11 == 3 && dVar.f18016s == 0 && dVar.W == 0.0f && dVar.u(1)) || (i11 == 3 && dVar.f18016s == 1 && dVar.v(1, dVar.l()));
        if (dVar.W <= 0.0f || !(z9 || z10)) {
            return z9 && z10;
        }
        return true;
    }

    public static void b(int i10, w.d dVar, n nVar, boolean z9) {
        w.c cVar;
        w.c cVar2;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f18006m) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.A() && a(dVar)) {
            w.e.W(dVar, nVar, new b());
        }
        w.c cVarJ = dVar.j(2);
        w.c cVarJ2 = dVar.j(4);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet<w.c> hashSet = cVarJ.f17973a;
        char c10 = 0;
        if (hashSet != null && cVarJ.f17975c) {
            for (w.c cVar5 : hashSet) {
                w.d dVar2 = cVar5.f17976d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                if (dVar2.A() && zA) {
                    w.e.W(dVar2, nVar, new b());
                }
                w.c cVar6 = dVar2.I;
                w.c cVar7 = dVar2.K;
                boolean z10 = (cVar5 == cVar6 && (cVar4 = cVar7.f17978f) != null && cVar4.f17975c) || (cVar5 == cVar7 && (cVar3 = cVar6.f17978f) != null && cVar3.f17975c);
                int i12 = dVar2.f18013p0[c10];
                if (i12 != 3 || zA) {
                    if (!dVar2.A()) {
                        if (cVar5 == cVar6 && cVar7.f17978f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.r() + iE);
                            b(i11, dVar2, nVar, z9);
                        } else if (cVar5 == cVar7 && cVar6.f17978f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.r(), iE2);
                            b(i11, dVar2, nVar, z9);
                        } else if (z10 && !dVar2.y()) {
                            c(i11, dVar2, nVar, z9);
                        }
                    }
                } else if (i12 == 3 && dVar2.f18019v >= 0 && dVar2.f18018u >= 0 && ((dVar2.f17995g0 == 8 || (dVar2.f18015r == 0 && dVar2.W == 0.0f)) && !dVar2.y() && !dVar2.F && z10 && !dVar2.y())) {
                    d(i11, dVar, nVar, dVar2, z9);
                }
                c10 = 0;
            }
        }
        if (dVar instanceof w.h) {
            return;
        }
        HashSet<w.c> hashSet2 = cVarJ2.f17973a;
        if (hashSet2 != null && cVarJ2.f17975c) {
            for (w.c cVar8 : hashSet2) {
                w.d dVar3 = cVar8.f17976d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.A() && zA2) {
                    w.e.W(dVar3, nVar, new b());
                }
                w.c cVar9 = dVar3.I;
                w.c cVar10 = dVar3.K;
                boolean z11 = (cVar8 == cVar9 && (cVar2 = cVar10.f17978f) != null && cVar2.f17975c) || (cVar8 == cVar10 && (cVar = cVar9.f17978f) != null && cVar.f17975c);
                int i14 = dVar3.f18013p0[0];
                if (i14 != 3 || zA2) {
                    if (!dVar3.A()) {
                        if (cVar8 == cVar9 && cVar10.f17978f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.r() + iE3);
                            b(i13, dVar3, nVar, z9);
                        } else if (cVar8 == cVar10 && cVar9.f17978f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.r(), iE4);
                            b(i13, dVar3, nVar, z9);
                        } else if (z11 && !dVar3.y()) {
                            c(i13, dVar3, nVar, z9);
                        }
                    }
                } else if (i14 == 3 && dVar3.f18019v >= 0 && dVar3.f18018u >= 0) {
                    if (dVar3.f17995g0 != 8) {
                        if (dVar3.f18015r == 0) {
                            if (dVar3.W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.y() && !dVar3.F && z11 && !dVar3.y()) {
                        d(i13, dVar, nVar, dVar3, z9);
                    }
                }
            }
        }
        dVar.f18006m = true;
    }

    public static void c(int i10, w.d dVar, n nVar, boolean z9) {
        float f10 = dVar.f17989d0;
        w.c cVar = dVar.I;
        int iD = cVar.f17978f.d();
        w.c cVar2 = dVar.K;
        int iD2 = cVar2.f17978f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = dVar.r();
        int i11 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i11 = (iD - iD2) - iR;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11)) + iD;
        int i13 = i12 + iR;
        if (iD > iD2) {
            i13 = i12 - iR;
        }
        dVar.K(i12, i13);
        b(i10 + 1, dVar, nVar, z9);
    }

    public static void d(int i10, w.d dVar, n nVar, w.d dVar2, boolean z9) {
        float f10 = dVar2.f17989d0;
        w.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f17978f.d();
        w.c cVar2 = dVar2.K;
        int iD = cVar2.f17978f.d() - cVar2.e();
        if (iD >= iE) {
            int iR = dVar2.r();
            if (dVar2.f17995g0 != 8) {
                int i11 = dVar2.f18015r;
                if (i11 == 2) {
                    iR = (int) (dVar2.f17989d0 * 0.5f * (dVar instanceof w.e ? dVar.r() : dVar.T.r()));
                } else if (i11 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(dVar2.f18018u, iR);
                int i12 = dVar2.f18019v;
                if (i12 > 0) {
                    iR = Math.min(i12, iR);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iR)) + 0.5f));
            dVar2.K(i13, iR + i13);
            b(i10 + 1, dVar2, nVar, z9);
        }
    }

    public static void e(int i10, w.d dVar, n nVar) {
        float f10 = dVar.f17991e0;
        w.c cVar = dVar.J;
        int iD = cVar.f17978f.d();
        w.c cVar2 = dVar.L;
        int iD2 = cVar2.f17978f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = dVar.l();
        int i11 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i11 = (iD - iD2) - iL;
        }
        int i12 = (int) (i11 > 0 ? (f10 * i11) + 0.5f : f10 * i11);
        int i13 = iD + i12;
        int i14 = i13 + iL;
        if (iD > iD2) {
            i13 = iD - i12;
            i14 = i13 - iL;
        }
        dVar.L(i13, i14);
        g(i10 + 1, dVar, nVar);
    }

    public static void f(int i10, w.d dVar, n nVar, w.d dVar2) {
        float f10 = dVar2.f17991e0;
        w.c cVar = dVar2.J;
        int iE = cVar.e() + cVar.f17978f.d();
        w.c cVar2 = dVar2.L;
        int iD = cVar2.f17978f.d() - cVar2.e();
        if (iD >= iE) {
            int iL = dVar2.l();
            if (dVar2.f17995g0 != 8) {
                int i11 = dVar2.f18016s;
                if (i11 == 2) {
                    iL = (int) (f10 * 0.5f * (dVar instanceof w.e ? dVar.l() : dVar.T.l()));
                } else if (i11 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(dVar2.f18021x, iL);
                int i12 = dVar2.f18022y;
                if (i12 > 0) {
                    iL = Math.min(i12, iL);
                }
            }
            int i13 = iE + ((int) ((f10 * ((iD - iE) - iL)) + 0.5f));
            dVar2.L(i13, iL + i13);
            g(i10 + 1, dVar2, nVar);
        }
    }

    public static void g(int i10, w.d dVar, n nVar) {
        w.c cVar;
        w.c cVar2;
        w.c cVar3;
        w.c cVar4;
        w.c cVar5;
        if (dVar.f18008n) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.A() && a(dVar)) {
            w.e.W(dVar, nVar, new b());
        }
        w.c cVarJ = dVar.j(3);
        w.c cVarJ2 = dVar.j(5);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet<w.c> hashSet = cVarJ.f17973a;
        if (hashSet != null && cVarJ.f17975c) {
            for (w.c cVar6 : hashSet) {
                w.d dVar2 = cVar6.f17976d;
                int i11 = i10 + 1;
                boolean zA = a(dVar2);
                if (dVar2.A() && zA) {
                    w.e.W(dVar2, nVar, new b());
                }
                w.c cVar7 = dVar2.J;
                w.c cVar8 = dVar2.L;
                boolean z9 = (cVar6 == cVar7 && (cVar5 = cVar8.f17978f) != null && cVar5.f17975c) || (cVar6 == cVar8 && (cVar4 = cVar7.f17978f) != null && cVar4.f17975c);
                int i12 = dVar2.f18013p0[1];
                if (i12 != 3 || zA) {
                    if (!dVar2.A()) {
                        if (cVar6 == cVar7 && cVar8.f17978f == null) {
                            int iE = cVar7.e() + iD;
                            dVar2.L(iE, dVar2.l() + iE);
                            g(i11, dVar2, nVar);
                        } else if (cVar6 == cVar8 && cVar7.f17978f == null) {
                            int iE2 = iD - cVar8.e();
                            dVar2.L(iE2 - dVar2.l(), iE2);
                            g(i11, dVar2, nVar);
                        } else if (z9 && !dVar2.z()) {
                            e(i11, dVar2, nVar);
                        }
                    }
                } else if (i12 == 3 && dVar2.f18022y >= 0 && dVar2.f18021x >= 0 && (dVar2.f17995g0 == 8 || (dVar2.f18016s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.z() && !dVar2.F && z9 && !dVar2.z()) {
                        f(i11, dVar, nVar, dVar2);
                    }
                }
            }
        }
        if (dVar instanceof w.h) {
            return;
        }
        HashSet<w.c> hashSet2 = cVarJ2.f17973a;
        if (hashSet2 != null && cVarJ2.f17975c) {
            for (w.c cVar9 : hashSet2) {
                w.d dVar3 = cVar9.f17976d;
                int i13 = i10 + 1;
                boolean zA2 = a(dVar3);
                if (dVar3.A() && zA2) {
                    w.e.W(dVar3, nVar, new b());
                }
                w.c cVar10 = dVar3.J;
                w.c cVar11 = dVar3.L;
                boolean z10 = (cVar9 == cVar10 && (cVar3 = cVar11.f17978f) != null && cVar3.f17975c) || (cVar9 == cVar11 && (cVar2 = cVar10.f17978f) != null && cVar2.f17975c);
                int i14 = dVar3.f18013p0[1];
                if (i14 != 3 || zA2) {
                    if (!dVar3.A()) {
                        if (cVar9 == cVar10 && cVar11.f17978f == null) {
                            int iE3 = cVar10.e() + iD2;
                            dVar3.L(iE3, dVar3.l() + iE3);
                            g(i13, dVar3, nVar);
                        } else if (cVar9 == cVar11 && cVar10.f17978f == null) {
                            int iE4 = iD2 - cVar11.e();
                            dVar3.L(iE4 - dVar3.l(), iE4);
                            g(i13, dVar3, nVar);
                        } else if (z10 && !dVar3.z()) {
                            e(i13, dVar3, nVar);
                        }
                    }
                } else if (i14 == 3 && dVar3.f18022y >= 0 && dVar3.f18021x >= 0) {
                    if (dVar3.f17995g0 != 8) {
                        if (dVar3.f18016s == 0) {
                            if (dVar3.W == 0.0f) {
                            }
                        }
                    }
                    if (!dVar3.z() && !dVar3.F && z10 && !dVar3.z()) {
                        f(i13, dVar, nVar, dVar3);
                    }
                }
            }
        }
        w.c cVarJ3 = dVar.j(6);
        if (cVarJ3.f17973a != null && cVarJ3.f17975c) {
            int iD3 = cVarJ3.d();
            for (w.c cVar12 : cVarJ3.f17973a) {
                w.d dVar4 = cVar12.f17976d;
                int i15 = i10 + 1;
                boolean zA3 = a(dVar4);
                if (dVar4.A() && zA3) {
                    w.e.W(dVar4, nVar, new b());
                }
                if (dVar4.f18013p0[1] != 3 || zA3) {
                    if (!dVar4.A() && cVar12 == (cVar = dVar4.M)) {
                        int iE5 = cVar12.e() + iD3;
                        if (dVar4.E) {
                            int i16 = iE5 - dVar4.f17983a0;
                            int i17 = dVar4.V + i16;
                            dVar4.Z = i16;
                            dVar4.J.l(i16);
                            dVar4.L.l(i17);
                            cVar.l(iE5);
                            dVar4.f18004l = true;
                        }
                        g(i15, dVar4, nVar);
                    }
                }
            }
        }
        dVar.f18008n = true;
    }
}
