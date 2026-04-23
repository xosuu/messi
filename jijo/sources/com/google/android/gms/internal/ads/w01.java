package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class w01 extends AbstractList implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f10020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10021b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10022d;

    public w01(int i10, int i11, int[] iArr) {
        this.f10020a = iArr;
        this.f10021b = i10;
        this.f10022d = i11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f10021b;
        while (i10 < this.f10022d) {
            if (this.f10020a[i10] == iIntValue) {
                return i10 != -1;
            }
            i10++;
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w01)) {
            return super.equals(obj);
        }
        w01 w01Var = (w01) obj;
        int i10 = w01Var.f10022d;
        int i11 = w01Var.f10021b;
        int i12 = i10 - i11;
        int i13 = this.f10022d;
        int i14 = this.f10021b;
        int i15 = i13 - i14;
        if (i12 != i15) {
            return false;
        }
        for (int i16 = 0; i16 < i15; i16++) {
            if (this.f10020a[i14 + i16] != w01Var.f10020a[i11 + i16]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        int i11 = this.f10022d;
        int i12 = this.f10021b;
        en1.a0(i10, i11 - i12);
        return Integer.valueOf(this.f10020a[i12 + i10]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = this.f10021b; i11 < this.f10022d; i11++) {
            i10 = (i10 * 31) + this.f10020a[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i10 = this.f10021b;
            int i11 = i10;
            while (true) {
                if (i11 >= this.f10022d) {
                    i11 = -1;
                    break;
                }
                if (this.f10020a[i11] == iIntValue) {
                    break;
                }
                i11++;
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int i10;
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            int i11 = this.f10022d - 1;
            while (true) {
                i10 = this.f10021b;
                if (i11 < i10) {
                    i11 = -1;
                    break;
                }
                if (this.f10020a[i11] == iIntValue) {
                    break;
                }
                i11--;
            }
            if (i11 >= 0) {
                return i11 - i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        int i11 = this.f10022d;
        int i12 = this.f10021b;
        Integer num = (Integer) obj;
        en1.a0(i10, i11 - i12);
        int i13 = i12 + i10;
        int[] iArr = this.f10020a;
        int i14 = iArr[i13];
        num.getClass();
        iArr[i13] = num.intValue();
        return Integer.valueOf(i14);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10022d - this.f10021b;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i10, int i11) {
        int i12 = this.f10022d;
        int i13 = this.f10021b;
        en1.J0(i10, i11, i12 - i13);
        if (i10 == i11) {
            return Collections.emptyList();
        }
        return new w01(i13 + i10, i11 + i13, this.f10020a);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i10 = this.f10022d;
        int i11 = this.f10021b;
        StringBuilder sb = new StringBuilder((i10 - i11) * 5);
        sb.append('[');
        int[] iArr = this.f10020a;
        sb.append(iArr[i11]);
        while (true) {
            i11++;
            if (i11 >= i10) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i11]);
        }
    }
}
