package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class jd1 extends wb1 implements RandomAccess, cd1, xd1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final jd1 f5915f = new jd1(new long[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f5916b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5917d;

    public jd1(long[] jArr, int i10, boolean z9) {
        super(z9);
        this.f5916b = jArr;
        this.f5917d = i10;
    }

    @Override // com.google.android.gms.internal.ads.dd1
    public final dd1 a(int i10) {
        if (i10 >= this.f5917d) {
            return new jd1(Arrays.copyOf(this.f5916b, i10), this.f5917d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f5917d)) {
            throw new IndexOutOfBoundsException(l.a0.f("Index:", i10, ", Size:", this.f5917d));
        }
        int i12 = i10 + 1;
        long[] jArr = this.f5916b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i12, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f5916b, i10, jArr2, i12, this.f5917d - i10);
            this.f5916b = jArr2;
        }
        this.f5916b[i10] = jLongValue;
        this.f5917d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = ed1.f3910a;
        collection.getClass();
        if (!(collection instanceof jd1)) {
            return super.addAll(collection);
        }
        jd1 jd1Var = (jd1) collection;
        int i10 = jd1Var.f5917d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f5917d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f5916b;
        if (i12 > jArr.length) {
            this.f5916b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(jd1Var.f5916b, 0, this.f5916b, this.f5917d, jd1Var.f5917d);
        this.f5917d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i10) {
        g(i10);
        return this.f5916b[i10];
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd1)) {
            return super.equals(obj);
        }
        jd1 jd1Var = (jd1) obj;
        if (this.f5917d != jd1Var.f5917d) {
            return false;
        }
        long[] jArr = jd1Var.f5916b;
        for (int i10 = 0; i10 < this.f5917d; i10++) {
            if (this.f5916b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j10) {
        d();
        int i10 = this.f5917d;
        long[] jArr = this.f5916b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f5916b = jArr2;
        }
        long[] jArr3 = this.f5916b;
        int i11 = this.f5917d;
        this.f5917d = i11 + 1;
        jArr3[i11] = j10;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f5917d) {
            throw new IndexOutOfBoundsException(l.a0.f("Index:", i10, ", Size:", this.f5917d));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Long.valueOf(this.f5916b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f5917d; i11++) {
            long j10 = this.f5916b[i11];
            Charset charset = ed1.f3910a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f5917d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f5916b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        long[] jArr = this.f5916b;
        long j10 = jArr[i10];
        if (i10 < this.f5917d - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f5917d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f5916b;
        System.arraycopy(jArr, i11, jArr, i10, this.f5917d - i11);
        this.f5917d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        g(i10);
        long[] jArr = this.f5916b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f5917d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}
