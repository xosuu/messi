package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class e31 extends t.a implements Map {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3849b;

    public e31(Map map) {
        super(2);
        this.f3849b = map;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.f3849b.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return s(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return tp1.f0(this.f3849b.entrySet(), new g21(0));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return obj != null && tc1.y(obj, this);
    }

    @Override // java.util.Map
    public final /* synthetic */ Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f3849b.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return tp1.t(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.f3849b;
        if (map.isEmpty()) {
            return true;
        }
        return map.size() == 1 && map.containsKey(null);
    }

    @Override // java.util.Map
    public final Set keySet() {
        return tp1.f0(this.f3849b.keySet(), new g21(1));
    }

    @Override // t.a
    public final /* synthetic */ Object o() {
        return this.f3849b;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.f3849b.put(obj, obj2);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        this.f3849b.clear();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void putAll(Map map) {
        this.f3849b.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.f3849b.remove(obj);
    }

    public final boolean s(Object obj) {
        Iterator it = ((g01) entrySet()).iterator();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
            }
        }
        return false;
        return true;
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.f3849b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f3849b.values();
    }
}
