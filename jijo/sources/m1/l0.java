package m1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f0 f15532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f15533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f15536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f15537f;

    public static void b(e1 e1Var) {
        RecyclerView recyclerView;
        int i10 = e1Var.f15454j;
        if (e1Var.h() || (i10 & 4) != 0 || (recyclerView = e1Var.f15462r) == null) {
            return;
        }
        recyclerView.F(e1Var);
    }

    public abstract boolean a(e1 e1Var, e1 e1Var2, k0 k0Var, k0 k0Var2);

    public final void c(e1 e1Var) {
        f0 f0Var = this.f15532a;
        if (f0Var != null) {
            boolean z9 = true;
            e1Var.p(true);
            if (e1Var.f15452h != null && e1Var.f15453i == null) {
                e1Var.f15452h = null;
            }
            e1Var.f15453i = null;
            if ((e1Var.f15454j & 16) != 0) {
                return;
            }
            RecyclerView recyclerView = f0Var.f15468a;
            recyclerView.c0();
            d dVar = recyclerView.f1051h;
            f0 f0Var2 = dVar.f15430a;
            RecyclerView recyclerView2 = f0Var2.f15468a;
            View view = e1Var.f15445a;
            int iIndexOfChild = recyclerView2.indexOfChild(view);
            if (iIndexOfChild == -1) {
                dVar.k(view);
            } else {
                c cVar = dVar.f15431b;
                if (cVar.d(iIndexOfChild)) {
                    cVar.f(iIndexOfChild);
                    dVar.k(view);
                    f0Var2.h(iIndexOfChild);
                } else {
                    z9 = false;
                }
            }
            if (z9) {
                e1 e1VarI = RecyclerView.I(view);
                w0 w0Var = recyclerView.f1042b;
                w0Var.j(e1VarI);
                w0Var.g(e1VarI);
            }
            recyclerView.d0(!z9);
            if (z9 || !e1Var.l()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(e1 e1Var);

    public abstract void e();

    public abstract boolean f();
}
