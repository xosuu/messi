package q2;

/* JADX INFO: loaded from: classes.dex */
public final class b implements s2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f16390b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f16389a = i10;
        this.f16390b = cVar;
    }

    @Override // s2.a
    public final void a(long j10, long j11) {
        int i10 = this.f16389a;
        c cVar = this.f16390b;
        switch (i10) {
            case 0:
                long j12 = (j10 * 100) / j11;
                cVar.getClass();
                break;
            default:
                s2.a aVar = cVar.f16405n;
                if (aVar != null) {
                    aVar.a(j10, j11);
                }
                break;
        }
    }
}
