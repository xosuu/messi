package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class zz0 extends fz0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient dz0 f11382f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient bz0 f11383h;

    public zz0(dz0 dz0Var, a01 a01Var) {
        this.f11382f = dz0Var;
        this.f11383h = a01Var;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int b(int i10, Object[] objArr) {
        return this.f11383h.b(i10, objArr);
    }

    @Override // com.google.android.gms.internal.ads.wy0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f11382f.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.fz0, com.google.android.gms.internal.ads.wy0
    public final bz0 e() {
        return this.f11383h;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final m01 f() {
        return this.f11383h.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return this.f11383h.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((b01) this.f11382f).f2862q;
    }
}
