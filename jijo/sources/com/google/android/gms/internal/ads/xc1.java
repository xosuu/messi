package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class xc1 extends wb1 implements RandomAccess, ad1, xd1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final xc1 f10536f = new xc1(new int[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f10537b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10538d;

    public xc1(int[] iArr, int i10, boolean z9) {
        super(z9);
        this.f10537b = iArr;
        this.f10538d = i10;
    }

    @Override // com.google.android.gms.internal.ads.dd1
    public final dd1 a(int i10) {
        if (i10 >= this.f10538d) {
            return new xc1(Arrays.copyOf(this.f10537b, i10), this.f10538d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i10 < 0 || i10 > (i11 = this.f10538d)) {
            throw new IndexOutOfBoundsException(l.a0.f("Index:", i10, ", Size:", this.f10538d));
        }
        int i12 = i10 + 1;
        int[] iArr = this.f10537b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i12, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f10537b, i10, iArr2, i12, this.f10538d - i10);
            this.f10537b = iArr2;
        }
        this.f10537b[i10] = iIntValue;
        this.f10538d++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = ed1.f3910a;
        collection.getClass();
        if (!(collection instanceof xc1)) {
            return super.addAll(collection);
        }
        xc1 xc1Var = (xc1) collection;
        int i10 = xc1Var.f10538d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f10538d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f10537b;
        if (i12 > iArr.length) {
            this.f10537b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(xc1Var.f10537b, 0, this.f10537b, this.f10538d, xc1Var.f10538d);
        this.f10538d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i10) {
        g(i10);
        return this.f10537b[i10];
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc1)) {
            return super.equals(obj);
        }
        xc1 xc1Var = (xc1) obj;
        if (this.f10538d != xc1Var.f10538d) {
            return false;
        }
        int[] iArr = xc1Var.f10537b;
        for (int i10 = 0; i10 < this.f10538d; i10++) {
            if (this.f10537b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i10) {
        d();
        int i11 = this.f10538d;
        int[] iArr = this.f10537b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f10537b = iArr2;
        }
        int[] iArr3 = this.f10537b;
        int i12 = this.f10538d;
        this.f10538d = i12 + 1;
        iArr3[i12] = i10;
    }

    public final void g(int i10) {
        if (i10 < 0 || i10 >= this.f10538d) {
            throw new IndexOutOfBoundsException(l.a0.f("Index:", i10, ", Size:", this.f10538d));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i10) {
        g(i10);
        return Integer.valueOf(this.f10537b[i10]);
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f10538d; i11++) {
            i10 = (i10 * 31) + this.f10537b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f10538d;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f10537b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        d();
        g(i10);
        int[] iArr = this.f10537b;
        int i11 = iArr[i10];
        if (i10 < this.f10538d - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f10538d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        d();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f10537b;
        System.arraycopy(iArr, i11, iArr, i10, this.f10538d - i11);
        this.f10538d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        g(i10);
        int[] iArr = this.f10537b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10538d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
