package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j01 extends fz0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object f5754f;

    public j01(Object obj) {
        obj.getClass();
        this.f5754f = obj;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int b(int i10, Object[] objArr) {
        objArr[i10] = this.f5754f;
        return i10 + 1;
    }

    @Override // com.google.android.gms.internal.ads.wy0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f5754f.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.fz0, com.google.android.gms.internal.ads.wy0
    public final bz0 e() {
        return bz0.n(this.f5754f);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final m01 f() {
        return new jz0(this.f5754f);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.fz0, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f5754f.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new jz0(this.f5754f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return fb1.i("[", this.f5754f.toString(), "]");
    }
}
