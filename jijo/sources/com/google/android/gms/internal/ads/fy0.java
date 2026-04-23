package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class fy0 extends ay0 implements SortedSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx0 f4685d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy0(vx0 vx0Var, SortedMap sortedMap) {
        super(vx0Var, sortedMap);
        this.f4685d = vx0Var;
    }

    public SortedMap b() {
        return (SortedMap) this.f2818a;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new fy0(this.f4685d, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new fy0(this.f4685d, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new fy0(this.f4685d, b().tailMap(obj));
    }
}
