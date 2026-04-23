package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f938b;

    public FullLifecycleObserverAdapter(d dVar, o oVar) {
        this.f937a = dVar;
        this.f938b = oVar;
    }

    @Override // androidx.lifecycle.o
    public final void a(q qVar, k kVar) {
        int i10 = f.f962a[kVar.ordinal()];
        d dVar = this.f937a;
        switch (i10) {
            case 1:
                dVar.getClass();
                break;
            case 2:
                dVar.getClass();
                break;
            case 3:
                dVar.onResume();
                break;
            case 4:
                dVar.getClass();
                break;
            case 5:
                dVar.getClass();
                break;
            case 6:
                dVar.getClass();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        o oVar = this.f938b;
        if (oVar != null) {
            oVar.a(qVar, kVar);
        }
    }
}
