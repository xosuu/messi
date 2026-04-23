package n;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class g implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f15817b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakHashMap f15818d = new WeakHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15819f = 0;

    public c b(Object obj) {
        c cVar = this.f15816a;
        while (cVar != null && !cVar.f15807a.equals(obj)) {
            cVar = cVar.f15809d;
        }
        return cVar;
    }

    public Object c(Object obj) {
        c cVarB = b(obj);
        if (cVarB == null) {
            return null;
        }
        this.f15819f--;
        WeakHashMap weakHashMap = this.f15818d;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(cVarB);
            }
        }
        c cVar = cVarB.f15810f;
        if (cVar != null) {
            cVar.f15809d = cVarB.f15809d;
        } else {
            this.f15816a = cVarB.f15809d;
        }
        c cVar2 = cVarB.f15809d;
        if (cVar2 != null) {
            cVar2.f15810f = cVar;
        } else {
            this.f15817b = cVar;
        }
        cVarB.f15809d = null;
        cVarB.f15810f = null;
        return cVarB.f15808b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((n.e) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof n.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            n.g r7 = (n.g) r7
            int r1 = r6.f15819f
            int r3 = r7.f15819f
            if (r1 == r3) goto L13
            return r2
        L13:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L1b:
            r3 = r1
            n.e r3 = (n.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L44
            r4 = r7
            n.e r4 = (n.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L44
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L3b
            if (r4 != 0) goto L43
        L3b:
            if (r3 == 0) goto L1b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L1b
        L43:
            return r2
        L44:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L53
            n.e r7 = (n.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L53
            goto L54
        L53:
            r0 = 0
        L54:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f15816a, this.f15817b, 0);
        this.f15818d.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) eVar.next()).toString());
            if (eVar.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
