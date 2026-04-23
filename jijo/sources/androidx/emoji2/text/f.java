package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
public final class f extends b4.f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f597c;

    public f(g gVar) {
        this.f597c = gVar;
    }

    @Override // b4.f
    public final void B(Throwable th) {
        ((l) this.f597c.f14587b).d(th);
    }

    @Override // b4.f
    public final void D(j2.h hVar) {
        g gVar = this.f597c;
        gVar.f599f = hVar;
        j2.h hVar2 = gVar.f599f;
        d5.e eVar = new d5.e();
        Object obj = gVar.f14587b;
        e eVar2 = ((l) obj).f612h;
        ((l) obj).getClass();
        gVar.f598d = new r(hVar2, eVar, eVar2);
        ((l) gVar.f14587b).e();
    }
}
