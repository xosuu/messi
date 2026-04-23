package v5;

/* JADX INFO: loaded from: classes.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f17813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f17814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17815c;

    @Override // v5.a
    public final void a(b bVar) {
        if (this.f17815c == 0) {
            d(bVar);
        }
    }

    @Override // v5.a
    public final void b() {
    }

    @Override // v5.a
    public final void c(b bVar) {
        if (this.f17815c == 1) {
            d(bVar);
        }
    }

    public final void d(b bVar) {
        d dVar;
        g gVar = this.f17813a;
        if (gVar.f17828t) {
            return;
        }
        f fVar = this.f17814b;
        int size = fVar.f17818d.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) fVar.f17818d.get(i10);
            if (dVar.f17812b == this.f17815c && dVar.f17811a.f17816a == bVar) {
                bVar.e(this);
                break;
            }
            i10++;
        }
        fVar.f17818d.remove(dVar);
        if (fVar.f17818d.size() == 0) {
            fVar.f17816a.f();
            gVar.f17822b.add(fVar.f17816a);
        }
    }
}
