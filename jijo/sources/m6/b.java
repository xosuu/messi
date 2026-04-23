package m6;

import g4.a0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object[] f15774f = new Object[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15776b = f15774f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15777d;

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a0.f(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        c(collection.size() + this.f15777d);
        b(e(this.f15775a + this.f15777d), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        c(this.f15777d + 1);
        int length = this.f15775a;
        if (length == 0) {
            Object[] objArr = this.f15776b;
            a0.f(objArr, "<this>");
            length = objArr.length;
        }
        int i10 = length - 1;
        this.f15775a = i10;
        this.f15776b[i10] = obj;
        this.f15777d++;
    }

    public final void addLast(Object obj) {
        c(this.f15777d + 1);
        this.f15776b[e(this.f15775a + this.f15777d)] = obj;
        this.f15777d++;
    }

    public final void b(int i10, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f15776b.length;
        while (i10 < length && it.hasNext()) {
            this.f15776b[i10] = it.next();
            i10++;
        }
        int i11 = this.f15775a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f15776b[i12] = it.next();
        }
        this.f15777d = collection.size() + this.f15777d;
    }

    public final void c(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f15776b;
        if (i10 <= objArr.length) {
            return;
        }
        if (objArr == f15774f) {
            if (i10 < 10) {
                i10 = 10;
            }
            this.f15776b = new Object[i10];
            return;
        }
        int length = objArr.length;
        int i11 = length + (length >> 1);
        if (i11 - i10 < 0) {
            i11 = i10;
        }
        if (i11 - 2147483639 > 0) {
            i11 = i10 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i11];
        c.H(0, this.f15775a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.f15776b;
        int length2 = objArr3.length;
        int i12 = this.f15775a;
        c.H(length2 - i12, 0, i12, objArr3, objArr2);
        this.f15775a = 0;
        this.f15776b = objArr2;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iE = e(this.f15775a + this.f15777d);
        int i10 = this.f15775a;
        if (i10 < iE) {
            Object[] objArr = this.f15776b;
            a0.f(objArr, "<this>");
            Arrays.fill(objArr, i10, iE, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f15776b;
            Arrays.fill(objArr2, this.f15775a, objArr2.length, (Object) null);
            Object[] objArr3 = this.f15776b;
            a0.f(objArr3, "<this>");
            Arrays.fill(objArr3, 0, iE, (Object) null);
        }
        this.f15775a = 0;
        this.f15777d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i10) {
        a0.f(this.f15776b, "<this>");
        if (i10 == r0.length - 1) {
            return 0;
        }
        return i10 + 1;
    }

    public final int e(int i10) {
        Object[] objArr = this.f15776b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        int i11 = this.f15777d;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(l.a0.f("index: ", i10, ", size: ", i11));
        }
        return this.f15776b[e(this.f15775a + i10)];
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i10;
        int iE = e(this.f15775a + this.f15777d);
        int length = this.f15775a;
        if (length < iE) {
            while (length < iE) {
                if (a0.b(obj, this.f15776b[length])) {
                    i10 = this.f15775a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iE) {
            return -1;
        }
        int length2 = this.f15776b.length;
        while (true) {
            if (length >= length2) {
                for (int i11 = 0; i11 < iE; i11++) {
                    if (a0.b(obj, this.f15776b[i11])) {
                        length = i11 + this.f15776b.length;
                        i10 = this.f15775a;
                    }
                }
                return -1;
            }
            if (a0.b(obj, this.f15776b[length])) {
                i10 = this.f15775a;
                break;
            }
            length++;
        }
        return length - i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f15777d == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i10;
        int iE = e(this.f15775a + this.f15777d);
        int i11 = this.f15775a;
        if (i11 < iE) {
            length = iE - 1;
            if (i11 <= length) {
                while (!a0.b(obj, this.f15776b[length])) {
                    if (length != i11) {
                        length--;
                    }
                }
                i10 = this.f15775a;
                return length - i10;
            }
            return -1;
        }
        if (i11 > iE) {
            int i12 = iE - 1;
            while (true) {
                if (-1 >= i12) {
                    Object[] objArr = this.f15776b;
                    a0.f(objArr, "<this>");
                    length = objArr.length - 1;
                    int i13 = this.f15775a;
                    if (i13 <= length) {
                        while (!a0.b(obj, this.f15776b[length])) {
                            if (length != i13) {
                                length--;
                            }
                        }
                        i10 = this.f15775a;
                    }
                } else {
                    if (a0.b(obj, this.f15776b[i12])) {
                        length = i12 + this.f15776b.length;
                        i10 = this.f15775a;
                        break;
                    }
                    i12--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iE;
        a0.f(collection, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f15776b.length != 0) {
            int iE2 = e(this.f15775a + this.f15777d);
            int i10 = this.f15775a;
            if (i10 < iE2) {
                iE = i10;
                while (i10 < iE2) {
                    Object obj = this.f15776b[i10];
                    if (!collection.contains(obj)) {
                        this.f15776b[iE] = obj;
                        iE++;
                    } else {
                        z9 = true;
                    }
                    i10++;
                }
                Object[] objArr = this.f15776b;
                a0.f(objArr, "<this>");
                Arrays.fill(objArr, iE, iE2, (Object) null);
            } else {
                int length = this.f15776b.length;
                int i11 = i10;
                boolean z10 = false;
                while (i10 < length) {
                    Object[] objArr2 = this.f15776b;
                    Object obj2 = objArr2[i10];
                    objArr2[i10] = null;
                    if (!collection.contains(obj2)) {
                        this.f15776b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iE = e(i11);
                for (int i12 = 0; i12 < iE2; i12++) {
                    Object[] objArr3 = this.f15776b;
                    Object obj3 = objArr3[i12];
                    objArr3[i12] = null;
                    if (!collection.contains(obj3)) {
                        this.f15776b[iE] = obj3;
                        iE = d(iE);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                int length2 = iE - this.f15775a;
                if (length2 < 0) {
                    length2 += this.f15776b.length;
                }
                this.f15777d = length2;
            }
        }
        return z9;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f15776b;
        int i10 = this.f15775a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f15775a = d(i10);
        this.f15777d--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iE = e((size() - 1) + this.f15775a);
        Object[] objArr = this.f15776b;
        Object obj = objArr[iE];
        objArr[iE] = null;
        this.f15777d--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iE;
        a0.f(collection, "elements");
        boolean z9 = false;
        z9 = false;
        z9 = false;
        if (!isEmpty() && this.f15776b.length != 0) {
            int iE2 = e(this.f15775a + this.f15777d);
            int i10 = this.f15775a;
            if (i10 < iE2) {
                iE = i10;
                while (i10 < iE2) {
                    Object obj = this.f15776b[i10];
                    if (collection.contains(obj)) {
                        this.f15776b[iE] = obj;
                        iE++;
                    } else {
                        z9 = true;
                    }
                    i10++;
                }
                Object[] objArr = this.f15776b;
                a0.f(objArr, "<this>");
                Arrays.fill(objArr, iE, iE2, (Object) null);
            } else {
                int length = this.f15776b.length;
                int i11 = i10;
                boolean z10 = false;
                while (i10 < length) {
                    Object[] objArr2 = this.f15776b;
                    Object obj2 = objArr2[i10];
                    objArr2[i10] = null;
                    if (collection.contains(obj2)) {
                        this.f15776b[i11] = obj2;
                        i11++;
                    } else {
                        z10 = true;
                    }
                    i10++;
                }
                iE = e(i11);
                for (int i12 = 0; i12 < iE2; i12++) {
                    Object[] objArr3 = this.f15776b;
                    Object obj3 = objArr3[i12];
                    objArr3[i12] = null;
                    if (collection.contains(obj3)) {
                        this.f15776b[iE] = obj3;
                        iE = d(iE);
                    } else {
                        z10 = true;
                    }
                }
                z9 = z10;
            }
            if (z9) {
                int length2 = iE - this.f15775a;
                if (length2 < 0) {
                    length2 += this.f15776b.length;
                }
                this.f15777d = length2;
            }
        }
        return z9;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int i11 = this.f15777d;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(l.a0.f("index: ", i10, ", size: ", i11));
        }
        int iE = e(this.f15775a + i10);
        Object[] objArr = this.f15776b;
        Object obj2 = objArr[iE];
        objArr[iE] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        a0.f(objArr, "array");
        int length = objArr.length;
        int i10 = this.f15777d;
        if (length < i10) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i10);
            a0.d(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>");
            objArr = (Object[]) objNewInstance;
        }
        int iE = e(this.f15775a + this.f15777d);
        int i11 = this.f15775a;
        if (i11 < iE) {
            c.H(0, i11, iE, this.f15776b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f15776b;
            c.H(0, this.f15775a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.f15776b;
            c.H(objArr3.length - this.f15775a, 0, iE, objArr3, objArr);
        }
        int length2 = objArr.length;
        int i12 = this.f15777d;
        if (length2 > i12) {
            objArr[i12] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int length;
        int i11 = this.f15777d;
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(l.a0.f("index: ", i10, ", size: ", i11));
        }
        if (i10 == i11) {
            addLast(obj);
            return;
        }
        if (i10 == 0) {
            addFirst(obj);
            return;
        }
        c(i11 + 1);
        int iE = e(this.f15775a + i10);
        int i12 = this.f15777d;
        if (i10 < ((i12 + 1) >> 1)) {
            if (iE == 0) {
                Object[] objArr = this.f15776b;
                a0.f(objArr, "<this>");
                iE = objArr.length;
            }
            int i13 = iE - 1;
            int i14 = this.f15775a;
            if (i14 == 0) {
                Object[] objArr2 = this.f15776b;
                a0.f(objArr2, "<this>");
                length = objArr2.length - 1;
            } else {
                length = i14 - 1;
            }
            int i15 = this.f15775a;
            if (i13 >= i15) {
                Object[] objArr3 = this.f15776b;
                objArr3[length] = objArr3[i15];
                c.H(i15, i15 + 1, i13 + 1, objArr3, objArr3);
            } else {
                Object[] objArr4 = this.f15776b;
                c.H(i15 - 1, i15, objArr4.length, objArr4, objArr4);
                Object[] objArr5 = this.f15776b;
                objArr5[objArr5.length - 1] = objArr5[0];
                c.H(0, 1, i13 + 1, objArr5, objArr5);
            }
            this.f15776b[i13] = obj;
            this.f15775a = length;
        } else {
            int iE2 = e(this.f15775a + i12);
            if (iE < iE2) {
                Object[] objArr6 = this.f15776b;
                c.H(iE + 1, iE, iE2, objArr6, objArr6);
            } else {
                Object[] objArr7 = this.f15776b;
                c.H(1, 0, iE2, objArr7, objArr7);
                Object[] objArr8 = this.f15776b;
                objArr8[0] = objArr8[objArr8.length - 1];
                c.H(iE + 1, iE, objArr8.length - 1, objArr8, objArr8);
            }
            this.f15776b[iE] = obj;
        }
        this.f15777d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a0.f(collection, "elements");
        int i11 = this.f15777d;
        if (i10 >= 0 && i10 <= i11) {
            if (collection.isEmpty()) {
                return false;
            }
            int i12 = this.f15777d;
            if (i10 == i12) {
                return addAll(collection);
            }
            c(collection.size() + i12);
            int iE = e(this.f15775a + this.f15777d);
            int iE2 = e(this.f15775a + i10);
            int size = collection.size();
            if (i10 < ((this.f15777d + 1) >> 1)) {
                int i13 = this.f15775a;
                int length = i13 - size;
                if (iE2 < i13) {
                    Object[] objArr = this.f15776b;
                    c.H(length, i13, objArr.length, objArr, objArr);
                    if (size >= iE2) {
                        Object[] objArr2 = this.f15776b;
                        c.H(objArr2.length - size, 0, iE2, objArr2, objArr2);
                    } else {
                        Object[] objArr3 = this.f15776b;
                        c.H(objArr3.length - size, 0, size, objArr3, objArr3);
                        Object[] objArr4 = this.f15776b;
                        c.H(0, size, iE2, objArr4, objArr4);
                    }
                } else if (length >= 0) {
                    Object[] objArr5 = this.f15776b;
                    c.H(length, i13, iE2, objArr5, objArr5);
                } else {
                    Object[] objArr6 = this.f15776b;
                    length += objArr6.length;
                    int i14 = iE2 - i13;
                    int length2 = objArr6.length - length;
                    if (length2 >= i14) {
                        c.H(length, i13, iE2, objArr6, objArr6);
                    } else {
                        c.H(length, i13, i13 + length2, objArr6, objArr6);
                        Object[] objArr7 = this.f15776b;
                        c.H(0, this.f15775a + length2, iE2, objArr7, objArr7);
                    }
                }
                this.f15775a = length;
                int length3 = iE2 - size;
                if (length3 < 0) {
                    length3 += this.f15776b.length;
                }
                b(length3, collection);
            } else {
                int i15 = iE2 + size;
                if (iE2 < iE) {
                    int i16 = size + iE;
                    Object[] objArr8 = this.f15776b;
                    if (i16 <= objArr8.length) {
                        c.H(i15, iE2, iE, objArr8, objArr8);
                    } else if (i15 >= objArr8.length) {
                        c.H(i15 - objArr8.length, iE2, iE, objArr8, objArr8);
                    } else {
                        int length4 = iE - (i16 - objArr8.length);
                        c.H(0, length4, iE, objArr8, objArr8);
                        Object[] objArr9 = this.f15776b;
                        c.H(i15, iE2, length4, objArr9, objArr9);
                    }
                } else {
                    Object[] objArr10 = this.f15776b;
                    c.H(size, 0, iE, objArr10, objArr10);
                    Object[] objArr11 = this.f15776b;
                    if (i15 >= objArr11.length) {
                        c.H(i15 - objArr11.length, iE2, objArr11.length, objArr11, objArr11);
                    } else {
                        c.H(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                        Object[] objArr12 = this.f15776b;
                        c.H(i15, iE2, objArr12.length - size, objArr12, objArr12);
                    }
                }
                b(iE2, collection);
            }
            return true;
        }
        throw new IndexOutOfBoundsException(l.a0.f("index: ", i10, ", size: ", i11));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.f15777d]);
    }
}
