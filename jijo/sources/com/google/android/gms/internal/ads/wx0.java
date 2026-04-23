package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class wx0 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f10370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f10371b = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f10372d = hz0.f5442a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx0 f10373f;

    public wx0(vx0 vx0Var) {
        this.f10373f = vx0Var;
        this.f10370a = vx0Var.f9992f.entrySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean hasNext() {
        return this.f10370a.hasNext() || this.f10372d.hasNext();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object next() {
        if (!this.f10372d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f10370a.next();
            entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f10371b = collection;
            this.f10372d = collection.iterator();
        }
        return this.f10372d.next();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void remove() {
        this.f10372d.remove();
        Collection collection = this.f10371b;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f10370a.remove();
        }
        vx0 vx0Var = this.f10373f;
        vx0Var.f9993h--;
    }
}
