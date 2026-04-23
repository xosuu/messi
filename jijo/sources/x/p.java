package x;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w.d f18266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f18267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f18269e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18270f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18271g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f18272h = new f(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f18273i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18274j = 1;

    public p(w.d dVar) {
        this.f18266b = dVar;
    }

    public static void b(f fVar, f fVar2, int i10) {
        fVar.f18243l.add(fVar2);
        fVar.f18237f = i10;
        fVar2.f18242k.add(fVar);
    }

    public static f h(w.c cVar) {
        w.c cVar2 = cVar.f17978f;
        if (cVar2 == null) {
            return null;
        }
        int iB = u.h.b(cVar2.f17977e);
        w.d dVar = cVar2.f17976d;
        if (iB == 1) {
            return dVar.f17988d.f18272h;
        }
        if (iB == 2) {
            return dVar.f17990e.f18272h;
        }
        if (iB == 3) {
            return dVar.f17988d.f18273i;
        }
        if (iB == 4) {
            return dVar.f17990e.f18273i;
        }
        if (iB != 5) {
            return null;
        }
        return dVar.f17990e.f18249k;
    }

    public static f i(w.c cVar, int i10) {
        w.c cVar2 = cVar.f17978f;
        if (cVar2 == null) {
            return null;
        }
        w.d dVar = cVar2.f17976d;
        p pVar = i10 == 0 ? dVar.f17988d : dVar.f17990e;
        int iB = u.h.b(cVar2.f17977e);
        if (iB == 1 || iB == 2) {
            return pVar.f18272h;
        }
        if (iB == 3 || iB == 4) {
            return pVar.f18273i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f18243l.add(fVar2);
        fVar.f18243l.add(this.f18269e);
        fVar.f18239h = i10;
        fVar.f18240i = gVar;
        fVar2.f18242k.add(fVar);
        gVar.f18242k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int iMax;
        if (i11 == 0) {
            w.d dVar = this.f18266b;
            int i12 = dVar.f18019v;
            iMax = Math.max(dVar.f18018u, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        } else {
            w.d dVar2 = this.f18266b;
            int i13 = dVar2.f18022y;
            iMax = Math.max(dVar2.f18021x, i10);
            if (i13 > 0) {
                iMax = Math.min(i13, i10);
            }
            if (iMax == i10) {
                return i10;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.f18269e.f18241j) {
            return r0.f18238g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(w.c r12, w.c r13, int r14) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x.p.l(w.c, w.c, int):void");
    }
}
