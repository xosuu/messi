package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class cy0 extends fy0 implements NavigableSet {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx0 f3468f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy0(vx0 vx0Var, NavigableMap navigableMap) {
        super(vx0Var, navigableMap);
        this.f3468f = vx0Var;
    }

    @Override // com.google.android.gms.internal.ads.fy0
    public final /* synthetic */ SortedMap b() {
        return (NavigableMap) ((SortedMap) this.f2818a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2818a)).ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((ay0) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new cy0(this.f3468f, ((NavigableMap) ((SortedMap) this.f2818a)).descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2818a)).floorKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.fy0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2818a)).higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f2818a)).lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        yx0 yx0Var = (yx0) iterator();
        if (!yx0Var.hasNext()) {
            return null;
        }
        Object next = yx0Var.next();
        yx0Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // com.google.android.gms.internal.ads.fy0, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.fy0, java.util.SortedSet, java.util.NavigableSet
    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z9) {
        return new cy0(this.f3468f, ((NavigableMap) ((SortedMap) this.f2818a)).headMap(obj, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        return new cy0(this.f3468f, ((NavigableMap) ((SortedMap) this.f2818a)).subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z9) {
        return new cy0(this.f3468f, ((NavigableMap) ((SortedMap) this.f2818a)).tailMap(obj, z9));
    }
}
