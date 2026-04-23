package m6;

import com.google.android.gms.internal.ads.en1;
import g4.a0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends en1 {
    public static Map O0(ArrayList arrayList) {
        g gVar = g.f15780a;
        int size = arrayList.size();
        if (size == 0) {
            return gVar;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(en1.w(arrayList.size()));
            P0(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        l6.a aVar = (l6.a) arrayList.get(0);
        a0.f(aVar, "pair");
        Map mapSingletonMap = Collections.singletonMap(aVar.f15224a, aVar.f15225b);
        a0.e(mapSingletonMap, "singletonMap(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static final void P0(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l6.a aVar = (l6.a) it.next();
            linkedHashMap.put(aVar.f15224a, aVar.f15225b);
        }
    }
}
