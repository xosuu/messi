package k4;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class g implements j, d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f14673b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f14674d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f14675f;

    public /* synthetic */ g(Executor executor, a aVar, l lVar, int i10) {
        this.f14672a = i10;
        this.f14673b = executor;
        this.f14674d = aVar;
        this.f14675f = lVar;
    }

    @Override // k4.j
    public final void a(l lVar) {
        int i10 = this.f14672a;
        Executor executor = this.f14673b;
        switch (i10) {
            case 0:
                executor.execute(new l.j(this, 22, lVar));
                break;
            default:
                executor.execute(new l.j(this, 23, lVar));
                break;
        }
    }

    @Override // k4.c
    public final void b(Exception exc) {
        this.f14675f.e(exc);
    }
}
