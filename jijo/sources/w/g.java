package w;

import java.util.ArrayList;
import x.n;

/* JADX INFO: loaded from: classes.dex */
public final class g extends j {
    public int A0;
    public x.b B0;
    public n C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public d[] X0;
    public d[] Y0;
    public int[] Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public d[] f18051a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public int f18052b1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f18053s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f18054t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f18055u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f18056v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f18057w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f18058x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f18059y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f18060z0;

    public final int T(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f18013p0;
        if (iArr[1] == 3) {
            int i11 = dVar.f18016s;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f18023z * i10);
                if (i12 != dVar.l()) {
                    dVar.f17994g = true;
                    W(dVar, iArr[0], dVar.r(), 1, i12);
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.l();
            }
            if (i11 == 3) {
                return (int) ((dVar.r() * dVar.W) + 0.5f);
            }
        }
        return dVar.l();
    }

    public final int U(int i10, d dVar) {
        if (dVar == null) {
            return 0;
        }
        int[] iArr = dVar.f18013p0;
        if (iArr[0] == 3) {
            int i11 = dVar.f18015r;
            if (i11 == 0) {
                return 0;
            }
            if (i11 == 2) {
                int i12 = (int) (dVar.f18020w * i10);
                if (i12 != dVar.r()) {
                    dVar.f17994g = true;
                    W(dVar, 1, i12, iArr[1], dVar.l());
                }
                return i12;
            }
            if (i11 == 1) {
                return dVar.r();
            }
            if (i11 == 3) {
                return (int) ((dVar.l() * dVar.W) + 0.5f);
            }
        }
        return dVar.r();
    }

    /* JADX WARN: Removed duplicated region for block: B:282:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(int r40, int r41, int r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w.g.V(int, int, int, int):void");
    }

    public final void W(d dVar, int i10, int i11, int i12, int i13) {
        n nVar;
        d dVar2;
        while (true) {
            nVar = this.C0;
            if (nVar != null || (dVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((e) dVar2).f18027u0;
            }
        }
        x.b bVar = this.B0;
        bVar.f18211a = i10;
        bVar.f18212b = i12;
        bVar.f18213c = i11;
        bVar.f18214d = i13;
        nVar.b(dVar, bVar);
        dVar.P(this.B0.f18215e);
        dVar.M(this.B0.f18216f);
        x.b bVar2 = this.B0;
        dVar.E = bVar2.f18218h;
        dVar.J(bVar2.f18217g);
    }

    @Override // w.j, w.i
    public final void a() {
        for (int i10 = 0; i10 < this.f18068r0; i10++) {
            d dVar = this.f18067q0[i10];
            if (dVar != null) {
                dVar.F = true;
            }
        }
    }

    @Override // w.d
    public final void c(u.d dVar, boolean z9) {
        d dVar2;
        float f10;
        int i10;
        super.c(dVar, z9);
        d dVar3 = this.T;
        boolean z10 = dVar3 != null && ((e) dVar3).f18028v0;
        int i11 = this.T0;
        ArrayList arrayList = this.W0;
        if (i11 != 0) {
            if (i11 == 1) {
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    ((f) arrayList.get(i12)).b(i12, z10, i12 == size + (-1));
                    i12++;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    int size2 = arrayList.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        ((f) arrayList.get(i13)).b(i13, z10, i13 == size2 + (-1));
                        i13++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i14 = 0; i14 < this.f18052b1; i14++) {
                    this.f18051a1[i14].E();
                }
                int[] iArr = this.Z0;
                int i15 = iArr[0];
                int i16 = iArr[1];
                float f11 = this.J0;
                d dVar4 = null;
                int i17 = 0;
                while (i17 < i15) {
                    if (z10) {
                        i10 = (i15 - i17) - 1;
                        f10 = 1.0f - this.J0;
                    } else {
                        f10 = f11;
                        i10 = i17;
                    }
                    d dVar5 = this.Y0[i10];
                    if (dVar5 != null && dVar5.f17995g0 != 8) {
                        c cVar = dVar5.I;
                        if (i17 == 0) {
                            dVar5.g(cVar, this.I, this.f18057w0);
                            dVar5.f17999i0 = this.D0;
                            dVar5.f17989d0 = f10;
                        }
                        if (i17 == i15 - 1) {
                            dVar5.g(dVar5.K, this.K, this.f18058x0);
                        }
                        if (i17 > 0 && dVar4 != null) {
                            int i18 = this.P0;
                            c cVar2 = dVar4.K;
                            dVar5.g(cVar, cVar2, i18);
                            dVar4.g(cVar2, cVar, 0);
                        }
                        dVar4 = dVar5;
                    }
                    i17++;
                    f11 = f10;
                }
                for (int i19 = 0; i19 < i16; i19++) {
                    d dVar6 = this.X0[i19];
                    if (dVar6 != null && dVar6.f17995g0 != 8) {
                        c cVar3 = dVar6.J;
                        if (i19 == 0) {
                            dVar6.g(cVar3, this.J, this.f18053s0);
                            dVar6.f18001j0 = this.E0;
                            dVar6.f17991e0 = this.K0;
                        }
                        if (i19 == i16 - 1) {
                            dVar6.g(dVar6.L, this.L, this.f18054t0);
                        }
                        if (i19 > 0 && dVar4 != null) {
                            int i20 = this.Q0;
                            c cVar4 = dVar4.L;
                            dVar6.g(cVar3, cVar4, i20);
                            dVar4.g(cVar4, cVar3, 0);
                        }
                        dVar4 = dVar6;
                    }
                }
                for (int i21 = 0; i21 < i15; i21++) {
                    for (int i22 = 0; i22 < i16; i22++) {
                        int i23 = (i22 * i15) + i21;
                        if (this.V0 == 1) {
                            i23 = (i21 * i16) + i22;
                        }
                        d[] dVarArr = this.f18051a1;
                        if (i23 < dVarArr.length && (dVar2 = dVarArr[i23]) != null && dVar2.f17995g0 != 8) {
                            d dVar7 = this.Y0[i21];
                            d dVar8 = this.X0[i22];
                            if (dVar2 != dVar7) {
                                dVar2.g(dVar2.I, dVar7.I, 0);
                                dVar2.g(dVar2.K, dVar7.K, 0);
                            }
                            if (dVar2 != dVar8) {
                                dVar2.g(dVar2.J, dVar8.J, 0);
                                dVar2.g(dVar2.L, dVar8.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((f) arrayList.get(0)).b(0, z10, true);
        }
        this.f18059y0 = false;
    }
}
