package w;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f17952s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f17953t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f17954u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f17955v0;

    @Override // w.d
    public final boolean B() {
        return this.f17955v0;
    }

    @Override // w.d
    public final boolean C() {
        return this.f17955v0;
    }

    public final boolean T() {
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        boolean z9 = true;
        while (true) {
            i10 = this.f18068r0;
            if (i13 >= i10) {
                break;
            }
            d dVar = this.f18067q0[i13];
            if ((this.f17953t0 || dVar.d()) && ((((i11 = this.f17952s0) == 0 || i11 == 1) && !dVar.B()) || (((i12 = this.f17952s0) == 2 || i12 == 3) && !dVar.C()))) {
                z9 = false;
            }
            i13++;
        }
        if (!z9 || i10 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i14 = 0; i14 < this.f18068r0; i14++) {
            d dVar2 = this.f18067q0[i14];
            if (this.f17953t0 || dVar2.d()) {
                if (!z10) {
                    int i15 = this.f17952s0;
                    if (i15 == 0) {
                        iMax = dVar2.j(2).d();
                    } else if (i15 == 1) {
                        iMax = dVar2.j(4).d();
                    } else if (i15 == 2) {
                        iMax = dVar2.j(3).d();
                    } else if (i15 == 3) {
                        iMax = dVar2.j(5).d();
                    }
                    z10 = true;
                }
                int i16 = this.f17952s0;
                if (i16 == 0) {
                    iMax = Math.min(iMax, dVar2.j(2).d());
                } else if (i16 == 1) {
                    iMax = Math.max(iMax, dVar2.j(4).d());
                } else if (i16 == 2) {
                    iMax = Math.min(iMax, dVar2.j(3).d());
                } else if (i16 == 3) {
                    iMax = Math.max(iMax, dVar2.j(5).d());
                }
            }
        }
        int i17 = iMax + this.f17954u0;
        int i18 = this.f17952s0;
        if (i18 == 0 || i18 == 1) {
            K(i17, i17);
        } else {
            L(i17, i17);
        }
        this.f17955v0 = true;
        return true;
    }

    public final int U() {
        int i10 = this.f17952s0;
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return (i10 == 2 || i10 == 3) ? 1 : -1;
    }

    @Override // w.d
    public final void c(u.d dVar, boolean z9) {
        boolean z10;
        int i10;
        int i11;
        c[] cVarArr = this.Q;
        c cVar = this.I;
        cVarArr[0] = cVar;
        c cVar2 = this.J;
        int i12 = 2;
        cVarArr[2] = cVar2;
        c cVar3 = this.K;
        cVarArr[1] = cVar3;
        c cVar4 = this.L;
        cVarArr[3] = cVar4;
        for (c cVar5 : cVarArr) {
            cVar5.f17981i = dVar.k(cVar5);
        }
        int i13 = this.f17952s0;
        if (i13 < 0 || i13 >= 4) {
            return;
        }
        c cVar6 = cVarArr[i13];
        if (!this.f17955v0) {
            T();
        }
        if (this.f17955v0) {
            this.f17955v0 = false;
            int i14 = this.f17952s0;
            if (i14 == 0 || i14 == 1) {
                dVar.d(cVar.f17981i, this.Y);
                dVar.d(cVar3.f17981i, this.Y);
                return;
            } else {
                if (i14 == 2 || i14 == 3) {
                    dVar.d(cVar2.f17981i, this.Z);
                    dVar.d(cVar4.f17981i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i15 = 0; i15 < this.f18068r0; i15++) {
            d dVar2 = this.f18067q0[i15];
            if ((this.f17953t0 || dVar2.d()) && ((((i11 = this.f17952s0) == 0 || i11 == 1) && dVar2.f18013p0[0] == 3 && dVar2.I.f17978f != null && dVar2.K.f17978f != null) || ((i11 == 2 || i11 == 3) && dVar2.f18013p0[1] == 3 && dVar2.J.f17978f != null && dVar2.L.f17978f != null))) {
                z10 = true;
                break;
            }
        }
        z10 = false;
        boolean z11 = cVar.g() || cVar3.g();
        boolean z12 = cVar2.g() || cVar4.g();
        int i16 = (z10 || !(((i10 = this.f17952s0) == 0 && z11) || ((i10 == 2 && z12) || ((i10 == 1 && z11) || (i10 == 3 && z12))))) ? 4 : 5;
        int i17 = 0;
        while (i17 < this.f18068r0) {
            d dVar3 = this.f18067q0[i17];
            if (this.f17953t0 || dVar3.d()) {
                u.i iVarK = dVar.k(dVar3.Q[this.f17952s0]);
                int i18 = this.f17952s0;
                c cVar7 = dVar3.Q[i18];
                cVar7.f17981i = iVarK;
                c cVar8 = cVar7.f17978f;
                int i19 = (cVar8 == null || cVar8.f17976d != this) ? 0 : cVar7.f17979g;
                if (i18 == 0 || i18 == i12) {
                    u.i iVar = cVar6.f17981i;
                    int i20 = this.f17954u0 - i19;
                    u.c cVarL = dVar.l();
                    u.i iVarM = dVar.m();
                    iVarM.f17498f = 0;
                    cVarL.c(iVar, iVarK, iVarM, i20);
                    dVar.c(cVarL);
                } else {
                    u.i iVar2 = cVar6.f17981i;
                    int i21 = this.f17954u0 + i19;
                    u.c cVarL2 = dVar.l();
                    u.i iVarM2 = dVar.m();
                    iVarM2.f17498f = 0;
                    cVarL2.b(iVar2, iVarK, iVarM2, i21);
                    dVar.c(cVarL2);
                }
                dVar.e(cVar6.f17981i, iVarK, this.f17954u0 + i19, i16);
            }
            i17++;
            i12 = 2;
        }
        int i22 = this.f17952s0;
        if (i22 == 0) {
            dVar.e(cVar3.f17981i, cVar.f17981i, 0, 8);
            dVar.e(cVar.f17981i, this.T.K.f17981i, 0, 4);
            dVar.e(cVar.f17981i, this.T.I.f17981i, 0, 0);
            return;
        }
        if (i22 == 1) {
            dVar.e(cVar.f17981i, cVar3.f17981i, 0, 8);
            dVar.e(cVar.f17981i, this.T.I.f17981i, 0, 4);
            dVar.e(cVar.f17981i, this.T.K.f17981i, 0, 0);
        } else if (i22 == 2) {
            dVar.e(cVar4.f17981i, cVar2.f17981i, 0, 8);
            dVar.e(cVar2.f17981i, this.T.L.f17981i, 0, 4);
            dVar.e(cVar2.f17981i, this.T.J.f17981i, 0, 0);
        } else if (i22 == 3) {
            dVar.e(cVar2.f17981i, cVar4.f17981i, 0, 8);
            dVar.e(cVar2.f17981i, this.T.J.f17981i, 0, 4);
            dVar.e(cVar2.f17981i, this.T.L.f17981i, 0, 0);
        }
    }

    @Override // w.d
    public final boolean d() {
        return true;
    }

    @Override // w.d
    public final String toString() {
        String strR = g1.a.r(new StringBuilder("[Barrier] "), this.f17997h0, " {");
        for (int i10 = 0; i10 < this.f18068r0; i10++) {
            d dVar = this.f18067q0[i10];
            if (i10 > 0) {
                strR = g1.a.y(strR, ", ");
            }
            StringBuilder sbS = g1.a.s(strR);
            sbS.append(dVar.f17997h0);
            strR = sbS.toString();
        }
        return g1.a.y(strR, "}");
    }
}
