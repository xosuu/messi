package com.google.gson.internal;

import java.lang.reflect.Method;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class q extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f12212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f12213c;

    public q(Object obj, Method method) {
        this.f12212b = method;
        this.f12213c = obj;
    }

    @Override // com.google.gson.internal.u
    public final Object a(Class cls) {
        String strC = d0.c(cls);
        if (strC == null) {
            return this.f12212b.invoke(this.f12213c, cls);
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
    }
}
