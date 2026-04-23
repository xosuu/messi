package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f943a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f944b;

    public a(HashMap map) {
        this.f944b = map;
        for (Map.Entry entry : map.entrySet()) {
            k kVar = (k) entry.getValue();
            List arrayList = (List) this.f943a.get(kVar);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f943a.put(kVar, arrayList);
            }
            arrayList.add((b) entry.getKey());
        }
    }

    public static void a(List list, q qVar, k kVar, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                b bVar = (b) list.get(size);
                bVar.getClass();
                try {
                    int i10 = bVar.f945a;
                    Method method = bVar.f946b;
                    if (i10 == 0) {
                        method.invoke(obj, new Object[0]);
                    } else if (i10 == 1) {
                        method.invoke(obj, qVar);
                    } else if (i10 == 2) {
                        method.invoke(obj, qVar, kVar);
                    }
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    throw new RuntimeException("Failed to call observer method", e11.getCause());
                }
            }
        }
    }
}
