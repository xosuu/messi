package f;

import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z implements j.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j.a f12996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k0 f12997b;

    public z(k0 k0Var, j2.h hVar) {
        this.f12997b = k0Var;
        this.f12996a = hVar;
    }

    @Override // j.a
    public final boolean a(j.b bVar, MenuItem menuItem) {
        return this.f12996a.a(bVar, menuItem);
    }

    @Override // j.a
    public final boolean c(j.b bVar, k.o oVar) {
        return this.f12996a.c(bVar, oVar);
    }

    @Override // j.a
    public final void e(j.b bVar) {
        this.f12996a.e(bVar);
        k0 k0Var = this.f12997b;
        if (k0Var.I != null) {
            k0Var.f12913x.getDecorView().removeCallbacks(k0Var.J);
        }
        if (k0Var.H != null) {
            o0.d1 d1Var = k0Var.K;
            if (d1Var != null) {
                d1Var.b();
            }
            o0.d1 d1VarA = o0.v0.a(k0Var.H);
            d1VarA.a(0.0f);
            k0Var.K = d1VarA;
            d1VarA.d(new y(2, this));
        }
        r rVar = k0Var.f12915z;
        if (rVar != null) {
            rVar.c();
        }
        k0Var.G = null;
        ViewGroup viewGroup = k0Var.M;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        o0.h0.c(viewGroup);
        k0Var.M();
    }

    @Override // j.a
    public final boolean f(j.b bVar, k.o oVar) {
        ViewGroup viewGroup = this.f12997b.M;
        WeakHashMap weakHashMap = o0.v0.f16075a;
        o0.h0.c(viewGroup);
        return this.f12996a.f(bVar, oVar);
    }
}
