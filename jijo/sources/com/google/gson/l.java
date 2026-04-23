package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12255a = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof l) && ((l) obj).f12255a.equals(this.f12255a));
    }

    public final int hashCode() {
        return this.f12255a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f12255a.iterator();
    }
}
