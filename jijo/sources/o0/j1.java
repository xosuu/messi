package o0;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class j1 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f16041a;

    public j1() {
        this.f16041a = h5.x.f();
    }

    @Override // o0.l1
    public t1 b() {
        a();
        t1 t1VarH = t1.h(this.f16041a.build(), null);
        t1VarH.f16068a.o(null);
        return t1VarH;
    }

    @Override // o0.l1
    public void c(g0.c cVar) {
        this.f16041a.setStableInsets(cVar.c());
    }

    @Override // o0.l1
    public void d(g0.c cVar) {
        this.f16041a.setSystemWindowInsets(cVar.c());
    }

    public j1(t1 t1Var) {
        WindowInsets.Builder builderF;
        super(t1Var);
        WindowInsets windowInsetsG = t1Var.g();
        if (windowInsetsG != null) {
            builderF = h5.x.g(windowInsetsG);
        } else {
            builderF = h5.x.f();
        }
        this.f16041a = builderF;
    }
}
