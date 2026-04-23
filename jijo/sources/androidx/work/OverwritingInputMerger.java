package androidx.work;

import c2.f;
import c2.i;
import j6.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends i {
    @Override // c2.i
    public final f a(ArrayList arrayList) throws Throwable {
        c0 c0Var = new c0(0);
        HashMap map = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            map.putAll(Collections.unmodifiableMap(((f) it.next()).f1527a));
        }
        c0Var.i(map);
        f fVar = new f(c0Var.f14389a);
        f.c(fVar);
        return fVar;
    }
}
