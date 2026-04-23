package d2;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import c2.m;
import c2.n;
import c2.w;
import com.google.android.gms.internal.ads.ur0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {
    public static final /* synthetic */ int F = 0;
    public ArrayList A;
    public String B;
    public n2.i C;
    public n5.a D;
    public volatile boolean E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f12339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f12340b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f12341d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ur0 f12342f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l2.j f12343h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ListenableWorker f12344q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public o2.a f12345s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f12346t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c2.b f12347u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public k2.a f12348v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WorkDatabase f12349w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l2.l f12350x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l2.c f12351y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l2.c f12352z;

    static {
        n.l("WorkerWrapper");
    }

    public final void a(m mVar) {
        if (!(mVar instanceof c2.l)) {
            if (mVar instanceof c2.k) {
                n nVarI = n.i();
                String.format("Worker result RETRY for %s", this.B);
                nVarI.j(new Throwable[0]);
                d();
                return;
            }
            n nVarI2 = n.i();
            String.format("Worker result FAILURE for %s", this.B);
            nVarI2.j(new Throwable[0]);
            if (this.f12343h.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        n nVarI3 = n.i();
        String.format("Worker result SUCCESS for %s", this.B);
        nVarI3.j(new Throwable[0]);
        if (this.f12343h.c()) {
            e();
            return;
        }
        l2.c cVar = this.f12351y;
        String str = this.f12340b;
        l2.l lVar = this.f12350x;
        WorkDatabase workDatabase = this.f12349w;
        workDatabase.c();
        try {
            lVar.o(w.f1549d, str);
            lVar.m(str, ((c2.l) this.f12346t).f1533a);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str2 : cVar.a(str)) {
                if (lVar.e(str2) == w.f1551h && cVar.d(str2)) {
                    n nVarI4 = n.i();
                    String.format("Setting status to enqueued for %s", str2);
                    nVarI4.j(new Throwable[0]);
                    lVar.o(w.f1547a, str2);
                    lVar.n(jCurrentTimeMillis, str2);
                }
            }
            workDatabase.h();
            workDatabase.f();
            f(false);
        } catch (Throwable th) {
            workDatabase.f();
            f(false);
            throw th;
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            l2.l lVar = this.f12350x;
            if (lVar.e(str2) != w.f1552q) {
                lVar.o(w.f1550f, str2);
            }
            linkedList.addAll(this.f12351y.a(str2));
        }
    }

    public final void c() {
        boolean zI = i();
        String str = this.f12340b;
        WorkDatabase workDatabase = this.f12349w;
        if (!zI) {
            workDatabase.c();
            try {
                w wVarE = this.f12350x.e(str);
                workDatabase.m().i(str);
                if (wVarE == null) {
                    f(false);
                } else if (wVarE == w.f1548b) {
                    a(this.f12346t);
                } else if (!wVarE.a()) {
                    d();
                }
                workDatabase.h();
                workDatabase.f();
            } catch (Throwable th) {
                workDatabase.f();
                throw th;
            }
        }
        List list = this.f12341d;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c) it.next()).b(str);
            }
            d.a(this.f12347u, workDatabase, list);
        }
    }

    public final void d() {
        String str = this.f12340b;
        l2.l lVar = this.f12350x;
        WorkDatabase workDatabase = this.f12349w;
        workDatabase.c();
        try {
            lVar.o(w.f1547a, str);
            lVar.n(System.currentTimeMillis(), str);
            lVar.k(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(true);
        }
    }

    public final void e() {
        String str = this.f12340b;
        l2.l lVar = this.f12350x;
        WorkDatabase workDatabase = this.f12349w;
        workDatabase.c();
        try {
            lVar.n(System.currentTimeMillis(), str);
            lVar.o(w.f1547a, str);
            lVar.l(str);
            lVar.k(-1L, str);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final void f(boolean z9) {
        ListenableWorker listenableWorker;
        this.f12349w.c();
        try {
            if (!this.f12349w.n().i()) {
                m2.g.a(this.f12339a, RescheduleReceiver.class, false);
            }
            if (z9) {
                this.f12350x.o(w.f1547a, this.f12340b);
                this.f12350x.k(-1L, this.f12340b);
            }
            if (this.f12343h != null && (listenableWorker = this.f12344q) != null && listenableWorker.isRunInForeground()) {
                k2.a aVar = this.f12348v;
                String str = this.f12340b;
                b bVar = (b) aVar;
                synchronized (bVar.f12308w) {
                    bVar.f12303q.remove(str);
                    bVar.i();
                }
            }
            this.f12349w.h();
            this.f12349w.f();
            this.C.j(Boolean.valueOf(z9));
        } catch (Throwable th) {
            this.f12349w.f();
            throw th;
        }
    }

    public final void g() {
        l2.l lVar = this.f12350x;
        String str = this.f12340b;
        w wVarE = lVar.e(str);
        if (wVarE == w.f1548b) {
            n nVarI = n.i();
            String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str);
            nVarI.g(new Throwable[0]);
            f(true);
            return;
        }
        n nVarI2 = n.i();
        String.format("Status for %s is %s; not doing any work", str, wVarE);
        nVarI2.g(new Throwable[0]);
        f(false);
    }

    public final void h() {
        String str = this.f12340b;
        WorkDatabase workDatabase = this.f12349w;
        workDatabase.c();
        try {
            b(str);
            this.f12350x.m(str, ((c2.j) this.f12346t).f1532a);
            workDatabase.h();
        } finally {
            workDatabase.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.E) {
            return false;
        }
        n nVarI = n.i();
        String.format("Work interrupted for %s", this.B);
        nVarI.g(new Throwable[0]);
        if (this.f12350x.e(this.f12340b) == null) {
            f(false);
        } else {
            f(!r0.a());
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01f3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.l.run():void");
    }
}
