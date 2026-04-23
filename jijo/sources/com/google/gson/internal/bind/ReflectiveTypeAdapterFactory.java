package com.google.gson.internal.bind;

import com.google.android.gms.internal.ads.en1;
import com.google.android.gms.internal.ads.fb1;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.i;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.l;
import com.google.gson.internal.o;
import com.google.gson.j;
import com.google.gson.x;
import com.google.gson.y;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v3.d0;

/* JADX INFO: loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f12095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f12096b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Excluder f12097d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f12098f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f12099h;

    public static abstract class Adapter<T, A> extends x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f12100a;

        public Adapter(LinkedHashMap linkedHashMap) {
            this.f12100a = linkedHashMap;
        }

        @Override // com.google.gson.x
        public final Object b(s5.a aVar) throws IOException {
            if (aVar.T() == 9) {
                aVar.P();
                return null;
            }
            Object objD = d();
            try {
                aVar.c();
                while (aVar.G()) {
                    e eVar = (e) this.f12100a.get(aVar.N());
                    if (eVar == null || !eVar.f12143d) {
                        aVar.Z();
                    } else {
                        f(objD, aVar, eVar);
                    }
                }
                aVar.D();
                return e(objD);
            } catch (IllegalAccessException e10) {
                t.a aVar2 = q5.c.f16437a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalStateException e11) {
                throw new JsonSyntaxException(e11);
            }
        }

        @Override // com.google.gson.x
        public final void c(s5.b bVar, Object obj) throws IOException {
            if (obj == null) {
                bVar.G();
                return;
            }
            bVar.e();
            try {
                Iterator it = this.f12100a.values().iterator();
                while (it.hasNext()) {
                    ((e) it.next()).a(bVar, obj);
                }
                bVar.D();
            } catch (IllegalAccessException e10) {
                t.a aVar = q5.c.f16437a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            }
        }

        public abstract Object d();

        public abstract Object e(Object obj);

        public abstract void f(Object obj, s5.a aVar, e eVar);
    }

    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l f12101b;

        public FieldReflectionAdapter(l lVar, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f12101b = lVar;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return this.f12101b.f();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            return obj;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, s5.a aVar, e eVar) throws IllegalAccessException {
            Object objB = eVar.f12148i.b(aVar);
            if (objB == null && eVar.f12151l) {
                return;
            }
            boolean z9 = eVar.f12144e;
            Field field = eVar.f12146g;
            if (z9) {
                ReflectiveTypeAdapterFactory.b(obj, field);
            } else if (eVar.f12152m) {
                throw new JsonIOException(g1.a.q("Cannot set value of 'static final' ", q5.c.c(field, false)));
            }
            field.set(obj, objB);
        }
    }

    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final HashMap f12102e;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Constructor f12103b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object[] f12104c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HashMap f12105d;

        static {
            HashMap map = new HashMap();
            map.put(Byte.TYPE, (byte) 0);
            map.put(Short.TYPE, (short) 0);
            map.put(Integer.TYPE, 0);
            map.put(Long.TYPE, 0L);
            map.put(Float.TYPE, Float.valueOf(0.0f));
            map.put(Double.TYPE, Double.valueOf(0.0d));
            map.put(Character.TYPE, (char) 0);
            map.put(Boolean.TYPE, Boolean.FALSE);
            f12102e = map;
        }

        public RecordAdapter(Class cls, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f12105d = new HashMap();
            t.a aVar = q5.c.f16437a;
            Constructor constructorH = aVar.h(cls);
            this.f12103b = constructorH;
            q5.c.d(constructorH);
            String[] strArrI = aVar.i(cls);
            for (int i10 = 0; i10 < strArrI.length; i10++) {
                this.f12105d.put(strArrI[i10], Integer.valueOf(i10));
            }
            Class<?>[] parameterTypes = this.f12103b.getParameterTypes();
            this.f12104c = new Object[parameterTypes.length];
            for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                this.f12104c[i11] = f12102e.get(parameterTypes[i11]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object d() {
            return (Object[]) this.f12104c.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object e(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f12103b;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e10) {
                t.a aVar = q5.c.f16437a;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
            } catch (IllegalArgumentException e11) {
                e = e11;
                throw new RuntimeException("Failed to invoke constructor '" + q5.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e12) {
                e = e12;
                throw new RuntimeException("Failed to invoke constructor '" + q5.c.b(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Failed to invoke constructor '" + q5.c.b(constructor) + "' with args " + Arrays.toString(objArr), e13.getCause());
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void f(Object obj, s5.a aVar, e eVar) {
            Object[] objArr = (Object[]) obj;
            HashMap map = this.f12105d;
            String str = eVar.f12141b;
            Integer num = (Integer) map.get(str);
            if (num == null) {
                throw new IllegalStateException("Could not find the index in the constructor '" + q5.c.b(this.f12103b) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
            }
            int iIntValue = num.intValue();
            Object objB = eVar.f12148i.b(aVar);
            if (objB != null || !eVar.f12151l) {
                objArr[iIntValue] = objB;
            } else {
                StringBuilder sbK = fb1.k("null is not allowed as value for record component '", str, "' of primitive type; at path ");
                sbK.append(aVar.F(false));
                throw new JsonParseException(sbK.toString());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(d0 d0Var, com.google.gson.a aVar, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        this.f12095a = d0Var;
        this.f12096b = aVar;
        this.f12097d = excluder;
        this.f12098f = jsonAdapterAnnotationTypeAdapterFactory;
        this.f12099h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (!o.f12211a.a(obj, accessibleObject)) {
            throw new JsonIOException(g1.a.y(q5.c.c(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
        }
    }

    @Override // com.google.gson.y
    public final x a(j jVar, r5.a aVar) {
        Class cls = aVar.f16536a;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        en1.q(this.f12099h);
        return q5.c.f16437a.j(cls) ? new RecordAdapter(cls, c(jVar, aVar, cls, true)) : new FieldReflectionAdapter(this.f12095a.d(aVar), c(jVar, aVar, cls, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0217, code lost:
    
        r39 = r11;
        r12 = new r5.a(com.google.gson.internal.d.g(r1, r39, r39.getGenericSuperclass(), new java.util.HashMap()));
        r11 = r12.f16536a;
        r15 = r38;
        r14 = r14;
        r13 = r13;
        r0 = r37;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e1 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashMap c(com.google.gson.j r38, r5.a r39, java.lang.Class r40, boolean r41) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.c(com.google.gson.j, r5.a, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(java.lang.reflect.Field r8, boolean r9) {
        /*
            r7 = this;
            java.lang.Class r0 = r8.getType()
            com.google.gson.internal.Excluder r1 = r7.f12097d
            boolean r0 = r1.b(r0)
            if (r0 != 0) goto L93
            r1.c(r9)
            int r0 = r8.getModifiers()
            int r2 = r1.f12057b
            r0 = r0 & r2
            if (r0 == 0) goto L1a
            goto L93
        L1a:
            double r2 = r1.f12056a
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L48
            java.lang.Class<o5.c> r0 = o5.c.class
            java.lang.annotation.Annotation r0 = r8.getAnnotation(r0)
            o5.c r0 = (o5.c) r0
            java.lang.Class<o5.d> r2 = o5.d.class
            java.lang.annotation.Annotation r2 = r8.getAnnotation(r2)
            o5.d r2 = (o5.d) r2
            double r3 = r1.f12056a
            if (r0 == 0) goto L3e
            double r5 = r0.value()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L93
        L3e:
            if (r2 == 0) goto L48
            double r5 = r2.value()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L93
        L48:
            boolean r0 = r8.isSynthetic()
            if (r0 == 0) goto L4f
            goto L93
        L4f:
            boolean r0 = r1.f12058d
            if (r0 != 0) goto L65
            java.lang.Class r0 = r8.getType()
            boolean r2 = r0.isMemberClass()
            if (r2 == 0) goto L65
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L93
        L65:
            java.lang.Class r8 = r8.getType()
            boolean r8 = com.google.gson.internal.Excluder.d(r8)
            if (r8 == 0) goto L70
            goto L93
        L70:
            if (r9 == 0) goto L75
            java.util.List r8 = r1.f12059f
            goto L77
        L75:
            java.util.List r8 = r1.f12060h
        L77:
            boolean r9 = r8.isEmpty()
            if (r9 != 0) goto L91
            java.util.Iterator r8 = r8.iterator()
            boolean r9 = r8.hasNext()
            if (r9 != 0) goto L88
            goto L91
        L88:
            java.lang.Object r8 = r8.next()
            com.google.android.gms.internal.ads.fb1.t(r8)
            r8 = 0
            throw r8
        L91:
            r8 = 1
            goto L94
        L93:
            r8 = 0
        L94:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.d(java.lang.reflect.Field, boolean):boolean");
    }
}
