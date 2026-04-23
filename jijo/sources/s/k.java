package s;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Object[] f16620f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f16621h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Object[] f16622q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f16623s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f16624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f16625b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16626d;

    public k() {
        this.f16624a = d.f16596a;
        this.f16625b = d.f16597b;
        this.f16626d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (k.class) {
                try {
                    if (f16623s < 10) {
                        objArr[0] = f16622q;
                        objArr[1] = iArr;
                        for (int i11 = (i10 << 1) - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f16622q = objArr;
                        f16623s++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (k.class) {
                try {
                    if (f16621h < 10) {
                        objArr[0] = f16620f;
                        objArr[1] = iArr;
                        for (int i12 = (i10 << 1) - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        f16620f = objArr;
                        f16621h++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i10) {
        if (i10 == 8) {
            synchronized (k.class) {
                try {
                    Object[] objArr = f16622q;
                    if (objArr != null) {
                        this.f16625b = objArr;
                        f16622q = (Object[]) objArr[0];
                        this.f16624a = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f16623s--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i10 == 4) {
            synchronized (k.class) {
                try {
                    Object[] objArr2 = f16620f;
                    if (objArr2 != null) {
                        this.f16625b = objArr2;
                        f16620f = (Object[]) objArr2[0];
                        this.f16624a = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f16621h--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f16624a = new int[i10];
        this.f16625b = new Object[i10 << 1];
    }

    public final void b(int i10) {
        int i11 = this.f16626d;
        int[] iArr = this.f16624a;
        if (iArr.length < i10) {
            Object[] objArr = this.f16625b;
            a(i10);
            if (this.f16626d > 0) {
                System.arraycopy(iArr, 0, this.f16624a, 0, i11);
                System.arraycopy(objArr, 0, this.f16625b, 0, i11 << 1);
            }
            c(iArr, objArr, i11);
        }
        if (this.f16626d != i11) {
            throw new ConcurrentModificationException();
        }
    }

    public final void clear() {
        int i10 = this.f16626d;
        if (i10 > 0) {
            int[] iArr = this.f16624a;
            Object[] objArr = this.f16625b;
            this.f16624a = d.f16596a;
            this.f16625b = d.f16597b;
            this.f16626d = 0;
            c(iArr, objArr, i10);
        }
        if (this.f16626d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public final int d(int i10, Object obj) {
        int i11 = this.f16626d;
        if (i11 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i11, i10, this.f16624a);
            if (iA < 0 || obj.equals(this.f16625b[iA << 1])) {
                return iA;
            }
            int i12 = iA + 1;
            while (i12 < i11 && this.f16624a[i12] == i10) {
                if (obj.equals(this.f16625b[i12 << 1])) {
                    return i12;
                }
                i12++;
            }
            for (int i13 = iA - 1; i13 >= 0 && this.f16624a[i13] == i10; i13--) {
                if (obj.equals(this.f16625b[i13 << 1])) {
                    return i13;
                }
            }
            return ~i12;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int e(Object obj) {
        return obj == null ? f() : d(obj.hashCode(), obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f16626d != kVar.f16626d) {
                return false;
            }
            for (int i10 = 0; i10 < this.f16626d; i10++) {
                try {
                    Object objH = h(i10);
                    Object objJ = j(i10);
                    Object orDefault = kVar.getOrDefault(objH, null);
                    if (objJ == null) {
                        if (orDefault != null || !kVar.containsKey(objH)) {
                            return false;
                        }
                    } else if (!objJ.equals(orDefault)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f16626d != map.size()) {
                return false;
            }
            for (int i11 = 0; i11 < this.f16626d; i11++) {
                try {
                    Object objH2 = h(i11);
                    Object objJ2 = j(i11);
                    Object obj2 = map.get(objH2);
                    if (objJ2 == null) {
                        if (obj2 != null || !map.containsKey(objH2)) {
                            return false;
                        }
                    } else if (!objJ2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public final int f() {
        int i10 = this.f16626d;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iA = d.a(i10, 0, this.f16624a);
            if (iA < 0 || this.f16625b[iA << 1] == null) {
                return iA;
            }
            int i11 = iA + 1;
            while (i11 < i10 && this.f16624a[i11] == 0) {
                if (this.f16625b[i11 << 1] == null) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iA - 1; i12 >= 0 && this.f16624a[i12] == 0; i12--) {
                if (this.f16625b[i12 << 1] == null) {
                    return i12;
                }
            }
            return ~i11;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public final int g(Object obj) {
        int i10 = this.f16626d * 2;
        Object[] objArr = this.f16625b;
        if (obj == null) {
            for (int i11 = 1; i11 < i10; i11 += 2) {
                if (objArr[i11] == null) {
                    return i11 >> 1;
                }
            }
            return -1;
        }
        for (int i12 = 1; i12 < i10; i12 += 2) {
            if (obj.equals(objArr[i12])) {
                return i12 >> 1;
            }
        }
        return -1;
    }

    public final Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iE = e(obj);
        return iE >= 0 ? this.f16625b[(iE << 1) + 1] : obj2;
    }

    public final Object h(int i10) {
        return this.f16625b[i10 << 1];
    }

    public final int hashCode() {
        int[] iArr = this.f16624a;
        Object[] objArr = this.f16625b;
        int i10 = this.f16626d;
        int i11 = 1;
        int i12 = 0;
        int iHashCode = 0;
        while (i12 < i10) {
            Object obj = objArr[i11];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i12];
            i12++;
            i11 += 2;
        }
        return iHashCode;
    }

    public final Object i(int i10) {
        Object[] objArr = this.f16625b;
        int i11 = i10 << 1;
        Object obj = objArr[i11 + 1];
        int i12 = this.f16626d;
        int i13 = 0;
        if (i12 <= 1) {
            c(this.f16624a, objArr, i12);
            this.f16624a = d.f16596a;
            this.f16625b = d.f16597b;
        } else {
            int i14 = i12 - 1;
            int[] iArr = this.f16624a;
            if (iArr.length <= 8 || i12 >= iArr.length / 3) {
                if (i10 < i14) {
                    int i15 = i10 + 1;
                    int i16 = i14 - i10;
                    System.arraycopy(iArr, i15, iArr, i10, i16);
                    Object[] objArr2 = this.f16625b;
                    System.arraycopy(objArr2, i15 << 1, objArr2, i11, i16 << 1);
                }
                Object[] objArr3 = this.f16625b;
                int i17 = i14 << 1;
                objArr3[i17] = null;
                objArr3[i17 + 1] = null;
            } else {
                a(i12 > 8 ? i12 + (i12 >> 1) : 8);
                if (i12 != this.f16626d) {
                    throw new ConcurrentModificationException();
                }
                if (i10 > 0) {
                    System.arraycopy(iArr, 0, this.f16624a, 0, i10);
                    System.arraycopy(objArr, 0, this.f16625b, 0, i11);
                }
                if (i10 < i14) {
                    int i18 = i10 + 1;
                    int i19 = i14 - i10;
                    System.arraycopy(iArr, i18, this.f16624a, i10, i19);
                    System.arraycopy(objArr, i18 << 1, this.f16625b, i11, i19 << 1);
                }
            }
            i13 = i14;
        }
        if (i12 != this.f16626d) {
            throw new ConcurrentModificationException();
        }
        this.f16626d = i13;
        return obj;
    }

    public final boolean isEmpty() {
        return this.f16626d <= 0;
    }

    public final Object j(int i10) {
        return this.f16625b[(i10 << 1) + 1];
    }

    public final Object put(Object obj, Object obj2) {
        int i10;
        int iD;
        int i11 = this.f16626d;
        if (obj == null) {
            iD = f();
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iD = d(iHashCode, obj);
        }
        if (iD >= 0) {
            int i12 = (iD << 1) + 1;
            Object[] objArr = this.f16625b;
            Object obj3 = objArr[i12];
            objArr[i12] = obj2;
            return obj3;
        }
        int i13 = ~iD;
        int[] iArr = this.f16624a;
        if (i11 >= iArr.length) {
            int i14 = 8;
            if (i11 >= 8) {
                i14 = (i11 >> 1) + i11;
            } else if (i11 < 4) {
                i14 = 4;
            }
            Object[] objArr2 = this.f16625b;
            a(i14);
            if (i11 != this.f16626d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f16624a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f16625b, 0, objArr2.length);
            }
            c(iArr, objArr2, i11);
        }
        if (i13 < i11) {
            int[] iArr3 = this.f16624a;
            int i15 = i13 + 1;
            System.arraycopy(iArr3, i13, iArr3, i15, i11 - i13);
            Object[] objArr3 = this.f16625b;
            System.arraycopy(objArr3, i13 << 1, objArr3, i15 << 1, (this.f16626d - i13) << 1);
        }
        int i16 = this.f16626d;
        if (i11 == i16) {
            int[] iArr4 = this.f16624a;
            if (i13 < iArr4.length) {
                iArr4[i13] = i10;
                Object[] objArr4 = this.f16625b;
                int i17 = i13 << 1;
                objArr4[i17] = obj;
                objArr4[i17 + 1] = obj2;
                this.f16626d = i16 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object orDefault = getOrDefault(obj, null);
        return orDefault == null ? put(obj, obj2) : orDefault;
    }

    public final Object remove(Object obj) {
        int iE = e(obj);
        if (iE >= 0) {
            return i(iE);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return null;
        }
        int i10 = (iE << 1) + 1;
        Object[] objArr = this.f16625b;
        Object obj3 = objArr[i10];
        objArr[i10] = obj2;
        return obj3;
    }

    public final int size() {
        return this.f16626d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f16626d * 28);
        sb.append('{');
        for (int i10 = 0; i10 < this.f16626d; i10++) {
            if (i10 > 0) {
                sb.append(", ");
            }
            Object objH = h(i10);
            if (objH != this) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objJ = j(i10);
            if (objJ != this) {
                sb.append(objJ);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public k(k kVar) {
        this();
        if (kVar != null) {
            int i10 = kVar.f16626d;
            b(i10);
            if (this.f16626d != 0) {
                for (int i11 = 0; i11 < i10; i11++) {
                    put(kVar.h(i11), kVar.j(i11));
                }
            } else if (i10 > 0) {
                System.arraycopy(kVar.f16624a, 0, this.f16624a, 0, i10);
                System.arraycopy(kVar.f16625b, 0, this.f16625b, 0, i10 << 1);
                this.f16626d = i10;
            }
        }
    }

    public final boolean remove(Object obj, Object obj2) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (obj2 != objJ && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        i(iE);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iE = e(obj);
        if (iE < 0) {
            return false;
        }
        Object objJ = j(iE);
        if (objJ != obj2 && (obj2 == null || !obj2.equals(objJ))) {
            return false;
        }
        int i10 = (iE << 1) + 1;
        Object[] objArr = this.f16625b;
        Object obj4 = objArr[i10];
        objArr[i10] = obj3;
        return true;
    }
}
