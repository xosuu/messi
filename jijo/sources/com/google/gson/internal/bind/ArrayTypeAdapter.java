package com.google.gson.internal.bind;

import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends x {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f12071c = new y() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.y
        public final x a(j jVar, r5.a aVar) {
            Type type = aVar.f16537b;
            boolean z9 = type instanceof GenericArrayType;
            if (!z9 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z9 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new ArrayTypeAdapter(jVar, jVar.c(new r5.a(genericComponentType)), com.google.gson.internal.d.f(genericComponentType));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f12072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f12073b;

    public ArrayTypeAdapter(j jVar, x xVar, Class cls) {
        this.f12073b = new TypeAdapterRuntimeTypeWrapper(jVar, xVar, cls);
        this.f12072a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.x
    public final Object b(s5.a aVar) throws IOException {
        if (aVar.T() == 9) {
            aVar.P();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.G()) {
            arrayList.add(((TypeAdapterRuntimeTypeWrapper) this.f12073b).f12117b.b(aVar));
        }
        aVar.A();
        int size = arrayList.size();
        Class cls = this.f12072a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i10 = 0; i10 < size; i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.x
    public final void c(s5.b bVar, Object obj) throws IOException {
        if (obj == null) {
            bVar.G();
            return;
        }
        bVar.c();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f12073b.c(bVar, Array.get(obj, i10));
        }
        bVar.A();
    }
}
