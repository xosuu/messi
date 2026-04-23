package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bh1 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3023a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ch1 f3024b;

    public bh1(ch1 ch1Var) {
        this.f3024b = ch1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f3023a;
        ch1 ch1Var = this.f3024b;
        return i10 < ch1Var.f3282a.size() || ch1Var.f3283b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f3023a;
        ch1 ch1Var = this.f3024b;
        int size = ch1Var.f3282a.size();
        List list = ch1Var.f3282a;
        if (i10 >= size) {
            list.add(ch1Var.f3283b.next());
            return next();
        }
        int i11 = this.f3023a;
        this.f3023a = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
