package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f942a;

    @Override // androidx.lifecycle.o
    public final void a(q qVar, k kVar) {
        if (kVar == k.ON_DESTROY) {
            this.f942a = false;
            qVar.h().b(this);
        }
    }
}
