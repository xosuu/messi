package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class hy0 extends yx0 implements ListIterator {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ iy0 f5436h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy0(iy0 iy0Var) {
        super(iy0Var);
        this.f5436h = iy0Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        iy0 iy0Var = this.f5436h;
        boolean zIsEmpty = iy0Var.isEmpty();
        a();
        ((ListIterator) this.f11068b).add(obj);
        iy0Var.f5724q.f9993h++;
        if (zIsEmpty) {
            iy0Var.b();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        a();
        return ((ListIterator) this.f11068b).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        a();
        return ((ListIterator) this.f11068b).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        return ((ListIterator) this.f11068b).previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        a();
        return ((ListIterator) this.f11068b).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        a();
        ((ListIterator) this.f11068b).set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy0(iy0 iy0Var, int i10) {
        super(iy0Var, ((List) iy0Var.f5108b).listIterator(i10));
        this.f5436h = iy0Var;
    }
}
