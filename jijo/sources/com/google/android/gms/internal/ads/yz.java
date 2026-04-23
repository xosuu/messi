package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class yz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f11074b;

    public /* synthetic */ yz(Map map, Map map2) {
        this.f11073a = map;
        this.f11074b = map2;
    }

    public synchronized Map a() {
        try {
            if (this.f11074b == null) {
                this.f11074b = Collections.unmodifiableMap(new HashMap(this.f11073a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f11074b;
    }

    public void b(z61 z61Var) throws GeneralSecurityException {
        if (z61Var == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        b71 b71Var = new b71(z61Var.f11166a, z61Var.f11167b);
        Map map = this.f11073a;
        if (!map.containsKey(b71Var)) {
            map.put(b71Var, z61Var);
            return;
        }
        z61 z61Var2 = (z61) map.get(b71Var);
        if (!z61Var2.equals(z61Var) || !z61Var.equals(z61Var2)) {
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(b71Var.toString()));
        }
    }

    public Enum c(Object obj) throws GeneralSecurityException {
        Enum r02 = (Enum) this.f11074b.get(obj);
        if (r02 != null) {
            return r02;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public Object d(Enum r32) throws GeneralSecurityException {
        Object obj = this.f11073a.get(r32);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r32)));
    }

    public yz() {
        this.f11073a = new HashMap();
    }

    public /* synthetic */ yz(int i10) {
        this.f11073a = new HashMap();
        this.f11074b = new HashMap();
    }

    public /* synthetic */ yz(c71 c71Var) {
        this.f11073a = new HashMap(c71Var.f3226a);
        this.f11074b = new HashMap(c71Var.f3227b);
    }
}
