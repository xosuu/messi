package androidx.lifecycle;

import com.google.android.gms.internal.ads.fb1;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class s extends f0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public n.a f992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l f993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final WeakReference f994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f997i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f998j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f999k;

    public s(q qVar) {
        new AtomicReference();
        this.f992d = new n.a();
        this.f995g = 0;
        this.f996h = false;
        this.f997i = false;
        this.f998j = new ArrayList();
        this.f994f = new WeakReference(qVar);
        this.f993e = l.f981b;
        this.f999k = true;
    }

    @Override // androidx.lifecycle.f0
    public final void a(p pVar) {
        o reflectiveGenericLifecycleObserver;
        q qVar;
        d("addObserver");
        l lVar = this.f993e;
        l lVar2 = l.f980a;
        if (lVar != lVar2) {
            lVar2 = l.f981b;
        }
        r rVar = new r();
        HashMap map = u.f1001a;
        boolean z9 = pVar instanceof o;
        boolean z10 = pVar instanceof d;
        if (z9 && z10) {
            reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((d) pVar, (o) pVar);
        } else if (z10) {
            reflectiveGenericLifecycleObserver = new FullLifecycleObserverAdapter((d) pVar, null);
        } else if (z9) {
            reflectiveGenericLifecycleObserver = (o) pVar;
        } else {
            Class<?> cls = pVar.getClass();
            if (u.c(cls) == 2) {
                List list = (List) u.f1002b.get(cls);
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), pVar);
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver();
                } else {
                    g[] gVarArr = new g[list.size()];
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        u.a((Constructor) list.get(i10), pVar);
                        gVarArr[i10] = null;
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(gVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(pVar);
            }
        }
        rVar.f991b = reflectiveGenericLifecycleObserver;
        rVar.f990a = lVar2;
        if (((r) this.f992d.d(pVar, rVar)) == null && (qVar = (q) this.f994f.get()) != null) {
            boolean z11 = this.f995g != 0 || this.f996h;
            l lVarC = c(pVar);
            this.f995g++;
            while (rVar.f990a.compareTo(lVarC) < 0 && this.f992d.f15805h.containsKey(pVar)) {
                this.f998j.add(rVar.f990a);
                int iOrdinal = rVar.f990a.ordinal();
                k kVar = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : k.ON_RESUME : k.ON_START : k.ON_CREATE;
                if (kVar == null) {
                    throw new IllegalStateException("no event up from " + rVar.f990a);
                }
                rVar.a(qVar, kVar);
                ArrayList arrayList = this.f998j;
                arrayList.remove(arrayList.size() - 1);
                lVarC = c(pVar);
            }
            if (!z11) {
                g();
            }
            this.f995g--;
        }
    }

    @Override // androidx.lifecycle.f0
    public final void b(p pVar) {
        d("removeObserver");
        this.f992d.c(pVar);
    }

    public final l c(p pVar) {
        HashMap map = this.f992d.f15805h;
        n.c cVar = map.containsKey(pVar) ? ((n.c) map.get(pVar)).f15810f : null;
        l lVar = cVar != null ? ((r) cVar.f15808b).f990a : null;
        ArrayList arrayList = this.f998j;
        l lVar2 = arrayList.isEmpty() ? null : (l) arrayList.get(arrayList.size() - 1);
        l lVar3 = this.f993e;
        if (lVar == null || lVar.compareTo(lVar3) >= 0) {
            lVar = lVar3;
        }
        return (lVar2 == null || lVar2.compareTo(lVar) >= 0) ? lVar : lVar2;
    }

    public final void d(String str) {
        if (this.f999k && !m.a.r0().f15365c.s0()) {
            throw new IllegalStateException(fb1.i("Method ", str, " must be called on the main thread"));
        }
    }

    public final void e(k kVar) {
        d("handleLifecycleEvent");
        f(kVar.a());
    }

    public final void f(l lVar) {
        l lVar2 = this.f993e;
        if (lVar2 == lVar) {
            return;
        }
        l lVar3 = l.f981b;
        l lVar4 = l.f980a;
        if (lVar2 == lVar3 && lVar == lVar4) {
            throw new IllegalStateException("no event down from " + this.f993e);
        }
        this.f993e = lVar;
        if (this.f996h || this.f995g != 0) {
            this.f997i = true;
            return;
        }
        this.f996h = true;
        g();
        this.f996h = false;
        if (this.f993e == lVar4) {
            this.f992d = new n.a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        r11.f997i = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0050, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f3, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.s.g():void");
    }
}
