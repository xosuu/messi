package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class vx0 extends ly0 implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Map f9992f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f9993h;

    public vx0(Map map) {
        if (!map.isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.f9992f = map;
    }

    public final void c() {
        Map map = this.f9992f;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.f9993h = 0;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, java.util.Collection] */
    public final boolean d(Double d10, Integer num) {
        Map map = this.f9992f;
        Collection collection = (Collection) map.get(d10);
        if (collection != null) {
            if (!collection.add(num)) {
                return false;
            }
            this.f9993h++;
            return true;
        }
        ?? Mo3zza = ((sz0) this).f8998q.mo3zza();
        if (!Mo3zza.add(num)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f9993h++;
        map.put(d10, Mo3zza);
        return true;
    }
}
