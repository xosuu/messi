package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class bz0 extends wy0 implements List, RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zy0 f3132b = new zy0(0, wz0.f10382h);

    public static wz0 j(int i10, Object[] objArr) {
        return i10 == 0 ? wz0.f10382h : new wz0(i10, objArr);
    }

    public static bz0 k(Collection collection) {
        if (!(collection instanceof wy0)) {
            Object[] array = collection.toArray();
            int length = array.length;
            tp1.a0(length, array);
            return j(length, array);
        }
        bz0 bz0VarE = ((wy0) collection).e();
        if (!bz0VarE.g()) {
            return bz0VarE;
        }
        Object[] array2 = bz0VarE.toArray(wy0.f10380a);
        return j(array2.length, array2);
    }

    public static wz0 l(Object[] objArr) {
        if (objArr.length == 0) {
            return wz0.f10382h;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        tp1.a0(length, objArr2);
        return j(length, objArr2);
    }

    public static wz0 m() {
        return wz0.f10382h;
    }

    public static wz0 n(Object obj) {
        Object[] objArr = {obj};
        tp1.a0(1, objArr);
        return j(1, objArr);
    }

    public static wz0 o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        tp1.a0(2, objArr);
        return j(2, objArr);
    }

    public static wz0 p(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        tp1.a0(3, objArr);
        return j(3, objArr);
    }

    public static wz0 q(Long l9, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l9, l10, l11, l12, l13};
        tp1.a0(5, objArr);
        return j(5, objArr);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public int b(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // com.google.android.gms.internal.ads.wy0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final bz0 e() {
        return this;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (tp1.P(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                zy0 zy0VarListIterator = listIterator(0);
                Iterator it = list.iterator();
                while (true) {
                    if (zy0VarListIterator.hasNext()) {
                        if (!it.hasNext() || !tp1.P(zy0VarListIterator.next(), it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final m01 f() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i10 = 0; i10 < size; i10++) {
            iHashCode = (iHashCode * 31) + get(i10).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public bz0 subList(int i10, int i11) {
        en1.J0(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? wz0.f10382h : new az0(this, i10, i12);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final zy0 listIterator(int i10) {
        en1.j0(i10, size());
        return isEmpty() ? f3132b : new zy0(i10, this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }
}
