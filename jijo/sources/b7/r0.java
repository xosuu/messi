package b7;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends q0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u0 f1441h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s0 f1442q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final h f1443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f1444t;

    public r0(u0 u0Var, s0 s0Var, h hVar, Object obj) {
        this.f1441h = u0Var;
        this.f1442q = s0Var;
        this.f1443s = hVar;
        this.f1444t = obj;
    }

    @Override // t6.l
    public final /* bridge */ /* synthetic */ Object d(Object obj) {
        l((Throwable) obj);
        return l6.f.f15231a;
    }

    @Override // b7.q0
    public final void l(Throwable th) {
        u0 u0Var = this.f1441h;
        u0Var.getClass();
        h hVarT = u0.t(this.f1443s);
        s0 s0Var = this.f1442q;
        Object obj = this.f1444t;
        if (hVarT != null) {
            while (g4.a0.m(hVarT.f1417h, false, new r0(u0Var, s0Var, hVarT, obj), 1) == x0.f1476a) {
                hVarT = u0.t(hVarT);
                if (hVarT == null) {
                }
            }
            return;
        }
        u0Var.j(s0Var, obj);
    }
}
