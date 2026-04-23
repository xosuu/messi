package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f840a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f841b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k0 f842c;

    public final void a(s sVar) {
        if (this.f840a.contains(sVar)) {
            throw new IllegalStateException("Fragment already added: " + sVar);
        }
        synchronized (this.f840a) {
            this.f840a.add(sVar);
        }
        sVar.f898x = true;
    }

    public final s b(String str) {
        m0 m0Var = (m0) this.f841b.get(str);
        if (m0Var != null) {
            return m0Var.f836c;
        }
        return null;
    }

    public final s c(String str) {
        for (m0 m0Var : this.f841b.values()) {
            if (m0Var != null) {
                s sVarC = m0Var.f836c;
                if (!str.equals(sVarC.f892q)) {
                    sVarC = sVarC.G.f784c.c(str);
                }
                if (sVarC != null) {
                    return sVarC;
                }
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f841b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (m0 m0Var : this.f841b.values()) {
            if (m0Var != null) {
                arrayList.add(m0Var.f836c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f840a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f840a) {
            arrayList = new ArrayList(this.f840a);
        }
        return arrayList;
    }

    public final void g(m0 m0Var) {
        s sVar = m0Var.f836c;
        String str = sVar.f892q;
        HashMap map = this.f841b;
        if (map.get(str) != null) {
            return;
        }
        map.put(sVar.f892q, m0Var);
        if (Log.isLoggable("FragmentManager", 2)) {
            sVar.toString();
        }
    }

    public final void h(m0 m0Var) {
        s sVar = m0Var.f836c;
        if (sVar.N) {
            this.f842c.b(sVar);
        }
        if (((m0) this.f841b.put(sVar.f892q, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            sVar.toString();
        }
    }
}
