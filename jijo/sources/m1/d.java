package m1;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f15430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f15431b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f15432c = new ArrayList();

    public d(f0 f0Var) {
        this.f15430a = f0Var;
    }

    public final void a(int i10, View view, boolean z9) {
        f0 f0Var = this.f15430a;
        int childCount = i10 < 0 ? f0Var.f15468a.getChildCount() : f(i10);
        this.f15431b.e(childCount, z9);
        if (z9) {
            i(view);
        }
        f0Var.f15468a.addView(view, childCount);
        RecyclerView.I(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z9) {
        f0 f0Var = this.f15430a;
        int childCount = i10 < 0 ? f0Var.f15468a.getChildCount() : f(i10);
        this.f15431b.e(childCount, z9);
        if (z9) {
            i(view);
        }
        f0Var.getClass();
        e1 e1VarI = RecyclerView.I(view);
        RecyclerView recyclerView = f0Var.f15468a;
        if (e1VarI != null) {
            if (!e1VarI.l() && !e1VarI.q()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(e1VarI);
                throw new IllegalArgumentException(l.a0.e(recyclerView, sb));
            }
            e1VarI.f15454j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i10) {
        e1 e1VarI;
        int iF = f(i10);
        this.f15431b.f(iF);
        RecyclerView recyclerView = this.f15430a.f15468a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null && (e1VarI = RecyclerView.I(childAt)) != null) {
            if (e1VarI.l() && !e1VarI.q()) {
                StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                sb.append(e1VarI);
                throw new IllegalArgumentException(l.a0.e(recyclerView, sb));
            }
            e1VarI.b(NotificationCompat.FLAG_LOCAL_ONLY);
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i10) {
        return this.f15430a.f15468a.getChildAt(f(i10));
    }

    public final int e() {
        return this.f15430a.f15468a.getChildCount() - this.f15432c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f15430a.f15468a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            c cVar = this.f15431b;
            int iB = i10 - (i11 - cVar.b(i11));
            if (iB == 0) {
                while (cVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.f15430a.f15468a.getChildAt(i10);
    }

    public final int h() {
        return this.f15430a.f15468a.getChildCount();
    }

    public final void i(View view) {
        this.f15432c.add(view);
        f0 f0Var = this.f15430a;
        f0Var.getClass();
        e1 e1VarI = RecyclerView.I(view);
        if (e1VarI != null) {
            int i10 = e1VarI.f15461q;
            View view2 = e1VarI.f15445a;
            if (i10 != -1) {
                e1VarI.f15460p = i10;
            } else {
                WeakHashMap weakHashMap = o0.v0.f16075a;
                e1VarI.f15460p = o0.d0.c(view2);
            }
            RecyclerView recyclerView = f0Var.f15468a;
            if (recyclerView.L()) {
                e1VarI.f15461q = 4;
                recyclerView.B0.add(e1VarI);
            } else {
                WeakHashMap weakHashMap2 = o0.v0.f16075a;
                o0.d0.s(view2, 4);
            }
        }
    }

    public final boolean j(View view) {
        return this.f15432c.contains(view);
    }

    public final void k(View view) {
        if (this.f15432c.remove(view)) {
            f0 f0Var = this.f15430a;
            f0Var.getClass();
            e1 e1VarI = RecyclerView.I(view);
            if (e1VarI != null) {
                int i10 = e1VarI.f15460p;
                RecyclerView recyclerView = f0Var.f15468a;
                if (recyclerView.L()) {
                    e1VarI.f15461q = i10;
                    recyclerView.B0.add(e1VarI);
                } else {
                    WeakHashMap weakHashMap = o0.v0.f16075a;
                    o0.d0.s(e1VarI.f15445a, i10);
                }
                e1VarI.f15460p = 0;
            }
        }
    }

    public final String toString() {
        return this.f15431b.toString() + ", hidden list:" + this.f15432c.size();
    }
}
