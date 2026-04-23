package androidx.activity;

import androidx.fragment.app.e0;
import androidx.lifecycle.f0;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.o, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f137d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(p pVar, f0 f0Var, e0 e0Var) {
        this.f137d = pVar;
        this.f134a = f0Var;
        this.f135b = e0Var;
        f0Var.a(this);
    }

    @Override // androidx.lifecycle.o
    public final void a(androidx.lifecycle.q qVar, androidx.lifecycle.k kVar) {
        if (kVar != androidx.lifecycle.k.ON_START) {
            if (kVar != androidx.lifecycle.k.ON_STOP) {
                if (kVar == androidx.lifecycle.k.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                o oVar = this.f136c;
                if (oVar != null) {
                    oVar.cancel();
                    return;
                }
                return;
            }
        }
        p pVar = this.f137d;
        ArrayDeque arrayDeque = pVar.f167b;
        e0 e0Var = this.f135b;
        arrayDeque.add(e0Var);
        o oVar2 = new o(pVar, e0Var);
        e0Var.f765b.add(oVar2);
        if (p7.q.m()) {
            pVar.c();
            e0Var.f766c = pVar.f168c;
        }
        this.f136c = oVar2;
    }

    @Override // androidx.activity.a
    public final void cancel() {
        this.f134a.b(this);
        this.f135b.f765b.remove(this);
        o oVar = this.f136c;
        if (oVar != null) {
            oVar.cancel();
            this.f136c = null;
        }
    }
}
