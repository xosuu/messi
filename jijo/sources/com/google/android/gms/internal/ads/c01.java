package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class c01 extends fz0 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Object[] f3143u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final c01 f3144v;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f3145f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f3146h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient Object[] f3147q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final transient int f3148s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final transient int f3149t;

    static {
        Object[] objArr = new Object[0];
        f3144v = new c01(0, 0, 0, objArr, objArr);
    }

    public c01(int i10, int i11, int i12, Object[] objArr, Object[] objArr2) {
        this.f3145f = objArr;
        this.f3146h = i10;
        this.f3147q = objArr2;
        this.f3148s = i11;
        this.f3149t = i12;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int b(int i10, Object[] objArr) {
        Object[] objArr2 = this.f3145f;
        int i11 = this.f3149t;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int c() {
        return this.f3149t;
    }

    @Override // com.google.android.gms.internal.ads.wy0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f3147q;
            if (objArr.length != 0) {
                int iS = tp1.S(obj);
                while (true) {
                    int i10 = iS & this.f3148s;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iS = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final m01 f() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final Object[] h() {
        return this.f3145f;
    }

    @Override // com.google.android.gms.internal.ads.fz0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f3146h;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.fz0
    public final bz0 j() {
        return bz0.j(this.f3149t, this.f3145f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f3149t;
    }
}
