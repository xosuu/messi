package m2;

import androidx.work.impl.WorkDatabase;
import c2.u;
import c2.w;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15693b;

    public c(String str, Object[] objArr) {
        this.f15692a = 1;
        byte[] bArr = g7.b.f13888a;
        this.f15693b = String.format(Locale.US, str, objArr);
    }

    public static void a(d2.k kVar, String str) {
        WorkDatabase workDatabase = kVar.f12332e;
        l2.l lVarN = workDatabase.n();
        l2.c cVarI = workDatabase.i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            w wVarE = lVarN.e(str2);
            if (wVarE != w.f1549d && wVarE != w.f1550f) {
                lVarN.o(w.f1552q, str2);
            }
            linkedList.addAll(cVarI.a(str2));
        }
        d2.b bVar = kVar.f12335h;
        synchronized (bVar.f12308w) {
            try {
                c2.n nVarI = c2.n.i();
                int i10 = d2.b.f12297x;
                boolean z9 = true;
                String.format("Processor cancelling %s", str);
                nVarI.g(new Throwable[0]);
                bVar.f12306u.add(str);
                d2.l lVar = (d2.l) bVar.f12303q.remove(str);
                if (lVar == null) {
                    z9 = false;
                }
                if (lVar == null) {
                    lVar = (d2.l) bVar.f12304s.remove(str);
                }
                d2.b.c(str, lVar);
                if (z9) {
                    bVar.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Iterator it = kVar.f12334g.iterator();
        while (it.hasNext()) {
            ((d2.c) it.next()).b(str);
        }
    }

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f15692a;
        Object obj = this.f15693b;
        switch (i10) {
            case 0:
                try {
                    c();
                    ((f.f) obj).G(u.f1545c);
                    return;
                } catch (Throwable th) {
                    ((f.f) obj).G(new c2.r(th));
                    return;
                }
            default:
                String name = Thread.currentThread().getName();
                Thread.currentThread().setName((String) obj);
                try {
                    b();
                    return;
                } finally {
                    Thread.currentThread().setName(name);
                }
        }
    }

    public c() {
        this.f15692a = 0;
        this.f15693b = new f.f(12);
    }
}
