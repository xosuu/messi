package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Collection, Set {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f16586h = new int[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object[] f16587q = new Object[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Object[] f16588s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f16589t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static Object[] f16590u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f16591v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16593b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16594d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f16595f;

    public c(int i10) {
        if (i10 == 0) {
            this.f16592a = f16586h;
            this.f16593b = f16587q;
        } else {
            b(i10);
        }
        this.f16594d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (c.class) {
                try {
                    if (f16591v < 10) {
                        objArr[0] = f16590u;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f16590u = objArr;
                        f16591v++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (c.class) {
                try {
                    if (f16589t < 10) {
                        objArr[0] = f16588s;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f16588s = objArr;
                        f16589t++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i10;
        int iD;
        if (obj == null) {
            iD = e();
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            return false;
        }
        int i11 = ~iD;
        int i12 = this.f16594d;
        int[] iArr = this.f16592a;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.f16593b;
            b(i13);
            int[] iArr2 = this.f16592a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f16593b, 0, objArr.length);
            }
            c(iArr, objArr, this.f16594d);
        }
        int i14 = this.f16594d;
        if (i11 < i14) {
            int[] iArr3 = this.f16592a;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.f16593b;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f16594d - i11);
        }
        this.f16592a[i11] = i10;
        this.f16593b[i11] = obj;
        this.f16594d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int size = collection.size() + this.f16594d;
        int[] iArr = this.f16592a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f16593b;
            b(size);
            int i10 = this.f16594d;
            if (i10 > 0) {
                System.arraycopy(iArr, 0, this.f16592a, 0, i10);
                System.arraycopy(objArr, 0, this.f16593b, 0, this.f16594d);
            }
            c(iArr, objArr, this.f16594d);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i10) {
        if (i10 == 8) {
            synchronized (c.class) {
                try {
                    Object[] objArr = f16590u;
                    if (objArr != null) {
                        this.f16593b = objArr;
                        f16590u = (Object[]) objArr[0];
                        this.f16592a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f16591v--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (c.class) {
                try {
                    Object[] objArr2 = f16588s;
                    if (objArr2 != null) {
                        this.f16593b = objArr2;
                        f16588s = (Object[]) objArr2[0];
                        this.f16592a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f16589t--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f16592a = new int[i10];
        this.f16593b = new Object[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f16594d;
        if (i10 != 0) {
            c(this.f16592a, this.f16593b, i10);
            this.f16592a = f16586h;
            this.f16593b = f16587q;
            this.f16594d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f16594d;
        if (i11 == 0) {
            return -1;
        }
        int iA = d.a(i11, i10, this.f16592a);
        if (iA < 0 || obj.equals(this.f16593b[iA])) {
            return iA;
        }
        int i12 = iA + 1;
        while (i12 < i11 && this.f16592a[i12] == i10) {
            if (obj.equals(this.f16593b[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iA - 1; i13 >= 0 && this.f16592a[i13] == i10; i13--) {
            if (obj.equals(this.f16593b[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int e() {
        int i10 = this.f16594d;
        if (i10 == 0) {
            return -1;
        }
        int iA = d.a(i10, 0, this.f16592a);
        if (iA < 0 || this.f16593b[iA] == null) {
            return iA;
        }
        int i11 = iA + 1;
        while (i11 < i10 && this.f16592a[i11] == 0) {
            if (this.f16593b[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iA - 1; i12 >= 0 && this.f16592a[i12] == 0; i12--) {
            if (this.f16593b[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f16594d != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f16594d; i10++) {
                try {
                    if (!set.contains(this.f16593b[i10])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public final void f(int i10) {
        Object[] objArr = this.f16593b;
        Object obj = objArr[i10];
        int i11 = this.f16594d;
        if (i11 <= 1) {
            c(this.f16592a, objArr, i11);
            this.f16592a = f16586h;
            this.f16593b = f16587q;
            this.f16594d = 0;
            return;
        }
        int[] iArr = this.f16592a;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f16594d = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.f16593b;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f16594d - i10);
            }
            this.f16593b[this.f16594d] = null;
            return;
        }
        b(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f16594d--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.f16592a, 0, i10);
            System.arraycopy(objArr, 0, this.f16593b, 0, i10);
        }
        int i14 = this.f16594d;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.f16592a, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.f16593b, i10, this.f16594d - i10);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f16592a;
        int i10 = this.f16594d;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    public final int indexOf(Object obj) {
        return obj == null ? e() : d(obj.hashCode(), obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f16594d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        if (this.f16595f == null) {
            this.f16595f = new a(1, this);
        }
        a aVar = this.f16595f;
        if (((h) aVar.f14502b) == null) {
            aVar.f14502b = new h(aVar, 1);
        }
        return ((h) aVar.f14502b).iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        f(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z9 = false;
        for (int i10 = this.f16594d - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.f16593b[i10])) {
                f(i10);
                z9 = true;
            }
        }
        return z9;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f16594d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i10 = this.f16594d;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.f16593b, 0, objArr, 0, i10);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16594d * 14);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16594d; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object obj = this.f16593b[i10];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f16594d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f16594d);
        }
        System.arraycopy(this.f16593b, 0, objArr, 0, this.f16594d);
        int length = objArr.length;
        int i10 = this.f16594d;
        if (length > i10) {
            objArr[i10] = null;
        }
        return objArr;
    }
}
