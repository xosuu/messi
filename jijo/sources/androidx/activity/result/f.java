package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.d0;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import androidx.lifecycle.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import t3.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Random f190a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f191b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f192c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f193d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f194e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient HashMap f195f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HashMap f196g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Bundle f197h = new Bundle();

    public final boolean a(int i10, int i11, Intent intent) {
        a aVar;
        String str = (String) this.f191b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d dVar = (d) this.f195f.get(str);
        if (dVar == null || (aVar = dVar.f186a) == null || !this.f194e.contains(str)) {
            this.f196g.remove(str);
            this.f197h.putParcelable(str, new ActivityResult(i11, intent));
            return true;
        }
        aVar.b(dVar.f187b.v(i11, intent));
        this.f194e.remove(str);
        return true;
    }

    public abstract void b(int i10, i iVar, Object obj);

    public final c c(final String str, q qVar, final i iVar, final a aVar) {
        s sVarH = qVar.h();
        if (sVarH.f993e.a(l.f983f)) {
            throw new IllegalStateException("LifecycleOwner " + qVar + " is attempting to register while current state is " + sVarH.f993e + ". LifecycleOwners must call register before they are STARTED.");
        }
        e(str);
        HashMap map = this.f193d;
        e eVar = (e) map.get(str);
        if (eVar == null) {
            eVar = new e(sVarH);
        }
        o oVar = new o() { // from class: androidx.activity.result.ActivityResultRegistry$1
            @Override // androidx.lifecycle.o
            public final void a(q qVar2, k kVar) {
                boolean zEquals = k.ON_START.equals(kVar);
                String str2 = str;
                f fVar = this.f177d;
                if (!zEquals) {
                    if (k.ON_STOP.equals(kVar)) {
                        fVar.f195f.remove(str2);
                        return;
                    } else {
                        if (k.ON_DESTROY.equals(kVar)) {
                            fVar.f(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = fVar.f195f;
                a aVar2 = aVar;
                i iVar2 = iVar;
                map2.put(str2, new d(aVar2, iVar2));
                HashMap map3 = fVar.f196g;
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    aVar2.b(obj);
                }
                Bundle bundle = fVar.f197h;
                ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    aVar2.b(iVar2.v(activityResult.f172a, activityResult.f173b));
                }
            }
        };
        eVar.f188a.a(oVar);
        eVar.f189b.add(oVar);
        map.put(str, eVar);
        return new c(this, str, iVar, 0);
    }

    public final c d(String str, i iVar, d0 d0Var) {
        e(str);
        this.f195f.put(str, new d(d0Var, iVar));
        HashMap map = this.f196g;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            d0Var.b(obj);
        }
        Bundle bundle = this.f197h;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            d0Var.b(iVar.v(activityResult.f172a, activityResult.f173b));
        }
        return new c(this, str, iVar, 1);
    }

    public final void e(String str) {
        HashMap map = this.f192c;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iNextInt = this.f190a.nextInt(2147418112);
        while (true) {
            int i10 = iNextInt + 65536;
            HashMap map2 = this.f191b;
            if (!map2.containsKey(Integer.valueOf(i10))) {
                map2.put(Integer.valueOf(i10), str);
                map.put(str, Integer.valueOf(i10));
                return;
            }
            iNextInt = this.f190a.nextInt(2147418112);
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.f194e.contains(str) && (num = (Integer) this.f192c.remove(str)) != null) {
            this.f191b.remove(num);
        }
        this.f195f.remove(str);
        HashMap map = this.f196g;
        if (map.containsKey(str)) {
            Objects.toString(map.get(str));
            map.remove(str);
        }
        Bundle bundle = this.f197h;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap map2 = this.f193d;
        e eVar = (e) map2.get(str);
        if (eVar != null) {
            ArrayList arrayList = eVar.f189b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.f188a.b((o) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
