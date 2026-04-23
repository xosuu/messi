package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s20 implements t20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f8775a;

    public s20(Map map) {
        this.f8775a = map;
    }

    @Override // com.google.android.gms.internal.ads.t20
    public final ci0 a(int i10, String str) {
        return (ci0) this.f8775a.get(str);
    }
}
