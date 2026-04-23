package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f940b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f939a = obj;
        c cVar = c.f956c;
        Class<?> cls = obj.getClass();
        a aVar = (a) cVar.f957a.get(cls);
        this.f940b = aVar == null ? cVar.a(cls, null) : aVar;
    }

    @Override // androidx.lifecycle.o
    public final void a(q qVar, k kVar) {
        HashMap map = this.f940b.f943a;
        List list = (List) map.get(kVar);
        Object obj = this.f939a;
        a.a(list, qVar, kVar, obj);
        a.a((List) map.get(k.ON_ANY), qVar, kVar, obj);
    }
}
