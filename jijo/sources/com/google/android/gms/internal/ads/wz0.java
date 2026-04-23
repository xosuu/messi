package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wz0 extends bz0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final wz0 f10382h = new wz0(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f10383d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f10384f;

    public wz0(int i10, Object[] objArr) {
        this.f10383d = objArr;
        this.f10384f = i10;
    }

    @Override // com.google.android.gms.internal.ads.bz0, com.google.android.gms.internal.ads.wy0
    public final int b(int i10, Object[] objArr) {
        Object[] objArr2 = this.f10383d;
        int i11 = this.f10384f;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int c() {
        return this.f10384f;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        en1.a0(i10, this.f10384f);
        Object obj = this.f10383d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final Object[] h() {
        return this.f10383d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10384f;
    }
}
