package com.google.gson.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f12187b;

    public /* synthetic */ h(k kVar, int i10) {
        this.f12186a = i10;
        this.f12187b = kVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f12186a;
        k kVar = this.f12187b;
        switch (i10) {
            case 0:
                kVar.clear();
                break;
            default:
                kVar.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        j jVarA;
        Object obj2;
        Object value;
        int i10 = this.f12186a;
        k kVar = this.f12187b;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                kVar.getClass();
                Object key = entry.getKey();
                j jVar = null;
                if (key != null) {
                    try {
                        jVarA = kVar.a(key, false);
                    } catch (ClassCastException unused) {
                        jVarA = null;
                    }
                    break;
                } else {
                    jVarA = null;
                }
                if (jVarA != null && ((obj2 = jVarA.f12199t) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    jVar = jVarA;
                }
                return jVar != null;
            default:
                return kVar.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f12186a) {
            case 0:
                return new g(this);
            default:
                return new g(this, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        j jVarA;
        Object obj2;
        Object value;
        j jVarA2 = null;
        int i10 = this.f12186a;
        k kVar = this.f12187b;
        switch (i10) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                kVar.getClass();
                Object key = entry.getKey();
                if (key != null) {
                    try {
                        jVarA = kVar.a(key, false);
                    } catch (ClassCastException unused) {
                        jVarA = null;
                    }
                    break;
                } else {
                    jVarA = null;
                }
                if (jVarA != null && ((obj2 = jVarA.f12199t) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                    jVarA2 = jVarA;
                }
                if (jVarA2 == null) {
                    return false;
                }
                kVar.c(jVarA2, true);
                return true;
            default:
                kVar.getClass();
                if (obj != null) {
                    try {
                        jVarA2 = kVar.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (jVarA2 != null) {
                    kVar.c(jVarA2, true);
                }
                return jVarA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f12186a;
        k kVar = this.f12187b;
        switch (i10) {
        }
        return kVar.f12205f;
    }
}
