package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g01 extends AbstractCollection implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f4742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ix0 f4743b;

    public g01(Set set, ix0 ix0Var) {
        this.f4742a = set;
        this.f4743b = ix0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean add(Object obj) {
        if (this.f4743b.zza(obj)) {
            return this.f4742a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f4743b.zza(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f4742a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        Collection collection = this.f4742a;
        boolean z9 = collection instanceof RandomAccess;
        ix0 ix0Var = this.f4743b;
        if (!z9 || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            ix0Var.getClass();
            while (it.hasNext()) {
                if (ix0Var.zza(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        ix0Var.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!ix0Var.zza(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        tc1.E(list, ix0Var, i10, i11);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        tc1.E(list, ix0Var, i10, i11);
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        Collection collection = this.f4742a;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f4743b.zza(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return tp1.l0(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        Iterator it = this.f4742a.iterator();
        ix0 ix0Var = this.f4743b;
        en1.t0(ix0Var, "predicate");
        int i10 = 0;
        while (it.hasNext()) {
            if (ix0Var.zza(it.next())) {
                return i10 == -1;
            }
            i10++;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Iterator iterator() {
        Iterator it = this.f4742a.iterator();
        it.getClass();
        ix0 ix0Var = this.f4743b;
        ix0Var.getClass();
        return new gz0(it, ix0Var);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return tp1.t(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean remove(Object obj) {
        return contains(obj) && this.f4742a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f4742a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4743b.zza(next) && collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f4742a.iterator();
        boolean z9 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f4743b.zza(next) && !collection.contains(next)) {
                it.remove();
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int size() {
        Iterator it = this.f4742a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f4743b.zza(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        gz0 gz0Var = (gz0) it;
        while (gz0Var.hasNext()) {
            arrayList.add(gz0Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        gz0 gz0Var = (gz0) it;
        while (gz0Var.hasNext()) {
            arrayList.add(gz0Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
