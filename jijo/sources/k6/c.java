package k6;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f14696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f14697c;

    public final d a(f fVar) {
        d dVar = new d();
        dVar.f14698a = fVar;
        dVar.f14701d = this;
        int i10 = this.f14695a;
        this.f14695a = i10 + 1;
        if (i10 == 0) {
            this.f14697c = dVar;
            this.f14696b = dVar;
        } else {
            d dVar2 = this.f14697c;
            dVar2.f14699b = dVar;
            dVar.f14700c = dVar2;
            this.f14697c = dVar;
        }
        return dVar;
    }
}
