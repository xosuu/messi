package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class ly0 implements oz0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient ay0 f6712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient ky0 f6713b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient zx0 f6714d;

    public final Collection a() {
        ky0 ky0Var = this.f6713b;
        if (ky0Var != null) {
            return ky0Var;
        }
        ky0 ky0Var2 = new ky0(0, (vx0) this);
        this.f6713b = ky0Var2;
        return ky0Var2;
    }

    public final Map b() {
        zx0 zx0Var = this.f6714d;
        if (zx0Var != null) {
            return zx0Var;
        }
        sz0 sz0Var = (sz0) this;
        Map map = sz0Var.f9992f;
        zx0 by0Var = map instanceof NavigableMap ? new by0(sz0Var, (NavigableMap) map) : map instanceof SortedMap ? new ey0(sz0Var, (SortedMap) map) : new zx0(sz0Var, map);
        this.f6714d = by0Var;
        return by0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oz0) {
            return b().equals(((ly0) ((oz0) obj)).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        return b().toString();
    }
}
