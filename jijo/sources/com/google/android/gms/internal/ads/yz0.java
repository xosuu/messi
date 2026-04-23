package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yz0 extends fz0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient dz0 f11075f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient Object[] f11076h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final transient int f11077q;

    public yz0(dz0 dz0Var, Object[] objArr, int i10) {
        this.f11075f = dz0Var;
        this.f11076h = objArr;
        this.f11077q = i10;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final int b(int i10, Object[] objArr) {
        return e().b(i10, objArr);
    }

    @Override // com.google.android.gms.internal.ads.wy0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f11075f.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final m01 f() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.wy0
    public final boolean g() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return e().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.fz0
    public final bz0 j() {
        return new xz0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f11077q;
    }
}
