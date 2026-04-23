package k4;

import f.u0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class i implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f14678b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f14680f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14677a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f14679d = new Object();

    public i(u0 u0Var, g gVar) {
        this.f14678b = u0Var;
        this.f14680f = gVar;
    }

    private final void b(l lVar) {
        if (lVar.f14685d) {
            synchronized (this.f14679d) {
                try {
                    if (((g) this.f14680f) == null) {
                        return;
                    }
                    this.f14678b.execute(new h(this));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private final void c(l lVar) {
        synchronized (this.f14679d) {
            try {
                if (((b) this.f14680f) == null) {
                    return;
                }
                this.f14678b.execute(new l.j(this, 24, lVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void d(l lVar) {
        if (lVar.d() || lVar.f14685d) {
            return;
        }
        synchronized (this.f14679d) {
            try {
                if (((c) this.f14680f) == null) {
                    return;
                }
                this.f14678b.execute(new l.j(this, 25, lVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k4.j
    public final void a(l lVar) {
        switch (this.f14677a) {
            case 0:
                b(lVar);
                return;
            case 1:
                c(lVar);
                return;
            case 2:
                d(lVar);
                return;
            default:
                if (lVar.d()) {
                    synchronized (this.f14679d) {
                        try {
                            if (((d) this.f14680f) != null) {
                                this.f14678b.execute(new l.j(this, 26, lVar));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
        }
    }

    public i(u0 u0Var, g gVar, int i10) {
        this.f14678b = u0Var;
        this.f14680f = gVar;
    }

    public i(Executor executor, b bVar) {
        this.f14678b = executor;
        this.f14680f = bVar;
    }

    public i(Executor executor, c cVar) {
        this.f14678b = executor;
        this.f14680f = cVar;
    }
}
