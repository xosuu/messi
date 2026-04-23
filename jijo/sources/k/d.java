package k;

import android.content.Context;
import android.view.MenuItem;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f14501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s.j f14503c;

    public d(Context context) {
        this.f14501a = context;
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void c();

    public abstract Object d(int i10, int i11);

    public abstract s.b e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i10);

    public abstract Object k(int i10, Object obj);

    public final MenuItem m(MenuItem menuItem) {
        if (!(menuItem instanceof i0.b)) {
            return menuItem;
        }
        i0.b bVar = (i0.b) menuItem;
        if (((s.k) this.f14502b) == null) {
            this.f14502b = new s.k();
        }
        MenuItem menuItem2 = (MenuItem) ((s.k) this.f14502b).getOrDefault(bVar, null);
        if (menuItem2 != null) {
            return menuItem2;
        }
        x xVar = new x((Context) this.f14501a, bVar);
        ((s.k) this.f14502b).put(bVar, xVar);
        return xVar;
    }

    public final Object[] o(int i10, Object[] objArr) {
        int iF = f();
        if (objArr.length < iF) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iF);
        }
        for (int i11 = 0; i11 < iF; i11++) {
            objArr[i11] = d(i11, i10);
        }
        if (objArr.length > iF) {
            objArr[iF] = null;
        }
        return objArr;
    }
}
