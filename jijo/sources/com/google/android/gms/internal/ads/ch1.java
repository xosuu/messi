package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ch1 extends AbstractList {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ah1 f3281d = q7.b.v(ch1.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Iterator f3283b;

    public ch1(ArrayList arrayList, Iterator it) {
        this.f3282a = arrayList;
        this.f3283b = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        List list = this.f3282a;
        if (list.size() > i10) {
            return list.get(i10);
        }
        Iterator it = this.f3283b;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new bh1(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        ah1 ah1Var = f3281d;
        ah1Var.x("potentially expensive size() call");
        ah1Var.x("blowup running");
        while (true) {
            Iterator it = this.f3283b;
            boolean zHasNext = it.hasNext();
            List list = this.f3282a;
            if (!zHasNext) {
                return list.size();
            }
            list.add(it.next());
        }
    }
}
