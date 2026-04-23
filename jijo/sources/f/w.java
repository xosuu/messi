package f;

import android.view.View;
import android.view.Window;
import l.m1;
import o0.t1;

/* JADX INFO: loaded from: classes.dex */
public final class w implements o0.t, m1, k.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k0 f12981a;

    public /* synthetic */ w(k0 k0Var) {
        this.f12981a = k0Var;
    }

    @Override // k.c0
    public final void b(k.o oVar, boolean z9) {
        this.f12981a.t(oVar);
    }

    @Override // o0.t
    public final t1 h(View view, t1 t1Var) {
        int iD = t1Var.d();
        int iN = this.f12981a.N(t1Var, null);
        if (iD != iN) {
            t1Var = t1Var.f(t1Var.b(), iN, t1Var.c(), t1Var.a());
        }
        return o0.v0.l(view, t1Var);
    }

    @Override // k.c0
    public final boolean i(k.o oVar) {
        Window.Callback callback = this.f12981a.f12913x.getCallback();
        if (callback == null) {
            return true;
        }
        callback.onMenuOpened(108, oVar);
        return true;
    }
}
