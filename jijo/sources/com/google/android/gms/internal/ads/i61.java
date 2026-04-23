package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i61 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i61 f5509b = new i61(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f5510a;

    public /* synthetic */ i61(Map map) {
        this.f5510a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i61) {
            return this.f5510a.equals(((i61) obj).f5510a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5510a.hashCode();
    }

    public final String toString() {
        return this.f5510a.toString();
    }
}
