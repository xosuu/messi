package m1;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.ads.iq1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Cloneable f15644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Cloneable f15645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Cloneable f15646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f15647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f15648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f15649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f15650i;

    public w0(int i10, int i11) {
        this.f15642a = i10;
        this.f15643b = i11;
        this.f15644c = new SparseArray();
        this.f15645d = new SparseArray();
        this.f15646e = new SparseArray();
        this.f15647f = new SparseArray();
        this.f15648g = new SparseArray();
    }

    public final void a(e1 e1Var, boolean z9) {
        RecyclerView.j(e1Var);
        g1 g1Var = ((RecyclerView) this.f15650i).f1071v0;
        if (g1Var != null) {
            f1 f1Var = g1Var.f15480e;
            boolean z10 = f1Var instanceof f1;
            View view = e1Var.f15445a;
            o0.v0.q(view, z10 ? (o0.c) f1Var.f15470e.remove(view) : null);
        }
        if (z9) {
            ((RecyclerView) this.f15650i).getClass();
            g0 g0Var = ((RecyclerView) this.f15650i).f1072w;
            if (g0Var != null) {
                g0Var.g(e1Var);
            }
            RecyclerView recyclerView = (RecyclerView) this.f15650i;
            if (recyclerView.f1059o0 != null) {
                recyclerView.f1061q.m(e1Var);
            }
        }
        e1Var.f15462r = null;
        v0 v0VarC = c();
        v0VarC.getClass();
        int i10 = e1Var.f15450f;
        ArrayList arrayList = v0VarC.a(i10).f15626a;
        if (((u0) v0VarC.f15636a.get(i10)).f15627b <= arrayList.size()) {
            return;
        }
        e1Var.o();
        arrayList.add(e1Var);
    }

    public final int b(int i10) {
        if (i10 >= 0 && i10 < ((RecyclerView) this.f15650i).f1059o0.b()) {
            Object obj = this.f15650i;
            return !((RecyclerView) obj).f1059o0.f15416g ? i10 : ((RecyclerView) obj).f1048f.f(i10, 0);
        }
        StringBuilder sb = new StringBuilder("invalid position ");
        sb.append(i10);
        sb.append(". State item count is ");
        sb.append(((RecyclerView) this.f15650i).f1059o0.b());
        throw new IndexOutOfBoundsException(l.a0.e((RecyclerView) this.f15650i, sb));
    }

    public final v0 c() {
        if (((v0) this.f15648g) == null) {
            v0 v0Var = new v0();
            v0Var.f15636a = new SparseArray();
            v0Var.f15637b = 0;
            this.f15648g = v0Var;
        }
        return (v0) this.f15648g;
    }

    public final void d() {
        ArrayList arrayList = (ArrayList) this.f15646e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            e(size);
        }
        arrayList.clear();
        if (RecyclerView.G0) {
            iq1 iq1Var = ((RecyclerView) this.f15650i).f1058n0;
            int[] iArr = (int[]) iq1Var.f5677c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            iq1Var.f5678d = 0;
        }
    }

    public final void e(int i10) {
        Cloneable cloneable = this.f15646e;
        a((e1) ((ArrayList) cloneable).get(i10), true);
        ((ArrayList) cloneable).remove(i10);
    }

    public final void f(View view) {
        e1 e1VarI = RecyclerView.I(view);
        if (e1VarI.l()) {
            ((RecyclerView) this.f15650i).removeDetachedView(view, false);
        }
        if (e1VarI.k()) {
            e1VarI.f15458n.j(e1VarI);
        } else if (e1VarI.r()) {
            e1VarI.f15454j &= -33;
        }
        g(e1VarI);
        if (((RecyclerView) this.f15650i).T == null || e1VarI.i()) {
            return;
        }
        ((RecyclerView) this.f15650i).T.d(e1VarI);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(m1.e1 r8) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.w0.g(m1.e1):void");
    }

    public final void h(View view) {
        l0 l0Var;
        e1 e1VarI = RecyclerView.I(view);
        if (!e1VarI.e(12) && e1VarI.m() && (l0Var = ((RecyclerView) this.f15650i).T) != null) {
            k kVar = (k) l0Var;
            if (e1VarI.d().isEmpty() && kVar.f15508g && !e1VarI.h()) {
                if (((ArrayList) this.f15645d) == null) {
                    this.f15645d = new ArrayList();
                }
                e1VarI.f15458n = this;
                e1VarI.f15459o = true;
                ((ArrayList) this.f15645d).add(e1VarI);
                return;
            }
        }
        if (e1VarI.h() && !e1VarI.j() && !((RecyclerView) this.f15650i).f1072w.f15478b) {
            throw new IllegalArgumentException(l.a0.e((RecyclerView) this.f15650i, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        e1VarI.f15458n = this;
        e1VarI.f15459o = false;
        ((ArrayList) this.f15644c).add(e1VarI);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x040f A[PHI: r2 r8
      0x040f: PHI (r2v12 boolean) = (r2v11 boolean), (r2v15 boolean) binds: [B:130:0x0273, B:184:0x037e] A[DONT_GENERATE, DONT_INLINE]
      0x040f: PHI (r8v3 m1.e1) = (r8v2 m1.e1), (r8v6 m1.e1) binds: [B:130:0x0273, B:184:0x037e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final m1.e1 i(int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 1561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.w0.i(int, long):m1.e1");
    }

    public final void j(e1 e1Var) {
        if (e1Var.f15459o) {
            ((ArrayList) this.f15645d).remove(e1Var);
        } else {
            ((ArrayList) this.f15644c).remove(e1Var);
        }
        e1Var.f15458n = null;
        e1Var.f15459o = false;
        e1Var.f15454j &= -33;
    }

    public final void k() {
        Object obj = this.f15650i;
        this.f15643b = this.f15642a + (((RecyclerView) obj).f1074x != null ? ((RecyclerView) obj).f1074x.f15594j : 0);
        Cloneable cloneable = this.f15646e;
        for (int size = ((ArrayList) cloneable).size() - 1; size >= 0 && ((ArrayList) cloneable).size() > this.f15643b; size--) {
            e(size);
        }
    }

    public w0(RecyclerView recyclerView) {
        this.f15650i = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f15644c = arrayList;
        this.f15645d = null;
        this.f15646e = new ArrayList();
        this.f15647f = Collections.unmodifiableList(arrayList);
        this.f15642a = 2;
        this.f15643b = 2;
    }
}
