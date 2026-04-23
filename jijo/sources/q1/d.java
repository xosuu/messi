package q1;

import android.os.Bundle;
import androidx.lifecycle.i;
import f.o;
import g4.a0;
import java.util.Set;
import n.g;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f16380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f16381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o f16382e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f16378a = new g();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f16383f = true;

    public final Bundle a(String str) {
        if (!this.f16381d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f16380c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = this.f16380c;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = this.f16380c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f16380c = null;
        }
        return bundle2;
    }

    public final void b(String str, c cVar) {
        Object obj;
        a0.f(cVar, "provider");
        g gVar = this.f16378a;
        n.c cVarB = gVar.b(str);
        if (cVarB != null) {
            obj = cVarB.f15808b;
        } else {
            n.c cVar2 = new n.c(str, cVar);
            gVar.f15819f++;
            n.c cVar3 = gVar.f15817b;
            if (cVar3 == null) {
                gVar.f15816a = cVar2;
                gVar.f15817b = cVar2;
            } else {
                cVar3.f15809d = cVar2;
                cVar2.f15810f = cVar3;
                gVar.f15817b = cVar2;
            }
            obj = null;
        }
        if (((c) obj) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void c() {
        if (!this.f16383f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        o oVar = this.f16382e;
        if (oVar == null) {
            oVar = new o(this);
        }
        this.f16382e = oVar;
        try {
            i.class.getDeclaredConstructor(new Class[0]);
            o oVar2 = this.f16382e;
            if (oVar2 != null) {
                ((Set) oVar2.f12947b).add(i.class.getName());
            }
        } catch (NoSuchMethodException e10) {
            throw new IllegalArgumentException("Class " + i.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
        }
    }
}
