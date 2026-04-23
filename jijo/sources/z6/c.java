package z6;

import g4.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m6.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends e {
    public static List O0(b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = bVar.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        int size = arrayList.size();
        if (size == 0) {
            return f.f15779a;
        }
        if (size != 1) {
            return arrayList;
        }
        List listSingletonList = Collections.singletonList(arrayList.get(0));
        a0.e(listSingletonList, "singletonList(element)");
        return listSingletonList;
    }
}
