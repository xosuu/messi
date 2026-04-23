package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class j9 extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5830e;

    public j9(String str) {
        this.f5826a = "E";
        this.f5827b = -1L;
        this.f5828c = "E";
        this.f5829d = "E";
        this.f5830e = "E";
        HashMap mapA = i9.a(str);
        if (mapA != null) {
            this.f5826a = mapA.get(0) == null ? "E" : (String) mapA.get(0);
            this.f5827b = mapA.get(1) != null ? ((Long) mapA.get(1)).longValue() : -1L;
            this.f5828c = mapA.get(2) == null ? "E" : (String) mapA.get(2);
            this.f5829d = mapA.get(3) == null ? "E" : (String) mapA.get(3);
            this.f5830e = mapA.get(4) != null ? (String) mapA.get(4) : "E";
        }
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f5826a);
        map.put(4, this.f5830e);
        map.put(3, this.f5829d);
        map.put(2, this.f5828c);
        map.put(1, Long.valueOf(this.f5827b));
        return map;
    }
}
