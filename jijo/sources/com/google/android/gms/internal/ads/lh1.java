package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class lh1 extends fh1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f6629b = 0;

    static {
        kh1.a(Collections.emptyMap());
    }

    public static e70 a(int i10) {
        return new e70(i10);
    }

    @Override // com.google.android.gms.internal.ads.qh1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        Map map = this.f4528a;
        LinkedHashMap linkedHashMapW = tp1.W(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapW.put(entry.getKey(), ((nh1) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapW);
    }
}
