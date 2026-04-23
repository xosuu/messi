package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ka extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f6218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f6219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f6220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f6221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f6222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Long f6223f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Long f6224g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f6225h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f6226i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f6227j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Long f6228k;

    public ka(String str) {
        HashMap mapA = i9.a(str);
        if (mapA != null) {
            this.f6218a = (Long) mapA.get(0);
            this.f6219b = (Long) mapA.get(1);
            this.f6220c = (Long) mapA.get(2);
            this.f6221d = (Long) mapA.get(3);
            this.f6222e = (Long) mapA.get(4);
            this.f6223f = (Long) mapA.get(5);
            this.f6224g = (Long) mapA.get(6);
            this.f6225h = (Long) mapA.get(7);
            this.f6226i = (Long) mapA.get(8);
            this.f6227j = (Long) mapA.get(9);
            this.f6228k = (Long) mapA.get(10);
        }
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f6218a);
        map.put(1, this.f6219b);
        map.put(2, this.f6220c);
        map.put(3, this.f6221d);
        map.put(4, this.f6222e);
        map.put(5, this.f6223f);
        map.put(6, this.f6224g);
        map.put(7, this.f6225h);
        map.put(8, this.f6226i);
        map.put(9, this.f6227j);
        map.put(10, this.f6228k);
        return map;
    }
}
