package b7;

/* JADX INFO: loaded from: classes.dex */
public final class c1 extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f1400d = 0;

    static {
        new c1();
    }

    @Override // b7.q
    public final void D(n6.j jVar, Runnable runnable) {
        g1.a.x(jVar.A(e1.f1409b));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // b7.q
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
