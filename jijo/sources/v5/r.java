package v5;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class r implements Cloneable {
    public static final Class[] A;
    public static final HashMap B;
    public static final HashMap C;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final d5.e f17855w = new d5.e();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c2.n f17856x = new c2.n(29, 0);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Class[] f17857y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Class[] f17858z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f17859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5.c f17860b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Class f17863h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public s f17867u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Object f17868v;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f17861d = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Method f17862f = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public l.q f17864q = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ReentrantReadWriteLock f17865s = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object[] f17866t = new Object[1];

    static {
        Class cls = Float.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        f17857y = new Class[]{cls, Float.class, cls2, cls3, Double.class, Integer.class};
        f17858z = new Class[]{cls3, Integer.class, cls, cls2, Float.class, Double.class};
        A = new Class[]{cls2, Double.class, cls, cls3, Float.class, Integer.class};
        B = new HashMap();
        C = new HashMap();
    }

    public r(String str) {
        this.f17859a = str;
    }

    public static r e(String str, k... kVarArr) {
        l.q qVar;
        int length = kVarArr.length;
        boolean z9 = false;
        boolean z10 = false;
        for (k kVar : kVarArr) {
            if (kVar instanceof j) {
                z9 = true;
            } else {
                z10 = true;
            }
        }
        if (!z9 || z10) {
            qVar = new l.q(kVarArr);
        } else {
            j[] jVarArr = new j[length];
            for (int i10 = 0; i10 < length; i10++) {
                jVarArr[i10] = (j) kVarArr[i10];
            }
            qVar = new h(jVarArr);
        }
        if (qVar instanceof i) {
            q qVar2 = new q(str);
            qVar2.f17863h = Integer.TYPE;
            qVar2.f17864q = (i) qVar;
            return qVar2;
        }
        if (!(qVar instanceof h)) {
            r rVar = new r(str);
            rVar.f17864q = qVar;
            rVar.f17863h = kVarArr[0].f17836b;
            return rVar;
        }
        h hVar = (h) qVar;
        p pVar = new p(str);
        pVar.f17863h = Float.TYPE;
        pVar.f17864q = hVar;
        pVar.D = hVar;
        return pVar;
    }

    public void a(float f10) {
        this.f17868v = this.f17864q.g(f10);
    }

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r clone() {
        try {
            r rVar = (r) super.clone();
            rVar.f17859a = this.f17859a;
            rVar.f17860b = this.f17860b;
            rVar.f17864q = this.f17864q.clone();
            rVar.f17867u = this.f17867u;
            return rVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Object c() {
        return this.f17868v;
    }

    public final Method d(Class cls, String str, Class cls2) {
        String str2 = this.f17859a;
        if (str2 != null && str2.length() != 0) {
            str = str + Character.toUpperCase(str2.charAt(0)) + str2.substring(1);
        }
        Method declaredMethod = null;
        if (cls2 == null) {
            try {
                return cls.getMethod(str, null);
            } catch (NoSuchMethodException e10) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, null);
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException unused) {
                    e10.toString();
                }
            }
        } else {
            Class<?>[] clsArr = new Class[1];
            for (Class<?> cls3 : this.f17863h.equals(Float.class) ? f17857y : this.f17863h.equals(Integer.class) ? f17858z : this.f17863h.equals(Double.class) ? A : new Class[]{this.f17863h}) {
                clsArr[0] = cls3;
                try {
                    try {
                        Method method = cls.getMethod(str, clsArr);
                        this.f17863h = cls3;
                        return method;
                    } catch (NoSuchMethodException unused2) {
                    }
                } catch (NoSuchMethodException unused3) {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    declaredMethod.setAccessible(true);
                    this.f17863h = cls3;
                    return declaredMethod;
                }
            }
            Objects.toString(this.f17863h);
        }
        return declaredMethod;
    }

    public void f(Object obj) {
        Object[] objArr = this.f17866t;
        w5.c cVar = this.f17860b;
        if (cVar != null) {
            cVar.b(obj, c());
        }
        if (this.f17861d != null) {
            try {
                objArr[0] = c();
                this.f17861d.invoke(obj, objArr);
            } catch (IllegalAccessException e10) {
                e10.toString();
            } catch (InvocationTargetException e11) {
                e11.toString();
            }
        }
    }

    public void g(Class cls) {
        this.f17861d = h(cls, B, "set", this.f17863h);
    }

    public final Method h(Class cls, HashMap map, String str, Class cls2) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f17865s;
        try {
            reentrantReadWriteLock.writeLock().lock();
            HashMap map2 = (HashMap) map.get(cls);
            Method methodD = map2 != null ? (Method) map2.get(this.f17859a) : null;
            if (methodD == null) {
                methodD = d(cls, str, cls2);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(cls, map2);
                }
                map2.put(this.f17859a, methodD);
            }
            reentrantReadWriteLock.writeLock().unlock();
            return methodD;
        } catch (Throwable th) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th;
        }
    }

    public final String toString() {
        return this.f17859a + ": " + this.f17864q.toString();
    }
}
