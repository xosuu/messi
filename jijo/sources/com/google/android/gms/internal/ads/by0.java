package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class by0 extends ey0 implements NavigableMap {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ vx0 f3125s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public by0(vx0 vx0Var, NavigableMap navigableMap) {
        super(vx0Var, navigableMap);
        this.f3125s = vx0Var;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = ((NavigableMap) ((SortedMap) this.f11335d)).ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return c(entryCeilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11335d)).ceilingKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.ey0
    public final /* synthetic */ SortedMap d() {
        return (NavigableMap) ((SortedMap) this.f11335d);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new by0(this.f3125s, ((NavigableMap) ((SortedMap) this.f11335d)).descendingMap());
    }

    @Override // com.google.android.gms.internal.ads.ey0
    public final SortedSet e() {
        return new cy0(this.f3125s, (NavigableMap) ((SortedMap) this.f11335d));
    }

    @Override // com.google.android.gms.internal.ads.ey0
    /* JADX INFO: renamed from: f */
    public final /* synthetic */ SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = ((NavigableMap) ((SortedMap) this.f11335d)).firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return c(entryFirstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = ((NavigableMap) ((SortedMap) this.f11335d)).floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return c(entryFloorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11335d)).floorKey(obj);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final xy0 g(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        vx0 vx0Var = this.f3125s;
        ?? Mo3zza = ((sz0) vx0Var).f8998q.mo3zza();
        Mo3zza.addAll((Collection) entry.getValue());
        it.remove();
        Object key = entry.getKey();
        vx0Var.getClass();
        return new xy0(key, Collections.unmodifiableList(Mo3zza));
    }

    @Override // com.google.android.gms.internal.ads.ey0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = ((NavigableMap) ((SortedMap) this.f11335d)).higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return c(entryHigherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11335d)).higherKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.ey0, com.google.android.gms.internal.ads.zx0, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final /* synthetic */ Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = ((NavigableMap) ((SortedMap) this.f11335d)).lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return c(entryLastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = ((NavigableMap) ((SortedMap) this.f11335d)).lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return c(entryLowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return ((NavigableMap) ((SortedMap) this.f11335d)).lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return g(((xx0) entrySet()).iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return g(((xx0) ((zx0) descendingMap()).entrySet()).iterator());
    }

    @Override // com.google.android.gms.internal.ads.ey0, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // com.google.android.gms.internal.ads.ey0, java.util.SortedMap, java.util.NavigableMap
    public final /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z9) {
        return new by0(this.f3125s, ((NavigableMap) ((SortedMap) this.f11335d)).headMap(obj, z9));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z9, Object obj2, boolean z10) {
        return new by0(this.f3125s, ((NavigableMap) ((SortedMap) this.f11335d)).subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z9) {
        return new by0(this.f3125s, ((NavigableMap) ((SortedMap) this.f11335d)).tailMap(obj, z9));
    }
}
