package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class xz0 extends bz0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz0 f10687d;

    public xz0(yz0 yz0Var) {
        this.f10687d = yz0Var;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        yz0 yz0Var = this.f10687d;
        en1.a0(i10, yz0Var.f11077q);
        int i11 = i10 + i10;
        Object[] objArr = yz0Var.f11076h;
        Object obj = objArr[i11];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10687d.f11077q;
    }
}
