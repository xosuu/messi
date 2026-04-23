package d2;

import c2.n;
import c2.y;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e extends t3.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f12310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f12311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f12313e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f.f f12315g;

    static {
        n.l("WorkContinuationImpl");
    }

    public e(k kVar, List list) {
        this.f12310b = kVar;
        this.f12311c = list;
        this.f12312d = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            String string = ((y) list.get(i10)).f1557a.toString();
            this.f12312d.add(string);
            this.f12313e.add(string);
        }
    }

    public static boolean X(e eVar, HashSet hashSet) {
        hashSet.addAll(eVar.f12312d);
        HashSet hashSetY = Y(eVar);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (hashSetY.contains((String) it.next())) {
                return true;
            }
        }
        hashSet.removeAll(eVar.f12312d);
        return false;
    }

    public static HashSet Y(e eVar) {
        HashSet hashSet = new HashSet();
        eVar.getClass();
        return hashSet;
    }
}
