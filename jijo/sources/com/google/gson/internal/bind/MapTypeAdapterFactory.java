package com.google.gson.internal.bind;

import c2.n;
import com.google.android.gms.internal.ads.en1;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.l;
import com.google.gson.j;
import com.google.gson.m;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import l.a0;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class MapTypeAdapterFactory implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f12082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f12083b = false;

    public final class Adapter<K, V> extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f12084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x f12085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f12086c;

        public Adapter(j jVar, Type type, x xVar, Type type2, x xVar2, l lVar) {
            this.f12084a = new TypeAdapterRuntimeTypeWrapper(jVar, xVar, type);
            this.f12085b = new TypeAdapterRuntimeTypeWrapper(jVar, xVar2, type2);
            this.f12086c = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.x
        public final Object b(s5.a aVar) throws IOException {
            int iT = aVar.T();
            if (iT == 9) {
                aVar.P();
                return null;
            }
            Map map = (Map) this.f12086c.f();
            x xVar = this.f12085b;
            x xVar2 = this.f12084a;
            if (iT == 1) {
                aVar.a();
                while (aVar.G()) {
                    aVar.a();
                    Object objB = ((TypeAdapterRuntimeTypeWrapper) xVar2).f12117b.b(aVar);
                    if (map.put(objB, ((TypeAdapterRuntimeTypeWrapper) xVar).f12117b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objB);
                    }
                    aVar.A();
                }
                aVar.A();
            } else {
                aVar.c();
                while (aVar.G()) {
                    n.f1535d.getClass();
                    int iU = aVar.f16716t;
                    if (iU == 0) {
                        iU = aVar.u();
                    }
                    if (iU == 13) {
                        aVar.f16716t = 9;
                    } else if (iU == 12) {
                        aVar.f16716t = 8;
                    } else {
                        if (iU != 14) {
                            throw new IllegalStateException("Expected a name but was " + a0.u(aVar.T()) + aVar.I());
                        }
                        aVar.f16716t = 10;
                    }
                    Object objB2 = ((TypeAdapterRuntimeTypeWrapper) xVar2).f12117b.b(aVar);
                    if (map.put(objB2, ((TypeAdapterRuntimeTypeWrapper) xVar).f12117b.b(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + objB2);
                    }
                }
                aVar.D();
            }
            return map;
        }

        @Override // com.google.gson.x
        public final void c(s5.b bVar, Object obj) throws IOException {
            String strC;
            Map map = (Map) obj;
            if (map == null) {
                bVar.G();
                return;
            }
            boolean z9 = MapTypeAdapterFactory.this.f12083b;
            x xVar = this.f12085b;
            if (!z9) {
                bVar.e();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    bVar.E(String.valueOf(entry.getKey()));
                    xVar.c(bVar, entry.getValue());
                }
                bVar.D();
                return;
            }
            ArrayList arrayList = new ArrayList(map.size());
            ArrayList arrayList2 = new ArrayList(map.size());
            int i10 = 0;
            boolean z10 = false;
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                x xVar2 = this.f12084a;
                K key = entry2.getKey();
                xVar2.getClass();
                try {
                    d dVar = new d();
                    xVar2.c(dVar, key);
                    ArrayList arrayList3 = dVar.f12138y;
                    if (!arrayList3.isEmpty()) {
                        throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                    }
                    m mVar = dVar.A;
                    arrayList.add(mVar);
                    arrayList2.add(entry2.getValue());
                    mVar.getClass();
                    z10 |= (mVar instanceof com.google.gson.l) || (mVar instanceof o);
                } catch (IOException e10) {
                    throw new JsonIOException(e10);
                }
            }
            if (z10) {
                bVar.c();
                int size = arrayList.size();
                while (i10 < size) {
                    bVar.c();
                    g.f12179z.c(bVar, (m) arrayList.get(i10));
                    xVar.c(bVar, arrayList2.get(i10));
                    bVar.A();
                    i10++;
                }
                bVar.A();
                return;
            }
            bVar.e();
            int size2 = arrayList.size();
            while (i10 < size2) {
                m mVar2 = (m) arrayList.get(i10);
                mVar2.getClass();
                boolean z11 = mVar2 instanceof p;
                if (z11) {
                    if (!z11) {
                        throw new IllegalStateException("Not a JSON Primitive: " + mVar2);
                    }
                    p pVar = (p) mVar2;
                    Serializable serializable = pVar.f12258a;
                    if (serializable instanceof Number) {
                        strC = String.valueOf(pVar.b());
                    } else if (serializable instanceof Boolean) {
                        strC = Boolean.toString(serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(pVar.c()));
                    } else {
                        if (!(serializable instanceof String)) {
                            throw new AssertionError();
                        }
                        strC = pVar.c();
                    }
                } else {
                    if (!(mVar2 instanceof com.google.gson.n)) {
                        throw new AssertionError();
                    }
                    strC = "null";
                }
                bVar.E(strC);
                xVar.c(bVar, arrayList2.get(i10));
                i10++;
            }
            bVar.D();
        }
    }

    public MapTypeAdapterFactory(d0 d0Var) {
        this.f12082a = d0Var;
    }

    @Override // com.google.gson.y
    public final x a(j jVar, r5.a aVar) {
        Type[] actualTypeArguments;
        Type type = aVar.f16537b;
        Class cls = aVar.f16536a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            en1.e(Map.class.isAssignableFrom(cls));
            Type typeG = com.google.gson.internal.d.g(type, cls, com.google.gson.internal.d.e(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeG instanceof ParameterizedType ? ((ParameterizedType) typeG).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new Adapter(jVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? g.f12156c : jVar.c(new r5.a(type2)), actualTypeArguments[1], jVar.c(new r5.a(actualTypeArguments[1])), this.f12082a.d(aVar));
    }
}
