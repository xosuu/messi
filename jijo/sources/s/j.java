package s;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Collection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k.d f16619a;

    public j(k.d dVar) {
        this.f16619a = dVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f16619a.c();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f16619a.h(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f16619a.f() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new g(this.f16619a, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        k.d dVar = this.f16619a;
        int iH = dVar.h(obj);
        if (iH < 0) {
            return false;
        }
        dVar.j(iH);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        k.d dVar = this.f16619a;
        int iF = dVar.f();
        int i10 = 0;
        boolean z9 = false;
        while (i10 < iF) {
            if (collection.contains(dVar.d(i10, 1))) {
                dVar.j(i10);
                i10--;
                iF--;
                z9 = true;
            }
            i10++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        k.d dVar = this.f16619a;
        int iF = dVar.f();
        int i10 = 0;
        boolean z9 = false;
        while (i10 < iF) {
            if (!collection.contains(dVar.d(i10, 1))) {
                dVar.j(i10);
                i10--;
                iF--;
                z9 = true;
            }
            i10++;
        }
        return z9;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f16619a.f();
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f16619a.o(1, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        k.d dVar = this.f16619a;
        int iF = dVar.f();
        Object[] objArr = new Object[iF];
        for (int i10 = 0; i10 < iF; i10++) {
            objArr[i10] = dVar.d(i10, 1);
        }
        return objArr;
    }
}
