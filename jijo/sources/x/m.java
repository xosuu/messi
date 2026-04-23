package x;

/* JADX INFO: loaded from: classes.dex */
public final class m extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f18249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f18250l;

    @Override // x.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i10;
        if (u.h.b(this.f18274j) == 3) {
            w.d dVar2 = this.f18266b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.f18269e;
        if (gVar.f18234c && !gVar.f18241j && this.f18268d == 3) {
            w.d dVar3 = this.f18266b;
            int i11 = dVar3.f18016s;
            if (i11 == 2) {
                w.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    if (dVar4.f17990e.f18269e.f18241j) {
                        gVar.d((int) ((r5.f18238g * dVar3.f18023z) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                g gVar2 = dVar3.f17988d.f18269e;
                if (gVar2.f18241j) {
                    int i12 = dVar3.X;
                    if (i12 == -1) {
                        f10 = gVar2.f18238g;
                        f11 = dVar3.W;
                    } else if (i12 == 0) {
                        f12 = gVar2.f18238g * dVar3.W;
                        i10 = (int) (f12 + 0.5f);
                        gVar.d(i10);
                    } else if (i12 != 1) {
                        i10 = 0;
                        gVar.d(i10);
                    } else {
                        f10 = gVar2.f18238g;
                        f11 = dVar3.W;
                    }
                    f12 = f10 / f11;
                    i10 = (int) (f12 + 0.5f);
                    gVar.d(i10);
                }
            }
        }
        f fVar = this.f18272h;
        if (fVar.f18234c) {
            f fVar2 = this.f18273i;
            if (fVar2.f18234c) {
                if (fVar.f18241j && fVar2.f18241j && gVar.f18241j) {
                    return;
                }
                if (!gVar.f18241j && this.f18268d == 3) {
                    w.d dVar5 = this.f18266b;
                    if (dVar5.f18015r == 0 && !dVar5.z()) {
                        f fVar3 = (f) fVar.f18243l.get(0);
                        f fVar4 = (f) fVar2.f18243l.get(0);
                        int i13 = fVar3.f18238g + fVar.f18237f;
                        int i14 = fVar4.f18238g + fVar2.f18237f;
                        fVar.d(i13);
                        fVar2.d(i14);
                        gVar.d(i14 - i13);
                        return;
                    }
                }
                if (!gVar.f18241j && this.f18268d == 3 && this.f18265a == 1 && fVar.f18243l.size() > 0 && fVar2.f18243l.size() > 0) {
                    f fVar5 = (f) fVar.f18243l.get(0);
                    int i15 = (((f) fVar2.f18243l.get(0)).f18238g + fVar2.f18237f) - (fVar5.f18238g + fVar.f18237f);
                    int i16 = gVar.f18244m;
                    if (i15 < i16) {
                        gVar.d(i15);
                    } else {
                        gVar.d(i16);
                    }
                }
                if (gVar.f18241j && fVar.f18243l.size() > 0 && fVar2.f18243l.size() > 0) {
                    f fVar6 = (f) fVar.f18243l.get(0);
                    f fVar7 = (f) fVar2.f18243l.get(0);
                    int i17 = fVar6.f18238g;
                    int i18 = fVar.f18237f + i17;
                    int i19 = fVar7.f18238g;
                    int i20 = fVar2.f18237f + i19;
                    float f13 = this.f18266b.f17991e0;
                    if (fVar6 == fVar7) {
                        f13 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    fVar.d((int) ((((i19 - i17) - gVar.f18238g) * f13) + i17 + 0.5f));
                    fVar2.d(fVar.f18238g + gVar.f18238g);
                }
            }
        }
    }

    @Override // x.p
    public final void d() {
        w.d dVar;
        w.d dVar2;
        w.d dVar3;
        w.d dVar4;
        w.d dVar5 = this.f18266b;
        boolean z9 = dVar5.f17982a;
        g gVar = this.f18269e;
        if (z9) {
            gVar.d(dVar5.l());
        }
        boolean z10 = gVar.f18241j;
        f fVar = this.f18273i;
        f fVar2 = this.f18272h;
        if (!z10) {
            w.d dVar6 = this.f18266b;
            this.f18268d = dVar6.f18013p0[1];
            if (dVar6.E) {
                this.f18250l = new a(this);
            }
            int i10 = this.f18268d;
            if (i10 != 3) {
                if (i10 == 4 && (dVar4 = this.f18266b.T) != null && dVar4.f18013p0[1] == 1) {
                    int iL = (dVar4.l() - this.f18266b.J.e()) - this.f18266b.L.e();
                    p.b(fVar2, dVar4.f17990e.f18272h, this.f18266b.J.e());
                    p.b(fVar, dVar4.f17990e.f18273i, -this.f18266b.L.e());
                    gVar.d(iL);
                    return;
                }
                if (i10 == 1) {
                    gVar.d(this.f18266b.l());
                }
            }
        } else if (this.f18268d == 4 && (dVar2 = (dVar = this.f18266b).T) != null && dVar2.f18013p0[1] == 1) {
            p.b(fVar2, dVar2.f17990e.f18272h, dVar.J.e());
            p.b(fVar, dVar2.f17990e.f18273i, -this.f18266b.L.e());
            return;
        }
        boolean z11 = gVar.f18241j;
        f fVar3 = this.f18249k;
        if (z11) {
            w.d dVar7 = this.f18266b;
            if (dVar7.f17982a) {
                w.c[] cVarArr = dVar7.Q;
                w.c cVar = cVarArr[2];
                w.c cVar2 = cVar.f17978f;
                if (cVar2 != null && cVarArr[3].f17978f != null) {
                    if (dVar7.z()) {
                        fVar2.f18237f = this.f18266b.Q[2].e();
                        fVar.f18237f = -this.f18266b.Q[3].e();
                    } else {
                        f fVarH = p.h(this.f18266b.Q[2]);
                        if (fVarH != null) {
                            p.b(fVar2, fVarH, this.f18266b.Q[2].e());
                        }
                        f fVarH2 = p.h(this.f18266b.Q[3]);
                        if (fVarH2 != null) {
                            p.b(fVar, fVarH2, -this.f18266b.Q[3].e());
                        }
                        fVar2.f18233b = true;
                        fVar.f18233b = true;
                    }
                    w.d dVar8 = this.f18266b;
                    if (dVar8.E) {
                        p.b(fVar3, fVar2, dVar8.f17983a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = p.h(cVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f18266b.Q[2].e());
                        p.b(fVar, fVar2, gVar.f18238g);
                        w.d dVar9 = this.f18266b;
                        if (dVar9.E) {
                            p.b(fVar3, fVar2, dVar9.f17983a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[3];
                if (cVar3.f17978f != null) {
                    f fVarH4 = p.h(cVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f18266b.Q[3].e());
                        p.b(fVar2, fVar, -gVar.f18238g);
                    }
                    w.d dVar10 = this.f18266b;
                    if (dVar10.E) {
                        p.b(fVar3, fVar2, dVar10.f17983a0);
                        return;
                    }
                    return;
                }
                w.c cVar4 = cVarArr[4];
                if (cVar4.f17978f != null) {
                    f fVarH5 = p.h(cVar4);
                    if (fVarH5 != null) {
                        p.b(fVar3, fVarH5, 0);
                        p.b(fVar2, fVar3, -this.f18266b.f17983a0);
                        p.b(fVar, fVar2, gVar.f18238g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.T == null || dVar7.j(7).f17978f != null) {
                    return;
                }
                w.d dVar11 = this.f18266b;
                p.b(fVar2, dVar11.T.f17990e.f18272h, dVar11.t());
                p.b(fVar, fVar2, gVar.f18238g);
                w.d dVar12 = this.f18266b;
                if (dVar12.E) {
                    p.b(fVar3, fVar2, dVar12.f17983a0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f18268d != 3) {
            gVar.b(this);
        } else {
            w.d dVar13 = this.f18266b;
            int i11 = dVar13.f18016s;
            if (i11 == 2) {
                w.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.f17990e.f18269e;
                    gVar.f18243l.add(gVar2);
                    gVar2.f18242k.add(gVar);
                    gVar.f18233b = true;
                    gVar.f18242k.add(fVar2);
                    gVar.f18242k.add(fVar);
                }
            } else if (i11 == 3 && !dVar13.z()) {
                w.d dVar15 = this.f18266b;
                if (dVar15.f18015r != 3) {
                    g gVar3 = dVar15.f17988d.f18269e;
                    gVar.f18243l.add(gVar3);
                    gVar3.f18242k.add(gVar);
                    gVar.f18233b = true;
                    gVar.f18242k.add(fVar2);
                    gVar.f18242k.add(fVar);
                }
            }
        }
        w.d dVar16 = this.f18266b;
        w.c[] cVarArr2 = dVar16.Q;
        w.c cVar5 = cVarArr2[2];
        w.c cVar6 = cVar5.f17978f;
        if (cVar6 != null && cVarArr2[3].f17978f != null) {
            if (dVar16.z()) {
                fVar2.f18237f = this.f18266b.Q[2].e();
                fVar.f18237f = -this.f18266b.Q[3].e();
            } else {
                f fVarH6 = p.h(this.f18266b.Q[2]);
                f fVarH7 = p.h(this.f18266b.Q[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f18274j = 4;
            }
            if (this.f18266b.E) {
                c(fVar3, fVar2, 1, this.f18250l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = p.h(cVar5);
            if (fVarH8 != null) {
                p.b(fVar2, fVarH8, this.f18266b.Q[2].e());
                c(fVar, fVar2, 1, gVar);
                if (this.f18266b.E) {
                    c(fVar3, fVar2, 1, this.f18250l);
                }
                if (this.f18268d == 3) {
                    w.d dVar17 = this.f18266b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.f17988d;
                        if (kVar.f18268d == 3) {
                            kVar.f18269e.f18242k.add(gVar);
                            gVar.f18243l.add(this.f18266b.f17988d.f18269e);
                            gVar.f18232a = this;
                        }
                    }
                }
            }
        } else {
            w.c cVar7 = cVarArr2[3];
            if (cVar7.f17978f != null) {
                f fVarH9 = p.h(cVar7);
                if (fVarH9 != null) {
                    p.b(fVar, fVarH9, -this.f18266b.Q[3].e());
                    c(fVar2, fVar, -1, gVar);
                    if (this.f18266b.E) {
                        c(fVar3, fVar2, 1, this.f18250l);
                    }
                }
            } else {
                w.c cVar8 = cVarArr2[4];
                if (cVar8.f17978f != null) {
                    f fVarH10 = p.h(cVar8);
                    if (fVarH10 != null) {
                        p.b(fVar3, fVarH10, 0);
                        c(fVar2, fVar3, -1, this.f18250l);
                        c(fVar, fVar2, 1, gVar);
                    }
                } else if (!(dVar16 instanceof w.i) && (dVar3 = dVar16.T) != null) {
                    p.b(fVar2, dVar3.f17990e.f18272h, dVar16.t());
                    c(fVar, fVar2, 1, gVar);
                    if (this.f18266b.E) {
                        c(fVar3, fVar2, 1, this.f18250l);
                    }
                    if (this.f18268d == 3) {
                        w.d dVar18 = this.f18266b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.f17988d;
                            if (kVar2.f18268d == 3) {
                                kVar2.f18269e.f18242k.add(gVar);
                                gVar.f18243l.add(this.f18266b.f17988d.f18269e);
                                gVar.f18232a = this;
                            }
                        }
                    }
                }
            }
        }
        if (gVar.f18243l.size() == 0) {
            gVar.f18234c = true;
        }
    }

    @Override // x.p
    public final void e() {
        f fVar = this.f18272h;
        if (fVar.f18241j) {
            this.f18266b.Z = fVar.f18238g;
        }
    }

    @Override // x.p
    public final void f() {
        this.f18267c = null;
        this.f18272h.c();
        this.f18273i.c();
        this.f18249k.c();
        this.f18269e.c();
        this.f18271g = false;
    }

    @Override // x.p
    public final boolean k() {
        return this.f18268d != 3 || this.f18266b.f18016s == 0;
    }

    public final void m() {
        this.f18271g = false;
        f fVar = this.f18272h;
        fVar.c();
        fVar.f18241j = false;
        f fVar2 = this.f18273i;
        fVar2.c();
        fVar2.f18241j = false;
        f fVar3 = this.f18249k;
        fVar3.c();
        fVar3.f18241j = false;
        this.f18269e.f18241j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f18266b.f17997h0;
    }
}
