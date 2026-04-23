package com.google.gson;

import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f12231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f12232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d0 f12233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f12234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12235e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12236f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f12237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12238h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f12239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f12240j;

    /* JADX WARN: Illegal instructions before constructor call */
    public j() {
        Excluder excluder = Excluder.f12055q;
        a aVar = h.f12053a;
        Map mapEmptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        this(excluder, aVar, mapEmptyMap, true, false, true, 1, Collections.emptyList(), v.f12259a, v.f12260b, Collections.emptyList());
    }

    public static void a(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public final Object b(Class cls, String str) {
        r5.a aVar = new r5.a(cls);
        Object objB = null;
        if (str != null) {
            s5.a aVar2 = new s5.a(new StringReader(str));
            boolean z9 = this.f12240j;
            boolean z10 = true;
            aVar2.f16710b = true;
            try {
                try {
                    try {
                        aVar2.T();
                        z10 = false;
                        objB = c(aVar).b(aVar2);
                    } catch (EOFException e10) {
                        if (!z10) {
                            throw new JsonSyntaxException(e10);
                        }
                    } catch (IllegalStateException e11) {
                        throw new JsonSyntaxException(e11);
                    }
                    if (objB != null) {
                        try {
                            if (aVar2.T() != 10) {
                                throw new JsonSyntaxException("JSON document was not fully consumed.");
                            }
                        } catch (MalformedJsonException e12) {
                            throw new JsonSyntaxException(e12);
                        } catch (IOException e13) {
                            throw new JsonIOException(e13);
                        }
                    }
                } catch (IOException e14) {
                    throw new JsonSyntaxException(e14);
                } catch (AssertionError e15) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e15.getMessage());
                    assertionError.initCause(e15);
                    throw assertionError;
                }
            } finally {
                aVar2.f16710b = z9;
            }
        }
        if (cls == Integer.TYPE) {
            cls = Integer.class;
        } else if (cls == Float.TYPE) {
            cls = Float.class;
        } else if (cls == Byte.TYPE) {
            cls = Byte.class;
        } else if (cls == Double.TYPE) {
            cls = Double.class;
        } else if (cls == Long.TYPE) {
            cls = Long.class;
        } else if (cls == Character.TYPE) {
            cls = Character.class;
        } else if (cls == Boolean.TYPE) {
            cls = Boolean.class;
        } else if (cls == Short.TYPE) {
            cls = Short.class;
        } else if (cls == Void.TYPE) {
            cls = Void.class;
        }
        return cls.cast(objB);
    }

    public final x c(r5.a aVar) {
        boolean z9;
        ConcurrentHashMap concurrentHashMap = this.f12232b;
        x xVar = (x) concurrentHashMap.get(aVar);
        if (xVar != null) {
            return xVar;
        }
        ThreadLocal threadLocal = this.f12231a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z9 = true;
        } else {
            z9 = false;
        }
        Gson$FutureTypeAdapter gson$FutureTypeAdapter = (Gson$FutureTypeAdapter) map.get(aVar);
        if (gson$FutureTypeAdapter != null) {
            return gson$FutureTypeAdapter;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter2 = new Gson$FutureTypeAdapter();
            map.put(aVar, gson$FutureTypeAdapter2);
            Iterator it = this.f12235e.iterator();
            while (it.hasNext()) {
                x xVarA = ((y) it.next()).a(this, aVar);
                if (xVarA != null) {
                    x xVar2 = (x) concurrentHashMap.putIfAbsent(aVar, xVarA);
                    if (xVar2 != null) {
                        xVarA = xVar2;
                    }
                    if (gson$FutureTypeAdapter2.f12051a != null) {
                        throw new AssertionError();
                    }
                    gson$FutureTypeAdapter2.f12051a = xVarA;
                    map.remove(aVar);
                    if (z9) {
                        threadLocal.remove();
                    }
                    return xVarA;
                }
            }
            throw new IllegalArgumentException("GSON (2.10) cannot handle " + aVar);
        } catch (Throwable th) {
            map.remove(aVar);
            if (z9) {
                threadLocal.remove();
            }
            throw th;
        }
    }

    public final x d(y yVar, r5.a aVar) {
        List<y> list = this.f12235e;
        if (!list.contains(yVar)) {
            yVar = this.f12234d;
        }
        boolean z9 = false;
        for (y yVar2 : list) {
            if (z9) {
                x xVarA = yVar2.a(this, aVar);
                if (xVarA != null) {
                    return xVarA;
                }
            } else if (yVar2 == yVar) {
                z9 = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public final s5.b e(Writer writer) throws IOException {
        if (this.f12237g) {
            writer.write(")]}'\n");
        }
        s5.b bVar = new s5.b(writer);
        if (this.f12239i) {
            bVar.f16729f = "  ";
            bVar.f16730h = ": ";
        }
        bVar.f16732s = this.f12238h;
        bVar.f16731q = this.f12240j;
        bVar.f16734u = this.f12236f;
        return bVar;
    }

    public final String f(m mVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            h(mVar, e(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final String g(Object obj) {
        if (obj == null) {
            return f(n.f12256a);
        }
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            i(obj, cls, e(stringWriter));
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new JsonIOException(e10);
        }
    }

    public final void h(m mVar, s5.b bVar) {
        boolean z9 = bVar.f16731q;
        bVar.f16731q = true;
        boolean z10 = bVar.f16732s;
        bVar.f16732s = this.f12238h;
        boolean z11 = bVar.f16734u;
        bVar.f16734u = this.f12236f;
        try {
            try {
                com.google.gson.internal.bind.g.f12179z.c(bVar, mVar);
                bVar.f16731q = z9;
                bVar.f16732s = z10;
                bVar.f16734u = z11;
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } catch (Throwable th) {
            bVar.f16731q = z9;
            bVar.f16732s = z10;
            bVar.f16734u = z11;
            throw th;
        }
    }

    public final void i(Object obj, Class cls, s5.b bVar) {
        x xVarC = c(new r5.a(cls));
        boolean z9 = bVar.f16731q;
        bVar.f16731q = true;
        boolean z10 = bVar.f16732s;
        bVar.f16732s = this.f12238h;
        boolean z11 = bVar.f16734u;
        bVar.f16734u = this.f12236f;
        try {
            try {
                xVarC.c(bVar, obj);
            } catch (IOException e10) {
                throw new JsonIOException(e10);
            } catch (AssertionError e11) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.10): " + e11.getMessage());
                assertionError.initCause(e11);
                throw assertionError;
            }
        } finally {
            bVar.f16731q = z9;
            bVar.f16732s = z10;
            bVar.f16734u = z11;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f12236f + ",factories:" + this.f12235e + ",instanceCreators:" + this.f12233c + "}";
    }

    public j(Excluder excluder, a aVar, Map map, boolean z9, boolean z10, boolean z11, int i10, List list, r rVar, s sVar, List list2) {
        final x xVar;
        y yVarD;
        this.f12231a = new ThreadLocal();
        this.f12232b = new ConcurrentHashMap();
        d0 d0Var = new d0(map, z11, list2);
        this.f12233c = d0Var;
        this.f12236f = false;
        this.f12237g = false;
        this.f12238h = z9;
        this.f12239i = z10;
        this.f12240j = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.g.A);
        arrayList.add(ObjectTypeAdapter.d(rVar));
        arrayList.add(excluder);
        arrayList.addAll(list);
        arrayList.add(com.google.gson.internal.bind.g.f12169p);
        arrayList.add(com.google.gson.internal.bind.g.f12160g);
        arrayList.add(com.google.gson.internal.bind.g.f12157d);
        arrayList.add(com.google.gson.internal.bind.g.f12158e);
        arrayList.add(com.google.gson.internal.bind.g.f12159f);
        if (i10 == 1) {
            xVar = com.google.gson.internal.bind.g.f12164k;
        } else {
            xVar = new x() { // from class: com.google.gson.Gson$3
                @Override // com.google.gson.x
                public final Object b(s5.a aVar2) {
                    if (aVar2.T() != 9) {
                        return Long.valueOf(aVar2.M());
                    }
                    aVar2.P();
                    return null;
                }

                @Override // com.google.gson.x
                public final void c(s5.b bVar, Object obj) throws IOException {
                    Number number = (Number) obj;
                    if (number == null) {
                        bVar.G();
                    } else {
                        bVar.N(number.toString());
                    }
                }
            };
        }
        arrayList.add(com.google.gson.internal.bind.g.b(Long.TYPE, Long.class, xVar));
        arrayList.add(com.google.gson.internal.bind.g.b(Double.TYPE, Double.class, new Gson$1()));
        arrayList.add(com.google.gson.internal.bind.g.b(Float.TYPE, Float.class, new Gson$2()));
        if (sVar == v.f12260b) {
            yVarD = NumberTypeAdapter.f12088b;
        } else {
            yVarD = NumberTypeAdapter.d(sVar);
        }
        arrayList.add(yVarD);
        arrayList.add(com.google.gson.internal.bind.g.f12161h);
        arrayList.add(com.google.gson.internal.bind.g.f12162i);
        arrayList.add(com.google.gson.internal.bind.g.a(AtomicLong.class, new TypeAdapter$1(new x() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.x
            public final Object b(s5.a aVar2) {
                return new AtomicLong(((Number) xVar.b(aVar2)).longValue());
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) {
                xVar.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
            }
        })));
        arrayList.add(com.google.gson.internal.bind.g.a(AtomicLongArray.class, new TypeAdapter$1(new x() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.x
            public final Object b(s5.a aVar2) throws IOException {
                ArrayList arrayList2 = new ArrayList();
                aVar2.a();
                while (aVar2.G()) {
                    arrayList2.add(Long.valueOf(((Number) xVar.b(aVar2)).longValue()));
                }
                aVar2.A();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList2.get(i11)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.x
            public final void c(s5.b bVar, Object obj) throws IOException {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.c();
                int length = atomicLongArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    xVar.c(bVar, Long.valueOf(atomicLongArray.get(i11)));
                }
                bVar.A();
            }
        })));
        arrayList.add(com.google.gson.internal.bind.g.f12163j);
        arrayList.add(com.google.gson.internal.bind.g.f12165l);
        arrayList.add(com.google.gson.internal.bind.g.f12170q);
        arrayList.add(com.google.gson.internal.bind.g.f12171r);
        arrayList.add(com.google.gson.internal.bind.g.a(BigDecimal.class, com.google.gson.internal.bind.g.f12166m));
        arrayList.add(com.google.gson.internal.bind.g.a(BigInteger.class, com.google.gson.internal.bind.g.f12167n));
        arrayList.add(com.google.gson.internal.bind.g.a(com.google.gson.internal.f.class, com.google.gson.internal.bind.g.f12168o));
        arrayList.add(com.google.gson.internal.bind.g.f12172s);
        arrayList.add(com.google.gson.internal.bind.g.f12173t);
        arrayList.add(com.google.gson.internal.bind.g.f12175v);
        arrayList.add(com.google.gson.internal.bind.g.f12176w);
        arrayList.add(com.google.gson.internal.bind.g.f12178y);
        arrayList.add(com.google.gson.internal.bind.g.f12174u);
        arrayList.add(com.google.gson.internal.bind.g.f12155b);
        arrayList.add(DateTypeAdapter.f12077b);
        arrayList.add(com.google.gson.internal.bind.g.f12177x);
        if (com.google.gson.internal.sql.b.f12224a) {
            arrayList.add(com.google.gson.internal.sql.b.f12228e);
            arrayList.add(com.google.gson.internal.sql.b.f12227d);
            arrayList.add(com.google.gson.internal.sql.b.f12229f);
        }
        arrayList.add(ArrayTypeAdapter.f12071c);
        arrayList.add(com.google.gson.internal.bind.g.f12154a);
        arrayList.add(new CollectionTypeAdapterFactory(d0Var));
        arrayList.add(new MapTypeAdapterFactory(d0Var));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(d0Var);
        this.f12234d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.g.B);
        arrayList.add(new ReflectiveTypeAdapterFactory(d0Var, aVar, excluder, jsonAdapterAnnotationTypeAdapterFactory, list2));
        this.f12235e = Collections.unmodifiableList(arrayList);
    }
}
