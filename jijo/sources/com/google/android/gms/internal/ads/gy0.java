package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class gy0 extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f5108b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gy0 f5109d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Collection f5110f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vx0 f5111h;

    public gy0(vx0 vx0Var, Object obj, Collection collection, gy0 gy0Var) {
        this.f5111h = vx0Var;
        this.f5107a = obj;
        this.f5108b = collection;
        this.f5109d = gy0Var;
        this.f5110f = gy0Var == null ? null : gy0Var.f5108b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f5108b.isEmpty();
        boolean zAdd = this.f5108b.add(obj);
        if (zAdd) {
            this.f5111h.f9993h++;
            if (zIsEmpty) {
                b();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.f5108b.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f5111h.f9993h += this.f5108b.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    public final void b() {
        gy0 gy0Var = this.f5109d;
        if (gy0Var != null) {
            gy0Var.b();
            return;
        }
        this.f5111h.f9992f.put(this.f5107a, this.f5108b);
    }

    public final void c() {
        Collection collection;
        gy0 gy0Var = this.f5109d;
        if (gy0Var != null) {
            gy0Var.c();
            if (gy0Var.f5108b != this.f5110f) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f5108b.isEmpty() || (collection = (Collection) this.f5111h.f9992f.get(this.f5107a)) == null) {
                return;
            }
            this.f5108b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.f5108b.clear();
        this.f5111h.f9993h -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f5108b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f5108b.containsAll(collection);
    }

    public final void d() {
        gy0 gy0Var = this.f5109d;
        if (gy0Var != null) {
            gy0Var.d();
        } else if (this.f5108b.isEmpty()) {
            this.f5111h.f9992f.remove(this.f5107a);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f5108b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f5108b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new yx0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f5108b.remove(obj);
        if (zRemove) {
            vx0 vx0Var = this.f5111h;
            vx0Var.f9993h--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.f5108b.removeAll(collection);
        if (zRemoveAll) {
            this.f5111h.f9993h += this.f5108b.size() - size;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.f5108b.retainAll(collection);
        if (zRetainAll) {
            this.f5111h.f9993h += this.f5108b.size() - size;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f5108b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f5108b.toString();
    }
}
