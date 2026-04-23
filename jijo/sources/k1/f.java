package k1;

/* JADX INFO: loaded from: classes.dex */
public final class f extends p6.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public g f14644f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f14645h;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g f14646q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f14647s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, n6.e eVar) {
        super(eVar);
        this.f14646q = gVar;
    }

    @Override // p6.a
    public final Object g(Object obj) {
        this.f14645h = obj;
        this.f14647s |= Integer.MIN_VALUE;
        return g.Y(this.f14646q, null, this);
    }
}
