package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class je1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5923a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5924b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f5925d;

    public /* synthetic */ je1(ie1 ie1Var) {
    }

    public final Iterator a() {
        this.f5925d.getClass();
        return this.f5925d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.f5924b = true;
        this.f5923a++;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f5924b) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.f5924b = false;
        int i10 = ie1.f5584a;
        throw null;
    }
}
