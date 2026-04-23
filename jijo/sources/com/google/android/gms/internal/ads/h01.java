package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class h01 extends g01 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f4742a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f4742a.iterator();
        it.getClass();
        ix0 ix0Var = this.f4743b;
        ix0Var.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (ix0Var.zza(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new h01(((SortedSet) this.f4742a).headSet(obj), this.f4743b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.f4742a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.f4743b.zza(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new h01(((SortedSet) this.f4742a).subSet(obj, obj2), this.f4743b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new h01(((SortedSet) this.f4742a).tailSet(obj), this.f4743b);
    }
}
