package m2;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f15732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15733b;

    public r(s sVar, String str) {
        this.f15732a = sVar;
        this.f15733b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f15732a.f15737d) {
            try {
                if (((r) this.f15732a.f15735b.remove(this.f15733b)) != null) {
                    q qVar = (q) this.f15732a.f15736c.remove(this.f15733b);
                    if (qVar != null) {
                        String str = this.f15733b;
                        c2.n nVarI = c2.n.i();
                        String.format("Exceeded time limits on execution for %s", str);
                        int i10 = f2.e.f13064v;
                        nVarI.g(new Throwable[0]);
                        ((f2.e) qVar).f();
                    }
                } else {
                    c2.n nVarI2 = c2.n.i();
                    String.format("Timer with %s is already marked as complete.", this.f15733b);
                    nVarI2.g(new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
