package i2;

import c2.n;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import l2.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14165a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2.d f14167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f14168d;

    public c(j2.d dVar) {
        this.f14167c = dVar;
    }

    public abstract boolean a(j jVar);

    public abstract boolean b(Object obj);

    public final void c(Collection collection) {
        this.f14165a.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            j jVar = (j) it.next();
            if (a(jVar)) {
                this.f14165a.add(jVar.f15142a);
            }
        }
        if (this.f14165a.isEmpty()) {
            this.f14167c.b(this);
        } else {
            j2.d dVar = this.f14167c;
            synchronized (dVar.f14286c) {
                try {
                    if (dVar.f14287d.add(this)) {
                        if (dVar.f14287d.size() == 1) {
                            dVar.f14288e = dVar.a();
                            n nVarI = n.i();
                            int i10 = j2.d.f14283f;
                            String.format("%s: initial state = %s", dVar.getClass().getSimpleName(), dVar.f14288e);
                            nVarI.g(new Throwable[0]);
                            dVar.d();
                        }
                        Object obj = dVar.f14288e;
                        this.f14166b = obj;
                        d(this.f14168d, obj);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d(this.f14168d, this.f14166b);
    }

    public final void d(b bVar, Object obj) {
        if (this.f14165a.isEmpty() || bVar == null) {
            return;
        }
        if (obj == null || b(obj)) {
            ((h2.c) bVar).b(this.f14165a);
            return;
        }
        ArrayList<String> arrayList = this.f14165a;
        h2.c cVar = (h2.c) bVar;
        synchronized (cVar.f13944c) {
            try {
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    if (cVar.a(str)) {
                        n nVarI = n.i();
                        int i10 = h2.c.f13941d;
                        String.format("Constraints met for %s", str);
                        nVarI.g(new Throwable[0]);
                        arrayList2.add(str);
                    }
                }
                h2.b bVar2 = cVar.f13942a;
                if (bVar2 != null) {
                    bVar2.d(arrayList2);
                }
            } finally {
            }
        }
    }
}
