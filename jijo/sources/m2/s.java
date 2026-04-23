package m2;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f15734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f15737d;

    static {
        c2.n.l("WorkTimer");
    }

    public s() {
        l0.k kVar = new l0.k(this);
        this.f15735b = new HashMap();
        this.f15736c = new HashMap();
        this.f15737d = new Object();
        this.f15734a = Executors.newSingleThreadScheduledExecutor(kVar);
    }

    public final void a(String str, q qVar) {
        synchronized (this.f15737d) {
            c2.n nVarI = c2.n.i();
            String.format("Starting timer for %s", str);
            nVarI.g(new Throwable[0]);
            b(str);
            r rVar = new r(this, str);
            this.f15735b.put(str, rVar);
            this.f15736c.put(str, qVar);
            this.f15734a.schedule(rVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f15737d) {
            try {
                if (((r) this.f15735b.remove(str)) != null) {
                    c2.n nVarI = c2.n.i();
                    String.format("Stopping timer for %s", str);
                    nVarI.g(new Throwable[0]);
                    this.f15736c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
