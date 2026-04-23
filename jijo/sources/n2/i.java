package n2;

/* JADX INFO: loaded from: classes.dex */
public final class i extends g {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = g.f15914s;
        }
        if (!g.f15913q.c(this, null, obj)) {
            return false;
        }
        g.c(this);
        return true;
    }

    public final boolean k(Throwable th) {
        th.getClass();
        if (!g.f15913q.c(this, null, new b(th))) {
            return false;
        }
        g.c(this);
        return true;
    }

    public final boolean l(n5.a aVar) {
        b bVar;
        aVar.getClass();
        Object obj = this.f15915a;
        if (obj == null) {
            if (aVar.isDone()) {
                if (!g.f15913q.c(this, null, g.f(aVar))) {
                    return false;
                }
                g.c(this);
            } else {
                e eVar = new e(this, aVar);
                if (g.f15913q.c(this, null, eVar)) {
                    try {
                        aVar.a(eVar, h.f15918a);
                    } catch (Throwable th) {
                        try {
                            bVar = new b(th);
                        } catch (Throwable unused) {
                            bVar = b.f15895b;
                        }
                        g.f15913q.c(this, eVar, bVar);
                    }
                } else {
                    obj = this.f15915a;
                }
            }
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        aVar.cancel(((a) obj).f15893a);
        return false;
    }
}
