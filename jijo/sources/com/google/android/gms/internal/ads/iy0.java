package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public class iy0 extends gy0 implements List {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ vx0 f5724q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(vx0 vx0Var, Object obj, List list, gy0 gy0Var) {
        super(vx0Var, obj, list, gy0Var);
        this.f5724q = vx0Var;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        c();
        boolean zIsEmpty = this.f5108b.isEmpty();
        ((List) this.f5108b).add(i10, obj);
        this.f5724q.f9993h++;
        if (zIsEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = ((List) this.f5108b).addAll(i10, collection);
        if (!zAddAll) {
            return zAddAll;
        }
        this.f5724q.f9993h += this.f5108b.size() - size;
        if (size != 0) {
            return zAddAll;
        }
        b();
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c();
        return ((List) this.f5108b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f5108b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f5108b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new hy0(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        c();
        Object objRemove = ((List) this.f5108b).remove(i10);
        vx0 vx0Var = this.f5724q;
        vx0Var.f9993h--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        c();
        return ((List) this.f5108b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        c();
        List listSubList = ((List) this.f5108b).subList(i10, i11);
        gy0 gy0Var = this.f5109d;
        if (gy0Var == null) {
            gy0Var = this;
        }
        vx0 vx0Var = this.f5724q;
        vx0Var.getClass();
        boolean z9 = listSubList instanceof RandomAccess;
        Object obj = this.f5107a;
        return z9 ? new dy0(vx0Var, obj, listSubList, gy0Var) : new iy0(vx0Var, obj, listSubList, gy0Var);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        c();
        return new hy0(this, i10);
    }
}
