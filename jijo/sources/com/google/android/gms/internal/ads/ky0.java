package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ky0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6414b;

    public /* synthetic */ ky0(int i10, Object obj) {
        this.f6413a = i10;
        this.f6414b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10 = this.f6413a;
        Object obj = this.f6414b;
        switch (i10) {
            case 0:
                ((vx0) ((ly0) obj)).c();
                break;
            case 1:
                ((qy0) obj).clear();
                break;
            default:
                ((Map) obj).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f6413a;
        Object obj2 = this.f6414b;
        switch (i10) {
            case 0:
                Iterator it = ((ky0) ((zx0) ((ly0) obj2).b()).values()).iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((Map) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f6413a) {
            case 2:
                return ((Map) this.f6414b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f6413a;
        Object obj = this.f6414b;
        switch (i10) {
            case 0:
                vx0 vx0Var = (vx0) ((ly0) obj);
                vx0Var.getClass();
                return new wx0(vx0Var);
            case 1:
                qy0 qy0Var = (qy0) obj;
                Map mapD = qy0Var.d();
                return mapD != null ? mapD.values().iterator() : new my0(qy0Var, 2);
            default:
                return new nz0(((Map) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f6413a) {
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = (Map) this.f6414b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (tp1.P(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f6413a) {
            case 2:
                collection.getClass();
                try {
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.f6414b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f6413a) {
            case 2:
                collection.getClass();
                try {
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = (Map) this.f6414b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = this.f6413a;
        Object obj = this.f6414b;
        switch (i10) {
            case 0:
                return ((vx0) ((ly0) obj)).f9993h;
            case 1:
                return ((qy0) obj).size();
            default:
                return ((Map) obj).size();
        }
    }

    public ky0(Map map) {
        this.f6413a = 2;
        this.f6414b = map;
    }
}
