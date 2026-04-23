package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class k01 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f6133a;

    public k01(Iterator it) {
        it.getClass();
        this.f6133a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f6133a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f6133a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f6133a.remove();
    }
}
