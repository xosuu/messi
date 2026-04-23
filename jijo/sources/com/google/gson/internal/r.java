package com.google.gson.internal;

import java.lang.reflect.Method;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f12214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12215c;

    public r(int i10, Method method) {
        this.f12214b = method;
        this.f12215c = i10;
    }

    @Override // com.google.gson.internal.u
    public final Object a(Class cls) {
        String strC = d0.c(cls);
        if (strC == null) {
            return this.f12214b.invoke(null, cls, Integer.valueOf(this.f12215c));
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
    }
}
