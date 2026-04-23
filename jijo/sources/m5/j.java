package m5;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class j extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f15773d;

    public j(Object obj) {
        this.f15773d = obj;
    }

    @Override // m5.b
    public final int b(Object[] objArr) {
        objArr[0] = this.f15773d;
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15773d.equals(obj);
    }

    @Override // m5.f, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15773d.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g(this.f15773d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f15773d.toString() + ']';
    }
}
