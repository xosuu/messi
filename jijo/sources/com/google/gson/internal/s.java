package com.google.gson.internal;

import java.lang.reflect.Method;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f12216b;

    public s(Method method) {
        this.f12216b = method;
    }

    @Override // com.google.gson.internal.u
    public final Object a(Class cls) {
        String strC = d0.c(cls);
        if (strC == null) {
            return this.f12216b.invoke(null, cls, Object.class);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
    }
}
