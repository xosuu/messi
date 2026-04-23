package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import xyz.easypro.httpcustom.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f747b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f748c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f749d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f750e = false;

    public c1(ViewGroup viewGroup) {
        this.f746a = viewGroup;
    }

    public static c1 f(ViewGroup viewGroup, d0 d0Var) {
        Object tag = viewGroup.getTag(R.id.u1);
        if (tag instanceof c1) {
            return (c1) tag;
        }
        d0Var.getClass();
        h hVar = new h(viewGroup);
        viewGroup.setTag(R.id.u1, hVar);
        return hVar;
    }

    public final void a(int i10, int i11, m0 m0Var) {
        synchronized (this.f747b) {
            try {
                k0.b bVar = new k0.b();
                b1 b1VarD = d(m0Var.f836c);
                if (b1VarD != null) {
                    b1VarD.c(i10, i11);
                    return;
                }
                b1 b1Var = new b1(i10, i11, m0Var, bVar);
                this.f747b.add(b1Var);
                b1Var.f735d.add(new a1(this, b1Var, 0));
                b1Var.f735d.add(new a1(this, b1Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(ArrayList arrayList, boolean z9);

    public final void c() {
        if (this.f750e) {
            return;
        }
        ViewGroup viewGroup = this.f746a;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        if (!o0.g0.b(viewGroup)) {
            e();
            this.f749d = false;
            return;
        }
        synchronized (this.f747b) {
            try {
                if (!this.f747b.isEmpty()) {
                    ArrayList<b1> arrayList = new ArrayList(this.f748c);
                    this.f748c.clear();
                    for (b1 b1Var : arrayList) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(b1Var);
                        }
                        b1Var.a();
                        if (!b1Var.f738g) {
                            this.f748c.add(b1Var);
                        }
                    }
                    h();
                    ArrayList arrayList2 = new ArrayList(this.f747b);
                    this.f747b.clear();
                    this.f748c.addAll(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((b1) it.next()).d();
                    }
                    b(arrayList2, this.f749d);
                    this.f749d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b1 d(s sVar) {
        for (b1 b1Var : this.f747b) {
            if (b1Var.f734c.equals(sVar) && !b1Var.f737f) {
                return b1Var;
            }
        }
        return null;
    }

    public final void e() {
        ViewGroup viewGroup = this.f746a;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        boolean zB = o0.g0.b(viewGroup);
        synchronized (this.f747b) {
            try {
                h();
                Iterator it = this.f747b.iterator();
                while (it.hasNext()) {
                    ((b1) it.next()).d();
                }
                for (b1 b1Var : new ArrayList(this.f748c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zB) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f746a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(b1Var);
                    }
                    b1Var.a();
                }
                for (b1 b1Var2 : new ArrayList(this.f747b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zB) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f746a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(b1Var2);
                    }
                    b1Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        synchronized (this.f747b) {
            try {
                h();
                this.f750e = false;
                int size = this.f747b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    b1 b1Var = (b1) this.f747b.get(size);
                    int iC = g1.a.c(b1Var.f734c.S);
                    if (b1Var.f732a == 2 && iC != 2) {
                        b1Var.f734c.getClass();
                        this.f750e = false;
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h() {
        for (b1 b1Var : this.f747b) {
            if (b1Var.f733b == 2) {
                b1Var.c(g1.a.b(b1Var.f734c.U().getVisibility()), 1);
            }
        }
    }
}
