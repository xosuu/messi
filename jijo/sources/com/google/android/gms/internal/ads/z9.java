package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z9 extends i9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f11185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f11186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f11187d;

    public z9(String str, int i10) {
        this.f11184a = i10;
        if (i10 != 1) {
            HashMap mapA = i9.a(str);
            if (mapA != null) {
                this.f11185b = (Long) mapA.get(0);
                this.f11186c = (Long) mapA.get(1);
                this.f11187d = (Long) mapA.get(2);
                return;
            }
            return;
        }
        HashMap mapA2 = i9.a(str);
        if (mapA2 != null) {
            this.f11185b = (Long) mapA2.get(0);
            this.f11186c = (Boolean) mapA2.get(1);
            this.f11187d = (Boolean) mapA2.get(2);
        }
    }

    @Override // com.google.android.gms.internal.ads.i9
    public final HashMap b() {
        switch (this.f11184a) {
            case 0:
                HashMap map = new HashMap();
                map.put(0, this.f11185b);
                map.put(1, (Long) this.f11186c);
                map.put(2, (Long) this.f11187d);
                return map;
            default:
                HashMap map2 = new HashMap();
                map2.put(0, this.f11185b);
                map2.put(1, (Boolean) this.f11186c);
                map2.put(2, (Boolean) this.f11187d);
                return map2;
        }
    }
}
