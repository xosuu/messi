package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o f991b;

    public final void a(q qVar, k kVar) {
        l lVarA = kVar.a();
        l lVar = this.f990a;
        if (lVarA.compareTo(lVar) < 0) {
            lVar = lVarA;
        }
        this.f990a = lVar;
        this.f991b.a(qVar, kVar);
        this.f990a = lVarA;
    }
}
