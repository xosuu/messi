package androidx.fragment.app;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class o implements o.a, k0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f843a;

    public /* synthetic */ o(s sVar) {
        this.f843a = sVar;
    }

    @Override // o.a
    public final Object apply() {
        s sVar = this.f843a;
        v vVar = sVar.F;
        return vVar instanceof androidx.activity.result.g ? vVar.B.f153u : sVar.S().f153u;
    }

    @Override // k0.a
    public final void b() {
        s sVar = this.f843a;
        q qVar = sVar.V;
        if ((qVar == null ? null : qVar.f861a) != null) {
            View view = qVar == null ? null : qVar.f861a;
            sVar.i().f861a = null;
            view.clearAnimation();
        }
        sVar.i().f862b = null;
    }
}
