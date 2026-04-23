package t1;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.startup.StartupException;
import g4.z;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f16814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f16815e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f16818c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f16817b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16816a = new HashMap();

    public a(Context context) {
        this.f16818c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f16814d == null) {
            synchronized (f16815e) {
                try {
                    if (f16814d == null) {
                        f16814d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f16814d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f16818c.getString(R.string.bj);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f16817b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new StartupException(e10);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (z.p()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap map = this.f16816a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f16818c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
