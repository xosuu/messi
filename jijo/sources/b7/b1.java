package b7;

/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1398a = new ThreadLocal();

    public static g0 a() {
        ThreadLocal threadLocal = f1398a;
        g0 g0Var = (g0) threadLocal.get();
        if (g0Var != null) {
            return g0Var;
        }
        c cVar = new c(Thread.currentThread());
        threadLocal.set(cVar);
        return cVar;
    }
}
