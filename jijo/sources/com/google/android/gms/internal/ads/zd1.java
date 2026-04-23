package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class zd1 extends wb1 implements RandomAccess {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final zd1 f11221f = new zd1(new Object[0], 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f11222b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11223d;

    public zd1(Object[] objArr, int i10, boolean z9) {
        super(z9);
        this.f11222b = objArr;
        this.f11223d = i10;
    }

    @Override // com.google.android.gms.internal.ads.dd1
    public final /* bridge */ /* synthetic */ dd1 a(int i10) {
        if (i10 >= this.f11223d) {
            return new zd1(Arrays.copyOf(this.f11222b, i10), this.f11223d, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        d();
        if (i10 < 0 || i10 > (i11 = this.f11223d)) {
            throw new IndexOutOfBoundsException(l.a0.f("Index:", i10, ", Size:", this.f11223d));
        }
        int i12 = i10 + 1;
        Object[] objArr = this.f11222b;
        if (i11 < objArr.length) {
            System.arraycopy(objArr, i10, objArr, i12, i11 - i10);
        } else {
            Object[] objArr2 = new Object[((i11 * 3) / 2) + 1];
            System.arraycopy(objArr, 0, objArr2, 0, i10);
            System.arraycopy(this.f11222b, i10, objArr2, i12, this.f11223d - i10);
            this.f11222b = objArr2;
        }
        this.f11222b[i10] = obj;
        this.f11223d++;
        ((AbstractList) this).modCount++;
    }

    public final void e(int i10) {
        if (i10 < 0 || i10 >= this.f11223d) {
            throw new IndexOutOfBoundsException(l.a0.f("Index:", i10, ", Size:", this.f11223d));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        e(i10);
        return this.f11222b[i10];
    }

    @Override // com.google.android.gms.internal.ads.wb1, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        d();
        e(i10);
        Object[] objArr = this.f11222b;
        Object obj = objArr[i10];
        if (i10 < this.f11223d - 1) {
            System.arraycopy(objArr, i10 + 1, objArr, i10, (r2 - i10) - 1);
        }
        this.f11223d--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        d();
        e(i10);
        Object[] objArr = this.f11222b;
        Object obj2 = objArr[i10];
        objArr[i10] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11223d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i10 = this.f11223d;
        Object[] objArr = this.f11222b;
        if (i10 == objArr.length) {
            this.f11222b = Arrays.copyOf(objArr, ((i10 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f11222b;
        int i11 = this.f11223d;
        this.f11223d = i11 + 1;
        objArr2[i11] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
