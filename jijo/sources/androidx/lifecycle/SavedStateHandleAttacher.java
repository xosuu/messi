package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f941a;

    public SavedStateHandleAttacher(h0 h0Var) {
        this.f941a = h0Var;
    }

    @Override // androidx.lifecycle.o
    public final void a(q qVar, k kVar) {
        if (kVar != k.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + kVar).toString());
        }
        qVar.h().b(this);
        h0 h0Var = this.f941a;
        if (h0Var.f968b) {
            return;
        }
        h0Var.f969c = h0Var.f967a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        h0Var.f968b = true;
    }
}
