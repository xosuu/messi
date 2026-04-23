package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a01 extends bz0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f2548d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f2549f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f2550h;

    public a01(int i10, int i11, Object[] objArr) {
        this.f2548d = objArr;
        this.f2549f = i10;
        this.f2550h = i11;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        en1.a0(i10, this.f2550h);
        Object obj = this.f2548d[i10 + i10 + this.f2549f];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f2550h;
    }
}
