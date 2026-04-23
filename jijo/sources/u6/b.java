package u6;

import com.google.android.gms.internal.ads.en1;
import g4.a0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import t6.l;
import t6.m;
import t6.n;
import t6.o;
import t6.p;
import t6.q;
import t6.r;
import t6.s;
import t6.t;
import t6.u;
import t6.v;
import t6.w;

/* JADX INFO: loaded from: classes.dex */
public final class b implements y6.a, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f17649b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f17650a;

    static {
        int i10 = 0;
        List listAsList = Arrays.asList(t6.a.class, l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, t6.b.class, t6.c.class, t6.d.class, t6.e.class, t6.f.class, t6.g.class, t6.h.class, t6.i.class, t6.j.class, t6.k.class, m.class, n.class, o.class);
        a0.e(listAsList, "asList(this)");
        List list = listAsList;
        ArrayList arrayList = new ArrayList(m6.d.u0(list));
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new l6.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f17649b = m6.i.O0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        a0.e(collectionValues, "primitiveFqNames.values");
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            a0.e(str, "kotlinName");
            sb.append(a7.d.H(str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f17649b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(en1.w(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), a7.d.H((String) entry2.getValue()));
        }
    }

    public b(Class cls) {
        a0.f(cls, "jClass");
        this.f17650a = cls;
    }

    @Override // u6.a
    public final Class a() {
        return this.f17650a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b) && a0.b(en1.s(this), en1.s((y6.a) obj));
    }

    public final int hashCode() {
        return en1.s(this).hashCode();
    }

    public final String toString() {
        return this.f17650a.toString() + " (Kotlin reflection is not available)";
    }
}
