package x;

/* JADX INFO: loaded from: classes.dex */
public final class k extends p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f18246k = new int[2];

    public static void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x026b  */
    @Override // x.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(x.d r24) {
        /*
            Method dump skipped, instruction units count: 915
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.k.a(x.d):void");
    }

    @Override // x.p
    public final void d() {
        w.d dVar;
        w.d dVar2;
        int i10;
        w.d dVar3;
        w.d dVar4;
        int i11;
        w.d dVar5 = this.f18266b;
        boolean z9 = dVar5.f17982a;
        g gVar = this.f18269e;
        if (z9) {
            gVar.d(dVar5.r());
        }
        boolean z10 = gVar.f18241j;
        f fVar = this.f18273i;
        f fVar2 = this.f18272h;
        if (!z10) {
            w.d dVar6 = this.f18266b;
            int i12 = dVar6.f18013p0[0];
            this.f18268d = i12;
            if (i12 != 3) {
                if (i12 == 4 && (dVar4 = dVar6.T) != null && ((i11 = dVar4.f18013p0[0]) == 1 || i11 == 4)) {
                    int iR = (dVar4.r() - this.f18266b.I.e()) - this.f18266b.K.e();
                    p.b(fVar2, dVar4.f17988d.f18272h, this.f18266b.I.e());
                    p.b(fVar, dVar4.f17988d.f18273i, -this.f18266b.K.e());
                    gVar.d(iR);
                    return;
                }
                if (i12 == 1) {
                    gVar.d(dVar6.r());
                }
            }
        } else if (this.f18268d == 4 && (dVar2 = (dVar = this.f18266b).T) != null && ((i10 = dVar2.f18013p0[0]) == 1 || i10 == 4)) {
            p.b(fVar2, dVar2.f17988d.f18272h, dVar.I.e());
            p.b(fVar, dVar2.f17988d.f18273i, -this.f18266b.K.e());
            return;
        }
        if (gVar.f18241j) {
            w.d dVar7 = this.f18266b;
            if (dVar7.f17982a) {
                w.c[] cVarArr = dVar7.Q;
                w.c cVar = cVarArr[0];
                w.c cVar2 = cVar.f17978f;
                if (cVar2 != null && cVarArr[1].f17978f != null) {
                    if (dVar7.y()) {
                        fVar2.f18237f = this.f18266b.Q[0].e();
                        fVar.f18237f = -this.f18266b.Q[1].e();
                        return;
                    }
                    f fVarH = p.h(this.f18266b.Q[0]);
                    if (fVarH != null) {
                        p.b(fVar2, fVarH, this.f18266b.Q[0].e());
                    }
                    f fVarH2 = p.h(this.f18266b.Q[1]);
                    if (fVarH2 != null) {
                        p.b(fVar, fVarH2, -this.f18266b.Q[1].e());
                    }
                    fVar2.f18233b = true;
                    fVar.f18233b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = p.h(cVar);
                    if (fVarH3 != null) {
                        p.b(fVar2, fVarH3, this.f18266b.Q[0].e());
                        p.b(fVar, fVar2, gVar.f18238g);
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[1];
                if (cVar3.f17978f != null) {
                    f fVarH4 = p.h(cVar3);
                    if (fVarH4 != null) {
                        p.b(fVar, fVarH4, -this.f18266b.Q[1].e());
                        p.b(fVar2, fVar, -gVar.f18238g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.T == null || dVar7.j(7).f17978f != null) {
                    return;
                }
                w.d dVar8 = this.f18266b;
                p.b(fVar2, dVar8.T.f17988d.f18272h, dVar8.s());
                p.b(fVar, fVar2, gVar.f18238g);
                return;
            }
        }
        if (this.f18268d == 3) {
            w.d dVar9 = this.f18266b;
            int i13 = dVar9.f18015r;
            if (i13 == 2) {
                w.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.f17990e.f18269e;
                    gVar.f18243l.add(gVar2);
                    gVar2.f18242k.add(gVar);
                    gVar.f18233b = true;
                    gVar.f18242k.add(fVar2);
                    gVar.f18242k.add(fVar);
                }
            } else if (i13 == 3) {
                if (dVar9.f18016s == 3) {
                    fVar2.f18232a = this;
                    fVar.f18232a = this;
                    m mVar = dVar9.f17990e;
                    mVar.f18272h.f18232a = this;
                    mVar.f18273i.f18232a = this;
                    gVar.f18232a = this;
                    if (dVar9.z()) {
                        gVar.f18243l.add(this.f18266b.f17990e.f18269e);
                        this.f18266b.f17990e.f18269e.f18242k.add(gVar);
                        m mVar2 = this.f18266b.f17990e;
                        mVar2.f18269e.f18232a = this;
                        gVar.f18243l.add(mVar2.f18272h);
                        gVar.f18243l.add(this.f18266b.f17990e.f18273i);
                        this.f18266b.f17990e.f18272h.f18242k.add(gVar);
                        this.f18266b.f17990e.f18273i.f18242k.add(gVar);
                    } else if (this.f18266b.y()) {
                        this.f18266b.f17990e.f18269e.f18243l.add(gVar);
                        gVar.f18242k.add(this.f18266b.f17990e.f18269e);
                    } else {
                        this.f18266b.f17990e.f18269e.f18243l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.f17990e.f18269e;
                    gVar.f18243l.add(gVar3);
                    gVar3.f18242k.add(gVar);
                    this.f18266b.f17990e.f18272h.f18242k.add(gVar);
                    this.f18266b.f17990e.f18273i.f18242k.add(gVar);
                    gVar.f18233b = true;
                    gVar.f18242k.add(fVar2);
                    gVar.f18242k.add(fVar);
                    fVar2.f18243l.add(gVar);
                    fVar.f18243l.add(gVar);
                }
            }
        }
        w.d dVar11 = this.f18266b;
        w.c[] cVarArr2 = dVar11.Q;
        w.c cVar4 = cVarArr2[0];
        w.c cVar5 = cVar4.f17978f;
        if (cVar5 != null && cVarArr2[1].f17978f != null) {
            if (dVar11.y()) {
                fVar2.f18237f = this.f18266b.Q[0].e();
                fVar.f18237f = -this.f18266b.Q[1].e();
                return;
            }
            f fVarH5 = p.h(this.f18266b.Q[0]);
            f fVarH6 = p.h(this.f18266b.Q[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f18274j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = p.h(cVar4);
            if (fVarH7 != null) {
                p.b(fVar2, fVarH7, this.f18266b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        w.c cVar6 = cVarArr2[1];
        if (cVar6.f17978f != null) {
            f fVarH8 = p.h(cVar6);
            if (fVarH8 != null) {
                p.b(fVar, fVarH8, -this.f18266b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof w.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        p.b(fVar2, dVar3.f17988d.f18272h, dVar11.s());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // x.p
    public final void e() {
        f fVar = this.f18272h;
        if (fVar.f18241j) {
            this.f18266b.Y = fVar.f18238g;
        }
    }

    @Override // x.p
    public final void f() {
        this.f18267c = null;
        this.f18272h.c();
        this.f18273i.c();
        this.f18269e.c();
        this.f18271g = false;
    }

    @Override // x.p
    public final boolean k() {
        return this.f18268d != 3 || this.f18266b.f18015r == 0;
    }

    public final void n() {
        this.f18271g = false;
        f fVar = this.f18272h;
        fVar.c();
        fVar.f18241j = false;
        f fVar2 = this.f18273i;
        fVar2.c();
        fVar2.f18241j = false;
        this.f18269e.f18241j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f18266b.f17997h0;
    }
}
