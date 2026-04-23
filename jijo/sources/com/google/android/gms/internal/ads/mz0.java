package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class mz0 extends AbstractSequentialList implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f7080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gx0 f7081b;

    public mz0(List list, b3 b3Var) {
        list.getClass();
        this.f7080a = list;
        this.f7081b = b3Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f7080a.isEmpty();
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i10) {
        return new kz0(this, this.f7080a.listIterator(i10), 1);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        this.f7080a.subList(i10, i11).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f7080a.size();
    }
}
