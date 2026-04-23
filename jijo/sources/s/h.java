package s;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Set {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k.d f16614b;

    public /* synthetic */ h(k.d dVar, int i10) {
        this.f16613a = i10;
        this.f16614b = dVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f16613a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f16613a) {
            case 0:
                k.d dVar = this.f16614b;
                int iF = dVar.f();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    dVar.i(entry.getKey(), entry.getValue());
                }
                return iF != dVar.f();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i10 = this.f16613a;
        k.d dVar = this.f16614b;
        switch (i10) {
            case 0:
                dVar.c();
                break;
            default:
                dVar.c();
                break;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i10 = this.f16613a;
        k.d dVar = this.f16614b;
        switch (i10) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = dVar.g(entry.getKey());
                    if (iG >= 0) {
                        Object objD = dVar.d(iG, 1);
                        Object value = entry.getValue();
                        if (objD == value || (objD != null && objD.equals(value))) {
                        }
                    }
                }
                break;
            default:
                if (dVar.g(obj) >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f16613a) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        break;
                    }
                }
                break;
            default:
                b bVarE = this.f16614b.e();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!bVarE.containsKey(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f16613a) {
        }
        return k.d.l(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i10 = this.f16613a;
        k.d dVar = this.f16614b;
        switch (i10) {
            case 0:
                int iHashCode = 0;
                for (int iF = dVar.f() - 1; iF >= 0; iF--) {
                    Object objD = dVar.d(iF, 0);
                    Object objD2 = dVar.d(iF, 1);
                    iHashCode += (objD == null ? 0 : objD.hashCode()) ^ (objD2 == null ? 0 : objD2.hashCode());
                }
                return iHashCode;
            default:
                int iHashCode2 = 0;
                for (int iF2 = dVar.f() - 1; iF2 >= 0; iF2--) {
                    Object objD3 = dVar.d(iF2, 0);
                    iHashCode2 += objD3 == null ? 0 : objD3.hashCode();
                }
                return iHashCode2;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i10 = this.f16613a;
        k.d dVar = this.f16614b;
        switch (i10) {
            case 0:
                if (dVar.f() == 0) {
                }
                break;
            default:
                if (dVar.f() == 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f16613a;
        k.d dVar = this.f16614b;
        switch (i10) {
            case 0:
                return new i(dVar);
            default:
                return new g(dVar, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f16613a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                k.d dVar = this.f16614b;
                int iG = dVar.g(obj);
                if (iG < 0) {
                    return false;
                }
                dVar.j(iG);
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f16613a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                b bVarE = this.f16614b.e();
                int i10 = bVarE.f16626d;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    bVarE.remove(it.next());
                }
                return i10 != bVarE.f16626d;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f16613a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return k.d.n(this.f16614b.e(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i10 = this.f16613a;
        k.d dVar = this.f16614b;
        switch (i10) {
        }
        return dVar.f();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f16613a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f16614b.o(0, objArr);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f16613a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                k.d dVar = this.f16614b;
                int iF = dVar.f();
                Object[] objArr = new Object[iF];
                for (int i10 = 0; i10 < iF; i10++) {
                    objArr[i10] = dVar.d(i10, 0);
                }
                return objArr;
        }
    }
}
