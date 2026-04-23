package g4;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f13805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f13806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f13807c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f13808d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13809e = false;

    public v0(g gVar, z0 z0Var, l lVar) {
        this.f13805a = gVar;
        this.f13806b = z0Var;
        this.f13807c = lVar;
    }

    public final void a(androidx.fragment.app.w wVar, l5.e eVar, l5.c cVar, l5.b bVar) {
        synchronized (this.f13808d) {
            this.f13809e = true;
        }
        z0 z0Var = this.f13806b;
        z0Var.getClass();
        z0Var.f13839c.execute(new m2.n(z0Var, wVar, eVar, cVar, bVar));
    }
}
