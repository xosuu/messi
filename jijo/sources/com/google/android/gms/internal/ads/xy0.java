package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xy0 extends jy0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10686b;

    public xy0(Object obj, List list) {
        this.f10685a = obj;
        this.f10686b = list;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f10685a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f10686b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
