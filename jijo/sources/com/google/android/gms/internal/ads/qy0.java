package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class qy0 extends AbstractMap implements Serializable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Object f8324v = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Object f8325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient int[] f8326b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Object[] f8327d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Object[] f8328f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public transient int f8329h = Math.min(Math.max(8, 1), 1073741823);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public transient int f8330q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public transient ny0 f8331s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public transient ny0 f8332t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public transient ky0 f8333u;

    public final int[] a() {
        int[] iArr = this.f8326b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] b() {
        Object[] objArr = this.f8327d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] c() {
        Object[] objArr = this.f8328f;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.f8329h += 32;
        Map mapD = d();
        if (mapD != null) {
            this.f8329h = Math.min(Math.max(size(), 3), 1073741823);
            mapD.clear();
            this.f8325a = null;
            this.f8330q = 0;
            return;
        }
        Arrays.fill(b(), 0, this.f8330q, (Object) null);
        Arrays.fill(c(), 0, this.f8330q, (Object) null);
        Object obj = this.f8325a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(a(), 0, this.f8330q, 0);
        this.f8330q = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapD = d();
        return mapD != null ? mapD.containsKey(obj) : h(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f8330q; i10++) {
            if (tp1.P(obj, c()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final Map d() {
        Object obj = this.f8325a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f8325a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int size = size();
        int i12 = size - 1;
        if (i10 >= i12) {
            objArrB[i10] = null;
            objArrC[i10] = null;
            iArrA[i10] = 0;
            return;
        }
        int i13 = i10 + 1;
        Object obj2 = objArrB[i12];
        objArrB[i10] = obj2;
        objArrC[i10] = objArrC[i12];
        objArrB[i12] = null;
        objArrC[i12] = null;
        iArrA[i10] = iArrA[i12];
        iArrA[i12] = 0;
        int iS = tp1.S(obj2) & i11;
        int iK0 = en1.k0(iS, obj);
        if (iK0 == size) {
            en1.B0(iS, i13, obj);
            return;
        }
        while (true) {
            int i14 = iK0 - 1;
            int i15 = iArrA[i14];
            int i16 = i15 & i11;
            if (i16 == size) {
                iArrA[i14] = (i15 & (~i11)) | (i11 & i13);
                return;
            }
            iK0 = i16;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        ny0 ny0Var = this.f8332t;
        if (ny0Var != null) {
            return ny0Var;
        }
        ny0 ny0Var2 = new ny0(this, 0);
        this.f8332t = ny0Var2;
        return ny0Var2;
    }

    public final boolean f() {
        return this.f8325a == null;
    }

    public final int g() {
        return (1 << (this.f8329h & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.get(obj);
        }
        int iH = h(obj);
        if (iH == -1) {
            return null;
        }
        return c()[iH];
    }

    public final int h(Object obj) {
        if (f()) {
            return -1;
        }
        int iS = tp1.S(obj);
        int iG = g();
        Object obj2 = this.f8325a;
        Objects.requireNonNull(obj2);
        int iK0 = en1.k0(iS & iG, obj2);
        if (iK0 != 0) {
            int i10 = ~iG;
            int i11 = iS & i10;
            do {
                int i12 = iK0 - 1;
                int i13 = a()[i12];
                if ((i13 & i10) == i11 && tp1.P(obj, b()[i12])) {
                    return i12;
                }
                iK0 = i13 & iG;
            } while (iK0 != 0);
        }
        return -1;
    }

    public final int i(int i10, int i11, int i12, int i13) {
        int i14 = i11 - 1;
        Object objV0 = en1.v0(i11);
        if (i13 != 0) {
            en1.B0(i12 & i14, i13 + 1, objV0);
        }
        Object obj = this.f8325a;
        Objects.requireNonNull(obj);
        int[] iArrA = a();
        for (int i15 = 0; i15 <= i10; i15++) {
            int iK0 = en1.k0(i15, obj);
            while (iK0 != 0) {
                int i16 = iK0 - 1;
                int i17 = iArrA[i16];
                int i18 = ((~i10) & i17) | i15;
                int i19 = i18 & i14;
                int iK02 = en1.k0(i19, objV0);
                en1.B0(i19, iK0, objV0);
                iArrA[i16] = ((~i14) & i18) | (iK02 & i14);
                iK0 = i17 & i10;
            }
        }
        this.f8325a = objV0;
        this.f8329h = ((32 - Integer.numberOfLeadingZeros(i14)) & 31) | (this.f8329h & (-32));
        return i14;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(Object obj) {
        if (!f()) {
            int iG = g();
            Object obj2 = this.f8325a;
            Objects.requireNonNull(obj2);
            int iC0 = en1.c0(obj, null, iG, obj2, a(), b(), null);
            if (iC0 != -1) {
                Object obj3 = c()[iC0];
                e(iC0, iG);
                this.f8330q--;
                this.f8329h += 32;
                return obj3;
            }
        }
        return f8324v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        ny0 ny0Var = this.f8331s;
        if (ny0Var != null) {
            return ny0Var;
        }
        ny0 ny0Var2 = new ny0(this, 1);
        this.f8331s = ny0Var2;
        return ny0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int iMin;
        int i10 = -1;
        if (f()) {
            en1.M0("Arrays already allocated", f());
            int i11 = this.f8329h;
            int iMax = Math.max(i11 + 1, 2);
            int iHighestOneBit = Integer.highestOneBit(iMax);
            if (iMax > iHighestOneBit && (iHighestOneBit = iHighestOneBit + iHighestOneBit) <= 0) {
                iHighestOneBit = 1073741824;
            }
            int iMax2 = Math.max(4, iHighestOneBit);
            this.f8325a = en1.v0(iMax2);
            this.f8329h = ((32 - Integer.numberOfLeadingZeros(iMax2 - 1)) & 31) | (this.f8329h & (-32));
            this.f8326b = new int[i11];
            this.f8327d = new Object[i11];
            this.f8328f = new Object[i11];
        }
        Map mapD = d();
        if (mapD != null) {
            return mapD.put(obj, obj2);
        }
        int[] iArrA = a();
        Object[] objArrB = b();
        Object[] objArrC = c();
        int i12 = this.f8330q;
        int i13 = i12 + 1;
        int iS = tp1.S(obj);
        int iG = g();
        int i14 = iS & iG;
        Object obj3 = this.f8325a;
        Objects.requireNonNull(obj3);
        int iK0 = en1.k0(i14, obj3);
        if (iK0 != 0) {
            int i15 = ~iG;
            int i16 = iS & i15;
            int i17 = 0;
            while (true) {
                int i18 = iK0 + i10;
                int i19 = iArrA[i18];
                int i20 = i19 & i15;
                if (i20 == i16 && tp1.P(obj, objArrB[i18])) {
                    Object obj4 = objArrC[i18];
                    objArrC[i18] = obj2;
                    return obj4;
                }
                int i21 = i19 & iG;
                int i22 = i16;
                int i23 = i17 + 1;
                if (i21 != 0) {
                    iK0 = i21;
                    i17 = i23;
                    i16 = i22;
                    i10 = -1;
                } else {
                    if (i23 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(g() + 1, 1.0f);
                        int i24 = isEmpty() ? -1 : 0;
                        while (i24 >= 0) {
                            linkedHashMap.put(b()[i24], c()[i24]);
                            int i25 = i24 + 1;
                            i24 = i25 < this.f8330q ? i25 : -1;
                        }
                        this.f8325a = linkedHashMap;
                        this.f8326b = null;
                        this.f8327d = null;
                        this.f8328f = null;
                        this.f8329h += 32;
                        return linkedHashMap.put(obj, obj2);
                    }
                    if (i13 > iG) {
                        iG = i(iG, (iG + 1) * (iG < 32 ? 4 : 2), iS, i12);
                    } else {
                        iArrA[i18] = (i13 & iG) | i20;
                    }
                }
            }
        } else if (i13 > iG) {
            iG = i(iG, (iG + 1) * (iG < 32 ? 4 : 2), iS, i12);
        } else {
            Object obj5 = this.f8325a;
            Objects.requireNonNull(obj5);
            en1.B0(i14, i13, obj5);
        }
        int length = a().length;
        if (i13 > length && (iMin = Math.min(1073741823, 1 | (Math.max(1, length >>> 1) + length))) != length) {
            this.f8326b = Arrays.copyOf(a(), iMin);
            this.f8327d = Arrays.copyOf(b(), iMin);
            this.f8328f = Arrays.copyOf(c(), iMin);
        }
        a()[i12] = (~iG) & iS;
        b()[i12] = obj;
        c()[i12] = obj2;
        this.f8330q = i13;
        this.f8329h += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapD = d();
        if (mapD != null) {
            return mapD.remove(obj);
        }
        Object objJ = j(obj);
        if (objJ == f8324v) {
            return null;
        }
        return objJ;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapD = d();
        return mapD != null ? mapD.size() : this.f8330q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        ky0 ky0Var = this.f8333u;
        if (ky0Var != null) {
            return ky0Var;
        }
        ky0 ky0Var2 = new ky0(1, this);
        this.f8333u = ky0Var2;
        return ky0Var2;
    }
}
