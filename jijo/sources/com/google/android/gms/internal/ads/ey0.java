package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class ey0 extends zx0 implements SortedMap {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public SortedSet f4317h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ vx0 f4318q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey0(vx0 vx0Var, SortedMap sortedMap) {
        super(vx0Var, sortedMap);
        this.f4318q = vx0Var;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.f11335d;
    }

    public SortedSet e() {
        return new fy0(this.f4318q, d());
    }

    @Override // com.google.android.gms.internal.ads.zx0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f4317h;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetE = e();
        this.f4317h = sortedSetE;
        return sortedSetE;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new ey0(this.f4318q, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new ey0(this.f4318q, d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new ey0(this.f4318q, d().tailMap(obj));
    }
}
