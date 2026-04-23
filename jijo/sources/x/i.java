package x;

/* JADX INFO: loaded from: classes.dex */
public final class i extends p {
    @Override // x.d
    public final void a(d dVar) {
        f fVar = this.f18272h;
        if (fVar.f18234c && !fVar.f18241j) {
            fVar.d((int) ((((f) fVar.f18243l.get(0)).f18238g * ((w.h) this.f18266b).f18061q0) + 0.5f));
        }
    }

    @Override // x.p
    public final void d() {
        w.d dVar = this.f18266b;
        w.h hVar = (w.h) dVar;
        int i10 = hVar.f18062r0;
        int i11 = hVar.f18063s0;
        int i12 = hVar.f18065u0;
        f fVar = this.f18272h;
        if (i12 == 1) {
            if (i10 != -1) {
                fVar.f18243l.add(dVar.T.f17988d.f18272h);
                this.f18266b.T.f17988d.f18272h.f18242k.add(fVar);
                fVar.f18237f = i10;
            } else if (i11 != -1) {
                fVar.f18243l.add(dVar.T.f17988d.f18273i);
                this.f18266b.T.f17988d.f18273i.f18242k.add(fVar);
                fVar.f18237f = -i11;
            } else {
                fVar.f18233b = true;
                fVar.f18243l.add(dVar.T.f17988d.f18273i);
                this.f18266b.T.f17988d.f18273i.f18242k.add(fVar);
            }
            m(this.f18266b.f17988d.f18272h);
            m(this.f18266b.f17988d.f18273i);
            return;
        }
        if (i10 != -1) {
            fVar.f18243l.add(dVar.T.f17990e.f18272h);
            this.f18266b.T.f17990e.f18272h.f18242k.add(fVar);
            fVar.f18237f = i10;
        } else if (i11 != -1) {
            fVar.f18243l.add(dVar.T.f17990e.f18273i);
            this.f18266b.T.f17990e.f18273i.f18242k.add(fVar);
            fVar.f18237f = -i11;
        } else {
            fVar.f18233b = true;
            fVar.f18243l.add(dVar.T.f17990e.f18273i);
            this.f18266b.T.f17990e.f18273i.f18242k.add(fVar);
        }
        m(this.f18266b.f17990e.f18272h);
        m(this.f18266b.f17990e.f18273i);
    }

    @Override // x.p
    public final void e() {
        w.d dVar = this.f18266b;
        int i10 = ((w.h) dVar).f18065u0;
        f fVar = this.f18272h;
        if (i10 == 1) {
            dVar.Y = fVar.f18238g;
        } else {
            dVar.Z = fVar.f18238g;
        }
    }

    @Override // x.p
    public final void f() {
        this.f18272h.c();
    }

    @Override // x.p
    public final boolean k() {
        return false;
    }

    public final void m(f fVar) {
        f fVar2 = this.f18272h;
        fVar2.f18242k.add(fVar);
        fVar.f18243l.add(fVar2);
    }
}
