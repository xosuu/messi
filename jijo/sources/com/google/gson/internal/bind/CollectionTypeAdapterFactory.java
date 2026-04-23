package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.en1;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class CollectionTypeAdapterFactory implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f12074a;

    public static final class Adapter<E> extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f12075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f12076b;

        public Adapter(j jVar, Type type, x xVar, l lVar) {
            this.f12075a = new TypeAdapterRuntimeTypeWrapper(jVar, xVar, type);
            this.f12076b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.x
        public final Object b(s5.a aVar) throws IOException {
            if (aVar.T() == 9) {
                aVar.P();
                return null;
            }
            Collection collection = (Collection) this.f12076b.f();
            aVar.a();
            while (aVar.G()) {
                collection.add(((TypeAdapterRuntimeTypeWrapper) this.f12075a).f12117b.b(aVar));
            }
            aVar.A();
            return collection;
        }

        @Override // com.google.gson.x
        public final void c(s5.b bVar, Object obj) throws IOException {
            Collection collection = (Collection) obj;
            if (collection == null) {
                bVar.G();
                return;
            }
            bVar.c();
            Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f12075a.c(bVar, it.next());
            }
            bVar.A();
        }
    }

    public CollectionTypeAdapterFactory(d0 d0Var) {
        this.f12074a = d0Var;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, r5.a aVar) {
        Type type = aVar.f16537b;
        Class cls = aVar.f16536a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        en1.e(Collection.class.isAssignableFrom(cls));
        Type typeG = com.google.gson.internal.d.g(type, cls, com.google.gson.internal.d.e(type, cls, Collection.class), new HashMap());
        Class cls2 = typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments()[0] : Object.class;
        return new Adapter(jVar, cls2, jVar.c(new r5.a(cls2)), this.f12074a.d(aVar));
    }
}
