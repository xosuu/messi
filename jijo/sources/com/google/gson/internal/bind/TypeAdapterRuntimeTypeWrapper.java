package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.x;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
final class TypeAdapterRuntimeTypeWrapper<T> extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f12117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Type f12118c;

    public TypeAdapterRuntimeTypeWrapper(j jVar, x xVar, Type type) {
        this.f12116a = jVar;
        this.f12117b = xVar;
        this.f12118c = type;
    }

    @Override // com.google.gson.x
    public final Object b(s5.a aVar) {
        return this.f12117b.b(aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    @Override // com.google.gson.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(s5.b r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.f12118c
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.x r2 = r4.f12117b
            if (r1 == r0) goto L3d
            r5.a r0 = new r5.a
            r0.<init>(r1)
            com.google.gson.j r1 = r4.f12116a
            com.google.gson.x r0 = r1.c(r0)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L26
            goto L3c
        L26:
            r1 = r2
        L27:
            boolean r3 = r1 instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
            if (r3 == 0) goto L37
            r3 = r1
            com.google.gson.internal.bind.SerializationDelegatingTypeAdapter r3 = (com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) r3
            com.google.gson.x r3 = r3.d()
            if (r3 != r1) goto L35
            goto L37
        L35:
            r1 = r3
            goto L27
        L37:
            boolean r1 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r0
        L3d:
            r2.c(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper.c(s5.b, java.lang.Object):void");
    }
}
