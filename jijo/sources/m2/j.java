package m2;

import androidx.work.impl.WorkDatabase;
import c2.w;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2.k f15706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15707b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15708d;

    static {
        c2.n.l("StopWorkRunnable");
    }

    public j(d2.k kVar, String str, boolean z9) {
        this.f15706a = kVar;
        this.f15707b = str;
        this.f15708d = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zK;
        d2.k kVar = this.f15706a;
        WorkDatabase workDatabase = kVar.f12332e;
        d2.b bVar = kVar.f12335h;
        l2.l lVarN = workDatabase.n();
        workDatabase.c();
        try {
            String str = this.f15707b;
            synchronized (bVar.f12308w) {
                zContainsKey = bVar.f12303q.containsKey(str);
            }
            if (this.f15708d) {
                zK = this.f15706a.f12335h.j(this.f15707b);
            } else {
                if (!zContainsKey && lVarN.e(this.f15707b) == w.f1548b) {
                    lVarN.o(w.f1547a, this.f15707b);
                }
                zK = this.f15706a.f12335h.k(this.f15707b);
            }
            c2.n nVarI = c2.n.i();
            String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f15707b, Boolean.valueOf(zK));
            nVarI.g(new Throwable[0]);
            workDatabase.h();
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
