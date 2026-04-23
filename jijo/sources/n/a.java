package n;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f15805h = new HashMap();

    @Override // n.g
    public final c b(Object obj) {
        return (c) this.f15805h.get(obj);
    }

    @Override // n.g
    public final Object c(Object obj) {
        Object objC = super.c(obj);
        this.f15805h.remove(obj);
        return objC;
    }

    public final Object d(Object obj, Object obj2) {
        c cVarB = b(obj);
        if (cVarB != null) {
            return cVarB.f15808b;
        }
        HashMap map = this.f15805h;
        c cVar = new c(obj, obj2);
        this.f15819f++;
        c cVar2 = this.f15817b;
        if (cVar2 == null) {
            this.f15816a = cVar;
            this.f15817b = cVar;
        } else {
            cVar2.f15809d = cVar;
            cVar.f15810f = cVar2;
            this.f15817b = cVar;
        }
        map.put(obj, cVar);
        return null;
    }
}
