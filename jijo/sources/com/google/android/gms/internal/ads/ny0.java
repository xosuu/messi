package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ny0 extends AbstractSet {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f7413b;

    public /* synthetic */ ny0(qy0 qy0Var, int i10) {
        this.f7412a = i10;
        this.f7413b = qy0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        switch (this.f7412a) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((ie1) this.f7413b).e((Comparable) entry.getKey(), entry.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i10 = this.f7412a;
        AbstractMap abstractMap = this.f7413b;
        switch (i10) {
            case 0:
                ((qy0) abstractMap).clear();
                break;
            case 1:
                ((qy0) abstractMap).clear();
                break;
            default:
                ((ie1) abstractMap).a();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i10 = this.f7412a;
        AbstractMap abstractMap = this.f7413b;
        switch (i10) {
            case 0:
                qy0 qy0Var = (qy0) abstractMap;
                Map mapD = qy0Var.d();
                if (mapD != null) {
                    return mapD.entrySet().contains(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int iH = qy0Var.h(entry.getKey());
                return iH != -1 && tp1.P(qy0Var.c()[iH], entry.getValue());
            case 1:
                return ((qy0) abstractMap).containsKey(obj);
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                Object objB = ((ie1) abstractMap).b(entry2.getKey());
                Object value = entry2.getValue();
                return objB == value || (objB != null && objB.equals(value));
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i10 = this.f7412a;
        AbstractMap abstractMap = this.f7413b;
        switch (i10) {
            case 0:
                qy0 qy0Var = (qy0) abstractMap;
                Map mapD = qy0Var.d();
                return mapD != null ? mapD.entrySet().iterator() : new my0(qy0Var, 1);
            case 1:
                qy0 qy0Var2 = (qy0) abstractMap;
                Map mapD2 = qy0Var2.d();
                return mapD2 != null ? mapD2.keySet().iterator() : new my0(qy0Var2, 0);
            default:
                return new je1((ie1) abstractMap);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10 = this.f7412a;
        boolean zRemove = false;
        AbstractMap abstractMap = this.f7413b;
        switch (i10) {
            case 0:
                qy0 qy0Var = (qy0) abstractMap;
                Map mapD = qy0Var.d();
                if (mapD != null) {
                    return mapD.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (qy0Var.f()) {
                    return false;
                }
                int iG = qy0Var.g();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = qy0Var.f8325a;
                Objects.requireNonNull(obj2);
                int iC0 = en1.c0(key, value, iG, obj2, qy0Var.a(), qy0Var.b(), qy0Var.c());
                if (iC0 == -1) {
                    return false;
                }
                qy0Var.e(iC0, iG);
                qy0Var.f8330q--;
                qy0Var.f8329h += 32;
                return true;
            case 1:
                qy0 qy0Var2 = (qy0) abstractMap;
                Map mapD2 = qy0Var2.d();
                if (mapD2 != null) {
                    zRemove = mapD2.keySet().remove(obj);
                } else if (qy0Var2.j(obj) != qy0.f8324v) {
                    return true;
                }
                return zRemove;
            default:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((ie1) abstractMap).c(entry2.getKey());
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i10 = this.f7412a;
        AbstractMap abstractMap = this.f7413b;
        switch (i10) {
            case 0:
                return ((qy0) abstractMap).size();
            case 1:
                return ((qy0) abstractMap).size();
            default:
                return ((ie1) abstractMap).d();
        }
    }
}
