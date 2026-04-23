package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f5228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f5229e;

    public h7(int i10, byte[] bArr, Map map, List list, boolean z9) {
        this.f5225a = i10;
        this.f5226b = bArr;
        this.f5227c = map;
        this.f5228d = list == null ? null : Collections.unmodifiableList(list);
        this.f5229e = z9;
    }

    public static List a(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new d7((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Map] */
    public h7(int i10, byte[] bArr, boolean z9, long j10, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.emptyMap();
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d7 d7Var = (d7) it.next();
                treeMap.put(d7Var.f3590a, d7Var.f3591b);
            }
        }
        this(i10, bArr, (Map) treeMap, list, z9);
    }
}
