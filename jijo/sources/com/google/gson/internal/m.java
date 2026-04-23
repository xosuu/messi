package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f12210b;

    public m(Method method) {
        this.f12210b = method;
    }

    @Override // com.google.gson.internal.o
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f12210b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e10) {
            throw new RuntimeException("Failed invoking canAccess", e10);
        }
    }
}
