package x;

/* JADX INFO: loaded from: classes.dex */
public class g extends f {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18244m;

    public g(p pVar) {
        super(pVar);
        if (pVar instanceof k) {
            this.f18236e = 2;
        } else {
            this.f18236e = 3;
        }
    }

    @Override // x.f
    public final void d(int i10) {
        if (this.f18241j) {
            return;
        }
        this.f18241j = true;
        this.f18238g = i10;
        for (d dVar : this.f18242k) {
            dVar.a(dVar);
        }
    }
}
