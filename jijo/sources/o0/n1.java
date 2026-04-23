package o0;

import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class n1 extends m1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public g0.c f16052m;

    public n1(t1 t1Var, WindowInsets windowInsets) {
        super(t1Var, windowInsets);
        this.f16052m = null;
    }

    @Override // o0.r1
    public t1 b() {
        return t1.h(this.f16047c.consumeStableInsets(), null);
    }

    @Override // o0.r1
    public t1 c() {
        return t1.h(this.f16047c.consumeSystemWindowInsets(), null);
    }

    @Override // o0.r1
    public final g0.c h() {
        if (this.f16052m == null) {
            WindowInsets windowInsets = this.f16047c;
            this.f16052m = g0.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f16052m;
    }

    @Override // o0.r1
    public boolean m() {
        return this.f16047c.isConsumed();
    }

    @Override // o0.r1
    public void q(g0.c cVar) {
        this.f16052m = cVar;
    }
}
