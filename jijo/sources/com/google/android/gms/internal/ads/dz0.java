package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class dz0 implements Map, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient yz0 f3767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient zz0 f3768b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient a01 f3769d;

    public static b01 a(HashMap map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z9 = setEntrySet instanceof Collection;
        xg xgVar = new xg(z9 ? setEntrySet.size() : 4);
        if (z9) {
            int size = setEntrySet.size() + xgVar.f10548b;
            Object[] objArr = (Object[]) xgVar.f10549d;
            int length = objArr.length;
            int i10 = size + size;
            if (i10 > length) {
                xgVar.f10549d = Arrays.copyOf(objArr, vy0.d(length, i10));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            xgVar.a(entry.getKey(), entry.getValue());
        }
        return xgVar.g();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fz0 entrySet() {
        yz0 yz0Var = this.f3767a;
        if (yz0Var != null) {
            return yz0Var;
        }
        b01 b01Var = (b01) this;
        yz0 yz0Var2 = new yz0(b01Var, b01Var.f2861h, b01Var.f2862q);
        this.f3767a = yz0Var2;
        return yz0Var2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        a01 a01Var = this.f3769d;
        if (a01Var == null) {
            b01 b01Var = (b01) this;
            a01 a01Var2 = new a01(1, b01Var.f2862q, b01Var.f2861h);
            this.f3769d = a01Var2;
            a01Var = a01Var2;
        }
        return a01Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return tc1.y(obj, this);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return tp1.t(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((b01) this).f2862q == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        zz0 zz0Var = this.f3768b;
        if (zz0Var != null) {
            return zz0Var;
        }
        b01 b01Var = (b01) this;
        zz0 zz0Var2 = new zz0(b01Var, new a01(0, b01Var.f2862q, b01Var.f2861h));
        this.f3768b = zz0Var2;
        return zz0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int i10 = ((b01) this).f2862q;
        tp1.G(i10, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) i10) * 8, 1073741824L));
        sb.append('{');
        boolean z9 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z9) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z9 = false;
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        a01 a01Var = this.f3769d;
        if (a01Var != null) {
            return a01Var;
        }
        b01 b01Var = (b01) this;
        a01 a01Var2 = new a01(1, b01Var.f2862q, b01Var.f2861h);
        this.f3769d = a01Var2;
        return a01Var2;
    }
}
