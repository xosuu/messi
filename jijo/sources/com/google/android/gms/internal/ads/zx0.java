package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public class zx0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient xx0 f11333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient ky0 f11334b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Map f11335d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx0 f11336f;

    public zx0(vx0 vx0Var, Map map) {
        this.f11336f = vx0Var;
        this.f11335d = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        xx0 xx0Var = this.f11333a;
        if (xx0Var != null) {
            return xx0Var;
        }
        xx0 xx0Var2 = new xx0(this);
        this.f11333a = xx0Var2;
        return xx0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection values() {
        ky0 ky0Var = this.f11334b;
        if (ky0Var != null) {
            return ky0Var;
        }
        ky0 ky0Var2 = new ky0(this);
        this.f11334b = ky0Var2;
        return ky0Var2;
    }

    public final xy0 c(Map.Entry entry) {
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        vx0 vx0Var = this.f11336f;
        vx0Var.getClass();
        List list = (List) collection;
        return new xy0(key, list instanceof RandomAccess ? new dy0(vx0Var, key, list, null) : new iy0(vx0Var, key, list, null));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        vx0 vx0Var = this.f11336f;
        if (this.f11335d == vx0Var.f9992f) {
            vx0Var.c();
            return;
        }
        yx0 yx0Var = new yx0(this);
        while (yx0Var.hasNext()) {
            yx0Var.next();
            yx0Var.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f11335d;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return this == obj || this.f11335d.equals(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.f11335d;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        vx0 vx0Var = this.f11336f;
        vx0Var.getClass();
        List list = (List) collection;
        return list instanceof RandomAccess ? new dy0(vx0Var, obj, list, null) : new iy0(vx0Var, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f11335d.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set keySet() {
        vx0 vx0Var = this.f11336f;
        ay0 cy0Var = vx0Var.f6712a;
        if (cy0Var == null) {
            sz0 sz0Var = (sz0) vx0Var;
            Map map = sz0Var.f9992f;
            cy0Var = map instanceof NavigableMap ? new cy0(sz0Var, (NavigableMap) map) : map instanceof SortedMap ? new fy0(sz0Var, (SortedMap) map) : new ay0(sz0Var, map);
            vx0Var.f6712a = cy0Var;
        }
        return cy0Var;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Collection] */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f11335d.remove(obj);
        if (collection == null) {
            return null;
        }
        vx0 vx0Var = this.f11336f;
        ?? Mo3zza = ((sz0) vx0Var).f8998q.mo3zza();
        Mo3zza.addAll(collection);
        vx0Var.f9993h -= collection.size();
        collection.clear();
        return Mo3zza;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f11335d.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f11335d.toString();
    }
}
