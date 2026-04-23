package androidx.fragment.app;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k0 extends androidx.lifecycle.k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d5.e f809i = new d5.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f813f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f810c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f811d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f812e = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f814g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f815h = false;

    public k0(boolean z9) {
        this.f813f = z9;
    }

    @Override // androidx.lifecycle.k0
    public final void a() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f814g = true;
    }

    public final void b(s sVar) {
        if (this.f815h || this.f810c.remove(sVar.f892q) == null || !Log.isLoggable("FragmentManager", 2)) {
            return;
        }
        sVar.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k0.class != obj.getClass()) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return this.f810c.equals(k0Var.f810c) && this.f811d.equals(k0Var.f811d) && this.f812e.equals(k0Var.f812e);
    }

    public final int hashCode() {
        return this.f812e.hashCode() + ((this.f811d.hashCode() + (this.f810c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f810c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f811d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f812e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
