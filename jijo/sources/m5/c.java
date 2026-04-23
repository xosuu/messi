package m5;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f15755f;

    public c(e eVar, int i10) {
        super(eVar.size(), i10);
        this.f15755f = eVar;
    }

    @Override // m5.a
    public final Object c(int i10) {
        return this.f15755f.get(i10);
    }
}
