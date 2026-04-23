package x;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends p {
    @Override // x.d
    public final void a(d dVar) {
        w.a aVar = (w.a) this.f18266b;
        int i10 = aVar.f17952s0;
        f fVar = this.f18272h;
        Iterator it = fVar.f18243l.iterator();
        int i11 = 0;
        int i12 = -1;
        while (it.hasNext()) {
            int i13 = ((f) it.next()).f18238g;
            if (i12 == -1 || i13 < i12) {
                i12 = i13;
            }
            if (i11 < i13) {
                i11 = i13;
            }
        }
        if (i10 == 0 || i10 == 2) {
            fVar.d(i12 + aVar.f17954u0);
        } else {
            fVar.d(i11 + aVar.f17954u0);
        }
    }

    @Override // x.p
    public final void d() {
        w.d dVar = this.f18266b;
        if (dVar instanceof w.a) {
            f fVar = this.f18272h;
            fVar.f18233b = true;
            w.a aVar = (w.a) dVar;
            int i10 = aVar.f17952s0;
            boolean z9 = aVar.f17953t0;
            int i11 = 0;
            if (i10 == 0) {
                fVar.f18236e = 4;
                while (i11 < aVar.f18068r0) {
                    w.d dVar2 = aVar.f18067q0[i11];
                    if (z9 || dVar2.f17995g0 != 8) {
                        f fVar2 = dVar2.f17988d.f18272h;
                        fVar2.f18242k.add(fVar);
                        fVar.f18243l.add(fVar2);
                    }
                    i11++;
                }
                m(this.f18266b.f17988d.f18272h);
                m(this.f18266b.f17988d.f18273i);
                return;
            }
            if (i10 == 1) {
                fVar.f18236e = 5;
                while (i11 < aVar.f18068r0) {
                    w.d dVar3 = aVar.f18067q0[i11];
                    if (z9 || dVar3.f17995g0 != 8) {
                        f fVar3 = dVar3.f17988d.f18273i;
                        fVar3.f18242k.add(fVar);
                        fVar.f18243l.add(fVar3);
                    }
                    i11++;
                }
                m(this.f18266b.f17988d.f18272h);
                m(this.f18266b.f17988d.f18273i);
                return;
            }
            if (i10 == 2) {
                fVar.f18236e = 6;
                while (i11 < aVar.f18068r0) {
                    w.d dVar4 = aVar.f18067q0[i11];
                    if (z9 || dVar4.f17995g0 != 8) {
                        f fVar4 = dVar4.f17990e.f18272h;
                        fVar4.f18242k.add(fVar);
                        fVar.f18243l.add(fVar4);
                    }
                    i11++;
                }
                m(this.f18266b.f17990e.f18272h);
                m(this.f18266b.f17990e.f18273i);
                return;
            }
            if (i10 != 3) {
                return;
            }
            fVar.f18236e = 7;
            while (i11 < aVar.f18068r0) {
                w.d dVar5 = aVar.f18067q0[i11];
                if (z9 || dVar5.f17995g0 != 8) {
                    f fVar5 = dVar5.f17990e.f18273i;
                    fVar5.f18242k.add(fVar);
                    fVar.f18243l.add(fVar5);
                }
                i11++;
            }
            m(this.f18266b.f17990e.f18272h);
            m(this.f18266b.f17990e.f18273i);
        }
    }

    @Override // x.p
    public final void e() {
        w.d dVar = this.f18266b;
        if (dVar instanceof w.a) {
            int i10 = ((w.a) dVar).f17952s0;
            f fVar = this.f18272h;
            if (i10 == 0 || i10 == 1) {
                dVar.Y = fVar.f18238g;
            } else {
                dVar.Z = fVar.f18238g;
            }
        }
    }

    @Override // x.p
    public final void f() {
        this.f18267c = null;
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
