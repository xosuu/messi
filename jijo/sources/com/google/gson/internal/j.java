package com.google.gson.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j implements Map.Entry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f12192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public j f12193b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f12194d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f12195f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j f12196h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f12197q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f12198s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f12199t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f12200u;

    public j(boolean z9) {
        this.f12197q = null;
        this.f12198s = z9;
        this.f12196h = this;
        this.f12195f = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f12197q;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f12199t;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f12197q;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f12199t;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.f12197q;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f12199t;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.f12198s) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.f12199t;
        this.f12199t = obj;
        return obj2;
    }

    public final String toString() {
        return this.f12197q + "=" + this.f12199t;
    }

    public j(boolean z9, j jVar, Object obj, j jVar2, j jVar3) {
        this.f12192a = jVar;
        this.f12197q = obj;
        this.f12198s = z9;
        this.f12200u = 1;
        this.f12195f = jVar2;
        this.f12196h = jVar3;
        jVar3.f12195f = this;
        jVar2.f12196h = this;
    }
}
