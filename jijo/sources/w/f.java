package w;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18033a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f18036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f18037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f18038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f18039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18041i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18042j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18043k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f18049q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f18050r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f18034b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18035c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18044l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18045m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f18046n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f18047o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f18048p = 0;

    public f(g gVar, int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11) {
        this.f18050r = gVar;
        this.f18040h = 0;
        this.f18041i = 0;
        this.f18042j = 0;
        this.f18043k = 0;
        this.f18049q = 0;
        this.f18033a = i10;
        this.f18036d = cVar;
        this.f18037e = cVar2;
        this.f18038f = cVar3;
        this.f18039g = cVar4;
        this.f18040h = gVar.f18057w0;
        this.f18041i = gVar.f18053s0;
        this.f18042j = gVar.f18058x0;
        this.f18043k = gVar.f18054t0;
        this.f18049q = i11;
    }

    public final void a(d dVar) {
        int i10 = this.f18033a;
        g gVar = this.f18050r;
        if (i10 == 0) {
            int iU = gVar.U(this.f18049q, dVar);
            if (dVar.f18013p0[0] == 3) {
                this.f18048p++;
                iU = 0;
            }
            this.f18044l = iU + (dVar.f17995g0 != 8 ? gVar.P0 : 0) + this.f18044l;
            int iT = gVar.T(this.f18049q, dVar);
            if (this.f18034b == null || this.f18035c < iT) {
                this.f18034b = dVar;
                this.f18035c = iT;
                this.f18045m = iT;
            }
        } else {
            int iU2 = gVar.U(this.f18049q, dVar);
            int iT2 = gVar.T(this.f18049q, dVar);
            if (dVar.f18013p0[1] == 3) {
                this.f18048p++;
                iT2 = 0;
            }
            this.f18045m = iT2 + (dVar.f17995g0 != 8 ? gVar.Q0 : 0) + this.f18045m;
            if (this.f18034b == null || this.f18035c < iU2) {
                this.f18034b = dVar;
                this.f18035c = iU2;
                this.f18044l = iU2;
            }
        }
        this.f18047o++;
    }

    public final void b(int i10, boolean z9, boolean z10) {
        g gVar;
        int i11;
        int i12;
        int i13;
        d dVar;
        int i14;
        int i15;
        float f10;
        float f11;
        int i16;
        float f12;
        int i17;
        int i18 = this.f18047o;
        int i19 = 0;
        while (true) {
            gVar = this.f18050r;
            if (i19 >= i18 || (i17 = this.f18046n + i19) >= gVar.f18052b1) {
                break;
            }
            d dVar2 = gVar.f18051a1[i17];
            if (dVar2 != null) {
                dVar2.E();
            }
            i19++;
        }
        if (i18 == 0 || this.f18034b == null) {
            return;
        }
        boolean z11 = z10 && i10 == 0;
        int i20 = -1;
        int i21 = -1;
        for (int i22 = 0; i22 < i18; i22++) {
            int i23 = this.f18046n + (z9 ? (i18 - 1) - i22 : i22);
            if (i23 >= gVar.f18052b1) {
                break;
            }
            d dVar3 = gVar.f18051a1[i23];
            if (dVar3 != null && dVar3.f17995g0 == 0) {
                if (i20 == -1) {
                    i20 = i22;
                }
                i21 = i22;
            }
        }
        if (this.f18033a != 0) {
            d dVar4 = this.f18034b;
            dVar4.f17999i0 = gVar.D0;
            int i24 = this.f18040h;
            if (i10 > 0) {
                i24 += gVar.P0;
            }
            c cVar = dVar4.I;
            c cVar2 = dVar4.K;
            if (z9) {
                cVar2.a(this.f18038f, i24);
                if (z10) {
                    cVar.a(this.f18036d, this.f18042j);
                }
                if (i10 > 0) {
                    this.f18038f.f17976d.I.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f18036d, i24);
                if (z10) {
                    cVar2.a(this.f18038f, this.f18042j);
                }
                if (i10 > 0) {
                    this.f18036d.f17976d.K.a(cVar, 0);
                }
            }
            d dVar5 = null;
            for (int i25 = 0; i25 < i18; i25++) {
                int i26 = this.f18046n + i25;
                if (i26 >= gVar.f18052b1) {
                    return;
                }
                d dVar6 = gVar.f18051a1[i26];
                if (dVar6 != null) {
                    c cVar3 = dVar6.J;
                    if (i25 == 0) {
                        dVar6.g(cVar3, this.f18037e, this.f18041i);
                        int i27 = gVar.E0;
                        float f13 = gVar.K0;
                        if (this.f18046n == 0) {
                            i13 = gVar.G0;
                            i11 = i27;
                            i12 = -1;
                            if (i13 != -1) {
                                f13 = gVar.M0;
                            }
                            dVar6.f18001j0 = i13;
                            dVar6.f17991e0 = f13;
                        } else {
                            i11 = i27;
                            i12 = -1;
                        }
                        if (!z10 || (i13 = gVar.I0) == i12) {
                            i13 = i11;
                        } else {
                            f13 = gVar.O0;
                        }
                        dVar6.f18001j0 = i13;
                        dVar6.f17991e0 = f13;
                    }
                    if (i25 == i18 - 1) {
                        dVar6.g(dVar6.L, this.f18039g, this.f18043k);
                    }
                    if (dVar5 != null) {
                        int i28 = gVar.Q0;
                        c cVar4 = dVar5.L;
                        cVar3.a(cVar4, i28);
                        if (i25 == i20) {
                            int i29 = this.f18041i;
                            if (cVar3.h()) {
                                cVar3.f17980h = i29;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i25 == i21 + 1) {
                            int i30 = this.f18043k;
                            if (cVar4.h()) {
                                cVar4.f17980h = i30;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        c cVar5 = dVar6.K;
                        c cVar6 = dVar6.I;
                        if (z9) {
                            int i31 = gVar.R0;
                            if (i31 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i31 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i31 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                            dVar5 = dVar6;
                        } else {
                            int i32 = gVar.R0;
                            if (i32 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i32 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i32 == 2) {
                                if (z11) {
                                    cVar6.a(this.f18036d, this.f18040h);
                                    cVar5.a(this.f18038f, this.f18042j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                            dVar5 = dVar6;
                        }
                    } else {
                        dVar5 = dVar6;
                    }
                }
            }
            return;
        }
        d dVar7 = this.f18034b;
        dVar7.f18001j0 = gVar.E0;
        int i33 = this.f18041i;
        if (i10 > 0) {
            i33 += gVar.Q0;
        }
        c cVar7 = this.f18037e;
        c cVar8 = dVar7.J;
        cVar8.a(cVar7, i33);
        c cVar9 = dVar7.L;
        if (z10) {
            cVar9.a(this.f18039g, this.f18043k);
        }
        if (i10 > 0) {
            this.f18037e.f17976d.L.a(cVar8, 0);
        }
        if (gVar.S0 != 3 || dVar7.E) {
            dVar = dVar7;
        } else {
            for (int i34 = 0; i34 < i18; i34++) {
                int i35 = this.f18046n + (z9 ? (i18 - 1) - i34 : i34);
                if (i35 >= gVar.f18052b1) {
                    break;
                }
                dVar = gVar.f18051a1[i35];
                if (dVar.E) {
                    break;
                }
            }
            dVar = dVar7;
        }
        d dVar8 = null;
        int i36 = 0;
        while (i36 < i18) {
            int i37 = z9 ? (i18 - 1) - i36 : i36;
            int i38 = this.f18046n + i37;
            if (i38 >= gVar.f18052b1) {
                return;
            }
            d dVar9 = gVar.f18051a1[i38];
            if (dVar9 == null) {
                i14 = i18;
            } else {
                c cVar10 = dVar9.I;
                if (i36 == 0) {
                    dVar9.g(cVar10, this.f18036d, this.f18040h);
                }
                if (i37 == 0) {
                    int i39 = gVar.D0;
                    if (z9) {
                        i15 = i39;
                        f10 = 1.0f - gVar.J0;
                    } else {
                        i15 = i39;
                        f10 = gVar.J0;
                    }
                    if (this.f18046n == 0) {
                        int i40 = gVar.F0;
                        f11 = f10;
                        if (i40 != -1) {
                            f12 = z9 ? 1.0f - gVar.L0 : gVar.L0;
                            i16 = i40;
                        }
                        dVar9.f17999i0 = i16;
                        dVar9.f17989d0 = f12;
                    } else {
                        f11 = f10;
                    }
                    if (!z10 || (i16 = gVar.H0) == -1) {
                        i16 = i15;
                        f12 = f11;
                    } else {
                        f12 = z9 ? 1.0f - gVar.N0 : gVar.N0;
                    }
                    dVar9.f17999i0 = i16;
                    dVar9.f17989d0 = f12;
                }
                if (i36 == i18 - 1) {
                    i14 = i18;
                    dVar9.g(dVar9.K, this.f18038f, this.f18042j);
                } else {
                    i14 = i18;
                }
                if (dVar8 != null) {
                    int i41 = gVar.P0;
                    c cVar11 = dVar8.K;
                    cVar10.a(cVar11, i41);
                    if (i36 == i20) {
                        int i42 = this.f18040h;
                        if (cVar10.h()) {
                            cVar10.f17980h = i42;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i36 == i21 + 1) {
                        int i43 = this.f18042j;
                        if (cVar11.h()) {
                            cVar11.f17980h = i43;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    int i44 = gVar.S0;
                    if (i44 == 3 && dVar.E && dVar9 != dVar && dVar9.E) {
                        dVar9.M.a(dVar.M, 0);
                    } else {
                        c cVar12 = dVar9.J;
                        if (i44 != 0) {
                            c cVar13 = dVar9.L;
                            if (i44 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z11) {
                                cVar12.a(this.f18037e, this.f18041i);
                                cVar13.a(this.f18039g, this.f18043k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                }
                dVar8 = dVar9;
            }
            i36++;
            i18 = i14;
        }
    }

    public final int c() {
        return this.f18033a == 1 ? this.f18045m - this.f18050r.Q0 : this.f18045m;
    }

    public final int d() {
        return this.f18033a == 0 ? this.f18044l - this.f18050r.P0 : this.f18044l;
    }

    public final void e(int i10) {
        g gVar;
        int i11;
        int i12 = this.f18048p;
        if (i12 == 0) {
            return;
        }
        int i13 = this.f18047o;
        int i14 = i10 / i12;
        int i15 = 0;
        while (true) {
            gVar = this.f18050r;
            if (i15 >= i13 || (i11 = this.f18046n + i15) >= gVar.f18052b1) {
                break;
            }
            d dVar = gVar.f18051a1[i11];
            if (this.f18033a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f18013p0;
                    if (iArr[0] == 3 && dVar.f18015r == 0) {
                        gVar.W(dVar, 1, i14, iArr[1], dVar.l());
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f18013p0;
                if (iArr2[1] == 3 && dVar.f18016s == 0) {
                    gVar.W(dVar, iArr2[0], dVar.r(), 1, i14);
                }
            }
            i15++;
        }
        this.f18044l = 0;
        this.f18045m = 0;
        this.f18034b = null;
        this.f18035c = 0;
        int i16 = this.f18047o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f18046n + i17;
            if (i18 >= gVar.f18052b1) {
                return;
            }
            d dVar2 = gVar.f18051a1[i18];
            if (this.f18033a == 0) {
                int iR = dVar2.r();
                int i19 = gVar.P0;
                if (dVar2.f17995g0 == 8) {
                    i19 = 0;
                }
                this.f18044l = iR + i19 + this.f18044l;
                int iT = gVar.T(this.f18049q, dVar2);
                if (this.f18034b == null || this.f18035c < iT) {
                    this.f18034b = dVar2;
                    this.f18035c = iT;
                    this.f18045m = iT;
                }
            } else {
                int iU = gVar.U(this.f18049q, dVar2);
                int iT2 = gVar.T(this.f18049q, dVar2);
                int i20 = gVar.Q0;
                if (dVar2.f17995g0 == 8) {
                    i20 = 0;
                }
                this.f18045m = iT2 + i20 + this.f18045m;
                if (this.f18034b == null || this.f18035c < iU) {
                    this.f18034b = dVar2;
                    this.f18035c = iU;
                    this.f18044l = iU;
                }
            }
        }
    }

    public final void f(int i10, c cVar, c cVar2, c cVar3, c cVar4, int i11, int i12, int i13, int i14, int i15) {
        this.f18033a = i10;
        this.f18036d = cVar;
        this.f18037e = cVar2;
        this.f18038f = cVar3;
        this.f18039g = cVar4;
        this.f18040h = i11;
        this.f18041i = i12;
        this.f18042j = i13;
        this.f18043k = i14;
        this.f18049q = i15;
    }
}
